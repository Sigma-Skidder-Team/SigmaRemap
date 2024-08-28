package mapped;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;
import java.nio.charset.StandardCharsets;

public class Class370 extends Thread {
   private final Class9635 field1622;
   private final InetAddress field1623;
   private final MulticastSocket field1624;

   public Class370(Class9635 var1) throws IOException {
      super("LanServerDetector #" + Class6643.method20279().incrementAndGet());
      this.field1622 = var1;
      this.setDaemon(true);
      this.setUncaughtExceptionHandler(new Class6030(Class6643.method20280()));
      this.field1624 = new MulticastSocket(4445);
      this.field1623 = InetAddress.getByName("224.0.2.60");
      this.field1624.setSoTimeout(5000);
      this.field1624.joinGroup(this.field1623);
   }

   @Override
   public void run() {
      byte[] var3 = new byte[1024];

      while (!this.isInterrupted()) {
         DatagramPacket var4 = new DatagramPacket(var3, var3.length);

         try {
            this.field1624.receive(var4);
         } catch (SocketTimeoutException var7) {
            continue;
         } catch (IOException var8) {
            Class6643.method20280().error("Couldn't ping server", var8);
            break;
         }

         String var5 = new String(var4.getData(), var4.getOffset(), var4.getLength(), StandardCharsets.UTF_8);
         Class6643.method20280().debug("{}: {}", var4.getAddress(), var5);
         this.field1622.method37558(var5, var4.getAddress());
      }

      try {
         this.field1624.leaveGroup(this.field1623);
      } catch (IOException var6) {
      }

      this.field1624.close();
   }
}
