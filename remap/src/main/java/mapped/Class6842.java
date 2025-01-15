// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public abstract class Class6842 extends Class6831
{
    public final Class798 field26858;
    private boolean field26859;
    
    public Class6842(final Class798 field26858, final Class7795 class7795, final Class286 class7796) {
        super(class7795, class7796);
        this.field26858 = field26858;
        this.field26837 = (float)field26858.method1938();
        this.field26838 = (float)field26858.method1941();
        this.field26839 = (float)field26858.method1945();
        this.field26840 = true;
        this.field26841 = 0;
        this.field26835 = 0.0f;
    }
    
    @Override
    public void method20918() {
        if (this.method20940()) {
            if (!this.field26827) {
                Class869.method5277().method5299().method6421(this.method20939());
                this.field26859 = true;
            }
        }
        if (!this.field26858.field2410 && !this.field26859) {
            this.field26837 = (float)this.field26858.method1938();
            this.field26838 = (float)this.field26858.method1941();
            this.field26839 = (float)this.field26858.method1945();
            final float method35641 = MathHelper.method35641(Entity.method1680(this.field26858.method1935()));
            if (method35641 < 0.01) {
                this.field26836 = 0.0f;
                this.field26835 = 0.0f;
            }
            else {
                this.field26836 = MathHelper.method35700(MathHelper.method35653(method35641, this.method20937(), this.method20938()), this.method20937(), this.method20938());
                this.field26835 = MathHelper.method35700(MathHelper.method35653(method35641, 0.0f, 0.5f), 0.0f, 1.2f);
            }
        }
        else {
            this.field26827 = true;
        }
    }
    
    private float method20937() {
        return this.field26858.method2625() ? 1.1f : 0.7f;
    }
    
    private float method20938() {
        return this.field26858.method2625() ? 1.5f : 1.1f;
    }
    
    @Override
    public boolean method20917() {
        return true;
    }
    
    public abstract Class6831 method20939();
    
    public abstract boolean method20940();
}
