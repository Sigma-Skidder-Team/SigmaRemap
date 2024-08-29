package com.mentalfrostbyte.jello.event.impl;

import com.mentalfrostbyte.jello.event.CancellableEvent;
import net.minecraft.util.math.BlockPos;

public class Class4430 extends CancellableEvent {
    private static String[] field21569;
    private final int field21570;
    private final boolean field21571;
    private final BlockPos field21572;

    public Class4430(int var1, boolean var2, BlockPos var3) {
        this.field21570 = var1;
        this.field21571 = var2;
        this.field21572 = var3;
    }

    public int method13977() {
        return this.field21570;
    }

    public boolean method13978() {
        return this.field21571;
    }

    public BlockPos method13979() {
        return this.field21572;
    }
}
