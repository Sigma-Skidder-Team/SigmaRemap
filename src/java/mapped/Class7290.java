// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;

public class Class7290 implements Class7291, Class7292
{
    private static String[] field28242;
    private ArrayList field28243;
    private Class6539 field28244;
    private Class7449 field28245;
    private int field28246;
    private Class1928[][] field28247;
    private boolean field28248;
    private Class8054 field28249;
    private Class1928 field28250;
    private Class7916 field28251;
    private int field28252;
    private int field28253;
    private int field28254;
    
    public Class7290(final Class7449 class7449, final int n, final boolean b) {
        this(class7449, n, b, new Class8055());
    }
    
    public Class7290(final Class7449 field28245, final int field28246, final boolean field28247, final Class8054 field28248) {
        this.field28243 = new ArrayList();
        this.field28244 = new Class6539(this, null);
        this.field28249 = field28248;
        this.field28245 = field28245;
        this.field28246 = field28246;
        this.field28248 = field28247;
        this.field28247 = new Class1928[field28245.method22913()][field28245.method22914()];
        for (int i = 0; i < field28245.method22913(); ++i) {
            for (int j = 0; j < field28245.method22914(); ++j) {
                this.field28247[i][j] = new Class1928(this, i, j);
            }
        }
    }
    
    @Override
    public Class2411 method22345(final Class7916 field28251, final int n, final int n2, final int field28252, final int field28253) {
        this.field28250 = null;
        this.field28251 = field28251;
        this.field28252 = field28252;
        this.field28253 = field28253;
        this.field28254 = 0;
        if (this.field28245.method22916(this, field28252, field28253)) {
            return null;
        }
        for (int i = 0; i < this.field28245.method22913(); ++i) {
            for (int j = 0; j < this.field28245.method22914(); ++j) {
                this.field28247[i][j].method7728();
            }
        }
        Class1928.method7729(this.field28247[n][n2], 0.0f);
        Class1928.method7730(this.field28247[n][n2], 0);
        this.field28243.clear();
        this.field28244.method19771();
        this.method22349(this.field28247[n][n2]);
        Class1928.method7731(this.field28247[field28252][field28253], null);
        int k = 0;
        while (k < this.field28246) {
            if (this.field28244.method19774() == 0) {
                break;
            }
            int method7732 = n;
            int method7733 = n2;
            if (this.field28250 != null) {
                method7732 = Class1928.method7732(this.field28250);
                method7733 = Class1928.method7733(this.field28250);
            }
            this.field28250 = this.method22348();
            this.field28254 = Class1928.method7734(this.field28250);
            if (this.field28250 == this.field28247[field28252][field28253] && this.method22355(field28251, method7732, method7733, field28252, field28253)) {
                break;
            }
            this.method22351(this.field28250);
            this.method22352(this.field28250);
            for (int l = -1; l < 2; ++l) {
                for (int n3 = -1; n3 < 2; ++n3) {
                    if (l != 0 || n3 != 0) {
                        if (!this.field28248) {
                            if (l != 0) {
                                if (n3 != 0) {
                                    continue;
                                }
                            }
                        }
                        final int n4 = l + Class1928.method7732(this.field28250);
                        final int n5 = n3 + Class1928.method7733(this.field28250);
                        if (this.method22355(field28251, Class1928.method7732(this.field28250), Class1928.method7733(this.field28250), n4, n5)) {
                            final float n6 = Class1928.method7735(this.field28250) + this.method22356(field28251, Class1928.method7732(this.field28250), Class1928.method7733(this.field28250), n4, n5);
                            final Class1928 class1928 = this.field28247[n4][n5];
                            this.field28245.method22915(n4, n5);
                            if (n6 < Class1928.method7735(class1928)) {
                                if (this.method22350(class1928)) {
                                    this.method22351(class1928);
                                }
                                if (this.method22353(class1928)) {
                                    this.method22354(class1928);
                                }
                            }
                            if (!this.method22350(class1928)) {
                                if (!this.method22353(class1928)) {
                                    Class1928.method7729(class1928, n6);
                                    Class1928.method7736(class1928, this.method22357(field28251, n4, n5, field28252, field28253));
                                    k = Math.max(k, class1928.method7723(this.field28250));
                                    this.method22349(class1928);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (Class1928.method7737(this.field28247[field28252][field28253]) != null) {
            final Class2411 class1929 = new Class2411();
            for (Class1928 method7734 = this.field28247[field28252][field28253]; method7734 != this.field28247[n][n2]; method7734 = Class1928.method7737(method7734)) {
                class1929.method9625(Class1928.method7732(method7734), Class1928.method7733(method7734));
            }
            class1929.method9625(n, n2);
            return class1929;
        }
        return null;
    }
    
    public int method22346() {
        if (this.field28250 != null) {
            return Class1928.method7732(this.field28250);
        }
        return -1;
    }
    
    public int method22347() {
        if (this.field28250 != null) {
            return Class1928.method7733(this.field28250);
        }
        return -1;
    }
    
    public Class1928 method22348() {
        return (Class1928)this.field28244.method19770();
    }
    
    public void method22349(final Class1928 class1928) {
        class1928.method7724(true);
        this.field28244.method19772(class1928);
    }
    
    public boolean method22350(final Class1928 class1928) {
        return class1928.method7725();
    }
    
    public void method22351(final Class1928 class1928) {
        class1928.method7724(false);
        this.field28244.method19773(class1928);
    }
    
    public void method22352(final Class1928 e) {
        e.method7726(true);
        this.field28243.add(e);
    }
    
    public boolean method22353(final Class1928 class1928) {
        return class1928.method7727();
    }
    
    public void method22354(final Class1928 o) {
        o.method7726(false);
        this.field28243.remove(o);
    }
    
    public boolean method22355(final Class7916 field28251, final int field28252, final int field28253, final int n, final int n2) {
        boolean b = false;
        Label_0060: {
            if (n >= 0) {
                if (n2 >= 0) {
                    if (n < this.field28245.method22913()) {
                        if (n2 < this.field28245.method22914()) {
                            b = false;
                            break Label_0060;
                        }
                    }
                }
            }
            b = true;
        }
        boolean method22916 = b;
        if (!method22916) {
            if (field28252 != n || field28253 != n2) {
                this.field28251 = field28251;
                this.field28252 = field28252;
                this.field28253 = field28253;
                method22916 = this.field28245.method22916(this, n, n2);
            }
        }
        return !method22916;
    }
    
    public float method22356(final Class7916 field28251, final int field28252, final int field28253, final int n, final int n2) {
        this.field28251 = field28251;
        this.field28252 = field28252;
        this.field28253 = field28253;
        return this.field28245.method22917(this, n, n2);
    }
    
    public float method22357(final Class7916 class7916, final int n, final int n2, final int n3, final int n4) {
        return this.field28249.method26428(this.field28245, class7916, n, n2, n3, n4);
    }
    
    @Override
    public Class7916 method22358() {
        return this.field28251;
    }
    
    @Override
    public int method22359() {
        return this.field28254;
    }
    
    @Override
    public int method22360() {
        return this.field28252;
    }
    
    @Override
    public int method22361() {
        return this.field28253;
    }
}
