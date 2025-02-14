package mapped;

import net.minecraft.util.DefaultUncaughtExceptionHandler;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicInteger;

public class Class384 extends Thread {
   private static final AtomicInteger field1644 = new AtomicInteger(0);
   private static final Logger field1645 = LogManager.getLogger();
   private final String field1646;
   private final DatagramSocket field1647;
   private boolean field1648 = true;
   private final String field1649;

   public Class384(String var1, String var2) throws IOException {
      super("LanServerPinger #" + field1644.incrementAndGet());
      this.field1646 = var1;
      this.field1649 = var2;
      this.setDaemon(true);
      this.setUncaughtExceptionHandler(new DefaultUncaughtExceptionHandler(field1645));
      this.field1647 = new DatagramSocket();
   }

   @Override
   public void run() {
      String var3 = method1863(this.field1646, this.field1649);
      byte[] var4 = var3.getBytes(StandardCharsets.UTF_8);

      while (!this.isInterrupted() && this.field1648) {
         try {
            InetAddress var5 = InetAddress.getByName("224.0.2.60");
            DatagramPacket var6 = new DatagramPacket(var4, var4.length, var5, 4445);
            this.field1647.send(var6);
         } catch (IOException var8) {
            field1645.warn("LanServerPinger: {}", var8.getMessage());
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
      this.field1648 = false;
   }

   public static String method1863(String var0, String var1) {
      return "[MOTD]" + var0 + "[/MOTD][AD]" + var1 + "[/AD]";
   }

   public static String method1864(String var0) {
      int var3 = var0.indexOf("[MOTD]");
      if (var3 >= 0) {
         int var4 = var0.indexOf("[/MOTD]", var3 + "[MOTD]".length());
         return var4 >= var3 ? var0.substring(var3 + "[MOTD]".length(), var4) : "missing no";
      } else {
         return "missing no";
      }
   }

   public static String method1865(String var0) {
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
