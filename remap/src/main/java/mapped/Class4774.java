// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;

public class Class4774 extends Class4712<Class765, Class5881<Class765>>
{
    private static final Class1932 field20404;
    
    public Class4774(final Class8551 class8551) {
        super(class8551, new Class5881(), 0.5f);
        this.method13978(new Class1806(this));
    }
    
    public void method14129(final Class765 class765, final Class7351 class766, final float n) {
        final float method4234 = class765.method4234(n);
        final float n2 = 1.0f + MathHelper.sin(method4234 * 100.0f) * method4234 * 0.01f;
        final float method4235 = MathHelper.method35653(method4234, 0.0f, 1.0f);
        final float n3 = method4235 * method4235;
        final float n4 = n3 * n3;
        final float n5 = (1.0f + n4 * 0.4f) * n2;
        class766.method22565(n5, (1.0f + n4 * 0.1f) / n2, n5);
    }
    
    public float method14130(final Class765 class765, final float n) {
        final float method4234 = class765.method4234(n);
        return ((int)(method4234 * 10.0f) % 2 != 0) ? MathHelper.method35653(method4234, 0.5f, 1.0f) : 0.0f;
    }
    
    public Class1932 method14131(final Class765 class765) {
        return Class4774.field20404;
    }
    
    static {
        field20404 = new Class1932("textures/entity/creeper/creeper.png");
    }
}
