// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.nio.charset.StandardCharsets;
import java.net.SocketTimeoutException;
import java.net.DatagramPacket;
import java.io.IOException;
import java.net.MulticastSocket;
import java.net.InetAddress;

public class Class929 extends Thread
{
    private final Class8027 field4915;
    private final InetAddress field4916;
    private final MulticastSocket field4917;
    
    public Class929(final Class8027 field4915) throws IOException {
        super("LanServerDetector #" + Class9181.method33547().incrementAndGet());
        this.field4915 = field4915;
        this.setDaemon(true);
        this.setUncaughtExceptionHandler((UncaughtExceptionHandler)new Class8239(Class9181.method33548()));
        this.field4917 = new MulticastSocket(4445);
        this.field4916 = InetAddress.getByName("224.0.2.60");
        this.field4917.setSoTimeout(5000);
        this.field4917.joinGroup(this.field4916);
    }
    
    @Override
    public void run() {
        final byte[] buf = new byte[1024];
        while (!this.isInterrupted()) {
            final DatagramPacket p = new DatagramPacket(buf, buf.length);
            try {
                this.field4917.receive(p);
            }
            catch (final SocketTimeoutException ex) {
                continue;
            }
            catch (final IOException ex2) {
                Class9181.method33548().error("Couldn't ping server", (Throwable)ex2);
                break;
            }
            final String s = new String(p.getData(), p.getOffset(), p.getLength(), StandardCharsets.UTF_8);
            Class9181.method33548().debug("{}: {}", (Object)p.getAddress(), (Object)s);
            this.field4915.method26318(s, p.getAddress());
        }
        try {
            this.field4917.leaveGroup(this.field4916);
        }
        catch (final IOException ex3) {}
        this.field4917.close();
    }
}
