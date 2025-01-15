// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class7402 extends Class7398
{
    private static String[] field28527;
    private Class3743 field28528;
    private Class9533[] field28529;
    
    public Class7402(final Class3737 class3737) {
        this.field28528 = (Class3743)class3737;
        this.field28529 = new Class9533[this.field28528.method11527()];
        for (int i = 0; i < this.field28529.length; ++i) {
            this.field28529[i] = new Class9533(this, i, null);
        }
    }
    
    public int method22740() {
        return this.field28528.method11526();
    }
    
    public Class9533[] method22741() {
        return this.field28529;
    }
}
