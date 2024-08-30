package com.mentalfrostbyte.jello.util.animation;

import java.util.Date;

public class Animation {
    public int field32936;
    public int field32937;
    public Direction direction = Direction.FORWARDS;
    public Date field32939;
    public Date field32940;

    public Animation(int var1, int var2) {
        this(var1, var2, Direction.FORWARDS);
    }

    public Animation(int var1, int var2, Direction var3) {
        this.field32936 = var1;
        this.field32937 = var2;
        this.field32939 = new Date();
        this.field32940 = new Date();
        this.changeDirection(var3);
    }

    public static float method25321(Date var0, Date var1, float var2, float var3) {
        float var6 = Math.min(var2, (float) (new Date().getTime() - (var0 != null ? var0.getTime() : new Date().getTime())))
                / var2
                * (1.0F - Math.min(var3, (float) (new Date().getTime() - (var1 != null ? var1.getTime() : new Date().getTime()))) / var3);
        return Math.max(0.0F, Math.min(1.0F, var6));
    }

    public static float method25322(Date var0, float var1) {
        float var4 = Math.min(var1, (float) (new Date().getTime() - (var0 != null ? var0.getTime() : new Date().getTime()))) / var1;
        return Math.max(0.0F, Math.min(1.0F, var4));
    }

    public static float method25323(Date var0, Date var1, float var2) {
        return method25321(var0, var1, var2, var2);
    }

    public static boolean method25324(Date var0, float var1) {
        return var0 != null && (float) (new Date().getTime() - var0.getTime()) > var1;
    }

    public int method25316() {
        return this.field32936;
    }

    public void changeDirection(Direction var1) {
        if (this.direction != var1) {
            switch (direction) {
                case FORWARDS:
                    long var4 = (long) (this.calcPercent() * (float) this.field32936);
                    this.field32939 = new Date(new Date().getTime() - var4);
                    break;
                case BACKWARDS:
                    long var6 = (long) ((1.0F - this.calcPercent()) * (float) this.field32937);
                    this.field32940 = new Date(new Date().getTime() - var6);
            }

            this.direction = var1;
        }
    }

    public void method25318(float var1) {
        switch (direction) {
            case FORWARDS:
                long var4 = (long) (var1 * (float) this.field32936);
                this.field32939 = new Date(new Date().getTime() - var4);
                break;
            case BACKWARDS:
                long var6 = (long) ((1.0F - var1) * (float) this.field32937);
                this.field32940 = new Date(new Date().getTime() - var6);
        }
    }

    public Direction getDirection() {
        return this.direction;
    }

    public float calcPercent() {
        return this.direction != Direction.FORWARDS
                ? 1.0F - (float) Math.min(this.field32937, new Date().getTime() - this.field32940.getTime()) / (float) this.field32937
                : (float) Math.min(this.field32936, new Date().getTime() - this.field32939.getTime()) / (float) this.field32936;
    }
}
