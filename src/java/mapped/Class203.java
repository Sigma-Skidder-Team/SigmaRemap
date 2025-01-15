// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public enum Class203 implements Class201
{
    field711;
    
    @Override
    public int method845(final Class6433 class6433, int n) {
        if (!Class7983.method26039(n)) {
            if (class6433.method19189(13) == 0) {
                n |= (1 + class6433.method19189(15) << 8 & 0xF00);
            }
        }
        return n;
    }
}
