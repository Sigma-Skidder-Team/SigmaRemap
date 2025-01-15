// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;

public final class Class5327 extends Class5328
{
    private static String[] field22361;
    
    public Class5327(final Class2069 class2069, final int n) {
        super(class2069, n);
    }
    
    @Override
    public boolean method16448(final int n, final int n2) {
        return true;
    }
    
    @Override
    public void method16449(final LivingEntity class511, final int n) {
        if (class511 instanceof Class513) {
            if (!class511.isSpectator()) {
                final Class513 class512 = (Class513)class511;
                final Class1849 method2940 = class512.method2940();
                if (method2940.method6954() == Class2113.field12290) {
                    return;
                }
                if (method2940.method6922(new BlockPos(class511))) {
                    method2940.method6926().method18928(class512);
                }
            }
        }
    }
}
