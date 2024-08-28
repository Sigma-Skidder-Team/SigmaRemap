package mapped;

public final class Class1485 implements Runnable {
   private static String[] field7991;
   public final long field7992;
   public final long field7993;
   public final Class2379 field7994;
   public final long field7995;
   public final String[] field7996;
   public final int field7997;

   public Class1485(long var1, long var3, Class2379 var5, long var6, String[] var8, int var9) {
      this.field7992 = var1;
      this.field7993 = var3;
      this.field7994 = var5;
      this.field7995 = var6;
      this.field7996 = var8;
      this.field7997 = var9;
   }

   @Override
   public void run() {
      for (long var3 = this.field7992; var3 < this.field7993; var3++) {
         this.field7994.method9670(this.field7995 + var3, this.field7996[this.field7997 + (int)var3]);
      }
   }
}
