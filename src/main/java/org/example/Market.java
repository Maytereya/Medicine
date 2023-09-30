package org.example;

import java.util.ArrayList;
import java.util.List;

public class Market implements QueueBehaviour, MarketBehaviour {

    private final List<Actor> marketQueue;

    public Market() {
        this.marketQueue = new ArrayList<>();
    }

    //
    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println("Покупатель " + actor.getName() + " вошел в магазин");
        takeInQueue(actor);
    }

    //
    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println(actor.getName() + " вышел из магазина");
            marketQueue.remove(actor);
        }
    }

    //
    @Override
    public void takeInQueue(Actor actor) {
        this.marketQueue.add(actor);
        actor.isMakeOrder = true;
        System.out.println("Покупатель " + actor.getName() + " встал в очередь");
    }

    //
    @Override
    public void takeOrders() {
        for (Actor actor : marketQueue) {
            if (!actor.isMakeOrder()) {
                actor.setMakeOrder(true);
               // actor.isTakeOrder = false;
                System.out.println(actor.getName() + " сделал заказ");
            }
        }
    }

    //
    @Override
    public void giveOrders() {
        for (Actor actor : marketQueue) {
            if (actor.isMakeOrder()) {
                actor.setTakeOrder(true);
                System.out.println("Заказ выдан покупателю " + actor.getName());
            }
        }
    }
        //
        @Override
        public void releaseFromQueue () {
            ArrayList<Actor> releasedActors = new ArrayList<>();
            for(Actor actor: marketQueue){
                if(actor.isTakeOrder()){
                    releasedActors.add(actor);
                    System.out.println(actor.getName() + " вышел из очереди и готов уходить");
                }
            }
            releaseFromMarket(releasedActors);
            //System.out.println("Покупатель покинул очередь и готов выходить из магазина");
        }

        @Override
        public void update () {
            takeOrders();
            giveOrders();
            releaseFromQueue();
        }

    }
