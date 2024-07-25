package remapped;

import java.util.UUID;

public class class_7610 {
   public static void method_34522(class_757 var0) {
      class_8710 var3 = new class_8710(var0, class_8039.field_41159);
      var3.method_40036(class_2786.field_13614);
      var3.method_40042(class_2786.field_13688);
      var3.method_40040(class_2786.field_13598);
      var3.method_40038(class_2786.field_13612);
      var0.method_19015(class_2786.field_13644, new class_4982());
      var0.method_19015(class_2786.field_13595, new class_6358(var0));
      var0.method_19015(class_2786.field_13652, new class_2551());
      var3.method_40041(class_2786.field_13633, 1010, 2001);
   }

   private static void method_34521(class_5531 var0) {
      class_887 var3 = var0.<class_887>method_25123("id");
      if (var3 != null) {
         String var4 = var3.method_3809();
         if (!var4.equals("minecraft:conduit")) {
            if (var4.equals("minecraft:skull") && var0.method_25123("Owner") instanceof class_5531) {
               class_5531 var5 = var0.<class_5531>method_25126("Owner");
               class_887 var6 = var5.<class_887>method_25126("Id");
               if (var6 != null) {
                  UUID var7 = UUID.fromString(var6.method_3809());
                  var5.<class_7356>method_25122(new class_7356("Id", class_8326.method_38360(var7)));
               }

               class_5531 var12 = new class_5531("SkullOwner");

               for (class_5287 var9 : var5) {
                  var12.<class_5287>method_25122(var9);
               }

               var0.<class_5531>method_25122(var12);
            }
         } else {
            class_5287 var10 = var0.<class_5287>method_25126("target_uuid");
            if (!(var10 instanceof class_887)) {
               return;
            }

            UUID var11 = UUID.fromString((String)var10.method_24129());
            var0.<class_7356>method_25122(new class_7356("Target", class_8326.method_38360(var11)));
         }
      }
   }
}
