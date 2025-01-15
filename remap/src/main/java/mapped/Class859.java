// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;

public class Class859 extends Entity
{
    private static String[] field4593;
    public final Class852 field4594;
    public final String field4595;
    private final Class8295 field4596;
    
    public Class859(final Class852 field4594, final String field4595, final float n, final float n2) {
        super(field4594.method1642(), field4594.field2391);
        this.field4596 = Class8295.method27563(n, n2);
        this.method1881();
        this.field4594 = field4594;
        this.field4595 = field4595;
    }
    
    @Override
    public void method1649() {
    }
    
    @Override
    public void method1760(final Class51 class51) {
    }
    
    @Override
    public void method1761(final Class51 class51) {
    }
    
    @Override
    public boolean method1749() {
        return true;
    }
    
    @Override
    public boolean method1740(final Class7929 class7929, final float n) {
        return !this.method1849(class7929) && this.field4594.method5116(this, class7929, n);
    }
    
    @Override
    public boolean method1843(final Entity class399) {
        return this == class399 || this.field4594 == class399;
    }
    
    @Override
    public Class4252<?> method1932() {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public Class8295 method1933(final Class290 class290) {
        return this.field4596;
    }
}
