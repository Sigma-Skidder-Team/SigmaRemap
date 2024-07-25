package remapped;

import java.util.List;
import org.lwjgl.opengl.GL11;

public class RearViewModule extends PremiumModule {
   public class_2440 field_48469;
   public static class_4230 field_48470;
   private static final String field_48471 = "Show in GUI";
   private static final String field_48468 = "Smart Visibility";
   private static final String field_48472 = "Size";
   public int field_48467 = 0;

   public RearViewModule() {
      super("RearView", "See behind you", Category.GUI);
      this.field_48469 = new class_2440(230, 200, class_4043.field_19618);
      this.addSetting(new BooleanSetting("Show in GUI", "Makes the Rear View visible in guis", false));
      this.addSetting(new BooleanSetting("Smart Visibility", "Only pops up when a player is behind you", false));
      this.addSetting(new FloatSetting<Integer>("Size", "The rear view width", 400.0F, Integer.class, 120.0F, 1000.0F, 1.0F));
      this.method_42011(false);
   }

   @EventListen
   public void method_43924(class_5596 var1) {
      if (this.method_42015()) {
         if (field_48470 != null
            && (field_48470.field_20526 != client.window.method_43178() || field_48470.field_20534 != client.window.method_43198())) {
            this.onEnable();
         }

         if (this.getBooleanValueByName("Smart Visibility")) {
            List var4 = client.theWorld
               .<class_704>method_25869(
                  class_704.class,
                  client.thePlayer.method_37241().method_18898(14.0),
                  var1x -> var1x.method_37175(client.thePlayer) < 12.0F
                        && !this.method_43929(var1x)
                        && client.thePlayer != var1x
                        && !SigmaMainClass.getInstance().method_3331().method_20495(var1x)
               );
            if (var4.isEmpty()) {
               if (this.field_48467 > 0) {
                  this.field_48467--;
               }
            } else {
               this.field_48467 = 5;
            }
         }
      }
   }

   public boolean method_43929(class_5834 var1) {
      float var4 = class_7211.method_33014(
         var1, client.thePlayer.method_37302(), client.thePlayer.method_37309(), client.thePlayer.method_37156()
      )[0];
      return this.method_43925(client.thePlayer.field_41701, var4) <= 90.0F;
   }

   public float method_43925(float var1, float var2) {
      float var5 = Math.abs(var2 - var1) % 360.0F;
      return !(var5 > 180.0F) ? var5 : 360.0F - var5;
   }

   @EventListen
   public void method_43926(class_3278 var1) {
      if (field_48470 != null) {
         if (this.method_42015()) {
            if (!MinecraftClient.getInstance().gameOptions.hideGUI) {
               if (!this.getBooleanValueByName("Smart Visibility")) {
                  this.field_48469
                     .method_11119(client.field_9623 != null && !this.getBooleanValueByName("Show in GUI") ? class_4043.field_19618 : class_4043.field_19620);
               } else {
                  this.field_48469.method_11119(this.field_48467 <= 0 ? class_4043.field_19618 : class_4043.field_19620);
               }

               float var4 = (float) client.window.method_43166() / (float) client.window.method_43163();
               int var5 = (int)this.getFloatValueByName("Size");
               int var6 = (int)((float)var5 / var4);
               int var7 = 10;
               int var8 = -var7 - var6;
               if (this.field_48469.method_11123() == 0.0F && this.field_48469.method_11123() == 1.0F) {
                  if (this.field_48469.method_11123() == 0.0F) {
                     return;
                  }
               } else if (this.field_48469.method_11128() != class_4043.field_19620) {
                  var8 = (int)((float)var8 * class_5181.method_23766(this.field_48469.method_11123(), 0.49, 0.59, 0.16, 1.04));
               } else {
                  var8 = (int)((float)var8 * class_5181.method_23766(this.field_48469.method_11123(), 0.3, 0.88, 0.47, 1.0));
               }

               class_73.method_128(
                  (float)(client.window.method_43166() - var7 - var5),
                  (float)(client.window.method_43163() + var8),
                  (float)var5,
                  (float)(var6 - 1),
                  14.0F,
                  this.field_48469.method_11123()
               );
               var5 = (int)((float)var5 * GUIManager.field_34898);
               var6 = (int)((float)var6 * GUIManager.field_34898);
               var7 = (int)((float)var7 * GUIManager.field_34898);
               var8 = (int)((float)var8 * GUIManager.field_34898);
               RenderSystem.method_16438();
               this.method_43927(
                  field_48470,
                  var5,
                  var6,
                  (double)(client.window.method_43178() - var7 - var5),
                  (double)(client.window.method_43198() + var8)
               );
               RenderSystem.method_16489();
               RenderSystem.method_16402(256, MinecraftClient.IS_SYSTEM_MAC);
               RenderSystem.method_16463(5889);
               RenderSystem.method_16476();
               RenderSystem.method_16376(
                  0.0,
                  (double) client.window.method_43178() / client.window.method_43189(),
                  (double) client.window.method_43198() / client.window.method_43189(),
                  0.0,
                  1000.0,
                  3000.0
               );
               RenderSystem.method_16463(5888);
               RenderSystem.method_16476();
               RenderSystem.method_16413(0.0F, 0.0F, -2000.0F);
               GL11.glScaled(
                  1.0 / client.window.method_43189() * (double) GUIManager.field_34898,
                  1.0 / client.window.method_43189() * (double) GUIManager.field_34898,
                  1.0
               );
               field_48470.method_19723();
               client.method_8584().method_19717(true);
            }
         }
      }
   }

