// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public abstract class Class785 extends Class787
{
    public Class785(final EntityType<? extends Class785> class7499, final World class7500) {
        super(class7499, class7500);
    }
    
    @Override
    public boolean method1705(final float n, final float n2) {
        return false;
    }
    
    @Nullable
    @Override
    public Class7795 method4160() {
        return null;
    }
    
    @Nullable
    @Override
    public Class7795 method2683(final DamageSource class7929) {
        return null;
    }
    
    @Nullable
    @Override
    public Class7795 method2684() {
        return null;
    }
    
    @Override
    public int method4155() {
        return 120;
    }
    
    @Override
    public boolean method4168(final double n) {
        return false;
    }
}
