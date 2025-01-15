// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4982 implements Class4974
{
    private static String[] field21450;
    public final /* synthetic */ Class7508 field21451;
    
    private Class4982(final Class7508 field21451) {
        this.field21451 = field21451;
    }
    
    @Override
    public Class6287 method15159() {
        if (!this.field21451.field29105.method23631(Class2207.field13448)) {
            Class7508.method23430(this.field21451, new Class4973(this.field21451, false));
            return Class7508.method23436(this.field21451, this.field21451.field29105.method23632().method16348());
        }
        final Class5233 method23633 = this.field21451.field29105.method23633();
        if (this.field21451.field29105.method23631(Class2207.field13438, Class2207.field13439)) {
            Class7508.method23430(this.field21451, new Class4973(this.field21451, false));
            return Class7508.method23436(this.field21451, method23633.method16349());
        }
        Class7508.method23433(this.field21451).method24253(new Class4973(this.field21451, false));
        return Class7508.method23439(this.field21451);
    }
}
