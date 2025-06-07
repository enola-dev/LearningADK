package dev.enola.adk.learn;

import com.google.adk.agents.BaseAgent;
import com.google.adk.agents.LlmAgent;
import com.google.adk.events.Event;
import com.google.adk.models.langchain4j.LangChain4j;
import com.google.adk.runner.InMemoryRunner;
import com.google.adk.sessions.Session;
import com.google.genai.types.Content;
import com.google.genai.types.Part;

import dev.langchain4j.model.ollama.OllamaChatModel;
import io.reactivex.rxjava3.core.Flowable;

public class OllamaWithoutTools {

    private static String USER_ID = "student";
    private static String NAME = "multi_tool_agent";

    public static final BaseAgent ROOT_AGENT = initAgent();

    public static BaseAgent initAgent() {
        var ollama = OllamaChatModel.builder()
                .logRequests(true)
                .logResponses(true)
                .baseUrl("http://localhost:11434")
                .modelName("gemma3:4b")
                .build();
        return LlmAgent.builder()
                .name(NAME)
                .model(new LangChain4j(ollama, "Ollama")) // .model("gemini-2.0-flash")
                .description("Ollama")
                .build();
    }

    public static void main(String[] args) throws Exception {
        var prompt = String.join(" ", args);

        InMemoryRunner runner = new InMemoryRunner(ROOT_AGENT);
        Session session = runner
                .sessionService()
                .createSession(NAME, USER_ID)
                .blockingGet();

        Content userMsg = Content.fromParts(Part.fromText(prompt));
        Flowable<Event> events = runner.runAsync(USER_ID, session.id(), userMsg);
        events.blockingForEach(event -> System.out.println(event.stringifyContent()));
    }
}
