// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import javax.annotation.Nullable;

public class Class815 extends Class812 implements Class768
{
    private static final Class8810<Integer> field4369;
    private static final Class8810<Integer> field4370;
    private static final Class8810<Integer> field4371;
    private boolean field4372;
    private Class815 field4373;
    private Class815 field4374;
    
    public Class815(final Class7499<? extends Class815> class7499, final Class1847 class7500) {
        super(class7499, class7500);
    }
    
    public boolean method4784() {
        return false;
    }
    
    private void method4785(final int b) {
        this.field2432.method33569(Class815.field4369, Math.max(1, Math.min(5, b)));
    }
    
    private void method4786() {
        this.method4785(1 + this.field2423.nextInt((this.field2423.nextFloat() >= 0.04f) ? 3 : 5));
    }
    
    public int method4787() {
        return this.field2432.method33568(Class815.field4369);
    }
    
    @Override
    public void method1761(final Class51 class51) {
        super.method1761(class51);
        class51.method298("Variant", this.method4788());
        class51.method298("Strength", this.method4787());
        if (!this.field4342.method2157(1).method27620()) {
            class51.method295("DecorItem", this.field4342.method2157(1).method27627(new Class51()));
        }
    }
    
    @Override
    public void method1760(final Class51 class51) {
        this.method4785(class51.method319("Strength"));
        super.method1760(class51);
        this.method4789(class51.method319("Variant"));
        if (class51.method316("DecorItem", 10)) {
            this.field4342.method2160(1, Class8321.method27619(class51.method327("DecorItem")));
        }
        this.method4732();
    }
    
    @Override
    public void method4142() {
        this.field4114.method22062(0, new Class3490(this));
        this.field4114.method22062(1, new Class3625(this, 1.2));
        this.field4114.method22062(2, new Class3501(this, 2.0999999046325684));
        this.field4114.method22062(3, new Class3507(this, 1.25, 40, 20.0f));
        this.field4114.method22062(3, new Class3607(this, 1.2));
        this.field4114.method22062(4, new Class3587(this, 1.0));
        this.field4114.method22062(5, new Class3456(this, 1.0));
        this.field4114.method22062(6, new Class3517(this, 0.7));
        this.field4114.method22062(7, new Class3628(this, Class512.class, 6.0f));
        this.field4114.method22062(8, new Class3503(this));
        this.field4115.method22062(1, new Class3550(this));
        this.field4115.method22062(2, new Class3566(this));
    }
    
    @Override
    public void method2621() {
        super.method2621();
        this.method2710(Class8107.field33406).method23941(40.0);
    }
    
    @Override
    public void method1649() {
        super.method1649();
        this.field2432.method33565(Class815.field4369, 0);
        this.field2432.method33565(Class815.field4370, -1);
        this.field2432.method33565(Class815.field4371, 0);
    }
    
    public int method4788() {
        return Class9546.method35651(this.field2432.method33568(Class815.field4371), 0, 3);
    }
    
    public void method4789(final int i) {
        this.field2432.method33569(Class815.field4371, i);
    }
    
    @Override
    public int method4730() {
        return this.method4780() ? (2 + 3 * this.method4783()) : super.method4730();
    }
    
    @Override
    public void method1773(final Class399 class399) {
        if (this.method1909(class399)) {
            class399.method1656(this.method1938() + 0.3f * Class9546.method35638(this.field2951 * 0.017453292f), this.method1941() + this.method1777() + class399.method1776(), this.method1945() - 0.3f * Class9546.method35639(this.field2951 * 0.017453292f));
        }
    }
    
    @Override
    public double method1777() {
        return this.method1931() * 0.67;
    }
    
    @Override
    public boolean method4189() {
        return false;
    }
    
