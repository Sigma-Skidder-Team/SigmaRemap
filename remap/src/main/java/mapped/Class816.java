// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class Class816 extends Class815
{
    private int field4375;
    
    public Class816(final EntityType<? extends Class816> class7499, final World class7500) {
        super(class7499, class7500);
        this.field4375 = 47999;
    }
    
    @Override
    public boolean method4784() {
        return true;
    }
    
    @Override
    public Class815 method4794() {
        return EntityType.field29033.method23371(this.world);
    }
    
    @Override
    public void method1761(final Class51 class51) {
        super.method1761(class51);
        class51.method298("DespawnDelay", this.field4375);
    }
    
    @Override
    public void method1760(final Class51 class51) {
        super.method1760(class51);
        if (class51.method316("DespawnDelay", 99)) {
            this.field4375 = class51.method319("DespawnDelay");
        }
    }
    
    @Override
    public void method4142() {
        super.method4142();
        this.field4114.method22062(1, new Class3607(this, 2.0));
        this.field4115.method22062(1, new Class3553(this, this));
    }
    
    @Override
    public void method4742(final Class512 class512) {
        if (!(this.method4206() instanceof Class821)) {
            super.method4742(class512);
        }
    }
    
    @Override
    public void method2736() {
        super.method2736();
        if (!this.world.isRemote) {
            this.method4804();
        }
    }
    
    private void method4804() {
        if (this.method4805()) {
            this.field4375 = (this.method4806() ? (((Class821)this.method4206()).method4842() - 1) : (this.field4375 - 1));
            if (this.field4375 <= 0) {
                this.method4203(true, false);
                this.method1652();
            }
        }
    }
    
    private boolean method4805() {
        if (!this.method4715()) {
            if (!this.method4807()) {
                if (!this.method1913()) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private boolean method4806() {
        return this.method4206() instanceof Class821;
    }
    
    private boolean method4807() {
        return this.method4205() && !this.method4806();
    }
    
    @Nullable
    @Override
    public Class5496 method4188(final Class1851 class1851, final Class9592 class1852, final Class2101 class1853, Class5496 class1854, final Class51 class1855) {
        if (class1853 == Class2101.field12181) {
            this.method4354(0);
        }
        if (class1854 == null) {
            class1854 = new Class5497();
            ((Class5497)class1854).method16801(false);
        }
        return super.method4188(class1851, class1852, class1853, class1854, class1855);
    }
}
