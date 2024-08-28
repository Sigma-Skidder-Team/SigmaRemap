package mapped;

import com.google.common.collect.Lists;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nullable;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.List;

public class Class441 extends Class440 {
   private static final Logger field1985 = LogManager.getLogger();
   private final ServerSocket field1986;
   private final String field1987;
   private final List<Class443> field1988 = Lists.newArrayList();
   private final Class1646 field1989;

   private Class441(Class1646 var1, ServerSocket var2, String var3) {
      super("RCON Listener");
      this.field1989 = var1;
      this.field1986 = var2;
      this.field1987 = var3;
   }

   private void method1870() {
      this.field1988.removeIf(var0 -> !var0.method1869());
   }

   @Override
   public void run() {
      try {
         while (this.field1982) {
            try {
               Socket var3 = this.field1986.accept();
               Class443 var4 = new Class443(this.field1989, this.field1987, var3);
               var4.method1867();
               this.field1988.add(var4);
               this.method1870();
            } catch (SocketTimeoutException var9) {
               this.method1870();
            } catch (IOException var10) {
               if (this.field1982) {
                  field1985.info("IO exception: ", var10);
               }
            }
         }
      } finally {
         this.method1872(this.field1986);
      }
   }

   @Nullable
   public static Class441 method1871(Class1646 var0) {
      Class9437 var3 = var0.method6498();
      String var4 = var0.method6501();
      if (var4.isEmpty()) {
         var4 = "0.0.0.0";
      }

      int var5 = var3.field43805;
      if (0 < var5 && 65535 >= var5) {
         String var6 = var3.field43806;
         if (var6.isEmpty()) {
            field1985.warn("No rcon password set in server.properties, rcon disabled!");
            return null;
         } else {
            try {
               ServerSocket var7 = new ServerSocket(var5, 0, InetAddress.getByName(var4));
               var7.setSoTimeout(500);
               Class441 var8 = new Class441(var0, var7, var6);
               if (!var8.method1867()) {
                  return null;
               } else {
                  field1985.info("RCON running on {}:{}", var4, var5);
                  return var8;
               }
            } catch (IOException var9) {
               field1985.warn("Unable to initialise RCON on {}:{}", var4, var5, var9);
               return null;
            }
         }
      } else {
         field1985.warn("Invalid rcon port {} found in server.properties, rcon disabled!", var5);
         return null;
      }
   }

   @Override
   public void method1868() {
      this.field1982 = false;
      this.method1872(this.field1986);
      super.method1868();

      for (Class443 var4 : this.field1988) {
         if (var4.method1869()) {
            var4.method1868();
         }
      }

      this.field1988.clear();
   }

   private void method1872(ServerSocket var1) {
      field1985.debug("closeSocket: {}", var1);

      try {
         var1.close();
      } catch (IOException var5) {
         field1985.warn("Failed to close socket", var5);
      }
   }
}
