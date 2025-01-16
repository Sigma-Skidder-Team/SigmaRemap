// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.*;
import net.minecraft.util.Direction;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.chunk.Chunk;
import org.apache.logging.log4j.LogManager;

import java.util.Random;
import javax.annotation.Nullable;
import java.util.List;
import org.apache.logging.log4j.Logger;

public class Class488 extends Class489 implements Class439
{
    private static final Logger field2801;
    private long field2802;
    private int field2803;
    private BlockPos field2804;
    private boolean field2805;
    
    public Class488() {
        super(Class5412.field22561);
    }
    
    @Override
    public CompoundNBT method2180(final CompoundNBT class51) {
        super.method2180(class51);
        class51.putLong("Age", this.field2802);
        if (this.field2804 != null) {
            class51.put("ExitPortal", Class9346.method34646(this.field2804));
        }
        if (this.field2805) {
            class51.putBoolean("ExactTeleport", this.field2805);
        }
        return class51;
    }
    
    @Override
    public void method2179(final CompoundNBT class51) {
        super.method2179(class51);
        this.field2802 = class51.getLong("Age");
        if (class51.contains("ExitPortal", 10)) {
            this.field2804 = Class9346.method34645(class51.getCompound("ExitPortal"));
        }
        this.field2805 = class51.getBoolean("ExactTeleport");
    }
    
    @Override
    public double method2192() {
        return 65536.0;
    }
    
    @Override
    public void method2229() {
        final boolean method2432 = this.method2432();
        final boolean method2433 = this.method2433();
        ++this.field2802;
        if (!method2433) {
            if (!this.field2656.isRemote) {
                final List<Entity> method2434 = this.field2656.method7128((Class<? extends Entity>) Entity.class, new AxisAlignedBB(this.getPos()));
                if (!method2434.isEmpty()) {
                    this.method2437(((Entity)method2434.get(0)).method1915());
                }
                if (this.field2802 % 2400L == 0L) {
                    this.method2436();
                }
            }
        }
        else {
            --this.field2803;
        }
        if (method2432 != this.method2432() || method2433 != this.method2433()) {
            this.method2161();
        }
    }
    
    public boolean method2432() {
        return this.field2802 < 200L;
    }
    
    public boolean method2433() {
        return this.field2803 > 0;
    }
    
    public float method2434(final float n) {
        return MathHelper.clamp((this.field2802 + n) / 200.0f, 0.0f, 1.0f);
    }
    
    public float method2435(final float n) {
        return 1.0f - MathHelper.clamp((this.field2803 - n) / 40.0f, 0.0f, 1.0f);
    }
    
    @Nullable
    @Override
    public Class4357 method2195() {
        return new Class4357(this.field2657, 8, this.method2196());
    }
    
    @Override
    public CompoundNBT method2196() {
        return this.method2180(new CompoundNBT());
    }
    
    public void method2436() {
        if (!this.field2656.isRemote) {
            this.field2803 = 40;
            this.field2656.method6763(this.getPos(), this.method2194().getBlock(), 1, 0);
            this.method2161();
        }
    }
    
    @Override
    public boolean method2200(final int n, final int n2) {
        if (n != 1) {
            return super.method2200(n, n2);
        }
        this.field2803 = 40;
        return true;
    }
    
    public void method2437(final Entity class399) {
        if (this.field2656 instanceof Class1849) {
            if (!this.method2433()) {
                this.field2803 = 100;
                if (this.field2804 == null) {
                    if (this.field2656.dimension instanceof Class6738) {
                        this.method2439((Class1849)this.field2656);
                    }
                }
                if (this.field2804 != null) {
                    final BlockPos class400 = this.field2805 ? this.field2804 : this.method2438();
                    class399.method1877(class400.getX() + 0.5, class400.getY() + 0.5, class400.getZ() + 0.5);
                }
                this.method2436();
            }
        }
    }
    
    private BlockPos method2438() {
        final BlockPos method2440 = method2440(this.field2656, this.field2804, 5, false);
        Class488.field2801.debug("Best exit position for portal at {} is {}", (Object)this.field2804, (Object)method2440);
        return method2440.method1137();
    }
    
