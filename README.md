# LearningADK

Repo with examples for learning by example about [Google's Agent Development Kit](https://google.github.io/adk-docs/) (ADK).

## Usages

Obviously replacing _AI..._ with the secret obtained e.g. as described on https://docs.enola.dev/specs/aiuri/#google-ai:

### Quickstart

#### Dev Web UI

    cd quickstart; GOOGLE_API_KEY=AI... ./run-web.sh

Now open <http://localhost:8080>...

#### Quickstart CLI

    cd quickstart; GOOGLE_API_KEY=AI... ./run-cli.sh

Now type a prompt on the console...

### Simplest

    cd simplest; GOOGLE_API_KEY=AI... ./run.sh Who are you?

## Related

* https://github.com/enola-dev/enola/tree/main/java/dev/enola/ai/adk related utilities
* https://github.com/glaforge/adk-java-maven-template
* https://github.com/glaforge/gemini-workshop-for-java-developers
