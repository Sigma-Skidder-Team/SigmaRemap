package remapped;

public class class_93 {
   private static String[] field_189;
   private final class_2762 field_190;
   private int field_188;
   private int field_187;
   private final int field_186;

   public class_93(class_2762 var1, int var2, int var3) {
      this.field_190 = var1;
      this.field_188 = var2;
      this.field_187 = var2;
      this.field_186 = var3;
   }

   public void method_271(int var1) {
      if (var1 >= this.field_188) {
         if (var1 > this.field_187) {
            this.field_187 = var1;
         }
      } else {
         this.field_188 = var1;
      }
   }

   public class_2762 method_273() {
      return this.field_190;
   }

   public int method_272() {
      return this.field_188;
   }

   public int method_270() {
      return this.field_187;
   }

   public int method_275() {
      return this.field_186;
   }
}
