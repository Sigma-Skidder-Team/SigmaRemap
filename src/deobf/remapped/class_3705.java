package remapped;

public class class_3705 extends class_3289 {
   private static String[] field_18182;
   private final Entity field_18186;
   private int field_18184;
   private final int field_18185;
   private final class_5079 field_18183;

   public class_3705(ClientWorld var1, Entity var2, class_5079 var3) {
      this(var1, var2, var3, 3);
   }

   public class_3705(ClientWorld var1, Entity var2, class_5079 var3, int var4) {
      this(var1, var2, var3, var4, var2.method_37098());
   }

   private class_3705(ClientWorld var1, Entity var2, class_5079 var3, int var4, class_1343 var5) {
      super(var1, var2.method_37302(), var2.method_37080(0.5), var2.method_37156(), var5.field_7336, var5.field_7333, var5.field_7334);
      this.field_18186 = var2;
      this.field_18185 = var4;
      this.field_18183 = var3;
      this.method_44949();
   }

   @Override
   public void method_44949() {
      for (int var3 = 0; var3 < 16; var3++) {
         double var4 = (double)(this.field_49466.nextFloat() * 2.0F - 1.0F);
         double var6 = (double)(this.field_49466.nextFloat() * 2.0F - 1.0F);
         double var8 = (double)(this.field_49466.nextFloat() * 2.0F - 1.0F);
         if (!(var4 * var4 + var6 * var6 + var8 * var8 > 1.0)) {
            double var10 = this.field_18186.method_37146(var4 / 4.0);
            double var12 = this.field_18186.method_37080(0.5 + var6 / 4.0);
            double var14 = this.field_18186.method_37205(var8 / 4.0);
            this.field_49469.method_29543(this.field_18183, false, var10, var12, var14, var4, var6 + 0.2, var8);
         }
      }

      this.field_18184++;
      if (this.field_18184 >= this.field_18185) {
         this.method_44948();
      }
   }
}
