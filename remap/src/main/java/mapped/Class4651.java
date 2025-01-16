// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.EnumSet;
import javax.annotation.Nullable;
import java.util.HashSet;
import com.google.common.collect.Sets;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

public class Class4651 extends Class4654
{
    private static String[] field20136;
    public float field20137;
    
    @Override
    public void method13900(final Class1854 class1854, final Class759 class1855) {
        super.method13900(class1854, class1855);
        this.field20137 = class1855.method4144(Class257.field1211);
    }
    
    @Override
    public void method13901() {
        this.field20141.method4145(Class257.field1211, this.field20137);
        super.method13901();
    }
    
    @Override
    public Class6772 method13902() {
        int n = 0;
        Label_0263: {
            if (this.method13927() && this.field20141.method1706()) {
                n = MathHelper.floor(this.field20141.getPosY());
                final Mutable class385 = new Mutable(this.field20141.getPosX(), n, this.field20141.getPosZ());
                for (BlockState class386 = this.field20140.getBlockState(class385); class386.getBlock() == Blocks.field29173 || class386.getFluidState() == Class7558.field29976.method22177(false); class386 = this.field20140.getBlockState(class385)) {
                    ++n;
                    class385.method1286(this.field20141.getPosX(), n, this.field20141.getPosZ());
                }
                --n;
            }
            else {
                if (!this.field20141.onGround) {
                    while (true) {
                        for (BlockPos method1139 = new BlockPos(this.field20141); this.field20140.getBlockState(method1139).method21706() || this.field20140.getBlockState(method1139).method21749(this.field20140, method1139, Class2084.field12051); method1139 = method1139.method1139()) {
                            if (method1139.getY() <= 0) {
                                n = method1139.method1137().getY();
                                break Label_0263;
                            }
                        }
                        continue;
                    }
                }
                n = MathHelper.floor(this.field20141.getPosY() + 0.5);
            }
        }
        final BlockPos class387 = new BlockPos(this.field20141);
        if (this.field20141.method4144(this.method13912(this.field20141, class387.getX(), n, class387.getZ())) < 0.0f) {
            final HashSet hashSet = Sets.newHashSet();
            hashSet.add(new BlockPos(this.field20141.getBoundingBox().minX, n, this.field20141.getBoundingBox().minZ));
            hashSet.add(new BlockPos(this.field20141.getBoundingBox().minX, n, this.field20141.getBoundingBox().maxZ));
            hashSet.add(new BlockPos(this.field20141.getBoundingBox().maxX, n, this.field20141.getBoundingBox().minZ));
            hashSet.add(new BlockPos(this.field20141.getBoundingBox().maxX, n, this.field20141.getBoundingBox().maxZ));
            for (final BlockPos class388 : hashSet) {
                if (this.field20141.method4144(this.method13911(this.field20141, class388)) < 0.0f) {
                    continue;
                }
                return this.method13919(class388.getX(), class388.getY(), class388.getZ());
            }
        }
        return this.method13919(class387.getX(), n, class387.getZ());
    }
    
    @Override
    public Class6773 method13903(final double n, final double n2, final double n3) {
        return new Class6773(this.method13919(MathHelper.floor(n), MathHelper.floor(n2), MathHelper.floor(n3)));
    }
    
