// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.AbstractList;
import java.util.Comparator;
import java.util.Optional;
import com.mojang.datafixers.util.Pair;
import java.util.Iterator;
import java.util.ArrayList;

import com.google.common.collect.Lists;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.nbt.IntNBT;
import net.minecraft.util2.Direction;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import java.util.List;

public class Class6585
{
    private final List<List<Class9038>> field26124;
    private final List<Class7682> field26125;
    private BlockPos field26126;
    private String field26127;
    
    public Class6585() {
        this.field26124 = Lists.newArrayList();
        this.field26125 = Lists.newArrayList();
        this.field26126 = BlockPos.ZERO;
        this.field26127 = "?";
    }
    
    public BlockPos method19945() {
        return this.field26126;
    }
    
    public void method19946(final String field26127) {
        this.field26127 = field26127;
    }
    
    public String method19947() {
        return this.field26127;
    }
    
    public void method19948(final World class1847, final BlockPos class1848, final BlockPos field26126, final boolean b, final Block class1849) {
        if (field26126.getX() >= 1) {
            if (field26126.getY() >= 1) {
                if (field26126.getZ() >= 1) {
                    final BlockPos method1134 = class1848.add(field26126).add(-1, -1, -1);
                    final ArrayList arrayList = Lists.newArrayList();
                    final ArrayList arrayList2 = Lists.newArrayList();
                    final ArrayList arrayList3 = Lists.newArrayList();
                    final BlockPos class1850 = new BlockPos(Math.min(class1848.getX(), method1134.getX()), Math.min(class1848.getY(), method1134.getY()), Math.min(class1848.getZ(), method1134.getZ()));
                    final BlockPos class1851 = new BlockPos(Math.max(class1848.getX(), method1134.getX()), Math.max(class1848.getY(), method1134.getY()), Math.max(class1848.getZ(), method1134.getZ()));
                    this.field26126 = field26126;
                    for (final BlockPos class1852 : BlockPos.getAllInBoxMutable(class1850, class1851)) {
                        final BlockPos method1135 = class1852.method1136(class1850);
                        final BlockState method1136 = class1847.getBlockState(class1852);
                        if (class1849 != null && class1849 == method1136.getBlock()) {
                            continue;
                        }
                        final TileEntity method1137 = class1847.getTileEntity(class1852);
                        if (method1137 == null) {
                            if (!method1136.isOpaqueCube(class1847, class1852) && !method1136.isCollisionShapeOpaque(class1847, class1852)) {
                                arrayList3.add(new Class9038(method1135, method1136, null));
                            }
                            else {
                                arrayList.add(new Class9038(method1135, method1136, null));
                            }
                        }
                        else {
                            final Class51 method1138 = method1137.method2180(new Class51());
                            method1138.method330("x");
                            method1138.method330("y");
                            method1138.method330("z");
                            arrayList2.add(new Class9038(method1135, method1136, method1138));
                        }
                    }
                    final ArrayList arrayList4 = Lists.newArrayList();
                    arrayList4.addAll(arrayList);
                    arrayList4.addAll(arrayList2);
                    arrayList4.addAll(arrayList3);
                    this.field26124.clear();
                    this.field26124.add(arrayList4);
                    if (!b) {
                        this.field26125.clear();
                    }
                    else {
                        this.method19949(class1847, class1850, class1851.add(1, 1, 1));
                    }
                }
            }
        }
    }
    
    private void method19949(final World class1847, final BlockPos class1848, final BlockPos class1849) {
        final List<Entity> method6739 = class1847.method6739((Class<? extends Entity>) Entity.class, new AxisAlignedBB(class1848, class1849), class1853 -> !(class1853 instanceof PlayerEntity));
        this.field26125.clear();
        for (final Entity class1850 : method6739) {
            final Vec3d class1851 = new Vec3d(class1850.getPosX() - class1848.getX(), class1850.getPosY() - class1848.getY(), class1850.getPosZ() - class1848.getZ());
            final Class51 class1852 = new Class51();
            class1850.method1755(class1852);
            BlockPos method6740;
            if (!(class1850 instanceof Class861)) {
                method6740 = new BlockPos(class1851);
            }
            else {
                method6740 = ((Class861)class1850).method5194().method1136(class1848);
            }
            this.field26125.add(new Class7682(class1851, method6740, class1852));
        }
    }
    
