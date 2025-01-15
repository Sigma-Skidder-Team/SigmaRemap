// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.net.DatagramPacket;

public class Class8764
{
    private final long field36843;
    private final int field36844;
    private final byte[] field36845;
    private final byte[] field36846;
    private final String field36847;
    public final /* synthetic */ Class1362 field36848;
    
    public Class8764(final Class1362 field36848, final DatagramPacket datagramPacket) {
        this.field36848 = field36848;
        this.field36843 = new Date().getTime();
        final byte[] data = datagramPacket.getData();
        (this.field36845 = new byte[4])[0] = data[3];
        this.field36845[1] = data[4];
        this.field36845[2] = data[5];
        this.field36845[3] = data[6];
        this.field36847 = new String(this.field36845, StandardCharsets.UTF_8);
        this.field36844 = new Random().nextInt(16777216);
        this.field36846 = String.format("\t%s%d\u0000", this.field36847, this.field36844).getBytes(StandardCharsets.UTF_8);
    }
    
    public Boolean method30392(final long n) {
        return this.field36843 < n;
    }
    
    public int method30393() {
        return this.field36844;
    }
    
    public byte[] method30394() {
        return this.field36846;
    }
    
    public byte[] method30395() {
        return this.field36845;
    }
}