    @Override
    public int method13904(final Class6772[] array, final Class6772 class6772) {
        int n = 0;
        int method35642 = 0;
        if (this.field20141.method4144(this.method13912(this.field20141, class6772.field26589, class6772.field26590 + 1, class6772.field26591)) >= 0.0f) {
            if (this.method13912(this.field20141, class6772.field26589, class6772.field26590, class6772.field26591) != Class257.field1225) {
                method35642 = MathHelper.method35642(Math.max(1.0f, this.field20141.stepHeight));
            }
            else {
                method35642 = 0;
            }
        }
        final double method35643 = method13906(this.field20140, new BlockPos(class6772.field26589, class6772.field26590, class6772.field26591));
        final Class6772 method35644 = this.method13907(class6772.field26589, class6772.field26590, class6772.field26591 + 1, method35642, method35643, Direction.SOUTH);
        if (method35644 != null) {
            if (!method35644.field26598) {
                if (method35644.field26600 >= 0.0f) {
                    array[n++] = method35644;
                }
            }
        }
        final Class6772 method35645 = this.method13907(class6772.field26589 - 1, class6772.field26590, class6772.field26591, method35642, method35643, Direction.WEST);
        if (method35645 != null) {
            if (!method35645.field26598) {
                if (method35645.field26600 >= 0.0f) {
                    array[n++] = method35645;
                }
            }
        }
        final Class6772 method35646 = this.method13907(class6772.field26589 + 1, class6772.field26590, class6772.field26591, method35642, method35643, Direction.EAST);
        if (method35646 != null) {
            if (!method35646.field26598) {
                if (method35646.field26600 >= 0.0f) {
                    array[n++] = method35646;
                }
            }
        }
        final Class6772 method35647 = this.method13907(class6772.field26589, class6772.field26590, class6772.field26591 - 1, method35642, method35643, Direction.NORTH);
        if (method35647 != null) {
            if (!method35647.field26598) {
                if (method35647.field26600 >= 0.0f) {
                    array[n++] = method35647;
                }
            }
        }
        final Class6772 method35648 = this.method13907(class6772.field26589 - 1, class6772.field26590, class6772.field26591 - 1, method35642, method35643, Direction.NORTH);
        if (this.method13905(class6772, method35645, method35647, method35648)) {
            array[n++] = method35648;
        }
        final Class6772 method35649 = this.method13907(class6772.field26589 + 1, class6772.field26590, class6772.field26591 - 1, method35642, method35643, Direction.NORTH);
        if (this.method13905(class6772, method35646, method35647, method35649)) {
            array[n++] = method35649;
        }
        final Class6772 method35650 = this.method13907(class6772.field26589 - 1, class6772.field26590, class6772.field26591 + 1, method35642, method35643, Direction.SOUTH);
        if (this.method13905(class6772, method35645, method35644, method35650)) {
            array[n++] = method35650;
        }
        final Class6772 method35651 = this.method13907(class6772.field26589 + 1, class6772.field26590, class6772.field26591 + 1, method35642, method35643, Direction.SOUTH);
        if (this.method13905(class6772, method35646, method35644, method35651)) {
            array[n++] = method35651;
        }
        return n;
    }
    
    private boolean method13905(final Class6772 class6772, final Class6772 class6773, final Class6772 class6774, final Class6772 class6775) {
        if (class6775 != null) {
            if (class6774 != null) {
                if (class6773 != null) {
                    if (class6775.field26598) {
                        return false;
                    }
                    if (class6774.field26590 <= class6772.field26590 && class6773.field26590 <= class6772.field26590) {
                        if (class6775.field26600 >= 0.0f) {
                            if (class6774.field26590 < class6772.field26590 || class6774.field26600 >= 0.0f) {
                                if (class6773.field26590 < class6772.field26590 || class6773.field26600 >= 0.0f) {
                                    return true;
                                }
                            }
                        }
                        return false;
                    }
                    return false;
                }
            }
        }
        return false;
    }
    
    public static double method13906(final IBlockReader class1855, final BlockPos class1856) {
        final BlockPos method1139 = class1856.method1139();
        final VoxelShape method1140 = class1855.getBlockState(method1139).getCollisionShape(class1855, method1139);
        return method1139.getY() + (method1140.isEmpty() ? 0.0 : method1140.getEnd(Direction.Axis.Y));
    }
    
