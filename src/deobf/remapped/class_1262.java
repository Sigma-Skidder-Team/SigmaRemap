package remapped;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_1262 extends Thread {
   private static final AtomicInteger field_6949 = new AtomicInteger(0);
   private static final Logger field_6951 = LogManager.getLogger();
   private final String field_6953;
   private final DatagramSocket field_6954;
   private boolean field_6952 = true;
   private final String field_6955;

   public class_1262(String var1, String var2) throws IOException {
      super("LanServerPinger #" + field_6949.incrementAndGet());
      this.field_6953 = var1;
      this.field_6955 = var2;
      this.setDaemon(true);
      this.setUncaughtExceptionHandler(new class_447(field_6951));
      this.field_6954 = new DatagramSocket();
   }

   @Override
   public void run() {
      String var3 = method_5682(this.field_6953, this.field_6955);
      byte[] var4 = var3.getBytes(StandardCharsets.UTF_8);

      while (!this.isInterrupted() && this.field_6952) {
         try {
            InetAddress var5 = InetAddress.getByName("224.0.2.60");
            DatagramPacket var6 = new DatagramPacket(var4, var4.length, var5, 4445);
            this.field_6954.send(var6);
         } catch (IOException var8) {
            field_6951.warn("LanServerPinger: {}", var8.getMessage());
            break;
         }

         try {
            sleep(1500L);
         } catch (InterruptedException var7) {
         }
      }
   }

   @Override
   public void interrupt() {
      super.interrupt();
      this.field_6952 = false;
   }

   public static String method_5682(String var0, String var1) {
      return "[MOTD]" + var0 + "[/MOTD][AD]" + var1 + "[/AD]";
   }

   public static String method_5683(String var0) {
      int var3 = var0.indexOf("[MOTD]");
      if (var3 >= 0) {
         int var4 = var0.indexOf("[/MOTD]", var3 + "[MOTD]".length());
         return var4 >= var3 ? var0.substring(var3 + "[MOTD]".length(), var4) : "missing no";
      } else {
         return "missing no";
      }
   }

   public static String method_5684(String var0) {
      int var3 = var0.indexOf("[/MOTD]");
      if (var3 >= 0) {
         int var4 = var0.indexOf("[/MOTD]", var3 + "[/MOTD]".length());
         if (var4 < 0) {
            int var5 = var0.indexOf("[AD]", var3 + "[/MOTD]".length());
            if (var5 >= 0) {
               int var6 = var0.indexOf("[/AD]", var5 + "[AD]".length());
               return var6 >= var5 ? var0.substring(var5 + "[AD]".length(), var6) : null;
            } else {
               return null;
            }
         } else {
            return null;
         }
      } else {
         return null;
      }
   }
}
