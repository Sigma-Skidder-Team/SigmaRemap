package remapped;

public class class_8945 implements Runnable {
   private static String[] field_45860;

   public class_8945(class_3381 var1, long var2, long var4, class_4330 var6, boolean var7) {
      this.field_45862 = var1;
      this.field_45858 = var2;
      this.field_45861 = var4;
      this.field_45859 = var6;
      this.field_45857 = var7;
   }

   @Override
   public void run() {
      for (long var3 = this.field_45858; var3 < this.field_45861; var3++) {
         long var5 = var3 * class_3381.method_15598(this.field_45862);

         for (long var7 = 0L; var7 < class_3381.method_15624(this.field_45862); var7++) {
            class_3381.method_15625(this.field_45862).method_24213(this.field_45859, var5 + var7 * class_3381.method_15638(this.field_45862), this.field_45857);
         }
      }
   }
}
