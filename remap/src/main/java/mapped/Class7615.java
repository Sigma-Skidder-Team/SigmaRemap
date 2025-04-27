// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.socket.parser.Encoder;
import io.socket.parser.Packet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;

public final class Class7615 implements Encoder
{
    @Override
    public void encode(final Packet packet, final Callback class9042) {
        if (packet.type == 2 || packet.type == 3) {
            if (Class6437.method19202(packet.data)) {
                packet.type = ((packet.type != 2) ? 6 : 5);
            }
        }
        if (Class8171.method27013().isLoggable(Level.FINE)) {
            Class8171.method27013().fine(String.format("encoding packet %s", packet));
        }
        if (5 != packet.type && 6 != packet.type) {
            class9042.call(new String[] { this.method23930(packet) });
        }
        else {
            this.method23931(packet, class9042);
        }
    }
    
    private String method23930(final Packet packet) {
        final StringBuilder sb = new StringBuilder("" + packet.type);
        if (5 == packet.type || 6 == packet.type) {
            sb.append(packet.attachments);
            sb.append("-");
        }
        if (packet.nsp != null) {
            if (packet.nsp.length() != 0) {
                if (!"/".equals(packet.nsp)) {
                    sb.append(packet.nsp);
                    sb.append(",");
                }
            }
        }
        if (packet.id >= 0) {
            sb.append(packet.id);
        }
        if (packet.data != null) {
            sb.append(packet.data);
        }
        if (Class8171.method27013().isLoggable(Level.FINE)) {
            Class8171.method27013().fine(String.format("encoded %s as %s", packet, sb));
        }
        return sb.toString();
    }
    
    private void method23931(final Packet packet, final Callback class9042) {
        final Class7845 method16358 = Class5255.method16358(packet);
        final String method16359 = this.method23930(method16358.field32127);
        final ArrayList list = new ArrayList(Arrays.asList(method16358.field32128));
        list.add(0, method16359);
        class9042.call(list.toArray());
    }
}
