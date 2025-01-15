// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;

public class Class809 extends Class806
{
    private final Class3539 field4362;
    private boolean field4363;
    private int field4364;
    
    public Class809(final Class7499<? extends Class809> class7499, final Class1847 class7500) {
        super(class7499, class7500);
        this.field4362 = new Class3539(this);
    }
    
    @Override
    public void method2621() {
        super.method2621();
        this.method2710(Class8107.field33405).method23941(15.0);
        this.method2710(Class8107.field33408).method23941(0.20000000298023224);
        this.method2710(Class809.field4333).method23941(this.method4764());
    }
    
    @Override
    public void method4712() {
    }
    
    @Override
    public Class7795 method4160() {
        super.method4160();
        return this.method1720(Class7324.field28319) ? Class8520.field35570 : Class8520.field35566;
    }
    
    @Override
    public Class7795 method2684() {
        super.method2684();
        return Class8520.field35567;
    }
    
    @Override
    public Class7795 method2683(final Class7929 class7929) {
        super.method2683(class7929);
        return Class8520.field35568;
    }
    
    @Override
    public Class7795 method1686() {
        if (this.field2404) {
            if (!this.method1806()) {
                return Class8520.field35573;
            }
            ++this.field4353;
            if (this.field4353 > 5 && this.field4353 % 3 == 0) {
                return Class8520.field35571;
            }
            if (this.field4353 <= 5) {
                return Class8520.field35573;
            }
        }
        return Class8520.field35569;
    }
    
    @Override
    public void method1692(final float n) {
        if (!this.field2404) {
            super.method1692(Math.min(0.1f, n * 25.0f));
        }
        else {
            super.method1692(0.3f);
        }
    }
    
    @Override
    public void method4752() {
        if (!this.method1706()) {
            super.method4752();
        }
        else {
            this.method1695(Class8520.field35572, 0.4f, 1.0f);
        }
    }
    
    @Override
    public Class6363 method2712() {
        return Class6363.field25461;
    }
    
    @Override
    public double method1777() {
        return super.method1777() - 0.1875;
    }
    
    @Override
    public void method2736() {
        super.method2736();
        if (this.method4778()) {
            if (this.field4364++ >= 18000) {
                this.method1652();
            }
        }
    }
    
    @Override
    public void method1761(final Class51 class51) {
        super.method1761(class51);
        class51.method312("SkeletonTrap", this.method4778());
        class51.method298("SkeletonTrapTime", this.field4364);
    }
    
    @Override
    public void method1760(final Class51 class51) {
        super.method1760(class51);
        this.method4779(class51.method329("SkeletonTrap"));
        this.field4364 = class51.method319("SkeletonTrapTime");
    }
    
    @Override
    public boolean method1807() {
        return true;
    }
    
    @Override
    public float method2728() {
        return 0.96f;
    }
    
    public boolean method4778() {
        return this.field4363;
    }
    
    public void method4779(final boolean field4363) {
        if (field4363 != this.field4363) {
            if (!(this.field4363 = field4363)) {
                this.field4114.method22063(this.field4362);
            }
            else {
                this.field4114.method22062(1, this.field4362);
            }
        }
    }
    
    @Nullable
    @Override
    public Class788 method4349(final Class788 class788) {
        return Class7499.field29024.method23371(this.field2391);
    }
    
    @Override
    public boolean method4195(final Class512 class512, final Class316 class513) {
        final Class8321 method2715 = class512.method2715(class513);
        if (method2715.method27622() instanceof Class3831) {
            return super.method4195(class512, class513);
        }
        if (!this.method4715()) {
            return false;
        }
        if (this.method2625()) {
            return super.method4195(class512, class513);
        }
        if (class512.method2804()) {
            this.method4740(class512);
            return true;
        }
        if (!this.method1806()) {
            if (!method2715.method27620()) {
                if (method2715.method27622() == Class7739.field31353 && !this.method4736()) {
                    this.method4740(class512);
                    return true;
                }
                if (method2715.method27640(class512, this, class513)) {
                    return true;
                }
            }
            this.method4742(class512);
            return true;
        }
        return super.method4195(class512, class513);
    }
}
