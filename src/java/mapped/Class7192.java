// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class7192<S> implements Class7191<S>
{
    private static String[] field27944;
    private final S field27945;
    private final S field27946;
    
    public Class7192(final S field27945, final S field27946) {
        this.field27945 = field27945;
        this.field27946 = field27946;
    }
    
    @Override
    public <T> T method22074(final Class6389<? super S, T> class6389) {
        return class6389.method19074(this.field27945, this.field27946);
    }
}
