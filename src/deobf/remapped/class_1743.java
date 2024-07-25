package remapped;

public class class_1743 implements Runnable {
   private static String[] field_8987;

   public class_1743(class_3101 var1, long var2, long var4, class_4330 var6, boolean var7) {
      this.field_8984 = var1;
      this.field_8983 = var2;
      this.field_8988 = var4;
      this.field_8985 = var6;
      this.field_8986 = var7;
   }

   @Override
   public void run() {
      class_4330 var3 = new class_4330(class_3101.method_14198(this.field_8984), false);

      for (long var4 = this.field_8983; var4 < this.field_8988; var4++) {
         long var6 = var4 * (long)class_3101.method_14211(this.field_8984);

         for (long var8 = 0L; var8 < class_3101.method_14197(this.field_8984); var8++) {
            for (long var10 = 0L; var10 < class_3101.method_14198(this.field_8984); var10++) {
               long var12 = var6 + var10 * (long)class_3101.method_14196(this.field_8984) + var8;
               var3.method_36123(var10, this.field_8985.method_36133(var12));
            }

            class_3101.method_14199(this.field_8984).method_19202(var3, this.field_8986);

            for (long var14 = 0L; var14 < class_3101.method_14198(this.field_8984); var14++) {
               long var15 = var6 + var14 * (long)class_3101.method_14196(this.field_8984) + var8;
               this.field_8985.method_36123(var15, var3.method_36133(var14));
            }
         }
      }
   }
}
