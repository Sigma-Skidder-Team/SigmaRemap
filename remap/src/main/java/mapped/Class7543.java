// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;

public interface Class7543
{
    default Class7543 method23629() {
        return Class7542.field29924;
    }
    
    default Class7543 method23630(final Entity class399) {
        return new Class7542(class399);
    }
    
    boolean method23628();
    
    boolean method23626(final Class7702 p0, final BlockPos p1, final boolean p2);
    
    boolean method23627(final Class3820 p0);
}
