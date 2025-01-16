// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class7830 implements Class7831<Class7832>
{
    private static String[] field32063;
    public final /* synthetic */ ResourceLocation field32064;
    public final /* synthetic */ Class7832 field32065;
    public final /* synthetic */ Class8875 field32066;
    
    public Class7830(final Class8875 field32066, final ResourceLocation field32067, final Class7832 field32068) {
        this.field32066 = field32066;
        this.field32064 = field32067;
        this.field32065 = field32068;
    }
    
    @Override
    public int method25300() {
        final Class7833 class7833 = Class8875.method31205(this.field32066).get(this.field32064);
        return (class7833 != null) ? class7833.method25300() : 0;
    }
    
    public Class7832 method25301() {
        final Class7833 class7833 = Class8875.method31205(this.field32066).get(this.field32064);
        if (class7833 != null) {
            final Class7832 method25301 = class7833.method25301();
            return new Class7832(method25301.method25304().toString(), method25301.method25306() * this.field32065.method25306(), method25301.method25307() * this.field32065.method25307(), this.field32065.method25300(), Class2158.field12815, method25301.method25309() || this.field32065.method25309(), method25301.method25310(), method25301.method25311());
        }
        return Class1784.field9895;
    }
    
    @Override
    public void method25302(final Class9382 class9382) {
        final Class7833 class9383 = Class8875.method31205(this.field32066).get(this.field32064);
        if (class9383 != null) {
            class9383.method25302(class9382);
        }
    }
}
