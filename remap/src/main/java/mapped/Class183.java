// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.IStringSerializable;

public enum Class183 implements IStringSerializable
{
    field567("straight"), 
    field568("inner_left"), 
    field569("inner_right"), 
    field570("outer_left"), 
    field571("outer_right");
    
    private final String field572;
    
    private Class183(final String field572) {
        this.field572 = field572;
    }
    
    @Override
    public String toString() {
        return this.field572;
    }
    
    @Override
    public String getName() {
        return this.field572;
    }
}
