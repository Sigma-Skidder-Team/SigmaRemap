// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.IStringSerializable;

public enum Class178 implements IStringSerializable
{
    field507("normal"), 
    field508("sticky");
    
    private final String field509;
    
    Class178(final String field509) {
        this.field509 = field509;
    }
    
    @Override
    public String toString() {
        return this.field509;
    }
    
    @Override
    public String getName() {
        return this.field509;
    }
}