    private void method2439(final Class1849 class1849) {
        final Vec3d method16738 = new Vec3d(this.getPos().getX(), 0.0, this.getPos().getZ()).normalize();
        Vec3d class1850 = method16738.scale(1024.0);
        for (int n = 16; method2441(class1849, class1850).method7012() > 0 && n-- > 0; class1850 = class1850.add(method16738.scale(-16.0))) {
            Class488.field2801.debug("Skipping backwards past nonempty chunk at {}", (Object)class1850);
        }
        for (int n2 = 16; method2441(class1849, class1850).method7012() == 0 && n2-- > 0; class1850 = class1850.add(method16738.scale(16.0))) {
            Class488.field2801.debug("Skipping forward past empty chunk at {}", (Object)class1850);
        }
        Class488.field2801.debug("Found chunk at {}", (Object)class1850);
        this.field2804 = method2442(method2441(class1849, class1850));
        if (this.field2804 != null) {
            Class488.field2801.debug("Found block at {}", (Object)this.field2804);
        }
        else {
            this.field2804 = new BlockPos(class1850.x + 0.5, 75.0, class1850.z + 0.5);
            Class488.field2801.debug("Failed to find suitable block, settling on {}", (Object)this.field2804);
            Class4535.field20005.method13527(Class5113.field22059).method28613(class1849, (Class6346<? extends Class7065>)class1849.method6904().method7438(), new Random(this.field2804.toLong()), this.field2804);
        }
        this.field2804 = method2440(class1849, this.field2804, 16, true);
        Class488.field2801.debug("Creating portal at {}", (Object)this.field2804);
        this.method2443(class1849, this.field2804 = this.field2804.method1138(10));
        this.method2161();
    }
    
    private static BlockPos method2440(final IBlockReader class1855, final BlockPos class1856, final int n, final boolean b) {
        BlockPos class1857 = null;
        for (int i = -n; i <= n; ++i) {
            for (int j = -n; j <= n; ++j) {
                if (i == 0) {
                    if (j == 0) {
                        if (!b) {
                            continue;
                        }
                    }
                }
                for (int k = 255; k > ((class1857 != null) ? class1857.getY() : 0); --k) {
                    final BlockPos class1858 = new BlockPos(class1856.getX() + i, k, class1856.getZ() + j);
                    final Class7096 method6701 = class1855.getBlockState(class1858);
                    if (method6701.method21762(class1855, class1858) && (b || method6701.method21696() != Class7521.field29172)) {
                        class1857 = class1858;
                        break;
                    }
                }
            }
        }
        return (class1857 != null) ? class1857 : class1856;
    }
    
    private static Chunk method2441(final World class1847, final Vec3d class1848) {
        return class1847.method6686(MathHelper.floor(class1848.x / 16.0), MathHelper.floor(class1848.z / 16.0));
    }
    
    @Nullable
    private static BlockPos method2442(final Chunk class1862) {
        final ChunkPos method7019 = class1862.method7019();
        final BlockPos class1863 = new BlockPos(method7019.method25426(), 30, method7019.method25427());
        final BlockPos class1864 = new BlockPos(method7019.method25428(), class1862.method7012() + 16 - 1, method7019.method25429());
        BlockPos class1865 = null;
        double n = 0.0;
        for (final BlockPos class1866 : BlockPos.getAllInBoxMutable(class1863, class1864)) {
            final Class7096 method7020 = class1862.getBlockState(class1866);
            final BlockPos method7021 = class1866.method1137();
            final BlockPos method7022 = class1866.method1138(2);
            if (method7020.method21696() != Class7521.field29403) {
                continue;
            }
            if (class1862.getBlockState(method7021).isCollisionShapeOpaque(class1862, method7021)) {
                continue;
            }
            if (class1862.getBlockState(method7022).isCollisionShapeOpaque(class1862, method7022)) {
                continue;
            }
            final double method7023 = class1866.distanceSq(0.0, 0.0, 0.0, true);
            if (class1865 != null && method7023 >= n) {
                continue;
            }
            class1865 = class1866;
            n = method7023;
        }
        return class1865;
    }
    
    private void method2443(final Class1849 class1849, final BlockPos class1850) {
        Class4535.field20006.method13527(Class5116.method16014(this.getPos(), false)).method28613(class1849, (Class6346<? extends Class7065>)class1849.method6904().method7438(), new Random(), class1850);
    }
    
    @Override
    public boolean method2444(final Direction class179) {
        return Block.method11805(this.method2194(), this.field2656, this.getPos(), class179);
    }
    
    public int method2445() {
        int n = 0;
        final Direction[] values = Direction.values();
        for (int length = values.length, i = 0; i < length; ++i) {
            n += (this.method2444(values[i]) ? 1 : 0);
        }
        return n;
    }
    
    public void method2446(final BlockPos field2804, final boolean field2805) {
        this.field2805 = field2805;
        this.field2804 = field2804;
    }
    
    static {
        field2801 = LogManager.getLogger();
    }
}
