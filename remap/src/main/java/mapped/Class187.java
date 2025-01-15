// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.IStringSerializable;

public enum Class187 implements IStringSerializable
{
    field603, 
    field604;
    
    @Override
    public String toString() {
        return this.getName();
    }
    
    @Override
    public String getName() {
        return (this != Class187.field603) ? "right" : "left";
    }
}
