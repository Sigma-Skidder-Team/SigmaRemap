// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4979 implements Class4974
{
    public final /* synthetic */ Class7508 field21445;
    
    private Class4979(final Class7508 field21445) {
        this.field21445 = field21445;
    }
    
    @Override
    public Class6287 method15159() {
        if (!this.field21445.field29105.method23631(Class2207.field13432)) {
            if (this.field21445.field29105.method23631(Class2207.field13431)) {
                final Class5233 method23633 = this.field21445.field29105.method23633();
                final Class6290 class6290 = new Class6290(method23633.method16348(), method23633.method16349());
                Class7508.method23430(this.field21445, Class7508.method23433(this.field21445).method24254());
                Class7508.method23435(this.field21445).method24254();
                return class6290;
            }
            final Class5233 method23634 = this.field21445.field29105.method23632();
            throw new Class2394("while parsing a block collection", Class7508.method23435(this.field21445).method24254(), "expected <block end>, but found '" + method23634.method16347() + "'", method23634.method16348());
        }
        else {
            final Class5237 class6291 = (Class5237)this.field21445.field29105.method23633();
            if (this.field21445.field29105.method23631(Class2207.field13432, Class2207.field13431)) {
                Class7508.method23430(this.field21445, new Class4979(this.field21445));
                return Class7508.method23436(this.field21445, class6291.method16349());
            }
            Class7508.method23433(this.field21445).method24253(new Class4979(this.field21445));
            return new Class4977(this.field21445, null).method15159();
        }
    }
}
