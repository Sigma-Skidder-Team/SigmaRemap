// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.client.renderer.Vector3f;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class Class9111
{
    private static String[] field38596;
    public static float field38597;
    public static float field38598;
    public static float field38599;
    private static int field38600;
    private static int field38601;
    private static long field38602;
    public static boolean field38603;
    
    public static void method32952(final Class6092 class6092, final float f, final Class1848 class6093, final int n, final float n2) {
        final IFluidState method18169 = class6092.method18169();
        if (!method18169.isTagged(Class7324.field28319)) {
            if (!method18169.isTagged(Class7324.field28320)) {
                final float n3 = 1.0f - (float)Math.pow(0.25f + 0.75f * n / 32.0f, 0.25);
                final Vec3d method18170 = Class8763.method30363(class6093.method6843(class6092.method18162(), f), class6093, class6092.method18166(), f);
                final float n4 = (float)method18170.x;
                final float n5 = (float)method18170.y;
                final float n6 = (float)method18170.z;
                final Vec3d method18171 = Class8763.method30362(class6093.method6845(f), class6093, class6092.method18166(), f);
                Class9111.field38597 = (float)method18171.x;
                Class9111.field38598 = (float)method18171.y;
                Class9111.field38599 = (float)method18171.z;
                if (n >= 4) {
                    float method18172 = class6092.method18173().dot(new Vector3f((MathHelper.sin(class6093.method6713(f)) <= 0.0f) ? 1.0f : -1.0f, 0.0f, 0.0f));
                    if (method18172 < 0.0f) {
                        method18172 = 0.0f;
                    }
                    if (method18172 > 0.0f) {
                        final float[] method18173 = class6093.dimension.method20497(class6093.method6952(f), f);
                        if (method18173 != null) {
                            final float n7 = method18172 * method18173[3];
                            Class9111.field38597 = Class9111.field38597 * (1.0f - n7) + method18173[0] * n7;
                            Class9111.field38598 = Class9111.field38598 * (1.0f - n7) + method18173[1] * n7;
                            Class9111.field38599 = Class9111.field38599 * (1.0f - n7) + method18173[2] * n7;
                        }
                    }
                }
                Class9111.field38597 += (n4 - Class9111.field38597) * n3;
                Class9111.field38598 += (n5 - Class9111.field38598) * n3;
                Class9111.field38599 += (n6 - Class9111.field38599) * n3;
                final float method18174 = class6093.method6768(f);
                if (method18174 > 0.0f) {
                    final float n8 = 1.0f - method18174 * 0.5f;
                    final float n9 = 1.0f - method18174 * 0.4f;
                    Class9111.field38597 *= n8;
                    Class9111.field38598 *= n8;
                    Class9111.field38599 *= n9;
                }
                final float method18175 = class6093.method6766(f);
                if (method18175 > 0.0f) {
                    final float n10 = 1.0f - method18175 * 0.5f;
                    Class9111.field38597 *= n10;
                    Class9111.field38598 *= n10;
                    Class9111.field38599 *= n10;
                }
                Class9111.field38602 = -1L;
            }
            else {
                Class9111.field38597 = 0.6f;
                Class9111.field38598 = 0.1f;
                Class9111.field38599 = 0.0f;
                Class9111.field38602 = -1L;
            }
        }
        else {
            final long method18176 = Util.method27837();
            final int method18177 = class6093.method6959(new BlockPos(class6092.method18161())).method9869();
            if (Class9111.field38602 < 0L) {
                Class9111.field38600 = method18177;
                Class9111.field38601 = method18177;
                Class9111.field38602 = method18176;
            }
            final int n11 = Class9111.field38600 >> 16 & 0xFF;
            final int n12 = Class9111.field38600 >> 8 & 0xFF;
            final int n13 = Class9111.field38600 & 0xFF;
            final int n14 = Class9111.field38601 >> 16 & 0xFF;
            final int n15 = Class9111.field38601 >> 8 & 0xFF;
            final int n16 = Class9111.field38601 & 0xFF;
            final float method18178 = MathHelper.clamp((method18176 - Class9111.field38602) / 5000.0f, 0.0f, 1.0f);
            final float method18179 = MathHelper.method35700(method18178, (float)n14, (float)n11);
            final float method18180 = MathHelper.method35700(method18178, (float)n15, (float)n12);
            final float method18181 = MathHelper.method35700(method18178, (float)n16, (float)n13);
            Class9111.field38597 = method18179 / 255.0f;
            Class9111.field38598 = method18180 / 255.0f;
            Class9111.field38599 = method18181 / 255.0f;
            if (Class9111.field38600 != method18177) {
                Class9111.field38600 = method18177;
                Class9111.field38601 = (MathHelper.method35642(method18179) << 16 | MathHelper.method35642(method18180) << 8 | MathHelper.method35642(method18181));
                Class9111.field38602 = method18176;
            }
        }
        double n17 = class6092.method18161().y * class6093.dimension.method20501();
        if (class6092.method18166() instanceof LivingEntity) {
            if (((LivingEntity)class6092.method18166()).method2653(Class9439.field40488)) {
                final int method18182 = ((LivingEntity)class6092.method18166()).method2654(Class9439.field40488).method7907();
                if (method18182 >= 20) {
                    n17 = 0.0;
                }
                else {
                    n17 *= 1.0f - method18182 / 20.0f;
                }
            }
        }
        if (n17 < 1.0) {
            if (n17 < 0.0) {
                n17 = 0.0;
            }
            final double n18 = n17 * n17;
            Class9111.field38597 *= (float)n18;
            Class9111.field38598 *= (float)n18;
            Class9111.field38599 *= (float)n18;
        }
        if (n2 > 0.0f) {
            Class9111.field38597 = Class9111.field38597 * (1.0f - n2) + Class9111.field38597 * 0.7f * n2;
            Class9111.field38598 = Class9111.field38598 * (1.0f - n2) + Class9111.field38598 * 0.6f * n2;
            Class9111.field38599 = Class9111.field38599 * (1.0f - n2) + Class9111.field38599 * 0.6f * n2;
        }
        if (!method18169.isTagged(Class7324.field28319)) {
            if (class6092.method18166() instanceof LivingEntity) {
                if (((LivingEntity)class6092.method18166()).method2653(Class9439.field40489)) {
                    final float method18183 = Class1660.method5816((LivingEntity)class6092.method18166(), f);
                    float n19 = Math.min(1.0f / Class9111.field38597, Math.min(1.0f / Class9111.field38598, 1.0f / Class9111.field38599));
                    if (Float.isInfinite(n19)) {
                        n19 = Math.nextAfter(n19, 0.0);
                    }
                    Class9111.field38597 = Class9111.field38597 * (1.0f - method18183) + Class9111.field38597 * n19 * method18183;
                    Class9111.field38598 = Class9111.field38598 * (1.0f - method18183) + Class9111.field38598 * n19 * method18183;
                    Class9111.field38599 = Class9111.field38599 * (1.0f - method18183) + Class9111.field38599 * n19 * method18183;
                }
            }
        }
        else {
            float method18184 = 0.0f;
            if (class6092.method18166() instanceof Class756) {
                method18184 = ((Class756)class6092.method18166()).method4140();
            }
            float n20 = Math.min(1.0f / Class9111.field38597, Math.min(1.0f / Class9111.field38598, 1.0f / Class9111.field38599));
            if (Float.isInfinite(n20)) {
                n20 = Math.nextAfter(n20, 0.0);
            }
            Class9111.field38597 = Class9111.field38597 * (1.0f - method18184) + Class9111.field38597 * n20 * method18184;
            Class9111.field38598 = Class9111.field38598 * (1.0f - method18184) + Class9111.field38598 * n20 * method18184;
            Class9111.field38599 = Class9111.field38599 * (1.0f - method18184) + Class9111.field38599 * n20 * method18184;
        }
        if (!method18169.isTagged(Class7324.field28319)) {
            if (method18169.isTagged(Class7324.field28320)) {
                final Entity method18185 = class6092.method18166();
                final Vec3d method18186 = Class8763.method30358(class6093, method18185.getPosX(), method18185.getPosY() + 1.0, method18185.getPosZ());
                if (method18186 != null) {
                    Class9111.field38597 = (float)method18186.x;
                    Class9111.field38598 = (float)method18186.y;
                    Class9111.field38599 = (float)method18186.z;
                }
            }
        }
        else {
            final Entity method18187 = class6092.method18166();
            final Vec3d method18188 = Class8763.method30357(class6093, method18187.getPosX(), method18187.getPosY() + 1.0, method18187.getPosZ());
            if (method18188 != null) {
                Class9111.field38597 = (float)method18188.x;
                Class9111.field38598 = (float)method18188.y;
                Class9111.field38599 = (float)method18188.z;
            }
        }
        if (Class9570.field41216.method22619()) {
            final Object method18189 = Class9570.method35842(Class9570.field41216, class6092, f, Class9111.field38597, Class9111.field38598, Class9111.field38599);
            Class9570.method35841(method18189);
            Class9111.field38597 = Class9570.method35823(method18189, Class9570.field41217, new Object[0]);
            Class9111.field38598 = Class9570.method35823(method18189, Class9570.field41218, new Object[0]);
            Class9111.field38599 = Class9570.method35823(method18189, Class9570.field41219, new Object[0]);
        }
        Class9216.method33804(Class9111.field38597, Class9111.field38598, Class9111.field38599, 0.0f);
        RenderSystem.method30054(Class9111.field38597, Class9111.field38598, Class9111.field38599, 0.0f);
    }
    
    public static void method32953() {
        RenderSystem.method30023(0.0f);
        RenderSystem.method30021(Class317.field1882);
    }
    
    public static void method32954(final Class6092 class6092, final Class1985 class6093, final float n, final boolean b) {
        method32955(class6092, class6093, n, b, 0.0f);
    }
    
    public static void method32955(final Class6092 class6092, final Class1985 class6093, final float a, final boolean b, final float n) {
        Class9111.field38603 = false;
        final IFluidState method18169 = class6092.method18169();
        final Entity method18170 = class6092.method18166();
        final boolean b2 = method18169.getFluid() != Class7558.field29974;
        float method18171 = -1.0f;
        if (Class9570.field41293.method22605()) {
            method18171 = Class9570.method35815(Class9570.field41293, class6093, class6092, n, 0.1f);
        }
        if (method18171 < 0.0f) {
            if (!b2) {
                float n2;
                float f;
                if (method18170 instanceof LivingEntity && ((LivingEntity)method18170).method2653(Class9439.field40488)) {
                    final float method18172 = MathHelper.method35700(Math.min(1.0f, ((LivingEntity)method18170).method2654(Class9439.field40488).method7907() / 20.0f), a, 5.0f);
                    if (class6093 != Class1985.field10993) {
                        n2 = method18172 * 0.25f;
                        f = method18172;
                    }
                    else {
                        n2 = 0.0f;
                        f = method18172 * 0.8f;
                    }
                }
                else if (!b) {
                    if (class6093 != Class1985.field10993) {
                        Class9111.field38603 = true;
                        n2 = a * Config.method28845();
                        f = a;
                    }
                    else {
                        Class9111.field38603 = true;
                        n2 = 0.0f;
                        f = a;
                    }
                }
                else {
                    Class9111.field38603 = true;
                    n2 = a * 0.05f;
                    f = Math.min(a, 192.0f) * 0.5f;
                }
                RenderSystem.method30024(n2);
                RenderSystem.method30025(f);
                RenderSystem.method30021(Class317.field1880);
                RenderSystem.method30083();
                if (Class9570.field41299.method22605()) {
                    Class9570.method35811(Class9570.field41299, class6093, class6092, n, f);
                }
            }
            else {
                float n3 = 1.0f;
                if (!method18169.isTagged(Class7324.field28319)) {
                    if (method18169.isTagged(Class7324.field28320)) {
                        n3 = 2.0f;
                    }
                }
                else {
                    n3 = 0.05f;
                    if (method18170 instanceof Class756) {
                        final Class756 class6094 = (Class756)method18170;
                        n3 -= class6094.method4140() * class6094.method4140() * 0.03f;
                        final Class3090 method18173 = class6094.world.method6959(new BlockPos(class6094));
                        if (method18173 == Class7102.field27638 || method18173 == Class7102.field27689) {
                            n3 += 0.005f;
                        }
                    }
                }
                RenderSystem.method30023(n3);
                RenderSystem.method30021(Class317.field1882);
            }
        }
        else {
            Class8933.method31587(method18171);
        }
    }
    
    public static void method32956() {
        RenderSystem.method30026(2918, Class9111.field38597, Class9111.field38598, Class9111.field38599, 1.0f);
        if (Config.method28955()) {
            Class9216.method33803(Class9111.field38597, Class9111.field38598, Class9111.field38599);
        }
    }
    
    static {
        Class9111.field38600 = -1;
        Class9111.field38601 = -1;
        Class9111.field38602 = -1L;
        Class9111.field38603 = false;
    }
}
