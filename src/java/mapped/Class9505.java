// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;

public class Class9505
{
    public static final Class9505[] field40891;
    public static final Class9505 field40892;
    public static final Class9505 field40893;
    public static final Class9505 field40894;
    public static final Class9505 field40895;
    public static final Class9505 field40896;
    public static final Class9505 field40897;
    public static final Class9505 field40898;
    public static final Class9505 field40899;
    private final int field40900;
    private final String field40901;
    private final String field40902;
    private final int field40903;
    private boolean field40904;
    private boolean field40905;
    private boolean field40906;
    private boolean field40907;
    
    private Class9505(final int n, final String s) {
        this(n, s, s, 0);
    }
    
    private Class9505(final int n, final String s, final int n2) {
        this(n, s, s, n2);
    }
    
    private Class9505(final int field40900, final String field40901, final String field40902, final int field40903) {
        this.field40901 = field40901;
        this.field40902 = field40902;
        this.field40903 = field40903;
        this.field40904 = true;
        this.field40900 = field40900;
        Class9505.field40891[field40900] = this;
    }
    
    public String method35398() {
        return this.field40901;
    }
    
    public String method35399() {
        return this.field40902;
    }
    
    public String method35400() {
        return "generator." + this.field40901;
    }
    
    public String method35401() {
        return this.method35400() + ".info";
    }
    
    public int method35402() {
        return this.field40903;
    }
    
    public Class9505 method35403(final int n) {
        return (this == Class9505.field40892 && n == 0) ? Class9505.field40899 : this;
    }
    
    public boolean method35404() {
        return this.field40907;
    }
    
    public Class9505 method35405(final boolean field40907) {
        this.field40907 = field40907;
        return this;
    }
    
    private Class9505 method35406(final boolean field40904) {
        this.field40904 = field40904;
        return this;
    }
    
    public boolean method35407() {
        return this.field40904;
    }
    
    private Class9505 method35408() {
        this.field40905 = true;
        return this;
    }
    
    public boolean method35409() {
        return this.field40905;
    }
    
    @Nullable
    public static Class9505 method35410(final String anotherString) {
        for (final Class9505 class9505 : Class9505.field40891) {
            if (class9505 != null && class9505.field40901.equalsIgnoreCase(anotherString)) {
                return class9505;
            }
        }
        return null;
    }
    
    public int method35411() {
        return this.field40900;
    }
    
    public boolean method35412() {
        return this.field40906;
    }
    
    private Class9505 method35413() {
        this.field40906 = true;
        return this;
    }
    
    static {
        field40891 = new Class9505[16];
        field40892 = new Class9505(0, "default", 1).method35408();
        field40893 = new Class9505(1, "flat").method35405(true);
        field40894 = new Class9505(2, "largeBiomes");
        field40895 = new Class9505(3, "amplified").method35413();
        field40896 = new Class9505(4, "customized", "normal", 0).method35405(true).method35406(false);
        field40897 = new Class9505(5, "buffet").method35405(true);
        field40898 = new Class9505(6, "debug_all_block_states");
        field40899 = new Class9505(8, "default_1_1", 0).method35406(false);
    }
}