    public List<Class9038> method19950(final BlockPos class354, final Class9092 class355, final Block class356) {
        return this.method19951(class354, class355, class356, true);
    }
    
    public List<Class9038> method19951(final BlockPos class354, final Class9092 class355, final Block class356, final boolean b) {
        final ArrayList arrayList = Lists.newArrayList();
        final MutableBoundingBox method32860 = class355.method32860();
        for (final Class9038 class357 : class355.method32865(this.field26124, class354)) {
            final BlockPos class358 = b ? method19953(class355, class357.field38248).add(class354) : class357.field38248;
            if (method32860 != null && !method32860.isVecInside(class358)) {
                continue;
            }
            final BlockState field38249 = class357.field38249;
            if (field38249.getBlock() != class356) {
                continue;
            }
            arrayList.add(new Class9038(class358, field38249.method21708(class355.method32856()), class357.field38250));
        }
        return arrayList;
    }
    
    public BlockPos method19952(final Class9092 class9092, final BlockPos class9093, final Class9092 class9094, final BlockPos class9095) {
        return method19953(class9092, class9093).method1136(method19953(class9094, class9095));
    }
    
    public static BlockPos method19953(final Class9092 class9092, final BlockPos class9093) {
        return method19962(class9093, class9092.method32855(), class9092.method32856(), class9092.method32857());
    }
    
    public void method19954(final Class1851 class1851, final BlockPos class1852, final Class9092 class1853) {
        class1853.method32863();
        this.method19955(class1851, class1852, class1853);
    }
    
    public void method19955(final Class1851 class1851, final BlockPos class1852, final Class9092 class1853) {
        this.method19956(class1851, class1852, class1853, 2);
    }
    
