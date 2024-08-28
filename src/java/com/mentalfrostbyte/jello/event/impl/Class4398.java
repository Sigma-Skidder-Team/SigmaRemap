package com.mentalfrostbyte.jello.event.impl;

import com.mentalfrostbyte.jello.event.CancellableEvent;
import mapped.BlockPos;
import mapped.Class6408;
import mapped.Class8022;

public class Class4398 extends CancellableEvent {
    public static boolean field21487 = false;
    private static String[] field21484;
    private BlockPos field21485;
    private Class6408 field21486;

    public Class4398(BlockPos var1, Class6408 var2) {
        this.field21485 = var1;
        this.field21486 = var2;
    }

    public BlockPos method13902() {
        return this.field21485;
    }

    public Class6408 method13903() {
        return this.field21486;
    }

    public void method13904(BlockPos var1) {
        this.field21485 = var1;
    }

    public void method13905(Class6408 var1) {
        if (var1 == null) {
            var1 = Class8022.method27427(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
        }

        this.field21486 = var1;
    }
}
