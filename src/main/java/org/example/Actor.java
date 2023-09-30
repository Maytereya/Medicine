package org.example;

public abstract class Actor implements ActorBehaviour {
    protected String name;
    protected Boolean isMakeOrder;
    protected Boolean isTakeOrder;

    public Actor(String name) {
        this.name = name;
    }

    abstract String getName();
}
