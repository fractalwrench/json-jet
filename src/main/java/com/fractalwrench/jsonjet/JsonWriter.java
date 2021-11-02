package com.fractalwrench.jsonjet;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.OutputStream;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;

// http://www.ietf.org/rfc/rfc7159.txt
public final class JsonWriter implements Closeable, Flushable {

    private final OutputStream stream;
    private boolean serializeNullValues; // TODO make getters/setters
    private String indent;

    public JsonWriter(OutputStream stream) {
        this.stream = stream;
        // TODO consider whether to use OutputStream rather than Writer so that we can cache UTF-8 encoding
    }

    public JsonWriter beginObject() {
        // TODO
        return this;
    }


    public JsonWriter endObject() {
        // TODO
        return this;
    }

    public JsonWriter beginArray() {
        // TODO
        return this;
    }

    public JsonWriter endArray() {
        // TODO
        return this;
    }

    public JsonWriter name(String name) {
        // TODO
        return this;
    }


    // TODO create separate overloads for null | string | boolean | number (double/long) | unboxing syntax for objects

    public JsonWriter value(Object value) {
        // TODO
        return this;
    }




    @Override
    public void close() throws IOException {
        // TODO
    }

    @Override
    public void flush() throws IOException {
        // TODO
    }
}
