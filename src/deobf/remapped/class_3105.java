package remapped;

public class class_3105 extends class_3289 {
   private static String[] field_15442;
   private int field_15441;
   private final int field_15440 = 8;

   private class_3105(ClientWorld var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6, 0.0, 0.0, 0.0);
   }

   @Override
   public void method_44949() {
      for (int var3 = 0; var3 < 6; var3++) {
         double var4 = this.field_49462 + (this.field_49466.nextDouble() - this.field_49466.nextDouble()) * 4.0;
         double var6 = this.field_49473 + (this.field_49466.nextDouble() - this.field_49466.nextDouble()) * 4.0;
         double var8 = this.field_49465 + (this.field_49466.nextDouble() - this.field_49466.nextDouble()) * 4.0;
         this.field_49469.method_43361(class_3090.field_15339, var4, var6, var8, (double)((float)this.field_15441 / 8.0F), 0.0, 0.0);
      }

      this.field_15441++;
      if (this.field_15441 == 8) {
         this.method_44948();
      }
   }
}
