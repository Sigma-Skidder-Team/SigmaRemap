package remapped;

public class class_1753 extends class_246 {
   private static String[] field_9017;

   private class_1753(ClientWorld var1, double var2, double var4, double var6, double var8, double var10, double var12, class_6571 var14) {
      super(var1, var2, var4, var6, var14, -0.05F);
      this.field_49481 = var8;
      this.field_49486 = var10;
      this.field_49471 = var12;
      this.field_10503 *= 0.75F;
      this.field_49476 = 60 + this.field_49466.nextInt(12);
      this.method_40054(var14);
      if (this.field_49466.nextInt(4) != 0) {
         this.method_44953(0.1F + this.field_49466.nextFloat() * 0.2F, 0.4F + this.field_49466.nextFloat() * 0.3F, this.field_49466.nextFloat() * 0.2F);
      } else {
         this.method_44953(0.6F + this.field_49466.nextFloat() * 0.2F, 0.6F + this.field_49466.nextFloat() * 0.3F, this.field_49466.nextFloat() * 0.2F);
      }

      this.method_1083(0.6F);
   }
}
