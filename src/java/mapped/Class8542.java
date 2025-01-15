// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.sql.Timestamp;
import java.util.Date;
import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.HashMap;
import java.net.URI;
import java.util.Set;
import java.util.Map;

public final class Class8542
{
    public static final String field35863 = "tag:yaml.org,2002:";
    public static final Class8542 field35864;
    public static final Class8542 field35865;
    public static final Class8542 field35866;
    public static final Class8542 field35867;
    public static final Class8542 field35868;
    public static final Class8542 field35869;
    public static final Class8542 field35870;
    public static final Class8542 field35871;
    public static final Class8542 field35872;
    public static final Class8542 field35873;
    public static final Class8542 field35874;
    public static final Class8542 field35875;
    public static final Class8542 field35876;
    public static final Class8542 field35877;
    public static final Map<Class8542, Set<Class<?>>> field35878;
    private final String field35879;
    private boolean field35880;
    
    public Class8542(final String s) {
        this.field35880 = false;
        if (s == null) {
            throw new NullPointerException("Tag must be provided.");
        }
        if (s.length() == 0) {
            throw new IllegalArgumentException("Tag must not be empty.");
        }
        if (s.trim().length() == s.length()) {
            this.field35879 = Class9354.method34669(s);
            this.field35880 = !s.startsWith("tag:yaml.org,2002:");
            return;
        }
        throw new IllegalArgumentException("Tag must not contain leading or trailing spaces.");
    }
    
    public Class8542(final Class<?> clazz) {
        this.field35880 = false;
        if (clazz != null) {
            this.field35879 = "tag:yaml.org,2002:" + Class9354.method34669(clazz.getName());
            return;
        }
        throw new NullPointerException("Class for tag must be provided.");
    }
    
    public Class8542(final URI uri) {
        this.field35880 = false;
        if (uri != null) {
            this.field35879 = uri.toASCIIString();
            return;
        }
        throw new NullPointerException("URI for tag must be provided.");
    }
    
    public boolean method28656() {
        return this.field35880;
    }
    
    public String method28657() {
        return this.field35879;
    }
    
    public boolean method28658(final String prefix) {
        return this.field35879.startsWith(prefix);
    }
    
    public String method28659() {
        if (this.field35879.startsWith("tag:yaml.org,2002:")) {
            return Class9354.method34671(this.field35879.substring("tag:yaml.org,2002:".length()));
        }
        throw new Class2386("Invalid tag: " + this.field35879);
    }
    
    @Override
    public String toString() {
        return this.field35879;
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof Class8542 && this.field35879.equals(((Class8542)o).method28657());
    }
    
    @Override
    public int hashCode() {
        return this.field35879.hashCode();
    }
    
    public boolean method28660(final Class<?> clazz) {
        final Set set = Class8542.field35878.get(this);
        return set != null && set.contains(clazz);
    }
    
    public boolean method28661(final Class<?> clazz) {
        return this.field35879.equals("tag:yaml.org,2002:" + clazz.getName());
    }
    
    static {
        field35864 = new Class8542("tag:yaml.org,2002:yaml");
        field35865 = new Class8542("tag:yaml.org,2002:merge");
        field35866 = new Class8542("tag:yaml.org,2002:set");
        field35867 = new Class8542("tag:yaml.org,2002:pairs");
        field35868 = new Class8542("tag:yaml.org,2002:omap");
        field35869 = new Class8542("tag:yaml.org,2002:binary");
        field35870 = new Class8542("tag:yaml.org,2002:int");
        field35871 = new Class8542("tag:yaml.org,2002:float");
        field35872 = new Class8542("tag:yaml.org,2002:timestamp");
        field35873 = new Class8542("tag:yaml.org,2002:bool");
        field35874 = new Class8542("tag:yaml.org,2002:null");
        field35875 = new Class8542("tag:yaml.org,2002:str");
        field35876 = new Class8542("tag:yaml.org,2002:seq");
        field35877 = new Class8542("tag:yaml.org,2002:map");
        field35878 = new HashMap<Class8542, Set<Class<?>>>();
        final HashSet set = new HashSet();
        set.add(Double.class);
        set.add(Float.class);
        set.add(BigDecimal.class);
        Class8542.field35878.put(Class8542.field35871, set);
        final HashSet set2 = new HashSet();
        set2.add(Integer.class);
        set2.add(Long.class);
        set2.add(BigInteger.class);
        Class8542.field35878.put(Class8542.field35870, set2);
        final HashSet set3 = new HashSet();
        set3.add(Date.class);
        set3.add(java.sql.Date.class);
        set3.add(Timestamp.class);
        Class8542.field35878.put(Class8542.field35872, set3);
    }
}
