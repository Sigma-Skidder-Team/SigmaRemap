// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import java.util.Optional;
import java.util.List;
import javax.annotation.Nullable;

public class Class3900 extends Class3892 implements Class3840
{
    public static final Class7114<Class105> field17599;
    public static final Class7113 field17600;
    public static final VoxelShape field17601;
    public static final VoxelShape field17602;
    public static final VoxelShape field17603;
    public static final VoxelShape field17604;
    public static final VoxelShape field17605;
    public static final VoxelShape field17606;
    public static final VoxelShape field17607;
    public static final VoxelShape field17608;
    public static final VoxelShape field17609;
    private final Class181 field17610;
    
    public Class3900(final Class181 field17610, final Properties class9288) {
        super(class9288);
        this.field17610 = field17610;
        this.method11877(((StateHolder<O, BlockState>) this.field17406.method32903().with(Class3900.field17599, Class105.field324)).with((IProperty<Comparable>)Class3900.field17600, false));
    }
    
    @Override
    public MaterialColor method11783(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098) {
        return (class7096.get(Class3900.field17599) != Class105.field324) ? MaterialColor.WOOL : this.field17610.method816();
    }
    
    @Nullable
    public static Direction method11985(final IBlockReader class1855, final BlockPos class1856) {
        final BlockState method6701 = class1855.getBlockState(class1856);
        return (method6701.getBlock() instanceof Class3900) ? method6701.get(Class3900.field17564) : null;
    }
    
    @Override
    public Class2201 method11844(BlockState method6701, final World class1847, BlockPos method6702, final PlayerEntity class1848, final Class316 class1849, final BlockRayTraceResult class1850) {
        if (class1847.isRemote) {
            return Class2201.field13401;
        }
        if (method6701.get(Class3900.field17599) != Class105.field323) {
            method6702 = method6702.method1149(method6701.get(Class3900.field17564));
            method6701 = class1847.getBlockState(method6702);
            if (method6701.getBlock() != this) {
                return Class2201.field13401;
            }
        }
        if (!class1847.dimension.method20494() || class1847.method6959(method6702) == Class7102.field27640) {
            class1847.method6690(method6702, false);
            final BlockPos method6703 = method6702.method1149(method6701.get(Class3900.field17564).getOpposite());
            if (class1847.getBlockState(method6703).method21696() == this) {
                class1847.method6690(method6703, false);
            }
            class1847.createExplosion(null, DamageSource.method25704(), method6702.getX() + 0.5, method6702.getY() + 0.5, method6702.getZ() + 0.5, 5.0f, true, Explosion.Mode.field13367);
            return Class2201.field13400;
        }
        if (!method6701.get(Class3900.field17600)) {
            class1848.method2845(method6702).ifLeft(class1852 -> {
                if (class1852 != null) {
                    class1851.method2853(class1852.method8136(), true);
                }
            });
            return Class2201.field13400;
        }
        if (!this.method11986(class1847, method6702)) {
            class1848.method2853(new Class2259("block.minecraft.bed.occupied"), true);
        }
        return Class2201.field13400;
    }
    
    private boolean method11986(final World class1847, final BlockPos class1848) {
        final List<Entity> method6739 = class1847.method6739((Class<? extends Entity>)Class824.class, new AxisAlignedBB(class1848), LivingEntity::method2783);
        if (!method6739.isEmpty()) {
            ((Class824)method6739.get(0)).method2787();
            return true;
        }
        return false;
    }
    
    @Override
    public void method11860(final World class1847, final BlockPos class1848, final Entity class1849, final float n) {
        super.method11860(class1847, class1848, class1849, n * 0.5f);
    }
    
    @Override
    public void method11861(final IBlockReader class1855, final Entity class1856) {
        if (!class1856.method1811()) {
            this.method11987(class1856);
        }
        else {
            super.method11861(class1855, class1856);
        }
    }
    
    private void method11987(final Entity class399) {
        final Vec3d method1935 = class399.getMotion();
        if (method1935.y < 0.0) {
            class399.setMotion(method1935.x, -method1935.y * 0.6600000262260437 * ((class399 instanceof LivingEntity) ? 1.0 : 0.8), method1935.z);
        }
    }
    
