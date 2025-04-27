// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.IStringSerializable;

public enum Class102 implements IStringSerializable
{
    field305("save"), 
    field306("load"), 
    field307("corner"), 
    field308("data");
    
    private final String field309;
    
    Class102(final String field309) {
        this.field309 = field309;
    }
    
    @Override
    public String getName() {
        return this.field309;
    }
}
