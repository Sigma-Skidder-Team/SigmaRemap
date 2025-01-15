// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public enum Class212 implements Class195
{
    field735;
    
    @Override
    public int method832(final Class6433 class6433, final int n, final int n2, final int n3, final int n4, final int n5) {
        Label_0008: {
            if (Class7983.method26039(n5)) {
                if (Class7983.method26039(n4)) {
                    if (Class7983.method26039(n3)) {
                        if (Class7983.method26039(n)) {
                            if (Class7983.method26039(n2)) {
                                break Label_0008;
                            }
                        }
                    }
                }
                int n6 = 1;
                int n7 = 1;
                if (!Class7983.method26039(n4)) {
                    if (class6433.method19189(n6++) == 0) {
                        n7 = n4;
                    }
                }
                if (!Class7983.method26039(n3)) {
                    if (class6433.method19189(n6++) == 0) {
                        n7 = n3;
                    }
                }
                if (!Class7983.method26039(n)) {
                    if (class6433.method19189(n6++) == 0) {
                        n7 = n;
                    }
                }
                if (!Class7983.method26039(n2)) {
                    if (class6433.method19189(n6++) == 0) {
                        n7 = n2;
                    }
                }
                if (class6433.method19189(3) != 0) {
                    return (n7 != 4) ? n5 : 4;
                }
                return n7;
            }
        }
        if (!Class7983.method26039(n5)) {
            if (!Class7983.method26039(n4)) {
                if (!Class7983.method26039(n)) {
                    if (!Class7983.method26039(n3)) {
                        if (!Class7983.method26039(n2)) {
                            return n5;
                        }
                    }
                }
            }
            if (class6433.method19189(5) == 0) {
                if (Class7983.method26039(n4)) {
                    return (n5 != 4) ? n4 : 4;
                }
                if (Class7983.method26039(n)) {
                    return (n5 != 4) ? n : 4;
                }
                if (Class7983.method26039(n3)) {
                    return (n5 != 4) ? n3 : 4;
                }
                if (Class7983.method26039(n2)) {
                    return (n5 != 4) ? n2 : 4;
                }
            }
        }
        return n5;
    }
}
