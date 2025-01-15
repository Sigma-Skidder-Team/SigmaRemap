// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;

public class Class4738 extends Class4712<Class854, Class5875<Class854>>
{
    private static final Class1932 field20354;
    
    public Class4738(final Class8551 class8551) {
        super(class8551, new Class5875(), 0.25f);
    }
    
    public int method14059(final Class854 class854, final float n) {
        return 15;
    }
    
    public Class1932 method14060(final Class854 class854) {
        return Class4738.field20354;
    }
    
    public void method14061(final Class854 class854, final Class7351 class855, final float n) {
        final int method5130 = class854.method5130();
        final float n2 = 1.0f / (MathHelper.method35700(n, class854.field4559, class854.field4558) / (method5130 * 0.5f + 1.0f) + 1.0f);
        class855.method22565(n2 * method5130, 1.0f / n2 * method5130, n2 * method5130);
    }
    
    static {
        field20354 = new Class1932("textures/entity/slime/magmacube.png");
    }
}
