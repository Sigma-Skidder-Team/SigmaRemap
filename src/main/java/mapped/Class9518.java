// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.StringTokenizer;
import java.util.ArrayList;

public class Class9518
{
    public static boolean method35499(final String anObject, final String str, final char c, final char ch) {
        if (str == null || anObject == null) {
            return str == anObject;
        }
        if (str.indexOf(c) < 0) {
            return (str.indexOf(ch) >= 0) ? method35500(anObject, str, ch) : str.equals(anObject);
        }
        final ArrayList list = new ArrayList();
        final String string = "" + c;
        if (str.startsWith(string)) {
            list.add("");
        }
        final StringTokenizer stringTokenizer = new StringTokenizer(str, string);
        while (stringTokenizer.hasMoreElements()) {
            list.add(stringTokenizer.nextToken());
        }
        if (str.endsWith(string)) {
            list.add("");
        }
        if (!method35503(anObject, (String)list.get(0), ch)) {
            return false;
        }
        if (method35502(anObject, (String)list.get(list.size() - 1), ch)) {
            int n = 0;
            for (int i = 0; i < list.size(); ++i) {
                final String s = (String)list.get(i);
                if (s.length() > 0) {
                    final int method35501 = method35501(anObject, s, n, ch);
                    if (method35501 < 0) {
                        return false;
                    }
                    n = method35501 + s.length();
                }
            }
            return true;
        }
        return false;
    }
    
