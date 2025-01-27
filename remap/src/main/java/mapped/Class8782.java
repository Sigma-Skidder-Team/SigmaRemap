// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;

public class Class8782
{
    public static final Character field36922;
    public static final Character field36923;
    public static final Character field36924;
    public static final Character field36925;
    public static final Character field36926;
    public static final Character field36927;
    public static final Character field36928;
    public static final Character field36929;
    public static final Character field36930;
    
    public static String method30562(final String s) {
        final StringBuilder sb = new StringBuilder(s.length());
        for (int i = 0; i < s.length(); ++i) {
            final char char1 = s.charAt(i);
            switch (char1) {
                case 38: {
                    sb.append("&amp;");
                    break;
                }
                case 60: {
                    sb.append("&lt;");
                    break;
                }
                case 62: {
                    sb.append("&gt;");
                    break;
                }
                case 34: {
                    sb.append("&quot;");
                    break;
                }
                case 39: {
                    sb.append("&apos;");
                    break;
                }
                default: {
                    sb.append(char1);
                    break;
                }
            }
        }
        return sb.toString();
    }
    
    public static void method30563(final String str) throws org.json.JSONException {
        final int length = str.length();
        if (length != 0) {
            for (int i = 0; i < length; ++i) {
                if (Character.isWhitespace(str.charAt(i))) {
                    throw new JSONException("'" + str + "' contains a space character.");
                }
            }
            return;
        }
        throw new JSONException("Empty string.");
    }
    
    private static boolean method30564(final Class8827 class8827, final JSONObject class8828, final String s) throws org.json.JSONException {
        final Object method30799 = class8827.method30799();
        if (method30799 != Class8782.field36924) {
            if (method30799 == Class8782.field36928) {
                class8827.method30800("?>");
                return false;
            }
            if (method30799 != Class8782.field36930) {
                if (method30799 instanceof Character) {
                    throw class8827.syntaxError("Misshaped tag");
                }
                final String str = (String)method30799;
                Object o = null;
                final JSONObject class8829 = new JSONObject();
                while (true) {
                    if (o == null) {
                        o = class8827.method30799();
                    }
                    if (!(o instanceof String)) {
                        if (o != Class8782.field36930) {
                            if (o != Class8782.field36926) {
                                throw class8827.syntaxError("Misshaped tag");
                            }
                            while (true) {
                                final Object method30800 = class8827.method30796();
                                if (method30800 != null) {
                                    if (!(method30800 instanceof String)) {
                                        if (method30800 != Class8782.field36927) {
                                            continue;
                                        }
                                        if (!method30564(class8827, class8829, str)) {
                                            continue;
                                        }
                                        if (class8829.method13274() != 0) {
                                            if (class8829.method13274() == 1 && class8829.opt("content") != null) {
                                                class8828.method13254(str, class8829.opt("content"));
                                            }
                                            else {
                                                class8828.method13254(str, class8829);
                                            }
                                        }
                                        else {
                                            class8828.method13254(str, "");
                                        }
                                        return false;
                                    }
                                    else {
                                        final String s2 = (String)method30800;
                                        if (s2.length() <= 0) {
                                            continue;
                                        }
                                        class8829.method13254("content", method30565(s2));
                                    }
                                }
                                else {
                                    if (str == null) {
                                        return false;
                                    }
                                    throw class8827.syntaxError("Unclosed tag " + str);
                                }
                            }
                        }
                        else {
                            if (class8827.method30799() == Class8782.field36926) {
                                if (class8829.method13274() <= 0) {
                                    class8828.method13254(str, "");
                                }
                                else {
                                    class8828.method13254(str, class8829);
                                }
                                return false;
                            }
                            throw class8827.syntaxError("Misshaped tag");
                        }
                    }
                    else {
                        final String s3 = (String)o;
                        o = class8827.method30799();
                        if (o != Class8782.field36925) {
                            class8829.method13254(s3, "");
                        }
                        else {
                            final Object method30801 = class8827.method30799();
                            if (!(method30801 instanceof String)) {
                                throw class8827.syntaxError("Missing value");
                            }
                            class8829.method13254(s3, method30565((String)method30801));
                            o = null;
                        }
                    }
                }
            }
            else {
                final Object method30802 = class8827.method30799();
                if (s == null) {
                    throw class8827.syntaxError("Mismatched close tag " + method30802);
                }
                if (!method30802.equals(s)) {
                    throw class8827.syntaxError("Mismatched " + s + " and " + method30802);
                }
                if (class8827.method30799() == Class8782.field36926) {
                    return true;
                }
                throw class8827.syntaxError("Misshaped close tag");
            }
        }
        else {
            final char method30803 = class8827.method30785();
            if (method30803 != '-') {
                if (method30803 == '[') {
                    if ("CDATA".equals(class8827.method30799()) && class8827.method30785() == '[') {
                        final String method30804 = class8827.method30795();
                        if (method30804.length() > 0) {
                            class8828.method13254("content", method30804);
                        }
                        return false;
                    }
                    throw class8827.syntaxError("Expected 'CDATA['");
                }
            }
            else {
                if (class8827.method30785() == '-') {
                    class8827.method30800("-->");
                    return false;
                }
                class8827.back();
            }
            int n = 1;
            while (true) {
                final Object method30805 = class8827.method30798();
                if (method30805 == null) {
                    throw class8827.syntaxError("Missing '>' after '<!'.");
                }
                if (method30805 != Class8782.field36927) {
                    if (method30805 == Class8782.field36926) {
                        --n;
                    }
                }
                else {
                    ++n;
                }
                if (n > 0) {
                    continue;
                }
                return false;
            }
        }
    }
    
