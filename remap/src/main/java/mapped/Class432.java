// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;

public class Class432 extends Class428
{
    private int field2644;
    
    public Class432(final Class7499<? extends Class432> class7499, final Class1847 class7500) {
        super(class7499, class7500);
        this.field2644 = -1;
    }
    
    public Class432(final Class1847 class1847, final double n, final double n2, final double n3) {
        super(Class7499.field29005, class1847, n, n2, n3);
        this.field2644 = -1;
    }
    
    @Override
    public Class2080 method2139() {
        return Class2080.field12027;
    }
    
    @Override
    public Class7096 method2141() {
        return Class7521.field29283.method11878();
    }
    
    @Override
    public void method1659() {
        super.method1659();
        if (this.field2644 <= 0) {
            if (this.field2644 == 0) {
                this.method2152(Entity.method1680(this.method1935()));
            }
        }
        else {
            --this.field2644;
            this.field2391.method6709(Class8432.field34639, this.method1938(), this.method1941() + 0.5, this.method1945(), 0.0, 0.0, 0.0);
        }
        if (this.field2405) {
            final double method1680 = Entity.method1680(this.method1935());
            if (method1680 >= 0.009999999776482582) {
                this.method2152(method1680);
            }
        }
    }
    
    @Override
    public boolean method1740(final Class7929 class7929, final float n) {
        final Entity method25713 = class7929.method25713();
        if (method25713 instanceof Class402) {
            final Class402 class7930 = (Class402)method25713;
            if (class7930.method1804()) {
                this.method2152(class7930.method1935().method16753());
            }
        }
        return super.method1740(class7929, n);
    }
    
    @Override
    public void method2123(final Class7929 class7929) {
        final double method1680 = Entity.method1680(this.method1935());
        if (!class7929.method25719()) {
            if (!class7929.method25707()) {
                if (method1680 < 0.009999999776482582) {
                    super.method2123(class7929);
                    if (class7929.method25707()) {
                        return;
                    }
                    if (!this.field2391.method6765().method31216(Class8878.field37321)) {
                        return;
                    }
                    this.method1764(Class7521.field29283);
                    return;
                }
            }
        }
        if (this.field2644 < 0) {
            this.method2153();
            this.field2644 = this.field2423.nextInt(20) + this.field2423.nextInt(20);
        }
    }
    
    public void method2152(final double a) {
        if (!this.field2391.field10067) {
            double sqrt = Math.sqrt(a);
            if (sqrt > 5.0) {
                sqrt = 5.0;
            }
            this.field2391.method6722(this, this.method1938(), this.method1941(), this.method1945(), (float)(4.0 + this.field2423.nextDouble() * 1.5 * sqrt), Class2196.field13366);
            this.method1652();
        }
    }
    
    @Override
    public boolean method1705(final float n, final float n2) {
        if (n >= 3.0f) {
            final float n3 = n / 10.0f;
            this.method2152(n3 * n3);
        }
        return super.method1705(n, n2);
    }
    
    @Override
    public void method2126(final int n, final int n2, final int n3, final boolean b) {
        if (b) {
            if (this.field2644 < 0) {
                this.method2153();
            }
        }
    }
    
    @Override
    public void method1798(final byte b) {
        if (b != 10) {
            super.method1798(b);
        }
        else {
            this.method2153();
        }
    }
    
    public void method2153() {
        this.field2644 = 80;
        if (!this.field2391.field10067) {
            this.field2391.method6761(this, (byte)10);
            if (!this.method1696()) {
                this.field2391.method6706(null, this.method1938(), this.method1941(), this.method1945(), Class8520.field35632, Class286.field1582, 1.0f, 1.0f);
            }
        }
    }
    
    public int method2154() {
        return this.field2644;
    }
    
    public boolean method2155() {
        return this.field2644 > -1;
    }
    
    @Override
    public float method1856(final Class6154 class6154, final Class1855 class6155, final BlockPos class6156, final Class7096 class6157, final Class7099 class6158, final float n) {
        return (this.method2155() && (class6157.method21755(Class7188.field27906) || class6155.method6701(class6156.method1137()).method21755(Class7188.field27906))) ? 0.0f : super.method1856(class6154, class6155, class6156, class6157, class6158, n);
    }
    
    @Override
    public boolean method1857(final Class6154 class6154, final Class1855 class6155, final BlockPos class6156, final Class7096 class6157, final float n) {
        return (!this.method2155() || (!class6157.method21755(Class7188.field27906) && !class6155.method6701(class6156.method1137()).method21755(Class7188.field27906))) && super.method1857(class6154, class6155, class6156, class6157, n);
    }
    
    @Override
    public void method1760(final Class51 class51) {
        super.method1760(class51);
        if (class51.method316("TNTFuse", 99)) {
            this.field2644 = class51.method319("TNTFuse");
        }
    }
    
    @Override
    public void method1761(final Class51 class51) {
        super.method1761(class51);
        class51.method298("TNTFuse", this.field2644);
    }
}