    @Override
    public BlockState method11789(final BlockState class7096, final Direction class7097, final BlockState class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
        if (class7097 != method11988(class7096.get(Class3900.field17599), class7096.get(Class3900.field17564))) {
            return super.method11789(class7096, class7097, class7098, class7099, class7100, class7101);
        }
        return (class7098.getBlock() == this && class7098.get(Class3900.field17599) != class7096.get(Class3900.field17599)) ? class7096.with((IProperty<Comparable>)Class3900.field17600, (Comparable)class7098.get((IProperty<V>)Class3900.field17600)) : Blocks.AIR.getDefaultState();
    }
    
    private static Direction method11988(final Class105 class105, final Direction class106) {
        return (class105 != Class105.field324) ? class106.getOpposite() : class106;
    }
    
    @Override
    public void method11852(final World class1847, final PlayerEntity class1848, final BlockPos class1849, final BlockState class1850, final TileEntity class1851, final ItemStack class1852) {
        super.method11852(class1847, class1848, class1849, Blocks.AIR.getDefaultState(), class1851, class1852);
    }
    
    @Override
    public void method11870(final World class1847, final BlockPos class1848, final BlockState class1849, final PlayerEntity class1850) {
        final Class105 class1851 = class1849.get(Class3900.field17599);
        final BlockPos method1149 = class1848.method1149(method11988(class1851, class1849.get(Class3900.field17564)));
        final BlockState method1150 = class1847.getBlockState(method1149);
        if (method1150.getBlock() == this) {
            if (method1150.get(Class3900.field17599) != class1851) {
                class1847.setBlockState(method1149, Blocks.AIR.getDefaultState(), 35);
                class1847.playEvent(class1850, 2001, method1149, Block.method11774(method1150));
                if (!class1847.isRemote) {
                    if (!class1850.method2889()) {
                        final ItemStack method1151 = class1850.getHeldItemMainhand();
                        Block.spawnAsEntity(class1849, class1847, class1848, null, class1850, method1151);
                        Block.spawnAsEntity(method1150, class1847, method1149, null, class1850, method1151);
                    }
                }
                class1850.method2859(Class8276.field33979.method8449(this));
            }
        }
        super.method11870(class1847, class1848, class1849, class1850);
    }
    
    @Nullable
    @Override
    public BlockState method11846(final Class7074 class7074) {
        final Direction method21644 = class7074.method21644();
        return class7074.method21654().getBlockState(class7074.method21639().method1149(method21644)).method21750(class7074) ? ((BlockState)((StateHolder<Object, Object>)this.getDefaultState()).with((IProperty<Comparable>)Class3900.field17564, method21644)) : null;
    }
    
    @Override
    public VoxelShape method11808(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098, final ISelectionContext class7099) {
        switch (Class9422.field40421[method11989(class7096).getOpposite().ordinal()]) {
            case 1: {
                return Class3900.field17606;
            }
            case 2: {
                return Class3900.field17607;
            }
            case 3: {
                return Class3900.field17608;
            }
            default: {
                return Class3900.field17609;
            }
        }
    }
    
    public static Direction method11989(final BlockState class7096) {
        final Direction class7097 = class7096.get(Class3900.field17564);
        return (class7096.get(Class3900.field17599) != Class105.field323) ? class7097 : class7097.getOpposite();
    }
    
    public static Class2083 method11990(final BlockState class7096) {
        return (class7096.get(Class3900.field17599) != Class105.field323) ? Class2083.field12049 : Class2083.field12048;
    }
    
    public static Optional<Vec3d> method11991(final EntityType<?> class7499, final Class1852 class7500, final BlockPos class7501, int n) {
        final Direction class7502 = class7500.getBlockState(class7501).get(Class3900.field17564);
        final int method1074 = class7501.getX();
        final int method1075 = class7501.getY();
        final int method1076 = class7501.getZ();
        for (int i = 0; i <= 1; ++i) {
            final int n2 = method1074 - class7502.getXOffset() * i - 1;
            final int n3 = method1076 - class7502.getZOffset() * i - 1;
            final int n4 = n2 + 2;
            final int n5 = n3 + 2;
            for (int j = n2; j <= n4; ++j) {
                for (int k = n3; k <= n5; ++k) {
                    final Optional<Vec3d> method1077 = method11992(class7499, class7500, new BlockPos(j, method1075, k));
                    if (method1077.isPresent()) {
                        if (n <= 0) {
                            return method1077;
                        }
                        --n;
                    }
                }
            }
        }
        return Optional.empty();
    }
    
