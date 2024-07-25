package remapped;

import org.lwjgl.opengl.GL11;

public class class_2040 extends class_446 {
   private static String[] field_10342;
   public MinecraftClient field_10344 = MinecraftClient.getInstance();
   public class_4655 field_10343;
   public Timer field_10345 = new Timer();
   public int field_10341;

   public class_2040(class_7038 var1, String var2, int var3, int var4, int var5, int var6, int var7) {
      super(var1, var2, var3, var4, 100, 100, false);
      this.field_10343 = new class_4655(var5, var6);
      this.field_36278 = var5 * var7;
      this.field_36257 = var6 * var7;
      this.field_10341 = var7;
      this.field_10345.method_14776();
   }

   @Override
   public void method_32178(float var1) {
      if (this.field_10345.method_14772() > 70L) {
         this.field_10345.method_14773();
         this.field_10343.method_21537();
      }

      GL11.glPushMatrix();
      GL11.glTranslatef((float)this.field_36270, (float)this.field_36261, 0.0F);
      class_73.method_103(0.0F, 0.0F, (float)this.method_32109(), (float)this.method_32137(), class_1255.field_6929.field_6917);
      class_73.method_139(
         (float)(this.field_10343.method_21529().field_36201 * this.field_10341),
         (float)(this.field_10343.method_21529().field_36203 * this.field_10341),
         (float)this.field_10341,
         (float)this.field_10341,
         5.0F,
         class_1255.field_6922.field_6917
      );

      for (class_7030 var5 : this.field_10343.method_21530().method_21230()) {
         class_73.method_103(
            (float)(var5.field_36201 * this.field_10341),
            (float)(var5.field_36203 * this.field_10341),
            (float)this.field_10341,
            (float)this.field_10341,
            class_1255.field_6918.field_6917
         );
      }

      GL11.glPopMatrix();
      super.method_32178(var1);
   }

   public int method_9558() {
      return this.field_10343.method_21530().method_21230().size();
   }

   @Override
   public void method_29509(int var1) {
      super.method_29509(var1);
      if (var1 != this.field_10344.gameOptions.field_45416.field_30027.field_17800) {
         if (var1 != this.field_10344.gameOptions.field_45434.field_30027.field_17800) {
            if (var1 != this.field_10344.gameOptions.field_45504.field_30027.field_17800) {
               if (var1 == this.field_10344.gameOptions.field_45411.field_30027.field_17800) {
                  this.field_10343.method_21530().method_21229(class_3122.field_15516);
               }
            } else {
               this.field_10343.method_21530().method_21229(class_3122.field_15515);
            }
         } else {
            this.field_10343.method_21530().method_21229(class_3122.field_15514);
         }
      } else {
         this.field_10343.method_21530().method_21229(class_3122.field_15517);
      }
   }
}
