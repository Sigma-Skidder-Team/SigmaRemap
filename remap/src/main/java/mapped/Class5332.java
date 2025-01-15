// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;

public class Class5332 extends Class5328
{
    private static String[] field22370;
    
    public Class5332(final Class2069 class2069, final int n) {
        super(class2069, n);
    }
    
    @Override
    public void method16461(final LivingEntity class511, final Class6821 class512, final int n) {
        class511.method2751(class511.method2750() - 4 * (n + 1));
        super.method16461(class511, class512, n);
    }
    
    @Override
    public void method16462(final LivingEntity class511, final Class6821 class512, final int n) {
        class511.method2751(class511.method2750() + 4 * (n + 1));
        super.method16462(class511, class512, n);
    }
}
