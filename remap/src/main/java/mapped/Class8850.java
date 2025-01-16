// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.network.datasync.DataParameter;

import java.util.HashMap;
import java.io.InputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Class8850
{
    private static Class8604 field37207;
    private static Map<String, Integer> field37208;
    private static Map<Item, Integer> field37209;
    private static long field37210;
    private static final double field37211 = 7.5;
    private static final double field37212 = 56.25;
    private static final int field37213 = 15;
    private static final int field37214 = 15;
    private static final int field37215 = 10;
    private static final int field37216 = 8;
    private static final int field37217 = 13;
    private static final int field37218 = 8;
    private static final int field37219 = 8;
    private static final DataParameter<ItemStack> field37220;
    private static boolean field37221;
    
    public static void method30983(final Entity class399, final Class1656 class400) {
    }
    
    public static void method30984(final Entity class399, final Class1656 class400) {
        synchronized (Class8850.field37207) {
            final Class9591 method29176 = Class8850.field37207.method29176(class399.getEntityId());
            if (method29176 != null) {
                method29176.method35965(class400);
            }
        }
    }
    
    public static void method30985(final Class1656 class1656) {
        final long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis >= Class8850.field37210 + 50L) {
            Class8850.field37210 = currentTimeMillis;
            if (!Class8850.field37221) {
                method30986();
            }
            synchronized (Class8850.field37207) {
                method30989(class1656);
                if (Class8850.field37207.method29175() > 0) {
                    final List<Class9591> method29179 = Class8850.field37207.method29179();
                    for (int i = 0; i < method29179.size(); ++i) {
                        ((Class9591)method29179.get(i)).method35962(class1656);
                    }
                }
            }
        }
    }
    
    private static void method30986() {
        Class8850.field37221 = true;
        Class8850.field37208.clear();
        Class8850.field37209.clear();
        final String[] method24308 = Class7667.method24308();
        for (int i = 0; i < method24308.length; ++i) {
            final String s = method24308[i];
            try {
                final ResourceLocation class1932 = new ResourceLocation(s, "optifine/dynamic_lights.properties");
                method30987(Config.method28897(class1932), class1932.toString(), s);
            }
            catch (final IOException ex) {}
        }
        if (Class8850.field37208.size() > 0) {
            Config.method28847("DynamicLights entities: " + Class8850.field37208.size());
        }
        if (Class8850.field37209.size() > 0) {
            Config.method28847("DynamicLights items: " + Class8850.field37209.size());
        }
    }
    
    private static void method30987(final InputStream inStream, final String s, final String s2) {
        if (inStream != null) {
            try {
                final Class27 class27 = new Class27();
                class27.load(inStream);
                inStream.close();
                Config.method28847("DynamicLights: Parsing " + s);
                final Class8652 class28 = new Class8652("DynamicLights");
                method30988(class27.getProperty("entities"), Class8850.field37208, new Class8045(), class28, s, s2);
                method30988(class27.getProperty("items"), Class8850.field37209, new Class8047(), class28, s, s2);
            }
            catch (final IOException ex) {
                Config.warn("DynamicLights: Error reading " + s);
            }
        }
    }
    
    private static <T> void method30988(final String s, final Map<T, Integer> map, final Class8046<T> class8046, final Class8652 class8047, final String str, final String str2) {
        if (s != null) {
            final String[] method28937 = Config.method28937(s, " ");
            for (int i = 0; i < method28937.length; ++i) {
                final String s2 = method28937[i];
                final String[] method28938 = Config.method28937(s2, ":");
                if (method28938.length == 2) {
                    final String str3 = method28938[0];
                    final String s3 = method28938[1];
                    final String string = str2 + ":" + str3;
                    final T method28939 = class8046.method26391(new ResourceLocation(string));
                    if (method28939 != null) {
                        final int method28940 = class8047.method29456(s3, -1);
                        if (method28940 >= 0 && method28940 <= 15) {
                            map.put(method28939, new Integer(method28940));
                        }
                        else {
                            class8047.method29461("Invalid light level: " + s2);
                        }
                    }
                    else {
                        class8047.method29461("Object not found: " + string);
                    }
                }
                else {
                    class8047.method29461("Invalid entry: " + s2 + ", in:" + str);
                }
            }
        }
    }
    
    private static void method30989(final Class1656 class1656) {
        final Class1848 method5763 = class1656.method5763();
        if (method5763 != null) {
            for (final Entity class1657 : method5763.method6806()) {
                if (method30995(class1657) <= 0) {
                    final Class9591 method5764 = Class8850.field37207.method29176(class1657.getEntityId());
                    if (method5764 == null) {
                        continue;
                    }
                    method5764.method35965(class1656);
                }
                else {
                    final int method5765 = class1657.getEntityId();
                    if (Class8850.field37207.method29174(method5765) != null) {
                        continue;
                    }
                    Class8850.field37207.method29173(method5765, new Class9591(class1657));
                }
            }
        }
    }
    
    public static int method30990(final BlockPos class354, int method30992) {
        method30992 = method30992(method30993(class354), method30992);
        return method30992;
    }
    
    public static int method30991(final Entity class399, int method30992) {
        double a = method30993(class399.method1894());
        if (class399 == Config.method28894().player) {
            a = Math.max(a, method30995(class399));
        }
        method30992 = method30992(a, method30992);
        return method30992;
    }
    
    public static int method30992(final double n, int n2) {
        if (n > 0.0) {
            final int n3 = (int)(n * 16.0);
            if (n3 > (n2 & 0xFF)) {
                n2 &= 0xFFFFFF00;
                n2 |= n3;
            }
        }
        return n2;
    }
    
    public static double method30993(final BlockPos class354) {
        double n = 0.0;
        synchronized (Class8850.field37207) {
            final List<Class9591> method29179 = Class8850.field37207.method29179();
            for (int size = method29179.size(), i = 0; i < size; ++i) {
                final Class9591 class355 = method29179.get(i);
                final int method29180 = class355.method35970();
                if (method29180 > 0) {
                    final double method29181 = class355.method35967();
                    final double method29182 = class355.method35968();
                    final double method29183 = class355.method35969();
                    final double n2 = class354.getX() - method29181;
                    final double n3 = class354.getY() - method29182;
                    final double n4 = class354.getZ() - method29183;
                    final double a = n2 * n2 + n3 * n3 + n4 * n4;
                    if (a <= 56.25) {
                        final double n5 = (1.0 - Math.sqrt(a) / 7.5) * method29180;
                        if (n5 > n) {
                            n = n5;
                        }
                    }
                }
            }
        }
        return Config.method28867(n, 0.0, 15.0);
    }
    
    public static int method30994(final ItemStack class8321) {
        if (class8321 == null) {
            return 0;
        }
        final Item method27622 = class8321.getItem();
        if (method27622 instanceof Class4036) {
            final Block method27623 = ((Class4036)method27622).method12240();
            if (method27623 != null) {
                return method27623.getLightValue(method27623.getDefaultState());
            }
        }
        if (method27622 == Items.field31351) {
            return Class7521.field29174.getLightValue(Class7521.field29174.getDefaultState());
        }
        if (method27622 == Items.field31437 || method27622 == Items.field31445) {
            return 10;
        }
        if (method27622 == Items.field31378) {
            return 8;
        }
        if (method27622 == Items.field31540) {
            return 8;
        }
        if (method27622 == Items.field31446) {
            return 8;
        }
        if (method27622 != Items.field31530) {
            if (!Class8850.field37209.isEmpty()) {
                final Integer n = Class8850.field37209.get(method27622);
                if (n != null) {
                    return n;
                }
            }
            return 0;
        }
        return Class7521.field29417.getLightValue(Class7521.field29417.getDefaultState()) / 2;
    }
    
    public static int method30995(final Entity class399) {
        if (class399 == Config.method28894().method5303() && !Config.method29004()) {
            return 0;
        }
        if (class399 instanceof PlayerEntity && ((PlayerEntity)class399).isSpectator()) {
            return 0;
        }
        if (class399.method1804()) {
            return 15;
        }
        if (!Class8850.field37208.isEmpty()) {
            final Integer n = Class8850.field37208.get(Class8045.method26390(class399));
            if (n != null) {
                return n;
            }
        }
        if (class399 instanceof Class419) {
            return 15;
        }
        if (class399 instanceof Class510) {
            return 15;
        }
        if (class399 instanceof Class849) {
            return ((Class849)class399).method1804() ? 15 : 10;
        }
        if (class399 instanceof Class854) {
            return (((Class854)class399).field4558 <= 0.6) ? 8 : 13;
        }
        if (class399 instanceof Class765 && ((Class765)class399).method4234(0.0f) > 0.001) {
            return 15;
        }
        if (class399 instanceof LivingEntity) {
            final LivingEntity class400 = (LivingEntity)class399;
            return Math.max(Math.max(method30994(class400.getHeldItemMainhand()), method30994(class400.method2714())), method30994(class400.method2718(Class2215.field13605)));
        }
        if (!(class399 instanceof Class427)) {
            return 0;
        }
        return method30994(method30999((Class427)class399));
    }
    
    public static void method30996(final Class1656 class1656) {
        synchronized (Class8850.field37207) {
            final List<Class9591> method29179 = Class8850.field37207.method29179();
            for (int i = 0; i < method29179.size(); ++i) {
                ((Class9591)method29179.get(i)).method35965(class1656);
            }
            Class8850.field37207.method29177();
        }
    }
    
    public static void method30997() {
        synchronized (Class8850.field37207) {
            Class8850.field37207.method29177();
        }
    }
    
    public static int method30998() {
        synchronized (Class8850.field37207) {
            return Class8850.field37207.method29175();
        }
    }
    
    public static ItemStack method30999(final Class427 class427) {
        return class427.method1650().get(Class8850.field37220);
    }
    
    static {
        Class8850.field37207 = new Class8604();
        Class8850.field37208 = new HashMap<String, Integer>();
        Class8850.field37209 = new HashMap<Item, Integer>();
        Class8850.field37210 = 0L;
        field37220 = (DataParameter)Class9570.field41430.method22630();
    }
}
