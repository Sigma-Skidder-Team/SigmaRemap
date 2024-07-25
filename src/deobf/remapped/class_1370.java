package remapped;

import org.lwjgl.opengl.GL11;

public class class_1370 extends Module {
   public static class_4719 field_7448 = class_4719.field_22895;
   public class_3758 field_7447 = class_2565.method_11647(mcInstance.method_8589().field_14810, new class_9633(256));

   public class_1370() {
      super(Category.RENDER, "Shadow", "Draws a line arround entities");
      this.addSetting(new ColorSetting("Color", "The tracers color", class_1255.field_6918.field_6917));
   }

   @EventListen
   private void method_6348(class_3368 var1) {
      if (this.method_42015()) {
         if (mcInstance.field_9632 != null && mcInstance.field_9601 != null) {
            this.method_6345();
            class_73.method_107();
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.method_6347(class_4719.field_22893);
            class_73.method_85(class_3118.field_15504);
            GL11.glLineWidth(1.0F);
            this.method_6343();
            this.method_6347(class_4719.field_22894);
            class_3542.method_16442(518, 0.0F);
            class_3542.method_16374();
            GL11.glColor4f(1.0F, 0.0F, 1.0F, 0.1F);
            GL11.glEnable(3042);
            GL11.glDisable(2896);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            class_73.method_145();
            this.method_6346();
            this.field_7447.method_17415();
         }
      }
   }

   private void method_6343() {
      int var3 = class_314.method_1444(class_1255.field_6918.field_6917, 0.8F);
      mcInstance.field_9601
         .field_568
         .forEach(
            (var2, var3x) -> {
               if (this.method_6344(var3x)) {
                  double var6 = class_9189.method_42353(var3x).field_42648;
                  double var8 = class_9189.method_42353(var3x).field_42646;
                  double var10 = class_9189.method_42353(var3x).field_42649;
                  GL11.glPushMatrix();
                  GL11.glAlphaFunc(519, 0.0F);
                  GL11.glTranslated(var6, var8, var10);
                  GL11.glTranslatef(0.0F, var3x.method_37074(), 0.0F);
                  GL11.glTranslatef(0.0F, 0.1F, 0.0F);
                  GL11.glRotatef(mcInstance.gameRenderer.method_35949().method_41640(), 0.0F, -1.0F, 0.0F);
                  GL11.glScalef(-0.11F, -0.11F, -0.11F);
                  class_73.method_102(
                     -var3x.method_37086() * 22.0F,
                     -var3x.method_37074() * 5.5F,
                     var3x.method_37086() * 44.0F,
                     var3x.method_37074() * 21.0F,
                     class_2209.field_11045,
                     var3,
                     false
                  );
                  class_2209.field_11044.method_38419();
                  GL11.glPopMatrix();
               }
            }
         );
   }

