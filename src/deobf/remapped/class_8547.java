package remapped;

import net.minecraft.util.text.ITextComponent;

public class class_8547 extends class_2208<class_9449> {
   private static final Identifier field_43744 = new Identifier("textures/gui/container/brewing_stand.png");
   private static final int[] field_43743 = new int[]{29, 24, 20, 16, 11, 6, 0};

   public class_8547(class_9449 var1, class_7051 var2, ITextComponent var3) {
      super(var1, var2, var3);
   }

   @Override
   public void method_1163() {
      super.method_1163();
      this.field_10959 = (this.field_10981 - this.field_948.method_45379(this.field_947)) / 2;
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.method_1183(var1);
      super.method_6767(var1, var2, var3, var4);
      this.method_10214(var1, var2, var3);
   }

   @Override
   public void method_10223(class_7966 var1, float var2, int var3, int var4) {
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.field_943.getTextureManager().bindTexture(field_43744);
      int var7 = (this.field_941 - this.field_10981) / 2;
      int var8 = (this.field_940 - this.field_10973) / 2;
      this.method_9781(var1, var7, var8, 0, 0, this.field_10981, this.field_10973);
      int var9 = this.field_10956.method_43700();
      int var10 = class_9299.method_42829((18 * var9 + 20 - 1) / 20, 0, 18);
      if (var10 > 0) {
         this.method_9781(var1, var7 + 60, var8 + 44, 176, 29, var10, 4);
      }

      int var11 = this.field_10956.method_43701();
      if (var11 > 0) {
         int var12 = (int)(28.0F * (1.0F - (float)var11 / 400.0F));
         if (var12 > 0) {
            this.method_9781(var1, var7 + 97, var8 + 16, 176, 0, 9, var12);
         }

         var12 = field_43743[var11 / 2 % 7];
         if (var12 > 0) {
            this.method_9781(var1, var7 + 63, var8 + 14 + 29 - var12, 185, 29 - var12, 12, var12);
         }
      }
   }
}
