package mapped;

import java.io.IOException;
import java.net.ProtocolException;

public final class Class9776 {
   public static final int field45727 = 307;
   public static final int field45728 = 308;
   public static final int field45729 = 100;
   public final Class2201 field45730;
   public final int field45731;
   public final String field45732;

   public Class9776(Class2201 var1, int var2, String var3) {
      this.field45730 = var1;
      this.field45731 = var2;
      this.field45732 = var3;
   }

   public static Class9776 method38544(Class1797 var0) {
      return new Class9776(var0.method7845(), var0.method7846(), var0.method7848());
   }

   public static Class9776 method38545(String var0) throws IOException {
      byte var4;
      Class2201 var5;
      if (var0.startsWith("HTTP/1.")) {
         if (var0.length() < 9 || var0.charAt(8) != ' ') {
            throw new ProtocolException("Unexpected status line: " + var0);
         }

         int var3 = var0.charAt(7) - '0';
         var4 = 9;
         if (var3 == 0) {
            var5 = Class2201.field14385;
         } else {
            if (var3 != 1) {
               throw new ProtocolException("Unexpected status line: " + var0);
            }

            var5 = Class2201.field14386;
         }
      } else {
         if (!var0.startsWith("ICY ")) {
            throw new ProtocolException("Unexpected status line: " + var0);
         }

         var5 = Class2201.field14385;
         var4 = 4;
      }

      if (var0.length() < var4 + 3) {
         throw new ProtocolException("Unexpected status line: " + var0);
      } else {
         int var8;
         try {
            var8 = Integer.parseInt(var0.substring(var4, var4 + 3));
         } catch (NumberFormatException var7) {
            throw new ProtocolException("Unexpected status line: " + var0);
         }

         String var6 = "";
         if (var0.length() > var4 + 3) {
            if (var0.charAt(var4 + 3) != ' ') {
               throw new ProtocolException("Unexpected status line: " + var0);
            }

            var6 = var0.substring(var4 + 4);
         }

         return new Class9776(var5, var8, var6);
      }
   }

   @Override
   public String toString() {
      StringBuilder var3 = new StringBuilder();
      var3.append(this.field45730 != Class2201.field14385 ? "HTTP/1.1" : "HTTP/1.0");
      var3.append(' ').append(this.field45731);
      if (this.field45732 != null) {
         var3.append(' ').append(this.field45732);
      }

      return var3.toString();
   }
}
