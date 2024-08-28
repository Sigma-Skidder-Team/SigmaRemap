package com.mentalfrostbyte.jello.network;

public abstract class Class7232 {
    public String field31076;

    public Class7232(String var1) {
        this.field31076 = var1;
    }

    public static Class7232 method22709(String var0) {
        switch (var0) {
            case "true":
                return new Class7233(var0);
            case "false":
                return new Class7234(var0);
            default:
                return null;
        }
    }

    public String method22707() {
        return this.field31076;
    }

    public abstract boolean method22708();
}
