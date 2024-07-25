package remapped;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.util.text.ITextComponent;
import org.lwjgl.opengl.GL11;

public class ShulkerInfoModule extends Module {
   public int field_35424 = -1;
   public double field_35423;

   public ShulkerInfoModule() {
      super(Category.GUI, "ShulkerInfo", "Shows shulker information");
      this.method_42011(false);
   }

   @EventListen
   private void method_31555(class_1523 var1) {
      this.field_35423 = this.field_35423 - var1.method_6955();
   }

   private int method_31548() {
      int var3 = !(this.field_35423 > 0.0) ? (int)Math.floor(this.field_35423 / 5.0) : (int)Math.ceil(this.field_35423 / 5.0);
      this.field_35423 = 0.0;
      return var3;
   }

   @EventListen
   public void method_31553(class_3368 var1) {
      if (this.method_42015()) {
         RenderSystem.method_16420(33986, 240.0F, 240.0F);

         for (Entity var5 : class_314.method_1440()) {
            if (var5 instanceof class_91) {
               class_91 var6 = (class_91)var5;
               if (!(var6.method_264().method_27960() instanceof class_6201)
                  || !(((class_6201)var6.method_264().method_27960()).method_28392() instanceof class_3153)) {
                  return;
               }

               this.method_31552(
                  class_9189.method_42357(var5).field_42648,
                  class_9189.method_42357(var5).field_42646 + (double)var5.method_37074(),
                  class_9189.method_42357(var5).field_42649,
                  var5,
                  0.8F
               );
               if (this.method_31556(var6)) {
                  double var7 = class_9189.method_42357(var5).field_42648 - client.gameRenderer.method_35949().method_41627().method_61();
                  double var9 = class_9189.method_42357(var5).field_42646 - client.gameRenderer.method_35949().method_41627().method_60();
                  double var11 = class_9189.method_42357(var5).field_42649 - client.gameRenderer.method_35949().method_41627().method_62();
                  float var13 = 0.3F;
                  GL11.glEnable(3042);
                  GL11.glAlphaFunc(516, 0.0F);
                  GL11.glEnable(2848);
                  class_73.method_83(
                     new class_8194(
                        var7 - (double)var13, var9 + 0.01F, var11 - (double)var13, var7 + (double)var13, var9 + (double)(var13 * 2.0F), var11 + (double)var13
                     ),
                     class_314.method_1444(class_1255.field_6929.field_6917, 0.1F)
                  );
                  class_73.method_130(
                     new class_8194(
                        var7 - (double)var13, var9 + 0.01F, var11 - (double)var13, var7 + (double)var13, var9 + (double)(var13 * 2.0F), var11 + (double)var13
                     ),
                     3.0F,
                     class_314.method_1444(class_1255.field_6929.field_6917, 0.3F)
                  );
                  GL11.glDisable(3042);
                  if (client.gameOptions.keyUse.isKeyDown()) {
                     client.gameOptions.keyUse.pressed = false;
                     ShulkerPeekCommand.method_30370(var6.method_264());
                  }
               }

               GL11.glColor3f(1.0F, 1.0F, 1.0F);
            }
         }

         RenderSystem.method_16420(33986, 240.0F, 240.0F);
         class_9162.method_42212();
         TextureManager var10000 = client.getTextureManager();
         client.getTextureManager();
         var10000.bindTexture(TextureManager.field_40364);
      }
   }

   public boolean method_31556(class_91 var1) {
      if (client.thePlayer.method_37175(var1) > 5.0F) {
         return false;
      } else {
         float var4 = (float)Math.sqrt(6.0 / class_9189.method_42352(var1));
         float var5 = 10.0F * var4;
         double var6 = var1.method_37302() - client.thePlayer.method_37302();
         double var8 = var1.method_37309() - client.thePlayer.method_37309() - (double) client.thePlayer.method_37074() + 0.4F;
         double var10 = var1.method_37156() - client.thePlayer.method_37156();
         double var12 = (double)class_9299.method_42842(var6 * var6 + var10 * var10);
         float var14 = class_7211.method_33002(client.thePlayer.rotationYaw, (float)(Math.atan2(var10, var6) * 180.0 / Math.PI) - 90.0F, 360.0F);
         float var15 = class_7211.method_33002(client.thePlayer.rotationPitch, (float)(-(Math.atan2(var8, var12) * 180.0 / Math.PI)), 360.0F);
         return this.method_31550(client.thePlayer.rotationYaw, var14) <= var5 && this.method_31550(client.thePlayer.rotationPitch, var15) <= var5;
      }
   }

   public float method_31550(float var1, float var2) {
      float var5 = Math.abs(var2 - var1) % 360.0F;
      return !(var5 > 180.0F) ? var5 : 360.0F - var5;
   }

