// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.IStringSerializable;

public enum Class108 implements IStringSerializable
{
    field337("floor"), 
    field338("ceiling"), 
    field339("single_wall"), 
    field340("double_wall");
    
    private final String field341;
    
    private Class108(final String field341) {
        this.field341 = field341;
    }
    
    @Override
    public String getName() {
        return this.field341;
    }
}
