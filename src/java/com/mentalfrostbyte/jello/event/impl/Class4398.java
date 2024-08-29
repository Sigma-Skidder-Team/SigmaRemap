package com.mentalfrostbyte.jello.event.impl;

import com.mentalfrostbyte.jello.event.CancellableEvent;
import net.minecraft.util.math.BlockPos;
import mapped.VoxelShape;
import mapped.VoxelShapes;

public class Class4398 extends CancellableEvent {
    public static boolean field21487 = false;
    private static String[] field21484;
    private BlockPos field21485;
    private VoxelShape field21486;

    public Class4398(BlockPos var1, VoxelShape var2) {
        this.field21485 = var1;
        this.field21486 = var2;
    }

    public BlockPos method13902() {
        return this.field21485;
    }

    public VoxelShape method13903() {
        return this.field21486;
    }

    public void method13904(BlockPos var1) {
        this.field21485 = var1;
    }

    public void method13905(VoxelShape var1) {
        if (var1 == null) {
            var1 = VoxelShapes.create(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
        }

        this.field21486 = var1;
    }
}
