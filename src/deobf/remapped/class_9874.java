package remapped;

public class class_9874 {
   public float[] field_49930;
   public final int field_49932;

   public class_9874(float[] var1, int var2) {
      this.field_49930 = var1;
      this.field_49932 = var2;
   }

   public float method_45503(int var1) {
      if (this.field_49930 == null) {
         throw new NullPointerException("uvs");
      } else {
         int var4 = this.method_45502(var1);
         return this.field_49930[var4 != 0 && var4 != 1 ? 2 : 0];
      }
   }

   public float method_45501(int var1) {
      if (this.field_49930 == null) {
         throw new NullPointerException("uvs");
      } else {
         int var4 = this.method_45502(var1);
         return this.field_49930[var4 != 0 && var4 != 3 ? 3 : 1];
      }
   }

   private int method_45502(int var1) {
      return (var1 + this.field_49932 / 90) % 4;
   }

   public int method_45505(int var1) {
      return (var1 + 4 - this.field_49932 / 90) % 4;
   }

   public void method_45506(float[] var1) {
      if (this.field_49930 == null) {
         this.field_49930 = var1;
      }
   }
}
