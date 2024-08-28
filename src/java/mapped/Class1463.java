package mapped;

public class Class1463 implements Runnable {
   private static String[] field7861;
   public final long field7862;
   public final long field7863;
   public final long field7864;
   public final long field7865;
   public final long field7866;
   public final Class2378 field7867;
   public final Class8026 field7868;

   public Class1463(Class8026 var1, long var2, long var4, long var6, long var8, long var10, Class2378 var12) {
      this.field7868 = var1;
      this.field7862 = var2;
      this.field7863 = var4;
      this.field7864 = var6;
      this.field7865 = var8;
      this.field7866 = var10;
      this.field7867 = var12;
   }

   @Override
   public void run() {
      for (long var3 = this.field7862; var3 < this.field7863; var3++) {
         long var5 = (Class8026.method27524(this.field7868) - var3) % Class8026.method27524(this.field7868) * this.field7864;
         long var7 = var3 * this.field7864;

         for (long var9 = 1L; var9 < this.field7865; var9++) {
            long var11 = var7 + (Class8026.method27521(this.field7868) - var9) * this.field7866;
            long var13 = var5 + var9 * this.field7866 + Class8026.method27523(this.field7868);
            long var15 = var11 + Class8026.method27523(this.field7868);
            long var17 = var11 + 1L;
            this.field7867.method9685(var13, this.field7867.method9651(var17));
            this.field7867.method9685(var15, this.field7867.method9651(var17));
            this.field7867.method9685(var13 + 1L, -this.field7867.method9651(var11));
            this.field7867.method9685(var15 + 1L, this.field7867.method9651(var11));
         }
      }
   }
}