    public static Optional<Vec3d> method11992(final EntityType<?> class7499, final Class1852 class7500, final BlockPos class7501) {
        if (class7500.getBlockState(class7501).getCollisionShape(class7500, class7501).getEnd(Direction.Axis.Y) > 0.4375) {
            return Optional.empty();
        }
        final Mutable class7502 = new Mutable(class7501);
        while (class7502.getY() >= 0) {
            if (class7501.getY() - class7502.getY() > 2) {
                break;
            }
            if (!class7500.getBlockState(class7502).getCollisionShape(class7500, class7502).isEmpty()) {
                break;
            }
            class7502.method1290(Direction.DOWN);
        }
        final VoxelShape method21727 = class7500.getBlockState(class7502).getCollisionShape(class7500, class7502);
        if (method21727.isEmpty()) {
            return Optional.empty();
        }
        final double n = class7502.getY() + method21727.getEnd(Direction.Axis.Y) + 2.0E-7;
        if (class7501.getY() - n <= 2.0) {
            final float n2 = class7499.method23369() / 2.0f;
            final Vec3d value = new Vec3d(class7502.getX() + 0.5, n, class7502.getZ() + 0.5);
            return class7500.method6976(new AxisAlignedBB(value.x - n2, value.y, value.z - n2, value.x + n2, value.y + class7499.method23370(), value.z + n2)) ? Optional.of(value) : Optional.empty();
        }
        return Optional.empty();
    }
    
    @Override
    public PushReaction method11858(final BlockState class7096) {
        return PushReaction.DESTROY;
    }
    
    @Override
    public Class2115 method11797(final BlockState class7096) {
        return Class2115.field12306;
    }
    
    @Override
    public void method11875(final Class9500<Block, BlockState> class9500) {
        class9500.method35378(Class3900.field17564, Class3900.field17599, Class3900.field17600);
    }
    
    @Override
    public TileEntity method11898(final IBlockReader class1855) {
        return new Class437(this.field17610);
    }
    
    @Override
    public void method11853(final World class1847, final BlockPos class1848, final BlockState class1849, final LivingEntity class1850, final ItemStack class1851) {
        super.method11853(class1847, class1848, class1849, class1850, class1851);
        if (!class1847.isRemote) {
            class1847.setBlockState(class1848.method1149(class1849.get(Class3900.field17564)), class1849.with(Class3900.field17599, Class105.field323), 3);
            class1847.method6694(class1848, Blocks.AIR);
            class1849.method21735(class1847, class1848, 3);
        }
    }
    
    public Class181 method11993() {
        return this.field17610;
    }
    
    @Override
    public long method11868(final BlockState class7096, final BlockPos class7097) {
        final BlockPos method1150 = class7097.method1150(class7096.get(Class3900.field17564), (class7096.get(Class3900.field17599) != Class105.field323) ? 1 : 0);
        return MathHelper.method35689(method1150.getX(), class7097.getY(), method1150.getZ());
    }
    
    @Override
    public boolean method11796(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098, final Class2084 class7099) {
        return false;
    }
    
    static {
        field17599 = Class8970.field37794;
        field17600 = Class8970.field37738;
        field17601 = Block.method11778(0.0, 3.0, 0.0, 16.0, 9.0, 16.0);
        field17602 = Block.method11778(0.0, 0.0, 0.0, 3.0, 3.0, 3.0);
        field17603 = Block.method11778(0.0, 0.0, 13.0, 3.0, 3.0, 16.0);
        field17604 = Block.method11778(13.0, 0.0, 0.0, 16.0, 3.0, 3.0);
        field17605 = Block.method11778(13.0, 0.0, 13.0, 16.0, 3.0, 16.0);
        field17606 = VoxelShapes.method24493(Class3900.field17601, Class3900.field17602, Class3900.field17604);
        field17607 = VoxelShapes.method24493(Class3900.field17601, Class3900.field17603, Class3900.field17605);
        field17608 = VoxelShapes.method24493(Class3900.field17601, Class3900.field17602, Class3900.field17603);
        field17609 = VoxelShapes.method24493(Class3900.field17601, Class3900.field17604, Class3900.field17605);
    }
}
