// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;

public class Class8045 implements Class8046<String>
{
    private static String[] field33114;
    
    public String method26389(final ResourceLocation class1932) {
        final EntityType method35021 = Class9423.method35021(class1932);
        return (method35021 != null) ? method35021.method23366() : null;
    }
    
    public static String method26390(final Entity class399) {
        return class399.getType().method23366();
    }
}
