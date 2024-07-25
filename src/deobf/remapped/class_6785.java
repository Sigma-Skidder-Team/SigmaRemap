package remapped;

public class class_6785 implements Runnable {
   private static String[] field_34991;

   public class_6785(class_8751 var1, int var2, int var3, int var4, class_4330 var5, boolean var6) {
      this.field_34992 = var1;
      this.field_34988 = var2;
      this.field_34989 = var3;
      this.field_34990 = var4;
      this.field_34986 = var5;
      this.field_34987 = var6;
   }

   @Override
   public void run() {
      if (this.field_34988 != -1) {
         for (long var3 = (long)this.field_34989; var3 < class_8751.method_40166(this.field_34992); var3 += (long)this.field_34990) {
            class_8751.method_40165(this.field_34992).method_21129(this.field_34986, var3 * class_8751.method_40171(this.field_34992), this.field_34987);
         }
      } else {
         for (long var5 = (long)this.field_34989; var5 < class_8751.method_40166(this.field_34992); var5 += (long)this.field_34990) {
            class_8751.method_40165(this.field_34992).method_21137(this.field_34986, var5 * class_8751.method_40171(this.field_34992), this.field_34987);
         }
      }
   }
}
