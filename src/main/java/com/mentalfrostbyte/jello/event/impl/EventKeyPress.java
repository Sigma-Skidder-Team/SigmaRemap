package com.mentalfrostbyte.jello.event.impl;

import com.mentalfrostbyte.jello.event.CancellableEvent;
import net.minecraft.util.math.BlockPos;

public class EventKeyPress extends CancellableEvent {
    private final int key;
    private final boolean pressed;
    private final BlockPos field21572;

    public EventKeyPress(int var1, boolean var2, BlockPos var3) {
        this.key = var1;
        this.pressed = var2;
        this.field21572 = var3;
    }

    public int getKey() {
        return this.key;
    }

    public boolean isPressed() {
        return this.pressed;
    }

    public BlockPos getBlockPos() {
        return this.field21572;
    }
}
