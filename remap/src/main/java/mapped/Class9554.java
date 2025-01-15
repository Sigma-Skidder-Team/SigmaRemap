// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;

public final class Class9554
{
    private static String[] field41140;
    private BlockState field41141;
    private BlockState field41142;
    private Direction field41143;
    private int field41144;
    
    private Class9554(final BlockState field41141, final BlockState field41142, final Direction field41143) {
        this.field41141 = field41141;
        this.field41142 = field41142;
        this.field41143 = field41143;
    }
    
    private void method35743(final BlockState field41141, final BlockState field41142, final Direction field41143) {
        this.field41141 = field41141;
        this.field41142 = field41142;
        this.field41143 = field41143;
        this.field41144 = 0;
    }
    
    public Class9554 method35744() {
        return new Class9554(this.field41141, this.field41142, this.field41143);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof Class9554) {
            final Class9554 class9554 = (Class9554)o;
            if (this.field41141 == class9554.field41141) {
                if (this.field41142 == class9554.field41142) {
                    if (this.field41143 == class9554.field41143) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        if (this.field41144 == 0) {
            this.field41144 = 31 * this.field41144 + this.field41141.hashCode();
            this.field41144 = 31 * this.field41144 + this.field41142.hashCode();
            this.field41144 = 31 * this.field41144 + this.field41143.hashCode();
        }
        return this.field41144;
    }
}
