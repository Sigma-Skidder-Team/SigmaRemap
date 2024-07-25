package remapped;

import com.google.common.base.Joiner;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class class_6634 extends class_3893 {
   public class_6634(class_757 var1) {
      this.field_34343 = var1;
   }

   @Override
   public void method_18023() {
      this.method_18025(
         var0 -> {
            String var3 = var0.<String>method_23261(class_8039.field_41171);
            if (var3.length() <= 32) {
               if (var3.equals("minecraft:register") || var3.equals("minecraft:unregister")) {
                  String[] var4 = new String(var0.<byte[]>method_23242(class_8039.field_41181), StandardCharsets.UTF_8).split("\u0000");
                  ArrayList var5 = new ArrayList(var4.length);

                  for (String var9 : var4) {
                     if (var9.length() <= 32) {
                        var5.add(var9);
                     } else if (!class_3446.method_15884().method_25845()) {
                        class_3446.method_15886()
                           .method_34617()
                           .warning("Ignoring incoming plugin channel register of '" + var9 + "', as it is longer than 32 characters");
                     }
                  }

                  if (var5.isEmpty()) {
                     var0.method_23245();
                     return;
                  }

                  var0.method_23236(class_8039.field_41181, Joiner.on('\u0000').join(var5).getBytes(StandardCharsets.UTF_8));
               }
            } else {
               if (!class_3446.method_15884().method_25845()) {
                  class_3446.method_15886().method_34617().warning("Ignoring incoming plugin channel, as it is longer than 32 characters: " + var3);
               }

               var0.method_23245();
            }
         }
      );
   }
}
