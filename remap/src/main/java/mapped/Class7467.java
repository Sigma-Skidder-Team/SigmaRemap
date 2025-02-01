// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;

public class Class7467
{
    private static Object method23005(final Class8827 class8827, final boolean b, final JSONArray class8828) throws org.json.JSONException {
        while (class8827.method30784()) {
            final Object method30796 = class8827.method30796();
            if (method30796 != Class8782.field36927) {
                if (class8828 == null) {
                    continue;
                }
                class8828.method486((method30796 instanceof String) ? Class8782.method30565((String)method30796) : method30796);
            }
            else {
                final Object method30797 = class8827.method30799();
                if (!(method30797 instanceof Character)) {
                    if (!(method30797 instanceof String)) {
                        throw class8827.syntaxError("Bad tagName '" + method30797 + "'.");
                    }
                    final String s = (String)method30797;
                    final JSONArray class8829 = new JSONArray();
                    final JSONObject class8830 = new JSONObject();
                    if (!b) {
                        class8830.method13301("tagName", s);
                        if (class8828 != null) {
                            class8828.method486(class8830);
                        }
                    }
                    else {
                        class8829.method486(s);
                        if (class8828 != null) {
                            class8828.method486(class8829);
                        }
                    }
                    Object o = null;
                    while (true) {
                        if (o == null) {
                            o = class8827.method30799();
                        }
                        if (o == null) {
                            throw class8827.syntaxError("Misshaped tag");
                        }
                        if (o instanceof String) {
                            final String s2 = (String)o;
                            if (!b && ("tagName".equals(s2) || "childNode".equals(s2))) {
                                throw class8827.syntaxError("Reserved attribute.");
                            }
                            o = class8827.method30799();
                            if (o != Class8782.field36925) {
                                class8830.method13254(s2, "");
                            }
                            else {
                                final Object method30798 = class8827.method30799();
                                if (!(method30798 instanceof String)) {
                                    throw class8827.syntaxError("Missing value");
                                }
                                class8830.method13254(s2, Class8782.method30565((String)method30798));
                                o = null;
                            }
                        }
                        else {
                            if (b) {
                                if (class8830.method13274() > 0) {
                                    class8829.method486(class8830);
                                }
                            }
                            if (o != Class8782.field36930) {
                                if (o != Class8782.field36926) {
                                    throw class8827.syntaxError("Misshaped tag");
                                }
                                final String str = (String)method23005(class8827, b, class8829);
                                if (str == null) {
                                    break;
                                }
                                if (!str.equals(s)) {
                                    throw class8827.syntaxError("Mismatched '" + s + "' and '" + str + "'");
                                }
                                if (!b) {
                                    if (class8829.method462() > 0) {
                                        class8830.method13301("childNodes", class8829);
                                    }
                                }
                                if (class8828 != null) {
                                    break;
                                }
                                if (!b) {
                                    return class8830;
                                }
                                return class8829;
                            }
                            else {
                                if (class8827.method30799() != Class8782.field36926) {
                                    throw class8827.syntaxError("Misshaped tag");
                                }
                                if (class8828 != null) {
                                    break;
                                }
                                if (!b) {
                                    return class8830;
                                }
                                return class8829;
                            }
                        }
                    }
                }
                else if (method30797 != Class8782.field36930) {
                    if (method30797 != Class8782.field36924) {
                        if (method30797 != Class8782.field36928) {
                            throw class8827.syntaxError("Misshaped tag");
                        }
                        class8827.method30800("?>");
                    }
                    else {
                        final char method30799 = class8827.method30785();
                        if (method30799 != '-') {
                            if (method30799 != '[') {
                                int n = 1;
                                do {
                                    final Object method30800 = class8827.method30798();
                                    if (method30800 == null) {
                                        throw class8827.syntaxError("Missing '>' after '<!'.");
                                    }
                                    if (method30800 != Class8782.field36927) {
                                        if (method30800 == Class8782.field36926) {
                                            --n;
                                        }
                                    }
                                    else {
                                        ++n;
                                    }
                                } while (n > 0);
                            }
                            else {
                                if (!class8827.method30799().equals("CDATA") || class8827.method30785() != '[') {
                                    throw class8827.syntaxError("Expected 'CDATA['");
                                }
                                if (class8828 == null) {
                                    continue;
                                }
                                class8828.method486(class8827.method30795());
                            }
                        }
                        else if (class8827.method30785() != '-') {
                            class8827.back();
                        }
                        else {
                            class8827.method30800("-->");
                        }
                    }
                }
                else {
                    final Object method30801 = class8827.method30799();
                    if (!(method30801 instanceof String)) {
                        throw new JSONException("Expected a closing name instead of '" + method30801 + "'.");
                    }
                    if (class8827.method30799() == Class8782.field36926) {
                        return method30801;
                    }
                    throw class8827.syntaxError("Misshaped close tag");
                }
            }
        }
        throw class8827.syntaxError("Bad XML");
    }
    
