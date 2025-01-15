// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4990 implements Class4974
{
    public final /* synthetic */ Class7508 field21465;
    
    private Class4990(final Class7508 field21465) {
        this.field21465 = field21465;
    }
    
    @Override
    public Class6287 method15159() {
        while (this.field21465.field29105.method23631(Class2207.field13436)) {
            this.field21465.field29105.method23633();
        }
        Class6287 class5253;
        if (this.field21465.field29105.method23631(Class2207.field13445)) {
            final Class5252 class5252 = (Class5252)this.field21465.field29105.method23633();
            class5253 = new Class6298(class5252.method16348(), class5252.method16349());
            if (!Class7508.method23433(this.field21465).method24255()) {
                throw new Class2386("Unexpected end of stream. States left: " + Class7508.method23433(this.field21465));
            }
            if (!Class7508.method23435(this.field21465).method24255()) {
                throw new Class2386("Unexpected end of stream. Marks left: " + Class7508.method23435(this.field21465));
            }
            Class7508.method23430(this.field21465, null);
        }
        else {
            final Class2314 method16348 = this.field21465.field29105.method23632().method16348();
            final Class8342 method16349 = Class7508.method23434(this.field21465);
            if (!this.field21465.field29105.method23631(Class2207.field13437)) {
                throw new Class2394(null, null, "expected '<document start>', but found '" + this.field21465.field29105.method23632().method16347() + "'", this.field21465.field29105.method23632().method16348());
            }
            class5253 = new Class6291(method16348, this.field21465.field29105.method23633().method16349(), true, method16349.method27806(), method16349.method27807());
            Class7508.method23433(this.field21465).method24253(new Class4981(this.field21465, null));
            Class7508.method23430(this.field21465, new Class4975(this.field21465, null));
        }
        return class5253;
    }
}
