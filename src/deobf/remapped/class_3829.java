package remapped;

import org.lwjgl.opengl.GL11;

public class class_3829 extends class_2596 {
   private float field_18710 = 0.0F;
   private int field_18707 = 0;
   private int field_18706 = 0;
   private boolean field_18709 = true;

   public class_3829() {
      super("Credits");
      this.method_32105(false);
   }

   @Override
   public void method_32178(float var1) {
      super.method_32178(var1);
      int var4 = NotificationIcons.field_11023.method_38415();
      int var5 = NotificationIcons.field_11023.method_38421();
      var4 = Math.min(var4, (int)((float) MinecraftClient.getInstance().window.method_43163() / 1.65F));
      var5 = Math.min(var5, (int)((float) MinecraftClient.getInstance().window.method_43163() / 1.65F));
      this.method_17806();
      class_73.method_94(
         0.0F, 0.0F, (float)this.method_32109(), (float)this.method_32137(), class_314.method_1444(class_1255.field_6918.field_6917, 0.9F * this.field_18710)
      );
      float var6 = class_9556.method_44073(!((double)this.field_18710 < 0.5) ? (float)((double)this.field_18710 - 0.5) * 2.0F : 0.0F, 0.0F, 1.0F, 1.0F);
      GL11.glPushMatrix();
      GL11.glTranslatef((float)(this.method_32109() / 2), (float)(this.method_32137() / 2), 0.0F);
      GL11.glScaled((double)var6, (double)var6, 0.0);
      GL11.glTranslatef((float)(-this.method_32109() / 2), (float)(-this.method_32137() / 2), 0.0F);
      String var7 = "##Jello \n";
      String var8 = "Jello by MF";
      class_3384 var9 = class_5320.field_27141;
      class_73.method_87(
         var9, (float)((this.method_32109() - var9.method_18547(var8)) / 2), (float)(this.method_32137() - 110), var8, class_1255.field_6929.field_6917
      );
      GL11.glPopMatrix();
      class_73.method_99(
         (float)(this.method_32109() / 2) - ((float)var4 - (float)var4 * (this.field_18710 - 1.0F) * this.field_18710) / 2.0F,
         (float)(
            (double)(Math.max((float)var5 * 1.2F, (float)(this.method_32137() / 2)) - (float)var5)
               - (double)var5
                  * Math.sin((double)(this.field_18710 * this.field_18710) * Math.PI)
                  * Math.sin((double)(this.field_18710 * this.field_18710) * Math.PI)
         ),
         (float)var4 - (float)var4 * (this.field_18710 - 1.0F) * this.field_18710,
         (float)var5 - (float)var5 * (this.field_18710 - 1.0F) * this.field_18710,
         NotificationIcons.field_11023,
         class_314.method_1444(class_1255.field_6918.field_6917, Math.min(1.0F, this.field_18710))
      );
      if (!((double)this.field_18710 < 0.986)) {
         this.field_18710 = 1.0F;
      } else {
         this.field_18710 = (float)Math.max(
            0.0,
            Math.min(
               1.0,
               (double)this.field_18710
                  + 0.05 * (double)(30.0F / (float) MinecraftClient.method_8501())
                  - (double)(this.field_18710 * 0.04F * (30.0F / (float) MinecraftClient.method_8501()))
            )
         );
      }
   }

   private void method_17806() {
      int var3 = this.method_32189() * -1;
      float var4 = (float)this.method_32129() / (float)this.method_32109() * -114.0F;
      if (this.field_18709) {
         this.field_18707 = (int)var4;
         this.field_18706 = var3;
         this.field_18709 = false;
      }

      float var5 = var4 - (float)this.field_18707;
      float var6 = (float)(var3 - this.field_18706);
      class_73.method_96(
         (float)this.field_18706, (float)this.field_18707, (float)(this.method_32109() * 2), (float)(this.method_32137() + 114), NotificationIcons.field_11005
      );
      float var7 = 0.5F;
      if (var4 != (float)this.field_18707) {
         this.field_18707 = (int)((float)this.field_18707 + var5 * var7);
      }

      if (var3 != this.field_18706) {
         this.field_18706 = (int)((float)this.field_18706 + var6 * var7);
      }
   }

   @Override
   public void method_29509(int var1) {
      super.method_29509(var1);
      if (var1 == 256) {
         MinecraftClient.getInstance().method_8609(new class_1876());
      }
   }
}