   public void method_31552(double var1, double var3, double var5, Entity var7, float var8) {
      class_3384 var11 = class_5320.field_27141;
      String var12 = var7.method_45509().getUnformattedComponentText();
      float var13 = (float)(var1 - client.gameRenderer.method_35949().method_41627().method_61());
      float var14 = (float)(var3 - client.gameRenderer.method_35949().method_41627().method_60());
      float var15 = (float)(var5 - client.gameRenderer.method_35949().method_41627().method_62());
      GL11.glBlendFunc(770, 771);
      GL11.glEnable(3042);
      GL11.glEnable(2848);
      GL11.glDisable(3553);
      GL11.glDisable(2929);
      GL11.glDisable(2896);
      GL11.glDepthMask(false);
      GL11.glPushMatrix();
      GL11.glAlphaFunc(519, 0.0F);
      GL11.glTranslated((double)var13, (double)(var14 + 0.6F - 0.33333334F * (1.0F - var8)), (double)var15);
      GL11.glRotatef(client.gameRenderer.method_35949().method_41640(), 0.0F, -1.0F, 0.0F);
      GL11.glRotatef(client.gameRenderer.method_35949().method_41638(), 1.0F, 0.0F, 0.0F);
      GL11.glScalef(-0.009F * var8, -0.009F * var8, -0.009F * var8);
      GL11.glTranslated((double)(-var11.method_18547(var12) / 2), 0.0, 0.0);
      List var16 = this.method_31557(((class_91)var7).method_264());
      this.method_31549(-87, -70, var16, ((class_91)var7).method_264().method_28008().getString(), false);
      GL11.glPopMatrix();
      GL11.glEnable(2929);
      GL11.glEnable(2896);
      GL11.glDisable(2848);
      GL11.glDepthMask(true);
      GL11.glDisable(3042);
   }

   @EventListen
   private void method_31551(class_2532 var1) {
      if (this.method_42015()) {
         if (client.field_9623 instanceof class_2208) {
            class_2208 var4 = (class_2208) client.field_9623;
            class_7934 var5 = var4.field_10954;
            if (var5 != null
               && var5.method_35884()
               && var5.method_35898().method_27960() instanceof class_6201
               && ((class_6201)var5.method_35898().method_27960()).method_28392() instanceof class_3153) {
               ItemStack var6 = var5.method_35898();
               List var7 = this.method_31557(var6);
               int var8 = Math.max(-1, Math.min(1, this.method_31548()));
               if (var8 != 0 || this.field_35424 != -1) {
                  this.field_35424 = Math.max(0, Math.min(var7.size() - 1, this.field_35424 - var8));
               }

               GL11.glPushMatrix();
               GL11.glTranslatef(0.0F, 0.0F, 1000.0F);
               GL11.glScalef(1.0F / class_73.method_106(), 1.0F / class_73.method_106(), 0.0F);
               int var9 = Math.round(16.0F * class_73.method_106());
               byte var10 = 1;
               byte var11 = 12;
               int var12 = class_5320.field_27141.method_15654();
               int var13 = (int)(client.field_9625.method_39835() * (double) GUIManager.field_34898 - (double)(9 * (var9 + var10)) - (double)(var11 * 3));
               int var14 = (int)(client.field_9625.method_39832() * (double) GUIManager.field_34898 - 33.0);
               this.method_31549(var13, var14, var7, var6.method_28008().getString(), true);
               GL11.glPopMatrix();
               RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
               RenderSystem.method_16361();
               RenderSystem.method_16491();
               RenderSystem.enableBlend();
               RenderSystem.method_16442(518, 0.1F);
            } else {
               this.field_35424 = -1;
               this.field_35423 = 0.0;
            }
         }
      }
   }

