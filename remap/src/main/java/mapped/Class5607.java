// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Class5607 extends Class5606
{
    private String field22972;
    private static final Pattern field22973;
    
    public Class5607(final String s, final String field22972, final String s2, final String s3, final String[] array, final String s4) {
        super(s, s2, s3, array, s4);
        this.field22972 = null;
        this.field22972 = field22972;
    }
    
    @Override
    public String method16883() {
        return "const " + this.field22972 + " " + this.method16860() + " = " + this.method16863() + "; // Shader option " + this.method16863();
    }
    
    @Override
    public boolean method16880(final String input) {
        final Matcher matcher = Class5607.field22973.matcher(input);
        return matcher.matches() && matcher.group(2).matches(this.method16860());
    }
    
    public static Class5601 method16896(final String input, String method35517) {
        final Matcher matcher = Class5607.field22973.matcher(input);
        if (!matcher.matches()) {
            return null;
        }
        final String group = matcher.group(1);
        final String group2 = matcher.group(2);
        final String group3 = matcher.group(3);
        String s = matcher.group(4);
        final String method35518 = Class9518.method35528(s, "[", "]");
        if (method35518 != null) {
            if (method35518.length() > 0) {
                s = s.replace(method35518, "").trim();
            }
        }
        final String[] method35519 = Class5606.method16897(group3, method35518);
        if (group2 != null && group2.length() > 0) {
            method35517 = Class9518.method35517(method35517, "/shaders/");
            return new Class5607(group2, group, s, group3, method35519, method35517);
        }
        return null;
    }
    
    static {
        field22973 = Pattern.compile("^\\s*const\\s*(float|int)\\s*([A-Za-z0-9_]+)\\s*=\\s*(-?[0-9\\.]+f?F?)\\s*;\\s*(//.*)?$");
    }
}
