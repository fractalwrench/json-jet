package com.fractalwrench.jsonjet;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class JsonWriterTest {

    @Test
    public void testCtor() {
        assertNotNull(new JsonWriter());
    }
}
