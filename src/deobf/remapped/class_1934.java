package remapped;

public class class_1934 {
   private static String[] field_9885;
   public float field_9888;
   public float field_9887;
   public float field_9886;
   public float field_9884;

   public class_1934(float var1, float var2, float var3) {
      this.field_9888 = var1;
      this.field_9887 = var2;
      this.field_9886 = var3;
      this.field_9884 = 0.1F;
   }

   public class_1934(float var1, float var2, float var3, float var4) {
      this(var1, var2, var3);
      this.field_9884 = var4;
   }

   public float method_8982(float var1) {
      if (var1 != this.field_9888) {
         this.field_9888 = this.field_9888 + (var1 - this.field_9888) * this.field_9884;
      }

      return this.field_9888;
   }

   public float method_8981(float var1) {
      if (var1 != this.field_9887) {
         this.field_9887 = this.field_9887 + (var1 - this.field_9887) * this.field_9884;
      }

      return this.field_9887;
   }

   public float method_8983(float var1) {
      if (var1 != this.field_9886) {
         this.field_9886 = this.field_9886 + (var1 - this.field_9886) * this.field_9884;
      }

      return this.field_9886;
   }
}
