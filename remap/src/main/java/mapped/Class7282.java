// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.client.renderer.Matrix4f;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.Vec3d;

import java.util.Optional;

public class Class7282
{
    private static String[] field28206;
    public final Class6114 field28207;
    public final Class6113 field28208;
    public final Class6113 field28209;
    public final Class6113 field28210;
    public final Class6113 field28211;
    public final Class6113 field28212;
    public final Class6117 field28213;
    public final Class6124 field28214;
    public final Class6113 field28215;
    public final Class6113 field28216;
    public final Class6113 field28217;
    public final Class6113 field28218;
    public final Class6123 field28219;
    public final Class6115 field28220;
    public final Class6126 field28221;
    public final Class6119 field28222;
    public final Class6127 field28223;
    private boolean field28224;
    
    public Class7282(final Class869 class869) {
        this.field28207 = new Class6114();
        this.field28208 = new Class6129(class869);
        this.field28209 = new Class6112(class869);
        this.field28210 = new Class6118(class869);
        this.field28211 = new Class6121(class869);
        this.field28212 = new Class6125(class869);
        this.field28213 = new Class6117();
        this.field28214 = new Class6124(class869);
        this.field28215 = new Class6116(class869);
        this.field28216 = new Class6120();
        this.field28217 = new Class6128(class869);
        this.field28218 = new Class6122(class869);
        this.field28219 = new Class6123(class869);
        this.field28220 = new Class6115(class869);
        this.field28221 = new Class6126(class869);
        this.field28222 = new Class6119(class869);
        this.field28223 = new Class6127();
    }
    
    public void method22330() {
        this.field28207.method18270();
        this.field28208.method18270();
        this.field28209.method18270();
        this.field28210.method18270();
        this.field28211.method18270();
        this.field28212.method18270();
        this.field28213.method18270();
        this.field28214.method18270();
        this.field28215.method18270();
        this.field28216.method18270();
        this.field28217.method18270();
        this.field28218.method18270();
        this.field28219.method18270();
        this.field28220.method18270();
        this.field28221.method18270();
        this.field28222.method18270();
        this.field28223.method18270();
    }
    
    public boolean method22331() {
        return this.field28224 = !this.field28224;
    }
    
    public void method22332(final Class7351 class7351, final Class7808 class7352, final double n, final double n2, final double n3) {
        if (this.field28224) {
            if (!Class869.method5277().method5317()) {
                this.field28209.method18269(class7351, class7352, n, n2, n3);
            }
        }
        this.field28223.method18269(class7351, class7352, n, n2, n3);
    }
    
    public static Optional<Entity> method22333(final Entity class399, final int n) {
        if (class399 == null) {
            return Optional.empty();
        }
        final Vec3d method1747 = class399.method1747(1.0f);
        final Vec3d method1748 = class399.method1741(1.0f).scale(n);
        final Vec3d method1749 = method1747.add(method1748);
        final AxisAlignedBB method1750 = class399.method1886().method18493(method1748).method18496(1.0);
        final int n2 = n * n;
        final Class7007 method1751 = Class7476.method23096(class399, method1747, method1749, method1750, class400 -> !class400.isSpectator() && class400.method1749(), n2);
        if (method1751 != null) {
            return (method1747.squareDistanceTo(method1751.method21451()) <= n2) ? Optional.of(method1751.method21452()) : Optional.empty();
        }
        return Optional.empty();
    }
    
    public static void method22334(final BlockPos class354, final BlockPos class355, final float n, final float n2, final float n3, final float n4) {
        final Class6092 method5833 = Class869.method5277().field4644.method5833();
        if (method5833.method18167()) {
            method22336(new AxisAlignedBB(class354, class355).method18501(method5833.method18161().inverse()), n, n2, n3, n4);
        }
    }
    
    public static void method22335(final BlockPos class354, final float n, final float n2, final float n3, final float n4, final float n5) {
        final Class6092 method5833 = Class869.method5277().field4644.method5833();
        if (method5833.method18167()) {
            method22336(new AxisAlignedBB(class354).method18501(method5833.method18161().inverse()).method18496(n), n2, n3, n4, n5);
        }
    }
    
    public static void method22336(final AxisAlignedBB class6221, final float n, final float n2, final float n3, final float n4) {
        method22337(class6221.field25073, class6221.field25074, class6221.field25075, class6221.field25076, class6221.field25077, class6221.field25078, n, n2, n3, n4);
    }
    
    public static void method22337(final double n, final double n2, final double n3, final double n4, final double n5, final double n6, final float n7, final float n8, final float n9, final float n10) {
        final Class7392 method22694 = Class7392.method22694();
        final Class4148 method22695 = method22694.method22696();
        method22695.method12390(5, Class9237.field39615);
        Class1656.method5734(method22695, n, n2, n3, n4, n5, n6, n7, n8, n9, n10);
        method22694.method22695();
    }
    
    public static void method22338(final String s, final int n, final int n2, final int n3, final int n4) {
        method22339(s, n + 0.5, n2 + 0.5, n3 + 0.5, n4);
    }
    
    public static void method22339(final String s, final double n, final double n2, final double n3, final int n4) {
        method22340(s, n, n2, n3, n4, 0.02f);
    }
    
    public static void method22340(final String s, final double n, final double n2, final double n3, final int n4, final float n5) {
        method22341(s, n, n2, n3, n4, n5, true, 0.0f, false);
    }
    
    public static void method22341(final String s, final double n, final double n2, final double n3, final int n4, final float n5, final boolean b, final float n6, final boolean b2) {
        final Class869 method5277 = Class869.method5277();
        final Class6092 method5278 = method5277.field4644.method5833();
        if (method5278.method18167()) {
            if (method5277.method5306().field35909 != null) {
                final Class1844 field4643 = method5277.field4643;
                final double field4644 = method5278.method18161().x;
                final double field4645 = method5278.method18161().y;
                final double field4646 = method5278.method18161().z;
                Class8726.method30059();
                Class8726.method30065((float)(n - field4644), (float)(n2 - field4645) + 0.07f, (float)(n3 - field4646));
                Class8726.method30006(0.0f, 1.0f, 0.0f);
                Class8726.method30067(new Matrix4f(method5278.method18165()));
                Class8726.method30063(n5, -n5, n5);
                Class8726.method30040();
                if (!b2) {
                    Class8726.method30008();
                }
                else {
                    Class8726.method30007();
                }
                Class8726.method30010(true);
                Class8726.method30063(-1.0f, 1.0f, 1.0f);
                final float n7 = (b ? (-field4643.method6617(s) / 2.0f) : 0.0f) - n6 / n5;
                Class8726.method29999();
                final Class7808 method5279 = Class7807.method25212(Class7392.method22694().method22696());
                field4643.method6613(s, n7, 0.0f, n4, false, Class9294.method34322().method34328(), method5279, b2, 0, 15728880);
                method5279.method25216();
                Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
                Class8726.method30008();
                Class8726.method30060();
            }
        }
    }
}
