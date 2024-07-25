package remapped;

public class class_3876 implements Runnable {
   private static String[] field_18868;

   public class_3876(class_4993 var1, long var2, long var4, long var6, class_4330 var8, long var9, long var11) {
      this.field_18872 = var1;
      this.field_18871 = var2;
      this.field_18867 = var4;
      this.field_18873 = var6;
      this.field_18874 = var8;
      this.field_18869 = var9;
      this.field_18870 = var11;
   }

   @Override
   public void run() {
      for (long var3 = this.field_18871; var3 < this.field_18867; var3++) {
         long var5 = var3 * this.field_18873;
         long var7 = (class_4993.method_22978(this.field_18872) - var3) * this.field_18873;
         long var9 = var5 + class_4993.method_23002(this.field_18872);
         this.field_18874.method_36114(var9, (double)this.field_18874.method_36133(var7 + 1L));
         this.field_18874.method_36114(var9 + 1L, (double)(-this.field_18874.method_36133(var7)));
      }

      for (long var15 = this.field_18871; var15 < this.field_18867; var15++) {
         long var17 = var15 * this.field_18873;
         long var21 = (class_4993.method_22978(this.field_18872) - var15 + 1L) * this.field_18873;

         for (long var11 = class_4993.method_23002(this.field_18872) + 2L; var11 < this.field_18873; var11 += 2L) {
            long var19 = var21 - var11;
            long var13 = var17 + var11;
            this.field_18874.method_36114(var13, (double)this.field_18874.method_36133(var19));
            this.field_18874.method_36114(var13 + 1L, (double)(-this.field_18874.method_36133(var19 + 1L)));
         }
      }

      for (long var16 = this.field_18869; var16 < this.field_18870; var16++) {
         long var22 = (class_4993.method_22978(this.field_18872) - var16) % class_4993.method_22978(this.field_18872) * this.field_18873;
         long var24 = var16 * this.field_18873;

         for (long var23 = 0L; var23 < this.field_18873; var23 += 2L) {
            long var18 = var22 + (this.field_18873 - var23) % this.field_18873;
            long var20 = var24 + var23;
            this.field_18874.method_36114(var18, (double)this.field_18874.method_36133(var20));
            this.field_18874.method_36114(var18 + 1L, (double)(-this.field_18874.method_36133(var20 + 1L)));
         }
      }
   }
}
