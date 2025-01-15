// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.commons.lang3.StringUtils;
import java.util.regex.Pattern;

public class Class8272
{
    private static final Pattern field33965;
    
    public static String method27498(final int n) {
        final int n2 = n / 20;
        final int n3 = n2 / 60;
        final int n4 = n2 % 60;
        return (n4 >= 10) ? (n3 + ":" + n4) : (n3 + ":0" + n4);
    }
    
    public static String method27499(final String input) {
        return Class8272.field33965.matcher(input).replaceAll("");
    }
    
    public static boolean method27500(final String s) {
        return StringUtils.isEmpty((CharSequence)s);
    }
    
    static {
        field33965 = Pattern.compile("(?i)\\u00A7[0-9A-FK-OR]");
    }
}
