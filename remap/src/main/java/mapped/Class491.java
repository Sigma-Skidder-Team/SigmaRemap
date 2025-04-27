// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

import java.util.Iterator;
import java.util.List;

public class Class491 extends TileEntity implements Class439
{
    private BlockState field2818;
    private Direction field2819;
    private boolean field2820;
    private boolean field2821;
    private static final ThreadLocal<Direction> field2822;
    private float field2823;
    private float field2824;
    private long field2825;
    
    public Class491() {
        super(Class5412.field22550);
    }
    
    public Class491(final BlockState field2818, final Direction field2819, final boolean field2820, final boolean field2821) {
        this();
        this.field2818 = field2818;
        this.field2819 = field2819;
        this.field2820 = field2820;
        this.field2821 = field2821;
    }
    
    @Override
    public CompoundNBT method2196() {
        return this.method2180(new CompoundNBT());
    }
    
    public boolean method2462() {
        return this.field2820;
    }
    
    public Direction method2463() {
        return this.field2819;
    }
    
    public boolean method2464() {
        return this.field2821;
    }
    
    public float method2465(float n) {
        if (n > 1.0f) {
            n = 1.0f;
        }
        return MathHelper.method35700(n, this.field2824, this.field2823);
    }
    
    public float method2466(final float n) {
        return this.field2819.getXOffset() * this.method2469(this.method2465(n));
    }
    
    public float method2467(final float n) {
        return this.field2819.getYOffset() * this.method2469(this.method2465(n));
    }
    
    public float method2468(final float n) {
        return this.field2819.getZOffset() * this.method2469(this.method2465(n));
    }
    
    private float method2469(final float n) {
        return this.field2820 ? (n - 1.0f) : (1.0f - n);
    }
    
    private BlockState method2470() {
        if (!this.method2462()) {
            if (this.method2464()) {
                if (this.field2818.getBlock() instanceof Class3836) {
                    return Blocks.field29247.getDefaultState().with(Class3835.field17417, (this.field2818.getBlock() != Blocks.field29239) ? Class178.field507 : Class178.field508).with((IProperty<Comparable>)Class3835.field17415, (Comparable)this.field2818.get((IProperty<V>)Class3836.field17415));
                }
            }
        }
        return this.field2818;
    }
    
    private void method2471(final float n) {
        final Direction method2476 = this.method2476();
        final double b = n - this.field2823;
        final VoxelShape method2477 = this.method2470().getCollisionShape(this.field2656, this.getPos());
        if (!method2477.isEmpty()) {
            final List<AxisAlignedBB> method2478 = method2477.toBoundingBoxList();
            final AxisAlignedBB method2479 = this.method2479(this.method2477(method2478));
            final List<Entity> method2480 = this.field2656.method7127(null, Class8159.method26948(method2479, method2476, b).offset(method2479));
            if (!method2480.isEmpty()) {
                final boolean b2 = this.field2818.getBlock() == Blocks.field29516;
                for (final Entity class399 : method2480) {
                    if (class399.method1921() != PushReaction.IGNORE) {
                        if (b2) {
                            final Vec3d method2481 = class399.getMotion();
                            double field22770 = method2481.x;
                            double field22771 = method2481.y;
                            double field22772 = method2481.z;
                            switch (Class8986.field37876[method2476.getAxis().ordinal()]) {
                                case 1: {
                                    field22770 = method2476.getXOffset();
                                    break;
                                }
                                case 2: {
                                    field22771 = method2476.getYOffset();
                                    break;
                                }
                                case 3: {
                                    field22772 = method2476.getZOffset();
                                    break;
                                }
                            }
                            class399.setMotion(field22770, field22771, field22772);
                        }
                        double max = 0.0;
                        final Iterator<AxisAlignedBB> iterator2 = method2478.iterator();
                        while (iterator2.hasNext()) {
                            final AxisAlignedBB method2482 = Class8159.method26948(this.method2479(iterator2.next()), method2476, b);
                            final AxisAlignedBB method2483 = class399.getBoundingBox();
                            if (method2482.intersects(method2483)) {
                                max = Math.max(max, method2478(method2482, method2476, method2483));
                                if (max >= b) {
                                    break;
                                }
                                continue;
                            }
                        }
                        if (max <= 0.0) {
                            continue;
                        }
                        method2472(method2476, class399, Math.min(max, b) + 0.01, method2476);
                        if (this.field2820 || !this.field2821) {
                            continue;
                        }
                        this.method2480(class399, method2476, b);
                    }
                }
            }
        }
    }
    
