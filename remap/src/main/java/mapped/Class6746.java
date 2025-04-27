// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.socket.parser.Decoder;
import io.socket.parser.Packet;
import totalcross.json.JSONTokener;

import java.util.logging.Level;

public final class Class6746 implements Decoder
{
    public Class8572 field26539;
    private Callback field26540;
    
    public Class6746() {
        this.field26539 = null;
    }
    
    @Override
    public void add(final String s) {
        final Packet method20536 = method20536(s);
        if (5 != method20536.type && 6 != method20536.type) {
            if (this.field26540 != null) {
                this.field26540.call(method20536);
            }
        }
        else {
            this.field26539 = new Class8572(method20536);
            if (this.field26539.field36045.attachments == 0) {
                if (this.field26540 != null) {
                    this.field26540.call(method20536);
                }
            }
        }
    }
    
    @Override
    public void add(final byte[] array) {
        if (this.field26539 != null) {
            final Packet method29022 = this.field26539.method29022(array);
            if (method29022 != null) {
                this.field26539 = null;
                if (this.field26540 != null) {
                    this.field26540.call(method29022);
                }
            }
            return;
        }
        throw new RuntimeException("got binary data when not reconstructing a packet");
    }
    
    private static Packet method20536(final String s) {
        int n = 0;
        final int length = s.length();
        final Packet packet = new Packet(Character.getNumericValue(s.charAt(0)));
        if (packet.type < 0 || packet.type > Class8170.field33661.length - 1) {
            return Class8171.method27014();
        }
        if (5 == packet.type || 6 == packet.type) {
            if (!s.contains("-") || length <= n + 1) {
                return Class8171.method27014();
            }
            final StringBuilder sb = new StringBuilder();
            while (s.charAt(++n) != '-') {
                sb.append(s.charAt(n));
            }
            packet.attachments = Integer.parseInt(sb.toString());
        }
        if (length > n + 1 && '/' == s.charAt(n + 1)) {
            final StringBuilder sb2 = new StringBuilder();
            do {
                ++n;
                final char char1 = s.charAt(n);
                if (',' == char1) {
                    break;
                }
                sb2.append(char1);
            } while (n + 1 != length);
            packet.nsp = sb2.toString();
        }
        else {
            packet.nsp = "/";
        }
        if (length > n + 1 && Character.getNumericValue(s.charAt(n + 1)) > -1) {
            final StringBuilder sb3 = new StringBuilder();
            do {
                ++n;
                final char char2 = s.charAt(n);
                if (Character.getNumericValue(char2) < 0) {
                    --n;
                    break;
                }
                sb3.append(char2);
            } while (n + 1 != length);
            try {
                packet.id = Integer.parseInt(sb3.toString());
            }
            catch (final NumberFormatException ex) {
                return Class8171.method27014();
            }
        }
        if (length > n + 1) {
            try {
                s.charAt(++n);
                packet.data = new JSONTokener(s.substring(n)).nextValue();
            }
            catch (final JSONException thrown) {
                Class8171.method27013().log(Level.WARNING, "An error occured while retrieving data from JSONTokener", thrown);
                return Class8171.method27014();
            }
        }
        if (Class8171.method27013().isLoggable(Level.FINE)) {
            Class8171.method27013().fine(String.format("decoded %s as %s", s, packet));
        }
        return packet;
    }
    
    @Override
    public void destroy() {
        if (this.field26539 != null) {
            this.field26539.method29023();
        }
        this.field26540 = null;
    }
    
    @Override
    public void onDecoded(final Callback field26540) {
        this.field26540 = field26540;
    }
}
