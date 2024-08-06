package remapped;

import java.util.ArrayList;
import java.util.List;
import org.lwjgl.opengl.GL11;

public class class_8310 extends class_1859 {
   private class_5376 field_42561;
   private class_5376 field_42564;
   public int field_42562 = 30;
   private class_2440 field_42560 = new class_2440(300, 300);

   public class_8310(class_7038 var1, String var2, int var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10, float var11) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.field_42562 = var7;
      this.method_32148(this.field_42561 = new class_5376(this, 10, "pos1"));
      this.method_32148(this.field_42564 = new class_5376(this, 10, "pos2"));
      this.method_32136((var1x, var2x) -> this.method_8235());
      this.method_38326(var8, var9, var10, var11);
   }

   public float[] method_38325() {
      int var3 = this.field_42562;
      float var4 = (float)(this.field_36278 - var3 * 2);
      float var5 = (float)(this.field_42561.method_32132() - var3) / var4;
      float var6 = 1.0F - (float)(this.field_42561.method_32173() - var3) / var4;
      float var7 = (float)(this.field_42564.method_32132() - var3) / var4;
      float var8 = 1.0F - (float)(this.field_42564.method_32173() - var3) / var4;
      return new float[]{var5, var6, var7, var8};
   }

   public void method_38326(float var1, float var2, float var3, float var4) {
      float var7 = (float)(this.field_36278 - this.field_42562 * 2);
      this.field_42561.method_24510((float)this.field_42562 + var7 * var1, (float)this.field_42562 + var7 * (1.0F - var2));
      this.field_42564.method_24510((float)this.field_42562 + var7 * var3, (float)this.field_42562 + var7 * (1.0F - var4));
   }

   @Override
   public void method_32145(int var1, int var2) {
      super.method_32145(var1, var2);
   }

   @Override
   public void method_32178(float var1) {
      this.field_42560.method_11119(class_4043.field_19620);
      if (this.field_42560.method_11123() == 1.0F) {
         this.field_42560 = new class_2440(1500, 0);
      }

      float[] var4 = this.method_38325();
      int var5 = this.field_42562;
      float var6 = (float)(this.field_36278 - var5 * 2);
      float var7 = var4[0];
      float var8 = var4[1];
      float var9 = var4[2];
      float var10 = var4[3];
      FontManager.method_108(
         (float)(this.field_36270 + var5),
         (float)(this.field_36261 + var5),
         (float)(this.field_36278 - var5 * 2),
         (float)(this.field_36257 - var5 * 2),
         3.0F,
         class_314.method_1444(class_1255.field_6929.field_6917, 0.05F * var1)
      );
      ArrayList var11 = new ArrayList();
      var11.add(new class_9671(0.0, 0.0));
      var11.add(new class_9671((double)var7, (double)var8));
      var11.add(new class_9671((double)var9, (double)var10));
      var11.add(new class_9671(1.0, 1.0));
      class_5181 var12 = new class_5181((double)(1.0F / var6 * 2.0F));
      double var13 = var12.method_23765(var11, Math.min(0.8F, this.field_42560.method_11123()) * 1.25F);
      FontManager.method_121(
         (float)((double)this.field_36270 + (double)var6 * var13 + (double)var5),
         (float)(this.field_36261 - var5 / 2 + this.field_36257),
         14.0F,
         class_314.method_1444(class_1255.field_6925.field_6917, var1)
      );
      List var15 = var12.method_23764(var11);
      GL11.glPushMatrix();
      GL11.glTranslatef((float)(this.field_36270 + var5), (float)(this.field_36261 + var5), 0.0F);
      GL11.glLineWidth(1.0F);
      GL11.glColor4d(0.0, 0.0, 0.0, (double)(0.6F * var1));
      GL11.glAlphaFunc(519, 0.0F);
      RenderSystem.enableBlend();
      RenderSystem.method_16354();
      RenderSystem.blendFuncSeparate(SourceFactor.SRC_ALPHA, DestFactor.field_43697, SourceFactor.ONE, DestFactor.field_43699);
      GL11.glEnable(2848);
      GL11.glBegin(3);
      GL11.glVertex2f(0.0F, var6);

      for (class_9671 var17 : var15) {
         GL11.glVertex2d(var17.method_44726() * (double)var6, (1.0 - var17.method_44727()) * (double)var6);
      }

      GL11.glVertex2f(var6, 0.0F);
      GL11.glEnd();
      GL11.glLineWidth(3.0F);
      GL11.glColor4d(0.0, 0.2F, 0.4F, 0.2F);
      GL11.glBegin(3);
      GL11.glVertex2f(0.0F, var6);
      GL11.glVertex2f((float)(this.field_42561.method_32132() - var5 + 5), (float)(this.field_42561.method_32173() - var5 + 5));
      GL11.glEnd();
      GL11.glBegin(3);
      GL11.glVertex2f(var6, 0.0F);
      GL11.glVertex2f((float)(this.field_42564.method_32132() - var5 + 5), (float)(this.field_42564.method_32173() - var5 + 5));
      GL11.glEnd();
      RenderSystem.disableBlend();
      RenderSystem.method_16432();
      GL11.glPopMatrix();
      super.method_32178(var1);
   }
}
