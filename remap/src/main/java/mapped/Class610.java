// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;

public class Class610 extends Class608<Class643>
{
    public final /* synthetic */ Class704 field3564;
    
    public Class610(final Class704 field3564, final Class869 class869) {
        this.field3564 = field3564;
        super(class869, field3564.field3152, field3564.field3153, 32, field3564.field3153 - 65 + 4, 18);
        for (final Class1947 class870 : Class704.method3907(field3564).method5846()) {
            final Class643 class871 = new Class643(this, class870);
            this.method3536(class871);
            if (!Class704.method3907(field3564).method5845().getCode().equals(class870.getCode())) {
                continue;
            }
            this.method3570(class871);
        }
        if (this.method3530() != null) {
            this.method3547(this.method3530());
        }
    }
    
    @Override
    public int method3555() {
        return super.method3555() + 20;
    }
    
    @Override
    public int method3529() {
        return super.method3529() + 50;
    }
    
    public void method3570(final Class643 class643) {
        super.method3531(class643);
        if (class643 != null) {
            Class7895.field32404.method25556(new Class2259("narrator.select", new Object[] { Class643.method3687(class643) }).getString());
        }
    }
    
    @Override
    public void method3545() {
        this.field3564.method3041();
    }
    
    @Override
    public boolean method3561() {
        return this.field3564.method3471() == this;
    }
}
