package com.mentalfrostbyte.jello.event.impl;

import mapped.RenderState;
import net.minecraft.entity.LivingEntity;

public class EventRenderEntity extends CancellableEvent {
    private float field21527;
    private float field21528;
    private float field21529;
    private float field21530;
    private final float field21531;
    private final LivingEntity entity;
    private boolean field21533 = true;
    private boolean field21534 = true;
    private RenderState state;

    public EventRenderEntity(float var1, float var2, float var3, float var4, float var5, LivingEntity var6) {
        this.field21527 = var1;
        this.field21528 = var2;
        this.field21529 = var3;
        this.field21530 = var4;
        this.field21531 = var5;
        this.entity = var6;
        this.state = RenderState.field13212;
    }

    public void setState(RenderState state) {
        this.state = state;
    }

    public RenderState getState() {
        return this.state;
    }

    public float method13944() {
        return this.field21527;
    }

    public float method13945() {
        return this.field21528;
    }

    public float method13946() {
        return this.field21529;
    }

    public float method13947() {
        return this.field21530;
    }

    public float method13948() {
        return this.field21531;
    }

    public void method13949(float var1) {
        this.field21527 = var1;
    }

    public void method13950(float var1) {
        this.field21528 = var1;
    }

    public void method13951(float var1) {
        this.field21529 = var1;
    }

    public void method13952(float var1) {
        this.field21530 = var1;
    }

    public LivingEntity method13953() {
        return this.entity;
    }

    public boolean method13954() {
        return this.field21533;
    }

    public void method13955(boolean var1) {
        this.field21534 = var1;
    }

    public boolean method13956() {
        return this.field21534;
    }

    public void method13957(boolean var1) {
        this.field21533 = var1;
    }
}
