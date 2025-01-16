// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.World;

import java.util.stream.Stream;
import java.util.Set;
import java.util.Random;

public interface Class1851 extends Class1874, Class1852, Class1875
{
    long method6753();
    
    default float method6951() {
        return Dimension.field26491[this.method6789().method20496(this.method6764().method29540())];
    }
    
    default float method6952(final float n) {
        return this.method6789().method20491(this.method6764().method29540(), n);
    }
    
    default int method6953() {
        return this.method6789().method20496(this.method6764().method29540());
    }
    
    Class6952<Block> method6833();
    
    Class6952<Class7255> method6834();
    
    World method6744();
    
    WorldInfo method6764();
    
    Class9592 method6784(final BlockPos p0);
    
    default Class2113 method6954() {
        return this.method6764().method29597();
    }
    
    AbstractChunkProvider getChunkProvider();
    
    default boolean method6814(final int n, final int n2) {
        return this.getChunkProvider().method7401(n, n2);
    }
    
    Random method6790();
    
    void method6694(final BlockPos p0, final Block p1);
    
    BlockPos method6758();
    
    void method6705(final Class512 p0, final BlockPos p1, final Class7795 p2, final Class286 p3, final float p4, final float p5);
    
    void method6709(final Class6909 p0, final double p1, final double p2, final double p3, final double p4, final double p5, final double p6);
    
    void method6839(final Class512 p0, final int p1, final BlockPos p2, final int p3);
    
    default void method6955(final int n, final BlockPos class354, final int n2) {
        this.method6839(null, n, class354, n2);
    }
    
    default Stream<VoxelShape> method6956(final Entity class399, final AxisAlignedBB class400, final Set<Entity> set) {
        return super.method6956(class399, class400, set);
    }
    
    default boolean method6957(final Entity class399, final VoxelShape class400) {
        return super.method6957(class399, class400);
    }
    
    default BlockPos method6958(final Class2020 class2020, final BlockPos class2021) {
        return super.method6958(class2020, class2021);
    }
}
