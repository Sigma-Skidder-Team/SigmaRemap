package remapped;

public class StepModule extends SecondModule {
   public static int field_20352;

   public StepModule() {
      super(Category.MOVEMENT, "Step", "Allows you to step up more than 0.5 block", new VanillaStep(), new NCPStep(), new AACStep(), new SpiderStep());
   }

   @Override
   public void onDisable() {
      super.onDisable();
      client.thePlayer.field_41733 = 0.6F;
   }

   @EventListen
   @class_3932
   private void method_19452(class_8544 var1) {
      if (!(var1.method_39326() < 0.1)) {
         field_20352 = 0;
      }
   }

   @EventListen
   @class_3932
   private void method_19451(class_1393 var1) {
      if (var1.method_6449()) {
         field_20352++;
      }
   }

   public class_1380 method_19450(class_8544 var1) {
      double var4 = client.thePlayer.method_37302() + var1.method_39325().field_7336;
      double var6 = client.thePlayer.method_37156() + var1.method_39325().field_7334;
      double var8 = 0.41;
      double var10 = var1.method_39326() - var1.method_39323();
      class_4092 var12 = new class_4092(
         var4 - var8,
         client.thePlayer.field_41712.field_19937,
         var6 - var8,
         var4 + var8,
         client.thePlayer.field_41712.field_19937 + var10,
         var6 + var8
      );
      Object[] var13 = client.theWorld.method_6680(client.thePlayer, var12).toArray();
      int var14 = var13.length;
      class_2522 var15 = null;
      BlockPos var16 = null;
      double var17 = 0.0;

      for (int var19 = 0; var19 < var14; var19++) {
         class_4190 var20 = (class_4190)var13[var19];
         BlockPos var21 = new BlockPos(
            var20.method_19491(class_9249.field_47215), var20.method_19491(class_9249.field_47216), var20.method_19491(class_9249.field_47219)
         );
         class_2522 var22 = client.theWorld.method_28262(var21);
         if (var15 == null || var20.method_19483().field_19939 > var17) {
            var15 = var22;
            var16 = var21;
            var17 = var20.method_19483().field_19939;
         }
      }

      if (!client.thePlayer.method_37285() && !client.thePlayer.method_37370()) {
         if (var15 != null) {
            if (!client.thePlayer.field_41726) {
               if (var15.method_8360() instanceof class_6344) {
                  class_4190 var24 = var15.method_8334(client.theWorld, var16);
                  if (var24.method_19483().field_19939 == 1.0) {
                     return class_1380.field_7487;
                  }
               }

               if (var15.method_8360() instanceof class_3049) {
                  return class_1380.field_7484;
               }

               return class_1380.field_7487;
            }

            if (var10 != var1.method_39326() && var10 < 0.5) {
               if (!(var15.method_8360() instanceof class_6344)) {
                  if (var15.method_8360() instanceof class_3049) {
                     return class_1380.field_7484;
                  }
               } else {
                  class_4190 var23 = var15.method_8334(client.theWorld, var16);
                  if (var23.method_19483().field_19939 == 1.0) {
                     return class_1380.field_7485;
                  }
               }

               return class_1380.field_7485;
            }
         }

         return class_1380.field_7485;
      } else {
         return class_1380.field_7487;
      }
   }
}
