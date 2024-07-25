package remapped;

import java.io.IOException;
import java.util.List;

public final class class_4553 implements class_9833 {
   private final class_9207 field_22192;

   public class_4553(class_9207 var1) {
      this.field_22192 = var1;
   }

   @Override
   public class_7839 method_45321(class_8047 var1) throws IOException {
      class_3918 var4 = var1.method_36516();
      class_2415 var5 = var4.method_18140();
      class_9001 var6 = var4.method_18133();
      if (var6 != null) {
         class_1972 var7 = var6.method_41290();
         if (var7 != null) {
            var5.method_11009("Content-Type", var7.toString());
         }

         long var11 = var6.method_41288();
         if (var11 == -1L) {
            var5.method_11009("Transfer-Encoding", "chunked");
            var5.method_11003("Content-Length");
         } else {
            var5.method_11009("Content-Length", Long.toString(var11));
            var5.method_11003("Transfer-Encoding");
         }
      }

      if (var4.method_18135("Host") == null) {
         var5.method_11009("Host", class_8515.method_39215(var4.method_18136(), false));
      }

      if (var4.method_18135("Connection") == null) {
         var5.method_11009("Connection", "Keep-Alive");
      }

      boolean var15 = false;
      if (var4.method_18135("Accept-Encoding") == null && var4.method_18135("Range") == null) {
         var15 = true;
         var5.method_11009("Accept-Encoding", "gzip");
      }

      List var8 = this.field_22192.method_42480(var4.method_18136());
      if (!var8.isEmpty()) {
         var5.method_11009("Cookie", this.method_21117(var8));
      }

      if (var4.method_18135("User-Agent") == null) {
         var5.method_11009("User-Agent", class_9254.method_42641());
      }

      class_7839 var9 = var1.method_36514(var5.method_11013());
      class_4464.method_20711(this.field_22192, var4.method_18136(), var9.method_35479());
      class_7775 var10 = var9.method_35485().method_35283(var4);
      if (var15 && "gzip".equalsIgnoreCase(var9.method_35472("Content-Encoding")) && class_4464.method_20709(var9)) {
         class_4408 var13 = new class_4408(var9.method_35481().method_40735());
         class_8121 var14 = var9.method_35479().method_36952().method_33783("Content-Encoding").method_33783("Content-Length").method_33781();
         var10.method_35271(var14);
         var10.method_35282(new class_2536(var14, class_1259.method_5671(var13)));
      }

      return var10.method_35268();
   }

   private String method_21117(List<class_8460> var1) {
      StringBuilder var4 = new StringBuilder();
      int var5 = 0;

      for (int var6 = var1.size(); var5 < var6; var5++) {
         if (var5 > 0) {
            var4.append("; ");
         }

         class_8460 var7 = (class_8460)var1.get(var5);
         var4.append(var7.method_38918()).append('=').append(var7.method_38915());
      }

      return var4.toString();
   }
}
