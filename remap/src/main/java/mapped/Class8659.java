// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import org.json.JSONException;

public class Class8659
{
    public static Class4405 method29530(final String s) throws JSONException {
        final Class4405 class4405 = new Class4405();
        final Class8826 class4406 = new Class8826(s);
        while (class4406.method30784()) {
            final String method26951 = Class8160.method26951(class4406.method30790('='));
            class4406.method30786('=');
            class4405.method13301(method26951, Class8160.method26951(class4406.method30790(';')));
            class4406.method30785();
        }
        return class4405;
    }
    
    public static String toString(final Class4405 class4405) throws JSONException {
        int n = 0;
        final Iterator<String> method13272 = class4405.method13272();
        final StringBuilder sb = new StringBuilder();
        while (method13272.hasNext()) {
            final String s = method13272.next();
            if (class4405.method13271(s)) {
                continue;
            }
            if (n != 0) {
                sb.append(';');
            }
            sb.append(Class8160.method26949(s));
            sb.append("=");
            sb.append(Class8160.method26949(class4405.method13268(s)));
            n = 1;
        }
        return sb.toString();
    }
}
