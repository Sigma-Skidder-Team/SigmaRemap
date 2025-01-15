// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collections;
import java.io.IOException;
import javax.annotation.Nullable;
import java.util.List;
import java.io.Closeable;

public final class Class1753 implements Closeable
{
    public final Class8596 field9740;
    public final Class190 field9741;
    public final int field9742;
    public final String field9743;
    public final Class8772 field9744;
    public final Class6957 field9745;
    public final Class1760 field9746;
    public final Class1753 field9747;
    public final Class1753 field9748;
    public final Class1753 field9749;
    public final long field9750;
    public final long field9751;
    private volatile Class6668 field9752;
    
    public Class1753(final Class9189 class9189) {
        this.field9740 = class9189.field38932;
        this.field9741 = class9189.field38933;
        this.field9742 = class9189.field38934;
        this.field9743 = class9189.field38935;
        this.field9744 = class9189.field38936;
        this.field9745 = class9189.field38937.method29384();
        this.field9746 = class9189.field38938;
        this.field9747 = class9189.field38939;
        this.field9748 = class9189.field38940;
        this.field9749 = class9189.field38941;
        this.field9750 = class9189.field38942;
        this.field9751 = class9189.field38943;
    }
    
    public Class8596 method6186() {
        return this.field9740;
    }
    
    public Class190 method6187() {
        return this.field9741;
    }
    
    public int method6188() {
        return this.field9742;
    }
    
    public boolean method6189() {
        return this.field9742 >= 200 && this.field9742 < 300;
    }
    
    public String method6190() {
        return this.field9743;
    }
    
    public Class8772 method6191() {
        return this.field9744;
    }
    
    public List<String> method6192(final String s) {
        return this.field9745.values(s);
    }
    
    @Nullable
    public String method6193(final String s) {
        return this.method6194(s, null);
    }
    
    @Nullable
    public String method6194(final String s, final String s2) {
        final String method21360 = this.field9745.method21360(s);
        return (method21360 == null) ? s2 : method21360;
    }
    
    public Class6957 method6195() {
        return this.field9745;
    }
    
    public Class1760 method6196(final long n) throws IOException {
        final Class1681 method6285 = this.field9746.method6285();
        method6285.method5953(n);
        final Class1680 clone = method6285.method5926().clone();
        Class1680 class1680;
        if (clone.method5949() <= n) {
            class1680 = clone;
        }
        else {
            class1680 = new Class1680();
            class1680.method5920(clone, n);
            clone.method5994();
        }
        return Class1760.method6292(this.field9746.method6282(), class1680.method5949(), class1680);
    }
    
    @Nullable
    public Class1760 method6197() {
        return this.field9746;
    }
    
    public Class9189 method6198() {
        return new Class9189(this);
    }
    
    public boolean method6199() {
        switch (this.field9742) {
            case 300:
            case 301:
            case 302:
            case 303:
            case 307:
            case 308: {
                return true;
            }
            default: {
                return false;
            }
        }
    }
    
    @Nullable
    public Class1753 method6200() {
        return this.field9747;
    }
    
    @Nullable
    public Class1753 method6201() {
        return this.field9748;
    }
    
    @Nullable
    public Class1753 method6202() {
        return this.field9749;
    }
    
    public List<Class8728> method6203() {
        String s;
        if (this.field9742 != 401) {
            if (this.field9742 != 407) {
                return Collections.emptyList();
            }
            s = "Proxy-Authenticate";
        }
        else {
            s = "WWW-Authenticate";
        }
        return Class9558.method35761(this.method6195(), s);
    }
    
    public Class6668 method6204() {
        final Class6668 field9752 = this.field9752;
        return (field9752 == null) ? (this.field9752 = Class6668.method20294(this.field9745)) : field9752;
    }
    
    public long method6205() {
        return this.field9750;
    }
    
    public long method6206() {
        return this.field9751;
    }
    
    @Override
    public void close() {
        this.field9746.close();
    }
    
    @Override
    public String toString() {
        return "Response{protocol=" + this.field9741 + ", code=" + this.field9742 + ", message=" + this.field9743 + ", url=" + this.field9740.method29109() + '}';
    }
}
