// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4973 implements Class4974
{
    private boolean field21435;
    public final /* synthetic */ Class7508 field21436;
    
    public Class4973(final Class7508 field21436, final boolean field21437) {
        this.field21436 = field21436;
        this.field21435 = false;
        this.field21435 = field21437;
    }
    
    @Override
    public Class6287 method15159() {
        if (!this.field21436.field29105.method23631(Class2207.field13439)) {
            if (!this.field21435) {
                if (!this.field21436.field29105.method23631(Class2207.field13438)) {
                    final Class5233 method23632 = this.field21436.field29105.method23632();
                    throw new Class2394("while parsing a flow mapping", Class7508.method23435(this.field21436).method24254(), "expected ',' or '}', but got " + method23632.method16347(), method23632.method16348());
                }
                this.field21436.field29105.method23633();
            }
            if (!this.field21436.field29105.method23631(Class2207.field13443)) {
                if (!this.field21436.field29105.method23631(Class2207.field13439)) {
                    Class7508.method23433(this.field21436).method24253(new Class4986(this.field21436, null));
                    return Class7508.method23439(this.field21436);
                }
            }
            else {
                final Class5233 method23633 = this.field21436.field29105.method23633();
                if (this.field21436.field29105.method23631(Class2207.field13448, Class2207.field13438, Class2207.field13439)) {
                    Class7508.method23430(this.field21436, new Class4982(this.field21436, null));
                    return Class7508.method23436(this.field21436, method23633.method16349());
                }
                Class7508.method23433(this.field21436).method24253(new Class4982(this.field21436, null));
                return Class7508.method23439(this.field21436);
            }
        }
        final Class5233 method23634 = this.field21436.field29105.method23633();
        final Class6289 class6289 = new Class6289(method23634.method16348(), method23634.method16349());
        Class7508.method23430(this.field21436, Class7508.method23433(this.field21436).method24254());
        Class7508.method23435(this.field21436).method24254();
        return class6289;
    }
}
