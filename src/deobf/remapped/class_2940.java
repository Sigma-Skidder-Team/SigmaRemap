package remapped;

import java.util.EnumSet;

public class class_2940 extends class_3599 {
   private static String[] field_14297;

   public class_2940(class_2519 var1) {
      this.field_14298 = var1;
      this.method_16800(EnumSet.<class_1891>of(class_1891.field_9564));
   }

   @Override
   public boolean method_16795() {
      return !this.field_14298.method_26905().method_12877() && class_2519.method_11460(this.field_14298).nextInt(7) == 0;
   }

   @Override
   public boolean method_16799() {
      return false;
   }

   @Override
   public void method_16794() {
      BlockPos var3 = this.field_14298.method_11466();
      if (var3 == null) {
         var3 = this.field_14298.method_37075();
      }

      for (int var4 = 0; var4 < 3; var4++) {
         BlockPos var5 = var3.method_6104(
            class_2519.method_11452(this.field_14298).nextInt(15) - 7,
            class_2519.method_11461(this.field_14298).nextInt(11) - 5,
            class_2519.method_11457(this.field_14298).nextInt(15) - 7
         );
         if (this.field_14298.field_41768.method_22548(var5)) {
            class_2519.method_11464(this.field_14298)
               .method_12879((double)var5.method_12173() + 0.5, (double)var5.method_12165() + 0.5, (double)var5.method_12185() + 0.5, 0.25);
            if (this.field_14298.method_17809() == null) {
               this.field_14298
                  .method_26865()
                  .method_17231((double)var5.method_12173() + 0.5, (double)var5.method_12165() + 0.5, (double)var5.method_12185() + 0.5, 180.0F, 20.0F);
            }
            break;
         }
      }
   }
}
