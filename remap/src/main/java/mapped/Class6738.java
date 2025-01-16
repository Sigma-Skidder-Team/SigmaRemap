// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionType;

import java.util.Random;
import javax.annotation.Nullable;

public class Class6738 extends Dimension
{
    public static final BlockPos field26498;
    private final Class8619 field26499;
    
    public Class6738(final World class1847, final DimensionType class1848) {
        super(class1847, class1848, 0.0f);
        final CompoundNBT method29603 = class1847.method6764().method29603(DimensionType.field2225);
        this.field26499 = ((class1847 instanceof Class1849) ? new Class8619((Class1849)class1847, method29603.getCompound("DragonFight")) : null);
    }
    
    @Override
    public Class6346<?> method20488() {
        final Class7069 class7069 = Class8705.field36576.method29874();
        class7069.method21584(Blocks.field29403.getDefaultState());
        class7069.method21585(Blocks.AIR.getDefaultState());
        class7069.method21619(this.method20500());
        return Class8705.field36576.method29872(this.field26492, Class7768.field31771.method24875(Class7768.field31771.method24876(this.field26492.method6764())), class7069);
    }
    
    @Override
    public float method20491(final long n, final float n2) {
        return 0.0f;
    }
    
    @Nullable
    @Override
    public float[] method20497(final float n, final float n2) {
        return null;
    }
    
    @Override
    public Vec3d method20493(final float n, final float n2) {
        final float method35653 = MathHelper.clamp(MathHelper.cos(n * 6.2831855f) * 2.0f + 0.5f, 0.0f, 1.0f);
        return new Vec3d(0.627451f * (method35653 * 0.0f + 0.15f), 0.5019608f * (method35653 * 0.0f + 0.15f), 0.627451f * (method35653 * 0.0f + 0.15f));
    }
    
    @Override
    public boolean method20499() {
        return false;
    }
    
    @Override
    public boolean method20494() {
        return false;
    }
    
    @Override
    public boolean method20492() {
        return false;
    }
    
    @Override
    public float method20498() {
        return 8.0f;
    }
    
    @Nullable
    @Override
    public BlockPos method20489(final ChunkPos class7859, final boolean b) {
        final Random random = new Random(this.field26492.method6753());
        final BlockPos class7860 = new BlockPos(class7859.method25426() + random.nextInt(15), 0, class7859.method25429() + random.nextInt(15));
        return this.field26492.getGroundAboveSeaLevel(class7860).method21697().method26440() ? class7860 : null;
    }
    
    @Override
    public BlockPos method20500() {
        return Class6738.field26498;
    }
    
    @Nullable
    @Override
    public BlockPos method20490(final int n, final int n2, final boolean b) {
        return this.method20489(new ChunkPos(n >> 4, n2 >> 4), b);
    }
    
    @Override
    public boolean method20495(final int n, final int n2) {
        return false;
    }
    
    @Override
    public DimensionType getType() {
        return DimensionType.field2225;
    }
    
    @Override
    public void method20507() {
        final CompoundNBT class51 = new CompoundNBT();
        if (this.field26499 != null) {
            class51.put("DragonFight", this.field26499.method29234());
        }
        this.field26492.method6764().method29604(DimensionType.field2225, class51);
    }
    
    @Override
    public void method20508() {
        if (this.field26499 != null) {
            this.field26499.method29235();
        }
    }
    
    @Nullable
    public Class8619 method20509() {
        return this.field26499;
    }
    
    static {
        field26498 = new BlockPos(100, 50, 0);
    }
}
