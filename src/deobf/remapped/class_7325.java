package remapped;

public class class_7325 {
   public static class_1299 field_37438 = class_3980.method_18363();
   public class_4226 field_37441;
   public int field_37440 = -1;

   public class_7325(class_4226 var1) {
      this.field_37441 = var1;
   }

   public void method_33387(class_7501 var1) {
      if (this.field_37440 == -1) {
         this.field_37440 = field_37438.method_5915(1);
         field_37438.method_5928(this.field_37440, 4864);
         method_33388(var1, this.field_37441);
         field_37438.method_5930();
      }

      field_37438.method_5936(this.field_37440);
      class_9162.method_42217();
   }

   public static void method_33388(class_7501 var0, class_4226 var1) {
      for (int var4 = 0; var4 < var1.method_19684(); var4++) {
         class_384 var5 = var1.method_19676(var4);
         if (var5.method_1873().method_3512()) {
            if (var5.method_1873().method_3510("fill")) {
               var0.method_34203(var5.method_1873().method_3511("fill"));
               var0.method_34166(var1.method_19676(var4).method_1871());
               var0.method_34141(true);
               var0.method_34170(var1.method_19676(var4).method_1871());
               var0.method_34141(false);
            }

            String var6 = var5.method_1873().method_3514("fill");
            if (var1.method_19678(var6) != null) {
               System.out.println("PATTERN");
            }

            if (var1.method_19681(var6) != null) {
               class_1993 var7 = var1.method_19681(var6);
               class_3316 var8 = var1.method_19676(var4).method_1871();
               Object var9 = null;
               if (!var7.method_9248()) {
                  var9 = new class_6969(var8, var1.method_19676(var4).method_1874(), var7);
               } else {
                  var9 = new class_1436(var8, var1.method_19676(var4).method_1874(), var7);
               }

               class_8709.field_44646.method_40021();
               class_7669.method_34748(var8, var7.method_9256(), (class_1084)var9);
            }
         }

         if (var5.method_1873().method_3516() && var5.method_1873().method_3510("stroke")) {
            var0.method_34203(var5.method_1873().method_3511("stroke"));
            var0.method_34196(var5.method_1873().method_3509("stroke-width"));
            var0.method_34141(true);
            var0.method_34170(var1.method_19676(var4).method_1871());
            var0.method_34141(false);
            var0.method_34138();
         }
      }
   }
}