    @Nullable
    private Class6772 method13907(final int n, int i, final int n2, final int n3, final double n4, final Direction class179) {
        Class6772 class180 = null;
        if (method13906(this.field20140, new BlockPos(n, i, n2)) - n4 > 1.125) {
            return null;
        }
        Class257 field26601 = this.method13912(this.field20141, n, i, n2);
        final float method4144 = this.field20141.method4144(field26601);
        final double n5 = this.field20141.method1930() / 2.0;
        if (method4144 >= 0.0f) {
            class180 = this.method13919(n, i, n2);
            class180.field26601 = field26601;
            class180.field26600 = Math.max(class180.field26600, method4144);
        }
        if (field26601 != Class257.field1207) {
            if (class180 == null || class180.field26600 < 0.0f) {
                if (n3 > 0) {
                    if (field26601 != Class257.field1209) {
                        if (field26601 != Class257.field1208) {
                            class180 = this.method13907(n, i + 1, n2, n3 - 1, n4, class179);
                            if (class180 != null) {
                                if (class180.field26601 == Class257.field1206 || class180.field26601 == Class257.field1207) {
                                    if (this.field20141.method1930() < 1.0f) {
                                        final double n6 = n - class179.getXOffset() + 0.5;
                                        final double n7 = n2 - class179.getZOffset() + 0.5;
                                        if (!this.field20140.method6978(this.field20141, new AxisAlignedBB(n6 - n5, method13906(this.field20140, new BlockPos(n6, i + 1, n7)) + 0.001, n7 - n5, n6 + n5, this.field20141.method1931() + method13906(this.field20140, new BlockPos(class180.field26589, class180.field26590, class180.field26591)) - 0.002, n7 + n5))) {
                                            class180 = null;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (field26601 == Class257.field1211) {
                if (!this.method13927()) {
                    if (this.method13912(this.field20141, n, i - 1, n2) != Class257.field1211) {
                        return class180;
                    }
                    while (i > 0) {
                        --i;
                        field26601 = this.method13912(this.field20141, n, i, n2);
                        if (field26601 != Class257.field1211) {
                            return class180;
                        }
                        class180 = this.method13919(n, i, n2);
                        class180.field26601 = field26601;
                        class180.field26600 = Math.max(class180.field26600, this.field20141.method4144(field26601));
                    }
                }
            }
            if (field26601 == Class257.field1206) {
                if (!this.field20140.method6978(this.field20141, new AxisAlignedBB(n - n5 + 0.5, i + 0.001, n2 - n5 + 0.5, n + n5 + 0.5, i + this.field20141.method1931(), n2 + n5 + 0.5))) {
                    return null;
                }
                if (this.field20141.method1930() >= 1.0f && this.method13912(this.field20141, n, i - 1, n2) == Class257.field1205) {
                    final Class6772 method4145 = this.method13919(n, i, n2);
                    method4145.field26601 = Class257.field1207;
                    method4145.field26600 = Math.max(method4145.field26600, method4144);
                    return method4145;
                }
                int n8 = 0;
                final int n9 = i;
                while (field26601 == Class257.field1206) {
                    if (--i < 0) {
                        final Class6772 method4146 = this.method13919(n, n9, n2);
                        method4146.field26601 = Class257.field1205;
                        method4146.field26600 = -1.0f;
                        return method4146;
                    }
                    final Class6772 method4147 = this.method13919(n, i, n2);
                    if (n8++ >= this.field20141.method1858()) {
                        method4147.field26601 = Class257.field1205;
                        method4147.field26600 = -1.0f;
                        return method4147;
                    }
                    field26601 = this.method13912(this.field20141, n, i, n2);
                    final float method4148 = this.field20141.method4144(field26601);
                    if (field26601 != Class257.field1206 && method4148 >= 0.0f) {
                        class180 = method4147;
                        method4147.field26601 = field26601;
                        method4147.field26600 = Math.max(method4147.field26600, method4148);
                        break;
                    }
                    if (method4148 >= 0.0f) {
                        continue;
                    }
                    method4147.field26601 = Class257.field1205;
                    method4147.field26600 = -1.0f;
                    return method4147;
                }
            }
            return class180;
        }
        return class180;
    }
    
    @Override
    public Class257 method13908(final IBlockReader class1855, final int n, final int n2, final int n3, final Class759 class1856, final int n4, final int n5, final int n6, final boolean b, final boolean b2) {
        final EnumSet<Class257> none = EnumSet.noneOf(Class257.class);
        final Class257 field1205 = Class257.field1205;
        final double n7 = class1856.method1930() / 2.0;
        final Class257 method13909 = this.method13909(class1855, n, n2, n3, n4, n5, n6, b, b2, none, field1205, new BlockPos(class1856));
        if (!none.contains(Class257.field1209)) {
            Class257 field1206 = Class257.field1205;
            for (final Class257 class1857 : none) {
                if (class1856.method4144(class1857) < 0.0f) {
                    return class1857;
                }
                if (class1856.method4144(class1857) < class1856.method4144(field1206)) {
                    continue;
                }
                field1206 = class1857;
            }
            return (method13909 == Class257.field1206 && class1856.method4144(field1206) == 0.0f) ? Class257.field1206 : field1206;
        }
        return Class257.field1209;
    }
    
    public Class257 method13909(final IBlockReader class1855, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final boolean b, final boolean b2, final EnumSet<Class257> set, Class257 class1856, final BlockPos class1857) {
        for (int i = 0; i < n4; ++i) {
            for (int j = 0; j < n5; ++j) {
                for (int k = 0; k < n6; ++k) {
                    final Class257 method13910 = this.method13910(class1855, b, b2, class1857, this.method13913(class1855, i + n, j + n2, k + n3));
                    if (i == 0) {
                        if (j == 0) {
                            if (k == 0) {
                                class1856 = method13910;
                            }
                        }
                    }
                    set.add(method13910);
                }
            }
        }
        return class1856;
    }
    
    public Class257 method13910(final IBlockReader class1855, final boolean b, final boolean b2, final BlockPos class1856, Class257 class1857) {
        if (class1857 == Class257.field1221) {
            if (b) {
                if (b2) {
                    class1857 = Class257.field1207;
                }
            }
        }
        if (class1857 == Class257.field1220) {
            if (!b2) {
                class1857 = Class257.field1205;
            }
        }
        if (class1857 == Class257.field1213) {
            if (!(class1855.getBlockState(class1856).getBlock() instanceof Class4017)) {
                if (!(class1855.getBlockState(class1856.method1139()).getBlock() instanceof Class4017)) {
                    class1857 = Class257.field1209;
                }
            }
        }
        if (class1857 == Class257.field1224) {
            class1857 = Class257.field1205;
        }
        return class1857;
    }
    
    private Class257 method13911(final Class759 class759, final BlockPos class760) {
        return this.method13912(class759, class760.getX(), class760.getY(), class760.getZ());
    }
    
    private Class257 method13912(final Class759 class759, final int n, final int n2, final int n3) {
        return this.method13908(this.field20140, n, n2, n3, class759, this.field20143, this.field20144, this.field20145, this.method13926(), this.method13925());
    }
    
    @Override
    public Class257 method13913(final IBlockReader class1855, final int n, final int n2, final int n3) {
        return method13914(class1855, n, n2, n3);
    }
    
    public static Class257 method13914(final IBlockReader class1855, final int n, final int n2, final int n3) {
        Class257 class1856 = method13916(class1855, n, n2, n3);
        if (class1856 == Class257.field1206) {
            if (n2 >= 1) {
                final Block method21696 = class1855.getBlockState(new BlockPos(n, n2 - 1, n3)).getBlock();
                final Class257 method21697 = method13916(class1855, n, n2 - 1, n3);
                Class257 class1857 = null;
                Label_0126: {
                    if (method21697 != Class257.field1207) {
                        if (method21697 != Class257.field1206) {
                            if (method21697 != Class257.field1211) {
                                if (method21697 != Class257.field1210) {
                                    class1857 = Class257.field1207;
                                    break Label_0126;
                                }
                            }
                        }
                    }
                    class1857 = Class257.field1206;
                }
                class1856 = class1857;
                Label_0165: {
                    if (method21697 != Class257.field1215) {
                        if (method21696 != Blocks.MAGMA_BLOCK) {
                            if (method21696 != Blocks.CAMPFIRE) {
                                break Label_0165;
                            }
                        }
                    }
                    class1856 = Class257.field1215;
                }
                if (method21697 == Class257.field1217) {
                    class1856 = Class257.field1217;
                }
                if (method21697 == Class257.field1219) {
                    class1856 = Class257.field1219;
                }
                if (method21697 == Class257.field1225) {
                    class1856 = Class257.field1225;
                }
            }
        }
        if (class1856 == Class257.field1207) {
            class1856 = method13915(class1855, n, n2, n3, class1856);
        }
        return class1856;
    }
    
    public static Class257 method13915(final IBlockReader class1855, final int n, final int n2, final int n3, Class257 class1856) {
        try (final Class386 method1296 = Class386.method1296()) {
            for (int i = -1; i <= 1; ++i) {
                for (int j = -1; j <= 1; ++j) {
                    for (int k = -1; k <= 1; ++k) {
                        if (i != 0 || k != 0) {
                            final Block method1297 = class1855.getBlockState(method1296.method1300(i + n, j + n2, k + n3)).getBlock();
                            if (method1297 == Blocks.field29332) {
                                class1856 = Class257.field1216;
                            }
                            else if (method1297 != Blocks.FIRE && method1297 != Blocks.field29174) {
                                if (method1297 == Blocks.SWEET_BERRY_BUSH) {
                                    class1856 = Class257.field1218;
                                }
                            }
                            else {
                                class1856 = Class257.field1214;
                            }
                        }
                    }
                }
            }
        }
        return class1856;
    }
    
    public static Class257 method13916(final IBlockReader class1855, final int n, final int n2, final int n3) {
        final BlockPos class1856 = new BlockPos(n, n2, n3);
        final BlockState method6701 = class1855.getBlockState(class1856);
        final Block method6702 = method6701.getBlock();
        final Material method6703 = method6701.getMaterial();
        if (method6701.method21706()) {
            return Class257.field1206;
        }
        if (method6702.method11785(Class7188.field27908) || method6702 == Blocks.field29393) {
            return Class257.field1208;
        }
        if (method6702 == Blocks.FIRE) {
            return Class257.field1215;
        }
        if (method6702 == Blocks.field29332) {
            return Class257.field1217;
        }
        if (method6702 == Blocks.SWEET_BERRY_BUSH) {
            return Class257.field1219;
        }
        if (method6702 == Blocks.HONEY_BLOCK) {
            return Class257.field1225;
        }
        if (method6702 == Blocks.field29406) {
            return Class257.field1226;
        }
        if (method6702 instanceof Class3969) {
            if (method6703 == Material.WOOD) {
                if (!method6701.get((IProperty<Boolean>)Class3969.field17932)) {
                    return Class257.field1221;
                }
            }
        }
        if (method6702 instanceof Class3969) {
            if (method6703 == Material.IRON) {
                if (!method6701.get((IProperty<Boolean>)Class3969.field17932)) {
                    return Class257.field1222;
                }
            }
        }
        if (method6702 instanceof Class3969 && method6701.get((IProperty<Boolean>)Class3969.field17932)) {
            return Class257.field1220;
        }
        if (method6702 instanceof Class4017) {
            return Class257.field1213;
        }
        if (!(method6702 instanceof Class3972)) {
            if (!method6702.method11785(Class7188.field27911)) {
                if (!method6702.method11785(Class7188.field27904)) {
                    if (!(method6702 instanceof Class3898) || method6701.get((IProperty<Boolean>)Class3898.field17585)) {
                        final IFluidState method6704 = class1855.getFluidState(class1856);
                        if (method6704.isTagged(Class7324.field28319)) {
                            return Class257.field1211;
                        }
                        if (!method6704.isTagged(Class7324.field28320)) {
                            return method6701.method21749(class1855, class1856, Class2084.field12051) ? Class257.field1206 : Class257.field1205;
                        }
                        return Class257.field1210;
                    }
                }
            }
            return Class257.field1209;
        }
        return Class257.field1224;
    }
}
