// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.IStringSerializable;

public enum Class110 implements IStringSerializable
{
    field347("compare"), 
    field348("subtract");
    
    private final String field349;
    
    private Class110(final String field349) {
        this.field349 = field349;
    }
    
    @Override
    public String toString() {
        return this.field349;
    }
    
    @Override
    public String getName() {
        return this.field349;
    }
}
