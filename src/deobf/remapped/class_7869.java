package remapped;

import com.google.common.base.Joiner;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class class_7869 implements class_857 {
   public class_7869(class_6270 var1) {
      this.field_40285 = var1;
   }

   @Override
   public void method_3722(class_5051 var1) throws Exception {
      String var4 = var1.<String>method_23248(class_8039.field_41171, 0);
      var4 = class_9330.method_43077(var4);
      if (var4 != null) {
         if (var4.equals("REGISTER") || var4.equals("UNREGISTER")) {
            String[] var6 = new String(var1.<byte[]>method_23242(class_8039.field_41181), StandardCharsets.UTF_8).split("\u0000");
            ArrayList var7 = new ArrayList();

            for (int var8 = 0; var8 < var6.length; var8++) {
               String var9 = class_9330.method_43077(var6[var8]);
               if (var9 == null) {
                  if (!class_3446.method_15884().method_25845() || class_3446.method_15883().method_33731()) {
                     class_3446.method_15886().method_34617().warning("Ignoring plugin channel in incoming REGISTER: " + var6[var8]);
                  }
               } else {
                  var7.add(var9);
               }
            }

            var1.method_23236(class_8039.field_41181, Joiner.on('\u0000').join(var7).getBytes(StandardCharsets.UTF_8));
         }

         var1.method_23257(class_8039.field_41171, 0, var4);
      } else {
         if (!class_3446.method_15884().method_25845() || class_3446.method_15883().method_33731()) {
            class_3446.method_15886().method_34617().warning("Ignoring incoming plugin message with channel: " + var4);
         }

         var1.method_23245();
      }
   }
}
