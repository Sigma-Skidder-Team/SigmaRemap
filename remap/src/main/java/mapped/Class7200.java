// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class7200 implements Class7198
{
    private static String[] field27974;
    private float field27975;
    public final /* synthetic */ Class7395 field27976;
    
    private Class7200(final Class7395 field27976, final float field27977) {
        this.field27976 = field27976;
        this.field27975 = field27977;
    }
    
    @Override
    public float method22084(final float n) {
        return (float)(Math.random() * this.field27975);
    }
    
    public void method22093(final float field27975) {
        this.field27975 = field27975;
    }
    
    public float method22094() {
        return this.field27975;
    }
}
