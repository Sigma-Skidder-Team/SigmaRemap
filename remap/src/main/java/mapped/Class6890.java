// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6890 extends Class6889
{
    private static String[] field27022;
    private final Class3788 field27023;
    private final Class3761 field27024;
    private final Class2237 field27025;
    
    public Class6890(final Class3746 class3746, final Class9131 class3747) {
        super(class3746, class3747);
        final Class3746 method11499 = class3746.method11499(1835297121L).method11499(1835626086L);
        this.field27023 = (Class3788)method11499.method11499(1936549988L);
        final Class3773 class3748 = (Class3773)method11499.method11499(1937007212L).method11499(1937011556L);
        if (!(class3748.method11500().get(0) instanceof Class3761)) {
            this.field27024 = null;
            this.field27025 = Class2236.field13755;
        }
        else {
            this.field27024 = (Class3761)class3748.method11500().get(0);
            final long method11500 = this.field27024.method11492();
            if (!this.field27024.method11498(1702061171L)) {
                this.field27020 = Class7398.method22733(this.field27024.method11500().get(0));
            }
            else {
                this.method21168((Class3726)this.field27024.method11499(1702061171L));
            }
            if (method11500 != 1701733217L && method11500 != 1685220723L) {
                this.field27025 = Class2236.method8442(this.field27024.method11492());
            }
            else {
                this.method21168((Class3726)this.field27024.method11499(1702061171L));
                this.field27021 = Class6915.method21283(this.field27024.method11499(1936289382L));
                this.field27025 = this.field27021.method21284();
            }
        }
    }
    
    @Override
    public Class2071 method21157() {
        return Class2071.field11853;
    }
    
    @Override
    public Class2237 method21158() {
        return this.field27025;
    }
    
    public double method21186() {
        return this.field27023.method11620();
    }
    
    public int method21187() {
        return this.field27024.method11555();
    }
    
    public int method21188() {
        return this.field27024.method11556();
    }
    
    public int method21189() {
        return this.field27024.method11557();
    }
    
    public double method21190() {
        return this.field27013.method11405();
    }
}
