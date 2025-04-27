// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.IStringSerializable;

public enum Class109 implements IStringSerializable
{
    field343("top"), 
    field344("bottom");
    
    private final String field345;
    
    Class109(final String field345) {
        this.field345 = field345;
    }
    
    @Override
    public String toString() {
        return this.field345;
    }
    
    @Override
    public String getName() {
        return this.field345;
    }
}
