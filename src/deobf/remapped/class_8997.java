package remapped;

public class class_8997 implements Runnable {
   private static String[] field_46058;

   public class_8997(class_573 var1, long var2, long var4, class_1702 var6, boolean var7) {
      this.field_46059 = var1;
      this.field_46062 = var2;
      this.field_46061 = var4;
      this.field_46063 = var6;
      this.field_46060 = var7;
   }

   @Override
   public void run() {
      class_1702 var3 = new class_1702(class_573.method_2715(this.field_46059), false);

      for (long var4 = this.field_46062; var4 < this.field_46061; var4++) {
         long var6 = var4 * class_573.method_2731(this.field_46059);

         for (long var8 = 0L; var8 < class_573.method_2735(this.field_46059); var8++) {
            for (long var10 = 0L; var10 < class_573.method_2715(this.field_46059); var10++) {
               long var12 = var6 + var10 * class_573.method_2726(this.field_46059) + var8;
               var3.method_36114(var10, this.field_46063.method_36107(var12));
            }

            class_573.method_2711(this.field_46059).method_44819(var3, this.field_46060);

            for (long var14 = 0L; var14 < class_573.method_2715(this.field_46059); var14++) {
               long var15 = var6 + var14 * class_573.method_2726(this.field_46059) + var8;
               this.field_46063.method_36114(var15, var3.method_36107(var14));
            }
         }
      }
   }
}
