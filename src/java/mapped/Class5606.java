// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Class5606 extends Class5601
{
    private static final Pattern field22971;
    
    public Class5606(final String s, final String s2, final String s3, final String[] array, final String s4) {
        super(s, s2, s3, array, s3, s4);
        this.method16876(this.method16884().length > 1);
    }
    
    @Override
    public String method16883() {
        return "#define " + this.method16860() + " " + this.method16863() + " // Shader option " + this.method16863();
    }
    
    @Override
    public String method16878(final String s) {
        return Class9216.method33898("prefix." + this.method16860(), "") + super.method16878(s) + Class9216.method33898("suffix." + this.method16860(), "");
    }
    
    @Override
    public String method16879(final String s) {
        final String lowerCase = s.toLowerCase();
        return (!lowerCase.equals("false") && !lowerCase.equals("off")) ? "§a" : "§c";
    }
    
    @Override
    public boolean method16880(final String input) {
        final Matcher matcher = Class5606.field22971.matcher(input);
        return matcher.matches() && matcher.group(1).matches(this.method16860());
    }
    
    public static Class5601 method16896(final String input, String method35517) {
        final Matcher matcher = Class5606.field22971.matcher(input);
        if (!matcher.matches()) {
            return null;
        }
        final String group = matcher.group(1);
        final String group2 = matcher.group(2);
        String s = matcher.group(3);
        final String method35518 = Class9518.method35528(s, "[", "]");
        if (method35518 != null) {
            if (method35518.length() > 0) {
                s = s.replace(method35518, "").trim();
            }
        }
        final String[] method35519 = method16897(group2, method35518);
        if (group != null && group.length() > 0) {
            method35517 = Class9518.method35517(method35517, "/shaders/");
            return new Class5606(group, s, group2, method35519, method35517);
        }
        return null;
    }
    
    public static String[] method16897(final String s, String s2) {
        final String[] array = { s };
        if (s2 == null) {
            return array;
        }
        s2 = s2.trim();
        s2 = Class9518.method35517(s2, "[");
        s2 = Class9518.method35518(s2, "]");
        s2 = s2.trim();
        if (s2.length() <= 0) {
            return array;
        }
        String[] method28937 = Class8571.method28937(s2, " ");
        if (method28937.length > 0) {
            if (!Arrays.asList(method28937).contains(s)) {
                method28937 = (String[])Class8571.method28983(method28937, s, 0);
            }
            return method28937;
        }
        return array;
    }
    
    static {
        field22971 = Pattern.compile("^\\s*#define\\s+(\\w+)\\s+(-?[0-9\\.Ff]+|\\w+)\\s*(//.*)?$");
    }
}
