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
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public abstract class Class7257 extends Fluid
{
    public static final Class7113 field28132;
    public static final Class7112 field28133;
    private static final ThreadLocal<Object2ByteLinkedOpenHashMap<Class8266>> field28134;
    private final Map<IFluidState, VoxelShape> field28135;
    
    public Class7257() {
        this.field28135 = Maps.newIdentityHashMap();
    }
    
    @Override
    public void method22145(final Class9500<Fluid, IFluidState> class9500) {
        class9500.method35378(Class7257.field28132);
    }
    
    @Override
    public Vec3d getFlow(final IBlockReader class1855, final BlockPos class1856, final IFluidState class1857) {
        double n = 0.0;
        double n2 = 0.0;
        Vec3d method1302;
        try (final Class386 method1296 = Class386.method1296()) {
            for (final Direction class1858 : Plane.HORIZONTAL) {
                method1296.method1303(class1856).method1304(class1858);
                final IFluidState method1297 = class1855.getFluidState(method1296);
                if (this.method22168(method1297)) {
                    final float method1298 = method1297.getHeight();
                    float n3 = 0.0f;
                    if (method1298 == 0.0f) {
                        if (!class1855.getBlockState(method1296).getMaterial().method26440()) {
                            final IFluidState method1299 = class1855.getFluidState(method1296.method1139());
                            if (this.method22168(method1299)) {
                                final float method1300 = method1299.getHeight();
                                if (method1300 > 0.0f) {
                                    n3 = class1857.getHeight() - (method1300 - 0.8888889f);
                                }
                            }
                        }
                    }
                    else if (method1298 > 0.0f) {
                        n3 = class1857.getHeight() - method1298;
                    }
                    if (n3 == 0.0f) {
                        continue;
                    }
                    n += class1858.getXOffset() * n3;
                    n2 += class1858.getZOffset() * n3;
                }
            }
            Vec3d method1301 = new Vec3d(n, 0.0, n2);
            if (class1857.get((IProperty<Boolean>)Class7257.field28132)) {
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
    
    private boolean method22168(final IFluidState IFluidState) {
        return IFluidState.isEmpty() || IFluidState.getFluid().isEquivalentTo(this);
    }
    
    public boolean method22169(final IBlockReader class1855, final BlockPos class1856, final Direction class1857) {
        final BlockState method6701 = class1855.getBlockState(class1856);
        return !class1855.getFluidState(class1856).getFluid().isEquivalentTo(this) && (class1857 == Direction.UP || (method6701.getMaterial() != Material.ICE && method6701.isSolidSide(class1855, class1856, class1857)));
    }
    
    public void method22170(final Class1851 class1851, final BlockPos class1852, final IFluidState class1853) {
        if (!class1853.isEmpty()) {
            final BlockState method6701 = class1851.getBlockState(class1852);
            final BlockPos method6702 = class1852.method1139();
            final BlockState method6703 = class1851.getBlockState(method6702);
            final IFluidState method6704 = this.method22172(class1851, method6702, method6703);
            if (!this.method22190(class1851, class1852, method6701, Direction.DOWN, method6702, method6703, class1851.getFluidState(method6702), method6704.getFluid())) {
                if (class1853.isSource() || !this.method22183(class1851, method6704.getFluid(), class1852, method6701, method6702, method6703)) {
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
    
    private void method22171(final Class1851 class1851, final BlockPos class1852, final IFluidState class1853, final BlockState class1854) {
        int n = class1853.getLevel() - this.method22191(class1851);
        if (class1853.get((IProperty<Boolean>)Class7257.field28132)) {
            n = 7;
        }
        if (n > 0) {
            for (final Map.Entry<Direction, V> entry : this.method22188(class1851, class1852, class1854).entrySet()) {
                final Direction class1855 = entry.getKey();
                final IFluidState class1856 = (IFluidState)entry.getValue();
                final BlockPos method1149 = class1852.method1149(class1855);
                final BlockState method1150 = class1851.getBlockState(method1149);
                if (!this.method22190(class1851, class1852, class1854, class1855, method1149, method1150, class1851.getFluidState(method1149), class1856.getFluid())) {
                    continue;
                }
                this.method22179(class1851, method1149, method1150, class1855, class1856);
            }
        }
    }
    
    public IFluidState method22172(final Class1852 class1852, final BlockPos class1853, final BlockState class1854) {
        int max = 0;
        int n = 0;
        for (final Direction class1855 : Plane.HORIZONTAL) {
            final BlockPos method1149 = class1853.method1149(class1855);
            final BlockState method1150 = class1852.getBlockState(method1149);
            final IFluidState method1151 = method1150.getFluidState();
            if (!method1151.getFluid().isEquivalentTo(this)) {
                continue;
            }
            if (!this.method22173(class1855, class1852, class1853, class1854, method1149, method1150)) {
                continue;
            }
            if (method1151.isSource()) {
                ++n;
            }
            max = Math.max(max, method1151.getLevel());
        }
        if (this.method22178()) {
            if (n >= 2) {
                final BlockState method1152 = class1852.getBlockState(class1853.method1139());
                final IFluidState method1153 = method1152.getFluidState();
                if (method1152.getMaterial().method26439() || this.method22185(method1153)) {
                    return this.method22177(false);
                }
            }
        }
        final BlockPos method1154 = class1853.method1137();
        final BlockState method1155 = class1852.getBlockState(method1154);
        final IFluidState method1156 = method1155.getFluidState();
        if (!method1156.isEmpty()) {
            if (method1156.getFluid().isEquivalentTo(this)) {
                if (this.method22173(Direction.UP, class1852, class1853, class1854, method1154, method1155)) {
                    return this.method22175(8, true);
                }
            }
        }
        final int n2 = max - this.method22191(class1852);
        return (n2 > 0) ? this.method22175(n2, false) : Class7558.field29974.getDefaultState();
    }
    
    private boolean method22173(final Direction class179, final IBlockReader class180, final BlockPos class181, final BlockState class182, final BlockPos class183, final BlockState class184) {
        Object2ByteLinkedOpenHashMap object2ByteLinkedOpenHashMap;
        if (!class182.getBlock().method11882() && !class184.getBlock().method11882()) {
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
        final boolean b = !VoxelShapes.method24504(class182.getCollisionShape(class180, class181), class184.getCollisionShape(class180, class183), class179);
        if (object2ByteLinkedOpenHashMap != null) {
            if (object2ByteLinkedOpenHashMap.size() == 200) {
                object2ByteLinkedOpenHashMap.removeLastByte();
            }
            object2ByteLinkedOpenHashMap.putAndMoveToFirst(o, (byte)(byte)(b ? 1 : 0));
        }
        return b;
    }
    
    public abstract Fluid method22174();
    
    public IFluidState method22175(final int i, final boolean b) {
        return this.method22174().getDefaultState().with((IProperty<Comparable>)Class7257.field28133, i).with((IProperty<Comparable>)Class7257.field28132, b);
    }
    
    public abstract Fluid method22176();
    
    public IFluidState method22177(final boolean b) {
        return this.method22176().getDefaultState().with((IProperty<Comparable>)Class7257.field28132, b);
    }
    
    public abstract boolean method22178();
    
    public void method22179(final Class1851 class1851, final BlockPos class1852, final BlockState class1853, final Direction class1854, final IFluidState class1855) {
        if (!(class1853.getBlock() instanceof Class3867)) {
            if (!class1853.method21706()) {
                this.method22180(class1851, class1852, class1853);
            }
            class1851.setBlockState(class1852, class1855.getBlockState(), 3);
        }
        else {
            ((Class3867)class1853.getBlock()).method11921(class1851, class1852, class1853, class1855);
        }
    }
    
    public abstract void method22180(final Class1851 p0, final BlockPos p1, final BlockState p2);
    
    private static short method22181(final BlockPos class354, final BlockPos class355) {
        return (short)((class355.getX() - class354.getX() + 128 & 0xFF) << 8 | (class355.getZ() - class354.getZ() + 128 & 0xFF));
    }
    
    public int method22182(final Class1852 class1852, final BlockPos class1853, final int n, final Direction class1854, final BlockState class1855, final BlockPos class1856, final Short2ObjectMap<Pair<BlockState, IFluidState>> short2ObjectMap, final Short2BooleanMap short2BooleanMap) {
        int n2 = 1000;
        for (final Direction class1857 : Plane.HORIZONTAL) {
            if (class1857 == class1854) {
                continue;
            }
            final BlockPos method1149 = class1853.method1149(class1857);
            final short method1150 = method22181(class1856, method1149);
            final Pair pair = (Pair)short2ObjectMap.computeIfAbsent(method1150, p2 -> {
                class1859.method6701(class1860);
                final BlockState class1861;
                return Pair.of((Object)class1861, (Object)class1861.getFluidState());
            });
            final BlockState class1858 = (BlockState)pair.getFirst();
            if (!this.method22184(class1852, this.method22174(), class1853, class1855, class1857, method1149, class1858, (IFluidState)pair.getSecond())) {
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
    
    private boolean method22183(final IBlockReader class1855, final Fluid class1856, final BlockPos class1857, final BlockState class1858, final BlockPos class1859, final BlockState class1860) {
        return this.method22173(Direction.DOWN, class1855, class1857, class1858, class1859, class1860) && (class1860.getFluidState().getFluid().isEquivalentTo(this) || this.method22189(class1855, class1859, class1860, class1856));
    }
    
    private boolean method22184(final IBlockReader class1855, final Fluid class1856, final BlockPos class1857, final BlockState class1858, final Direction class1859, final BlockPos class1860, final BlockState class1861, final IFluidState class1862) {
        if (!this.method22185(class1862)) {
            if (this.method22173(class1859, class1855, class1857, class1858, class1860, class1861)) {
                if (this.method22189(class1855, class1860, class1861, class1856)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private boolean method22185(final IFluidState IFluidState) {
        return IFluidState.getFluid().isEquivalentTo(this) && IFluidState.isSource();
    }
    
    public abstract int method22186(final Class1852 p0);
    
    private int method22187(final Class1852 class1852, final BlockPos class1853) {
        int n = 0;
        final Iterator<Direction> iterator = Plane.HORIZONTAL.iterator();
        while (iterator.hasNext()) {
            if (!this.method22185(class1852.getFluidState(class1853.method1149(iterator.next())))) {
                continue;
            }
            ++n;
        }
        return n;
    }
    
    public Map<Direction, IFluidState> method22188(final Class1852 class1852, final BlockPos class1853, final BlockState class1854) {
        int n = 1000;
        final EnumMap enumMap = Maps.newEnumMap((Class) Direction.class);
        final Short2ObjectOpenHashMap short2ObjectOpenHashMap = new Short2ObjectOpenHashMap();
        final Short2BooleanOpenHashMap short2BooleanOpenHashMap = new Short2BooleanOpenHashMap();
        for (final Direction class1855 : Plane.HORIZONTAL) {
            final BlockPos class1865 = class1853.method1149(class1855);
            final short method1150 = method22181(class1853, class1865);
            final Pair pair = (Pair)((Short2ObjectMap)short2ObjectOpenHashMap).computeIfAbsent(method1150, p2 -> {
                class1858.method6701(class1859);
                final BlockState class1860;
                return Pair.of((Object)class1860, (Object)class1860.getFluidState());
            });
            final BlockState class1856 = (BlockState)pair.getFirst();
            final IFluidState class1857 = (IFluidState)pair.getSecond();
            final IFluidState method1151 = this.method22172(class1852, class1865, class1856);
            if (!this.method22184(class1852, method1151.getFluid(), class1853, class1854, class1855, class1865, class1856, class1857)) {
                continue;
            }
            int method1152;
            if (!((Short2BooleanMap)short2BooleanOpenHashMap).computeIfAbsent(method1150, p4 -> {
                final BlockPos class1865;
                class1865.method1139();
                return this.method22183(class1861, this.method22174(), class1863, class1864, class1862, class1861.method6701(class1862));
            })) {
                method1152 = this.method22182(class1852, class1865, 1, class1855.getOpposite(), class1856, class1853, (Short2ObjectMap<Pair<BlockState, IFluidState>>)short2ObjectOpenHashMap, (Short2BooleanMap)short2BooleanOpenHashMap);
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
    
    private boolean method22189(final IBlockReader class1855, final BlockPos class1856, final BlockState class1857, final Fluid class1858) {
        final Block method21696 = class1857.getBlock();
        if (!(method21696 instanceof Class3867)) {
            if (!(method21696 instanceof Class3969)) {
                if (!method21696.method11785(Class7188.field27928)) {
                    if (method21696 != Class7521.field29307) {
                        if (method21696 != Class7521.field29334) {
                            if (method21696 != Class7521.field29765) {
                                final Material method21697 = class1857.getMaterial();
                                if (method21697 != Material.PORTAL) {
                                    if (method21697 != Material.STRUCTURE_VOID) {
                                        if (method21697 != Material.OCEAN_PLANT) {
                                            if (method21697 != Material.SEA_GRASS) {
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
    
    public boolean method22190(final IBlockReader class1855, final BlockPos class1856, final BlockState class1857, final Direction class1858, final BlockPos class1859, final BlockState class1860, final IFluidState class1861, final Fluid class1862) {
        if (class1861.canDisplace(class1855, class1859, class1862, class1858)) {
            if (this.method22173(class1858, class1855, class1856, class1857, class1859, class1860)) {
                if (this.method22189(class1855, class1859, class1860, class1862)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public abstract int method22191(final Class1852 p0);
    
    public int method22192(final World class1847, final BlockPos class1848, final IFluidState class1849, final IFluidState class1850) {
        return this.method22156(class1847);
    }
    
    @Override
    public void tick(final World class1847, final BlockPos class1848, IFluidState obj) {
        if (!obj.isSource()) {
            final IFluidState method22172 = this.method22172(class1847, class1848, class1847.getBlockState(class1848));
            final int method22173 = this.method22192(class1847, class1848, obj, method22172);
            if (!method22172.isEmpty()) {
                if (!method22172.equals(obj)) {
                    obj = method22172;
                    final BlockState method22174 = method22172.getBlockState();
                    class1847.setBlockState(class1848, method22174, 2);
                    class1847.method6834().method21345(class1848, method22172.getFluid(), method22173);
                    class1847.method6696(class1848, method22174.getBlock());
                }
            }
            else {
                obj = method22172;
                class1847.setBlockState(class1848, Class7521.field29147.getDefaultState(), 3);
            }
        }
        this.method22170(class1847, class1848, obj);
    }
    
    public static int method22193(final IFluidState IFluidState) {
        return IFluidState.isSource() ? 0 : (8 - Math.min(IFluidState.getLevel(), 8) + (IFluidState.get((IProperty<Boolean>)Class7257.field28132) ? 8 : 0));
    }
    
    private static boolean method22194(final IFluidState IFluidState, final IBlockReader class7100, final BlockPos class7101) {
        return IFluidState.getFluid().isEquivalentTo(class7100.getFluidState(class7101.method1137()).getFluid());
    }
    
    @Override
    public float getActualHeight(final IFluidState IFluidState, final IBlockReader class7100, final BlockPos class7101) {
        return method22194(IFluidState, class7100, class7101) ? 1.0f : IFluidState.getHeight();
    }
    
    @Override
    public float getHeight(final IFluidState IFluidState) {
        return IFluidState.getLevel() / 9.0f;
    }
    
    @Override
    public VoxelShape method22167(final IFluidState key, final IBlockReader class1855, final BlockPos class1856) {
        return (key.getLevel() == 9 && method22194(key, class1855, class1856)) ? VoxelShapes.fullCube() : this.field28135.computeIfAbsent(key, class1859 -> VoxelShapes.method24488(0.0, 0.0, 0.0, 1.0, class1859.getActualHeight(class1857, class1858), 1.0));
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
