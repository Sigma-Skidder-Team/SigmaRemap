// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.IStringSerializable;

public enum Class105 implements IStringSerializable
{
    field323("head"), 
    field324("foot");
    
    private final String field325;
    
    private Class105(final String field325) {
        this.field325 = field325;
    }
    
    @Override
    public String toString() {
        return this.field325;
    }
    
    @Override
    public String getName() {
        return this.field325;
    }
}
