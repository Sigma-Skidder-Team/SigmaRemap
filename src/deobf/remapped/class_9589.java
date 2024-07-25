package remapped;

import javax.annotation.concurrent.Immutable;

@Immutable
public class class_9589 {
   private static String[] field_48770;
   private final class_423 field_48769;
   private final float field_48768;

   public class_9589(class_423 var1, long var2, long var4, float var6) {
      this.field_48769 = var1;
      this.field_48768 = this.method_44285(var1, var2, var4, var6);
   }

   public class_423 method_44287() {
      return this.field_48769;
   }

   public float method_44283() {
      return this.field_48768;
   }

   public boolean method_44286(float var1) {
      return this.field_48768 > var1;
   }

   public float method_44284() {
      if (!(this.field_48768 < 2.0F)) {
         return !(this.field_48768 > 4.0F) ? (this.field_48768 - 2.0F) / 2.0F : 1.0F;
      } else {
         return 0.0F;
      }
   }

   private float method_44285(class_423 var1, long var2, long var4, float var6) {
      if (var1 != class_423.field_1790) {
         boolean var9 = var1 == class_423.field_1782;
         float var10 = 0.75F;
         float var11 = class_9299.method_42828(((float)var2 + -72000.0F) / 1440000.0F, 0.0F, 1.0F) * 0.25F;
         var10 += var11;
         float var12 = 0.0F;
         var12 += class_9299.method_42828((float)var4 / 3600000.0F, 0.0F, 1.0F) * (!var9 ? 0.75F : 1.0F);
         var12 += class_9299.method_42828(var6 * 0.25F, 0.0F, var11);
         if (var1 == class_423.field_1784) {
            var12 *= 0.5F;
         }

         var10 += var12;
         return (float)var1.method_2097() * var10;
      } else {
         return 0.0F;
      }
   }
}
