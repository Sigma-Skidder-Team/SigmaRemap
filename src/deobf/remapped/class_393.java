package remapped;

public class class_393 implements Runnable {
   private static String[] field_1656;

   public class_393(class_3381 var1, long var2, long var4, long var6, class_4330 var8, long var9, class_4330 var11, long var12) {
      this.field_1651 = var1;
      this.field_1655 = var2;
      this.field_1652 = var4;
      this.field_1653 = var6;
      this.field_1650 = var8;
      this.field_1649 = var9;
      this.field_1654 = var11;
      this.field_1648 = var12;
   }

   @Override
   public void run() {
      for (long var3 = this.field_1655; var3 < this.field_1652; var3++) {
         long var5 = var3 * this.field_1653;

         for (long var7 = 0L; var7 < class_3381.method_15624(this.field_1651); var7++) {
            class_3685.method_17117(
               this.field_1650,
               var3 * class_3381.method_15624(this.field_1651) * this.field_1649 + var7 * this.field_1649,
               this.field_1654,
               var5 + var7 * this.field_1648,
               this.field_1649
            );
         }
      }
   }
}
