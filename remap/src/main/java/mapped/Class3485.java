// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.chunk.ChunkStatus;
import net.minecraft.world.chunk.IChunk;

import javax.annotation.Nullable;
import java.util.Random;

public class Class3485 extends Class3479
{
    private static String[] field16413;
    private final Block field16414;
    private final Class759 field16415;
    private int field16416;
    
    public Class3485(final Block field16414, final Class787 field16415, final double n, final int n2) {
        super(field16415, n, 24, n2);
        this.field16414 = field16414;
        this.field16415 = field16415;
    }
    
    @Override
    public boolean method11013() {
        if (!this.field16415.world.method6765().method31216(Class8878.field37316)) {
            return false;
        }
        if (this.field16392 > 0) {
            --this.field16392;
            return false;
        }
        if (!this.method11052()) {
            this.field16392 = this.method11044(this.field16390);
            return false;
        }
        this.field16392 = 20;
        return true;
    }
    
    private boolean method11052() {
        return (this.field16395 != null && this.method11050(this.field16390.world, this.field16395)) || this.method11049();
    }
    
    @Override
    public void method11018() {
        super.method11018();
        this.field16415.fallDistance = 1.0f;
    }
    
    @Override
    public void method11015() {
        super.method11015();
        this.field16416 = 0;
    }
    
    public void method11053(final Class1851 class1851, final BlockPos class1852) {
    }
    
    public void method11054(final World class1847, final BlockPos class1848) {
    }
    
    @Override
    public void method11016() {
        super.method11016();
        final World field2391 = this.field16415.world;
        final BlockPos method11055 = this.method11055(new BlockPos(this.field16415), field2391);
        final Random method11056 = this.field16415.method2633();
        if (this.method11048()) {
            if (method11055 != null) {
                if (this.field16416 > 0) {
                    final Vec3d method11057 = this.field16415.getMotion();
                    this.field16415.setMotion(method11057.x, 0.3, method11057.z);
                    if (!field2391.isRemote) {
                        ((Class1849)field2391).method6911(new Class6910(Class8432.field34629, new ItemStack(Items.field31374)), method11055.getX() + 0.5, method11055.getY() + 0.7, method11055.getZ() + 0.5, 3, (method11056.nextFloat() - 0.5) * 0.08, (method11056.nextFloat() - 0.5) * 0.08, (method11056.nextFloat() - 0.5) * 0.08, 0.15000000596046448);
                    }
                }
                if (this.field16416 % 2 == 0) {
                    final Vec3d method11058 = this.field16415.getMotion();
                    this.field16415.setMotion(method11058.x, -0.3, method11058.z);
                    if (this.field16416 % 6 == 0) {
                        this.method11053(field2391, this.field16395);
                    }
                }
                if (this.field16416 > 60) {
                    field2391.method6690(method11055, false);
                    if (!field2391.isRemote) {
                        for (int i = 0; i < 20; ++i) {
                            ((Class1849)field2391).method6911(Class8432.field34636, method11055.getX() + 0.5, method11055.getY(), method11055.getZ() + 0.5, 1, method11056.nextGaussian() * 0.02, method11056.nextGaussian() * 0.02, method11056.nextGaussian() * 0.02, 0.15000000596046448);
                        }
                        this.method11054(field2391, method11055);
                    }
                }
                ++this.field16416;
            }
        }
    }
    
    @Nullable
    private BlockPos method11055(final BlockPos class354, final IBlockReader class355) {
        if (class355.getBlockState(class354).getBlock() != this.field16414) {
            for (final BlockPos class356 : new BlockPos[] { class354.method1139(), class354.method1145(), class354.method1147(), class354.method1141(), class354.method1143(), class354.method1139().method1139() }) {
                if (class355.getBlockState(class356).getBlock() == this.field16414) {
                    return class356;
                }
            }
            return null;
        }
        return class354;
    }
    
    @Override
    public boolean method11050(final Class1852 class1852, final BlockPos class1853) {
        final IChunk method6687 = class1852.getChunk(class1853.getX() >> 4, class1853.getZ() >> 4, ChunkStatus.FULL, false);
        if (method6687 != null) {
            if (method6687.getBlockState(class1853).getBlock() == this.field16414) {
                if (method6687.getBlockState(class1853.method1137()).method21706()) {
                    return method6687.getBlockState(class1853.method1138(2)).method21706();
                }
            }
            return false;
        }
        return false;
    }
}
