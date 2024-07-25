package remapped;

import org.lwjgl.opengl.GL11;

public class class_4098 extends class_7038 {
   public class_2440 field_19963 = new class_2440(500, 200, class_4043.field_19620);

   public class_4098(class_7038 var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void method_32178(float var1) {
      GL11.glAlphaFunc(518, 0.1F);
      float var4 = class_5181.method_23766(1.0F - this.field_19963.method_11123(), 0.9, 0.0, 0.9, 0.0);
      float var5 = (float)this.method_32109() * var4 / 2.0F;
      float var6 = (float)(this.method_32137() + 10) * var4 / 2.0F;
      class_73.method_148(
         (float)this.method_32155() + var5,
         (float)this.method_32093() + var6,
         (float)(this.method_32155() + this.method_32109()) - var5,
         (float)(this.method_32093() + this.method_32137()) - var6
      );
      if (var4 != 0.0F) {
         class_73.method_103(
            (float)this.field_36270, (float)this.field_36261, (float)this.field_36278, (float)this.field_36257, class_314.method_1444(-2500135, 0.9F)
         );
      } else {
         class_73.method_108(
            (float)this.field_36270,
            (float)this.field_36261,
            (float)(this.field_36278 - 1),
            (float)(this.field_36257 - 1),
            3.0F,
            class_314.method_1444(-2500135, 0.9F)
         );
      }

      class_3384 var7 = !this.field_36268.equals("Sigma") ? class_3054.field_14988 : class_3054.field_15008;
      if (!this.field_36268.equals("Sigma")) {
         class_73.method_87(
            var7,
            (float)this.field_36270 + (float)(this.method_32109() - var7.method_18547(this.field_36268)) / 2.0F,
            (float)(this.field_36261 + 18),
            this.field_36268,
            -16777216
         );
      } else {
         class_73.method_87(
            var7,
            (float)this.field_36270 + (float)(this.method_32109() - var7.method_18547(this.field_36268)) / 2.0F,
            (float)(this.field_36261 + 10),
            this.field_36268,
            -13619152
         );
      }

      super.method_32178(var1);
      class_73.method_141();
   }
}
