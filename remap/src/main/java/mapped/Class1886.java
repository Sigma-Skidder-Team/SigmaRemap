// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1886 implements Class1887
{
    private final Class1890<?, ?> field10270;
    private final Class1890<?, ?> field10271;
    
    public Class1886(final Class1908 class1908, final boolean b, final boolean b2) {
        this.field10270 = (b ? new Class1901(class1908) : null);
        this.field10271 = (b2 ? new Class1902(class1908) : null);
    }
    
    public void method7252(final Class354 class354) {
        if (this.field10270 != null) {
            this.field10270.method7310(class354);
        }
        if (this.field10271 != null) {
            this.field10271.method7310(class354);
        }
    }
    
    public void method7251(final Class354 class354, final int n) {
        if (this.field10270 != null) {
            this.field10270.method7311(class354, n);
        }
    }
    
    public boolean method7287() {
        return (this.field10271 != null && this.field10271.method7306()) || (this.field10270 != null && this.field10270.method7306());
    }
    
    public int method7250(final int n, final boolean b, final boolean b2) {
        if (this.field10270 != null && this.field10271 != null) {
            final int n2 = n / 2;
            final int method7307 = this.field10270.method7307(n2, b, b2);
            final int method7308 = this.field10271.method7307(n - n2 + method7307, b, b2);
            return (method7307 == 0 && method7308 > 0) ? this.field10270.method7307(method7308, b, b2) : method7308;
        }
        if (this.field10270 == null) {
            return (this.field10271 == null) ? n : this.field10271.method7307(n, b, b2);
        }
        return this.field10270.method7307(n, b, b2);
    }
    
    @Override
    public void method7254(final Class353 class353, final boolean b) {
        if (this.field10270 != null) {
            this.field10270.method7254(class353, b);
        }
        if (this.field10271 != null) {
            this.field10271.method7254(class353, b);
        }
    }
    
    public void method7255(final Class7859 class7859, final boolean b) {
        if (this.field10270 != null) {
            this.field10270.method7312(class7859, b);
        }
        if (this.field10271 != null) {
            this.field10271.method7312(class7859, b);
        }
    }
    
    public Class1888 method7288(final Class237 class237) {
        if (class237 != Class237.field912) {
            return (this.field10271 != null) ? this.field10271 : Class1889.field10272;
        }
        return (this.field10270 != null) ? this.field10270 : Class1889.field10272;
    }
    
    public String method7289(final Class237 class237, final Class353 class238) {
        if (class237 != Class237.field912) {
            if (this.field10271 != null) {
                return this.field10271.method7309(class238.method1117());
            }
        }
        else if (this.field10270 != null) {
            return this.field10270.method7309(class238.method1117());
        }
        return "n/a";
    }
    
    public void method7256(final Class237 class237, final Class353 class238, final Class7281 class239) {
        if (class237 != Class237.field912) {
            if (this.field10271 != null) {
                this.field10271.method7308(class238.method1117(), class239);
            }
        }
        else if (this.field10270 != null) {
            this.field10270.method7308(class238.method1117(), class239);
        }
    }
    
    public void method7259(final Class7859 class7859, final boolean b) {
        if (this.field10270 != null) {
            this.field10270.method7313(class7859, b);
        }
        if (this.field10271 != null) {
            this.field10271.method7313(class7859, b);
        }
    }
    
    public int method7290(final Class354 class354, final int n) {
        return Math.max((this.field10270 != null) ? this.field10270.method7293(class354) : 0, (this.field10271 != null) ? (this.field10271.method7293(class354) - n) : 0);
    }
}
