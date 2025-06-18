# LearningADK

Repo with examples for learning by example about [Google's Agent Development Kit](https://google.github.io/adk-docs/) (ADK).

## Usages

Obviously replacing _AI..._ with the secret obtained e.g. as described on https://docs.enola.dev/specs/aiuri/#google-ai:

### Quickstart

This is the https://google.github.io/adk-docs/get-started/quickstart/#java.

#### Dev Web UI

    cd quickstart; GOOGLE_API_KEY=AI... ./run-web.sh

Now open <http://localhost:8080>...

#### Quickstart CLI

    cd quickstart; GOOGLE_API_KEY=AI... ./run-cli.sh

Now type a prompt on the console...

### Simplest

This is most simplified version, without agents, just a prompt from a CLI argument

    cd simplest; GOOGLE_API_KEY=AI... ./run.sh Who are you?

### JitPack

This a variant of `simplest` which, instead of using a released ADK version from Maven Central,
uses https://jitpack.io to fetch an unrelated revision (check out [its `pom.xml`](simplest/pom.xml) for how):

    cd simplest; GOOGLE_API_KEY=AI... ./run.sh Who are you?

### Ollama, via LangChain4j

This is a preview of ADK's potential LangChain4j support, see
[this blog post](https://github.com/vorburger/vorburger.ch-Notes/blob/develop/ml/adk-ollama.md):

    ollama pull gemma3:4b
    cd LangChain4j; ./run-cli.sh "hi, who are you and what can you do?"

## Related

* https://github.com/enola-dev/enola/tree/main/java/dev/enola/ai/adk related utilities
* https://github.com/glaforge/adk-java-maven-template
* https://github.com/glaforge/gemini-workshop-for-java-developers