    private static boolean method35500(final String s, final String s2, final char c) {
        if (s == null || s2 == null) {
            return s == s2;
        }
        if (s.length() == s2.length()) {
            for (int i = 0; i < s2.length(); ++i) {
                final char char1 = s2.charAt(i);
                if (char1 != c && s.charAt(i) != char1) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    private static int method35501(final String s, final String s2, final int n, final char c) {
        if (s == null || s2 == null) {
            return -1;
        }
        if (n < 0 || n > s.length()) {
            return -1;
        }
        if (s.length() >= n + s2.length()) {
            for (int beginIndex = n; beginIndex + s2.length() <= s.length(); ++beginIndex) {
                if (method35500(s.substring(beginIndex, beginIndex + s2.length()), s2, c)) {
                    return beginIndex;
                }
            }
            return -1;
        }
        return -1;
    }
    
    private static boolean method35502(final String s, final String s2, final char c) {
        if (s != null && s2 != null) {
            return s.length() >= s2.length() && method35500(s.substring(s.length() - s2.length(), s.length()), s2, c);
        }
        return s == s2;
    }
    
    private static boolean method35503(final String s, final String s2, final char c) {
        if (s != null && s2 != null) {
            return s.length() >= s2.length() && method35500(s.substring(0, s2.length()), s2, c);
        }
        return s == s2;
    }
    
    public static boolean method35504(final String s, final String[] array, final char c) {
        for (int i = 0; i < array.length; ++i) {
            if (method35505(s, array[i], c)) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean method35505(final String anObject, final String str, final char c) {
        if (str == null || anObject == null) {
            return str == anObject;
        }
        if (str.indexOf(c) < 0) {
            return str.equals(anObject);
        }
        final ArrayList list = new ArrayList();
        final String string = "" + c;
        if (str.startsWith(string)) {
            list.add("");
        }
        final StringTokenizer stringTokenizer = new StringTokenizer(str, string);
        while (stringTokenizer.hasMoreElements()) {
            list.add(stringTokenizer.nextToken());
        }
        if (str.endsWith(string)) {
            list.add("");
        }
        if (!anObject.startsWith((String)list.get(0))) {
            return false;
        }
        if (anObject.endsWith((String)list.get(list.size() - 1))) {
            int fromIndex = 0;
            for (int i = 0; i < list.size(); ++i) {
                final String str2 = (String)list.get(i);
                if (str2.length() > 0) {
                    final int index = anObject.indexOf(str2, fromIndex);
                    if (index < 0) {
                        return false;
                    }
                    fromIndex = index + str2.length();
                }
            }
            return true;
        }
        return false;
    }
    
    public static String[] method35506(final String s, final String s2) {
        if (s == null || s.length() <= 0) {
            return new String[0];
        }
        if (s2 != null) {
            final ArrayList list = new ArrayList();
            int n = 0;
            for (int i = 0; i < s.length(); ++i) {
                if (equals(s.charAt(i), s2)) {
                    list.add(s.substring(n, i));
                    n = i + 1;
                }
            }
            list.add(s.substring(n, s.length()));
            return (String[])list.toArray(new String[list.size()]);
        }
        return new String[] { s };
    }
    
    private static boolean equals(final char c, final String s) {
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == c) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean method35507(String trim, String trim2) {
        if (trim != null) {
            trim = trim.trim();
        }
        if (trim2 != null) {
            trim2 = trim2.trim();
        }
        return equals(trim, trim2);
    }
    
    public static boolean method35508(final String s) {
        return s == null || s.trim().length() <= 0;
    }
    
    public static String method35509(final String s) {
        int method35510 = method35510(s, -1);
        if (method35510 != -1) {
            ++method35510;
            return (("" + method35510).length() <= s.length()) ? method35513("" + method35510, s.length(), '0') : "";
        }
        return "";
    }
    
    public static int method35510(final String s, final int n) {
        if (s == null) {
            return n;
        }
        try {
            return Integer.parseInt(s);
        }
        catch (final NumberFormatException ex) {
            return n;
        }
    }
    
    public static boolean method35511(final String s) {
        return !method35508(s);
    }
    
    public static String method35512(String string, final String s) {
        for (int i = 0; i < s.length(); ++i) {
            if (string.indexOf(s.charAt(i)) < 0) {
                string += s.charAt(i);
            }
        }
        return string;
    }
    
    public static String method35513(String str, final int n, final char c) {
        if (str == null) {
            str = "";
        }
        if (str.length() < n) {
            final StringBuffer sb = new StringBuffer();
            while (sb.length() < n - str.length()) {
                sb.append(c);
            }
            return sb.toString() + str;
        }
        return str;
    }
    
    public static String method35514(String str, final int n, final char c) {
        if (str == null) {
            str = "";
        }
        if (str.length() < n) {
            final StringBuffer sb = new StringBuffer(str);
            while (sb.length() < n) {
                sb.append(c);
            }
            return sb.toString();
        }
        return str;
    }
    
    public static boolean equals(final Object obj, final Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2)) || (obj2 != null && obj2.equals(obj));
    }
    
    public static boolean method35515(final String s, final String[] array) {
        if (s == null) {
            return false;
        }
        if (array != null) {
            for (int i = 0; i < array.length; ++i) {
                if (s.startsWith(array[i])) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
    
    public static boolean method35516(final String s, final String[] array) {
        if (s == null) {
            return false;
        }
        if (array != null) {
            for (int i = 0; i < array.length; ++i) {
                if (s.endsWith(array[i])) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
    
    public static String method35517(String substring, final String prefix) {
        if (substring != null && prefix != null) {
            if (substring.startsWith(prefix)) {
                substring = substring.substring(prefix.length());
            }
            return substring;
        }
        return substring;
    }
    
    public static String method35518(String substring, final String suffix) {
        if (substring != null && suffix != null) {
            if (substring.endsWith(suffix)) {
                substring = substring.substring(0, substring.length() - suffix.length());
            }
            return substring;
        }
        return substring;
    }
    
    public static String method35519(String substring, final String suffix, String str) {
        if (substring == null || suffix == null) {
            return substring;
        }
        if (substring.endsWith(suffix)) {
            if (str == null) {
                str = "";
            }
            substring = substring.substring(0, substring.length() - suffix.length());
            return substring + str;
        }
        return substring;
    }
    
    public static String method35520(String substring, final String prefix, String str) {
        if (substring == null || prefix == null) {
            return substring;
        }
        if (substring.startsWith(prefix)) {
            if (str == null) {
                str = "";
            }
            substring = substring.substring(prefix.length());
            return str + substring;
        }
        return substring;
    }
    
    public static int method35521(final String[] array, final String prefix) {
        if (array != null && prefix != null) {
            for (int i = 0; i < array.length; ++i) {
                if (array[i].startsWith(prefix)) {
                    return i;
                }
            }
            return -1;
        }
        return -1;
    }
    
    public static int method35522(final String[] array, final String suffix) {
        if (array != null && suffix != null) {
            for (int i = 0; i < array.length; ++i) {
                if (array[i].endsWith(suffix)) {
                    return i;
                }
            }
            return -1;
        }
        return -1;
    }
    
    public static String[] method35523(final String[] array, final int n, final int n2) {
        if (array == null) {
            return array;
        }
        if (n2 <= 0 || n >= array.length) {
            return array;
        }
        if (n < n2) {
            final ArrayList list = new ArrayList(array.length);
            for (int i = 0; i < array.length; ++i) {
                final String s = array[i];
                if (i < n || i >= n2) {
                    list.add(s);
                }
            }
            return (String[])list.toArray(new String[list.size()]);
        }
        return array;
    }
    
    public static String method35524(String method35518, final String[] array) {
        if (method35518 != null && array != null) {
            final int length = method35518.length();
            for (int i = 0; i < array.length; ++i) {
                method35518 = method35518(method35518, array[i]);
                if (method35518.length() != length) {
                    break;
                }
            }
            return method35518;
        }
        return method35518;
    }
    
    public static String method35525(String method35517, final String[] array) {
        if (method35517 != null && array != null) {
            final int length = method35517.length();
            for (int i = 0; i < array.length; ++i) {
                method35517 = method35517(method35517, array[i]);
                if (method35517.length() != length) {
                    break;
                }
            }
            return method35517;
        }
        return method35517;
    }
    
    public static String method35526(String s, final String[] array, final String[] array2) {
        s = method35525(s, array);
        s = method35524(s, array2);
        return s;
    }
    
    public static String method35527(final String s, final String s2, final String s3) {
        return method35526(s, new String[] { s2 }, new String[] { s3 });
    }
    
    public static String method35528(final String s, final String str, final String str2) {
        if (s != null) {
            if (str != null) {
                if (str2 != null) {
                    final int index = s.indexOf(str);
                    if (index >= 0) {
                        final int index2 = s.indexOf(str2, index);
                        return (index2 >= 0) ? s.substring(index, index2 + str2.length()) : null;
                    }
                    return null;
                }
            }
        }
        return null;
    }
    
    public static String method35529(final String str, final String s) {
        if (str != null && s != null) {
            return str.endsWith(s) ? str : (str + s);
        }
        return str;
    }
    
    public static String method35530(final String str, final String s) {
        if (str != null && s != null) {
            return str.endsWith(s) ? str : (s + str);
        }
        return str;
    }
    
    public static String method35531(String s, final String s2) {
        if (s != null && s2 != null) {
            s = method35532(s, s2);
            s = method35533(s, s2);
            return s;
        }
        return s;
    }
    
    public static String method35532(final String s, final String s2) {
        if (s != null && s2 != null) {
            for (int length = s.length(), i = 0; i < length; ++i) {
                if (s2.indexOf(s.charAt(i)) < 0) {
                    return s.substring(i);
                }
            }
            return "";
        }
        return s;
    }
    
    public static String method35533(final String s, final String s2) {
        if (s != null && s2 != null) {
            int length;
            int n;
            for (n = (length = s.length()); length > 0 && s2.indexOf(s.charAt(length - 1)) >= 0; --length) {}
            return (length != n) ? s.substring(0, length) : s;
        }
        return s;
    }
}
