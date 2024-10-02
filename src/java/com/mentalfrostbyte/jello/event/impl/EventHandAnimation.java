package com.mentalfrostbyte.jello.event.impl;

import com.mentalfrostbyte.jello.event.CancellableEvent;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.item.ItemStack;
import net.minecraft.util.HandSide;

public class EventHandAnimation extends CancellableEvent {
    private final boolean field21504;
    private boolean blocking;
    private final float field21506;
    private final float field21507;
    private final HandSide field21508;
    private final ItemStack field21509;
    private final MatrixStack field21510;

    public EventHandAnimation(boolean var1, float var2, float var3, HandSide var4, ItemStack var5, MatrixStack var6) {
        this.field21504 = var1;
        this.field21506 = var2;
        this.field21507 = var3;
        this.field21508 = var4;
        this.field21509 = var5;
        this.field21510 = var6;
        this.blocking = true;
    }

    public float method13924() {
        return this.field21506;
    }

    public float method13925() {
        return this.field21507;
    }

    public boolean method13926() {
        return this.field21504;
    }

    public HandSide getHand() {
        return this.field21508;
    }

    public ItemStack getItemStack() {
        return this.field21509;
    }

    public MatrixStack getMatrix() {
        return this.field21510;
    }

    public boolean isBlocking() {
        return this.blocking;
    }

    public void renderBlocking(boolean var1) {
        this.blocking = var1;
    }
}
