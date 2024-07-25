package remapped;

import java.util.List;

public class class_522 {
   private static String[] field_3184;
   public int field_3187;
   public int field_3186;
   public List<class_1331> field_3185;

   public class_522(int var1, int var2, List<class_1331> var3) {
      this.field_3187 = var1;
      this.field_3186 = var2;
      this.field_3185 = var3;
   }

   public boolean method_2541(class_2034 var1) {
      return var1.field_10328 == this.field_3187 && var1.field_10327 == this.field_3186;
   }

   public int method_2543(class_2034 var1) {
      return (int)Math.sqrt(
         (double)(
            (var1.field_10328 - this.field_3187) * (var1.field_10328 - this.field_3187)
               + (var1.field_10327 - this.field_3186) * (var1.field_10327 - this.field_3186)
         )
      );
   }

   public class_2034 method_2544() {
      return new class_2034(this.field_3187, this.field_3186);
   }
}
