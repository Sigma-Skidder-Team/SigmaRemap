package remapped;

import com.google.common.collect.Lists;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_7453 extends class_8379 {
   private static final Logger field_37985 = LogManager.getLogger();
   private final ServerSocket field_37984;
   private final String field_37986;
   private final List<class_8381> field_37987 = Lists.newArrayList();
   private final class_8685 field_37988;

   private class_7453(class_8685 var1, ServerSocket var2, String var3) {
      super("RCON Listener");
      this.field_37988 = var1;
      this.field_37984 = var2;
      this.field_37986 = var3;
   }

   private void method_33922() {
      this.field_37987.removeIf(var0 -> !var0.method_38621());
   }

   @Override
   public void run() {
      try {
         while (this.field_42882) {
            try {
               Socket var3 = this.field_37984.accept();
               class_8381 var4 = new class_8381(this.field_37988, this.field_37986, var3);
               var4.method_38624();
               this.field_37987.add(var4);
               this.method_33922();
            } catch (SocketTimeoutException var9) {
               this.method_33922();
            } catch (IOException var10) {
               if (this.field_42882) {
                  field_37985.info("IO exception: ", var10);
               }
            }
         }
      } finally {
         this.method_33920(this.field_37984);
      }
   }

   @Nullable
   public static class_7453 method_33921(class_8685 var0) {
      class_9882 var3 = var0.method_39878();
      String var4 = var0.method_39875();
      if (var4.isEmpty()) {
         var4 = "0.0.0.0";
      }

      int var5 = var3.field_50095;
      if (0 < var5 && 65535 >= var5) {
         String var6 = var3.field_50102;
         if (var6.isEmpty()) {
            field_37985.warn("No rcon password set in server.properties, rcon disabled!");
            return null;
         } else {
            try {
               ServerSocket var7 = new ServerSocket(var5, 0, InetAddress.getByName(var4));
               var7.setSoTimeout(500);
               class_7453 var8 = new class_7453(var0, var7, var6);
               if (!var8.method_38624()) {
                  return null;
               } else {
                  field_37985.info("RCON running on {}:{}", var4, var5);
                  return var8;
               }
            } catch (IOException var9) {
               field_37985.warn("Unable to initialise RCON on {}:{}", var4, var5, var9);
               return null;
            }
         }
      } else {
         field_37985.warn("Invalid rcon port {} found in server.properties, rcon disabled!", var5);
         return null;
      }
   }

   @Override
   public void method_38623() {
      this.field_42882 = false;
      this.method_33920(this.field_37984);
      super.method_38623();

      for (class_8381 var4 : this.field_37987) {
         if (var4.method_38621()) {
            var4.method_38623();
         }
      }

      this.field_37987.clear();
   }

   private void method_33920(ServerSocket var1) {
      field_37985.debug("closeSocket: {}", var1);

      try {
         var1.close();
      } catch (IOException var5) {
         field_37985.warn("Failed to close socket", var5);
      }
   }
}
