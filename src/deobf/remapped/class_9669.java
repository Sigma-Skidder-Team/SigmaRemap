package remapped;

import java.io.IOException;
import java.net.ProtocolException;

public final class class_9669 {
   public static final int field_49249 = 307;
   public static final int field_49250 = 308;
   public static final int field_49253 = 100;
   public final class_7976 field_49247;
   public final int field_49248;
   public final String field_49252;

   public class_9669(class_7976 var1, int var2, String var3) {
      this.field_49247 = var1;
      this.field_49248 = var2;
      this.field_49252 = var3;
   }

   public static class_9669 method_44715(class_7839 var0) {
      return new class_9669(var0.method_35483(), var0.method_35490(), var0.method_35476());
   }

   public static class_9669 method_44716(String var0) throws IOException {
      byte var4;
      class_7976 var5;
      if (var0.startsWith("HTTP/1.")) {
         if (var0.length() < 9 || var0.charAt(8) != ' ') {
            throw new ProtocolException("Unexpected status line: " + var0);
         }

         int var3 = var0.charAt(7) - '0';
         var4 = 9;
         if (var3 == 0) {
            var5 = class_7976.field_40848;
         } else {
            if (var3 != 1) {
               throw new ProtocolException("Unexpected status line: " + var0);
            }

            var5 = class_7976.field_40847;
         }
      } else {
         if (!var0.startsWith("ICY ")) {
            throw new ProtocolException("Unexpected status line: " + var0);
         }

         var5 = class_7976.field_40848;
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

         return new class_9669(var5, var8, var6);
      }
   }

   @Override
   public String toString() {
      StringBuilder var3 = new StringBuilder();
      var3.append(this.field_49247 != class_7976.field_40848 ? "HTTP/1.1" : "HTTP/1.0");
      var3.append(' ').append(this.field_49248);
      if (this.field_49252 != null) {
         var3.append(' ').append(this.field_49252);
      }

      return var3.toString();
   }
}
