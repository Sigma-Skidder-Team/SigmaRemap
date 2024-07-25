package remapped;

import org.lwjgl.opengl.GL11;

public class class_5228 extends class_1859 {
   private static String[] field_26824;
   public class_2440 field_26823 = new class_2440(300, 300, class_4043.field_19618);
   public class_8343 field_26822;

   public class_5228(class_7038 var1, String var2, int var3, int var4, int var5, int var6, class_8343 var7) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.field_26822 = var7;
   }

   @Override
   public void method_32145(int var1, int var2) {
      super.method_32145(var1, var2);
      if (this.method_32183() && (double)this.field_26823.method_11123() < 0.1) {
         this.field_26823.method_11119(class_4043.field_19620);
      } else if (!this.method_32183() && this.field_26823.method_11123() == 1.0F) {
         this.field_26823.method_11119(class_4043.field_19618);
      }
   }

   @Override
   public void method_32178(float var1) {
      float var4 = class_5181.method_23766(this.field_26823.method_11123(), 0.68, 2.32, 0.06, 0.48);
      if (this.field_26823.method_11128() == class_4043.field_19618) {
         var4 = class_5181.method_23766(this.field_26823.method_11123(), 0.81, 0.38, 0.32, -1.53);
      }

      this.method_32124((int)(-25.0F * var4));
      this.method_32130();
      class_73.method_96((float)(this.field_36270 + 20), (float)this.field_36261, 100.0F, 100.0F, this.field_26822);
      int var5 = this.field_36270 + 12 - (class_3054.field_14994.method_18547(this.field_36268) - this.field_36278) / 2;
      int var6 = this.field_36261 + 102;
      GL11.glAlphaFunc(516, 0.1F);
      class_73.method_87(
         class_3054.field_14994, (float)var5, (float)(var6 + 1), this.field_36268, class_314.method_1444(class_1255.field_6929.field_6917, 0.5F)
      );
      class_73.method_87(class_3054.field_14994, (float)var5, (float)var6, this.field_36268, class_1255.field_6918.field_6917);
      GL11.glAlphaFunc(519, 0.0F);
      super.method_32182(var1);
   }
}
