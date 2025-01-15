// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import net.minecraft.util.Direction;
import net.minecraft.world.World;

import java.util.Map;
import java.util.Set;

public class Class4074 extends Class4072
{
    private static String[] field18173;
    private static final Set<Class3833> field18174;
    public static final Map<Class3833, Class7096> field18175;
    
    public Class4074(final Class2038 class2038, final float n, final float n2, final Class8959 class2039) {
        super(n, n2, class2038, Class4074.field18174, class2039);
    }
    
    @Override
    public boolean method11713(final Class7096 class7096) {
        final Class3833 method21696 = class7096.method21696();
        return method21696 == Class7521.field29329 || method21696 == Class7521.field29331;
    }
    
    @Override
    public Class2201 method11694(final Class7075 class7075) {
        final World method21654 = class7075.method21654();
        final BlockPos method21655 = class7075.method21639();
        final Class7096 method21656 = method21654.method6701(method21655);
        if (class7075.method21648() == Direction.DOWN) {
            return Class2201.field13402;
        }
        final Class512 method21657 = class7075.method21652();
        final Class7096 class7076 = Class4074.field18175.get(method21656.method21696());
        Class7096 class7077 = null;
        if (class7076 != null && method21654.method6701(method21655.method1137()).method21706()) {
            method21654.method6705(method21657, method21655, Class8520.field35547, Class286.field1582, 1.0f, 1.0f);
            class7077 = class7076;
        }
        else if (method21656.method21696() instanceof Class3918) {
            if (((Class7097<Object, Class7096>)method21656).method21772((Class7111<Boolean>)Class3918.field17760)) {
                method21654.method6839(null, 1009, method21655, 0);
                class7077 = ((Class7097<Object, Class7096>)method21656).method21773((Class7111<Comparable>)Class3918.field17760, false);
            }
        }
        if (class7077 == null) {
            return Class2201.field13402;
        }
        if (!method21654.field10067) {
            method21654.method6688(method21655, class7077, 11);
            if (method21657 != null) {
                class7075.method21651().method27636(1, method21657, class7079 -> class7079.method2795(class7078.method21653()));
            }
        }
        return Class2201.field13400;
    }
    
    static {
        field18174 = Sets.newHashSet((Object[])new Class3833[] { Class7521.field29333, Class7521.field29156, Class7521.field29157, Class7521.field29158, Class7521.field29298, Class7521.field29155, Class7521.field29177, Class7521.field29392, Class7521.field29175, Class7521.field29176, Class7521.field29331, Class7521.field29329, Class7521.field29339, Class7521.field29637, Class7521.field29697, Class7521.field29698, Class7521.field29699, Class7521.field29700, Class7521.field29701, Class7521.field29702, Class7521.field29703, Class7521.field29704, Class7521.field29705, Class7521.field29706, Class7521.field29707, Class7521.field29708, Class7521.field29709, Class7521.field29710, Class7521.field29711, Class7521.field29712 });
        field18175 = Maps.newHashMap((Map)ImmutableMap.of((Object)Class7521.field29155, (Object)Class7521.field29637.method11878()));
    }
}
