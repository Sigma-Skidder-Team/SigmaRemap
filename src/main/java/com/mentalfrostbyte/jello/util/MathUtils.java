package com.mentalfrostbyte.jello.util;

import mapped.Vec2d;

import java.util.ArrayList;
import java.util.List;

public class MathUtils {
    private final double field38710;

    public MathUtils(double var1) {
        if (!(var1 <= 0.0) && !(var1 >= 1.0)) {
            this.field38710 = var1;
        } else {
            throw new AssertionError("Smoothness must be between 0 and 1 (both non-inclusive)");
        }
    }

    public MathUtils() {
        this(0.1F);
    }

    public static float lerp(float var0, double... var1) {
        List<Vec2d> vectors = new ArrayList<>();
        vectors.add(new Vec2d(0.0, 0.0));
        vectors.add(new Vec2d(var1[0], var1[1]));
        vectors.add(new Vec2d(var1[2], var1[3]));
        vectors.add(new Vec2d(1.0, 1.0));
        MathUtils var5 = new MathUtils(0.0055555557F);
        return (float) var5.method30789(vectors, var0);
    }

    public static double method16893(double var0, double var2) {
        return Math.random() * (var0 - var2) + var2;
    }

    public static double method16815(double var0, double var2) {
        return Math.random() * (var0 - var2) + var2;
    }

    public static double method16117(double var0, double var2) {
        return Math.random() * (var0 - var2) + var2;
    }

    public Vec2d method30787(Vec2d var1, Vec2d var2, Vec2d var3, double var4) {
        double var8 = (1.0 - var4) * (1.0 - var4) * var1.getX() + 2.0 * var4 * (1.0 - var4) * var2.getX() + var4 * var4 * var3.getX();
        double var10 = (1.0 - var4) * (1.0 - var4) * var1.getY() + 2.0 * var4 * (1.0 - var4) * var2.getY() + var4 * var4 * var3.getY();
        return new Vec2d(var8, var10);
    }

    public Vec2d method30788(Vec2d var1, Vec2d var2, Vec2d var3, Vec2d var4, double var5) {
        double var9 = 1.0 - var5;
        double var11 = var9 * var9;
        double var13 = var11 * var9;
        double var15 = var1.getX() * var13
                + var2.getX() * 3.0 * var5 * var11
                + var3.getX() * 3.0 * var5 * var5 * var9
                + var4.getX() * var5 * var5 * var5;
        double var17 = var1.getY() * var13
                + var2.getY() * 3.0 * var5 * var11
                + var3.getY() * 3.0 * var5 * var5 * var9
                + var4.getY() * var5 * var5 * var5;
        return new Vec2d(var15, var17);
    }

    public double method30789(List<Vec2d> var1, float var2) {
        if (var2 == 0.0F) {
            return 0.0;
        } else {
            List var5 = this.method30790(var1);
            double var6 = 1.0;

            for (int var8 = 0; var8 < var5.size(); var8++) {
                Vec2d var9 = (Vec2d) var5.get(var8);
                if (!(var9.getX() <= (double) var2)) {
                    break;
                }

                var6 = var9.getY();
                Vec2d var10 = new Vec2d(1.0, 1.0);
                if (var8 + 1 < var5.size()) {
                    var10 = (Vec2d) var5.get(var8 + 1);
                }

                double var11 = var10.getX() - var9.getX();
                double var13 = var10.getY() - var9.getY();
                double var15 = (double) var2 - var9.getX();
                double var17 = var15 / var11;
                var6 += var13 * var17;
            }

            return var6;
        }
    }

    public List<Vec2d> method30790(List<Vec2d> var1) {
        if (var1 != null) {
            if (var1.size() >= 3) {
                Vec2d var4 = var1.get(0);
                Vec2d var5 = var1.get(1);
                Vec2d var6 = var1.get(2);
                Vec2d var7 = var1.size() != 4 ? null : var1.get(3);
                ArrayList<Vec2d> var11 = new ArrayList<>();
                Vec2d var8 = var4;
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
