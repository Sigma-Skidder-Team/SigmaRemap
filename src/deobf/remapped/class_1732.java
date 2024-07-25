package remapped;

public class class_1732 implements Runnable {
   private static String[] field_8928;

   public class_1732(class_3101 var1, long var2, long var4, class_4330 var6, boolean var7) {
      this.field_8932 = var1;
      this.field_8931 = var2;
      this.field_8930 = var4;
      this.field_8933 = var6;
      this.field_8929 = var7;
   }

   @Override
   public void run() {
      for (long var3 = this.field_8931; var3 < this.field_8930; var3++) {
         long var5 = var3 * (long)class_3101.method_14211(this.field_8932);

         for (long var7 = 0L; var7 < class_3101.method_14198(this.field_8932); var7++) {
            class_3101.method_14195(this.field_8932)
               .method_19201(this.field_8933, var5 + var7 * (long)class_3101.method_14196(this.field_8932), this.field_8929);
         }
      }
   }
}
