// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.net.URL;

public class Class8896
{
    public Class8846 field37402;
    public String field37403;
    public Class8640 field37404;
    public Class7173 field37405;
    public Object field37406;
    
    public Class8896() {
        this.field37403 = "GET";
        this.field37404 = new Class8640();
    }
    
    public Class8896(final Class8596 class8596) {
        this.field37402 = class8596.field36099;
        this.field37403 = class8596.field36100;
        this.field37405 = class8596.field36102;
        this.field37406 = class8596.field36103;
        this.field37404 = class8596.field36101.method21366();
    }
    
    public Class8896 method31309(final Class8846 field37402) {
        if (field37402 != null) {
            this.field37402 = field37402;
            return this;
        }
        throw new NullPointerException("url == null");
    }
    
    public Class8896 method31310(String str) {
        if (str == null) {
            throw new NullPointerException("url == null");
        }
        if (!str.regionMatches(true, 0, "ws:", 0, 3)) {
            if (str.regionMatches(true, 0, "wss:", 0, 4)) {
                str = "https:" + str.substring(4);
            }
        }
        else {
            str = "http:" + str.substring(3);
        }
        final Class8846 method30960 = Class8846.method30960(str);
        if (method30960 != null) {
            return this.method31309(method30960);
        }
        throw new IllegalArgumentException("unexpected url: " + str);
    }
    
    public Class8896 method31311(final URL obj) {
        if (obj == null) {
            throw new NullPointerException("url == null");
        }
        final Class8846 method30961 = Class8846.method30961(obj);
        if (method30961 != null) {
            return this.method31309(method30961);
        }
        throw new IllegalArgumentException("unexpected url: " + obj);
    }
    
    public Class8896 method31312(final String s, final String s2) {
        this.field37404.method29381(s, s2);
        return this;
    }
    
    public Class8896 method31313(final String s, final String s2) {
        this.field37404.method29378(s, s2);
        return this;
    }
    
    public Class8896 method31314(final String s) {
        this.field37404.method29380(s);
        return this;
    }
    
    public Class8896 method31315(final Class6957 class6957) {
        this.field37404 = class6957.method21366();
        return this;
    }
    
    public Class8896 method31316(final Class6668 class6668) {
        final String string = class6668.toString();
        if (!string.isEmpty()) {
            return this.method31312("Cache-Control", string);
        }
        return this.method31314("Cache-Control");
    }
    
    public Class8896 method31317() {
        return this.method31324("GET", null);
    }
    
    public Class8896 method31318() {
        return this.method31324("HEAD", null);
    }
    
    public Class8896 method31319(final Class7173 class7173) {
        return this.method31324("POST", class7173);
    }
    
    public Class8896 method31320(final Class7173 class7173) {
        return this.method31324("DELETE", class7173);
    }
    
    public Class8896 method31321() {
        return this.method31320(Class7690.field30543);
    }
    
    public Class8896 method31322(final Class7173 class7173) {
        return this.method31324("PUT", class7173);
    }
    
    public Class8896 method31323(final Class7173 class7173) {
        return this.method31324("PATCH", class7173);
    }
    
    public Class8896 method31324(final String field37403, final Class7173 field37404) {
        if (field37403 == null) {
            throw new NullPointerException("method == null");
        }
        if (field37403.length() == 0) {
            throw new IllegalArgumentException("method.length() == 0");
        }
        if (field37404 != null && !Class8196.method27144(field37403)) {
            throw new IllegalArgumentException("method " + field37403 + " must not have a request body.");
        }
        if (field37404 == null && Class8196.method27143(field37403)) {
            throw new IllegalArgumentException("method " + field37403 + " must have a request body.");
        }
        this.field37403 = field37403;
        this.field37405 = field37404;
        return this;
    }
    
    public Class8896 method31325(final Object field37406) {
        this.field37406 = field37406;
        return this;
    }
    
    public Class8596 method31326() {
        if (this.field37402 != null) {
            return new Class8596(this);
        }
        throw new IllegalStateException("url == null");
    }
}
