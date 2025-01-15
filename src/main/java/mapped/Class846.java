// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;

public class Class846 extends Class763
{
    private static String[] field4509;
    private static final Class8810<Byte> field4510;
    
    public Class846(final Class7499<? extends Class846> class7499, final Class1847 class7500) {
        super(class7499, class7500);
    }
    
    @Override
    public void method4142() {
        this.field4114.method22062(1, new Class3490(this));
        this.field4114.method22062(3, new Class3526(this, 0.4f));
        this.field4114.method22062(4, new Class3585(this));
        this.field4114.method22062(5, new Class3517(this, 0.8));
        this.field4114.method22062(6, new Class3628(this, Class512.class, 8.0f));
        this.field4114.method22062(6, new Class3503(this));
        this.field4115.method22062(1, new Class3547(this, (Class<?>[])new Class[0]));
        this.field4115.method22062(2, new Class3558<Object>(this, Class512.class));
        this.field4115.method22062(3, new Class3558<Object>(this, Class786.class));
    }
    
    @Override
    public double method1777() {
        return this.method1931() * 0.5f;
    }
    
    @Override
    public Class7746 method4143(final Class1847 class1847) {
        return new Class7749(this, class1847);
    }
    
    @Override
    public void method1649() {
        super.method1649();
        this.field2432.method33565(Class846.field4510, (Byte)0);
    }
    
    @Override
    public void method1659() {
        super.method1659();
        if (!this.field2391.field10067) {
            this.method5069(this.field2405);
        }
    }
    
    @Override
    public void method2621() {
        super.method2621();
        this.method2710(Class8107.field33405).method23941(16.0);
        this.method2710(Class8107.field33408).method23941(0.30000001192092896);
    }
    
    @Override
    public Class7795 method4160() {
        return Class8520.field35605;
    }
    
    @Override
    public Class7795 method2683(final Class7929 class7929) {
        return Class8520.field35607;
    }
    
    @Override
    public Class7795 method2684() {
        return Class8520.field35606;
    }
    
    @Override
    public void method1691(final Class354 class354, final Class7096 class355) {
        this.method1695(Class8520.field35608, 0.15f, 1.0f);
    }
    
    @Override
    public boolean method2688() {
        return this.method5068();
    }
    
    @Override
    public void method1839(final Class7096 class7096, final Class5487 class7097) {
        if (class7096.method21696() != Class7521.field29240) {
            super.method1839(class7096, class7097);
        }
    }
    
    @Override
    public Class6363 method2712() {
        return Class6363.field25462;
    }
    
    @Override
    public boolean method2656(final Class1948 class1948) {
        return class1948.method7906() != Class9439.field40492 && super.method2656(class1948);
    }
    
    public boolean method5068() {
        return (this.field2432.method33568(Class846.field4510) & 0x1) != 0x0;
    }
    
    public void method5069(final boolean b) {
        final byte byteValue = this.field2432.method33568(Class846.field4510);
        byte b2;
        if (!b) {
            b2 = (byte)(byteValue & 0xFFFFFFFE);
        }
        else {
            b2 = (byte)(byteValue | 0x1);
        }
        this.field2432.method33569(Class846.field4510, b2);
    }
    
    @Nullable
    @Override
    public Class5496 method4188(final Class1851 class1851, final Class9592 class1852, final Class2101 class1853, Class5496 method4188, final Class51 class1854) {
        method4188 = super.method4188(class1851, class1852, class1853, method4188, class1854);
        if (class1851.method6790().nextInt(100) == 0) {
            final Class782 class1855 = Class7499.field29023.method23371(this.field2391);
            class1855.method1730(this.method1938(), this.method1941(), this.method1945(), this.field2399, 0.0f);
            class1855.method4188(class1851, class1852, class1853, null, null);
            class1851.method6886(class1855);
            class1855.method1778(this);
        }
        if (method4188 == null) {
            method4188 = new Class5502();
            if (class1851.method6954() == Class2113.field12293) {
                if (class1851.method6790().nextFloat() < 0.1f * class1852.method35975()) {
                    ((Class5502)method4188).method16804(class1851.method6790());
                }
            }
        }
        if (method4188 instanceof Class5502) {
            final Class5328 field22795 = ((Class5502)method4188).field22795;
            if (field22795 != null) {
                this.method2655(new Class1948(field22795, Integer.MAX_VALUE));
            }
        }
        return method4188;
    }
    
    @Override
    public float method2789(final Class290 class290, final Class8295 class291) {
        return 0.65f;
    }
    
    static {
        field4510 = Class9184.method33564(Class846.class, Class7709.field30653);
    }
}
