// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.regex.Matcher;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.Collections;
import java.util.Set;
import java.util.Iterator;
import java.util.regex.Pattern;

public final class Class9558
{
    private static final String field41146 = "([^ \"=]*)";
    private static final String field41147 = "\"([^\"]*)\"";
    private static final Pattern field41148;
    
    private Class9558() {
    }
    
    public static long method35751(final Class1753 class1753) {
        return method35752(class1753.method6195());
    }
    
    public static long method35752(final Class6957 class6957) {
        return method35753(class6957.method21360("Content-Length"));
    }
    
    private static long method35753(final String s) {
        if (s == null) {
            return -1L;
        }
        try {
            return Long.parseLong(s);
        }
        catch (final NumberFormatException ex) {
            return -1L;
        }
    }
    
    public static boolean method35754(final Class1753 class1753, final Class6957 class1754, final Class8596 class1755) {
        for (final String s : method35757(class1753)) {
            if (Class7690.method24431(class1754.values(s), class1755.method29113(s))) {
                continue;
            }
            return false;
        }
        return true;
    }
    
    public static boolean method35755(final Class1753 class1753) {
        return method35756(class1753.method6195());
    }
    
    public static boolean method35756(final Class6957 class6957) {
        return method35758(class6957).contains("*");
    }
    
    private static Set<String> method35757(final Class1753 class1753) {
        return method35758(class1753.method6195());
    }
    
    public static Set<String> method35758(final Class6957 class6957) {
        Set<Object> emptySet = Collections.emptySet();
        for (int i = 0; i < class6957.method21362(); ++i) {
            if ("Vary".equalsIgnoreCase(class6957.method21363(i))) {
                final String method21364 = class6957.method21364(i);
                if (emptySet.isEmpty()) {
                    emptySet = new TreeSet<Object>((Comparator<? super Object>)String.CASE_INSENSITIVE_ORDER);
                }
                final String[] split = method21364.split(",");
                for (int length = split.length, j = 0; j < length; ++j) {
                    emptySet.add(split[j].trim());
                }
            }
        }
        return (Set<String>)emptySet;
    }
    
    public static Class6957 method35759(final Class1753 class1753) {
        return method35760(class1753.method6200().method6186().method29111(), class1753.method6195());
    }
    
    public static Class6957 method35760(final Class6957 class6957, final Class6957 class6958) {
        final Set<String> method35758 = method35758(class6958);
        if (!method35758.isEmpty()) {
            final Class8640 class6959 = new Class8640();
            for (int i = 0; i < class6957.method21362(); ++i) {
                final String method35759 = class6957.method21363(i);
                if (method35758.contains(method35759)) {
                    class6959.method29378(method35759, class6957.method21364(i));
                }
            }
            return class6959.method29384();
        }
        return new Class8640().method29384();
    }
    
    public static List<Class8728> method35761(final Class6957 class6957, final String s) {
        final ArrayList list = new ArrayList();
        for (final String input : class6957.values(s)) {
            final int index = input.indexOf(32);
            if (index != -1) {
                final Matcher matcher = Class9558.field41148.matcher(input);
                for (int end = index; matcher.find(end); end = matcher.end()) {
                    if (input.regionMatches(true, matcher.start(1), "realm", 0, 5)) {
                        final String substring = input.substring(0, index);
                        final String group = matcher.group(3);
                        if (group != null) {
                            list.add(new Class8728(substring, group));
                            break;
                        }
                    }
                }
            }
        }
        return list;
    }
    
    public static void method35762(final Class7536 class7536, final Class8846 class7537, final Class6957 class7538) {
        if (class7536 == Class7536.field29918) {
            return;
        }
        final List<Class8713> method29929 = Class8713.method29929(class7537, class7538);
        if (!method29929.isEmpty()) {
            class7536.method23616(class7537, method29929);
        }
    }
    
    public static boolean method35763(final Class1753 class1753) {
        if (!class1753.method6186().method29110().equals("HEAD")) {
            final int method6188 = class1753.method6188();
            if (method6188 < 100 || method6188 >= 200) {
                if (method6188 != 204) {
                    if (method6188 != 304) {
                        return true;
                    }
                }
            }
            return method35751(class1753) != -1L || "chunked".equalsIgnoreCase(class1753.method6193("Transfer-Encoding"));
        }
        return false;
    }
    
    public static int method35764(final String s, int index, final String s2) {
        while (index < s.length() && s2.indexOf(s.charAt(index)) == -1) {
            ++index;
        }
        return index;
    }
    
    public static int method35765(final String s, int i) {
        while (i < s.length()) {
            final char char1 = s.charAt(i);
            if (char1 != ' ' && char1 != '\t') {
                break;
            }
            ++i;
        }
        return i;
    }
    
    public static int method35766(final String s, final int n) {
        try {
            final long long1 = Long.parseLong(s);
            if (long1 > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (long1 < 0L) {
                return 0;
            }
            return (int)long1;
        }
        catch (final NumberFormatException ex) {
            return n;
        }
    }
    
    static {
        field41148 = Pattern.compile(" +([^ \"=]*)=(:?\"([^\"]*)\"|([^ \"=]*)) *(:?,|$)");
    }
}