   private void method_6347(class_4719 var1) {
      GL11.glDepthFunc(519);
      field_7448 = var1;
      int var4 = this.method_41993("Color");
      float var5 = (float)(var4 >> 24 & 0xFF) / 255.0F;
      float var6 = (float)(var4 >> 16 & 0xFF) / 255.0F;
      float var7 = (float)(var4 >> 8 & 0xFF) / 255.0F;
      float var8 = (float)(var4 & 0xFF) / 255.0F;
      GL11.glEnable(2896);
      GL11.glLightModelfv(2899, new float[]{var6, var7, var8, var5});
      class_3542.method_16389();
      if (field_7448 == class_4719.field_22894) {
         GL11.glEnable(10754);
         GL11.glLineWidth(2.0F);
         GL11.glPolygonMode(1032, 6913);
         GL11.glDisable(3553);
         GL11.glEnable(3008);
         GL11.glEnable(2896);
      }

      for (Entity var10 : mcInstance.field_9601.method_736()) {
         if (this.method_6344(var10)) {
            GL11.glPushMatrix();
            class_1343 var11 = mcInstance.gameRenderer.method_35949().method_41627();
            double var12 = var11.method_61();
            double var14 = var11.method_60();
            double var16 = var11.method_62();
            class_7966 var18 = new class_7966();
            boolean var19 = mcInstance.field_9577.field_45568;
            class_3542.method_16487();
            class_3542.method_16480(0.0F, 0.0F, 1.0F, 0.5F);
            class_3542.method_16425(class_5033.field_26042, class_8535.field_43697, class_5033.field_26047, class_8535.field_43699);
            class_3542.method_16488();
            mcInstance.field_9577.field_45568 = false;
            int var20 = var10.method_37230();
            boolean var21 = var10.method_37385(0);
            var10.method_37178(0);
            var10.method_37220(0, false);
            this.method_6350(var10, var12, var14, var16, mcInstance.field_9616.field_32600, var18, this.field_7447);
            var10.method_37178(var20);
            var10.method_37220(0, var21);
            mcInstance.field_9577.field_45568 = var19;
            GL11.glPopMatrix();
         }
      }

      this.field_7447.method_17416(RenderLayer.method_16734(class_8359.field_42824));
      this.field_7447.method_17416(RenderLayer.method_16747(class_8359.field_42824));
      this.field_7447.method_17416(RenderLayer.method_16755(class_8359.field_42824));
      this.field_7447.method_17416(RenderLayer.method_16730(class_8359.field_42824));
      this.field_7447.method_17416(RenderLayer.method_16744());
      this.field_7447.method_17415();
      if (field_7448 == class_4719.field_22894) {
         GL11.glPolygonMode(1032, 6914);
         GL11.glDisable(10754);
      }

      field_7448 = class_4719.field_22895;
      GL11.glDepthFunc(515);
   }

   public void method_6350(Entity var1, double var2, double var4, double var6, float var8, class_7966 var9, class_2565 var10) {
      double var13 = class_9299.method_42794((double)var8, var1.field_41754, var1.method_37302());
      double var15 = class_9299.method_42794((double)var8, var1.field_41713, var1.method_37309());
      double var17 = class_9299.method_42794((double)var8, var1.field_41724, var1.method_37156());
      float var19 = class_9299.method_42795(var8, var1.field_41711, var1.field_41701);
      mcInstance.worldRenderer.field_20988.method_28115(var1, var13 - var2, var15 - var4, var17 - var6, var19, var8, var9, var10, 238);
   }

   @EventListen
   public void method_6351(class_5278 var1) {
      if (this.method_42015()) {
         if (field_7448 != class_4719.field_22895) {
            var1.method_24101(false);
         }
      }
   }

   @EventListen
   public void method_6349(class_2563 var1) {
      if (this.method_42015() && field_7448 != class_4719.field_22895 && var1.method_11643() instanceof class_704) {
         var1.method_29715(true);
      }
   }

   private boolean method_6344(Entity var1) {
      if (var1 instanceof class_5834) {
         if (var1 instanceof class_704) {
            if (!(var1 instanceof class_5989)) {
               return !var1.method_37109() ? !SigmaMainClass.method_3328().method_3331().method_20495(var1) : false;
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private void method_6345() {
      GL11.glLineWidth(3.0F);
      GL11.glPointSize(3.0F);
      GL11.glEnable(2832);
      GL11.glEnable(2848);
      GL11.glEnable(3042);
      GL11.glDisable(2896);
      GL11.glEnable(3008);
      GL11.glDisable(3553);
      GL11.glDisable(2903);
      GL11.glDisable(2929);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      mcInstance.gameRenderer.field_40623.method_26122();
   }

   private void method_6346() {
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glDisable(2896);
      GL11.glEnable(3553);
      GL11.glEnable(2903);
      class_3542.method_16420(33986, 240.0F, 240.0F);
      class_9162.method_42212();
      TextureManager var10000 = mcInstance.method_8577();
      mcInstance.method_8577();
      var10000.method_35674(TextureManager.field_40364);
      mcInstance.gameRenderer.field_40623.method_26126();
      GL11.glLightModelfv(2899, new float[]{0.4F, 0.4F, 0.4F, 1.0F});
      field_7448 = class_4719.field_22895;
   }
}
