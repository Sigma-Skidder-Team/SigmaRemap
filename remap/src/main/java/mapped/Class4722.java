// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.client.renderer.Vector3f;
import net.minecraft.entity.Entity;

public class Class4722 extends Class4712<Class851, Class5891<Class851>>
{
    private static final Class1932 field20325;
    
    public Class4722(final Class8551 class8551) {
        super(class8551, new Class5891(), 0.75f);
        this.method13978((Class1799<Class851, Class5891<Class851>>)new Class1838((Class4778<Entity, Class5891<Entity>>)this));
    }
    
    public Class1932 method14031(final Class851 class851) {
        return Class4722.field20325;
    }
    
    public void method14032(final Class851 class851, final Class7351 class852, final float n) {
        final float n2 = 1.0f + 0.15f * class851.method5089();
        class852.method22565(n2, n2, n2);
        class852.method22564(0.0, 1.3125, 0.1875);
    }
    
    public void method14033(final Class851 class851, final Class7351 class852, final float n, final float n2, final float n3) {
        super.method13985(class851, class852, n, n2, n3);
        class852.method22566(Vector3f.XP.rotationDegrees(class851.rotationPitch));
    }
    
    static {
        field20325 = new Class1932("textures/entity/phantom.png");
    }
}