   public void method_43927(class_4230 var1, int var2, int var3, double var4, double var6) {
      var6 = var6 - (double) client.window.method_43198() + (double)var3;
      RenderSystem.method_16405(true, true, true, false);
      RenderSystem.method_16491();
      RenderSystem.method_16387(false);
      RenderSystem.method_16463(5889);
      RenderSystem.method_16476();
      RenderSystem.method_16376(0.0, (double)var2 + var4, (double)var3, 0.0, 1000.0, 3000.0);
      RenderSystem.method_16463(5888);
      RenderSystem.method_16476();
      RenderSystem.method_16413(0.0F, 0.0F, -2000.0F);
      RenderSystem.method_16392(0, 0, var2 + (int)var4, var3 - (int)var6);
      RenderSystem.method_16432();
      RenderSystem.method_16487();
      RenderSystem.method_16458();
      RenderSystem.disableBlend();
      RenderSystem.method_16481();
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      var1.method_19715();
      float var10 = (float)var2;
      float var11 = (float)var3;
      float var12 = (float)var1.field_20526 / (float)var1.field_20533;
      float var13 = (float)var1.field_20534 / (float)var1.field_20535;
      class_8042 var14 = RenderSystem.method_16373();
      class_9633 var15 = var14.method_36501();
      var15.method_44471(7, class_7985.field_40905);
      var15.method_35761(var4, (double)var11 + var6, 0.0).method_35745(0.0F, 0.0F).method_35743(255, 255, 255, 255).method_35735();
      var15.method_35761((double)var10 + var4, (double)var11 + var6, 0.0).method_35745(var12, 0.0F).method_35743(255, 255, 255, 255).method_35735();
      var15.method_35761((double)var10 + var4, var6, 0.0).method_35745(var12, var13).method_35743(255, 255, 255, 255).method_35735();
      var15.method_35761(var4, var6, 0.0).method_35745(0.0F, var13).method_35743(255, 255, 255, 255).method_35735();
      var14.method_36500();
      var1.method_19719();
      RenderSystem.method_16387(true);
      RenderSystem.method_16405(true, true, true, true);
   }

   @EventListen
   public void method_43928(class_1711 var1) {
      if (this.method_42015()) {
         if (field_48470 != null) {
            if (client.field_9623 == null || this.getBooleanValueByName("Show in GUI") || this.field_48467 != 0) {
               class_73.method_127();
               RenderSystem.method_16438();
               RenderSystem.method_16402(16640, false);
               field_48470.method_19717(true);
               RenderSystem.method_16432();
               RenderSystem.method_16481();
               int var4 = client.gameOptions.field_45439;
               int var5 = Math.min(MinecraftClient.method_8501(), var4);
               var5 = Math.max(var5, 60);
               long var6 = Util.getMeasuringTimeNano() - var1.field_8849;
               float var8 = client.thePlayer.field_41701;
               client.thePlayer.field_41701 += 180.0F;
               RenderSystem.enableDepthTest();
               GL11.glAlphaFunc(519, 0.0F);
               double var9 = client.gameOptions.field_45543;
               client.gameOptions.field_45543 = 114.0;
               client.gameRenderer.field_40627 = false;
               SigmaMainClass.field_3951 = true;
               class_4230 var11 = client.worldRenderer.field_21000;
               client.worldRenderer.field_21000 = null;
               client.gameRenderer.method_35950(var1.field_8848, Util.getMeasuringTimeNano(), new class_7966());
               client.worldRenderer.field_21000 = var11;
               SigmaMainClass.field_3951 = false;
               client.gameRenderer.field_40627 = true;
               client.gameOptions.field_45543 = var9;
               client.thePlayer.field_41701 = var8;
               RenderSystem.method_16489();
               client.method_8584().method_19717(true);
            }
         } else {
            this.onEnable();
         }
      }
   }

   @Override
   public void onEnable() {
      class_73.method_95(client.method_8584());
      field_48470 = new class_4230(client.window.method_43178(), client.window.method_43198(), true, MinecraftClient.IS_SYSTEM_MAC);
      field_48470.method_19709(1.0F, 1.0F, 1.0F, 1.0F);
   }

   @Override
   public void onDisable() {
      this.field_48469.method_11119(class_4043.field_19618);
   }
}
