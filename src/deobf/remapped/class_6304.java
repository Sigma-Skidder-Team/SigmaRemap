package remapped;

public class class_6304 implements Runnable {
   private static String[] field_32216;

   public class_6304(class_4993 var1, int var2, int var3, int var4, float[][] var5) {
      this.field_32214 = var1;
      this.field_32211 = var2;
      this.field_32215 = var3;
      this.field_32212 = var4;
      this.field_32213 = var5;
   }

   @Override
   public void run() {
      for (int var3 = this.field_32211; var3 < this.field_32215; var3++) {
         int var4 = class_4993.method_22973(this.field_32214) - var3;

         for (int var5 = this.field_32212; var5 < class_4993.method_22972(this.field_32214); var5++) {
            int var6 = 2 * var5;
            int var7 = 2 * (class_4993.method_22972(this.field_32214) - var5);
            this.field_32213[0][var6] = this.field_32213[0][var7];
            this.field_32213[0][var6 + 1] = -this.field_32213[0][var7 + 1];
            this.field_32213[var3][var6] = this.field_32213[var4][var7];
            this.field_32213[var3][var6 + 1] = -this.field_32213[var4][var7 + 1];
         }
      }
   }
}
