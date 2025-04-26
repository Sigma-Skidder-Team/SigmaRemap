// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import java.net.ProtocolException;

public final class Class8482
{
    public static final int field34803 = 307;
    public static final int field34804 = 308;
    public static final int field34805 = 100;
    public final Class190 field34806;
    public final int field34807;
    public final String field34808;
    
    public Class8482(final Class190 field34806, final int field34807, final String field34808) {
        this.field34806 = field34806;
        this.field34807 = field34807;
        this.field34808 = field34808;
    }
    
    public static Class8482 method28316(final Response class1753) {
        return new Class8482(class1753.method6187(), class1753.method6188(), class1753.method6190());
    }
    
    public static Class8482 method28317(final String s) throws IOException {
        int beginIndex;
        Class190 class190;
        if (s.startsWith("HTTP/1.")) {
            if (s.length() < 9 || s.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: " + s);
            }
            final int n = s.charAt(7) - '0';
            beginIndex = 9;
            if (n == 0) {
                class190 = Class190.field622;
            }
            else {
                if (n != 1) {
                    throw new ProtocolException("Unexpected status line: " + s);
                }
                class190 = Class190.field623;
            }
        }
        else {
            if (!s.startsWith("ICY ")) {
                throw new ProtocolException("Unexpected status line: " + s);
            }
            class190 = Class190.field622;
            beginIndex = 4;
        }
        if (s.length() < beginIndex + 3) {
            throw new ProtocolException("Unexpected status line: " + s);
        }
        int int1;
        try {
            int1 = Integer.parseInt(s.substring(beginIndex, beginIndex + 3));
        }
        catch (final NumberFormatException ex) {
            throw new ProtocolException("Unexpected status line: " + s);
        }
        String substring = "";
        if (s.length() > beginIndex + 3) {
            if (s.charAt(beginIndex + 3) != ' ') {
                throw new ProtocolException("Unexpected status line: " + s);
            }
            substring = s.substring(beginIndex + 4);
        }
        return new Class8482(class190, int1, substring);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append((this.field34806 != Class190.field622) ? "HTTP/1.1" : "HTTP/1.0");
        sb.append(' ').append(this.field34807);
        if (this.field34808 != null) {
            sb.append(' ').append(this.field34808);
        }
        return sb.toString();
    }
}
