// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.EnumMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanMap;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.shorts.Short2ObjectMap;
import java.util.Iterator;
import com.google.common.collect.Maps;
import java.util.Map;
import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
import net.minecraft.util.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public abstract class Class7257 extends Class7255
{
    public static final Class7113 field28132;
    public static final Class7112 field28133;
    private static final ThreadLocal<Object2ByteLinkedOpenHashMap<Class8266>> field28134;
    private final Map<Class7099, Class7702> field28135;
    
    public Class7257() {
        this.field28135 = Maps.newIdentityHashMap();
    }
    
    @Override
    public void method22145(final Class9500<Class7255, Class7099> class9500) {
        class9500.method35378(Class7257.field28132);
    }
    
    @Override
    public Vec3d method22155(final Class1855 class1855, final BlockPos class1856, final Class7099 class1857) {
        double n = 0.0;
        double n2 = 0.0;
        Vec3d method1302;
        try (final Class386 method1296 = Class386.method1296()) {
            for (final Direction class1858 : Plane.HORIZONTAL) {
                method1296.method1303(class1856).method1304(class1858);
                final Class7099 method1297 = class1855.method6702(method1296);
                if (this.method22168(method1297)) {
                    final float method1298 = method1297.method21783();
                    float n3 = 0.0f;
                    if (method1298 == 0.0f) {
                        if (!class1855.method6701(method1296).method21697().method26440()) {
                            final Class7099 method1299 = class1855.method6702(method1296.method1139());
                            if (this.method22168(method1299)) {
                                final float method1300 = method1299.method21783();
                                if (method1300 > 0.0f) {
                                    n3 = class1857.method21783() - (method1300 - 0.8888889f);
                                }
                            }
                        }
                    }
                    else if (method1298 > 0.0f) {
                        n3 = class1857.method21783() - method1298;
                    }
                    if (n3 == 0.0f) {
                        continue;
                    }
                    n += class1858.getXOffset() * n3;
                    n2 += class1858.getZOffset() * n3;
                }
            }
            Vec3d method1301 = new Vec3d(n, 0.0, n2);
            if (class1857.method21772((Class7111<Boolean>)Class7257.field28132)) {
                for (final Direction class1859 : Plane.HORIZONTAL) {
                    method1296.method1303(class1856).method1304(class1859);
                    if (this.method22169(class1855, method1296, class1859) || this.method22169(class1855, method1296.method1137(), class1859)) {
                        method1301 = method1301.normalize().add(0.0, -6.0, 0.0);
                        break;
                    }
                }
            }
            method1302 = method1301.normalize();
        }
        return method1302;
    }
    
    private boolean method22168(final Class7099 class7099) {
        return class7099.method21781() || class7099.method21779().method22165(this);
    }
    
    public boolean method22169(final Class1855 class1855, final BlockPos class1856, final Direction class1857) {
        final Class7096 method6701 = class1855.method6701(class1856);
        return !class1855.method6702(class1856).method21779().method22165(this) && (class1857 == Direction.UP || (method6701.method21697() != Class8059.field33183 && method6701.method21761(class1855, class1856, class1857)));
    }
    
    public void method22170(final Class1851 class1851, final BlockPos class1852, final Class7099 class1853) {
        if (!class1853.method21781()) {
            final Class7096 method6701 = class1851.method6701(class1852);
            final BlockPos method6702 = class1852.method1139();
            final Class7096 method6703 = class1851.method6701(method6702);
            final Class7099 method6704 = this.method22172(class1851, method6702, method6703);
            if (!this.method22190(class1851, class1852, method6701, Direction.DOWN, method6702, method6703, class1851.method6702(method6702), method6704.method21779())) {
                if (class1853.method21780() || !this.method22183(class1851, method6704.method21779(), class1852, method6701, method6702, method6703)) {
                    this.method22171(class1851, class1852, class1853, method6701);
                }
            }
            else {
                this.method22179(class1851, method6702, method6703, Direction.DOWN, method6704);
                if (this.method22187(class1851, class1852) >= 3) {
                    this.method22171(class1851, class1852, class1853, method6701);
                }
            }
        }
    }
    
    private void method22171(final Class1851 class1851, final BlockPos class1852, final Class7099 class1853, final Class7096 class1854) {
        int n = class1853.method21784() - this.method22191(class1851);
        if (class1853.method21772((Class7111<Boolean>)Class7257.field28132)) {
            n = 7;
        }
        if (n > 0) {
            for (final Map.Entry<Direction, V> entry : this.method22188(class1851, class1852, class1854).entrySet()) {
                final Direction class1855 = entry.getKey();
                final Class7099 class1856 = (Class7099)entry.getValue();
                final BlockPos method1149 = class1852.method1149(class1855);
                final Class7096 method1150 = class1851.method6701(method1149);
                if (!this.method22190(class1851, class1852, class1854, class1855, method1149, method1150, class1851.method6702(method1149), class1856.method21779())) {
                    continue;
                }
                this.method22179(class1851, method1149, method1150, class1855, class1856);
            }
        }
    }
    
    public Class7099 method22172(final Class1852 class1852, final BlockPos class1853, final Class7096 class1854) {
        int max = 0;
        int n = 0;
        for (final Direction class1855 : Plane.HORIZONTAL) {
            final BlockPos method1149 = class1853.method1149(class1855);
            final Class7096 method1150 = class1852.method6701(method1149);
            final Class7099 method1151 = method1150.method21756();
            if (!method1151.method21779().method22165(this)) {
                continue;
            }
            if (!this.method22173(class1855, class1852, class1853, class1854, method1149, method1150)) {
                continue;
            }
            if (method1151.method21780()) {
                ++n;
            }
            max = Math.max(max, method1151.method21784());
        }
        if (this.method22178()) {
            if (n >= 2) {
                final Class7096 method1152 = class1852.method6701(class1853.method1139());
                final Class7099 method1153 = method1152.method21756();
                if (method1152.method21697().method26439() || this.method22185(method1153)) {
                    return this.method22177(false);
                }
            }
        }
        final BlockPos method1154 = class1853.method1137();
        final Class7096 method1155 = class1852.method6701(method1154);
        final Class7099 method1156 = method1155.method21756();
        if (!method1156.method21781()) {
            if (method1156.method21779().method22165(this)) {
                if (this.method22173(Direction.UP, class1852, class1853, class1854, method1154, method1155)) {
                    return this.method22175(8, true);
                }
            }
        }
        final int n2 = max - this.method22191(class1852);
        return (n2 > 0) ? this.method22175(n2, false) : Class7558.field29974.method22148();
    }
    
    private boolean method22173(final Direction class179, final Class1855 class180, final BlockPos class181, final Class7096 class182, final BlockPos class183, final Class7096 class184) {
        Object2ByteLinkedOpenHashMap object2ByteLinkedOpenHashMap;
        if (!class182.method21696().method11882() && !class184.method21696().method11882()) {
            object2ByteLinkedOpenHashMap = Class7257.field28134.get();
        }
        else {
            object2ByteLinkedOpenHashMap = null;
        }
        Object o;
        if (object2ByteLinkedOpenHashMap == null) {
            o = null;
        }
        else {
            o = new Class8266(class182, class184, class179);
            final byte andMoveToFirst = object2ByteLinkedOpenHashMap.getAndMoveToFirst(o);
            if (andMoveToFirst != 127) {
                return andMoveToFirst != 0;
            }
        }
        final boolean b = !Class7698.method24504(class182.method21727(class180, class181), class184.method21727(class180, class183), class179);
        if (object2ByteLinkedOpenHashMap != null) {
            if (object2ByteLinkedOpenHashMap.size() == 200) {
                object2ByteLinkedOpenHashMap.removeLastByte();
            }
            object2ByteLinkedOpenHashMap.putAndMoveToFirst(o, (byte)(byte)(b ? 1 : 0));
        }
        return b;
    }
    
    public abstract Class7255 method22174();
    
    public Class7099 method22175(final int i, final boolean b) {
        return this.method22174().method22148().method21773((Class7111<Comparable>)Class7257.field28133, i).method21773((Class7111<Comparable>)Class7257.field28132, b);
    }
    
    public abstract Class7255 method22176();
    
    public Class7099 method22177(final boolean b) {
        return this.method22176().method22148().method21773((Class7111<Comparable>)Class7257.field28132, b);
    }
    
    public abstract boolean method22178();
    
    public void method22179(final Class1851 class1851, final BlockPos class1852, final Class7096 class1853, final Direction class1854, final Class7099 class1855) {
        if (!(class1853.method21696() instanceof Class3867)) {
            if (!class1853.method21706()) {
                this.method22180(class1851, class1852, class1853);
            }
            class1851.method6688(class1852, class1855.method21791(), 3);
        }
        else {
            ((Class3867)class1853.method21696()).method11921(class1851, class1852, class1853, class1855);
        }
    }
    
    public abstract void method22180(final Class1851 p0, final BlockPos p1, final Class7096 p2);
    
    private static short method22181(final BlockPos class354, final BlockPos class355) {
        return (short)((class355.getX() - class354.getX() + 128 & 0xFF) << 8 | (class355.getZ() - class354.getZ() + 128 & 0xFF));
    }
    
    public int method22182(final Class1852 class1852, final BlockPos class1853, final int n, final Direction class1854, final Class7096 class1855, final BlockPos class1856, final Short2ObjectMap<Pair<Class7096, Class7099>> short2ObjectMap, final Short2BooleanMap short2BooleanMap) {
        int n2 = 1000;
        for (final Direction class1857 : Plane.HORIZONTAL) {
            if (class1857 == class1854) {
                continue;
            }
            final BlockPos method1149 = class1853.method1149(class1857);
            final short method1150 = method22181(class1856, method1149);
            final Pair pair = (Pair)short2ObjectMap.computeIfAbsent(method1150, p2 -> {
                class1859.method6701(class1860);
                final Class7096 class1861;
                return Pair.of((Object)class1861, (Object)class1861.method21756());
            });
            final Class7096 class1858 = (Class7096)pair.getFirst();
            if (!this.method22184(class1852, this.method22174(), class1853, class1855, class1857, method1149, class1858, (Class7099)pair.getSecond())) {
                continue;
            }
            if (short2BooleanMap.computeIfAbsent(method1150, p3 -> {
                class1862.method1139();
                final BlockPos class1865;
                return this.method22183(class1863, this.method22174(), class1862, class1864, class1865, class1863.method6701(class1865));
            })) {
                return n;
            }
            if (n >= this.method22186(class1852)) {
                continue;
            }
            final int method1151 = this.method22182(class1852, method1149, n + 1, class1857.getOpposite(), class1858, class1856, short2ObjectMap, short2BooleanMap);
            if (method1151 >= n2) {
                continue;
            }
            n2 = method1151;
        }
        return n2;
    }
    
    private boolean method22183(final Class1855 class1855, final Class7255 class1856, final BlockPos class1857, final Class7096 class1858, final BlockPos class1859, final Class7096 class1860) {
        return this.method22173(Direction.DOWN, class1855, class1857, class1858, class1859, class1860) && (class1860.method21756().method21779().method22165(this) || this.method22189(class1855, class1859, class1860, class1856));
    }
    
    private boolean method22184(final Class1855 class1855, final Class7255 class1856, final BlockPos class1857, final Class7096 class1858, final Direction class1859, final BlockPos class1860, final Class7096 class1861, final Class7099 class1862) {
        if (!this.method22185(class1862)) {
            if (this.method22173(class1859, class1855, class1857, class1858, class1860, class1861)) {
                if (this.method22189(class1855, class1860, class1861, class1856)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private boolean method22185(final Class7099 class7099) {
        return class7099.method21779().method22165(this) && class7099.method21780();
    }
    
    public abstract int method22186(final Class1852 p0);
    
    private int method22187(final Class1852 class1852, final BlockPos class1853) {
        int n = 0;
        final Iterator<Direction> iterator = Plane.HORIZONTAL.iterator();
        while (iterator.hasNext()) {
            if (!this.method22185(class1852.method6702(class1853.method1149(iterator.next())))) {
                continue;
            }
            ++n;
        }
        return n;
    }
    
    public Map<Direction, Class7099> method22188(final Class1852 class1852, final BlockPos class1853, final Class7096 class1854) {
        int n = 1000;
        final EnumMap enumMap = Maps.newEnumMap((Class) Direction.class);
        final Short2ObjectOpenHashMap short2ObjectOpenHashMap = new Short2ObjectOpenHashMap();
        final Short2BooleanOpenHashMap short2BooleanOpenHashMap = new Short2BooleanOpenHashMap();
        for (final Direction class1855 : Plane.HORIZONTAL) {
            final BlockPos class1865 = class1853.method1149(class1855);
            final short method1150 = method22181(class1853, class1865);
            final Pair pair = (Pair)((Short2ObjectMap)short2ObjectOpenHashMap).computeIfAbsent(method1150, p2 -> {
                class1858.method6701(class1859);
                final Class7096 class1860;
                return Pair.of((Object)class1860, (Object)class1860.method21756());
            });
            final Class7096 class1856 = (Class7096)pair.getFirst();
            final Class7099 class1857 = (Class7099)pair.getSecond();
            final Class7099 method1151 = this.method22172(class1852, class1865, class1856);
            if (!this.method22184(class1852, method1151.method21779(), class1853, class1854, class1855, class1865, class1856, class1857)) {
                continue;
            }
            int method1152;
            if (!((Short2BooleanMap)short2BooleanOpenHashMap).computeIfAbsent(method1150, p4 -> {
                final BlockPos class1865;
                class1865.method1139();
                return this.method22183(class1861, this.method22174(), class1863, class1864, class1862, class1861.method6701(class1862));
            })) {
                method1152 = this.method22182(class1852, class1865, 1, class1855.getOpposite(), class1856, class1853, (Short2ObjectMap<Pair<Class7096, Class7099>>)short2ObjectOpenHashMap, (Short2BooleanMap)short2BooleanOpenHashMap);
            }
            else {
                method1152 = 0;
            }
            if (method1152 < n) {
                enumMap.clear();
            }
            if (method1152 > n) {
                continue;
            }
            enumMap.put((Object)class1855, method1151);
            n = method1152;
        }
        return enumMap;
    }
    
    private boolean method22189(final Class1855 class1855, final BlockPos class1856, final Class7096 class1857, final Class7255 class1858) {
        final Class3833 method21696 = class1857.method21696();
        if (!(method21696 instanceof Class3867)) {
            if (!(method21696 instanceof Class3969)) {
                if (!method21696.method11785(Class7188.field27928)) {
                    if (method21696 != Class7521.field29307) {
                        if (method21696 != Class7521.field29334) {
                            if (method21696 != Class7521.field29765) {
                                final Class8059 method21697 = class1857.method21697();
                                if (method21697 != Class8059.field33155) {
                                    if (method21697 != Class8059.field33154) {
                                        if (method21697 != Class8059.field33158) {
                                            if (method21697 != Class8059.field33160) {
                                                return !method21697.method26440();
                                            }
                                        }
                                    }
                                }
                                return false;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return ((Class3867)method21696).method11920(class1855, class1856, class1857, class1858);
    }
    
    public boolean method22190(final Class1855 class1855, final BlockPos class1856, final Class7096 class1857, final Direction class1858, final BlockPos class1859, final Class7096 class1860, final Class7099 class1861, final Class7255 class1862) {
        if (class1861.method21795(class1855, class1859, class1862, class1858)) {
            if (this.method22173(class1858, class1855, class1856, class1857, class1859, class1860)) {
                if (this.method22189(class1855, class1859, class1860, class1862)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public abstract int method22191(final Class1852 p0);
    
    public int method22192(final World class1847, final BlockPos class1848, final Class7099 class1849, final Class7099 class1850) {
        return this.method22156(class1847);
    }
    
    @Override
    public void method22151(final World class1847, final BlockPos class1848, Class7099 obj) {
        if (!obj.method21780()) {
            final Class7099 method22172 = this.method22172(class1847, class1848, class1847.method6701(class1848));
            final int method22173 = this.method22192(class1847, class1848, obj, method22172);
            if (!method22172.method21781()) {
                if (!method22172.equals(obj)) {
                    obj = method22172;
                    final Class7096 method22174 = method22172.method21791();
                    class1847.method6688(class1848, method22174, 2);
                    class1847.method6834().method21345(class1848, method22172.method21779(), method22173);
                    class1847.method6696(class1848, method22174.method21696());
                }
            }
            else {
                obj = method22172;
                class1847.method6688(class1848, Class7521.field29147.method11878(), 3);
            }
        }
        this.method22170(class1847, class1848, obj);
    }
    
    public static int method22193(final Class7099 class7099) {
        return class7099.method21780() ? 0 : (8 - Math.min(class7099.method21784(), 8) + (class7099.method21772((Class7111<Boolean>)Class7257.field28132) ? 8 : 0));
    }
    
    private static boolean method22194(final Class7099 class7099, final Class1855 class7100, final BlockPos class7101) {
        return class7099.method21779().method22165(class7100.method6702(class7101.method1137()).method21779());
    }
    
    @Override
    public float method22160(final Class7099 class7099, final Class1855 class7100, final BlockPos class7101) {
        return method22194(class7099, class7100, class7101) ? 1.0f : class7099.method21783();
    }
    
    @Override
    public float method22161(final Class7099 class7099) {
        return class7099.method21784() / 9.0f;
    }
    
    @Override
    public Class7702 method22167(final Class7099 key, final Class1855 class1855, final BlockPos class1856) {
        return (key.method21784() == 9 && method22194(key, class1855, class1856)) ? Class7698.method24487() : this.field28135.computeIfAbsent(key, class1859 -> Class7698.method24488(0.0, 0.0, 0.0, 1.0, class1859.method21782(class1857, class1858), 1.0));
    }
    
    static {
        field28132 = Class8970.field37727;
        field28133 = Class8970.field37784;
        field28134 = ThreadLocal.withInitial(() -> {
            final Class2269 class2269 = new Class2269(200);
            class2269.defaultReturnValue((byte)127);
            return class2269;
        });
    }
}
