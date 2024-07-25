package remapped;

import com.mojang.datafixers.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class OldHittingModule extends Module {
   public static boolean field_10220 = false;
   private boolean field_10221;

   public OldHittingModule() {
      super(Category.PLAYER, "OldHitting", "Reverts to 1.7/1.8 hitting");
      this.addSetting(new ModeSetting("Animation", "Animation mode", 0, "Vanilla", "Tap", "Tap2", "Slide", "Slide2", "Scale", "Leaked", "Ninja", "Down"));
      this.method_42011(true);
   }

   @EventListen
   @class_315
   @class_3932
   private void method_9353(class_1393 var1) {
      if (this.method_42015() || class_3347.method_15348() == class_412.field_1747) {
         if (var1.method_6449()) {
            boolean var4 = client.thePlayer.method_26446() != null && client.thePlayer.method_26446().method_27960() instanceof class_2235;
            boolean var5 = SigmaMainClass.getInstance().getModuleManager().getModuleByClass(KillauraModule.class).method_42003();
            boolean var6 = true;
            if (!client.thePlayer.method_37252()
               && client.field_9587.method_33990() == class_1430.field_7717
               && !SigmaMainClass.getInstance().getModuleManager().getModuleByClass(KillauraModule.class).method_42003()) {
               class_9529 var7 = (class_9529) client.field_9587;
               class_1331 var8 = var7.method_43955();
               class_6414 var9 = client.theWorld.method_28262(var8).method_8360();
               ArrayList var10 = new ArrayList<class_6414>(
                  Arrays.asList(
                     class_4783.field_23471,
                     class_4783.field_23492,
                     class_4783.field_23739,
                     class_4783.field_23794,
                     class_4783.field_23862,
                     class_4783.field_23883,
                     class_4783.field_23557,
                     class_4783.field_23815,
                     class_4783.field_23796,
                     class_4783.field_23839,
                     class_4783.field_23845,
                     class_4783.field_23304,
                     class_4783.field_23472,
                     class_4783.field_23806,
                     class_4783.field_23698,
                     class_4783.field_23914,
                     class_4783.field_23350,
                     class_4783.field_23166
                  )
               );
               if (var10.contains(var9)
                  || var9 instanceof class_3000
                  || var9 instanceof class_6412
                  || var9 instanceof class_1645
                  || var9 instanceof class_4115 && var9 != class_4783.field_23847) {
                  var6 = false;
               }
            }

            field_10220 = client.gameOptions.keyUse.isKeyDown() && var4 && var6 && var6 || var5;
            if (!field_10220) {
               if (class_1857.field_9416.contains(client.thePlayer)) {
                  class_1857.field_9416.remove(client.thePlayer);
               }
            } else if (!class_1857.field_9416.contains(client.thePlayer)) {
               class_1857.field_9416.add(client.thePlayer);
            }

            if (field_10220 && !this.field_10221) {
               this.field_10221 = !this.field_10221;
               if (!var5) {
                  class_314.method_1396();
               }
            } else if (!field_10220 && this.field_10221) {
               this.field_10221 = !this.field_10221;
            }
         }
      }
   }

   @EventListen
   @class_7664
   @class_3932
   private void method_9364(PacketEvent var1) {
      if (this.method_42015() || class_3347.method_15348() == class_412.field_1747) {
         if (client.thePlayer != null) {
            if (var1.method_557() instanceof class_9014) {
               class_9014 var4 = (class_9014)var1.method_557();
               Iterator var5 = var4.method_41363().iterator();

               while (var5.hasNext()) {
                  Pair var6 = (Pair)var5.next();
                  if (var4.method_41364() == client.thePlayer.method_37145()
                     && var6.getFirst() == class_6943.field_35701
                     && var6.getSecond() != null
                     && ((ItemStack)var6.getSecond()).method_27960() == class_4897.field_24840) {
                     var5.remove();
                  }
               }
            }
         }
      }
   }

   @EventListen
   @class_7664
   @class_3932
   private void method_9357(class_5396 var1) {
      if (this.method_42015() || class_3347.method_15348() == class_412.field_1747) {
         float var4 = var1.method_24563();
         if (var1.method_24570() && var1.method_24567() == class_1736.field_8940 && var1.method_24564().method_27960() instanceof class_8440) {
            var1.method_24565(false);
         } else if (var1.method_24567() != class_1736.field_8940 || !field_10220) {
            if (field_10220 && var1.method_24570()) {
               var1.method_29715(true);
               String var5 = this.getStringValueByName("Animation");
               switch (var5) {
                  case "Vanilla":
                     this.method_9352(0.0F, var4, var1.method_24566());
                     break;
                  case "Tap":
                     this.method_9355(0.0F, var4, var1.method_24566());
                     break;
                  case "Tap2":
                     this.method_9362(0.0F, var4, var1.method_24566());
                     break;
                  case "Slide":
                     this.method_9361(0.0F, var4, var1.method_24566());
                     break;
                  case "Slide2":
                     this.method_9359(0.0F, var4, var1.method_24566());
                     break;
                  case "Scale":
                     this.method_9365(0.0F, var4, var1.method_24566());
                     break;
                  case "Leaked":
                     this.method_9356(0.0F, var4, var1.method_24566());
                     break;
                  case "Ninja":
                     this.method_9363(0.0F, var4, var1.method_24566());
                     break;
                  case "Tomy":
                     this.method_9360(0.0F, var4, var1.method_24566());
                     break;
                  case "Down":
                     this.method_9354(0.0F, var4, var1.method_24566());
               }
            }
         }
      }
   }

   private void method_9358(float var1, float var2, float var3, float var4, class_7966 var5) {
      var5.method_36060(new class_2426(var2, var3, var4).method_11074(var1));
   }

   private void method_9360(float var1, float var2, class_7966 var3) {
      var3.method_36065(0.48F, -0.55F, -0.71999997F);
      var3.method_36065(0.0, (double)(var1 * -0.6F), 0.0);
      this.method_9358(77.0F, 0.0F, 1.0F, 0.0F, var3);
      this.method_9358(-10.0F, 0.0F, 0.0F, 1.0F, var3);
      float var6 = class_9299.method_42818(var2 * var2 * (float) Math.PI);
      float var7 = class_9299.method_42818(class_9299.method_42843(var2) * (float) Math.PI);
      this.method_9358(var6 * -20.0F, 0.0F, 1.0F, 0.0F, var3);
      this.method_9358(var7 * -20.0F, 0.0F, 0.0F, 1.0F, var3);
      this.method_9358(var7 * -69.0F, 1.0F, 0.0F, 0.0F, var3);
      this.method_9358(-80.0F, 1.0F, 0.0F, 0.0F, var3);
      float var8 = 1.2F;
      var3.method_36062(var8, var8, var8);
   }

   private void method_9363(float var1, float var2, class_7966 var3) {
      var3.method_36065(0.48F, -0.39F, -0.71999997F);
      var3.method_36065(0.0, (double)(var1 * -0.6F), 0.0);
      this.method_9358(100.0F, 0.0F, 1.0F, 0.0F, var3);
      this.method_9358(-50.0F, 0.0F, 0.0F, 1.0F, var3);
      float var6 = class_9299.method_42818(var2 * (float) Math.PI);
      float var7 = class_9299.method_42818(var2 * (float) Math.PI);
      this.method_9358(var6 * -10.0F, 0.0F, 1.0F, 0.0F, var3);
      this.method_9358(var7 * -30.0F, 0.0F, 0.0F, 1.0F, var3);
      this.method_9358(var7 * 109.0F, 1.0F, 0.0F, 0.0F, var3);
      this.method_9358(-90.0F, 1.0F, 0.0F, 0.0F, var3);
      float var8 = 1.2F;
      var3.method_36062(var8, var8, var8);
   }

   private void method_9352(float var1, float var2, class_7966 var3) {
      var3.method_36065(0.48F, -0.55F, -0.71999997F);
      var3.method_36065(0.0, (double)(var1 * -0.6F), 0.0);
      this.method_9358(77.0F, 0.0F, 1.0F, 0.0F, var3);
      this.method_9358(-10.0F, 0.0F, 0.0F, 1.0F, var3);
      float var6 = class_9299.method_42818(var2 * var2 * (float) Math.PI);
      float var7 = class_9299.method_42818(class_9299.method_42843(var2) * (float) Math.PI);
      this.method_9358(var6 * -20.0F, 0.0F, 1.0F, 0.0F, var3);
      this.method_9358(var7 * -20.0F, 0.0F, 0.0F, 1.0F, var3);
      this.method_9358(var7 * -69.0F, 1.0F, 0.0F, 0.0F, var3);
      this.method_9358(-80.0F, 1.0F, 0.0F, 0.0F, var3);
      float var8 = 1.2F;
      var3.method_36062(var8, var8, var8);
   }

   private void method_9355(float var1, float var2, class_7966 var3) {
      var3.method_36065(0.0, -3.5, 0.0);
      var3.method_36065(0.56F, -0.52F, -0.72F);
      var3.method_36065(0.56F, -0.22F, -0.71999997F);
      this.method_9358(45.0F, 0.0F, 1.0F, 0.0F, var3);
      float var6 = class_9299.method_42818(class_9299.method_42843(var2) * (float) Math.PI);
      this.method_9358(0.0F, 0.0F, 0.0F, 1.0F, var3);
      this.method_9358(var6 * -9.0F, 1.0F, 0.0F, 0.0F, var3);
      this.method_9358(-9.0F, 0.0F, 0.0F, 1.0F, var3);
      var3.method_36065(0.0, 3.2F, 0.0);
      this.method_9358(-80.0F, 1.0F, 0.0F, 0.0F, var3);
      var3.method_36062(2.7F, 2.7F, 2.7F);
   }

   private void method_9362(float var1, float var2, class_7966 var3) {
      var3.method_36065(0.648F, -0.55F, -0.71999997F);
      var3.method_36065(0.0, (double)(var1 * -0.6F), 0.0);
      this.method_9358(77.0F, 0.0F, 1.0F, 0.0F, var3);
      this.method_9358(-10.0F, 0.0F, 0.0F, 1.0F, var3);
      float var6 = class_9299.method_42818(class_9299.method_42843(var2) * (float) Math.PI);
      this.method_9358(-80.0F, 1.0F, 0.0F, 0.0F, var3);
      this.method_9358(-var6 * 10.0F, 1.0F, -2.0F, 3.0F, var3);
      float var7 = 1.2F;
      var3.method_36062(var7, var7, var7);
   }

   private void method_9361(float var1, float var2, class_7966 var3) {
      var3.method_36065(0.648F, -0.55F, -0.71999997F);
      var3.method_36065(0.0, (double)(var1 * -0.6F), 0.0);
      this.method_9358(77.0F, 0.0F, 1.0F, 0.0F, var3);
      this.method_9358(-10.0F, 0.0F, 0.0F, 1.0F, var3);
      float var6 = class_9299.method_42818(class_9299.method_42843(var2) * (float) Math.PI);
      this.method_9358(-80.0F, 1.0F, 0.0F, 0.0F, var3);
      this.method_9358(-var6 * 20.0F, 1.0F, 0.0F, 0.0F, var3);
      float var7 = 1.2F;
      var3.method_36062(var7, var7, var7);
   }

   private void method_9359(float var1, float var2, class_7966 var3) {
      var3.method_36065(0.48F, -0.55F, -0.71999997F);
      var3.method_36065(0.0, (double)(var1 * -0.6F), 0.0);
      this.method_9358(77.0F, 0.0F, 1.0F, 0.0F, var3);
      this.method_9358(-10.0F, 0.0F, 0.0F, 1.0F, var3);
      float var6 = class_9299.method_42818(var2 * var2 * (float) Math.PI);
      float var7 = class_9299.method_42818(class_9299.method_42843(var2) * (float) Math.PI);
      this.method_9358(var6 * -20.0F, 0.0F, 1.0F, 0.0F, var3);
      this.method_9358(var7 * -20.0F, 0.0F, 0.0F, 1.0F, var3);
      this.method_9358(var7 * -69.0F, 1.0F, 0.0F, 0.0F, var3);
      this.method_9358(-80.0F, 1.0F, 0.0F, 0.0F, var3);
      float var8 = 1.2F;
      var3.method_36062(var8, var8, var8);
   }

   private void method_9365(float var1, float var2, class_7966 var3) {
      var3.method_36065(0.48F, -0.55F, -0.71999997F);
      var3.method_36065(0.0, (double)(var1 * -0.2F), 0.0);
      this.method_9358(77.0F, 0.0F, 1.0F, 0.0F, var3);
      this.method_9358(-10.0F, 0.0F, 0.0F, 1.0F, var3);
      float var6 = class_9299.method_42818(class_9299.method_42843(var2) * (float) Math.PI);
      this.method_9358(-80.0F, 1.0F, 0.0F, 0.0F, var3);
      float var7 = 1.2F - var6 * 0.3F;
      var3.method_36062(var7, var7, var7);
   }

   private void method_9356(float var1, float var2, class_7966 var3) {
      var3.method_36065(0.56, -0.52, -0.72);
      float var6 = class_9299.method_42818(class_9299.method_42843(var2) * (float) Math.PI);
      this.method_9358(77.0F, 0.0F, 1.0F, 0.0F, var3);
      this.method_9358(-10.0F, 0.0F, 0.0F, 1.0F, var3);
      this.method_9358(-80.0F, 1.0F, 0.0F, 0.0F, var3);
      this.method_9358(var6 * 10.0F, -4.0F, -2.0F, 5.0F, var3);
      this.method_9358(var6 * 30.0F, 1.0F, -0.0F, -1.0F, var3);
   }

   private void method_9354(float var1, float var2, class_7966 var3) {
      float var6 = class_9299.method_42818(class_9299.method_42843(var2) * (float) Math.PI);
      var3.method_36065(0.48F, -0.55F, -0.71999997F);
      var3.method_36065(0.0, (double)(var6 * -0.2F), 0.0);
      this.method_9358(77.0F, 0.0F, 1.0F, 0.0F, var3);
      this.method_9358(-10.0F, 0.0F, 0.0F, 1.0F, var3);
      this.method_9358(-80.0F, 1.0F, 0.0F, 0.0F, var3);
      float var7 = 1.2F;
      var3.method_36062(var7, var7, var7);
   }
}
