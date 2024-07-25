package remapped;

public class class_9103 implements class_857 {
   public class_9103(class_3426 var1) {
      this.field_46614 = var1;
   }

   @Override
   public void method_3722(class_5051 var1) throws Exception {
      short var4 = var1.<Short>method_23248(class_8039.field_41175, 0);
      if (var4 == 1) {
         class_5531 var5 = var1.<class_5531>method_23248(class_8039.field_41158, 0);
         if (var5 != null) {
            if (!var5.method_25125("EntityId")) {
               class_5531 var6 = new class_5531("SpawnData");
               var6.<class_887>method_25122(new class_887("id", "AreaEffectCloud"));
               var5.<class_5531>method_25122(var6);
            } else {
               String var9 = (String)var5.<class_5287>method_25123("EntityId").method_24129();
               class_5531 var7 = new class_5531("SpawnData");
               var7.<class_887>method_25122(new class_887("id", var9));
               var5.<class_5531>method_25122(var7);
            }
         }
      }

      if (var4 == 2) {
         class_1756 var8 = class_3446.method_15883().method_33743().<class_1756>method_24490(class_1756.class);
         var8.method_7850(
            var1.method_23255(), var1.<class_9371>method_23248(class_8039.field_41137, 0), var1.<class_5531>method_23248(class_8039.field_41158, 0)
         );
         var1.method_23245();
      }
   }
}
