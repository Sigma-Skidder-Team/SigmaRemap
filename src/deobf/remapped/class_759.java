package remapped;

public class class_759 implements Runnable {
   private static String[] field_4118;

   public class_759(class_9035 var1, long var2, long var4, long var6, long var8, class_1702 var10) {
      this.field_4116 = var1;
      this.field_4113 = var2;
      this.field_4114 = var4;
      this.field_4112 = var6;
      this.field_4115 = var8;
      this.field_4117 = var10;
   }

   @Override
   public void run() {
      for (long var3 = this.field_4113; var3 < this.field_4114; var3++) {
         long var5 = var3 * this.field_4112;
         long var7 = (class_9035.method_41453(this.field_4116) - var3 + 1L) * this.field_4112;

         for (long var9 = this.field_4115; var9 < class_9035.method_41456(this.field_4116); var9++) {
            long var11 = 2L * var9;
            long var13 = 2L * (class_9035.method_41456(this.field_4116) - var9);
            this.field_4117.method_36114(var11, this.field_4117.method_36107(var13));
            this.field_4117.method_36114(var11 + 1L, -this.field_4117.method_36107(var13 + 1L));
            long var15 = var5 + var11;
            long var17 = var7 - var11;
            this.field_4117.method_36114(var15, this.field_4117.method_36107(var17));
            this.field_4117.method_36114(var15 + 1L, -this.field_4117.method_36107(var17 + 1L));
         }
      }
   }
}
