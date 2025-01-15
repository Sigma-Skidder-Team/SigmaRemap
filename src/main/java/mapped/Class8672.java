// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class Class8672
{
    private static final Pattern field36460;
    
    public static Class7266[] method29684(final String input, final Class300 class300) {
        final ArrayList list = new ArrayList();
        StringBuilder sb = new StringBuilder();
        Class7270 e = new Class7270();
        final Matcher matcher = Class8672.field36460.matcher(input);
        for (int i = 0; i < input.length(); ++i) {
            final char char1 = input.charAt(i);
            if (char1 == '§') {
                if (++i >= input.length()) {
                    break;
                }
                char char2 = input.charAt(i);
                if (char2 >= 'A' && char2 <= 'Z') {
                    char2 += ' ';
                }
                Class300 method956 = Class300.method956(char2);
                if (method956 != null) {
                    if (sb.length() > 0) {
                        final Class7270 e2 = e;
                        e = new Class7270(e2);
                        e2.method22276(sb.toString());
                        sb = new StringBuilder();
                        list.add(e2);
                    }
                    switch (Class6780.field26680[method956.ordinal()]) {
                        case 1: {
                            e.method22249(true);
                            continue;
                        }
                        case 2: {
                            e.method22250(true);
                            continue;
                        }
                        case 3: {
                            e.method22251(true);
                            continue;
                        }
                        case 4: {
                            e.method22252(true);
                            continue;
                        }
                        case 5: {
                            e.method22253(true);
                            continue;
                        }
                        case 6: {
                            method956 = class300;
                            break;
                        }
                    }
                    e = new Class7270();
                    e.method22248(method956);
                    e.method22249(false);
                    e.method22250(false);
                    e.method22251(false);
                    e.method22252(false);
                    e.method22253(false);
                }
            }
            else {
                int n = input.indexOf(32, i);
                if (n == -1) {
                    n = input.length();
                }
                if (matcher.region(i, n).find()) {
                    if (sb.length() > 0) {
                        final Class7270 e3 = e;
                        e = new Class7270(e3);
                        e3.method22276(sb.toString());
                        sb = new StringBuilder();
                        list.add(e3);
                    }
                    final Class7270 class301 = e;
                    final Class7270 e4 = new Class7270(class301);
                    final String substring = input.substring(i, n);
                    e4.method22276(substring);
                    e4.method22255(new Class8698(Class1995.field11176, substring.startsWith("http") ? substring : ("http://" + substring)));
                    list.add(e4);
                    i += n - i - 1;
                    e = class301;
                }
                else {
                    sb.append(char1);
                }
            }
        }
        e.method22276(sb.toString());
        list.add(e);
        return list.toArray(new Class7266[0]);
    }
    
    public static String method29685(final String s) {
        return Class5977.toString(method29684(s, Class300.field1733));
    }
    
    public static String method29686(final String s) {
        return Class7266.method22228(Class5977.method17900(s));
    }
    
    public static String method29687(final String s) {
        final Class7266[] method17900;
        final Class7266[] array = method17900 = Class5977.method17900(s);
        for (int length = method17900.length, i = 0; i < length; ++i) {
            method29688(method17900[i]);
        }
        if (array.length != 1) {
            return Class5977.toString(array);
        }
        return Class5977.toString(array[0]);
    }
    
    private static void method29688(final Class7266 class7266) {
        if (class7266 != null) {
            if (class7266 instanceof Class7265) {
                final String method22220 = ((Class7265)class7266).method22220();
                final String s = Class9526.field41010.get(method22220);
                if (s == null) {
                    Class9526.field41011.get(method22220);
                }
                if (s != null) {
                    ((Class7265)class7266).method22222(s);
                }
                if (((Class7265)class7266).method22221() != null) {
                    final Iterator<Class7266> iterator = ((Class7265)class7266).method22221().iterator();
                    while (iterator.hasNext()) {
                        method29688(iterator.next());
                    }
                }
            }
            if (class7266.method22260() != null) {
                final Class7266[] method22221 = class7266.method22260().method23753();
                for (int length = method22221.length, i = 0; i < length; ++i) {
                    method29688(method22221[i]);
                }
            }
            if (class7266.method22258() != null) {
                final Iterator<Class7266> iterator2 = class7266.method22258().iterator();
                while (iterator2.hasNext()) {
                    method29688(iterator2.next());
                }
            }
        }
    }
    
    static {
        field36460 = Pattern.compile("^(?:(https?)://)?([-\\w_\\.]{2,}\\.[a-z]{2,4})(/\\S*)?$");
    }
}
