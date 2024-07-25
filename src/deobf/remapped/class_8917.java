package remapped;

public class class_8917 implements Runnable {
   private static String[] field_45723;

   public class_8917(class_4993 var1, long var2, int var4, int var5, int var6, class_4330 var7, boolean var8) {
      this.field_45720 = var1;
      this.field_45721 = var2;
      this.field_45726 = var4;
      this.field_45727 = var5;
      this.field_45724 = var6;
      this.field_45725 = var7;
      this.field_45722 = var8;
   }

   @Override
   public void run() {
      if (this.field_45721 != 0L) {
         if (this.field_45726 != 1) {
            for (long var3 = (long)this.field_45727; var3 < class_4993.method_22978(this.field_45720); var3 += (long)this.field_45724) {
               class_4993.method_22998(this.field_45720).method_24153(this.field_45725, var3 * class_4993.method_23002(this.field_45720), this.field_45722);
            }
         } else {
            for (long var5 = (long)this.field_45727; var5 < class_4993.method_22978(this.field_45720); var5 += (long)this.field_45724) {
               class_4993.method_22998(this.field_45720).method_24203(this.field_45725, var5 * class_4993.method_23002(this.field_45720));
            }
         }
      } else if (this.field_45726 != -1) {
         for (long var6 = (long)this.field_45727; var6 < class_4993.method_22978(this.field_45720); var6 += (long)this.field_45724) {
            class_4993.method_22998(this.field_45720).method_24213(this.field_45725, var6 * class_4993.method_23002(this.field_45720), this.field_45722);
         }
      } else {
         for (long var7 = (long)this.field_45727; var7 < class_4993.method_22978(this.field_45720); var7 += (long)this.field_45724) {
            class_4993.method_22998(this.field_45720).method_24184(this.field_45725, var7 * class_4993.method_23002(this.field_45720));
         }
      }
   }
}
