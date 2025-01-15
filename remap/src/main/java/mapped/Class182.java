// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.IStringSerializable;

public enum Class182 implements IStringSerializable
{
    field564, 
    field565;
    
    @Override
    public String toString() {
        return this.getName();
    }
    
    @Override
    public String getName() {
        return (this != Class182.field564) ? "lower" : "upper";
    }
}
