// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class6922 implements Class6918
{
    private static String[] field27130;
    public final /* synthetic */ float field27131;
    public final /* synthetic */ float field27132;
    public final /* synthetic */ Class7764 field27133;
    
    public Class6922(final float field27131, final float field27132, final Class7764 field27133) {
        this.field27131 = field27131;
        this.field27132 = field27132;
        this.field27133 = field27133;
    }
    
    @Override
    public float[] method21290(final Class2400 class2400, float n, float n2) {
        n -= class2400.method9532();
        n2 -= class2400.method9533();
        n /= class2400.method9530() - class2400.method9532();
        n2 /= class2400.method9531() - class2400.method9533();
        Class6044.method17978().method19254(this.field27133.method24817() + this.field27133.method24819() * (n * this.field27131), this.field27133.method24818() + this.field27133.method24820() * (n2 * this.field27132));
        return null;
    }
}
