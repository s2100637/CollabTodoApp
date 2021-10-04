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
     * Constructors for getting tododao.
     * 
     * @param id      primary key
     * @param heading heading gor todo
     * @param content actual content for todo
     * @param done    is todo done @return true/false
     */

     /**
      * Constructor for reading tododao 
       */ 
    public Todo(int id, String heading, String content, String done) {
        this.id = id;
        this.heading = heading;
        this.content = content;
        this.done = convertStrToBool(done);
    }
    /**
     * Construtor when creating new tododao
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
     * Toggles the value of done, true to false, false to true. No parameters
     */
    public void toggleDone() {
        this.done = done ? false : true;
    }
    /**
     * Converts current boolean done value to String value, for sqlite database 
     */
    public String convertDone() {
        return String.valueOf(done);
    }
    /**
    * Converts given string value to bool if applicable
     */
    public boolean convertStrToBool(String n) {
        return Boolean.valueOf(n);
    }
    /* Do we really need this? */
    @Override
    public String toString() {
        return "id: "+id+"\nHeading: "+heading+"\nDone? "+done;
    }

}
