// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class6919 implements Class6918
{
    private static String[] field27120;
    public final /* synthetic */ Class7471 field27121;
    
    public Class6919(final Class7471 field27121) {
        this.field27121 = field27121;
    }
    
    @Override
    public float[] method21290(final Class2400 class2400, final float n, final float n2) {
        this.field27121.method23071(class2400, n, n2).bind();
        final Class2412 method23073 = this.field27121.method23073(class2400, n, n2);
        return new float[] { method23073.field14278 + n, method23073.field14279 + n2 };
    }
}
