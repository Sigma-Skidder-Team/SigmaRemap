// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Class8628
{
    public static Pattern field36212;
    public static Pattern field36213;
    public static Pattern field36214;
    public static Pattern field36215;
    public static Pattern field36216;
    public static Pattern field36217;
    public static Pattern field36218;
    public static Pattern field36219;
    public static Pattern field36220;
    public static Pattern field36221;
    public static Pattern field36222;
    public static Pattern field36223;
    
    public static Class9004 method29283(final String s) {
        final Matcher matcher = Class8628.field36212.matcher(s);
        if (matcher.matches()) {
            return new Class9004(1, matcher.group(1), "", s);
        }
        final Matcher matcher2 = Class8628.field36213.matcher(s);
        if (matcher2.matches()) {
            return new Class9004(2, matcher2.group(1), "", s);
        }
        final Matcher matcher3 = Class8628.field36218.matcher(s);
        if (matcher3.matches()) {
            return new Class9004(6, matcher3.group(2), matcher3.group(3), s);
        }
        final Matcher matcher4 = Class8628.field36214.matcher(s);
        if (matcher4.matches()) {
            return new Class9004(3, matcher4.group(1), matcher4.group(2), s);
        }
        final Matcher matcher5 = Class8628.field36215.matcher(s);
        if (matcher5.matches()) {
            return new Class9004(4, matcher5.group(1), matcher5.group(2), s);
        }
        final Matcher matcher6 = Class8628.field36217.matcher(s);
        if (matcher6.matches()) {
            return new Class9004(5, matcher6.group(1), matcher6.group(2), s);
        }
        final Matcher matcher7 = Class8628.field36219.matcher(s);
        if (!matcher7.matches()) {
            final Matcher matcher8 = Class8628.field36216.matcher(s);
            return matcher8.matches() ? new Class9004(8, matcher8.group(1), matcher8.group(2), s) : null;
        }
        return new Class9004(7, matcher7.group(1), matcher7.group(2), s);
    }
    
    public static int method29284(final String s, final String prefix, final int n, final int n2) {
        if (s.length() != prefix.length() + 1) {
            return -1;
        }
        if (s.startsWith(prefix)) {
            final int n3 = s.charAt(prefix.length()) - '0';
            return (n3 >= n && n3 <= n2) ? n3 : -1;
        }
        return -1;
    }
    
    public static int method29285(final String s) {
        switch (s) {
            case "shadow": {
                return 0;
            }
            case "watershadow": {
                return 1;
            }
            default: {
                return method29284(s, "shadowtex", 0, 1);
            }
        }
    }
    
    public static int method29286(final String s) {
        switch (s) {
            case "shadowcolor": {
                return 0;
            }
            default: {
                return method29284(s, "shadowcolor", 0, 1);
            }
        }
    }
    
    public static int method29287(final String s) {
        return method29284(s, "depthtex", 0, 2);
    }
    
    public static int method29288(final String s) {
        final int method29284 = method29284(s, "gaux", 1, 4);
        return (method29284 <= 0) ? method29284(s, "colortex", 4, 7) : (method29284 + 3);
    }
    
    public static boolean method29289(final String input) {
        return Class8628.field36220.matcher(input).matches();
    }
    
    public static boolean method29290(final String input) {
        return Class8628.field36221.matcher(input).matches();
    }
    
    public static boolean method29291(final String input) {
        return Class8628.field36222.matcher(input).matches();
    }
    
    public static boolean method29292(final String input) {
        return Class8628.field36223.matcher(input).matches();
    }
    
    static {
        Class8628.field36212 = Pattern.compile("\\s*uniform\\s+\\w+\\s+(\\w+).*");
        Class8628.field36213 = Pattern.compile("\\s*attribute\\s+\\w+\\s+(\\w+).*");
        Class8628.field36214 = Pattern.compile("\\s*const\\s+int\\s+(\\w+)\\s*=\\s*([-+.\\w]+)\\s*;.*");
        Class8628.field36215 = Pattern.compile("\\s*const\\s+float\\s+(\\w+)\\s*=\\s*([-+.\\w]+)\\s*;.*");
        Class8628.field36216 = Pattern.compile("\\s*const\\s+vec4\\s+(\\w+)\\s*=\\s*(.+)\\s*;.*");
        Class8628.field36217 = Pattern.compile("\\s*const\\s+bool\\s+(\\w+)\\s*=\\s*(\\w+)\\s*;.*");
        Class8628.field36218 = Pattern.compile("\\s*(/\\*|//)?\\s*([A-Z]+):\\s*(\\w+)\\s*(\\*/.*|\\s*)");
        Class8628.field36219 = Pattern.compile("\\s*#\\s*extension\\s+(\\w+)\\s*:\\s*(\\w+).*");
        Class8628.field36220 = Pattern.compile(".*deferred[0-9]*\\.fsh");
        Class8628.field36221 = Pattern.compile(".*composite[0-9]*\\.fsh");
        Class8628.field36222 = Pattern.compile(".*final\\.fsh");
        Class8628.field36223 = Pattern.compile("[0-7N]*");
    }
}
