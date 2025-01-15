// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;

public interface ISelectionContext
{
    default ISelectionContext dummy() {
        return EntitySelectionContext.DUMMY;
    }
    
    default ISelectionContext forEntity(final Entity class399) {
        return new EntitySelectionContext(class399);
    }
    
    boolean func_225581_b_();
    
    boolean func_216378_a(final Class7702 p0, final BlockPos p1, final boolean p2);
    
    boolean hasItem(final Class3820 p0);
}
