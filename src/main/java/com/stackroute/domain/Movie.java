package com.stackroute.domain;

public class Movie {
    public Movie(){

    }
    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                '}';
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    private Actor actor;
    public Movie(Actor actor){
        this.actor=actor;
    }
}
