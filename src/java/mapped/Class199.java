// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public enum Class199 implements Class198, Class200
{
    field685;
    
    @Override
    public int method841(final Class6433 class6433, final Class6631 class6434, final Class6631 class6435, final int n, final int n2) {
        final int method20074 = class6434.method20074(this.method839(n), this.method840(n2));
        final int method20075 = class6435.method20074(this.method839(n), this.method840(n2));
        if (Class7983.method26038(method20074)) {
            for (int i = -8; i <= 8; i += 4) {
                for (int j = -8; j <= 8; j += 4) {
                    if (!Class7983.method26038(class6434.method20074(this.method839(n + i), this.method840(n2 + j)))) {
                        if (method20075 == Class7983.field32846) {
                            return Class7983.field32847;
                        }
                        if (method20075 == Class7983.field32850) {
                            return Class7983.field32849;
                        }
                    }
                }
            }
            if (method20074 == Class7983.field32853) {
                if (method20075 == Class7983.field32847) {
                    return Class7983.field32852;
                }
                if (method20075 == Class7983.field32848) {
                    return Class7983.field32853;
                }
                if (method20075 == Class7983.field32849) {
                    return Class7983.field32854;
                }
                if (method20075 == Class7983.field32850) {
                    return Class7983.field32855;
                }
            }
            return method20075;
        }
        return method20074;
    }
}
