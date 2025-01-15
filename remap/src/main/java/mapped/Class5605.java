// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Class5605 extends Class5604
{
    private static final Pattern field22970;
    
    public Class5605(final String s, final String s2, final String s3, final String s4) {
        super(s, s2, s3, s4);
    }
    
    @Override
    public String method16883() {
        return "const bool " + this.method16860() + " = " + this.method16863() + "; // Shader option " + this.method16863();
    }
    
    public static Class5601 method16894(final String input, String method35517) {
        final Matcher matcher = Class5605.field22970.matcher(input);
        if (!matcher.matches()) {
            return null;
        }
        final String group = matcher.group(1);
        final String group2 = matcher.group(2);
        final String group3 = matcher.group(3);
        if (group != null && group.length() > 0) {
            method35517 = Class9518.method35517(method35517, "/shaders/");
            final Class5605 class5605 = new Class5605(group, group3, group2, method35517);
            class5605.method16876(false);
            return class5605;
        }
        return null;
    }
    
    @Override
    public boolean method16880(final String input) {
        final Matcher matcher = Class5605.field22970.matcher(input);
        return matcher.matches() && matcher.group(1).matches(this.method16860());
    }
    
    @Override
    public boolean method16881() {
        return false;
    }
    
    static {
        field22970 = Pattern.compile("^\\s*const\\s*bool\\s*([A-Za-z0-9_]+)\\s*=\\s*(true|false)\\s*;\\s*(//.*)?$");
    }
}
