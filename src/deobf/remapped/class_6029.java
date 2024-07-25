package remapped;

public class class_6029 implements Runnable {
   private static String[] field_30790;

   public class_6029(class_3101 var1, long var2, long var4, class_4330 var6, boolean var7) {
      this.field_30785 = var1;
      this.field_30789 = var2;
      this.field_30787 = var4;
      this.field_30788 = var6;
      this.field_30786 = var7;
   }

   @Override
   public void run() {
      for (long var3 = this.field_30789; var3 < this.field_30787; var3++) {
         long var5 = var3 * class_3101.method_14193(this.field_30785);

         for (long var7 = 0L; var7 < class_3101.method_14198(this.field_30785); var7++) {
            class_3101.method_14195(this.field_30785).method_19194(this.field_30788, var5 + var7 * class_3101.method_14194(this.field_30785), this.field_30786);
         }
      }
   }
}
