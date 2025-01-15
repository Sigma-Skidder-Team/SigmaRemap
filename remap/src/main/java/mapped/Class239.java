// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public enum Class239
{
    field1167(0, 0, 28, 32, 8), 
    field1168(84, 0, 28, 32, 8), 
    field1169(0, 64, 32, 28, 5), 
    field1170(96, 64, 32, 28, 5);
    
    private final int field1171;
    private final int field1172;
    private final int field1173;
    private final int field1174;
    private final int field1175;
    
    private Class239(final int field1171, final int field1172, final int field1173, final int field1174, final int field1175) {
        this.field1171 = field1171;
        this.field1172 = field1172;
        this.field1173 = field1173;
        this.field1174 = field1174;
        this.field1175 = field1175;
    }
    
    public int method882() {
        return this.field1175;
    }
    
    public void method883(final Class565 class565, final int n, final int n2, final boolean b, final int n3) {
        int field1171 = this.field1171;
        if (n3 > 0) {
            field1171 += this.field1173;
        }
        if (n3 == this.field1175 - 1) {
            field1171 += this.field1173;
        }
        class565.method3186(n + this.method885(n3), n2 + this.method886(n3), field1171, b ? (this.field1172 + this.field1174) : this.field1172, this.field1173, this.field1174);
    }
    
    public void method884(final int n, final int n2, final int n3, final Class1796 class1796, final ItemStack class1797) {
        int n4 = n + this.method885(n3);
        int n5 = n2 + this.method886(n3);
        switch (Class6030.field24524[this.ordinal()]) {
            case 1: {
                n4 += 6;
                n5 += 9;
                break;
            }
            case 2: {
                n4 += 6;
                n5 += 6;
                break;
            }
            case 3: {
                n4 += 10;
                n5 += 5;
                break;
            }
            case 4: {
                n4 += 6;
                n5 += 5;
                break;
            }
        }
        class1796.method6541(null, class1797, n4, n5);
    }
    
    public int method885(final int n) {
        switch (Class6030.field24524[this.ordinal()]) {
            case 1: {
                return (this.field1173 + 4) * n;
            }
            case 2: {
                return (this.field1173 + 4) * n;
            }
            case 3: {
                return -this.field1173 + 4;
            }
            case 4: {
                return 248;
            }
            default: {
                throw new UnsupportedOperationException("Don't know what this tab type is!" + this);
            }
        }
    }
    
    public int method886(final int n) {
        switch (Class6030.field24524[this.ordinal()]) {
            case 1: {
                return -this.field1174 + 4;
            }
            case 2: {
                return 136;
            }
            case 3: {
                return this.field1174 * n;
            }
            case 4: {
                return this.field1174 * n;
            }
            default: {
                throw new UnsupportedOperationException("Don't know what this tab type is!" + this);
            }
        }
    }
    
    public boolean method887(final int n, final int n2, final int n3, final double n4, final double n5) {
        final int n6 = n + this.method885(n3);
        final int n7 = n2 + this.method886(n3);
        if (n4 > n6) {
            if (n4 < n6 + this.field1173) {
                if (n5 > n7) {
                    if (n5 < n7 + this.field1174) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
