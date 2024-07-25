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
      super(class_5664.field_28708, "ShulkerInfo", "Shows shulker information");
      this.method_42011(false);
   }

   @class_9148
   private void method_31555(class_1523 var1) {
      this.field_35423 = this.field_35423 - var1.method_6955();
   }

   private int method_31548() {
      int var3 = !(this.field_35423 > 0.0) ? (int)Math.floor(this.field_35423 / 5.0) : (int)Math.ceil(this.field_35423 / 5.0);
      this.field_35423 = 0.0;
      return var3;
   }

   @class_9148
   public void method_31553(class_3368 var1) {
      if (this.method_42015()) {
         class_3542.method_16420(33986, 240.0F, 240.0F);

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
                  double var7 = class_9189.method_42357(var5).field_42648 - mcInstance.gameRenderer.method_35949().method_41627().method_61();
                  double var9 = class_9189.method_42357(var5).field_42646 - mcInstance.gameRenderer.method_35949().method_41627().method_60();
                  double var11 = class_9189.method_42357(var5).field_42649 - mcInstance.gameRenderer.method_35949().method_41627().method_62();
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
                  if (mcInstance.field_9577.field_45559.method_27060()) {
                     mcInstance.field_9577.field_45559.field_30024 = false;
                     ShulkerPeekCommand.method_30370(var6.method_264());
                  }
               }

               GL11.glColor3f(1.0F, 1.0F, 1.0F);
            }
         }

         class_3542.method_16420(33986, 240.0F, 240.0F);
         class_9162.method_42212();
         TextureManager var10000 = mcInstance.method_8577();
         mcInstance.method_8577();
         var10000.method_35674(TextureManager.field_40364);
      }
   }

   public boolean method_31556(class_91 var1) {
      if (mcInstance.field_9632.method_37175(var1) > 5.0F) {
         return false;
      } else {
         float var4 = (float)Math.sqrt(6.0 / class_9189.method_42352(var1));
         float var5 = 10.0F * var4;
         double var6 = var1.method_37302() - mcInstance.field_9632.method_37302();
         double var8 = var1.method_37309() - mcInstance.field_9632.method_37309() - (double) mcInstance.field_9632.method_37074() + 0.4F;
         double var10 = var1.method_37156() - mcInstance.field_9632.method_37156();
         double var12 = (double)class_9299.method_42842(var6 * var6 + var10 * var10);
         float var14 = class_7211.method_33002(mcInstance.field_9632.field_41701, (float)(Math.atan2(var10, var6) * 180.0 / Math.PI) - 90.0F, 360.0F);
         float var15 = class_7211.method_33002(mcInstance.field_9632.field_41755, (float)(-(Math.atan2(var8, var12) * 180.0 / Math.PI)), 360.0F);
         return this.method_31550(mcInstance.field_9632.field_41701, var14) <= var5 && this.method_31550(mcInstance.field_9632.field_41755, var15) <= var5;
      }
   }

   public float method_31550(float var1, float var2) {
      float var5 = Math.abs(var2 - var1) % 360.0F;
      return !(var5 > 180.0F) ? var5 : 360.0F - var5;
   }

   public void method_31552(double var1, double var3, double var5, Entity var7, float var8) {
      class_3384 var11 = class_5320.field_27141;
      String var12 = var7.method_45509().getUnformattedComponentText();
      float var13 = (float)(var1 - mcInstance.gameRenderer.method_35949().method_41627().method_61());
      float var14 = (float)(var3 - mcInstance.gameRenderer.method_35949().method_41627().method_60());
      float var15 = (float)(var5 - mcInstance.gameRenderer.method_35949().method_41627().method_62());
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
      GL11.glRotatef(mcInstance.gameRenderer.method_35949().method_41640(), 0.0F, -1.0F, 0.0F);
      GL11.glRotatef(mcInstance.gameRenderer.method_35949().method_41638(), 1.0F, 0.0F, 0.0F);
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

   @class_9148
   private void method_31551(class_2532 var1) {
      if (this.method_42015()) {
         if (mcInstance.field_9623 instanceof class_2208) {
            class_2208 var4 = (class_2208) mcInstance.field_9623;
            class_7934 var5 = var4.field_10954;
            if (var5 != null
               && var5.method_35884()
               && var5.method_35898().method_27960() instanceof class_6201
               && ((class_6201)var5.method_35898().method_27960()).method_28392() instanceof class_3153) {
               class_6098 var6 = var5.method_35898();
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
               int var13 = (int)(mcInstance.field_9625.method_39835() * (double)class_6763.field_34898 - (double)(9 * (var9 + var10)) - (double)(var11 * 3));
               int var14 = (int)(mcInstance.field_9625.method_39832() * (double)class_6763.field_34898 - 33.0);
               this.method_31549(var13, var14, var7, var6.method_28008().getString(), true);
               GL11.glPopMatrix();
               class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
               class_3542.method_16361();
               class_3542.method_16491();
               class_3542.method_16488();
               class_3542.method_16442(518, 0.1F);
            } else {
               this.field_35424 = -1;
               this.field_35423 = 0.0;
            }
         }
      }
   }

   private void method_31549(int var1, int var2, List<class_6098> var3, String var4, boolean var5) {
      byte var8 = 12;
      int var9 = class_5320.field_27141.method_15654();
      int var10 = Math.round(16.0F * class_73.method_106());
      byte var11 = 1;
      int var12 = (int)Math.ceil((double)((float)var3.size() / 9.0F)) * (var10 + var11) + var8 * 2 + var9;
      int var13 = 9 * (var10 + var11) + var8 * 2;
      class_3542.method_16487();
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
      class_3542.method_16389();

      for (int var14 = 0; var14 < var3.size(); var14++) {
         class_6098 var15 = (class_6098)var3.get(var14);
         int var16 = var2 + var9 + var8 + var14 / 9 * (var10 + var11);
         int var17 = var1 + var8 + var14 % 9 * (var10 + var11);
         class_3542.method_16487();
         if (var14 == this.field_35424 && var5) {
            class_73.method_103((float)var17, (float)var16, (float)var10, (float)var10, class_314.method_1444(class_1255.field_6918.field_6917, 0.15F));
         }

         class_73.method_126(var15, var17, var16, var10, var10);
         if (var15.field_31206 > 1) {
            int var18 = var10 - class_5320.field_27152.method_18547("" + var15.field_31206);
            int var19 = class_5320.field_27152.method_18547("" + var15.field_31206);
            GL11.glAlphaFunc(519, 0.0F);
            class_3542.method_16487();
            class_73.method_102(
               (float)(var17 + var18 - 17 - var19 / 4),
               (float)(var16 + 7),
               (float)(40 + var19),
               40.0F,
               class_2209.field_11045,
               class_314.method_1444(class_1255.field_6918.field_6917, 0.7F),
               false
            );
            class_73.method_87(class_5320.field_27152, (float)(var17 + var18), (float)(var16 + 13), "" + var15.field_31206, class_1255.field_6918.field_6917);
            class_3542.method_16389();
         }

         class_3542.method_16389();
      }

      for (int var23 = 0; var23 < var3.size(); var23++) {
         class_6098 var24 = (class_6098)var3.get(var23);
         int var25 = var2 + var9 + var8 + var23 / 9 * (var10 + var11);
         int var27 = var1 + var8 + var23 % 9 * (var10 + var11);
         if (var23 == this.field_35424 && var5) {
            class_3542.method_16487();
            int var29 = mcInstance.textRenderer.method_45395(var24.method_28008().getUnformattedComponentText());
            List var32 = this.method_31554(var24);

            for (int var20 = 0; var20 < var32.size(); var20++) {
               var29 = Math.max(var29, mcInstance.textRenderer.method_45395((String)var32.get(var20)));
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
               mcInstance.textRenderer
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
            class_3542.method_16389();
         }
      }
   }

   public List<String> method_31554(class_6098 var1) {
      List var4 = var1.method_28012(mcInstance.field_9632, !mcInstance.field_9577.field_45482 ? class_2575.field_12746 : class_2575.field_12747);
      ArrayList var5 = Lists.newArrayList();

      for (ITextComponent var7 : var4) {
         var5.add(var7.getString());
      }

      return var5;
   }

   private List<class_6098> method_31557(class_6098 var1) {
      ArrayList var4 = new ArrayList();
      class_5734 var5 = var1.method_27990();
      if (var5 != null && var5.method_25939("BlockEntityTag", 10)) {
         class_5734 var6 = var5.method_25937("BlockEntityTag");
         ShulkerPeekCommand.method_30371(var6);
         if (var6.method_25939("Items", 9)) {
            class_2831 var7 = class_2831.<class_6098>method_12872(27, class_6098.field_31203);
            class_3037.method_13882(var6, var7);

            for (class_6098 var9 : var7) {
               if (!var9.method_28022()) {
                  boolean var10 = true;

                  for (class_6098 var12 : var4) {
                     if (var9.method_27991(var12) && class_6098.method_27956(var12, var9)) {
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
