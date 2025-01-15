// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;
import java.util.List;

public final class Class8640
{
    public final List<String> field36241;
    
    public Class8640() {
        this.field36241 = new ArrayList<String>(20);
    }
    
    public Class8640 method29376(final String s) {
        final int index = s.indexOf(":", 1);
        if (index != -1) {
            return this.method29379(s.substring(0, index), s.substring(index + 1));
        }
        if (!s.startsWith(":")) {
            return this.method29379("", s);
        }
        return this.method29379("", s.substring(1));
    }
    
    public Class8640 method29377(final String str) {
        final int index = str.indexOf(":");
        if (index != -1) {
            return this.method29378(str.substring(0, index).trim(), str.substring(index + 1));
        }
        throw new IllegalArgumentException("Unexpected header: " + str);
    }
    
    public Class8640 method29378(final String s, final String s2) {
        this.method29382(s, s2);
        return this.method29379(s, s2);
    }
    
    public Class8640 method29379(final String s, final String s2) {
        this.field36241.add(s);
        this.field36241.add(s2.trim());
        return this;
    }
    
    public Class8640 method29380(final String s) {
        for (int i = 0; i < this.field36241.size(); i += 2) {
            if (s.equalsIgnoreCase(this.field36241.get(i))) {
                this.field36241.remove(i);
                this.field36241.remove(i);
                i -= 2;
            }
        }
        return this;
    }
    
    public Class8640 method29381(final String s, final String s2) {
        this.method29382(s, s2);
        this.method29380(s);
        this.method29379(s, s2);
        return this;
    }
    
    private void method29382(final String str, final String s) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (str.isEmpty()) {
            throw new IllegalArgumentException("name is empty");
        }
        for (int i = 0; i < str.length(); ++i) {
            final char char1 = str.charAt(i);
            if (char1 <= ' ' || char1 >= '\u007f') {
                throw new IllegalArgumentException(Class7690.method24456("Unexpected char %#04x at %d in header name: %s", (int)char1, i, str));
            }
        }
        if (s != null) {
            for (int j = 0; j < s.length(); ++j) {
                final char char2 = s.charAt(j);
                if ((char2 <= '\u001f' && char2 != '\t') || char2 >= '\u007f') {
                    throw new IllegalArgumentException(Class7690.method24456("Unexpected char %#04x at %d in %s value: %s", (int)char2, j, str, s));
                }
            }
            return;
        }
        throw new NullPointerException("value for name " + str + " == null");
    }
    
    public String method29383(final String s) {
        for (int i = this.field36241.size() - 2; i >= 0; i -= 2) {
            if (s.equalsIgnoreCase(this.field36241.get(i))) {
                return this.field36241.get(i + 1);
            }
        }
        return null;
    }
    
    public Class6957 method29384() {
        return new Class6957(this);
    }
}
