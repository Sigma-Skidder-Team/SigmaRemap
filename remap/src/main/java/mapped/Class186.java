// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.IStringSerializable;

public enum Class186 implements IStringSerializable
{
    field598("top"), 
    field599("bottom"), 
    field600("double");
    
    private final String field601;
    
    Class186(final String field601) {
        this.field601 = field601;
    }
    
    @Override
    public String toString() {
        return this.field601;
    }
    
    @Override
    public String getName() {
        return this.field601;
    }
}
