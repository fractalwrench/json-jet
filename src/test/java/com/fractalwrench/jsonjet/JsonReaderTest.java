package com.fractalwrench.jsonjet;

import org.junit.Test;

import java.io.ByteArrayOutputStream;

import static org.junit.Assert.assertNotNull;

public class JsonReaderTest {

    @Test
    public void testCtor() {
        assertNotNull(new JsonReader());
    }
}
