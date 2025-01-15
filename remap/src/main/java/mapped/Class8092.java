// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.optifine.expr.ParseException;
import java.io.IOException;
import java.util.ArrayList;
import java.io.Reader;
import java.io.PushbackReader;
import java.io.StringReader;

public class Class8092
{
    public static Class7124[] method26584(final String s) throws IOException, ParseException {
        final PushbackReader pushbackReader = new PushbackReader(new StringReader(s));
        final ArrayList list = new ArrayList();
        while (true) {
            final int read = pushbackReader.read();
            if (read < 0) {
                return (Class7124[])list.toArray(new Class7124[list.size()]);
            }
            final char c = (char)read;
            if (Character.isWhitespace(c)) {
                continue;
            }
            final Class2011 method8050 = Class2011.method8050(c);
            if (method8050 == null) {
                throw new Class2327("Invalid character: '" + c + "', in: " + s);
            }
            list.add(method26585(c, method8050, pushbackReader));
        }
    }
    
    private static Class7124 method26585(final char c, final Class2011 class2011, final PushbackReader pushbackReader) throws IOException {
        final StringBuffer sb = new StringBuffer();
        sb.append(c);
        while (true) {
            final int read = pushbackReader.read();
            if (read < 0) {
                break;
            }
            final char c2 = (char)read;
            if (!class2011.method8051(c2)) {
                pushbackReader.unread(c2);
                break;
            }
            sb.append(c2);
        }
        return new Class7124(class2011, sb.toString());
    }
}
