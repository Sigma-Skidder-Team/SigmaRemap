package mapped;

public final class Class1477 implements Runnable {
   private static String[] field7947;
   public final long field7948;
   public final long field7949;
   public final Class2384 field7950;
   public final long field7951;
   public final Object[] field7952;
   public final int field7953;

   public Class1477(long var1, long var3, Class2384 var5, long var6, Object[] var8, int var9) {
      this.field7948 = var1;
      this.field7949 = var3;
      this.field7950 = var5;
      this.field7951 = var6;
      this.field7952 = var8;
      this.field7953 = var9;
   }

   @Override
   public void run() {
      for (long var3 = this.field7948; var3 < this.field7949; var3++) {
         this.field7950.method9670(this.field7951 + var3, this.field7952[this.field7953 + (int)var3]);
      }
   }
}
