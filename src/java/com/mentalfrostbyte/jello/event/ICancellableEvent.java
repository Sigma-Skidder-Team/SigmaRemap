package com.mentalfrostbyte.jello.event;

public interface ICancellableEvent {
    boolean setCancelled(boolean var1);

    boolean isCancelled();
}
