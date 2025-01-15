// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4978 implements Class4974
{
    private boolean field21443;
    public final /* synthetic */ Class7508 field21444;
    
    public Class4978(final Class7508 field21444, final boolean field21445) {
        this.field21444 = field21444;
        this.field21443 = false;
        this.field21443 = field21445;
    }
    
    @Override
    public Class6287 method15159() {
        if (!this.field21444.field29105.method23631(Class2207.field13441)) {
            if (!this.field21443) {
                if (!this.field21444.field29105.method23631(Class2207.field13438)) {
                    final Class5233 method23632 = this.field21444.field29105.method23632();
                    throw new Class2394("while parsing a flow sequence", Class7508.method23435(this.field21444).method24254(), "expected ',' or ']', but got " + method23632.method16347(), method23632.method16348());
                }
                this.field21444.field29105.method23633();
            }
            if (this.field21444.field29105.method23631(Class2207.field13443)) {
                final Class5233 method23633 = this.field21444.field29105.method23632();
                final Class6295 class6295 = new Class6295(null, null, true, method23633.method16348(), method23633.method16349(), Class227.field800);
                Class7508.method23430(this.field21444, new Class4988(this.field21444, null));
                return class6295;
            }
            if (!this.field21444.field29105.method23631(Class2207.field13441)) {
                Class7508.method23433(this.field21444).method24253(new Class4978(this.field21444, false));
                return Class7508.method23439(this.field21444);
            }
        }
        final Class5233 method23634 = this.field21444.field29105.method23633();
        final Class6290 class6296 = new Class6290(method23634.method16348(), method23634.method16349());
        Class7508.method23430(this.field21444, Class7508.method23433(this.field21444).method24254());
        Class7508.method23435(this.field21444).method24254();
        return class6296;
    }
}
