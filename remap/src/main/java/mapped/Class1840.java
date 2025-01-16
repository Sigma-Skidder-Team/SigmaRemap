// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;

public class Class1840<T extends Entity, M extends Class5880<T>> extends Class1837<T, M>
{
    private static final Class6332 field10022;
    
    public Class1840(final Class4778<T, M> class4778) {
        super(class4778);
    }
    
    @Override
    public Class6332 method6606() {
        return Class1840.field10022;
    }
    
    static {
        field10022 = Class6332.method18779(new ResourceLocation("textures/entity/spider_eyes.png"));
    }
}