    @Override
    public boolean method4741(final Class512 class512, final Class8321 class513) {
        int n = 0;
        int n2 = 0;
        float n3 = 0.0f;
        boolean b = false;
        final Class3820 method27622 = class513.method27622();
        if (method27622 != Class7739.field31315) {
            if (method27622 == Class7521.field29529.method11704()) {
                n = 90;
                n2 = 6;
                n3 = 10.0f;
                if (this.method4715()) {
                    if (this.method4351() == 0) {
                        if (this.method4359()) {
                            b = true;
                            this.method4360(class512);
                        }
                    }
                }
            }
        }
        else {
            n = 10;
            n2 = 3;
            n3 = 2.0f;
        }
        if (this.method2664() < this.method2701()) {
            if (n3 > 0.0f) {
                this.method2663(n3);
                b = true;
            }
        }
        if (this.method2625()) {
            if (n > 0) {
                this.field2391.method6709(Class8432.field34625, this.method1940(1.0), this.method1943() + 0.5, this.method1947(1.0), 0.0, 0.0, 0.0);
                if (!this.field2391.field10067) {
                    this.method4353(n);
                }
                b = true;
            }
        }
        if (n2 > 0) {
            if (b || !this.method4715()) {
                if (this.method4726() < this.method4739()) {
                    b = true;
                    if (!this.field2391.field10067) {
                        this.method4728(n2);
                    }
                }
            }
        }
        if (b) {
            if (!this.method1696()) {
                this.field2391.method6706(null, this.method1938(), this.method1941(), this.method1945(), Class8520.field35351, this.method1922(), 1.0f, 1.0f + (this.field2423.nextFloat() - this.field2423.nextFloat()) * 0.2f);
            }
        }
        return b;
    }
    
    @Override
    public boolean method2722() {
        return this.method2664() <= 0.0f || this.method4721();
    }
    
    @Nullable
    @Override
    public Class5496 method4188(final Class1851 class1851, final Class9592 class1852, final Class2101 class1853, Class5496 class1854, final Class51 class1855) {
        this.method4786();
        int n;
        if (!(class1854 instanceof Class5501)) {
            n = this.field2423.nextInt(4);
            class1854 = new Class5501(n, null);
        }
        else {
            n = ((Class5501)class1854).field22793;
        }
        this.method4789(n);
        return super.method4188(class1851, class1852, class1853, class1854, class1855);
    }
    
    @Override
    public Class7795 method4737() {
        return Class8520.field35348;
    }
    
    @Override
    public Class7795 method4160() {
        return Class8520.field35347;
    }
    
    @Override
    public Class7795 method2683(final Class7929 class7929) {
        return Class8520.field35352;
    }
    
    @Override
    public Class7795 method2684() {
        return Class8520.field35350;
    }
    
    @Override
    public void method1691(final Class354 class354, final Class7096 class355) {
        this.method1695(Class8520.field35354, 0.15f, 1.0f);
    }
    
    @Override
    public void method4782() {
        this.method1695(Class8520.field35349, 1.0f, (this.field2423.nextFloat() - this.field2423.nextFloat()) * 0.2f + 1.0f);
    }
    
    @Override
    public void method4750() {
        final Class7795 method4737 = this.method4737();
        if (method4737 != null) {
            this.method1695(method4737, this.method2720(), this.method2721());
        }
    }
    
    @Override
    public int method4783() {
        return this.method4787();
    }
    
    @Override
    public boolean method4766() {
        return true;
    }
    
    @Override
    public boolean method4767(final Class8321 class8321) {
        return Class7855.field32241.method25618(class8321.method27622());
    }
    
    @Override
    public boolean method4735() {
        return false;
    }
    
    @Override
    public void method4733(final Class446 class446) {
        final Class181 method4792 = this.method4792();
        super.method4733(class446);
        final Class181 method4793 = this.method4792();
        if (this.field2424 > 20) {
            if (method4793 != null) {
                if (method4793 != method4792) {
                    this.method1695(Class8520.field35355, 0.5f, 1.0f);
                }
            }
        }
    }
    
    @Override
    public void method4732() {
        if (!this.field2391.field10067) {
            super.method4732();
            this.method4790(method4791(this.field4342.method2157(1)));
        }
    }
    
