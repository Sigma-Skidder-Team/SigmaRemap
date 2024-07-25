package remapped;

import org.lwjgl.opengl.GL11;

public class class_6467 extends Module {
   public boolean field_32957 = false;
   public class_3758 field_32955 = class_2565.method_11647(mcInstance.method_8589().field_14810, new class_9633(256));

   public class_6467() {
      super(Category.RENDER, "Fill", "Fill ESP");
      this.addSetting(new ColorSetting("Color", "The tracers color", class_1255.field_6918.field_6917));
   }

   @EventListen
   private void method_29452(class_3368 var1) {
      if (this.method_42015()) {
         if (mcInstance.field_9632 != null && mcInstance.field_9601 != null) {
            this.method_29455();
            this.method_29453();
            this.method_29450();
            this.field_32955.method_17415();
         }
      }
   }

   private void method_29453() {
      this.field_32957 = true;
      int var3 = this.method_41993("Color");
      float var4 = (float)(var3 >> 24 & 0xFF) / 255.0F;
      float var5 = (float)(var3 >> 16 & 0xFF) / 255.0F;
      float var6 = (float)(var3 >> 8 & 0xFF) / 255.0F;
      float var7 = (float)(var3 & 0xFF) / 255.0F;
      GL11.glEnable(2896);
      GL11.glLightModelfv(2899, new float[]{var5, var6, var7, var4});
      class_3542.method_16389();
      GL11.glDepthFunc(519);
      GL11.glEnable(2929);
      GL11.glEnable(32823);
      GL11.glLineWidth(2.0F);
      GL11.glPolygonMode(1032, 6914);
      GL11.glDisable(3553);
      GL11.glEnable(3008);
      GL11.glEnable(2896);
      GL11.glPolygonOffset(-30000.0F, 1.0F);

      for (Entity var9 : mcInstance.field_9601.method_736()) {
         if (this.method_29451(var9)) {
            GL11.glPushMatrix();
            class_1343 var10 = mcInstance.gameRenderer.method_35949().method_41627();
            double var11 = var10.method_61();
            double var13 = var10.method_60();
            double var15 = var10.method_62();
            class_7966 var17 = new class_7966();
            boolean var18 = mcInstance.field_9577.field_45568;
            class_3542.method_16487();
            class_3542.method_16480(0.0F, 0.0F, 1.0F, 0.5F);
            class_3542.method_16425(class_5033.field_26042, class_8535.field_43697, class_5033.field_26047, class_8535.field_43699);
            class_3542.method_16488();
            mcInstance.field_9577.field_45568 = false;
            this.method_29448(var9, var11, var13, var15, mcInstance.field_9616.field_32600, var17, this.field_32955);
            mcInstance.field_9577.field_45568 = var18;
            GL11.glPopMatrix();
         }
      }

      this.field_32955.method_17416(RenderLayer.method_16734(class_8359.field_42824));
      this.field_32955.method_17416(RenderLayer.method_16747(class_8359.field_42824));
      this.field_32955.method_17416(RenderLayer.method_16755(class_8359.field_42824));
      this.field_32955.method_17416(RenderLayer.method_16730(class_8359.field_42824));
      this.field_32955.method_17416(RenderLayer.method_16744());
      this.field_32955.method_17415();
      GL11.glDepthFunc(515);
      GL11.glPolygonMode(1032, 6914);
      GL11.glDisable(32823);
      this.field_32957 = false;
   }

   @EventListen
   public void method_29454(class_2563 var1) {
      if (this.method_42015() && this.field_32957 && var1.method_11643() instanceof class_704) {
         var1.method_29715(true);
      }
   }

   public void method_29448(Entity var1, double var2, double var4, double var6, float var8, class_7966 var9, class_2565 var10) {
      double var13 = class_9299.method_42794((double)var8, var1.field_41754, var1.method_37302());
      double var15 = class_9299.method_42794((double)var8, var1.field_41713, var1.method_37309());
      double var17 = class_9299.method_42794((double)var8, var1.field_41724, var1.method_37156());
      float var19 = class_9299.method_42795(var8, var1.field_41711, var1.field_41701);
      mcInstance.worldRenderer.field_20988.method_28115(var1, var13 - var2, var15 - var4, var17 - var6, var19, var8, var9, var10, 255);
   }

   @EventListen
   public void method_29449(class_5278 var1) {
      if (this.method_42015()) {
         if (this.field_32957) {
            var1.method_24101(false);
         }
      }
   }

   private boolean method_29451(Entity var1) {
      if (var1 instanceof class_5834) {
         if (var1 instanceof class_704) {
            return !(var1 instanceof class_5989) ? !SigmaMainClass.method_3328().method_3331().method_20495(var1) : false;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private void method_29455() {
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

   private void method_29450() {
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
   }
}
