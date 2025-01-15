// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.base.Joiner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Class1931 implements Comparable<Class1931>
{
    private static final Pattern field10538;
    private final int[] field10539;
    private String field10540;
    
    public Class1931(final String input) {
        this.field10539 = new int[3];
        if (input == null) {
            throw new IllegalArgumentException("Version can not be null");
        }
        final Matcher matcher = Class1931.field10538.matcher(input);
        if (matcher.matches()) {
            this.field10539[0] = Integer.parseInt(matcher.group("a"));
            this.field10539[1] = Integer.parseInt(matcher.group("b"));
            this.field10539[2] = ((matcher.group("c") != null) ? Integer.parseInt(matcher.group("c")) : 0);
            this.field10540 = ((matcher.group("tag") != null) ? matcher.group("tag") : "");
            return;
        }
        throw new IllegalArgumentException("Invalid version format");
    }
    
    public static int method7792(final Class1931 class1931, final Class1931 class1932) {
        if (class1931 == class1932) {
            return 0;
        }
        if (class1931 == null) {
            return -1;
        }
        if (class1932 == null) {
            return 1;
        }
        for (int max = Math.max(class1931.field10539.length, class1932.field10539.length), i = 0; i < max; ++i) {
            final int n = (i >= class1931.field10539.length) ? 0 : class1931.field10539[i];
            final int n2 = (i >= class1932.field10539.length) ? 0 : class1932.field10539[i];
            if (n < n2) {
                return -1;
            }
            if (n > n2) {
                return 1;
            }
        }
        if (class1931.field10540.length() == 0 && class1932.field10540.length() > 0) {
            return 1;
        }
        if (class1931.field10540.length() > 0 && class1932.field10540.length() == 0) {
            return -1;
        }
        return 0;
    }
    
    public static boolean equals(final Class1931 class1931, final Class1931 class1932) {
        if (class1931 != class1932) {
            if (class1931 != null) {
                if (class1932 != null) {
                    if (method7792(class1931, class1932) == 0) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        final String[] array = new String[this.field10539.length];
        for (int i = 0; i < this.field10539.length; ++i) {
            array[i] = String.valueOf(this.field10539[i]);
        }
        return Joiner.on(".").join((Object[])array) + ((this.field10540.length() == 0) ? "" : ("-" + this.field10540));
    }
    
    @Override
    public int compareTo(final Class1931 class1931) {
        return method7792(this, class1931);
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof Class1931 && equals(this, (Class1931)o);
    }
    
    public String method7793() {
        return this.field10540;
    }
    
    static {
        field10538 = Pattern.compile("(?<a>0|[1-9]\\d*)\\.(?<b>0|[1-9]\\d*)(?:\\.(?<c>0|[1-9]\\d*))?(?:-(?<tag>[A-z0-9.-]*))?");
    }
}
