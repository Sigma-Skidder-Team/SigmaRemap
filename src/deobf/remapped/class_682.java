package remapped;

public class class_682 extends Box {
   private static String[] field_3762;
   private int field_3760 = -1;
   private boolean field_3761 = false;

   public class_682(double var1, double var3, double var5, double var7, double var9, double var11) {
      super(var1, var3, var5, var7, var9, var11);
   }

   public boolean method_3097(class_2336 var1, int var2) {
      if (this.field_3760 != var2) {
         this.field_3761 = var1.method_10690(this.field_19941, this.field_19937, this.field_19938, this.field_19940, this.field_19939, this.field_19942);
         this.field_3760 = var2;
      }

      return this.field_3761;
   }
}
