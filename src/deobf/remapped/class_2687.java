package remapped;

public class class_2687 implements Runnable {
   private static String[] field_13163;

   public class_2687(class_9035 var1, long var2, long var4, long var6, long var8, class_1702 var10) {
      this.field_13168 = var1;
      this.field_13167 = var2;
      this.field_13162 = var4;
      this.field_13165 = var6;
      this.field_13164 = var8;
      this.field_13166 = var10;
   }

   @Override
   public void run() {
      for (long var3 = this.field_13167; var3 < this.field_13162; var3++) {
         long var5 = var3 * this.field_13165;
         long var7 = (class_9035.method_41453(this.field_13168) - var3 + 1L) * this.field_13165;

         for (long var9 = this.field_13164; var9 < class_9035.method_41456(this.field_13168); var9++) {
            long var11 = 2L * var9;
            long var13 = 2L * (class_9035.method_41456(this.field_13168) - var9);
            this.field_13166.method_36114(var11, this.field_13166.method_36107(var13));
            this.field_13166.method_36114(var11 + 1L, -this.field_13166.method_36107(var13 + 1L));
            long var15 = var5 + var11;
            long var17 = var7 - var11;
            this.field_13166.method_36114(var15, this.field_13166.method_36107(var17));
            this.field_13166.method_36114(var15 + 1L, -this.field_13166.method_36107(var17 + 1L));
         }
      }
   }
}
