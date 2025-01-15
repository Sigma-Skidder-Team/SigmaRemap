// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4987 implements Class4974
{
    public final /* synthetic */ Class7508 field21460;
    
    private Class4987(final Class7508 field21460) {
        this.field21460 = field21460;
    }
    
    @Override
    public Class6287 method15159() {
        if (!this.field21460.field29105.method23631(Class2207.field13443)) {
            if (this.field21460.field29105.method23631(Class2207.field13431)) {
                final Class5233 method23633 = this.field21460.field29105.method23633();
                final Class6289 class6289 = new Class6289(method23633.method16348(), method23633.method16349());
                Class7508.method23430(this.field21460, Class7508.method23433(this.field21460).method24254());
                Class7508.method23435(this.field21460).method24254();
                return class6289;
            }
            final Class5233 method23634 = this.field21460.field29105.method23632();
            throw new Class2394("while parsing a block mapping", Class7508.method23435(this.field21460).method24254(), "expected <block end>, but found '" + method23634.method16347() + "'", method23634.method16348());
        }
        else {
            final Class5233 method23635 = this.field21460.field29105.method23633();
            if (this.field21460.field29105.method23631(Class2207.field13443, Class2207.field13448, Class2207.field13431)) {
                Class7508.method23430(this.field21460, new Class4991(this.field21460, null));
                return Class7508.method23436(this.field21460, method23635.method16349());
            }
            Class7508.method23433(this.field21460).method24253(new Class4991(this.field21460, null));
            return Class7508.method23438(this.field21460);
        }
    }
}
