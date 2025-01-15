// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import org.json.JSONException;

public class Class9308
{
    public static final String field39947 = "\r\n";
    
    public static Class4405 method34426(final String s) throws JSONException {
        final Class4405 class4405 = new Class4405();
        final Class8825 class4406 = new Class8825(s);
        final String method30780 = class4406.method30780();
        if (!method30780.toUpperCase().startsWith("HTTP")) {
            class4405.method13301("Method", method30780);
            class4405.method13301("Request-URI", class4406.method30780());
            class4405.method13301("HTTP-Version", class4406.method30780());
        }
        else {
            class4405.method13301("HTTP-Version", method30780);
            class4405.method13301("Status-Code", class4406.method30780());
            class4405.method13301("Reason-Phrase", class4406.method30790('\0'));
            class4406.method30785();
        }
        while (class4406.method30784()) {
            final String method30781 = class4406.method30790(':');
            class4406.method30786(':');
            class4405.method13301(method30781, class4406.method30790('\0'));
            class4406.method30785();
        }
        return class4405;
    }
    
    public static String toString(final Class4405 class4405) throws JSONException {
        final Iterator<String> method13272 = class4405.method13272();
        final StringBuilder sb = new StringBuilder();
        if (class4405.method13269("Status-Code") && class4405.method13269("Reason-Phrase")) {
            sb.append(class4405.method13268("HTTP-Version"));
            sb.append(' ');
            sb.append(class4405.method13268("Status-Code"));
            sb.append(' ');
            sb.append(class4405.method13268("Reason-Phrase"));
        }
        else {
            if (!class4405.method13269("Method") || !class4405.method13269("Request-URI")) {
                throw new Class2381("Not enough material for an HTTP header.");
            }
            sb.append(class4405.method13268("Method"));
            sb.append(' ');
            sb.append('\"');
            sb.append(class4405.method13268("Request-URI"));
            sb.append('\"');
            sb.append(' ');
            sb.append(class4405.method13268("HTTP-Version"));
        }
        sb.append("\r\n");
        while (method13272.hasNext()) {
            final String s = method13272.next();
            if ("HTTP-Version".equals(s)) {
                continue;
            }
            if ("Status-Code".equals(s)) {
                continue;
            }
            if ("Reason-Phrase".equals(s)) {
                continue;
            }
            if ("Method".equals(s)) {
                continue;
            }
            if ("Request-URI".equals(s)) {
                continue;
            }
            if (class4405.method13271(s)) {
                continue;
            }
            sb.append(s);
            sb.append(": ");
            sb.append(class4405.method13268(s));
            sb.append("\r\n");
        }
        sb.append("\r\n");
        return sb.toString();
    }
}
