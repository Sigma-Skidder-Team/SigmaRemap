package com.mentalfrostbyte.jello.event.impl;

import com.mentalfrostbyte.jello.event.CancellableEvent;
import net.minecraft.block.AbstractBlock;

public class EventRenderBlocks extends CancellableEvent {
    private final AbstractBlock.AbstractBlockState field21559;
    private boolean field21560 = false;

    public EventRenderBlocks(AbstractBlock.AbstractBlockState var1) {
        this.field21559 = var1;
    }

    public AbstractBlock.AbstractBlockState method13970() {
        return this.field21559;
    }

    public boolean method13971() {
        return this.field21560;
    }

    public void method13972(boolean var1) {
        this.field21560 = var1;
    }
}
