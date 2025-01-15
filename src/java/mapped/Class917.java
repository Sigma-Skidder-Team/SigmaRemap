// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;
import java.io.IOException;
import java.net.DatagramSocket;
import org.apache.logging.log4j.Logger;
import java.util.concurrent.atomic.AtomicInteger;

public class Class917 extends Thread
{
    private static final AtomicInteger field4880;
    private static final Logger field4881;
    private final String field4882;
    private final DatagramSocket field4883;
    private boolean field4884;
    private final String field4885;
    
    public Class917(final String field4882, final String field4883) throws IOException {
        super("LanServerPinger #" + Class917.field4880.incrementAndGet());
        this.field4884 = true;
        this.field4882 = field4882;
        this.field4885 = field4883;
        this.setDaemon(true);
        this.setUncaughtExceptionHandler((UncaughtExceptionHandler)new Class8239(Class917.field4881));
        this.field4883 = new DatagramSocket();
    }
    
    @Override
    public void run() {
        final byte[] bytes = method5418(this.field4882, this.field4885).getBytes(StandardCharsets.UTF_8);
        while (!this.isInterrupted() && this.field4884) {
            try {
                this.field4883.send(new DatagramPacket(bytes, bytes.length, InetAddress.getByName("224.0.2.60"), 4445));
            }
            catch (final IOException ex) {
                Class917.field4881.warn("LanServerPinger: {}", (Object)ex.getMessage());
                break;
            }
            try {
                Thread.sleep(1500L);
            }
            catch (final InterruptedException ex2) {}
        }
    }
    
    @Override
    public void interrupt() {
        super.interrupt();
        this.field4884 = false;
    }
    
    public static String method5418(final String str, final String str2) {
        return "[MOTD]" + str + "[/MOTD][AD]" + str2 + "[/AD]";
    }
    
    public static String method5419(final String s) {
        final int index = s.indexOf("[MOTD]");
        if (index >= 0) {
            final int index2 = s.indexOf("[/MOTD]", index + "[MOTD]".length());
            return (index2 >= index) ? s.substring(index + "[MOTD]".length(), index2) : "missing no";
        }
        return "missing no";
    }
    
    public static String method5420(final String s) {
        final int index = s.indexOf("[/MOTD]");
        if (index < 0) {
            return null;
        }
        if (s.indexOf("[/MOTD]", index + "[/MOTD]".length()) >= 0) {
            return null;
        }
        final int index2 = s.indexOf("[AD]", index + "[/MOTD]".length());
        if (index2 >= 0) {
            final int index3 = s.indexOf("[/AD]", index2 + "[AD]".length());
            return (index3 >= index2) ? s.substring(index2 + "[AD]".length(), index3) : null;
        }
        return null;
    }
    
    static {
        field4880 = new AtomicInteger(0);
        field4881 = LogManager.getLogger();
    }
}
