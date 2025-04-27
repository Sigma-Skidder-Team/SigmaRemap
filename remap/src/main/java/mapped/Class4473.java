// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableSet;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.Direction;
import net.minecraft.world.IBlockReader;

import javax.annotation.Nullable;
import java.util.Random;
import java.util.List;
import java.util.Set;

public abstract class Class4473
{
    public static final BlockState field19848;
    public MutableBoundingBox field19849;
    private Direction field19850;
    private Class2181 field19851;
    private Class2052 field19852;
    public int field19853;
    private final Class9520 field19854;
    private static final Set<Block> field19855;
    
    public Class4473(final Class9520 field19854, final int field19855) {
        this.field19854 = field19854;
        this.field19853 = field19855;
    }
    
    public Class4473(final Class9520 class9520, final CompoundNBT class9521) {
        this(class9520, class9521.getInt("GD"));
        if (class9521.contains("BB")) {
            this.field19849 = new MutableBoundingBox(class9521.getIntArray("BB"));
        }
        final int method319 = class9521.getInt("O");
        this.method13456((method319 != -1) ? Direction.byHorizontalIndex(method319) : null);
    }
    
    public final CompoundNBT method13430() {
        final CompoundNBT class51 = new CompoundNBT();
        class51.putString("id", Registry.field231.getKey(this.method13458()).toString());
        class51.put("BB", this.field19849.toNBTTagIntArray());
        final Direction method13455 = this.method13455();
        class51.putInt("O", (method13455 != null) ? method13455.getHorizontalIndex() : -1);
        class51.putInt("GD", this.field19853);
        this.method13415(class51);
        return class51;
    }
    
    public abstract void method13415(final CompoundNBT p0);
    
    public void method13431(final Class4473 class4473, final List<Class4473> list, final Random random) {
    }
    
    public abstract boolean method13421(final Class1851 p0, final Class6346<?> p1, final Random p2, final MutableBoundingBox p3, final ChunkPos p4);
    
    public MutableBoundingBox method13432() {
        return this.field19849;
    }
    
    public int method13433() {
        return this.field19853;
    }
    
    public boolean method13434(final ChunkPos class7859, final int n) {
        final int n2 = class7859.field32290 << 4;
        final int n3 = class7859.field32291 << 4;
        return this.field19849.intersectsWith(n2 - n, n3 - n, n2 + 15 + n, n3 + 15 + n);
    }
    
    public static Class4473 method13435(final List<Class4473> list, final MutableBoundingBox class6997) {
        for (final Class4473 class6998 : list) {
            if (class6998.method13432() != null && class6998.method13432().intersectsWith(class6997)) {
                return class6998;
            }
        }
        return null;
    }
    
