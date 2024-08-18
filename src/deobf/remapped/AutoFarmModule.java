package remapped;

public class AutoFarmModule extends Module {
   public AutoFarmModule() {
      super(Category.WORLD, "AutoFarm", "Automatically breaks and replants crops");
   }

   @EventListen
   public void method_21418(class_1393 var1) {
      if (this.isEnabled()) {
         if (client.thePlayer != null && client.theWorld != null) {
            for (BlockPos var5 : class_7494.method_34085(class_7494.method_34110(client.playerController.method_42146()))) {
               if (class_7494.method_34116(client.thePlayer, var5)) {
                  class_2522 var6 = client.theWorld.method_28262(var5);
                  if (var6.method_8360() instanceof class_8557 || var6.method_8360() instanceof class_8820 || var6.method_8360() instanceof class_9463) {
                     ItemStack var14 = client.thePlayer.method_26617(Hand.MAIN_HAND);
                     if (var14 != null && var14.method_27960() instanceof class_239) {
                        if (var6.<Integer>method_10313(class_6023.field_30676) != 7) {
                           float[] var18 = class_7494.method_34077(var5, Direction.field_802);
                           var1.method_6441(var18[0]);
                           var1.method_6448(var18[1]);
                           var1.method_6445(new class_113(this, var18));
                           return;
                        }
                     } else if (var6.<Integer>method_10313(class_6023.field_30676) == 7) {
                        float[] var17 = class_7494.method_34077(var5, Direction.field_802);
                        var1.method_6441(var17[0]);
                        var1.method_6448(var17[1]);
                        var1.method_6445(new class_6490(this, var5));
                        client.theWorld.method_7510(var5, false);
                        return;
                     }
                  } else if (!(var6.method_8360() instanceof class_1653)) {
                     if (!(var6.method_8360() instanceof class_9281)) {
                        if (var6.method_8360() instanceof class_6278) {
                           class_2522 var7 = client.theWorld.method_28262(var5.method_6100());
                           class_2522 var8 = client.theWorld.method_28262(var5.method_6081());
                           if (!(var7.method_8360() instanceof class_6278) && var8.method_8360() instanceof class_6278) {
                              float[] var9 = class_7494.method_34076(var5.method_6081());
                              var1.method_6441(var9[0]);
                              var1.method_6448(var9[1]);
                              var1.method_6445(new class_5739(this, var5));
                              client.theWorld.method_7510(var5.method_6081(), false);
                           }
                        }
                     } else {
                        class_2522 var12 = client.theWorld.method_28262(var5.method_6100());
                        class_2522 var15 = client.theWorld.method_28262(var5.method_6081());
                        if (!(var12.method_8360() instanceof class_9281) && var15.method_8360() instanceof class_9281) {
                           float[] var19 = class_7494.method_34076(var5.method_6081());
                           var1.method_6441(var19[0]);
                           var1.method_6448(var19[1]);
                           var1.method_6445(new class_4564(this, var5));
                           client.theWorld.method_7510(var5.method_6081(), false);
                        }
                     }
                  } else if (client.field_9570 == 0) {
                     class_2522 var13 = client.theWorld.method_28262(var5.method_6081());
                     int var16 = class_2740.method_12336(class_4897.field_24621);
                     if (var16 == -1) {
                        var16 = class_2740.method_12336(class_4897.field_25136);
                     }

                     if (var16 == -1) {
                        var16 = class_2740.method_12336(class_4897.field_25273);
                     }

                     if (var16 == -1) {
                        var16 = class_2740.method_12336(class_4897.field_24883);
                     }

                     if (var16 == -1) {
                        var16 = class_2740.method_12336(class_4897.field_24435);
                     }

                     if (var16 == -1) {
                        var16 = class_2740.method_12336(class_4897.field_24480);
                     }

                     if (var16 != -1 && var13.method_8360() instanceof class_3512) {
                        float[] var20 = class_7494.method_34077(var5, Direction.field_817);
                        var1.method_6441(var20[0]);
                        var1.method_6448(var20[1]);
                        var1.method_6445(new class_2146(this, var16, var20));
                        client.field_9570 = 2;
                        class_2522 var11 = class_4783.field_23362.method_29260();
                        client.theWorld.method_29594(var5.method_6081(), var11);
                        return;
                     }
                  }
               }
            }
         }
      }
   }
}