    public static Object method30565(final String anObject) {
        if ("true".equalsIgnoreCase(anObject)) {
            return Boolean.TRUE;
        }
        if ("false".equalsIgnoreCase(anObject)) {
            return Boolean.FALSE;
        }
        if ("null".equalsIgnoreCase(anObject)) {
            return JSONObject.field19729;
        }
        try {
            final char char1 = anObject.charAt(0);
            if (char1 == '-' || (char1 >= '0' && char1 <= '9')) {
                final Long n = new Long(anObject);
                if (n.toString().equals(anObject)) {
                    return n;
                }
            }
        }
        catch (final Exception ex) {
            try {
                final Double n2 = new Double(anObject);
                if (n2.toString().equals(anObject)) {
                    return n2;
                }
                return anObject;
            }
            catch (final Exception ex2) {}
        }
        return anObject;
    }
    
    public static JSONObject method30566(final String s) throws org.json.JSONException {
        final JSONObject JSONObject = new JSONObject();
        final Class8827 class4406 = new Class8827(s);
        while (class4406.method30784() && class4406.method30800("<")) {
            method30564(class4406, JSONObject, null);
        }
        return JSONObject;
    }
    
    public static String toString(final Object o) throws org.json.JSONException {
        return toString(o, null);
    }
    
    public static String toString(Object o, final String str) throws org.json.JSONException {
        final StringBuilder sb = new StringBuilder();
        if (!(o instanceof JSONObject)) {
            if (o != null) {
                if (o.getClass().isArray()) {
                    o = new Class88(o);
                }
                if (o instanceof Class88) {
                    final Class88 class88 = (Class88)o;
                    for (int method462 = class88.method462(), i = 0; i < method462; ++i) {
                        sb.append(toString(class88.method463(i), (str != null) ? str : "array"));
                    }
                    return sb.toString();
                }
            }
            final String s = (o != null) ? method30562(o.toString()) : "null";
            return (str != null) ? ((s.length() != 0) ? ("<" + str + ">" + s + "</" + str + ">") : ("<" + str + "/>")) : ("\"" + s + "\"");
        }
        if (str != null) {
            sb.append('<');
            sb.append(str);
            sb.append('>');
        }
        final JSONObject class89 = (JSONObject)o;
        final Iterator<String> method463 = class89.method13272();
        while (method463.hasNext()) {
            final String s2 = method463.next();
            Object method464 = class89.opt(s2);
            if (method464 == null) {
                method464 = "";
            }
            final String s3 = (method464 instanceof String) ? ((String)method464) : null;
            if (!"content".equals(s2)) {
                if (!(method464 instanceof Class88)) {
                    if (!"".equals(method464)) {
                        sb.append(toString(method464, s2));
                    }
                    else {
                        sb.append('<');
                        sb.append(s2);
                        sb.append("/>");
                    }
                }
                else {
                    final Class88 class90 = (Class88)method464;
                    for (int method465 = class90.method462(), j = 0; j < method465; ++j) {
                        final Object method466 = class90.method449(j);
                        if (!(method466 instanceof Class88)) {
                            sb.append(toString(method466, s2));
                        }
                        else {
                            sb.append('<');
                            sb.append(s2);
                            sb.append('>');
                            sb.append(toString(method466));
                            sb.append("</");
                            sb.append(s2);
                            sb.append('>');
                        }
                    }
                }
            }
            else if (!(method464 instanceof Class88)) {
                sb.append(method30562(method464.toString()));
            }
            else {
                final Class88 class91 = (Class88)method464;
                for (int method467 = class91.method462(), k = 0; k < method467; ++k) {
                    if (k > 0) {
                        sb.append('\n');
                    }
                    sb.append(method30562(class91.method449(k).toString()));
                }
            }
        }
        if (str != null) {
            sb.append("</");
            sb.append(str);
            sb.append('>');
        }
        return sb.toString();
    }
    
    static {
        field36922 = '&';
        field36923 = '\'';
        field36924 = '!';
        field36925 = '=';
        field36926 = '>';
        field36927 = '<';
        field36928 = '?';
        field36929 = '\"';
        field36930 = '/';
    }
}
