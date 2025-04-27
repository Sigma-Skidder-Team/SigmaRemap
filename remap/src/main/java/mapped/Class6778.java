// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.client.renderer.Vector3f;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.util.math.AxisAlignedBB;

import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Random;

public class Class6778
{
    private static final float field26609 = 1.0E-6f;
    private static final Random field26610;
    
    public static Class6313 method20685(final String s, final int n) {
        return method20686(Config.method29001().method6346(s), n);
    }
    
    public static Class6313 method20686(final TextureAtlasSprite class1912, final int n) {
        final ArrayList list = new ArrayList();
        final Direction[] field524 = Direction.VALUES;
        final HashMap hashMap = new HashMap();
        for (int i = 0; i < field524.length; ++i) {
            final Direction class1913 = field524[i];
            final ArrayList list2 = new ArrayList();
            list2.add(method20688(class1913, class1912, n));
            hashMap.put(class1913, list2);
        }
        return new Class6315(list, hashMap, true, true, true, class1912, Class7503.field29079, Class9168.field38839);
    }
    
    public static Class6313 method20687(final Class6313 class6313, final Class6313 class6314) {
        final ArrayList list = new ArrayList();
        list.addAll(class6313.method18691(null, null, Class6778.field26610));
        list.addAll(class6314.method18691(null, null, Class6778.field26610));
        final Direction[] field524 = Direction.VALUES;
        final HashMap hashMap = new HashMap();
        for (int i = 0; i < field524.length; ++i) {
            final Direction class6315 = field524[i];
            final ArrayList list2 = new ArrayList();
            list2.addAll(class6313.method18691(null, class6315, Class6778.field26610));
            list2.addAll(class6314.method18691(null, class6315, Class6778.field26610));
            hashMap.put(class6315, list2);
        }
        return new Class6315(list, hashMap, class6313.method18692(), class6313.method18695(), true, class6313.method18696(), class6313.method18697(), class6313.method18698());
    }
    
    public static Class8754 method20688(final Direction class179, final TextureAtlasSprite class180, final int n) {
        return new Class6225().method18519(new Vector3f(0.0f, 0.0f, 0.0f), new Vector3f(16.0f, 16.0f, 16.0f), new Class8111(class179, n, "#" + class179.getName(), new Class8435(new float[] { 0.0f, 0.0f, 16.0f, 16.0f }, 0)), class180, class179, Class2122.field12371, null, true, class180.method7503());
    }
    
    public static Class6313 method20689(final String s, final String s2, final String s3) {
        final Class1774 method29001 = Config.method29001();
        return method20690(s, method29001.method6346(s2), method29001.method6346(s3));
    }
    
    public static Class6313 method20690(final String s, final TextureAtlasSprite class1912, final TextureAtlasSprite class1913) {
        if (class1912 == null || class1913 == null) {
            return null;
        }
        final Class1790 method28860 = Config.method28860();
        if (method28860 == null) {
            return null;
        }
        final Class6313 method28861 = method28860.method6451(new Class1933(s, ""));
        if (method28861 != null && method28861 != method28860.method6452()) {
            final Class6313 method28862 = Class9058.method32621(method28861);
            final Direction[] field524 = Direction.VALUES;
            for (int i = 0; i < field524.length; ++i) {
                method20691(method28862.method18691(null, field524[i], Class6778.field26610), class1912, class1913);
            }
            method20691(method28862.method18691(null, null, Class6778.field26610), class1912, class1913);
            return method28862;
        }
        return null;
    }
    
    private static void method20691(final List<Class8754> list, final TextureAtlasSprite class1912, final TextureAtlasSprite class1913) {
        final ArrayList list2 = new ArrayList();
        for (Class8754 class1914 : list) {
            if (class1914.method30295() == class1912) {
                class1914 = new Class8755(class1914, class1913);
            }
            list2.add(class1914);
        }
        list.clear();
        list.addAll(list2);
    }
    
    public static void method20692(final Vector3f class9138) {
        class9138.set(method20693(class9138.getX()), method20693(class9138.getY()), method20693(class9138.getZ()));
    }
    
    private static float method20693(final float n) {
        if (n > -1.0E-6f && n < 1.0E-6f) {
            return 0.0f;
        }
        return (n > 0.999999f && n < 1.000001f) ? 1.0f : n;
    }
    
    public static AxisAlignedBB method20694(final AxisAlignedBB class6221, final Class2180 class6222, final BlockPos class6223) {
        final long n = (long)(class6223.getX() * 3129871L) ^ class6223.getZ() * 116129781L;
        final long n2 = n * n * 42317861L + n * 11L;
        final double n3 = ((n2 >> 16 & 0xFL) / 15.0f - 0.5) * 0.5;
        final double n4 = ((n2 >> 24 & 0xFL) / 15.0f - 0.5) * 0.5;
        double n5 = 0.0;
        if (class6222 == Class2180.field12915) {
            n5 = ((n2 >> 20 & 0xFL) / 15.0f - 1.0) * 0.2;
        }
        return class6221.offset(n3, n5, n4);
    }
    
    static {
        field26610 = new Random(0L);
    }
}
