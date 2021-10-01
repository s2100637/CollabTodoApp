package com.collab.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TodoTest {
    private Todo todo;

    @BeforeEach
    public void setUp() {
        this.todo = new Todo(1, "Otsikko", "sisältää juu", false);
    }

    @Test
    void testHeading() {
        assertEquals("Otsikko", todo.getHeading());
    }

    @Test
    void testGetContent() {
        assertNotEquals("sisältää ", todo.getContent());
        assertEquals("sisältää juu", todo.getContent());

    }

    @Test
    void testGetId() {

    }

    @Test
    void testIsDone() {

    }

    @Test
    void testSetContent() {

    }

    @Test
    void testSetDone() {

    }

    @Test
    void testToggleDone() {

    }
}
