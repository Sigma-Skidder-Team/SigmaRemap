// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.IStringSerializable;

public enum Class107 implements IStringSerializable
{
    field332("floor"), 
    field333("wall"), 
    field334("ceiling");
    
    private final String field335;
    
    Class107(final String field335) {
        this.field335 = field335;
    }
    
    @Override
    public String getName() {
        return this.field335;
    }
}
