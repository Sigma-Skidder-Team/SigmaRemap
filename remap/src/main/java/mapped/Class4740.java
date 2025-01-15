// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.client.renderer.Vector3f;

public class Class4740 extends Class4712<Class786, Class5874<Class786>>
{
    private static final Class1932 field20356;
    
    public Class4740(final Class8551 class8551) {
        super(class8551, new Class5874(), 0.7f);
        this.method13978(new Class1810(this));
        this.method13978(new Class1832(this));
    }
    
    public Class1932 method14064(final Class786 class786) {
        return Class4740.field20356;
    }
    
    public void method14065(final Class786 class786, final Class7351 class787, final float n, final float n2, final float n3) {
        super.method13985(class786, class787, n, n2, n3);
        if (class786.field2946 >= 0.01) {
            class787.method22566(Vector3f.ZP.rotationDegrees(6.5f * ((Math.abs((class786.field2947 - class786.field2946 * (1.0f - n3) + 6.0f) % 13.0f - 6.5f) - 3.25f) / 3.25f)));
        }
    }
    
    static {
        field20356 = new Class1932("textures/entity/iron_golem/iron_golem.png");
    }
}
