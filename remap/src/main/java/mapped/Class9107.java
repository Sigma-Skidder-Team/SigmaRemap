// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.client.renderer.*;

import java.util.Random;

public class Class9107
{
    public static Random field38575;
    
    public static void main(final String[] array) {
        method32936("Test math: " + 1000000);
        for (int i = 0; i < 1000000; ++i) {
            method32930();
            method32931();
            method32932();
            method32933();
            method32935();
            method32934();
        }
        method32936("Done");
    }
    
    private static void method32930() {
        final Matrix4f class6789 = new Matrix4f();
        class6789.method20767(Class9107.field38575);
        final Matrix4f method20758 = class6789.method20758();
        final float nextFloat = Class9107.field38575.nextFloat();
        final float nextFloat2 = Class9107.field38575.nextFloat();
        final float nextFloat3 = Class9107.field38575.nextFloat();
        class6789.method20752(Matrix4f.method20760(nextFloat, nextFloat2, nextFloat3));
        method20758.method20765(nextFloat, nextFloat2, nextFloat3);
        if (!method20758.equals(class6789)) {
            method32936("*** DIFFERENT ***");
            method32936(class6789.toString());
            method32936(method20758.toString());
        }
    }
    
    private static void method32931() {
        final Matrix4f class6789 = new Matrix4f();
        class6789.method20767(Class9107.field38575);
        final Matrix4f method20758 = class6789.method20758();
        final float nextFloat = Class9107.field38575.nextFloat();
        final float nextFloat2 = Class9107.field38575.nextFloat();
        final float nextFloat3 = Class9107.field38575.nextFloat();
        class6789.method20752(Matrix4f.method20759(nextFloat, nextFloat2, nextFloat3));
        method20758.method20766(nextFloat, nextFloat2, nextFloat3);
        if (!method20758.equals(class6789)) {
            method32936("*** DIFFERENT ***");
            method32936(class6789.toString());
            method32936(method20758.toString());
        }
    }
    
    private static void method32932() {
        final Matrix4f class6789 = new Matrix4f();
        class6789.method20767(Class9107.field38575);
        final Matrix4f method20758 = class6789.method20758();
        final Quaternion class6790 = new Quaternion(Class9107.field38575.nextFloat(), Class9107.field38575.nextFloat(), Class9107.field38575.nextFloat(), Class9107.field38575.nextFloat());
        class6789.method20752(new Matrix4f(class6790));
        method20758.method20753(class6790);
        if (!method20758.equals(class6789)) {
            method32936("*** DIFFERENT ***");
            method32936(class6789.toString());
            method32936(method20758.toString());
        }
    }
    
    private static void method32933() {
        final Matrix3f class9429 = new Matrix3f();
        class9429.setRandom(Class9107.field38575);
        final Matrix3f method35045 = class9429.copy();
        final Quaternion class9430 = new Quaternion(Class9107.field38575.nextFloat(), Class9107.field38575.nextFloat(), Class9107.field38575.nextFloat(), Class9107.field38575.nextFloat());
        class9429.mul(new Matrix3f(class9430));
        method35045.mul(class9430);
        if (!method35045.equals(class9429)) {
            method32936("*** DIFFERENT ***");
            method32936(class9429.toString());
            method32936(method35045.toString());
        }
    }
    
    private static void method32934() {
        final Vector3f class9138 = new Vector3f(Class9107.field38575.nextFloat(), Class9107.field38575.nextFloat(), Class9107.field38575.nextFloat());
        final Vector3f method33329 = class9138.copy();
        final Matrix3f class9139 = new Matrix3f();
        class9139.setRandom(Class9107.field38575);
        class9138.transform(class9139);
        final Vector3f class9140 = new Vector3f(class9139.getTransformX(method33329.getX(), method33329.getY(), method33329.getZ()), class9139.getTransformY(method33329.getX(), method33329.getY(), method33329.getZ()), class9139.getTransformZ(method33329.getX(), method33329.getY(), method33329.getZ()));
        if (!class9140.equals(class9138)) {
            method32936("*** DIFFERENT ***");
            method32936(class9138.toString());
            method32936(class9140.toString());
        }
    }
    
    private static void method32935() {
        final Vector4f class8526 = new Vector4f(Class9107.field38575.nextFloat(), Class9107.field38575.nextFloat(), Class9107.field38575.nextFloat(), Class9107.field38575.nextFloat());
        final Vector4f class8527 = new Vector4f(class8526.method28595(), class8526.method28596(), class8526.method28597(), class8526.method28598());
        final Matrix4f class8528 = new Matrix4f();
        class8528.method20767(Class9107.field38575);
        class8526.method28603(class8528);
        final Vector4f class8529 = new Vector4f(class8528.method20761(class8527.method28595(), class8527.method28596(), class8527.method28597(), class8527.method28598()), class8528.method20762(class8527.method28595(), class8527.method28596(), class8527.method28597(), class8527.method28598()), class8528.method20763(class8527.method28595(), class8527.method28596(), class8527.method28597(), class8527.method28598()), class8528.method20764(class8527.method28595(), class8527.method28596(), class8527.method28597(), class8527.method28598()));
        if (!class8529.equals(class8526)) {
            method32936("*** DIFFERENT ***");
            method32936(class8526.toString());
            method32936(class8529.toString());
        }
    }
    
    private static void method32936(final String x) {
        System.out.println(x);
    }
    
    static {
        Class9107.field38575 = new Random();
    }
}
