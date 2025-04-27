// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;

public class Class5146
{
    public final int field22146;
    public final int field22147;
    private Class9128 field22148;
    private Class9469 field22149;
    
    public Class5146(final int field22146, final int field22147) {
        this.field22146 = field22146;
        this.field22147 = field22147;
        this.field22148 = new Class9128(new Class9469(this.field22146 / 2, this.field22147 / 2));
        this.method16075();
    }
    
    public void method16068() {
        this.field22148.method33119();
        if (this.field22148.method33124(this.field22149)) {
            this.method16075();
            this.field22148.method33120();
            Client.getInstance().getAudioManager().method32830("pop");
        }
        if (this.field22148.method33122() || this.method16069()) {
            this.method16071();
        }
    }
    
    public boolean method16069() {
        for (final Class9469 class9469 : this.field22148.method33123()) {
            if (class9469.field40723 >= 0) {
                if (class9469.field40724 >= 0) {
                    if (class9469.field40723 < this.field22146) {
                        if (class9469.field40724 < this.field22147) {
                            continue;
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }
    
    public boolean method16070(final Class9469 class9469) {
        if (class9469.field40723 >= 0) {
            if (class9469.field40724 >= 0) {
                if (class9469.field40723 < this.field22146) {
                    return class9469.field40724 >= this.field22147;
                }
            }
        }
        return true;
    }
    
    public void method16071() {
        this.field22148 = new Class9128(new Class9469(this.field22146 / 2, this.field22147 / 2));
        this.method16075();
    }
    
    public Class9469 method16072() {
        return new Class9469(this.field22146, this.field22147);
    }
    
    public int method16073() {
        return this.field22146 * this.field22147;
    }
    
    public Class9469 method16074() {
        Class9469 class9469;
        for (class9469 = null; this.field22148.method33124(class9469) || this.method16070(class9469); class9469 = new Class9469((int)Math.round(Math.random() * this.field22146), (int)Math.round(Math.random() * this.field22147))) {}
        return class9469;
    }
    
    public void method16075() {
        this.field22149 = this.method16074();
    }
    
    public Class9469 method16076() {
        return this.field22149;
    }
    
    public Class9128 method16077() {
        return this.field22148;
    }
}
