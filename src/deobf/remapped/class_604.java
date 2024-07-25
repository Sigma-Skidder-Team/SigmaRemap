package remapped;

public class class_604 implements Runnable {
   private static String[] field_3463;

   public class_604(class_9035 var1, long var2, long var4, long var6, class_1702 var8, long var9, long var11) {
      this.field_3464 = var1;
      this.field_3460 = var2;
      this.field_3466 = var4;
      this.field_3467 = var6;
      this.field_3465 = var8;
      this.field_3461 = var9;
      this.field_3462 = var11;
   }

   @Override
   public void run() {
      for (long var3 = this.field_3460; var3 < this.field_3466; var3++) {
         long var5 = var3 * this.field_3467;
         long var7 = (class_9035.method_41453(this.field_3464) - var3) * this.field_3467;
         long var9 = var5 + class_9035.method_41456(this.field_3464);
         this.field_3465.method_36114(var9, this.field_3465.method_36107(var7 + 1L));
         this.field_3465.method_36114(var9 + 1L, -this.field_3465.method_36107(var7));
      }

      for (long var15 = this.field_3460; var15 < this.field_3466; var15++) {
         long var17 = var15 * this.field_3467;
         long var21 = (class_9035.method_41453(this.field_3464) - var15 + 1L) * this.field_3467;

         for (long var11 = class_9035.method_41456(this.field_3464) + 2L; var11 < this.field_3467; var11 += 2L) {
            long var19 = var21 - var11;
            long var13 = var17 + var11;
            this.field_3465.method_36114(var13, this.field_3465.method_36107(var19));
            this.field_3465.method_36114(var13 + 1L, -this.field_3465.method_36107(var19 + 1L));
         }
      }

      for (long var16 = this.field_3461; var16 < this.field_3462; var16++) {
         long var22 = (class_9035.method_41453(this.field_3464) - var16) % class_9035.method_41453(this.field_3464) * this.field_3467;
         long var24 = var16 * this.field_3467;

         for (long var23 = 0L; var23 < this.field_3467; var23 += 2L) {
            long var18 = var22 + (this.field_3467 - var23) % this.field_3467;
            long var20 = var24 + var23;
            this.field_3465.method_36114(var18, this.field_3465.method_36107(var20));
            this.field_3465.method_36114(var18 + 1L, -this.field_3465.method_36107(var20 + 1L));
         }
      }
   }
}