    public boolean method19956(final Class1851 class1851, final BlockPos class1852, final Class9092 class1853, final int n) {
        if (!this.field26124.isEmpty()) {
            final List<Class9038> method32865 = class1853.method32865(this.field26124, class1852);
            if (method32865.isEmpty()) {
                if (class1853.method32859()) {
                    return false;
                }
                if (this.field26125.isEmpty()) {
                    return false;
                }
            }
            if (this.field26126.getX() >= 1) {
                if (this.field26126.getY() >= 1) {
                    if (this.field26126.getZ() >= 1) {
                        final MutableBoundingBox method32866 = class1853.method32860();
                        final ArrayList arrayListWithCapacity = Lists.newArrayListWithCapacity(class1853.method32864() ? method32865.size() : 0);
                        final ArrayList arrayListWithCapacity2 = Lists.newArrayListWithCapacity(method32865.size());
                        int min = Integer.MAX_VALUE;
                        int min2 = Integer.MAX_VALUE;
                        int min3 = Integer.MAX_VALUE;
                        int max = Integer.MIN_VALUE;
                        int max2 = Integer.MIN_VALUE;
                        int max3 = Integer.MIN_VALUE;
                        for (final Class9038 class1854 : method19958(class1851, class1852, class1853, method32865)) {
                            final BlockPos field38248 = class1854.field38248;
                            if (method32866 != null && !method32866.isVecInside(field38248)) {
                                continue;
                            }
                            final IFluidState class1855 = class1853.method32864() ? class1851.getFluidState(field38248) : null;
                            final BlockState method32867 = class1854.field38249.method21709(class1853.method32855()).method21708(class1853.method32856());
                            if (class1854.field38250 != null) {
                                Class447.method2267(class1851.getTileEntity(field38248));
                                class1851.setBlockState(field38248, Class7521.field29517.getDefaultState(), 20);
                            }
                            if (!class1851.setBlockState(field38248, method32867, n)) {
                                continue;
                            }
                            min = Math.min(min, field38248.getX());
                            min2 = Math.min(min2, field38248.getY());
                            min3 = Math.min(min3, field38248.getZ());
                            max = Math.max(max, field38248.getX());
                            max2 = Math.max(max2, field38248.getY());
                            max3 = Math.max(max3, field38248.getZ());
                            arrayListWithCapacity2.add(Pair.of((Object)field38248, (Object)class1854.field38250));
                            if (class1854.field38250 != null) {
                                final TileEntity method32868 = class1851.getTileEntity(field38248);
                                if (method32868 != null) {
                                    class1854.field38250.method298("x", field38248.getX());
                                    class1854.field38250.method298("y", field38248.getY());
                                    class1854.field38250.method298("z", field38248.getZ());
                                    method32868.method2179(class1854.field38250);
                                    method32868.method2205(class1853.method32855());
                                    method32868.method2204(class1853.method32856());
                                }
                            }
                            if (class1855 == null) {
                                continue;
                            }
                            if (!(method32867.getBlock() instanceof Class3867)) {
                                continue;
                            }
                            ((Class3867)method32867.getBlock()).method11921(class1851, field38248, method32867, class1855);
                            if (class1855.isSource()) {
                                continue;
                            }
                            arrayListWithCapacity.add(field38248);
                        }
                        int n2 = 1;
                        final Direction[] array = { Direction.UP, Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST};
                        while (n2 != 0 && !arrayListWithCapacity.isEmpty()) {
                            n2 = 0;
                            final Iterator iterator2 = arrayListWithCapacity.iterator();
                            while (iterator2.hasNext()) {
                                BlockPos class1857;
                                final BlockPos class1856 = class1857 = (BlockPos)iterator2.next();
                                IFluidState method32869 = class1851.getFluidState(class1856);
                                for (int n3 = 0; n3 < array.length && !method32869.isSource(); ++n3) {
                                    final BlockPos method32870 = class1857.method1149(array[n3]);
                                    final IFluidState method32871 = class1851.getFluidState(method32870);
                                    if (method32871.getActualHeight(class1851, method32870) <= method32869.getActualHeight(class1851, class1857)) {
                                        if (!method32871.isSource()) {
                                            continue;
                                        }
                                        if (method32869.isSource()) {
                                            continue;
                                        }
                                    }
                                    method32869 = method32871;
                                    class1857 = method32870;
                                }
                                if (!method32869.isSource()) {
                                    continue;
                                }
                                final BlockState method32872 = class1851.getBlockState(class1856);
                                final Block method32873 = method32872.getBlock();
                                if (!(method32873 instanceof Class3867)) {
                                    continue;
                                }
                                ((Class3867)method32873).method11921(class1851, class1856, method32872, method32869);
                                n2 = 1;
                                iterator2.remove();
                            }
                        }
                        if (min <= max) {
                            if (!class1853.method32861()) {
                                final BitSetVoxelShapePart class1858 = new BitSetVoxelShapePart(max - min + 1, max2 - min2 + 1, max3 - min3 + 1);
                                final int n4 = min;
                                final int n5 = min2;
                                final int n6 = min3;
                                final Iterator iterator3 = arrayListWithCapacity2.iterator();
                                while (iterator3.hasNext()) {
                                    final BlockPos class1859 = (BlockPos)((Pair)iterator3.next()).getFirst();
                                    class1858.setFilled(class1859.getX() - n4, class1859.getY() - n5, class1859.getZ() - n6, true, true);
                                }
                                method19957(class1851, n, class1858, n4, n5, n6);
                            }
                            for (final Pair pair : arrayListWithCapacity2) {
                                final BlockPos class1860 = (BlockPos)pair.getFirst();
                                if (!class1853.method32861()) {
                                    final BlockState method32874 = class1851.getBlockState(class1860);
                                    final BlockState method32875 = Block.method11786(method32874, class1851, class1860);
                                    if (method32874 != method32875) {
                                        class1851.setBlockState(class1860, method32875, (n & 0xFFFFFFFE) | 0x10);
                                    }
                                    class1851.method6694(class1860, method32875.getBlock());
                                }
                                if (pair.getSecond() == null) {
                                    continue;
                                }
                                final TileEntity method32876 = class1851.getTileEntity(class1860);
                                if (method32876 == null) {
                                    continue;
                                }
                                method32876.method2161();
                            }
                        }
                        if (!class1853.method32859()) {
                            this.method19959(class1851, class1852, class1853.method32855(), class1853.method32856(), class1853.method32857(), method32866);
                        }
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }
    
    public static void method19957(final Class1851 class1851, final int n, final VoxelShapePart class1852, final int n2, final int n3, final int n4) {
        class1852.method27438((class1852, n5, n6, n7) -> {
            final BlockPos class1853 = new BlockPos(n2 + n5, n3 + n6, n4 + n7);
            final BlockPos method1149 = class1853.method1149(class1852);
            final BlockState method1150 = class1851.getBlockState(class1853);
            final BlockState method1151 = class1851.getBlockState(method1149);
            final BlockState method1152 = method1150.method21748(class1852, method1151, class1851, class1853, method1149);
            if (method1150 != method1152) {
                class1851.setBlockState(class1853, method1152, (n & 0xFFFFFFFE) | 0x10);
            }
            final BlockState method1153 = method1151.method21748(class1852.getOpposite(), method1152, class1851, method1149, class1853);
            if (method1151 != method1153) {
                class1851.setBlockState(method1149, method1153, (n & 0xFFFFFFFE) | 0x10);
            }
        });
    }
    
    public static List<Class9038> method19958(final Class1851 class1851, final BlockPos class1852, final Class9092 class1853, final List<Class9038> list) {
        final ArrayList arrayList = Lists.newArrayList();
        for (final Class9038 class1854 : list) {
            Class9038 method12350 = new Class9038(method19953(class1853, class1854.field38248).add(class1852), class1854.field38249, class1854.field38250);
            for (Iterator<Class4107> iterator2 = class1853.method32862().iterator(); method12350 != null && iterator2.hasNext(); method12350 = iterator2.next().method12350(class1851, class1852, class1854, method12350, class1853)) {}
            if (method12350 == null) {
                continue;
            }
            arrayList.add(method12350);
        }
        return arrayList;
    }
    
    private void method19959(final Class1851 class1851, final BlockPos class1852, final Class2181 class1853, final Class2052 class1854, final BlockPos class1855, final MutableBoundingBox class1856) {
        for (final Class7682 class1857 : this.field26125) {
            final BlockPos method1135 = method19962(class1857.field30511, class1853, class1854, class1855).add(class1852);
            if (class1856 != null && !class1856.isVecInside(method1135)) {
                continue;
            }
            final Class51 field30512 = class1857.field30512;
            final Vec3d method1136 = method19963(class1857.field30510, class1853, class1854, class1855).add(class1852.getX(), class1852.getY(), class1852.getZ());
            final Class52 class1858 = new Class52();
            ((AbstractList<Class44>)class1858).add(Class44.method277(method1136.x));
            ((AbstractList<Class44>)class1858).add(Class44.method277(method1136.y));
            ((AbstractList<Class44>)class1858).add(Class44.method277(method1136.z));
            field30512.method295("Pos", class1858);
            field30512.method330("UUIDMost");
            field30512.method330("UUIDLeast");
            method19960(class1851, field30512).ifPresent(class1863 -> {
                class1863.method1730(class1861.field22770, class1861.field22771, class1861.field22772, class1863.method1904(class1859) + (class1863.rotationYaw - class1863.method1903(class1860)), class1863.rotationPitch);
                class1862.method6886(class1863);
            });
        }
    }
    
    private static Optional<Entity> method19960(final Class1851 class1851, final Class51 class1852) {
        try {
            return EntityType.method23373(class1852, class1851.method6744());
        }
        catch (final Exception ex) {
            return Optional.empty();
        }
    }
    
    public BlockPos method19961(final Class2052 class2052) {
        switch (Class9249.field39662[class2052.ordinal()]) {
            case 1:
            case 2: {
                return new BlockPos(this.field26126.getZ(), this.field26126.getY(), this.field26126.getX());
            }
            default: {
                return this.field26126;
            }
        }
    }
    
    public static BlockPos method19962(final BlockPos class354, final Class2181 class355, final Class2052 class356, final BlockPos class357) {
        int method1074 = class354.getX();
        final int method1075 = class354.getY();
        int method1076 = class354.getZ();
        boolean b = true;
        switch (Class9249.field39663[class355.ordinal()]) {
            case 1: {
                method1076 = -method1076;
                break;
            }
            case 2: {
                method1074 = -method1074;
                break;
            }
            default: {
                b = false;
                break;
            }
        }
        final int method1077 = class357.getX();
        final int method1078 = class357.getZ();
        switch (Class9249.field39662[class356.ordinal()]) {
            case 1: {
                return new BlockPos(method1077 - method1078 + method1076, method1075, method1077 + method1078 - method1074);
            }
            case 2: {
                return new BlockPos(method1077 + method1078 - method1076, method1075, method1078 - method1077 + method1074);
            }
            case 3: {
                return new BlockPos(method1077 + method1077 - method1074, method1075, method1078 + method1078 - method1076);
            }
            default: {
                return b ? new BlockPos(method1074, method1075, method1076) : class354;
            }
        }
    }
    
    private static Vec3d method19963(final Vec3d class5487, final Class2181 class5488, final Class2052 class5489, final BlockPos class5490) {
        double field22770 = class5487.x;
        final double field22771 = class5487.y;
        double field22772 = class5487.z;
        boolean b = true;
        switch (Class9249.field39663[class5488.ordinal()]) {
            case 1: {
                field22772 = 1.0 - field22772;
                break;
            }
            case 2: {
                field22770 = 1.0 - field22770;
                break;
            }
            default: {
                b = false;
                break;
            }
        }
        final int method1074 = class5490.getX();
        final int method1075 = class5490.getZ();
        switch (Class9249.field39662[class5489.ordinal()]) {
            case 1: {
                return new Vec3d(method1074 - method1075 + field22772, field22771, method1074 + method1075 + 1 - field22770);
            }
            case 2: {
                return new Vec3d(method1074 + method1075 + 1 - field22772, field22771, method1075 - method1074 + field22770);
            }
            case 3: {
                return new Vec3d(method1074 + method1074 + 1 - field22770, field22771, method1075 + method1075 + 1 - field22772);
            }
            default: {
                return b ? new Vec3d(field22770, field22771, field22772) : class5487;
            }
        }
    }
    
    public BlockPos method19964(final BlockPos class354, final Class2181 class355, final Class2052 class356) {
        return method19965(class354, class355, class356, this.method19945().getX(), this.method19945().getZ());
    }
    
    public static BlockPos method19965(final BlockPos class354, final Class2181 class355, final Class2052 class356, int n, int n2) {
        --n;
        --n2;
        final int n3 = (class355 == Class2181.field12919) ? n : 0;
        final int n4 = (class355 == Class2181.field12918) ? n2 : 0;
        BlockPos class357 = class354;
        switch (Class9249.field39662[class356.ordinal()]) {
            case 1: {
                class357 = class354.add(n4, 0, n - n3);
                break;
            }
            case 2: {
                class357 = class354.add(n2 - n4, 0, n3);
                break;
            }
            case 3: {
                class357 = class354.add(n - n3, 0, n2 - n4);
                break;
            }
            case 4: {
                class357 = class354.add(n3, 0, n4);
                break;
            }
        }
        return class357;
    }
    
    public MutableBoundingBox method19966(final Class9092 class9092, final BlockPos class9093) {
        final Class2052 method32856 = class9092.method32856();
        final BlockPos method32857 = class9092.method32857();
        final BlockPos method32858 = this.method19961(method32856);
        final Class2181 method32859 = class9092.method32855();
        final int method32860 = method32857.getX();
        final int method32861 = method32857.getZ();
        final int n = method32858.getX() - 1;
        final int n2 = method32858.getY() - 1;
        final int n3 = method32858.getZ() - 1;
        MutableBoundingBox class9094 = new MutableBoundingBox(0, 0, 0, 0, 0, 0);
        switch (Class9249.field39662[method32856.ordinal()]) {
            case 1: {
                class9094 = new MutableBoundingBox(method32860 - method32861, 0, method32860 + method32861 - n3, method32860 - method32861 + n, n2, method32860 + method32861);
                break;
            }
            case 2: {
                class9094 = new MutableBoundingBox(method32860 + method32861 - n, 0, method32861 - method32860, method32860 + method32861, n2, method32861 - method32860 + n3);
                break;
            }
            case 3: {
                class9094 = new MutableBoundingBox(method32860 + method32860 - n, 0, method32861 + method32861 - n3, method32860 + method32860, n2, method32861 + method32861);
                break;
            }
            case 4: {
                class9094 = new MutableBoundingBox(0, 0, 0, n, n2, n3);
                break;
            }
        }
        switch (Class9249.field39663[method32859.ordinal()]) {
            case 1: {
                this.method19967(method32856, n3, n, class9094, Direction.NORTH, Direction.SOUTH);
                break;
            }
            case 2: {
                this.method19967(method32856, n, n3, class9094, Direction.WEST, Direction.EAST);
                break;
            }
        }
        class9094.offset(class9093.getX(), class9093.getY(), class9093.getZ());
        return class9094;
    }
    
    private void method19967(final Class2052 class2052, final int n, final int n2, final MutableBoundingBox class2053, final Direction class2054, final Direction class2055) {
        final BlockPos field2173 = BlockPos.ZERO;
        BlockPos class2056;
        if (class2052 != Class2052.field11708 && class2052 != Class2052.field11710) {
            if (class2052 != Class2052.field11709) {
                class2056 = field2173.method1150(class2054, n);
            }
            else {
                class2056 = field2173.method1150(class2055, n);
            }
        }
        else {
            class2056 = field2173.method1150(class2052.method8142(class2054), n2);
        }
        class2053.offset(class2056.getX(), 0, class2056.getZ());
    }
    
    public Class51 method19968(final Class51 class51) {
        if (!this.field26124.isEmpty()) {
            final ArrayList arrayList = Lists.newArrayList();
            final Class2249 class52 = new Class2249(null);
            arrayList.add(class52);
            for (int i = 1; i < this.field26124.size(); ++i) {
                arrayList.add(new Class2249(null));
            }
            final Class52 class53 = new Class52();
            final List list = this.field26124.get(0);
            for (int j = 0; j < list.size(); ++j) {
                final Class9038 class54 = (Class9038)list.get(j);
                final Class51 e = new Class51();
                e.method295("pos", this.method19971(class54.field38248.getX(), class54.field38248.getY(), class54.field38248.getZ()));
                final int method8452 = class52.method8452(class54.field38249);
                e.method298("state", method8452);
                if (class54.field38250 != null) {
                    e.method295("nbt", class54.field38250);
                }
                ((AbstractList<Class51>)class53).add(e);
                for (int k = 1; k < this.field26124.size(); ++k) {
                    ((Class2249)arrayList.get(k)).method8454(this.field26124.get(k).get(j).field38249, method8452);
                }
            }
            class51.method295("blocks", class53);
            if (arrayList.size() != 1) {
                final Class52 class55 = new Class52();
                for (final Class2249 class56 : arrayList) {
                    final Class52 e2 = new Class52();
                    final Iterator<BlockState> iterator2 = class56.iterator();
                    while (iterator2.hasNext()) {
                        ((AbstractList<Class51>)e2).add(Class9346.method34649(iterator2.next()));
                    }
                    ((AbstractList<Class52>)class55).add(e2);
                }
                class51.method295("palettes", class55);
            }
            else {
                final Class52 class57 = new Class52();
                final Iterator<BlockState> iterator3 = class52.iterator();
                while (iterator3.hasNext()) {
                    ((AbstractList<Class51>)class57).add(Class9346.method34649(iterator3.next()));
                }
                class51.method295("palette", class57);
            }
        }
        else {
            class51.method295("blocks", new Class52());
            class51.method295("palette", new Class52());
        }
        final Class52 class58 = new Class52();
        for (final Class7682 class59 : this.field26125) {
            final Class51 e3 = new Class51();
            e3.method295("pos", this.method19972(class59.field30510.x, class59.field30510.y, class59.field30510.z));
            e3.method295("blockPos", this.method19971(class59.field30511.getX(), class59.field30511.getY(), class59.field30511.getZ()));
            if (class59.field30512 != null) {
                e3.method295("nbt", class59.field30512);
            }
            ((AbstractList<Class51>)class58).add(e3);
        }
        class51.method295("entities", class58);
        class51.method295("size", this.method19971(this.field26126.getX(), this.field26126.getY(), this.field26126.getZ()));
        class51.method298("DataVersion", Class9528.method35579().getWorldVersion());
        return class51;
    }
    
    public void method19969(final Class51 class51) {
        this.field26124.clear();
        this.field26125.clear();
        final Class52 method328 = class51.method328("size", 3);
        this.field26126 = new BlockPos(method328.method349(0), method328.method349(1), method328.method349(2));
        final Class52 method329 = class51.method328("blocks", 10);
        if (!class51.method316("palettes", 9)) {
            this.method19970(class51.method328("palette", 10), method329);
        }
        else {
            final Class52 method330 = class51.method328("palettes", 9);
            for (int i = 0; i < method330.size(); ++i) {
                this.method19970(method330.method347(i), method329);
            }
        }
        final Class52 method331 = class51.method328("entities", 10);
        for (int j = 0; j < method331.size(); ++j) {
            final Class51 method332 = method331.method346(j);
            final Class52 method333 = method332.method328("pos", 6);
            final Vec3d class52 = new Vec3d(method333.method351(0), method333.method351(1), method333.method351(2));
            final Class52 method334 = method332.method328("blockPos", 3);
            final BlockPos class53 = new BlockPos(method334.method349(0), method334.method349(1), method334.method349(2));
            if (method332.method315("nbt")) {
                this.field26125.add(new Class7682(class52, class53, method332.method327("nbt")));
            }
        }
    }
    
    private void method19970(final Class52 class52, final Class52 class53) {
        final Class2249 class54 = new Class2249(null);
        final ArrayList arrayList = Lists.newArrayList();
        for (int i = 0; i < class52.size(); ++i) {
            class54.method8454(Class9346.method34647(class52.method346(i)), i);
        }
        for (int j = 0; j < class53.size(); ++j) {
            final Class51 method346 = class53.method346(j);
            final Class52 method347 = method346.method328("pos", 3);
            final BlockPos class55 = new BlockPos(method347.method349(0), method347.method349(1), method347.method349(2));
            final BlockState method348 = class54.method8453(method346.method319("state"));
            Class51 method349;
            if (!method346.method315("nbt")) {
                method349 = null;
            }
            else {
                method349 = method346.method327("nbt");
            }
            arrayList.add(new Class9038(class55, method348, method349));
        }
        arrayList.sort(Comparator.comparingInt(class56 -> class56.field38248.method1075()));
        this.field26124.add(arrayList);
    }
    
    private Class52 method19971(final int... array) {
        final Class52 class52 = new Class52();
        for (int length = array.length, i = 0; i < length; ++i) {
            ((AbstractList<IntNBT>)class52).add(IntNBT.valueOf(array[i]));
        }
        return class52;
    }
    
    private Class52 method19972(final double... array) {
        final Class52 class52 = new Class52();
        for (int length = array.length, i = 0; i < length; ++i) {
            ((AbstractList<Class44>)class52).add(Class44.method277(array[i]));
        }
        return class52;
    }
}
