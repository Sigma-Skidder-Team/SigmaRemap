package remapped;

public class class_2279 {
   private int field_11389;
   private int field_11390;

   public class_2279(int var1, int var2) {
      this.field_11389 = Math.min(var1, var2);
      this.field_11390 = Math.max(var1, var2);
   }

   public boolean method_10504(int var1) {
      return var1 >= this.field_11389 ? var1 <= this.field_11390 : false;
   }

   public int method_10502() {
      return this.field_11389;
   }

   public int method_10501() {
      return this.field_11390;
   }

   @Override
   public String toString() {
      return "min: " + this.field_11389 + ", max: " + this.field_11390;
   }
}
