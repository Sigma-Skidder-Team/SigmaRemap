package mapped;

public class Class1426 implements Runnable {
   private static String[] field7649;
   public final long field7650;
   public final long field7651;
   public final Class2381 field7652;
   public final boolean field7653;
   public final Class6352 field7654;

   public Class1426(Class6352 var1, long var2, long var4, Class2381 var6, boolean var7) {
      this.field7654 = var1;
      this.field7650 = var2;
      this.field7651 = var4;
      this.field7652 = var6;
      this.field7653 = var7;
   }

   @Override
   public void run() {
      for (long var3 = this.field7650; var3 < this.field7651; var3++) {
         long var5 = var3 * Class6352.method19335(this.field7654);

         for (long var7 = 0L; var7 < Class6352.method19336(this.field7654); var7++) {
            Class6352.method19330(this.field7654).method38579(this.field7652, var5 + var7 * Class6352.method19337(this.field7654), this.field7653);
         }
      }
   }
}
