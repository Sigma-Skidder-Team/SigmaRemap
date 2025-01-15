// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntitySize;
import net.minecraft.entity.Pose;
import net.minecraft.util.DamageSource;

public class Class859 extends Entity
{
    private static String[] field4593;
    public final Class852 field4594;
    public final String field4595;
    private final EntitySize field4596;
    
    public Class859(final Class852 field4594, final String field4595, final float n, final float n2) {
        super(field4594.getType(), field4594.world);
        this.field4596 = EntitySize.method27563(n, n2);
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
    public boolean attackEntityFrom(final DamageSource class7929, final float n) {
        return !this.method1849(class7929) && this.field4594.method5116(this, class7929, n);
    }
    
    @Override
    public boolean method1843(final Entity class399) {
        return this == class399 || this.field4594 == class399;
    }
    
    @Override
    public IPacket<?> method1932() {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public EntitySize method1933(final Pose class290) {
        return this.field4596;
    }
}
