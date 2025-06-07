#!/usr/bin/env bash

# shellcheck disable=SC2124
ARGS="$@"

../mvnw compile exec:java \
    -Dexec.mainClass="dev.enola.adk.learn.OllamaWithoutTools" \
    -Dexec.args="$ARGS"
