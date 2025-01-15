// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Class5604 extends Class5601
{
    private static final Pattern field22968;
    private static final Pattern field22969;
    
    public Class5604(final String s, final String s2, final String s3, final String s4) {
        super(s, s2, s3, new String[] { "false", "true" }, s3, s4);
    }
    
    @Override
    public String method16883() {
        return method16895(this.method16863()) ? ("#define " + this.method16860() + " // Shader option ON") : ("//#define " + this.method16860() + " // Shader option OFF");
    }
    
    @Override
    public String method16878(final String s) {
        final String method16878 = super.method16878(s);
        if (method16878 == s) {
            return method16895(s) ? Class4647.method13878() : Class4647.method13879();
        }
        return method16878;
    }
    
    @Override
    public String method16879(final String s) {
        return method16895(s) ? "§a" : "§c";
    }
    
    public static Class5601 method16894(final String input, String method35517) {
        final Matcher matcher = Class5604.field22968.matcher(input);
        if (!matcher.matches()) {
            return null;
        }
        final String group = matcher.group(1);
        final String group2 = matcher.group(2);
        final String group3 = matcher.group(3);
        if (group2 != null && group2.length() > 0) {
            final boolean b = !Class8571.equals(group, "//");
            method35517 = Class9518.method35517(method35517, "/shaders/");
            return new Class5604(group2, group3, String.valueOf(b), method35517);
        }
        return null;
    }
    
    @Override
    public boolean method16880(final String input) {
        final Matcher matcher = Class5604.field22968.matcher(input);
        return matcher.matches() && matcher.group(2).matches(this.method16860());
    }
    
    @Override
    public boolean method16881() {
        return true;
    }
    
    @Override
    public boolean method16882(final String input) {
        final Matcher matcher = Class5604.field22969.matcher(input);
        return matcher.matches() && matcher.group(2).equals(this.method16860());
    }
    
    public static boolean method16895(final String s) {
        return Boolean.valueOf(s);
    }
    
    static {
        field22968 = Pattern.compile("^\\s*(//)?\\s*#define\\s+([A-Za-z0-9_]+)\\s*(//.*)?$");
        field22969 = Pattern.compile("^\\s*#if(n)?def\\s+([A-Za-z0-9_]+)(\\s*)?$");
    }
}
