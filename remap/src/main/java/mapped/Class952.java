// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.socket.client.Socket;
import io.socket.parser.Packet;
import totalcross.json.JSONArray;

public class Class952 implements Runnable
{
    public final /* synthetic */ String field5039;
    public final /* synthetic */ Object[] field5040;
    public final /* synthetic */ Ack field5041;
    public final /* synthetic */ Socket field5042;
    
    public Class952(final Socket field5042, final String field5043, final Object[] field5044, final Ack field5045) {
        this.field5042 = field5042;
        this.field5039 = field5043;
        this.field5040 = field5044;
        this.field5041 = field5045;
    }
    
    @Override
    public void run() {
        final JSONArray JSONArray = new JSONArray();
        JSONArray.put(this.field5039);
        if (this.field5040 != null) {
            final Object[] field5040 = this.field5040;
            for (int length = field5040.length, i = 0; i < length; ++i) {
                JSONArray.put(field5040[i]);
            }
        }
        final Packet class89 = new Packet(2, JSONArray);
        if (this.field5041 != null) {
            Socket.method14969().fine(String.format("emitting packet with ack id %d", Socket.method14968(this.field5042)));
            Socket.method14970(this.field5042).put(Socket.method14968(this.field5042), this.field5041);
            class89.id = Socket.method14971(this.field5042);
        }
        if (!Socket.method14964(this.field5042)) {
            Socket.method14973(this.field5042).add(class89);
        }
        else {
            Socket.method14972(this.field5042, class89);
        }
    }
}
