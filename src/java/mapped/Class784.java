// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;

public class Class784 extends Class785 implements Class768
{
    private static final Class8810<Byte> field4194;
    
    public Class784(final Class7499<? extends Class784> class7499, final Class1847 class7500) {
        super(class7499, class7500);
    }
    
    @Override
    public void method4142() {
        this.field4114.method22062(1, new Class3507(this, 1.25, 20, 10.0f));
        this.field4114.method22062(2, new Class3517(this, 1.0, 1.0000001E-5f));
        this.field4114.method22062(3, new Class3628(this, Class512.class, 6.0f));
        this.field4114.method22062(4, new Class3503(this));
        this.field4115.method22062(1, new Class3555<Object>(this, Class759.class, 10, true, false, class511 -> class511 instanceof Class762));
    }
    
    @Override
    public void method2621() {
        super.method2621();
        this.method2710(Class8107.field33405).method23941(4.0);
        this.method2710(Class8107.field33408).method23941(0.20000000298023224);
    }
    
    @Override
    public void method1649() {
        super.method1649();
        this.field2432.method33565(Class784.field4194, (Byte)16);
    }
    
    @Override
    public void method1761(final Class51 class51) {
        super.method1761(class51);
        class51.method312("Pumpkin", this.method4332());
    }
    
    @Override
    public void method1760(final Class51 class51) {
        super.method1760(class51);
        if (class51.method315("Pumpkin")) {
            this.method4333(class51.method329("Pumpkin"));
        }
    }
    
    @Override
    public void method2736() {
        super.method2736();
        if (!this.field2391.field10067) {
            final int method35644 = Class9546.method35644(this.method1938());
            final int method35645 = Class9546.method35644(this.method1941());
            final int method35646 = Class9546.method35644(this.method1945());
            if (this.method1710()) {
                this.method1740(Class7929.field32569, 1.0f);
            }
            if (this.field2391.method6959(new Class354(method35644, 0, method35646)).method9845(new Class354(method35644, method35645, method35646)) > 1.0f) {
                this.method1740(Class7929.field32564, 1.0f);
            }
            if (!this.field2391.method6765().method31216(Class8878.field37316)) {
                return;
            }
            final Class7096 method35647 = Class7521.field29329.method11878();
            for (int i = 0; i < 4; ++i) {
                final Class354 class354 = new Class354(Class9546.method35644(this.method1938() + (i % 2 * 2 - 1) * 0.25f), Class9546.method35644(this.method1941()), Class9546.method35644(this.method1945() + (i / 2 % 2 * 2 - 1) * 0.25f));
                if (this.field2391.method6701(class354).method21706()) {
                    if (this.field2391.method6959(class354).method9845(class354) < 0.8f) {
                        if (method35647.method21752(this.field2391, class354)) {
                            this.field2391.method6692(class354, method35647);
                        }
                    }
                }
            }
        }
    }
    
    @Override
    public void method4252(final Class511 class511, final float n) {
        final Class411 class512 = new Class411(this.field2391, this);
        final double n2 = class511.method1944() - 1.100000023841858;
        final double n3 = class511.method1938() - this.method1938();
        final double n4 = n2 - class512.method1941();
        final double n5 = class511.method1945() - this.method1945();
        class512.method1958(n3, n4 + Class9546.method35641(n3 * n3 + n5 * n5) * 0.2f, n5, 1.6f, 12.0f);
        this.method1695(Class8520.field35601, 1.0f, 1.0f / (this.method2633().nextFloat() * 0.4f + 0.8f));
        this.field2391.method6886(class512);
    }
    
    @Override
    public float method2789(final Class290 class290, final Class8295 class291) {
        return 1.7f;
    }
    
    @Override
    public boolean method4195(final Class512 class512, final Class316 class513) {
        final Class8321 method2715 = class512.method2715(class513);
        if (method2715.method27622() == Class7739.field31426 && this.method4332()) {
            if (!this.field2391.field10067) {
                this.method4333(false);
                method2715.method27636(1, class512, class515 -> class515.method2795(class514));
            }
            return true;
        }
        return false;
    }
    
    public boolean method4332() {
        return (this.field2432.method33568(Class784.field4194) & 0x10) != 0x0;
    }
    
    public void method4333(final boolean b) {
        final byte byteValue = this.field2432.method33568(Class784.field4194);
        if (!b) {
            this.field2432.method33569(Class784.field4194, (byte)(byteValue & 0xFFFFFFEF));
        }
        else {
            this.field2432.method33569(Class784.field4194, (byte)(byteValue | 0x10));
        }
    }
    
    @Nullable
    @Override
    public Class7795 method4160() {
        return Class8520.field35598;
    }
    
    @Nullable
    @Override
    public Class7795 method2683(final Class7929 class7929) {
        return Class8520.field35600;
    }
    
    @Nullable
    @Override
    public Class7795 method2684() {
        return Class8520.field35599;
    }
    
    static {
        field4194 = Class9184.method33564(Class784.class, Class7709.field30653);
    }
}