    private static void method2472(final Direction value, final Entity class399, final double n, final Direction class400) {
        Class491.field2822.set(value);
        class399.method1671(Class2160.field12828, new Vec3d(n * class400.getXOffset(), n * class400.getYOffset(), n * class400.getZOffset()));
        Class491.field2822.set(null);
    }
    
    private void method2473(final float n) {
        if (this.method2475()) {
            final Direction method2476 = this.method2476();
            if (method2476.getAxis().isHorizontal()) {
                final AxisAlignedBB method2477 = this.method2479(new AxisAlignedBB(0.0, this.field2818.getCollisionShape(this.field2656, this.field2657).getEnd(Direction.Axis.Y), 0.0, 1.0, 1.5000000999999998, 1.0));
                final double n2 = n - this.field2823;
                final Iterator<Entity> iterator = this.field2656.method6737(null, method2477, class6222 -> method2474(class6221, class6222)).iterator();
                while (iterator.hasNext()) {
                    method2472(method2476, iterator.next(), n2, method2476);
                }
            }
        }
    }
    
    private static boolean method2474(final AxisAlignedBB class6221, final Entity class6222) {
        if (class6222.method1921() == PushReaction.NORMAL) {
            if (class6222.onGround) {
                if (class6222.getPosX() >= class6221.minX) {
                    if (class6222.getPosX() <= class6221.maxX) {
                        if (class6222.getPosZ() >= class6221.minZ) {
                            return class6222.getPosZ() <= class6221.maxZ;
                        }
                    }
                }
            }
        }
        return false;
    }
    
    private boolean method2475() {
        return this.field2818.getBlock() == Blocks.HONEY_BLOCK;
    }
    
    public Direction method2476() {
        return this.field2820 ? this.field2819 : this.field2819.getOpposite();
    }
    
    private AxisAlignedBB method2477(final List<AxisAlignedBB> list) {
        double min = 0.0;
        double min2 = 0.0;
        double min3 = 0.0;
        double max = 1.0;
        double max2 = 1.0;
        double max3 = 1.0;
        for (final AxisAlignedBB class6221 : list) {
            min = Math.min(class6221.minX, min);
            min2 = Math.min(class6221.minY, min2);
            min3 = Math.min(class6221.minZ, min3);
            max = Math.max(class6221.maxX, max);
            max2 = Math.max(class6221.maxY, max2);
            max3 = Math.max(class6221.maxZ, max3);
        }
        return new AxisAlignedBB(min, min2, min3, max, max2, max3);
    }
    
    private static double method2478(final AxisAlignedBB class6221, final Direction class6222, final AxisAlignedBB class6223) {
        switch (Class8986.field37877[class6222.ordinal()]) {
            case 1: {
                return class6221.maxX - class6223.minX;
            }
            case 2: {
                return class6223.maxX - class6221.minX;
            }
            default: {
                return class6221.maxY - class6223.minY;
            }
            case 4: {
                return class6223.maxY - class6221.minY;
            }
            case 5: {
                return class6221.maxZ - class6223.minZ;
            }
            case 6: {
                return class6223.maxZ - class6221.minZ;
            }
        }
    }
    
    private AxisAlignedBB method2479(final AxisAlignedBB class6221) {
        final double n = this.method2469(this.field2823);
        return class6221.offset(this.field2657.getX() + n * this.field2819.getXOffset(), this.field2657.getY() + n * this.field2819.getYOffset(), this.field2657.getZ() + n * this.field2819.getZOffset());
    }
    
    private void method2480(final Entity class399, final Direction class400, final double b) {
        final AxisAlignedBB method1886 = class399.getBoundingBox();
        final AxisAlignedBB method1887 = VoxelShapes.fullCube().getBoundingBox().offset(this.field2657);
        if (method1886.intersects(method1887)) {
            final Direction method1888 = class400.getOpposite();
            final double a = method2478(method1887, method1888, method1886) + 0.01;
            if (Math.abs(a - (method2478(method1887, method1888, method1886.union(method1887)) + 0.01)) < 0.01) {
                method2472(class400, class399, Math.min(a, b) + 0.01, method1888);
            }
        }
    }
    
    public BlockState method2481() {
        return this.field2818;
    }
    
