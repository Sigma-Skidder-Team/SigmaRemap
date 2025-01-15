// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Class9274
{
    private static Pattern field39759;
    private static Matcher field39760;
    private static final String field39761 = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,3})$";
    
    public static boolean method34208(final char c) {
        if (c != '§') {
            if (c >= ' ') {
                if (c != '\u007f') {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static void method34209(final String s) {
        Class869.method5277().field4647.method3807().method3761(new Class2260(s));
    }
    
    public static boolean method34210(final String s) {
        for (final char ch : s.toCharArray()) {
            if (!Character.isLetterOrDigit(ch) && ch != '_') {
                return false;
            }
        }
        return true;
    }
    
    public static boolean method34211(final String s) {
        for (final char ch : s.toCharArray()) {
            if (!Character.isLetterOrDigit(ch)) {
                if (ch != '_') {
                    if (ch != '@') {
                        if (ch != '.') {
                            return false;
                        }
                    }
                }
            }
        }
        return method34212(s);
    }
    
    public static boolean method34212(final String input) {
        Class9274.field39759 = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,3})$");
        Class9274.field39760 = Class9274.field39759.matcher(input);
        return Class9274.field39760.matches();
    }
    
    public static boolean method34213(final String s) {
        try {
            Integer.parseInt(s);
            return true;
        }
        catch (final Exception ex) {
            return false;
        }
    }
    
    public static String method34214(final String s, final String str, final int n) {
        try {
            return s.substring(0, n) + str + s.substring(n, s.length());
        }
        catch (final Exception ex) {
            return s;
        }
    }
    
    public static String method34215(final String s, final String str, int min, int min2) {
        min = Math.min(Math.max(0, min), s.length());
        min2 = Math.min(Math.max(0, min2), s.length());
        return s.substring(0, (min <= min2) ? min : min2) + str + s.substring((min <= min2) ? min2 : min, s.length());
    }
    
    public static int method34216(final String s, final Class7524 class7524, final float n, final int n2, final float n3) {
        int n4 = -1;
        int method23505 = -1;
        for (int i = 0; i <= s.length(); ++i) {
            final int method23506 = class7524.method23505(s.substring(0, Math.max(i - 1, 0)));
            final int method23507 = class7524.method23505(s.substring(0, i));
            if (method23507 > n2 - n - n3) {
                n4 = method23506;
                method23505 = method23507;
                break;
            }
        }
        if (n2 - n - n3 >= class7524.method23505(s)) {
            method23505 = class7524.method23505(s);
        }
        int length = (Math.abs(n2 - n - n3 - n4) >= Math.abs(n2 - n - n3 - method23505)) ? method23505 : n4;
        for (int j = 0; j < s.length(); ++j) {
            if (class7524.method23505(s.substring(0, j)) == length) {
                length = j;
                break;
            }
        }
        if (length > s.length()) {
            length = s.length();
        }
        return length;
    }
    
    public static Class228 method34217(final char c) {
        if ((c >= '0' && c <= '9') || (c >= 'a' && c <= 'f')) {
            return Class228.field806;
        }
        switch (c) {
            case 'k': {
                return Class228.field805;
            }
            case 'l': {
                return Class228.field805;
            }
            case 'm': {
                return Class228.field805;
            }
            case 'n': {
                return Class228.field805;
            }
            case 'o': {
                return Class228.field805;
            }
            case 'r': {
                return Class228.field805;
            }
            default: {
                return Class228.field807;
            }
        }
    }
    
    public static Class2427 method34218(final char c) {
        final char[] array = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
        final int[] array2 = { -16777216, -16777046, -16733696, -16733526, -5636096, -5635926, -22016, -5592406, -11184811, -11184641, -11141291, -11141121, -43691, -43521, -171, -65794 };
        int n = -1;
        for (int i = 0; i < array.length; ++i) {
            if (array[i] == c) {
                n = array2[i];
                break;
            }
        }
        if (n != -1) {
            return new Class2427(n);
        }
        return null;
    }
    
    public static String method34219(String replace) {
        final ArrayList list = new ArrayList();
        for (int i = 0; i < replace.length(); ++i) {
            if (replace.charAt(i) == '§') {
                list.add(replace.substring(i, Math.min(i + 2, replace.length())));
            }
        }
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            replace = replace.replace((CharSequence)iterator.next(), "");
        }
        return replace;
    }
}
