package remapped;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class class_7552 {
   private static String[] field_38506;
   public Socket field_38507;
   public String field_38509;
   public class_8067 field_38505;
   public class_3947 field_38502;
   public class_8906 field_38508 = class_8906.field_45662;
   public class_6034 field_38503 = class_6034.field_30815;
   public boolean field_38504;

   public class_7552(boolean var1) {
      this.field_38504 = var1;
   }

   public class_7552 method_34363(Socket var1) throws IOException {
      return this.method_34364(
         var1,
         ((InetSocketAddress)var1.getRemoteSocketAddress()).getHostName(),
         class_1259.method_5671(class_1259.method_5668(var1)),
         class_1259.method_5670(class_1259.method_5662(var1))
      );
   }

   public class_7552 method_34364(Socket var1, String var2, class_8067 var3, class_3947 var4) {
      this.field_38507 = var1;
      this.field_38509 = var2;
      this.field_38505 = var3;
      this.field_38502 = var4;
      return this;
   }

   public class_7552 method_34365(class_8906 var1) {
      this.field_38508 = var1;
      return this;
   }

   public class_7552 method_34362(class_6034 var1) {
      this.field_38503 = var1;
      return this;
   }

   public class_2695 method_34361() throws IOException {
      return new class_2695(this);
   }
}
