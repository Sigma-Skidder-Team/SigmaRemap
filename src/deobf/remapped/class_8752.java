package remapped;

public class class_8752 implements Runnable {
   private static String[] field_44805;

   public class_8752(class_3803 var1, long var2, long var4, class_4330 var6, boolean var7) {
      this.field_44808 = var1;
      this.field_44807 = var2;
      this.field_44804 = var4;
      this.field_44803 = var6;
      this.field_44806 = var7;
   }

   @Override
   public void run() {
      for (long var3 = this.field_44807; var3 < this.field_44804; var3++) {
         long var5 = var3 * class_3803.method_17713(this.field_44808);

         for (long var7 = 0L; var7 < class_3803.method_17686(this.field_44808); var7++) {
            class_3803.method_17704(this.field_44808).method_17787(this.field_44803, var5 + var7 * class_3803.method_17705(this.field_44808), this.field_44806);
         }
      }
   }
}
