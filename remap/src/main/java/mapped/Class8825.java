// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.json.JSONException;
import totalcross.json.JSONTokener;

public class Class8825 extends JSONTokener
{
    public Class8825(final String s) {
        super(s);
    }
    
    public String method30780() throws JSONException {
        final StringBuilder sb = new StringBuilder();
        char c;
        do {
            c = this.next();
        } while (Character.isWhitespace(c));
        if (c != '\"' && c != '\'') {
            while (c != '\0' && !Character.isWhitespace(c)) {
                sb.append(c);
                c = this.next();
            }
            return sb.toString();
        }
        final char c2 = c;
        while (true) {
            final char method30785 = this.next();
            if (method30785 < ' ') {
                throw this.syntaxError("Unterminated string.");
            }
            if (method30785 == c2) {
                return sb.toString();
            }
            sb.append(method30785);
        }
    }
}
