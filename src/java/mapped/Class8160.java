// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.json.JSONException;
import java.io.Serializable;

public class Class8160
{
    public static String method26949(final String s) {
        final String trim = s.trim();
        final int length = trim.length();
        final StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; ++i) {
            final char char1 = trim.charAt(i);
            if (char1 >= ' ') {
                if (char1 != '+') {
                    if (char1 != '%') {
                        if (char1 != '=') {
                            if (char1 != ';') {
                                sb.append(char1);
                                continue;
                            }
                        }
                    }
                }
            }
            sb.append('%');
            sb.append(Character.forDigit((char)(char1 >>> 4 & 0xF), 16));
            sb.append(Character.forDigit((char)(char1 & '\u000f'), 16));
        }
        return sb.toString();
    }
    
    public static Class4405 method26950(final String s) throws JSONException {
        final Class4405 class4405 = new Class4405();
        final Class8826 class4406 = new Class8826(s);
        class4405.method13301("name", class4406.method30790('='));
        class4406.method30786('=');
        class4405.method13301("value", class4406.method30790(';'));
        class4406.method30785();
        while (class4406.method30784()) {
            final String method26951 = method26951(class4406.method30791("=;"));
            Serializable s2;
            if (class4406.method30785() == '=') {
                s2 = method26951(class4406.method30790(';'));
                class4406.method30785();
            }
            else {
                if (!method26951.equals("secure")) {
                    throw class4406.method30794("Missing '=' in cookie parameter.");
                }
                s2 = Boolean.TRUE;
            }
            class4405.method13301(method26951, s2);
        }
        return class4405;
    }
    
    public static String toString(final Class4405 class4405) throws JSONException {
        final StringBuilder sb = new StringBuilder();
        sb.append(method26949(class4405.method13268("name")));
        sb.append("=");
        sb.append(method26949(class4405.method13268("value")));
        if (class4405.method13269("expires")) {
            sb.append(";expires=");
            sb.append(class4405.method13268("expires"));
        }
        if (class4405.method13269("domain")) {
            sb.append(";domain=");
            sb.append(method26949(class4405.method13268("domain")));
        }
        if (class4405.method13269("path")) {
            sb.append(";path=");
            sb.append(method26949(class4405.method13268("path")));
        }
        if (class4405.method13280("secure")) {
            sb.append(";secure");
        }
        return sb.toString();
    }
    
    public static String method26951(final String s) {
        final int length = s.length();
        final StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; ++i) {
            char char1 = s.charAt(i);
            if (char1 != '+') {
                if (char1 == '%') {
                    if (i + 2 < length) {
                        final int method30782 = Class8826.method30782(s.charAt(i + 1));
                        final int method30783 = Class8826.method30782(s.charAt(i + 2));
                        if (method30782 >= 0) {
                            if (method30783 >= 0) {
                                char1 = (char)(method30782 * 16 + method30783);
                                i += 2;
                            }
                        }
                    }
                }
            }
            else {
                char1 = ' ';
            }
            sb.append(char1);
        }
        return sb.toString();
    }
}