    public void method2482() {
        if (this.field2824 < 1.0f) {
            if (this.field2656 != null) {
                this.field2823 = 1.0f;
                this.field2824 = this.field2823;
                this.field2656.method6730(this.field2657);
                this.method2198();
                if (this.field2656.getBlockState(this.field2657).method21696() == Blocks.MOVING_PISTON) {
                    BlockState class7096;
                    if (!this.field2821) {
                        class7096 = Block.method11786(this.field2818, this.field2656, this.field2657);
                    }
                    else {
                        class7096 = Blocks.AIR.getDefaultState();
                    }
                    this.field2656.setBlockState(this.field2657, class7096, 3);
                    this.field2656.method6698(this.field2657, class7096.getBlock(), this.field2657);
                }
            }
        }
    }
    
    @Override
    public void method2229() {
        this.field2825 = this.field2656.method6754();
        this.field2824 = this.field2823;
        if (this.field2824 < 1.0f) {
            final float field2823 = this.field2823 + 0.5f;
            this.method2471(field2823);
            this.method2473(field2823);
            this.field2823 = field2823;
            if (this.field2823 >= 1.0f) {
                this.field2823 = 1.0f;
            }
        }
        else {
            this.field2656.method6730(this.field2657);
            this.method2198();
            if (this.field2818 != null) {
                if (this.field2656.getBlockState(this.field2657).method21696() == Blocks.MOVING_PISTON) {
                    BlockState method11786 = Block.method11786(this.field2818, this.field2656, this.field2657);
                    if (!method11786.method21706()) {
                        if (method11786.method21771((IProperty<Comparable>)Class8970.field37747)) {
                            if (method11786.get(Class8970.field37747)) {
                                method11786 = ((StateHolder<Object, BlockState>)method11786).with((IProperty<Comparable>)Class8970.field37747, false);
                            }
                        }
                        this.field2656.setBlockState(this.field2657, method11786, 67);
                        this.field2656.method6698(this.field2657, method11786.getBlock(), this.field2657);
                    }
                    else {
                        this.field2656.setBlockState(this.field2657, this.field2818, 84);
                        Block.method11787(this.field2818, method11786, this.field2656, this.field2657, 3);
                    }
                }
            }
        }
    }
    
    @Override
    public void method2179(final CompoundNBT class51) {
        super.method2179(class51);
        this.field2818 = Class9346.method34647(class51.getCompound("blockState"));
        this.field2819 = Direction.byIndex(class51.getInt("facing"));
        this.field2823 = class51.getFloat("progress");
        this.field2824 = this.field2823;
        this.field2820 = class51.getBoolean("extending");
        this.field2821 = class51.getBoolean("source");
    }
    
    @Override
    public CompoundNBT method2180(final CompoundNBT class51) {
        super.method2180(class51);
        class51.put("blockState", Class9346.method34649(this.field2818));
        class51.putInt("facing", this.field2819.getIndex());
        class51.putFloat("progress", this.field2824);
        class51.putBoolean("extending", this.field2820);
        class51.putBoolean("source", this.field2821);
        return class51;
    }
    
    public VoxelShape method2483(final IBlockReader class1855, final BlockPos class1856) {
        VoxelShape class1857;
        if (!this.field2820 && this.field2821) {
            class1857 = ((StateHolder<O, BlockState>)this.field2818).with((IProperty<Comparable>)Class3836.field17438, true).getCollisionShape(class1855, class1856);
        }
        else {
            class1857 = VoxelShapes.empty();
        }
        final Direction class1858 = Class491.field2822.get();
        if (this.field2823 < 1.0 && class1858 == this.method2476()) {
            return class1857;
        }
        BlockState field2818;
        if (!this.method2464()) {
            field2818 = this.field2818;
        }
        else {
            field2818 = ((StateHolder<O, BlockState>)((StateHolder<O, BlockState>) Blocks.field29247.getDefaultState()).with((IProperty<Comparable>)Class3835.field17415, this.field2819)).with((IProperty<Comparable>)Class3835.field17418, this.field2820 != 1.0f - this.field2823 < 4.0f);
        }
        final float method2469 = this.method2469(this.field2823);
        return VoxelShapes.method24492(class1857, field2818.getCollisionShape(class1855, class1856).withOffset(this.field2819.getXOffset() * method2469, this.field2819.getYOffset() * method2469, this.field2819.getZOffset() * method2469));
    }
    
    public long method2484() {
        return this.field2825;
    }
    
    static {
        field2822 = ThreadLocal.withInitial(() -> null);
    }
}
