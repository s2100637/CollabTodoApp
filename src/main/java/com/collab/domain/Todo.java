package com.collab.domain;

public class Todo {
    private int id;
    private String heading;
    private String content;
    private boolean done;
    // date when created
    // start date
    // expiration date

    /**
     * Constructors for getting dao.
     * 
     * @param id      primary key
     * @param heading heading gor todo
     * @param content actual content for todo
     * @param done    is todo done @return true/false
     */
    public Todo(int id, String heading, String content, boolean done) {
        this.id = id;
        this.heading = heading;
        this.content = content;
        this.done = done;
    }
    /**
     * Construtor when creating new dao
     *  */
    public Todo(String heading, String content) {
        this.id = -1;
        this.heading = heading;
        this.content = content;
        this.done = false;
    }

    public int getId() {
        return id;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
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

    /**
     * Toggles the value of done, true if false, false if true etc. No parameters
     */
    public void toggleDone() {
        this.done = done ? false : true;
    }

}
