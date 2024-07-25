package remapped;

public class class_6084 implements Runnable {
   private static String[] field_31132;

   public class_6084(class_4993 var1, long var2, long var4, long var6, long var8, class_4330 var10) {
      this.field_31137 = var1;
      this.field_31134 = var2;
      this.field_31138 = var4;
      this.field_31136 = var6;
      this.field_31133 = var8;
      this.field_31135 = var10;
   }

   @Override
   public void run() {
      for (long var3 = this.field_31134; var3 < this.field_31138; var3++) {
         long var5 = var3 * this.field_31136;
         long var7 = (class_4993.method_22978(this.field_31137) - var3 + 1L) * this.field_31136;

         for (long var9 = this.field_31133; var9 < class_4993.method_23002(this.field_31137); var9++) {
            long var11 = 2L * var9;
            long var13 = 2L * (class_4993.method_23002(this.field_31137) - var9);
            this.field_31135.method_36114(var11, (double)this.field_31135.method_36133(var13));
            this.field_31135.method_36114(var11 + 1L, (double)(-this.field_31135.method_36133(var13 + 1L)));
            long var15 = var5 + var11;
            long var17 = var7 - var11;
            this.field_31135.method_36114(var15, (double)this.field_31135.method_36133(var17));
            this.field_31135.method_36114(var15 + 1L, (double)(-this.field_31135.method_36133(var17 + 1L)));
         }
      }
   }
}
