package remapped;

public class class_7408 implements Runnable {
   private static String[] field_37816;

   public class_7408(class_573 var1, long var2, long var4, class_1702 var6, boolean var7) {
      this.field_37814 = var1;
      this.field_37812 = var2;
      this.field_37811 = var4;
      this.field_37815 = var6;
      this.field_37813 = var7;
   }

   @Override
   public void run() {
      for (long var3 = this.field_37812; var3 < this.field_37811; var3++) {
         long var5 = var3 * class_573.method_2731(this.field_37814);

         for (long var7 = 0L; var7 < class_573.method_2715(this.field_37814); var7++) {
            class_573.method_2736(this.field_37814).method_44818(this.field_37815, var5 + var7 * class_573.method_2726(this.field_37814), this.field_37813);
         }
      }
   }
}
