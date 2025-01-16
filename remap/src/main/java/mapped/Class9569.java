// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;

public class Class9569
{
    private final BlockPos field41172;
    private final Block field41173;
    private final int field41174;
    private final int field41175;
    
    public Class9569(final BlockPos field41172, final Block field41173, final int field41174, final int field41175) {
        this.field41172 = field41172;
        this.field41173 = field41173;
        this.field41174 = field41174;
        this.field41175 = field41175;
    }
    
    public BlockPos method35807() {
        return this.field41172;
    }
    
    public Block method35808() {
        return this.field41173;
    }
    
    public int method35809() {
        return this.field41174;
    }
    
    public int method35810() {
        return this.field41175;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o instanceof Class9569) {
            final Class9569 class9569 = (Class9569)o;
            if (this.field41172.equals(class9569.field41172)) {
                if (this.field41174 == class9569.field41174) {
                    if (this.field41175 == class9569.field41175) {
                        if (this.field41173 == class9569.field41173) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return 31 * (31 * (31 * this.field41172.hashCode() + this.field41173.hashCode()) + this.field41174) + this.field41175;
    }
    
    @Override
    public String toString() {
        return "TE(" + this.field41172 + ")," + this.field41174 + "," + this.field41175 + "," + this.field41173;
    }
}
