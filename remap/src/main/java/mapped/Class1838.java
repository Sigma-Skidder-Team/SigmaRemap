// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;

public class Class1838<T extends Entity> extends Class1837<T, Class5891<T>>
{
    private static final Class6332 field10020;
    
    public Class1838(final Class4778<T, Class5891<T>> class4778) {
        super(class4778);
    }
    
    @Override
    public Class6332 method6606() {
        return Class1838.field10020;
    }
    
    static {
        field10020 = Class6332.method18779(new Class1932("textures/entity/phantom_eyes.png"));
    }
}