    private void method4790(final Class181 class181) {
        this.field2432.method33569(Class815.field4370, (class181 != null) ? class181.method813() : -1);
    }
    
    @Nullable
    private static Class181 method4791(final Class8321 class8321) {
        final Class3833 method11776 = Class3833.method11776(class8321.method27622());
        return (method11776 instanceof Class4016) ? ((Class4016)method11776).method12199() : null;
    }
    
    @Nullable
    public Class181 method4792() {
        final int intValue = this.field2432.method33568(Class815.field4370);
        return (intValue != -1) ? Class181.method819(intValue) : null;
    }
    
    @Override
    public int method4739() {
        return 30;
    }
    
    @Override
    public boolean method4365(final Class789 class789) {
        if (class789 != this) {
            if (class789 instanceof Class815) {
                if (this.method4753()) {
                    if (((Class815)class789).method4753()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public Class815 method4793(final Class788 class788) {
        final Class815 method4794 = this.method4794();
        this.method4754(class788, method4794);
        final Class815 class789 = (Class815)class788;
        int n = this.field2423.nextInt(Math.max(this.method4787(), class789.method4787())) + 1;
        if (this.field2423.nextFloat() < 0.03f) {
            ++n;
        }
        method4794.method4785(n);
        method4794.method4789(this.field2423.nextBoolean() ? this.method4788() : class789.method4788());
        return method4794;
    }
    
    public Class815 method4794() {
        return Class7499.field28996.method23371(this.field2391);
    }
    
    private void method4795(final Class511 class511) {
        final Class400 class512 = new Class400(this.field2391, this);
        final double n = class511.method1938() - this.method1938();
        final double n2 = class511.method1942(0.3333333333333333) - class512.method1941();
        final double n3 = class511.method1945() - this.method1945();
        class512.method1958(n, n2 + Class9546.method35641(n * n + n3 * n3) * 0.2f, n3, 1.5f, 10.0f);
        this.field2391.method6706(null, this.method1938(), this.method1941(), this.method1945(), Class8520.field35353, this.method1922(), 1.0f, 1.0f + (this.field2423.nextFloat() - this.field2423.nextFloat()) * 0.2f);
        this.field2391.method6886(class512);
        this.field4372 = true;
    }
    
    private void method4796(final boolean field4372) {
        this.field4372 = field4372;
    }
    
    @Override
    public boolean method1705(final float n, final float n2) {
        final int method2691 = this.method2691(n, n2);
        if (method2691 > 0) {
            if (n >= 6.0f) {
                this.method1740(Class7929.field32572, (float)method2691);
                if (this.method1806()) {
                    final Iterator<Class399> iterator = this.method1911().iterator();
                    while (iterator.hasNext()) {
                        iterator.next().method1740(Class7929.field32572, (float)method2691);
                    }
                }
            }
            this.method2692();
            return true;
        }
        return false;
    }
    
    public void method4797() {
        if (this.field4373 != null) {
            this.field4373.field4374 = null;
        }
        this.field4373 = null;
    }
    
    public void method4798(final Class815 field4373) {
        this.field4373 = field4373;
        this.field4373.field4374 = this;
    }
    
    public boolean method4799() {
        return this.field4374 != null;
    }
    
    public boolean method4800() {
        return this.field4373 != null;
    }
    
    @Nullable
    public Class815 method4801() {
        return this.field4373;
    }
    
    @Override
    public double method4347() {
        return 2.0;
    }
    
    @Override
    public void method4744() {
        if (!this.method4800()) {
            if (this.method2625()) {
                super.method4744();
            }
        }
    }
    
    @Override
    public boolean method4745() {
        return false;
    }
    
    @Override
    public void method4252(final Class511 class511, final float n) {
        this.method4795(class511);
    }
    
    static {
        field4369 = Class9184.method33564(Class815.class, Class7709.field30654);
        field4370 = Class9184.method33564(Class815.class, Class7709.field30654);
        field4371 = Class9184.method33564(Class815.class, Class7709.field30654);
    }
}
