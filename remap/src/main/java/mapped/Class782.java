// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class Class782 extends Class780
{
    private static String[] field4192;
    
    public Class782(final EntityType<? extends Class782> class7499, final World class7500) {
        super(class7499, class7500);
    }
    
    @Override
    public Class7795 method4160() {
        return Class8520.field35564;
    }
    
    @Override
    public Class7795 method2683(final DamageSource class7929) {
        return Class8520.field35574;
    }
    
    @Override
    public Class7795 method2684() {
        return Class8520.field35565;
    }
    
    @Override
    public Class7795 method4328() {
        return Class8520.field35576;
    }
    
    @Override
    public void method2678(final DamageSource class7929, final int n, final boolean b) {
        super.method2678(class7929, n, b);
        final Entity method25714 = class7929.method25714();
        if (method25714 instanceof Class765) {
            final Class765 class7930 = (Class765)method25714;
            if (class7930.method4241()) {
                class7930.method4242();
                this.method1764(Items.field31523);
            }
        }
    }
}