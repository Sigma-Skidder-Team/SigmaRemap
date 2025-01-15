// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public abstract class Class832 extends Class787
{
    public Class832(final EntityType<? extends Class832> class7499, final World class7500) {
        super(class7499, class7500);
        this.method4145(Class257.field1211, 0.0f);
    }
    
    @Override
    public boolean method2622() {
        return true;
    }
    
    @Override
    public Class6363 method2712() {
        return Class6363.field25464;
    }
    
    @Override
    public boolean method4180(final Class1852 class1852) {
        return class1852.method6975(this);
    }
    
    @Override
    public int method4155() {
        return 120;
    }
    
    @Override
    public int method2631(final Class512 class512) {
        return 1 + this.world.rand.nextInt(3);
    }
    
    public void method4951(final int n) {
        if (this.method1768() && !this.method1711()) {
            this.setAir(n - 1);
            if (this.getAir() == -20) {
                this.setAir(0);
                this.attackEntityFrom(DamageSource.field32569, 2.0f);
            }
        }
        else {
            this.setAir(300);
        }
    }
    
    @Override
    public void method1660() {
        final int method1832 = this.getAir();
        super.method1660();
        this.method4951(method1832);
    }
    
    @Override
    public boolean method1868() {
        return false;
    }
    
    @Override
    public boolean method4204(final Class512 class512) {
        return false;
    }
}
