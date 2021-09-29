package com.collab.domain;

public class Todo {
    private int id;
    private String content;
    private boolean done;
    //date when created
    //start date
    //expiration date

    /**
     * Constructors.
     * @param id primary key
     * @param content actual content for todo
     * @param done is todo done @return true/false
     */ 
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
    /** 
     * Toggles the value of done, true if false, false if true etc.
     * No parameters
    */
    public void toggleDone() {
        this.done = done ? false : true;
    }

}
