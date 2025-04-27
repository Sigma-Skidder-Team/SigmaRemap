// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class Class3848 extends Class3846
{
    private static String[] field17456;
    public static final VoxelShape field17457;
    
    public Class3848(final Properties class9288) {
        super(class9288);
    }
    
    private static boolean method11902(final Entity class399) {
        if (!(class399 instanceof LivingEntity)) {
            if (!(class399 instanceof Class428)) {
                if (!(class399 instanceof Class510)) {
                    return class399 instanceof Class423;
                }
            }
        }
        return true;
    }
    
    @Override
    public VoxelShape method11809(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098, final ISelectionContext class7099) {
        return Class3848.field17457;
    }
    
    @Override
    public void method11860(final World class1847, final BlockPos class1848, final Entity class1849, final float n) {
        class1849.method1695(Class8520.field35269, 1.0f, 1.0f);
        if (!class1847.isRemote) {
            class1847.method6761(class1849, (byte)54);
        }
        if (class1849.method1705(n, 0.2f)) {
            class1849.method1695(this.field17400.method24483(), this.field17400.method24477() * 0.5f, this.field17400.method24478() * 0.75f);
        }
    }
    
    @Override
    public void method11850(final BlockState class7096, final World class7097, final BlockPos class7098, final Entity class7099) {
        if (this.method11903(class7098, class7099)) {
            this.method11904(class7099, class7098);
            this.method11905(class7099);
            this.method11906(class7097, class7099);
        }
        super.method11850(class7096, class7097, class7098, class7099);
    }
    
    private boolean method11903(final BlockPos class354, final Entity class355) {
        if (class355.onGround) {
            return false;
        }
        if (class355.getPosY() > class354.getY() + 0.9375 - 1.0E-7) {
            return false;
        }
        if (class355.getMotion().y < -0.08) {
            final double abs = Math.abs(class354.getX() + 0.5 - class355.getPosX());
            final double abs2 = Math.abs(class354.getZ() + 0.5 - class355.getPosZ());
            final double n = 0.4375 + class355.method1930() / 2.0f;
            return abs + 1.0E-7 > n || abs2 + 1.0E-7 > n;
        }
        return false;
    }
    
    private void method11904(final Entity class399, final BlockPos class400) {
        if (class399 instanceof Class513) {
            if (class399.world.method6754() % 20L == 0L) {
                Class7770.field31811.method13782((Class513)class399, class399.world.getBlockState(class400));
            }
        }
    }
    
    private void method11905(final Entity class399) {
        final Vec3d method1935 = class399.getMotion();
        if (method1935.y >= -0.13) {
            class399.method1936(new Vec3d(method1935.x, -0.05, method1935.z));
        }
        else {
            final double n = -0.05 / method1935.y;
            class399.method1936(new Vec3d(method1935.x * n, -0.05, method1935.z * n));
        }
        class399.fallDistance = 0.0f;
    }
    
    private void method11906(final World class1847, final Entity class1848) {
        if (method11902(class1848)) {
            if (class1847.rand.nextInt(5) == 0) {
                class1848.method1695(Class8520.field35269, 1.0f, 1.0f);
            }
            if (!class1847.isRemote) {
                if (class1847.rand.nextInt(5) == 0) {
                    class1847.method6761(class1848, (byte)53);
                }
            }
        }
    }
    
    public static void method11907(final Entity class399) {
        method11909(class399, 5);
    }
    
    public static void method11908(final Entity class399) {
        method11909(class399, 10);
    }
    
    private static void method11909(final Entity class399, final int n) {
        if (class399.world.isRemote) {
            final BlockState method11878 = Blocks.HONEY_BLOCK.getDefaultState();
            for (int i = 0; i < n; ++i) {
                class399.world.method6709(new Class6911(Class8432.field34600, method11878), class399.getPosX(), class399.getPosY(), class399.getPosZ(), 0.0, 0.0, 0.0);
            }
        }
    }
    
    static {
        field17457 = Block.method11778(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);
    }
}
