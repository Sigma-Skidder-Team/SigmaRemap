package remapped;

import com.google.common.base.Joiner;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Optional;

public class class_4755 implements class_857 {
   public class_4755(class_5597 var1) {
      this.field_23028 = var1;
   }

   @Override
   public void method_3722(class_5051 var1) throws Exception {
      String var4 = var1.<String>method_23248(class_8039.field_41171, 0);
      if (!var4.equalsIgnoreCase("MC|StopSound")) {
         if (!var4.equalsIgnoreCase("MC|TrList")) {
            var4 = class_9330.method_43075(var4);
            if (var4 == null) {
               if (!class_3446.method_15884().method_25845() || class_3446.method_15883().method_33731()) {
                  class_3446.method_15886().method_34617().warning("Ignoring outgoing plugin message with channel: " + var4);
               }

               var1.method_23245();
               return;
            }

            if (var4.equals("minecraft:register") || var4.equals("minecraft:unregister")) {
               String[] var14 = new String(var1.<byte[]>method_23242(class_8039.field_41181), StandardCharsets.UTF_8).split("\u0000");
               ArrayList var16 = new ArrayList();

               for (int var18 = 0; var18 < var14.length; var18++) {
                  String var9 = class_9330.method_43075(var14[var18]);
                  if (var9 == null) {
                     if (!class_3446.method_15884().method_25845() || class_3446.method_15883().method_33731()) {
                        class_3446.method_15886().method_34617().warning("Ignoring plugin channel in outgoing REGISTER: " + var14[var18]);
                     }
                  } else {
                     var16.add(var9);
                  }
               }

               if (var16.isEmpty()) {
                  var1.method_23245();
                  return;
               }

               var1.method_23236(class_8039.field_41181, Joiner.on('\u0000').join(var16).getBytes(StandardCharsets.UTF_8));
            }
         } else {
            var4 = "minecraft:trader_list";
            var1.<Integer>method_23261(class_8039.field_41179);
            short var13 = var1.<Short>method_23261(class_8039.field_41175);

            for (int var15 = 0; var15 < var13; var15++) {
               class_9530 var17 = var1.<class_9530>method_23242(class_8039.field_41149);
               class_9330.method_43074(var17);
               var1.method_23236(class_8039.field_41184, var17);
               class_9530 var19 = var1.<class_9530>method_23242(class_8039.field_41149);
               class_9330.method_43074(var19);
               var1.method_23236(class_8039.field_41184, var19);
               boolean var20 = var1.<Boolean>method_23261(class_8039.field_41161);
               if (var20) {
                  class_9530 var10 = var1.<class_9530>method_23242(class_8039.field_41149);
                  class_9330.method_43074(var10);
                  var1.method_23236(class_8039.field_41184, var10);
               }

               var1.<Boolean>method_23261(class_8039.field_41161);
               var1.<Integer>method_23261(class_8039.field_41179);
               var1.<Integer>method_23261(class_8039.field_41179);
            }
         }

         var1.method_23257(class_8039.field_41171, 0, var4);
      } else {
         String var5 = var1.<String>method_23242(class_8039.field_41171);
         String var6 = var1.<String>method_23242(class_8039.field_41171);
         var1.method_23240();
         var1.method_23253(76);
         byte var7 = 0;
         var1.method_23236(class_8039.field_41133, var7);
         if (!var5.isEmpty()) {
            var7 = (byte)(var7 | 1);
            Optional var8 = class_1375.method_6358(var5);
            if (!var8.isPresent()) {
               if (!class_3446.method_15884().method_25845() || class_3446.method_15883().method_33731()) {
                  class_3446.method_15886().method_34617().info("Could not handle unknown sound source " + var5 + " falling back to default: master");
               }

               var8 = Optional.<class_1375>of(class_1375.field_7467);
            }

            var1.method_23236(class_8039.field_41157, ((class_1375)var8.get()).method_6359());
         }

         if (!var6.isEmpty()) {
            var7 = (byte)(var7 | 2);
            var1.method_23236(class_8039.field_41171, var6);
         }

         var1.method_23257(class_8039.field_41133, 0, var7);
      }
   }
}
