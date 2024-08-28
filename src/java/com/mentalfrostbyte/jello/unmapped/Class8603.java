package com.mentalfrostbyte.jello.unmapped;

import mapped.Class9778;

import java.util.ArrayList;
import java.util.List;

public class Class8603 {
    public static final double field38711 = 0.1F;
    private final double field38710;

    public Class8603(double var1) {
        if (!(var1 <= 0.0) && !(var1 >= 1.0)) {
            this.field38710 = var1;
        } else {
            throw new AssertionError("Smoothness must be between 0 and 1 (both non-inclusive)");
        }
    }

    public Class8603() {
        this(0.1F);
    }

    public static float method30791(float var0, double... var1) {
        ArrayList var4 = new ArrayList();
        var4.add(new Class9778(0.0, 0.0));
        var4.add(new Class9778(var1[0], var1[1]));
        var4.add(new Class9778(var1[2], var1[3]));
        var4.add(new Class9778(1.0, 1.0));
        Class8603 var5 = new Class8603(0.0055555557F);
        return (float) var5.method30789(var4, var0);
    }

    public Class9778 method30787(Class9778 var1, Class9778 var2, Class9778 var3, double var4) {
        double var8 = (1.0 - var4) * (1.0 - var4) * var1.method38553() + 2.0 * var4 * (1.0 - var4) * var2.method38553() + var4 * var4 * var3.method38553();
        double var10 = (1.0 - var4) * (1.0 - var4) * var1.method38554() + 2.0 * var4 * (1.0 - var4) * var2.method38554() + var4 * var4 * var3.method38554();
        return new Class9778(var8, var10);
    }

    public Class9778 method30788(Class9778 var1, Class9778 var2, Class9778 var3, Class9778 var4, double var5) {
        double var9 = 1.0 - var5;
        double var11 = var9 * var9;
        double var13 = var11 * var9;
        double var15 = var1.method38553() * var13
                + var2.method38553() * 3.0 * var5 * var11
                + var3.method38553() * 3.0 * var5 * var5 * var9
                + var4.method38553() * var5 * var5 * var5;
        double var17 = var1.method38554() * var13
                + var2.method38554() * 3.0 * var5 * var11
                + var3.method38554() * 3.0 * var5 * var5 * var9
                + var4.method38554() * var5 * var5 * var5;
        return new Class9778(var15, var17);
    }

    public double method30789(List<Class9778> var1, float var2) {
        if (var2 == 0.0F) {
            return 0.0;
        } else {
            List var5 = this.method30790(var1);
            double var6 = 1.0;

            for (int var8 = 0; var8 < var5.size(); var8++) {
                Class9778 var9 = (Class9778) var5.get(var8);
                if (!(var9.method38553() <= (double) var2)) {
                    break;
                }

                var6 = var9.method38554();
                Class9778 var10 = new Class9778(1.0, 1.0);
                if (var8 + 1 < var5.size()) {
                    var10 = (Class9778) var5.get(var8 + 1);
                }

                double var11 = var10.method38553() - var9.method38553();
                double var13 = var10.method38554() - var9.method38554();
                double var15 = (double) var2 - var9.method38553();
                double var17 = var15 / var11;
                var6 += var13 * var17;
            }

            return var6;
        }
    }

    public List<Class9778> method30790(List<Class9778> var1) {
        if (var1 != null) {
            if (var1.size() >= 3) {
                Class9778 var4 = var1.get(0);
                Class9778 var5 = var1.get(1);
                Class9778 var6 = var1.get(2);
                Class9778 var7 = var1.size() != 4 ? null : var1.get(3);
                ArrayList var11 = new ArrayList();
                Class9778 var8 = var4;
                double var9 = 0.0;

                while (var9 < 1.0) {
                    var11.add(var8);
                    var8 = var7 != null ? this.method30788(var4, var5, var6, var7, var9) : this.method30787(var4, var5, var6, var9);
                    var9 += this.field38710;
                }

                return var11;
            } else {
                return null;
            }
        } else {
            throw new AssertionError("Provided list had no reference");
        }
    }
}
