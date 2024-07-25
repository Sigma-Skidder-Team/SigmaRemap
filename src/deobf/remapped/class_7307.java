package remapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.Arrays;

public class class_7307<T extends class_378> extends class_5272<T> {
   private static String[] field_37361;
   private final class_1549[] field_37362 = new class_1549[8];
   private final class_1549 field_37360;
   private final ImmutableList<class_1549> field_37359;

   public class_7307() {
      for (int var3 = 0; var3 < this.field_37362.length; var3++) {
         byte var4 = 0;
         int var5 = var3;
         if (var3 != 2) {
            if (var3 == 3) {
               var4 = 24;
               var5 = 19;
            }
         } else {
            var4 = 24;
            var5 = 10;
         }

         this.field_37362[var3] = new class_1549(this, var4, var5);
         this.field_37362[var3].method_7048(-4.0F, (float)(16 + var3), -4.0F, 8.0F, 1.0F, 8.0F);
      }

      this.field_37360 = new class_1549(this, 0, 16);
      this.field_37360.method_7048(-2.0F, 18.0F, -2.0F, 4.0F, 4.0F, 4.0F);
      Builder var6 = ImmutableList.builder();
      var6.add(this.field_37360);
      var6.addAll(Arrays.<class_1549>asList(this.field_37362));
      this.field_37359 = var6.build();
   }

   public void method_33315(T var1, float var2, float var3, float var4, float var5, float var6) {
   }

   public void method_33317(T var1, float var2, float var3, float var4) {
      float var7 = MathHelper.method_42795(var4, var1.field_1533, var1.field_1538);
      if (var7 < 0.0F) {
         var7 = 0.0F;
      }

      for (int var8 = 0; var8 < this.field_37362.length; var8++) {
         this.field_37362[var8].field_8181 = (float)(-(4 - var8)) * var7 * 1.7F;
      }
   }

   public ImmutableList<class_1549> method_33316() {
      return this.field_37359;
   }
}
