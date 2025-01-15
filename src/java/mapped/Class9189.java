// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class9189
{
    public Class8596 field38932;
    public Class190 field38933;
    public int field38934;
    public String field38935;
    public Class8772 field38936;
    public Class8640 field38937;
    public Class1760 field38938;
    public Class1753 field38939;
    public Class1753 field38940;
    public Class1753 field38941;
    public long field38942;
    public long field38943;
    
    public Class9189() {
        this.field38934 = -1;
        this.field38937 = new Class8640();
    }
    
    public Class9189(final Class1753 class1753) {
        this.field38934 = -1;
        this.field38932 = class1753.field9740;
        this.field38933 = class1753.field9741;
        this.field38934 = class1753.field9742;
        this.field38935 = class1753.field9743;
        this.field38936 = class1753.field9744;
        this.field38937 = class1753.field9745.method21366();
        this.field38938 = class1753.field9746;
        this.field38939 = class1753.field9747;
        this.field38940 = class1753.field9748;
        this.field38941 = class1753.field9749;
        this.field38942 = class1753.field9750;
        this.field38943 = class1753.field9751;
    }
    
    public Class9189 method33595(final Class8596 field38932) {
        this.field38932 = field38932;
        return this;
    }
    
    public Class9189 method33596(final Class190 field38933) {
        this.field38933 = field38933;
        return this;
    }
    
    public Class9189 method33597(final int field38934) {
        this.field38934 = field38934;
        return this;
    }
    
    public Class9189 method33598(final String field38935) {
        this.field38935 = field38935;
        return this;
    }
    
    public Class9189 method33599(final Class8772 field38936) {
        this.field38936 = field38936;
        return this;
    }
    
    public Class9189 method33600(final String s, final String s2) {
        this.field38937.method29381(s, s2);
        return this;
    }
    
    public Class9189 method33601(final String s, final String s2) {
        this.field38937.method29378(s, s2);
        return this;
    }
    
    public Class9189 method33602(final String s) {
        this.field38937.method29380(s);
        return this;
    }
    
    public Class9189 method33603(final Class6957 class6957) {
        this.field38937 = class6957.method21366();
        return this;
    }
    
    public Class9189 method33604(final Class1760 field38938) {
        this.field38938 = field38938;
        return this;
    }
    
    public Class9189 method33605(final Class1753 field38939) {
        if (field38939 != null) {
            this.method33607("networkResponse", field38939);
        }
        this.field38939 = field38939;
        return this;
    }
    
    public Class9189 method33606(final Class1753 field38940) {
        if (field38940 != null) {
            this.method33607("cacheResponse", field38940);
        }
        this.field38940 = field38940;
        return this;
    }
    
    private void method33607(final String s, final Class1753 class1753) {
        if (class1753.field9746 != null) {
            throw new IllegalArgumentException(s + ".body != null");
        }
        if (class1753.field9747 != null) {
            throw new IllegalArgumentException(s + ".networkResponse != null");
        }
        if (class1753.field9748 != null) {
            throw new IllegalArgumentException(s + ".cacheResponse != null");
        }
        if (class1753.field9749 == null) {
            return;
        }
        throw new IllegalArgumentException(s + ".priorResponse != null");
    }
    
    public Class9189 method33608(final Class1753 field38941) {
        if (field38941 != null) {
            this.method33609(field38941);
        }
        this.field38941 = field38941;
        return this;
    }
    
    private void method33609(final Class1753 class1753) {
        if (class1753.field9746 == null) {
            return;
        }
        throw new IllegalArgumentException("priorResponse.body != null");
    }
    
    public Class9189 method33610(final long field38942) {
        this.field38942 = field38942;
        return this;
    }
    
    public Class9189 method33611(final long field38943) {
        this.field38943 = field38943;
        return this;
    }
    
    public Class1753 method33612() {
        if (this.field38932 == null) {
            throw new IllegalStateException("request == null");
        }
        if (this.field38933 == null) {
            throw new IllegalStateException("protocol == null");
        }
        if (this.field38934 < 0) {
            throw new IllegalStateException("code < 0: " + this.field38934);
        }
        if (this.field38935 != null) {
            return new Class1753(this);
        }
        throw new IllegalStateException("message == null");
    }
}
