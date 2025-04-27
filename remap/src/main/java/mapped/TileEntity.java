// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.util.Supplier;
import javax.annotation.Nullable;
import org.apache.logging.log4j.Logger;

public abstract class TileEntity
{
    private static final Logger field2654;
    private final Class5412<?> field2655;
    public World field2656;
    public BlockPos field2657;
    public boolean field2658;
    private BlockState field2659;
    private boolean field2660;
    
    public TileEntity(final Class5412<?> field2655) {
        this.field2657 = BlockPos.ZERO;
        this.field2655 = field2655;
    }
    
    @Nullable
    public World method2186() {
        return this.field2656;
    }
    
    public void method2187(final World field2656, final BlockPos class354) {
        this.field2656 = field2656;
        this.field2657 = class354.toImmutable();
    }
    
    public boolean hasWorld() {
        return this.field2656 != null;
    }
    
    public void method2179(final CompoundNBT class51) {
        this.field2657 = new BlockPos(class51.getInt("x"), class51.getInt("y"), class51.getInt("z"));
    }
    
    public CompoundNBT method2180(final CompoundNBT class51) {
        return this.method2189(class51);
    }
    
    private CompoundNBT method2189(final CompoundNBT class51) {
        final ResourceLocation method16520 = Class5412.method16520(this.getType());
        if (method16520 != null) {
            class51.putString("id", method16520.toString());
            class51.putInt("x", this.field2657.getX());
            class51.putInt("y", this.field2657.getY());
            class51.putInt("z", this.field2657.getZ());
            return class51;
        }
        throw new RuntimeException(this.getClass() + " is missing a mapping! This is a bug!");
    }
    
    @Nullable
    public static TileEntity method2190(final CompoundNBT class51) {
        return Registry.field224.method506(new ResourceLocation(class51.getString("id"))).map(class52 -> {
            try {
                return class52.method16522();
            }
            catch (final Throwable t) {
                TileEntity.field2654.error("Failed to create block entity {}", (Object)s, t);
                return null;
            }
        }).map(class54 -> {
            try {
                class54.method2179(class53);
                return class54;
            }
            catch (final Throwable t2) {
                TileEntity.field2654.error("Failed to load data for block entity {}", (Object)s2, t2);
                return null;
            }
        }).orElseGet(() -> {
            TileEntity.field2654.warn("Skipping BlockEntity with id {}", (Object)s3);
            return null;
        });
    }
    
    public void method2161() {
        if (this.field2656 != null) {
            this.field2659 = this.field2656.getBlockState(this.field2657);
            this.field2656.method6742(this.field2657, this);
            if (!this.field2659.method21706()) {
                this.field2656.method6783(this.field2657, this.field2659.getBlock());
            }
        }
    }
    
    public double method2191(final double n, final double n2, final double n3) {
        final double n4 = this.field2657.getX() + 0.5 - n;
        final double n5 = this.field2657.getY() + 0.5 - n2;
        final double n6 = this.field2657.getZ() + 0.5 - n3;
        return n4 * n4 + n5 * n5 + n6 * n6;
    }
    
    public double method2192() {
        return 4096.0;
    }
    
    public BlockPos getPos() {
        return this.field2657;
    }
    
    public BlockState method2194() {
        if (this.field2659 == null) {
            this.field2659 = this.field2656.getBlockState(this.field2657);
        }
        return this.field2659;
    }
    
    @Nullable
    public Class4357 method2195() {
        return null;
    }
    
    public CompoundNBT method2196() {
        return this.method2189(new CompoundNBT());
    }
    
    public boolean isRemoved() {
        return this.field2658;
    }
    
    public void method2198() {
        this.field2658 = true;
    }
    
    public void method2199() {
        this.field2658 = false;
    }
    
    public boolean method2200(final int n, final int n2) {
        return false;
    }
    
    public void method2201() {
        this.field2659 = null;
    }
    
    public void method2202(final CrashReportCategory class5204) {
        class5204.addDetail("Name", () -> Registry.field224.getKey(this.getType()) + " // " + this.getClass().getCanonicalName());
        if (this.field2656 != null) {
            CrashReportCategory.method16304(class5204, this.field2657, this.method2194());
            CrashReportCategory.method16304(class5204, this.field2657, this.field2656.getBlockState(this.field2657));
        }
    }
    
    public void method2203(final BlockPos class354) {
        this.field2657 = class354.toImmutable();
    }
    
    public boolean method2178() {
        return false;
    }
    
    public void method2204(final Class2052 class2052) {
    }
    
    public void method2205(final Class2181 class2181) {
    }
    
    public Class5412<?> getType() {
        return this.field2655;
    }
    
    public void method2207() {
        if (!this.field2660) {
            this.field2660 = true;
            TileEntity.field2654.warn("Block entity invalid: {} @ {}", () -> Registry.field224.getKey(this.getType()), this::getPos);
        }
    }
    
    static {
        field2654 = LogManager.getLogger();
    }
}
