// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.DamageSource;

public abstract class Class5791 extends Class5784
{
    public Class5791(final Class852 class852) {
        super(class852);
    }
    
    @Override
    public boolean method17245() {
        return true;
    }
    
    @Override
    public float method17255(final DamageSource class7929, final float n) {
        if (!(class7929.method25713() instanceof Class402)) {
            return super.method17255(class7929, n);
        }
        class7929.method25713().setFire(1);
        return 0.0f;
    }
}
