// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.net.SocketException;
import java.net.PortUnreachableException;
import java.net.SocketTimeoutException;
import java.util.Iterator;
import java.io.IOException;
import java.util.Date;
import com.google.common.collect.Maps;
import java.net.UnknownHostException;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.util.Map;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Class1362 extends Class1361
{
    private long field7468;
    private final int field7469;
    private final int field7470;
    private final int field7471;
    private final String field7472;
    private final String field7473;
    private DatagramSocket field7474;
    private final byte[] field7475;
    private DatagramPacket field7476;
    private final Map<SocketAddress, String> field7477;
    private String field7478;
    private String field7479;
    private final Map<SocketAddress, Class8764> field7480;
    private final long field7481;
    private final Class7407 field7482;
    private long field7483;
    
    public Class1362(final Class396 class396) {
        super(class396, "Query Listener");
        this.field7475 = new byte[1460];
        this.field7469 = class396.method1615().field39787;
        this.field7479 = class396.method1619();
        this.field7470 = class396.method1620();
        this.field7472 = class396.method1621();
        this.field7471 = class396.method1485();
        this.field7473 = class396.method1501();
        this.field7483 = 0L;
        this.field7478 = "0.0.0.0";
        if (!this.field7479.isEmpty() && !this.field7478.equals(this.field7479)) {
            this.field7478 = this.field7479;
        }
        else {
            this.field7479 = "0.0.0.0";
            try {
                this.field7478 = InetAddress.getLocalHost().getHostAddress();
            }
            catch (final UnknownHostException ex) {
                this.method5634("Unable to determine local host IP, please set server-ip in server.properties: " + ex.getMessage());
            }
        }
        this.field7477 = Maps.newHashMap();
        this.field7482 = new Class7407(1460);
        this.field7480 = Maps.newHashMap();
        this.field7481 = new Date().getTime();
    }
    
    private void method5643(final byte[] buf, final DatagramPacket datagramPacket) throws IOException {
        this.field7474.send(new DatagramPacket(buf, buf.length, datagramPacket.getSocketAddress()));
    }
    
    private boolean method5644(final DatagramPacket datagramPacket) throws IOException {
        final byte[] data = datagramPacket.getData();
        final int length = datagramPacket.getLength();
        final SocketAddress socketAddress = datagramPacket.getSocketAddress();
        this.method5632("Packet len " + length + " [" + socketAddress + "]");
        if (3 <= length && -2 == data[0] && -3 == data[1]) {
            this.method5632("Packet '" + Class8277.method27516(data[2]) + "' [" + socketAddress + "]");
            switch (data[2]) {
                case 0: {
                    if (!this.method5647(datagramPacket)) {
                        this.method5632("Invalid challenge [" + socketAddress + "]");
                        return false;
                    }
                    if (15 == length) {
                        this.method5643(this.method5645(datagramPacket), datagramPacket);
                        this.method5632("Rules [" + socketAddress + "]");
                        break;
                    }
                    final Class7407 class7407 = new Class7407(1460);
                    class7407.method22763(0);
                    class7407.method22761(this.method5646(datagramPacket.getSocketAddress()));
                    class7407.method22762(this.field7472);
                    class7407.method22762("SMP");
                    class7407.method22762(this.field7473);
                    class7407.method22762(Integer.toString(this.method5636()));
                    class7407.method22762(Integer.toString(this.field7471));
                    class7407.method22764((short)this.field7470);
                    class7407.method22762(this.field7478);
                    this.method5643(class7407.method22765(), datagramPacket);
                    this.method5632("Status [" + socketAddress + "]");
                    break;
                }
                case 9: {
                    this.method5648(datagramPacket);
                    this.method5632("Challenge [" + socketAddress + "]");
                    return true;
                }
            }
            return true;
        }
        this.method5632("Invalid packet [" + socketAddress + "]");
        return false;
    }
    
    private byte[] method5645(final DatagramPacket datagramPacket) throws IOException {
        final long method27837 = Util.method27837();
        if (method27837 >= this.field7483 + 5000L) {
            this.field7483 = method27837;
            this.field7482.method22766();
            this.field7482.method22763(0);
            this.field7482.method22761(this.method5646(datagramPacket.getSocketAddress()));
            this.field7482.method22762("splitnum");
            this.field7482.method22763(128);
            this.field7482.method22763(0);
            this.field7482.method22762("hostname");
            this.field7482.method22762(this.field7472);
            this.field7482.method22762("gametype");
            this.field7482.method22762("SMP");
            this.field7482.method22762("game_id");
            this.field7482.method22762("MINECRAFT");
            this.field7482.method22762("version");
            this.field7482.method22762(this.field7462.method1483());
            this.field7482.method22762("plugins");
            this.field7482.method22762(this.field7462.method1627());
            this.field7482.method22762("map");
            this.field7482.method22762(this.field7473);
            this.field7482.method22762("numplayers");
            this.field7482.method22762("" + this.method5636());
            this.field7482.method22762("maxplayers");
            this.field7482.method22762("" + this.field7471);
            this.field7482.method22762("hostport");
            this.field7482.method22762("" + this.field7470);
            this.field7482.method22762("hostip");
            this.field7482.method22762(this.field7478);
            this.field7482.method22763(0);
            this.field7482.method22763(1);
            this.field7482.method22762("player_");
            this.field7482.method22763(0);
            final String[] method27838 = this.field7462.method1486();
            for (int length = method27838.length, i = 0; i < length; ++i) {
                this.field7482.method22762(method27838[i]);
            }
            this.field7482.method22763(0);
            return this.field7482.method22765();
        }
        final byte[] method27839 = this.field7482.method22765();
        final byte[] method27840 = this.method5646(datagramPacket.getSocketAddress());
        method27839[1] = method27840[0];
        method27839[2] = method27840[1];
        method27839[3] = method27840[2];
        method27839[4] = method27840[3];
        return method27839;
    }
    
    private byte[] method5646(final SocketAddress socketAddress) {
        return this.field7480.get(socketAddress).method30395();
    }
    
    private Boolean method5647(final DatagramPacket datagramPacket) {
        final SocketAddress socketAddress = datagramPacket.getSocketAddress();
        if (this.field7480.containsKey(socketAddress)) {
            return this.field7480.get(socketAddress).method30393() == Class8277.method27515(datagramPacket.getData(), 7, datagramPacket.getLength());
        }
        return false;
    }
    
    private void method5648(final DatagramPacket datagramPacket) throws IOException {
        final Class8764 class8764 = new Class8764(this, datagramPacket);
        this.field7480.put(datagramPacket.getSocketAddress(), class8764);
        this.method5643(class8764.method30394(), datagramPacket);
    }
    
    private void method5649() {
        if (this.field7461) {
            final long method27837 = Util.method27837();
            if (method27837 >= this.field7468 + 30000L) {
                this.field7468 = method27837;
                final Iterator<Map.Entry<SocketAddress, Class8764>> iterator = this.field7480.entrySet().iterator();
                while (iterator.hasNext()) {
                    if (!iterator.next().getValue().method30392(method27837)) {
                        continue;
                    }
                    iterator.remove();
                }
            }
        }
    }
    
    @Override
    public void run() {
        this.method5633("Query running on " + this.field7479 + ":" + this.field7469);
        this.field7468 = Util.method27837();
        this.field7476 = new DatagramPacket(this.field7475, this.field7475.length);
        try {
            while (this.field7461) {
                try {
                    this.field7474.receive(this.field7476);
                    this.method5649();
                    this.method5644(this.field7476);
                }
                catch (final SocketTimeoutException ex) {
                    this.method5649();
                }
                catch (final PortUnreachableException ex2) {}
                catch (final IOException ex3) {
                    this.method5650(ex3);
                }
            }
        }
        finally {
            this.method5641();
        }
    }
    
    @Override
    public void method5629() {
        if (!this.field7461) {
            if (0 < this.field7469 && 65535 >= this.field7469) {
                if (this.method5651()) {
                    super.method5629();
                }
            }
            else {
                this.method5634("Invalid query port " + this.field7469 + " found in server.properties (queries disabled)");
            }
        }
    }
    
    private void method5650(final Exception obj) {
        if (this.field7461) {
            this.method5634("Unexpected exception, buggy JRE? (" + obj + ")");
            if (!this.method5651()) {
                this.method5635("Failed to recover from buggy JRE, shutting down!");
                this.field7461 = false;
            }
        }
    }
    
    private boolean method5651() {
        try {
            this.method5637(this.field7474 = new DatagramSocket(this.field7469, InetAddress.getByName(this.field7479)));
            this.field7474.setSoTimeout(500);
            return true;
        }
        catch (final SocketException ex) {
            this.method5634("Unable to initialise query system on " + this.field7479 + ":" + this.field7469 + " (Socket): " + ex.getMessage());
        }
        catch (final UnknownHostException ex2) {
            this.method5634("Unable to initialise query system on " + this.field7479 + ":" + this.field7469 + " (Unknown Host): " + ex2.getMessage());
        }
        catch (final Exception ex3) {
            this.method5634("Unable to initialise query system on " + this.field7479 + ":" + this.field7469 + " (E): " + ex3.getMessage());
        }
        return false;
    }
}
