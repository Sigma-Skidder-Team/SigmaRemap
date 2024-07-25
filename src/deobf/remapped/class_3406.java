package remapped;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;
import java.nio.charset.StandardCharsets;

public class class_3406 extends Thread {
   private final class_9126 field_16764;
   private final InetAddress field_16762;
   private final MulticastSocket field_16763;

   public class_3406(class_9126 var1) throws IOException {
      super("LanServerDetector #" + class_841.method_3681().incrementAndGet());
      this.field_16764 = var1;
      this.setDaemon(true);
      this.setUncaughtExceptionHandler(new class_447(class_841.method_3680()));
      this.field_16763 = new MulticastSocket(4445);
      this.field_16762 = InetAddress.getByName("224.0.2.60");
      this.field_16763.setSoTimeout(5000);
      this.field_16763.joinGroup(this.field_16762);
   }

   @Override
   public void run() {
      byte[] var3 = new byte[1024];

      while (!this.isInterrupted()) {
         DatagramPacket var4 = new DatagramPacket(var3, var3.length);

         try {
            this.field_16763.receive(var4);
         } catch (SocketTimeoutException var7) {
            continue;
         } catch (IOException var8) {
            class_841.method_3680().error("Couldn't ping server", var8);
            break;
         }

         String var5 = new String(var4.getData(), var4.getOffset(), var4.getLength(), StandardCharsets.UTF_8);
         class_841.method_3680().debug("{}: {}", var4.getAddress(), var5);
         this.field_16764.method_41983(var5, var4.getAddress());
      }

      try {
         this.field_16763.leaveGroup(this.field_16762);
      } catch (IOException var6) {
      }

      this.field_16763.close();
   }
}
