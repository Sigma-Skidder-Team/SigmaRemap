package remapped;

import com.google.gson.JsonObject;
import java.io.File;
import java.net.SocketAddress;

public class class_9065 extends class_4290<String, class_4513> {
   public class_9065(File var1) {
      super(var1);
   }

   @Override
   public class_8227<String> method_19924(JsonObject var1) {
      return new class_4513(var1);
   }

   public boolean method_41616(SocketAddress var1) {
      String var4 = this.method_41613(var1);
      return this.method_19933(var4);
   }

   public boolean method_41615(String var1) {
      return this.method_19933(var1);
   }

   public class_4513 method_41614(SocketAddress var1) {
      String var4 = this.method_41613(var1);
      return this.method_19927(var4);
   }

   private String method_41613(SocketAddress var1) {
      String var4 = var1.toString();
      if (var4.contains("/")) {
         var4 = var4.substring(var4.indexOf(47) + 1);
      }

      if (var4.contains(":")) {
         var4 = var4.substring(0, var4.indexOf(58));
      }

      return var4;
   }
}
