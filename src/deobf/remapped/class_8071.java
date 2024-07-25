package remapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;

public class class_8071 extends class_2344<class_2519> {
   private static String[] field_41291;
   private final class_1549 field_41292;
   private final class_1549 field_41290;

   public class_8071() {
      super(0.0F, 0.0F, 64, 64);
      this.field_11703.field_8200 = false;
      this.field_11695.field_8200 = false;
      this.field_11706 = new class_1549(this, 32, 0);
      this.field_11706.method_7049(-1.0F, -1.0F, -2.0F, 6.0F, 10.0F, 4.0F, 0.0F);
      this.field_11706.method_7046(-1.9F, 12.0F, 0.0F);
      this.field_41290 = new class_1549(this, 0, 32);
      this.field_41290.method_7048(-20.0F, 0.0F, 0.0F, 20.0F, 12.0F, 1.0F);
      this.field_41292 = new class_1549(this, 0, 32);
      this.field_41292.field_8197 = true;
      this.field_41292.method_7048(0.0F, 0.0F, 0.0F, 20.0F, 12.0F, 1.0F);
   }

   @Override
   public Iterable<class_1549> method_6902() {
      return Iterables.concat(super.method_6902(), ImmutableList.of(this.field_41290, this.field_41292));
   }

   public void method_36627(class_2519 var1, float var2, float var3, float var4, float var5, float var6) {
      super.method_10738(var1, var2, var3, var4, var5, var6);
      if (var1.method_11463()) {
         if (!var1.method_26446().method_28022()) {
            if (var1.method_26432() != class_1736.field_8943) {
               this.field_11701.field_8191 = 3.7699115F;
            } else {
               this.field_11705.field_8191 = 3.7699115F;
            }
         } else {
            this.field_11705.field_8191 = (float) (Math.PI * 3.0 / 2.0);
            this.field_11701.field_8191 = (float) (Math.PI * 3.0 / 2.0);
         }
      }

      this.field_11706.field_8191 += (float) (Math.PI / 5);
      this.field_41290.field_8187 = 2.0F;
      this.field_41292.field_8187 = 2.0F;
      this.field_41290.field_8181 = 1.0F;
      this.field_41292.field_8181 = 1.0F;
      this.field_41290.field_8190 = 0.47123894F + class_9299.method_42840(var4 * 0.8F) * (float) Math.PI * 0.05F;
      this.field_41292.field_8190 = -this.field_41290.field_8190;
      this.field_41292.field_8185 = -0.47123894F;
      this.field_41292.field_8191 = 0.47123894F;
      this.field_41290.field_8191 = 0.47123894F;
      this.field_41290.field_8185 = 0.47123894F;
   }
}
