// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Predicate;
import javax.annotation.Nullable;

public class Class7990
{
    private static String[] field32893;
    private final Class1852 field32894;
    private final BlockPos field32895;
    private final boolean field32896;
    private BlockState field32897;
    private TileEntity field32898;
    private boolean field32899;
    
    public Class7990(final Class1852 field32894, final BlockPos class354, final boolean field32895) {
        this.field32894 = field32894;
        this.field32895 = class354.toImmutable();
        this.field32896 = field32895;
    }
    
    public BlockState method26065() {
        if (this.field32897 == null) {
            if (this.field32896 || this.field32894.method6971(this.field32895)) {
                this.field32897 = this.field32894.getBlockState(this.field32895);
            }
        }
        return this.field32897;
    }
    
    @Nullable
    public TileEntity method26066() {
        if (this.field32898 == null) {
            if (!this.field32899) {
                this.field32898 = this.field32894.method6727(this.field32895);
                this.field32899 = true;
            }
        }
        return this.field32898;
    }
    
    public Class1852 method26067() {
        return this.field32894;
    }
    
    public BlockPos method26068() {
        return this.field32895;
    }
    
    public static Predicate<Class7990> method26069(final Predicate<BlockState> predicate) {
        return class7990 -> class7990 != null && predicate2.test(class7990.method26065());
    }
}
