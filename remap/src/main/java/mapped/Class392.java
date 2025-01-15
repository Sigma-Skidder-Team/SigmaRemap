// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.client.renderer.Vector3f;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionType;

public class Class392 implements AutoCloseable
{
    private final Class1773 field2279;
    private final Class1846 field2280;
    private final Class1932 field2281;
    private boolean field2282;
    private float field2283;
    private final Class1660 field2284;
    private final Class869 field2285;
    private boolean field2286;
    private boolean field2287;
    private Vector3f field2288;
    
    public Class392(final Class1660 field2284, final Class869 field2285) {
        this.field2286 = true;
        this.field2287 = false;
        this.field2288 = new Vector3f();
        this.field2284 = field2284;
        this.field2285 = field2285;
        this.field2279 = new Class1773(16, 16, false);
        this.field2281 = this.field2285.method5290().method5854("light_map", this.field2279);
        this.field2280 = this.field2279.method6328();
        for (int i = 0; i < 16; ++i) {
            for (int j = 0; j < 16; ++j) {
                this.field2280.method6648(j, i, -1);
            }
        }
        this.field2279.method6327();
    }
    
    @Override
    public void close() {
        this.field2279.close();
    }
    
    public void method1416() {
        this.field2283 += (float)((Math.random() - Math.random()) * Math.random() * Math.random() * 0.1);
        this.field2283 *= (float)0.9;
        this.field2282 = true;
    }
    
    public void method1417() {
        Class8726.method30039(33986);
        Class8726.method30041();
        Class8726.method30039(33984);
        if (Class8571.method28955()) {
            Class9216.method33881();
        }
    }
    
    public void method1418() {
        if (this.field2286) {
            Class8726.method30039(33986);
            Class8726.method30057(5890);
            Class8726.method30058();
            Class8726.method30063(0.00390625f, 0.00390625f, 0.00390625f);
            Class8726.method30065(8.0f, 8.0f, 8.0f);
            Class8726.method30057(5888);
            this.field2285.method5290().method5849(this.field2281);
            Class8726.method30042(3553, 10241, 9729);
            Class8726.method30042(3553, 10240, 9729);
            Class8726.method30042(3553, 10242, 33071);
            Class8726.method30042(3553, 10243, 33071);
            Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
            Class8726.method30040();
            Class8726.method30039(33984);
            if (Class8571.method28955()) {
                Class9216.method33880();
            }
        }
    }
    
    public void method1419(final float f) {
        if (this.field2282) {
            this.field2282 = false;
            this.field2285.method5327().method15297("lightTex");
            final Class1848 field4683 = this.field2285.field4683;
            if (field4683 != null) {
                this.field2287 = false;
                if (Class8571.method28945() && Class8763.method30361(field4683, this.field2283, this.field2280, this.field2285.field4684.method2653(Class9439.field40489) || this.field2285.field4684.method2653(Class9439.field40502), f)) {
                    this.field2279.method6327();
                    this.field2282 = false;
                    this.field2285.method5327().method15299();
                    this.field2287 = true;
                    return;
                }
                final float method6842 = field4683.method6842(1.0f);
                float n;
                if (field4683.method6848() <= 0) {
                    n = method6842 * 0.95f + 0.05f;
                }
                else {
                    n = 1.0f;
                }
                final float method6843 = this.field2285.field4684.method4140();
                float method6844;
                if (!this.field2285.field4684.method2653(Class9439.field40489)) {
                    if (method6843 > 0.0f && this.field2285.field4684.method2653(Class9439.field40502)) {
                        method6844 = method6843;
                    }
                    else {
                        method6844 = 0.0f;
                    }
                }
                else {
                    method6844 = Class1660.method5816(this.field2285.field4684, f);
                }
                final Vector3f class9138 = new Vector3f(method6842, method6842, 1.0f);
                class9138.lerp(new Vector3f(1.0f, 1.0f, 1.0f), 0.35f);
                final float f2 = this.field2283 + 1.5f;
                final Vector3f class9139 = new Vector3f();
                for (int i = 0; i < 16; ++i) {
                    for (int j = 0; j < 16; ++j) {
                        final float f3 = this.method1421(field4683, i) * n;
                        final float n2 = this.method1421(field4683, j) * f2;
                        class9139.set(n2, n2 * ((n2 * 0.6f + 0.4f) * 0.6f + 0.4f), n2 * (n2 * n2 * 0.6f + 0.4f));
                        if (field4683.dimension.getType() != DimensionType.field2225) {
                            final Vector3f method6845 = this.method1426(class9138);
                            method6845.mul(f3);
                            class9139.add(method6845);
                            class9139.lerp(this.method1425(0.75f, 0.75f, 0.75f), 0.04f);
                            if (this.field2284.method5831(f) > 0.0f) {
                                final float method6846 = this.field2284.method5831(f);
                                final Vector3f method6847 = this.method1426(class9139);
                                method6847.mul(0.7f, 0.6f, 0.6f);
                                class9139.lerp(method6847, method6846);
                            }
                        }
                        else {
                            class9139.lerp(this.method1425(0.99f, 1.12f, 1.0f), 0.25f);
                        }
                        if (Class9570.field41365.method22605()) {
                            Class9570.method35826(field4683.method6789(), Class9570.field41365, f, method6842, f2, f3, class9139);
                        }
                        class9139.clamp(0.0f, 1.0f);
                        if (method6844 > 0.0f) {
                            final float max = Math.max(class9139.getX(), Math.max(class9139.getY(), class9139.getZ()));
                            if (max < 1.0f) {
                                final float n3 = 1.0f / max;
                                final Vector3f method6848 = this.method1426(class9139);
                                method6848.mul(n3);
                                class9139.lerp(method6848, method6844);
                            }
                        }
                        final float n4 = (float)this.field2285.field4648.field23472;
                        final Vector3f method6849 = this.method1426(class9139);
                        method6849.apply(this::method1420);
                        class9139.lerp(method6849, n4);
                        class9139.lerp(this.method1425(0.75f, 0.75f, 0.75f), 0.04f);
                        class9139.clamp(0.0f, 1.0f);
                        class9139.mul(255.0f);
                        this.field2280.method6648(j, i, 0xFF000000 | (int)class9139.getZ() << 16 | (int)class9139.getY() << 8 | (int)class9139.getX());
                    }
                }
                this.field2279.method6327();
                this.field2285.method5327().method15299();
            }
        }
    }
    
    private float method1420(final float n) {
        final float n2 = 1.0f - n;
        return 1.0f - n2 * n2 * n2 * n2;
    }
    
    private float method1421(final World class1847, final int n) {
        return class1847.dimension.method20505(n);
    }
    
    public static int method1422(final int n, final int n2) {
        return n << 4 | n2 << 20;
    }
    
    public static int method1423(final int n) {
        return (n & 0xFFFF) >> 4;
    }
    
    public static int method1424(final int n) {
        return n >> 20 & 0xFFFF;
    }
    
    private Vector3f method1425(final float n, final float n2, final float n3) {
        this.field2288.set(n, n2, n3);
        return this.field2288;
    }
    
    private Vector3f method1426(final Vector3f class9138) {
        this.field2288.set(class9138.getX(), class9138.getY(), class9138.getZ());
        return this.field2288;
    }
    
    public boolean method1427() {
        return this.field2286;
    }
    
    public void method1428(final boolean field2286) {
        this.field2286 = field2286;
    }
    
    public boolean method1429() {
        return this.field2287;
    }
}