    public static JSONArray method23006(final String s) throws org.json.JSONException {
        return method23007(new Class8827(s));
    }
    
    public static JSONArray method23007(final Class8827 class8827) throws org.json.JSONException {
        return (JSONArray)method23005(class8827, true, null);
    }
    
    public static JSONObject method23008(final Class8827 class8827) throws org.json.JSONException {
        return (JSONObject)method23005(class8827, false, null);
    }
    
    public static JSONObject method23009(final String s) throws org.json.JSONException {
        return method23008(new Class8827(s));
    }
    
    public static String toString(final JSONArray JSONArray) throws org.json.JSONException {
        final StringBuilder sb = new StringBuilder();
        final String method459 = JSONArray.method459(0);
        Class8782.method30563(method459);
        final String method460 = Class8782.method30562(method459);
        sb.append('<');
        sb.append(method460);
        final Object method461 = JSONArray.method463(1);
        int n;
        if (!(method461 instanceof JSONObject)) {
            n = 1;
        }
        else {
            n = 2;
            final JSONObject class89 = (JSONObject)method461;
            final Iterator<String> method462 = class89.method13272();
            while (method462.hasNext()) {
                final String s = method462.next();
                Class8782.method30563(s);
                final String method463 = class89.method13292(s);
                if (method463 == null) {
                    continue;
                }
                sb.append(' ');
                sb.append(Class8782.method30562(s));
                sb.append('=');
                sb.append('\"');
                sb.append(Class8782.method30562(method463));
                sb.append('\"');
            }
        }
        final int method464 = JSONArray.method462();
        if (n < method464) {
            sb.append('>');
            do {
                final Object method465 = JSONArray.method449(n);
                ++n;
                if (method465 != null) {
                    if (!(method465 instanceof String)) {
                        if (!(method465 instanceof JSONObject)) {
                            if (!(method465 instanceof JSONArray)) {
                                sb.append(method465.toString());
                            }
                            else {
                                sb.append(toString((JSONArray)method465));
                            }
                        }
                        else {
                            sb.append(toString((JSONObject)method465));
                        }
                    }
                    else {
                        sb.append(Class8782.method30562(method465.toString()));
                    }
                }
            } while (n < method464);
            sb.append('<');
            sb.append('/');
            sb.append(method460);
            sb.append('>');
        }
        else {
            sb.append('/');
            sb.append('>');
        }
        return sb.toString();
    }
    
    public static String toString(final JSONObject JSONObject) throws org.json.JSONException {
        final StringBuilder sb = new StringBuilder();
        final String method13292 = JSONObject.method13292("tagName");
        if (method13292 != null) {
            Class8782.method30563(method13292);
            final String method13293 = Class8782.method30562(method13292);
            sb.append('<');
            sb.append(method13293);
            final Iterator<String> method13294 = JSONObject.method13272();
            while (method13294.hasNext()) {
                final String s = method13294.next();
                if ("tagName".equals(s)) {
                    continue;
                }
                if ("childNodes".equals(s)) {
                    continue;
                }
                Class8782.method30563(s);
                final String method13295 = JSONObject.method13292(s);
                if (method13295 == null) {
                    continue;
                }
                sb.append(' ');
                sb.append(Class8782.method30562(s));
                sb.append('=');
                sb.append('\"');
                sb.append(Class8782.method30562(method13295));
                sb.append('\"');
            }
            final JSONArray method13296 = JSONObject.method13288("childNodes");
            if (method13296 != null) {
                sb.append('>');
                for (int method13297 = method13296.method462(), i = 0; i < method13297; ++i) {
                    final Object method13298 = method13296.method449(i);
                    if (method13298 != null) {
                        if (!(method13298 instanceof String)) {
                            if (!(method13298 instanceof JSONObject)) {
                                if (!(method13298 instanceof JSONArray)) {
                                    sb.append(method13298.toString());
                                }
                                else {
                                    sb.append(toString((JSONArray)method13298));
                                }
                            }
                            else {
                                sb.append(toString((JSONObject)method13298));
                            }
                        }
                        else {
                            sb.append(Class8782.method30562(method13298.toString()));
                        }
                    }
                }
                sb.append('<');
                sb.append('/');
                sb.append(method13293);
                sb.append('>');
            }
            else {
                sb.append('/');
                sb.append('>');
            }
            return sb.toString();
        }
        return Class8782.method30562(JSONObject.toString());
    }
}
