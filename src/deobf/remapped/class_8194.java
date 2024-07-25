package remapped;

public class class_8194 {
   private static String[] field_41937;
   public final double field_41941;
   public final double field_41938;
   public final double field_41935;
   public final double field_41939;
   public final double field_41940;
   public final double field_41936;

   public class_8194(double var1, double var3, double var5, double var7, double var9, double var11) {
      this.field_41941 = var1;
      this.field_41938 = var3;
      this.field_41935 = var5;
      this.field_41939 = var7;
      this.field_41940 = var9;
      this.field_41936 = var11;
   }

   public class_8194(Box var1) {
      this.field_41941 = var1.field_19941;
      this.field_41938 = var1.field_19937;
      this.field_41935 = var1.field_19938;
      this.field_41939 = var1.field_19940;
      this.field_41940 = var1.field_19939;
      this.field_41936 = var1.field_19942;
   }

   public class_8194 method_37547(double var1) {
      return new class_8194(
         this.field_41941 - var1,
         this.field_41938 - var1,
         this.field_41935 - var1,
         this.field_41939 + var1 * 2.0,
         this.field_41940 + var1 * 2.0,
         this.field_41936 + var1 * 2.0
      );
   }
}
