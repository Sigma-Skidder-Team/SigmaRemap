// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;

public class Class7587
{
    public final int field30106;
    public final int field30107;
    
    public Class7587(final int field30106, final int field30107) {
        this.field30106 = field30106;
        this.field30107 = field30107;
    }
    
    public Class7587(final BlockPos class354) {
        this.field30106 = class354.getX();
        this.field30107 = class354.getZ();
    }
    
    @Override
    public String toString() {
        return "[" + this.field30106 + ", " + this.field30107 + "]";
    }
    
    @Override
    public int hashCode() {
        return 1664525 * this.field30106 + 1013904223 ^ 1664525 * (this.field30107 ^ 0xDEADBEEF) + 1013904223;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof Class7587) {
            final Class7587 class7587 = (Class7587)o;
            return this.field30106 == class7587.field30106 && this.field30107 == class7587.field30107;
        }
        return false;
    }
}
