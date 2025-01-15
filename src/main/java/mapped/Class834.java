// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import java.util.stream.Stream;

public abstract class Class834 extends Class833
{
    private Class834 field4445;
    private int field4446;
    
    public Class834(final Class7499<? extends Class834> class7499, final Class1847 class7500) {
        super(class7499, class7500);
        this.field4446 = 1;
    }
    
    @Override
    public void method4142() {
        super.method4142();
        this.field4114.method22062(5, new Class3463(this));
    }
    
    @Override
    public int method4181() {
        return this.method4959();
    }
    
    public int method4959() {
        return super.method4181();
    }
    
    @Override
    public boolean method4957() {
        return !this.method4960();
    }
    
    public boolean method4960() {
        return this.field4445 != null && this.field4445.method1768();
    }
    
    public Class834 method4961(final Class834 field4445) {
        (this.field4445 = field4445).method4963();
        return field4445;
    }
    
    public void method4962() {
        this.field4445.method4964();
        this.field4445 = null;
    }
    
    private void method4963() {
        ++this.field4446;
    }
    
    private void method4964() {
        --this.field4446;
    }
    
    public boolean method4965() {
        return this.method4966() && this.field4446 < this.method4959();
    }
    
    @Override
    public void method1659() {
        super.method1659();
        if (this.method4966()) {
            if (this.field2391.field10062.nextInt(200) == 1) {
                if (this.field2391.method7128((Class<? extends Class399>)this.getClass(), this.method1886().method18495(8.0, 8.0, 8.0)).size() <= 1) {
                    this.field4446 = 1;
                }
            }
        }
    }
    
    public boolean method4966() {
        return this.field4446 > 1;
    }
    
    public boolean method4967() {
        return this.method1734(this.field4445) <= 121.0;
    }
    
    public void method4968() {
        if (this.method4960()) {
            this.method4150().method24725(this.field4445, 1.0);
        }
    }
    
    public void method4969(final Stream<Class834> stream) {
        stream.limit(this.method4959() - this.field4446).filter(class834 -> class834 != this).forEach(class835 -> class835.method4961(this));
    }
    
    @Nullable
    @Override
    public Class5496 method4188(final Class1851 class1851, final Class9592 class1852, final Class2101 class1853, Class5496 class1854, final Class51 class1855) {
        super.method4188(class1851, class1852, class1853, class1854, class1855);
        if (class1854 != null) {
            this.method4961(((Class5503)class1854).field22797);
        }
        else {
            class1854 = new Class5503(this);
        }
        return class1854;
    }
}
