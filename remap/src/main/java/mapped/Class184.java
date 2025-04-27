// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.IStringSerializable;

public enum Class184 implements IStringSerializable
{
    field574("none"), 
    field575("small"), 
    field576("large");
    
    private final String field577;
    
    Class184(final String field577) {
        this.field577 = field577;
    }
    
    @Override
    public String toString() {
        return this.field577;
    }
    
    @Override
    public String getName() {
        return this.field577;
    }
}
