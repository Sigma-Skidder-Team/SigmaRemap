// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;

public class Class1839<T extends LivingEntity> extends Class1837<T, Class5868<T>>
{
    private static final Class6332 field10021;
    
    public Class1839(final Class4778<T, Class5868<T>> class4778) {
        super(class4778);
    }
    
    @Override
    public Class6332 method6606() {
        return Class1839.field10021;
    }
    
    static {
        field10021 = Class6332.method18779(new ResourceLocation("textures/entity/enderman/enderman_eyes.png"));
    }
}
