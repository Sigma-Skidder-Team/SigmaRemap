// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.List;
import java.util.Arrays;

public abstract class Class5601
{
    private String field22952;
    private String field22953;
    private String field22954;
    private String[] field22955;
    private String field22956;
    private String[] field22957;
    private boolean field22958;
    private boolean field22959;
    public static final String field22960 = "§a";
    public static final String field22961 = "§c";
    public static final String field22962 = "§9";
    
    public Class5601(final String field22952, final String field22953, final String field22954, final String[] field22955, final String field22956, final String s) {
        this.field22952 = null;
        this.field22953 = null;
        this.field22954 = null;
        this.field22955 = null;
        this.field22956 = null;
        this.field22957 = null;
        this.field22958 = true;
        this.field22959 = true;
        this.field22952 = field22952;
        this.field22953 = field22953;
        this.field22954 = field22954;
        this.field22955 = field22955;
        this.field22956 = field22956;
        if (s != null) {
            this.field22957 = new String[] { s };
        }
    }
    
    public String method16860() {
        return this.field22952;
    }
    
    public String method16861() {
        return this.field22953;
    }
    
    public String method16859() {
        return Class9216.method33898("option." + this.method16860() + ".comment", Class9518.method35517(Config.method28980(this.field22953), "//"));
    }
    
    public void method16862(final String field22953) {
        this.field22953 = field22953;
    }
    
    public String method16863() {
        return this.field22954;
    }
    
    public boolean method16864(final String field22954) {
        if (method16869(field22954, this.field22955) >= 0) {
            this.field22954 = field22954;
            return true;
        }
        return false;
    }
    
    public String method16865() {
        return this.field22956;
    }
    
    public void method16866() {
        this.field22954 = this.field22956;
    }
    
    public void method16867() {
        final int method16869 = method16869(this.field22954, this.field22955);
        if (method16869 >= 0) {
            this.field22954 = this.field22955[(method16869 + 1) % this.field22955.length];
        }
    }
    
    public void method16868() {
        final int method16869 = method16869(this.field22954, this.field22955);
        if (method16869 >= 0) {
            this.field22954 = this.field22955[(method16869 - 1 + this.field22955.length) % this.field22955.length];
        }
    }
    
    private static int method16869(final String anObject, final String[] array) {
        for (int i = 0; i < array.length; ++i) {
            if (array[i].equals(anObject)) {
                return i;
            }
        }
        return -1;
    }
    
    public String[] method16870() {
        return this.field22957;
    }
    
    public void method16871(final String[] array) {
        final List<String> list = Arrays.asList(this.field22957);
        for (int i = 0; i < array.length; ++i) {
            final String s = array[i];
            if (!list.contains(s)) {
                this.field22957 = (String[]) Config.method28982(this.field22957, s);
            }
        }
    }
    
    public boolean method16872() {
        return this.field22958;
    }
    
    public void method16873(final boolean field22958) {
        this.field22958 = field22958;
    }
    
    public boolean method16874() {
        return !Config.equals(this.field22954, this.field22956);
    }
    
    public boolean method16875() {
        return this.field22959;
    }
    
    public void method16876(final boolean field22959) {
        this.field22959 = field22959;
    }
    
    public boolean method16877(final String s) {
        return method16869(s, this.field22955) >= 0;
    }
    
    public String method16858() {
        return Class9216.method33898("option." + this.field22952, this.field22952);
    }
    
    public String method16878(final String str) {
        return Class9216.method33898("value." + this.field22952 + "." + str, str);
    }
    
    public String method16879(final String s) {
        return "";
    }
    
    public boolean method16880(final String s) {
        return false;
    }
    
    public boolean method16881() {
        return false;
    }
    
    public boolean method16882(final String s) {
        return false;
    }
    
    public String method16883() {
        return null;
    }
    
    public String[] method16884() {
        return this.field22955.clone();
    }
    
    public float method16885() {
        if (this.field22955.length <= 1) {
            return 0.0f;
        }
        final int method16869 = method16869(this.field22954, this.field22955);
        if (method16869 >= 0) {
            return 1.0f * method16869 / (this.field22955.length - 1.0f);
        }
        return 0.0f;
    }
    
    public void method16886(float method28866) {
        if (this.field22955.length > 1) {
            method28866 = Config.method28866(method28866, 0.0f, 1.0f);
            this.field22954 = this.field22955[Math.round(method28866 * (this.field22955.length - 1))];
        }
    }
    
    @Override
    public String toString() {
        return "" + this.field22952 + ", value: " + this.field22954 + ", valueDefault: " + this.field22956 + ", paths: " + Config.method28888(this.field22957);
    }
}