    public boolean method13436(final IBlockReader class1855, final MutableBoundingBox class1856) {
        final int max = Math.max(this.field19849.minX - 1, class1856.minX);
        final int max2 = Math.max(this.field19849.minY - 1, class1856.minY);
        final int max3 = Math.max(this.field19849.minZ - 1, class1856.minZ);
        final int min = Math.min(this.field19849.maxX + 1, class1856.maxX);
        final int min2 = Math.min(this.field19849.maxY + 1, class1856.maxY);
        final int min3 = Math.min(this.field19849.maxZ + 1, class1856.maxZ);
        final Mutable class1857 = new Mutable();
        for (int i = max; i <= min; ++i) {
            for (int j = max3; j <= min3; ++j) {
                if (class1855.getBlockState(class1857.setPos(i, max2, j)).getMaterial().method26438()) {
                    return true;
                }
                if (class1855.getBlockState(class1857.setPos(i, min2, j)).getMaterial().method26438()) {
                    return true;
                }
            }
        }
        for (int k = max; k <= min; ++k) {
            for (int l = max2; l <= min2; ++l) {
                if (class1855.getBlockState(class1857.setPos(k, l, max3)).getMaterial().method26438()) {
                    return true;
                }
                if (class1855.getBlockState(class1857.setPos(k, l, min3)).getMaterial().method26438()) {
                    return true;
                }
            }
        }
        for (int n = max3; n <= min3; ++n) {
            for (int n2 = max2; n2 <= min2; ++n2) {
                if (class1855.getBlockState(class1857.setPos(max, n2, n)).getMaterial().method26438()) {
                    return true;
                }
                if (class1855.getBlockState(class1857.setPos(min, n2, n)).getMaterial().method26438()) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public int method13437(final int n, final int n2) {
        final Direction method13455 = this.method13455();
        if (method13455 == null) {
            return n;
        }
        switch (Class8291.field34093[method13455.ordinal()]) {
            case 1:
            case 2: {
                return this.field19849.minX + n;
            }
            case 3: {
                return this.field19849.maxX - n2;
            }
            case 4: {
                return this.field19849.minX + n2;
            }
            default: {
                return n;
            }
        }
    }
    
    public int method13438(final int n) {
        return (this.method13455() != null) ? (n + this.field19849.minY) : n;
    }
    
    public int method13439(final int n, final int n2) {
        final Direction method13455 = this.method13455();
        if (method13455 == null) {
            return n2;
        }
        switch (Class8291.field34093[method13455.ordinal()]) {
            case 1: {
                return this.field19849.maxZ - n2;
            }
            case 2: {
                return this.field19849.minZ + n2;
            }
            case 3:
            case 4: {
                return this.field19849.minZ + n;
            }
            default: {
                return n2;
            }
        }
    }
    
    public void method13440(final Class1851 class1851, BlockState class1852, final int n, final int n2, final int n3, final MutableBoundingBox class1853) {
        final BlockPos class1854 = new BlockPos(this.method13437(n, n3), this.method13438(n2), this.method13439(n, n3));
        if (class1853.isVecInside(class1854)) {
            if (this.field19851 != Class2181.field12917) {
                class1852 = class1852.method21709(this.field19851);
            }
            if (this.field19852 != Class2052.field11707) {
                class1852 = class1852.method21708(this.field19852);
            }
            class1851.setBlockState(class1854, class1852, 2);
            final IFluidState method6702 = class1851.getFluidState(class1854);
            if (!method6702.isEmpty()) {
                class1851.method6834().method21345(class1854, method6702.getFluid(), 0);
            }
            if (Class4473.field19855.contains(class1852.getBlock())) {
                class1851.method6965(class1854).method7029(class1854);
            }
        }
    }
    
    public BlockState method13441(final IBlockReader class1855, final int n, final int n2, final int n3, final MutableBoundingBox class1856) {
        final BlockPos class1857 = new BlockPos(this.method13437(n, n3), this.method13438(n2), this.method13439(n, n3));
        return class1856.isVecInside(class1857) ? class1855.getBlockState(class1857) : Blocks.AIR.getDefaultState();
    }
    
    public boolean method13442(final Class1852 class1852, final int n, final int n2, final int n3, final MutableBoundingBox class1853) {
        final int method13437 = this.method13437(n, n3);
        final int method13438 = this.method13438(n2 + 1);
        final int method13439 = this.method13439(n, n3);
        return class1853.isVecInside(new BlockPos(method13437, method13438, method13439)) && method13438 < class1852.method6699(HeightmapType.field11523, method13437, method13439);
    }
    
    public void method13443(final Class1851 class1851, final MutableBoundingBox class1852, final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        for (int i = n2; i <= n5; ++i) {
            for (int j = n; j <= n4; ++j) {
                for (int k = n3; k <= n6; ++k) {
                    this.method13440(class1851, Blocks.AIR.getDefaultState(), j, i, k, class1852);
                }
            }
        }
    }
    
    public void method13444(final Class1851 class1851, final MutableBoundingBox class1852, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final BlockState class1853, final BlockState class1854, final boolean b) {
        for (int i = n2; i <= n5; ++i) {
            for (int j = n; j <= n4; ++j) {
                for (int k = n3; k <= n6; ++k) {
                    if (!b || !this.method13441(class1851, j, i, k, class1852).method21706()) {
                        if (i != n2) {
                            if (i != n5) {
                                if (j != n) {
                                    if (j != n4) {
                                        if (k != n3) {
                                            if (k != n6) {
                                                this.method13440(class1851, class1854, j, i, k, class1852);
                                                continue;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        this.method13440(class1851, class1853, j, i, k, class1852);
                    }
                }
            }
        }
    }
    
    public void method13445(final Class1851 class1851, final MutableBoundingBox class1852, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final boolean b, final Random random, final Class6863 class1853) {
        for (int i = n2; i <= n5; ++i) {
            for (int j = n; j <= n4; ++j) {
                for (int k = n3; k <= n6; ++k) {
                    if (!b || !this.method13441(class1851, j, i, k, class1852).method21706()) {
                        final int n7 = j;
                        final int n8 = i;
                        final int n9 = k;
                        boolean b2 = false;
                        Label_0163: {
                            if (i != n2) {
                                if (i != n5) {
                                    if (j != n) {
                                        if (j != n4) {
                                            if (k != n3) {
                                                if (k != n6) {
                                                    b2 = false;
                                                    break Label_0163;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            b2 = true;
                        }
                        class1853.method20976(random, n7, n8, n9, b2);
                        this.method13440(class1851, class1853.method20977(), j, i, k, class1852);
                    }
                }
            }
        }
    }
    
    public void method13446(final Class1851 class1851, final MutableBoundingBox class1852, final Random random, final float n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final BlockState class1853, final BlockState class1854, final boolean b, final boolean b2) {
        for (int i = n3; i <= n6; ++i) {
            for (int j = n2; j <= n5; ++j) {
                for (int k = n4; k <= n7; ++k) {
                    if (random.nextFloat() <= n) {
                        if (!b || !this.method13441(class1851, j, i, k, class1852).method21706()) {
                            if (!b2 || this.method13442(class1851, j, i, k, class1852)) {
                                if (i != n3) {
                                    if (i != n6) {
                                        if (j != n2) {
                                            if (j != n5) {
                                                if (k != n4) {
                                                    if (k != n7) {
                                                        this.method13440(class1851, class1854, j, i, k, class1852);
                                                        continue;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                this.method13440(class1851, class1853, j, i, k, class1852);
                            }
                        }
                    }
                }
            }
        }
    }
    
    public void method13447(final Class1851 class1851, final MutableBoundingBox class1852, final Random random, final float n, final int n2, final int n3, final int n4, final BlockState class1853) {
        if (random.nextFloat() < n) {
            this.method13440(class1851, class1853, n2, n3, n4, class1852);
        }
    }
    
    public void method13448(final Class1851 class1851, final MutableBoundingBox class1852, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final BlockState class1853, final boolean b) {
        final float n7 = (float)(n4 - n + 1);
        final float n8 = (float)(n5 - n2 + 1);
        final float n9 = (float)(n6 - n3 + 1);
        final float n10 = n + n7 / 2.0f;
        final float n11 = n3 + n9 / 2.0f;
        for (int i = n2; i <= n5; ++i) {
            final float n12 = (i - n2) / n8;
            for (int j = n; j <= n4; ++j) {
                final float n13 = (j - n10) / (n7 * 0.5f);
                for (int k = n3; k <= n6; ++k) {
                    final float n14 = (k - n11) / (n9 * 0.5f);
                    if (!b || !this.method13441(class1851, j, i, k, class1852).method21706()) {
                        if (n13 * n13 + n12 * n12 + n14 * n14 <= 1.05f) {
                            this.method13440(class1851, class1853, j, i, k, class1852);
                        }
                    }
                }
            }
        }
    }
    
    public void method13449(final Class1851 class1851, final BlockState class1852, final int n, final int n2, final int n3, final MutableBoundingBox class1853) {
        final int method13437 = this.method13437(n, n3);
        int method13438 = this.method13438(n2);
        final int method13439 = this.method13439(n, n3);
        if (class1853.isVecInside(new BlockPos(method13437, method13438, method13439))) {
            while (class1851.method6961(new BlockPos(method13437, method13438, method13439)) || class1851.getBlockState(new BlockPos(method13437, method13438, method13439)).getMaterial().method26438()) {
                if (method13438 <= 1) {
                    break;
                }
                class1851.setBlockState(new BlockPos(method13437, method13438, method13439), class1852, 2);
                --method13438;
            }
        }
    }
    
    public boolean method13450(final Class1851 class1851, final MutableBoundingBox class1852, final Random random, final int n, final int n2, final int n3, final ResourceLocation class1853) {
        return this.method13452(class1851, class1852, random, new BlockPos(this.method13437(n, n3), this.method13438(n2), this.method13439(n, n3)), class1853, null);
    }
    
    public static BlockState method13451(final IBlockReader class1855, final BlockPos class1856, final BlockState class1857) {
        Direction class1858 = null;
        for (final Direction class1859 : Plane.HORIZONTAL) {
            final BlockPos method1149 = class1856.method1149(class1859);
            final BlockState method1150 = class1855.getBlockState(method1149);
            if (method1150.getBlock() == Blocks.CHEST) {
                return class1857;
            }
            if (!method1150.isOpaqueCube(class1855, method1149)) {
                continue;
            }
            if (class1858 != null) {
                class1858 = null;
                break;
            }
            class1858 = class1859;
        }
        if (class1858 == null) {
            Direction class1860 = class1857.get(Class3892.field17564);
            BlockPos class1861 = class1856.method1149(class1860);
            if (class1855.getBlockState(class1861).isOpaqueCube(class1855, class1861)) {
                class1860 = class1860.getOpposite();
                class1861 = class1856.method1149(class1860);
            }
            if (class1855.getBlockState(class1861).isOpaqueCube(class1855, class1861)) {
                class1860 = class1860.rotateY();
                class1861 = class1856.method1149(class1860);
            }
            if (class1855.getBlockState(class1861).isOpaqueCube(class1855, class1861)) {
                class1860 = class1860.getOpposite();
                class1856.method1149(class1860);
            }
            return (BlockState)((StateHolder<Object, Object>)class1857).with((IProperty<Comparable>)Class3892.field17564, class1860);
        }
        return (BlockState)((StateHolder<Object, Object>)class1857).with((IProperty<Comparable>)Class3892.field17564, class1858.getOpposite());
    }
    
    public boolean method13452(final Class1851 class1851, final MutableBoundingBox class1852, final Random random, final BlockPos class1853, final ResourceLocation class1854, BlockState method13451) {
        if (class1852.isVecInside(class1853) && class1851.getBlockState(class1853).getBlock() != Blocks.CHEST) {
            if (method13451 == null) {
                method13451 = method13451(class1851, class1853, Blocks.CHEST.getDefaultState());
            }
            class1851.setBlockState(class1853, method13451, 2);
            final TileEntity method13452 = class1851.getTileEntity(class1853);
            if (method13452 instanceof Class475) {
                ((Class475)method13452).method2327(class1854, random.nextLong());
            }
            return true;
        }
        return false;
    }
    
    public boolean method13453(final Class1851 class1851, final MutableBoundingBox class1852, final Random random, final int n, final int n2, final int n3, final Direction class1853, final ResourceLocation class1854) {
        final BlockPos class1855 = new BlockPos(this.method13437(n, n3), this.method13438(n2), this.method13439(n, n3));
        if (class1852.isVecInside(class1855) && class1851.getBlockState(class1855).getBlock() != Blocks.field29216) {
            this.method13440(class1851, ((StateHolder<O, BlockState>) Blocks.field29216.getDefaultState()).with((IProperty<Comparable>)Class3955.field17859, class1853), n, n2, n3, class1852);
            final TileEntity method6727 = class1851.getTileEntity(class1855);
            if (method6727 instanceof Class458) {
                ((Class458)method6727).method2327(class1854, random.nextLong());
            }
            return true;
        }
        return false;
    }
    
    public void method13454(final int n, final int n2, final int n3) {
        this.field19849.offset(n, n2, n3);
    }
    
    @Nullable
    public Direction method13455() {
        return this.field19850;
    }
    
    public void method13456(final Direction field19850) {
        this.field19850 = field19850;
        if (field19850 == null) {
            this.field19852 = Class2052.field11707;
            this.field19851 = Class2181.field12917;
        }
        else {
            switch (Class8291.field34093[field19850.ordinal()]) {
                case 2: {
                    this.field19851 = Class2181.field12918;
                    this.field19852 = Class2052.field11707;
                    break;
                }
                case 3: {
                    this.field19851 = Class2181.field12918;
                    this.field19852 = Class2052.field11708;
                    break;
                }
                case 4: {
                    this.field19851 = Class2181.field12917;
                    this.field19852 = Class2052.field11708;
                    break;
                }
                default: {
                    this.field19851 = Class2181.field12917;
                    this.field19852 = Class2052.field11707;
                    break;
                }
            }
        }
    }
    
    public Class2052 method13457() {
        return this.field19852;
    }
    
    public Class9520 method13458() {
        return this.field19854;
    }
    
    static {
        field19848 = Blocks.CAVE_AIR.getDefaultState();
        field19855 = (Set)ImmutableSet.builder().add(Blocks.field29395).add(Blocks.TORCH).add(Blocks.WALL_TORCH).add(Blocks.field29336).add(Blocks.SPRUCE_FENCE).add(Blocks.DARK_OAK_FENCE).add(Blocks.ACACIA_FENCE).add(Blocks.BIRCH_FENCE).add(Blocks.JUNGLE_FENCE).add(Blocks.field29307).add(Blocks.field29381).build();
    }
}
