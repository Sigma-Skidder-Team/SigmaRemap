// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.IStringSerializable;

public enum Class106 implements IStringSerializable
{
    field327("up"), 
    field328("side"), 
    field329("none");
    
    private final String field330;
    
    private Class106(final String field330) {
        this.field330 = field330;
    }
    
    @Override
    public String toString() {
        return this.getName();
    }
    
    @Override
    public String getName() {
        return this.field330;
    }
}