   private void method_31549(int var1, int var2, List<ItemStack> var3, String var4, boolean var5) {
      byte var8 = 12;
      int var9 = class_5320.field_27141.method_15654();
      int var10 = Math.round(16.0F * class_73.method_106());
      byte var11 = 1;
      int var12 = (int)Math.ceil((double)((float)var3.size() / 9.0F)) * (var10 + var11) + var8 * 2 + var9;
      int var13 = 9 * (var10 + var11) + var8 * 2;
      RenderSystem.method_16487();
      GL11.glAlphaFunc(519, 0.0F);
      if (!var5) {
         class_73.method_103(
            (float)var1,
            (float)var2,
            (float)var13,
            (float)var12,
            class_314.method_1444(class_314.method_1442(class_1255.field_6918.field_6917, class_1255.field_6929.field_6917, 75.0F), 0.7F)
         );
         class_73.method_128((float)var1, (float)var2, (float)var13, (float)var12, 10.0F, 0.5F);
      } else {
         class_73.method_120(var1, var2, var13, var12, class_314.method_1444(class_1255.field_6929.field_6917, 0.94F));
      }

      class_73.method_87(
         class_5320.field_27141, (float)(var1 + var8), (float)(var2 + var8 - 3), var4, class_314.method_1444(class_1255.field_6918.field_6917, 0.8F)
      );
      RenderSystem.method_16389();

      for (int var14 = 0; var14 < var3.size(); var14++) {
         ItemStack var15 = (ItemStack)var3.get(var14);
         int var16 = var2 + var9 + var8 + var14 / 9 * (var10 + var11);
         int var17 = var1 + var8 + var14 % 9 * (var10 + var11);
         RenderSystem.method_16487();
         if (var14 == this.field_35424 && var5) {
            class_73.method_103((float)var17, (float)var16, (float)var10, (float)var10, class_314.method_1444(class_1255.field_6918.field_6917, 0.15F));
         }

         class_73.method_126(var15, var17, var16, var10, var10);
         if (var15.field_31206 > 1) {
            int var18 = var10 - class_5320.field_27152.method_18547("" + var15.field_31206);
            int var19 = class_5320.field_27152.method_18547("" + var15.field_31206);
            GL11.glAlphaFunc(519, 0.0F);
            RenderSystem.method_16487();
            class_73.method_102(
               (float)(var17 + var18 - 17 - var19 / 4),
               (float)(var16 + 7),
               (float)(40 + var19),
               40.0F,
               NotificationIcons.field_11045,
               class_314.method_1444(class_1255.field_6918.field_6917, 0.7F),
               false
            );
            class_73.method_87(class_5320.field_27152, (float)(var17 + var18), (float)(var16 + 13), "" + var15.field_31206, class_1255.field_6918.field_6917);
            RenderSystem.method_16389();
         }

         RenderSystem.method_16389();
      }

      for (int var23 = 0; var23 < var3.size(); var23++) {
         ItemStack var24 = (ItemStack)var3.get(var23);
         int var25 = var2 + var9 + var8 + var23 / 9 * (var10 + var11);
         int var27 = var1 + var8 + var23 % 9 * (var10 + var11);
         if (var23 == this.field_35424 && var5) {
            RenderSystem.method_16487();
            int var29 = client.textRenderer.method_45395(var24.method_28008().getUnformattedComponentText());
            List var32 = this.method_31554(var24);

            for (int var20 = 0; var20 < var32.size(); var20++) {
               var29 = Math.max(var29, client.textRenderer.method_45395((String)var32.get(var20)));
            }

            var29 = (int)((float)var29 * class_73.method_106());
            int var33 = var32.size();
            class_73.method_103(
               (float)var27,
               (float)(var25 + var10),
               (float)var29 + 9.0F * class_73.method_106(),
               10.0F * class_73.method_106() * (float)var33 + 7.0F * class_73.method_106(),
               class_314.method_1444(class_1255.field_6929.field_6917, 0.8F)
            );
            GL11.glPushMatrix();
            GL11.glScalef(class_73.method_106(), class_73.method_106(), 0.0F);
            var25 = (int)((float)var25 * (1.0F / class_73.method_106()));
            var27 = (int)((float)var27 * (1.0F / class_73.method_106()));
            var10 = (int)((float)var10 * (1.0F / class_73.method_106()));
            var29 = (int)((float)var29 * (1.0F / class_73.method_106()));

            for (int var21 = 0; var21 < var32.size(); var21++) {
               String var22 = (String)var32.get(var21);
               client.textRenderer
                  .method_45410(
                     var22,
                     (float)(var27 + 5),
                     5.3F + (float)var25 + (float)var10 + (float)(var21 * 10),
                     class_1255.field_6918.field_6917,
                     new class_7966().method_36058().method_28620(),
                     false,
                     false
                  );
            }

            GL11.glPopMatrix();
            RenderSystem.method_16389();
         }
      }
   }

   public List<String> method_31554(ItemStack var1) {
      List var4 = var1.method_28012(client.thePlayer, !client.gameOptions.field_45482 ? class_2575.field_12746 : class_2575.field_12747);
      ArrayList var5 = Lists.newArrayList();

      for (ITextComponent var7 : var4) {
         var5.add(var7.getString());
      }

      return var5;
   }

   private List<ItemStack> method_31557(ItemStack var1) {
      ArrayList var4 = new ArrayList();
      CompoundNBT var5 = var1.method_27990();
      if (var5 != null && var5.contains("BlockEntityTag", 10)) {
         CompoundNBT var6 = var5.getCompound("BlockEntityTag");
         ShulkerPeekCommand.method_30371(var6);
         if (var6.contains("Items", 9)) {
            class_2831 var7 = class_2831.<ItemStack>method_12872(27, ItemStack.EMPTY);
            class_3037.method_13882(var6, var7);

            for (ItemStack var9 : var7) {
               if (!var9.method_28022()) {
                  boolean var10 = true;

                  for (ItemStack var12 : var4) {
                     if (var9.method_27991(var12) && ItemStack.method_27956(var12, var9)) {
                        var12.method_28017(var9.method_27997() + var12.method_27997());
                        var10 = false;
                     }
                  }

                  if (var10) {
                     var4.add(var9);
                  }
               }
            }
         }
      }

      return var4;
   }
}
