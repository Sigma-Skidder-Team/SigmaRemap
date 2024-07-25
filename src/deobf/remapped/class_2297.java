package remapped;

import net.minecraft.util.text.ITextComponent;

public class class_2297 implements class_6406 {
   private static String[] field_11469;
   private final class_7856 field_11472;
   private final ITextComponent field_11474;
   private final ITextComponent field_11471;
   private class_5068 field_11473 = class_5068.field_26192;
   private long field_11477;
   private float field_11470;
   private float field_11475;
   private final boolean field_11476;

   public class_2297(class_7856 var1, ITextComponent var2, ITextComponent var3, boolean var4) {
      this.field_11472 = var1;
      this.field_11474 = var2;
      this.field_11471 = var3;
      this.field_11476 = var4;
   }

   @Override
   public class_5068 method_29236(class_7966 var1, class_9184 var2, long var3) {
      var2.method_42327().method_8577().method_35674(field_32696);
      class_3542.method_16404(1.0F, 1.0F, 1.0F);
      var2.method_9781(var1, 0, 0, 0, 96, this.method_29239(), this.method_29238());
      this.field_11472.method_35534(var1, var2, 6, 6);
      if (this.field_11471 != null) {
         var2.method_42327().textRenderer.method_45378(var1, this.field_11474, 30.0F, 7.0F, -11534256);
         var2.method_42327().textRenderer.method_45378(var1, this.field_11471, 30.0F, 18.0F, -16777216);
      } else {
         var2.method_42327().textRenderer.method_45378(var1, this.field_11474, 30.0F, 12.0F, -11534256);
      }

      if (this.field_11476) {
         class_2089.method_9774(var1, 3, 28, 157, 29, -1);
         float var7 = (float)class_9299.method_42841((double)this.field_11470, (double)this.field_11475, (double)((float)(var3 - this.field_11477) / 100.0F));
         int var8;
         if (!(this.field_11475 >= this.field_11470)) {
            var8 = -11206656;
         } else {
            var8 = -16755456;
         }

         class_2089.method_9774(var1, 3, 28, (int)(3.0F + 154.0F * var7), 29, var8);
         this.field_11470 = var7;
         this.field_11477 = var3;
      }

      return this.field_11473;
   }

   public void method_10566() {
      this.field_11473 = class_5068.field_26190;
   }

   public void method_10565(float var1) {
      this.field_11475 = var1;
   }
}
