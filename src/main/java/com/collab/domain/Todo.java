package com.collab.domain;

public class Todo {
    private int id;
    private String content;
    private boolean done;

    public Todo(int id, String content, boolean done) {
        this.id = id;
        this.content = content;
        this.done = done;
    }

    public int getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = true;
    }

    /* Need for a toggle? */
    public void toggleDone() {
        this.done = done ? false : true;
    }

}
