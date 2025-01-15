// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6888 extends Class6889
{
    private final Class3782 field27009;
    private final Class3759 field27010;
    private final Class2237 field27011;
    
    public Class6888(final Class3746 class3746, final Class9131 class3747) {
        super(class3746, class3747);
        final Class3746 method11499 = class3746.method11499(1835297121L).method11499(1835626086L);
        this.field27009 = (Class3782)method11499.method11499(1986881636L);
        final Class3773 class3748 = (Class3773)method11499.method11499(1937007212L).method11499(1937011556L);
        if (!(class3748.method11500().get(0) instanceof Class3759)) {
            this.field27010 = null;
            this.field27011 = Class2238.field13760;
        }
        else {
            this.field27010 = (Class3759)class3748.method11500().get(0);
            final long method11500 = this.field27010.method11492();
            if (method11500 != 1836070006L) {
                if (method11500 != 1701733238L && method11500 != 1685220723L) {
                    this.field27020 = Class7398.method22733(this.field27010.method11500().get(0));
                }
                else {
                    this.method21168((Class3726)this.field27010.method11499(1702061171L));
                    this.field27021 = Class6915.method21283(this.field27010.method11499(1936289382L));
                }
            }
            else {
                this.method21168((Class3726)this.field27010.method11499(1702061171L));
            }
            this.field27011 = Class2238.method8443(this.field27010.method11492());
        }
    }
    
    @Override
    public Class2071 method21157() {
        return Class2071.field11852;
    }
    
    @Override
    public Class2237 method21158() {
        return this.field27011;
    }
    
    public int method21159() {
        return (this.field27010 == null) ? 0 : this.field27010.method11548();
    }
    
    public int method21160() {
        return (this.field27010 == null) ? 0 : this.field27010.method11549();
    }
    
    public double method21161() {
        return (this.field27010 == null) ? 0.0 : this.field27010.method11550();
    }
    
    public double method21162() {
        return (this.field27010 == null) ? 0.0 : this.field27010.method11551();
    }
    
    public int method21163() {
        return (this.field27010 == null) ? 0 : this.field27010.method11552();
    }
    
    public String method21164() {
        return (this.field27010 == null) ? "" : this.field27010.method11553();
    }
    
    public int method21165() {
        return (this.field27010 == null) ? 0 : this.field27010.method11554();
    }
    
    public int method21166() {
        return this.field27013.method11403();
    }
}
