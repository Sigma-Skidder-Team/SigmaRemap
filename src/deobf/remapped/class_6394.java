package remapped;

public class class_6394 {
   private static String[] field_32648;

   public static void method_29195(class_139 var0, class_6590 var1) {
      if (var0.method_557() instanceof class_4267) {
         class_4267 var4 = (class_4267)var0.method_557();
         var1.method_30346(var4.method_19867(), var4.method_19868());
         if (var1 != null) {
            var1.method_30350();
         }

         var1.method_30345(var0.method_557());
         var0.method_29715(true);
      }

      if (var0.method_557() instanceof class_4467) {
         class_4467 var17 = (class_4467)var0.method_557();

         for (int var5 = 0; var5 < var17.field_21787.length; var5++) {
            class_1331 var6 = var17.field_21788.method_31904(var17.field_21787[var5]);
            if (var1.method_30342(var17.field_21786[var5])) {
               var1.method_30346(var6, var17.field_21786[var5]);
            }
         }

         var1.method_30350();
         var1.method_30345(var0.method_557());
         var0.method_29715(true);
      }

      if (var0.method_557() instanceof class_4808 && MinecraftClient.method_8510().field_9601 != null) {
         class_4808 var18 = (class_4808)var0.method_557();

         try {
            while (MinecraftClient.method_8510().method_8614() == null) {
               Thread.sleep(100L);
            }
         } catch (InterruptedException var16) {
         }

         class_546 var19 = var18.method_22144() == null
            ? null
            : new class_546(MinecraftClient.method_8510().method_8614().field_6037.<class_6325>method_28813(class_8669.field_44359), var18.method_22144());
         class_2654 var20 = new class_2654(MinecraftClient.method_8510().field_9601, new class_2034(var18.method_22149(), var18.method_22151()), null);
         var20.method_11984(var19, new class_8248(var18.method_22147().copy()), var18.method_22146(), var18.method_22152());
         if (var20 != null) {
            int var7 = 0;

            for (class_1315 var11 : var20.method_27349()) {
               if (var11 != null && !var11.method_6002()) {
                  for (float var12 = 0.0F; var12 <= 15.0F; var12++) {
                     for (float var13 = 0.0F; var13 <= 15.0F; var13++) {
                        for (float var14 = 0.0F; var14 <= 15.0F; var14++) {
                           class_2522 var15 = var20.method_28262(new class_1331((double)var13, (double)((float)(var7 * 16) + var12), (double)var14));
                           if (var1.method_30342(var15)) {
                              var1.method_30346(
                                 new class_1331(
                                    (double)((float)(var20.method_27352().field_10328 * 16) + var13),
                                    (double)((float)(var7 * 16) + var12),
                                    (double)((float)(var20.method_27352().field_10327 * 16) + var14)
                                 ),
                                 var15
                              );
                           }
                        }
                     }
                  }
               }

               var7++;
            }

            var1.method_30350();
            var1.method_30344(var20);
            if (var20 == null) {
               return;
            }

            class_4808 var21 = new class_4808(var20, var20.method_27356() == null ? '\ufffe' : '\uffff');
            var21.field_24063 = var18.method_22141();
            var21.field_24064 = var18.method_22143();
            var0.method_556(var21);
         }
      }
   }
}
