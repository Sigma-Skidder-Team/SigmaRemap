// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.regex.Matcher;
import java.util.Iterator;
import org.apache.commons.lang3.StringEscapeUtils;
import java.util.Arrays;
import java.util.regex.Pattern;

public class Class8998
{
    private String[] field37958;
    private String field37959;
    private boolean field37960;
    private int field37961;
    private String field37962;
    private int field37963;
    private static final int field37964 = 0;
    private static final int field37965 = 1;
    private static final int field37966 = 2;
    private static final int field37967 = 3;
    private static final int field37968 = 4;
    private static final String field37969 = "pattern:";
    private static final String field37970 = "ipattern:";
    private static final String field37971 = "regex:";
    private static final String field37972 = "iregex:";
    private static final int field37973 = 0;
    private static final int field37974 = 1;
    private static final String field37975 = "#";
    private static final Pattern field37976;
    private static final Pattern field37977;
    
    public Class8998(final String s, String s2) {
        this.field37958 = null;
        this.field37959 = null;
        this.field37960 = false;
        this.field37961 = 0;
        this.field37962 = null;
        this.field37963 = 0;
        final String[] method28937 = Class8571.method28937(s, ".");
        this.field37958 = Arrays.copyOfRange(method28937, 0, method28937.length - 1);
        this.field37959 = method28937[method28937.length - 1];
        if (s2.startsWith("!")) {
            this.field37960 = true;
            s2 = s2.substring(1);
        }
        if (!s2.startsWith("pattern:")) {
            if (!s2.startsWith("ipattern:")) {
                if (!s2.startsWith("regex:")) {
                    if (!s2.startsWith("iregex:")) {
                        this.field37961 = 0;
                    }
                    else {
                        this.field37961 = 4;
                        s2 = s2.substring("iregex:".length()).toLowerCase();
                    }
                }
                else {
                    this.field37961 = 3;
                    s2 = s2.substring("regex:".length());
                }
            }
            else {
                this.field37961 = 2;
                s2 = s2.substring("ipattern:".length()).toLowerCase();
            }
        }
        else {
            this.field37961 = 1;
            s2 = s2.substring("pattern:".length());
        }
        s2 = StringEscapeUtils.unescapeJava(s2);
        if (this.field37961 == 0) {
            if (Class8998.field37976.matcher(s2).matches()) {
                this.field37963 = 1;
            }
        }
        this.field37962 = s2;
    }
    
    public boolean method32117(final Class51 class51) {
        if (!this.field37960) {
            return this.method32118(class51);
        }
        return !this.method32118(class51);
    }
    
    public boolean method32118(final Class51 class51) {
        if (class51 == null) {
            return false;
        }
        Class41 method32120 = class51;
        for (int i = 0; i < this.field37958.length; ++i) {
            method32120 = method32120(method32120, this.field37958[i]);
            if (method32120 == null) {
                return false;
            }
        }
        if (!this.field37959.equals("*")) {
            final Class41 method32121 = method32120(method32120, this.field37959);
            return method32121 != null && this.method32121(method32121);
        }
        return this.method32119(method32120);
    }
    
    private boolean method32119(final Class41 class41) {
        if (class41 instanceof Class51) {
            final Class51 class42 = (Class51)class41;
            final Iterator<String> iterator = class42.method293().iterator();
            while (iterator.hasNext()) {
                if (!this.method32121(class42.method313(iterator.next()))) {
                    continue;
                }
                return true;
            }
        }
        if (class41 instanceof Class52) {
            final Class52 class43 = (Class52)class41;
            for (int size = class43.size(), i = 0; i < size; ++i) {
                if (this.method32121(class43.get(i))) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private static Class41 method32120(final Class41 class41, final String s) {
        if (class41 instanceof Class51) {
            return ((Class51)class41).method313(s);
        }
        if (!(class41 instanceof Class52)) {
            return null;
        }
        final Class52 class42 = (Class52)class41;
        if (!s.equals("count")) {
            final int method28933 = Class8571.method28933(s, -1);
            return (method28933 >= 0 && method28933 < class42.size()) ? class42.get(method28933) : null;
        }
        return Class45.method279(class42.size());
    }
    
    public boolean method32121(final Class41 class41) {
        return class41 != null && this.method32122(method32125(class41, this.field37963));
    }
    
    public boolean method32122(final String s) {
        if (s == null) {
            return false;
        }
        switch (this.field37961) {
            case 0: {
                return s.equals(this.field37962);
            }
            case 1: {
                return this.method32123(s, this.field37962);
            }
            case 2: {
                return this.method32123(s.toLowerCase(), this.field37962);
            }
            case 3: {
                return this.method32124(s, this.field37962);
            }
            case 4: {
                return this.method32124(s.toLowerCase(), this.field37962);
            }
            default: {
                throw new IllegalArgumentException("Unknown NbtTagValue type: " + this.field37961);
            }
        }
    }
    
    private boolean method32123(final String s, final String s2) {
        return Class9518.method35499(s, s2, '*', '?');
    }
    
    private boolean method32124(final String s, final String regex) {
        return s.matches(regex);
    }
    
    private static String method32125(final Class41 class41, final int n) {
        if (class41 == null) {
            return null;
        }
        if (class41 instanceof Class50) {
            final String method267 = ((Class50)class41).method267();
            if (method267.startsWith("{")) {
                final Matcher matcher = Class8998.field37977.matcher(method267);
                if (matcher.matches()) {
                    return matcher.group(1);
                }
            }
            return method267;
        }
        if (class41 instanceof Class45) {
            final Class45 class42 = (Class45)class41;
            return (n != 1) ? Integer.toString(class42.method271()) : ("#" + Class9518.method35513(Integer.toHexString(class42.method271()), 6, '0'));
        }
        if (class41 instanceof Class47) {
            return Byte.toString(((Class47)class41).method273());
        }
        if (class41 instanceof Class48) {
            return Short.toString(((Class48)class41).method272());
        }
        if (class41 instanceof Class49) {
            return Long.toString(((Class49)class41).method270());
        }
        if (class41 instanceof Class46) {
            return Float.toString(((Class46)class41).method275());
        }
        if (!(class41 instanceof Class44)) {
            return class41.toString();
        }
        return Double.toString(((Class44)class41).method274());
    }
    
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        for (int i = 0; i < this.field37958.length; ++i) {
            final String str = this.field37958[i];
            if (i > 0) {
                sb.append(".");
            }
            sb.append(str);
        }
        if (sb.length() > 0) {
            sb.append(".");
        }
        sb.append(this.field37959);
        sb.append(" = ");
        sb.append(this.field37962);
        return sb.toString();
    }
    
    static {
        field37976 = Pattern.compile("^#[0-9a-f]{6}+$");
        field37977 = Pattern.compile(".*\"text\":\"([^\"]+)\".*");
    }
}
