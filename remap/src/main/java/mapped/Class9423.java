// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;

public class Class9423
{
    private static String[] field40422;
    
    public static EntityType method35021(final ResourceLocation class1932) {
        return Registry.field210.method510(class1932) ? Registry.field210.getOrDefault(class1932) : null;
    }
}
