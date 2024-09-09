package com.mentalfrostbyte.jello.event.impl;

import com.mentalfrostbyte.jello.event.CancellableEvent;
import net.minecraft.util.math.BlockPos;

public class EventKeyPress extends CancellableEvent {
    private static String[] field21569;
    private final int field21570;
    private final boolean field21571;
    private final BlockPos field21572;

    public EventKeyPress(int var1, boolean var2, BlockPos var3) {
        this.field21570 = var1;
        this.field21571 = var2;
        this.field21572 = var3;
    }

    public int getKey() {
        return this.field21570;
    }

    public boolean isPressed() {
        return this.field21571;
    }

    public BlockPos getBlockPos() {
        return this.field21572;
    }
}
