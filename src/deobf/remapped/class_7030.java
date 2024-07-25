package remapped;

public class class_7030 {
   private static String[] field_36202;
   public int field_36201;
   public int field_36203;

   public class_7030(int var1, int var2) {
      this.field_36201 = var1;
      this.field_36203 = var2;
   }

   public int method_32067() {
      return this.field_36201;
   }

   public class_7030 method_32066(class_7030 var1) {
      return new class_7030(this.field_36201 + var1.field_36201, this.field_36203 + var1.field_36203);
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         class_7030 var4 = (class_7030)var1;
         return this.field_36201 == var4.field_36201 && this.field_36203 == var4.field_36203;
      } else {
         return false;
      }
   }
}
