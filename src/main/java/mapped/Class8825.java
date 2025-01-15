// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.json.JSONException;

public class Class8825 extends Class8826
{
    public Class8825(final String s) {
        super(s);
    }
    
    public String method30780() throws JSONException {
        final StringBuilder sb = new StringBuilder();
        char c;
        do {
            c = this.method30785();
        } while (Character.isWhitespace(c));
        if (c != '\"' && c != '\'') {
            while (c != '\0' && !Character.isWhitespace(c)) {
                sb.append(c);
                c = this.method30785();
            }
            return sb.toString();
        }
        final char c2 = c;
        while (true) {
            final char method30785 = this.method30785();
            if (method30785 < ' ') {
                throw this.method30794("Unterminated string.");
            }
            if (method30785 == c2) {
                return sb.toString();
            }
            sb.append(method30785);
        }
    }
}
