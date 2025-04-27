// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public enum Class213 implements Class194 {
    field737,
    field738;

    @Override
    public int method839(final int n) {
        return n >> 1;
    }

    @Override
    public int method840(final int n) {
        return n >> 1;
    }

    @Override
    public int method835(final Class6432<?> class6432, final Class6631 class6433, final int n, final int n2) {
        final int method20074 = class6433.method20074(this.method839(n), this.method840(n2));
        class6432.method19188(n >> 1 << 1, n2 >> 1 << 1);
        final int n3 = n & 0x1;
        final int n4 = n2 & 0x1;
        if (n3 == 0 && n4 == 0) {
            return method20074;
        }
        final int method20075 = class6433.method20074(this.method839(n), this.method840(n2 + 1));
        final int method20076 = class6432.method19195(method20074, method20075);
        if (n3 == 0 && n4 == 1) {
            return method20076;
        }
        final int method20077 = class6433.method20074(this.method839(n + 1), this.method840(n2));
        final int method20078 = class6432.method19195(method20074, method20077);
        if (n3 == 1 && n4 == 0) {
            return method20078;
        }
        return this.method846(class6432, method20074, method20077, method20075, class6433.method20074(this.method839(n + 1), this.method840(n2 + 1)));
    }

    public int method846(final Class6432<?> class6432, final int n, final int n2, final int n3, final int n4) {
        if (n2 == n3 && n3 == n4) {
            return n2;
        }
        if (n == n2 && n == n3) {
            return n;
        }
        if (n == n2 && n == n4) {
            return n;
        }
        if (n == n3 && n == n4) {
            return n;
        }
        if (n == n2 && n3 != n4) {
            return n;
        }
        if (n == n3 && n2 != n4) {
            return n;
        }
        if (n == n4 && n2 != n3) {
            return n;
        }
        if (n2 == n3 && n != n4) {
            return n2;
        }
        if (n2 == n4 && n != n3) {
            return n2;
        }
        return (n3 == n4 && n != n2) ? n3 : class6432.method19196(n, n2, n3, n4);
    }
}
