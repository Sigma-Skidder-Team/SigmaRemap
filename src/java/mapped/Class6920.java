// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class6920 implements Class6918
{
    private static String[] field27122;
    public final /* synthetic */ Class7471 field27123;
    public final /* synthetic */ float[] field27124;
    public final /* synthetic */ float field27125;
    public final /* synthetic */ float field27126;
    public final /* synthetic */ Class7764 field27127;
    
    public Class6920(final Class7471 field27123, final float[] field27124, final float field27125, final float field27126, final Class7764 field27127) {
        this.field27123 = field27123;
        this.field27124 = field27124;
        this.field27125 = field27125;
        this.field27126 = field27126;
        this.field27127 = field27127;
    }
    
    @Override
    public float[] method21290(final Class2400 class2400, float n, float n2) {
        this.field27123.method23071(class2400, n - this.field27124[0], n2 - this.field27124[1]).method9766();
        final Class2412 method23073 = this.field27123.method23073(class2400, n, n2);
        n += method23073.field14278;
        n2 += method23073.field14279;
        Class6044.method17978().method19254(this.field27127.method24817() + this.field27127.method24819() * (n * this.field27125), this.field27127.method24818() + this.field27127.method24820() * (n2 * this.field27126));
        return new float[] { method23073.field14278 + n, method23073.field14279 + n2 };
    }
}
