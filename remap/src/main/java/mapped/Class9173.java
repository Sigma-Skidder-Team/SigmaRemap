// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class9173
{
    private int field38857;
    private float field38858;
    private float field38859;
    private int field38860;
    private int field38861;
    
    public Class9173() {
        this.field38857 = 20;
        this.field38861 = 20;
        this.field38858 = 5.0f;
    }
    
    public void method33486(final int n, final float n2) {
        this.field38857 = Math.min(n + this.field38857, 20);
        this.field38858 = Math.min(this.field38858 + n * n2 * 2.0f, (float)this.field38857);
    }
    
    public void method33487(final Class3820 class3820, final ItemStack class3821) {
        if (class3820.method11743()) {
            final Class9082 method11744 = class3820.method11744();
            this.method33486(method11744.method32744(), method11744.method32745());
        }
    }
    
    public void method33488(final Class512 class512) {
        final Class2113 method6954 = class512.field2391.method6954();
        this.field38861 = this.field38857;
        if (this.field38859 > 4.0f) {
            this.field38859 -= 4.0f;
            if (this.field38858 <= 0.0f) {
                if (method6954 != Class2113.field12290) {
                    this.field38857 = Math.max(this.field38857 - 1, 0);
                }
            }
            else {
                this.field38858 = Math.max(this.field38858 - 1.0f, 0.0f);
            }
        }
        final boolean method6955 = class512.field2391.method6765().method31216(Class8878.field37323);
        if (method6955) {
            if (this.field38858 > 0.0f) {
                if (class512.method2879()) {
                    if (this.field38857 >= 20) {
                        ++this.field38860;
                        if (this.field38860 < 10) {
                            return;
                        }
                        final float min = Math.min(this.field38858, 6.0f);
                        class512.method2663(min / 6.0f);
                        this.method33493(min);
                        this.field38860 = 0;
                        return;
                    }
                }
            }
        }
        if (method6955) {
            if (this.field38857 >= 18) {
                if (class512.method2879()) {
                    ++this.field38860;
                    if (this.field38860 < 80) {
                        return;
                    }
                    class512.method2663(1.0f);
                    this.method33493(6.0f);
                    this.field38860 = 0;
                    return;
                }
            }
        }
        if (this.field38857 > 0) {
            this.field38860 = 0;
        }
        else {
            ++this.field38860;
            if (this.field38860 >= 80) {
                Label_0363: {
                    if (class512.method2664() <= 10.0f) {
                        if (method6954 != Class2113.field12293) {
                            if (class512.method2664() <= 1.0f) {
                                break Label_0363;
                            }
                            if (method6954 != Class2113.field12292) {
                                break Label_0363;
                            }
                        }
                    }
                    class512.method1740(Class7929.field32570, 1.0f);
                }
                this.field38860 = 0;
            }
        }
    }
    
    public void method33489(final Class51 class51) {
        if (class51.method316("foodLevel", 99)) {
            this.field38857 = class51.method319("foodLevel");
            this.field38860 = class51.method319("foodTickTimer");
            this.field38858 = class51.method321("foodSaturationLevel");
            this.field38859 = class51.method321("foodExhaustionLevel");
        }
    }
    
    public void method33490(final Class51 class51) {
        class51.method298("foodLevel", this.field38857);
        class51.method298("foodTickTimer", this.field38860);
        class51.method304("foodSaturationLevel", this.field38858);
        class51.method304("foodExhaustionLevel", this.field38859);
    }
    
    public int method33491() {
        return this.field38857;
    }
    
    public boolean method33492() {
        return this.field38857 < 20;
    }
    
    public void method33493(final float n) {
        this.field38859 = Math.min(this.field38859 + n, 40.0f);
    }
    
    public float method33494() {
        return this.field38858;
    }
    
    public void method33495(final int field38857) {
        this.field38857 = field38857;
    }
    
    public void method33496(final float field38858) {
        this.field38858 = field38858;
    }
}
