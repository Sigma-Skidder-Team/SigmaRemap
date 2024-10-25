package mapped;



public final class Class9340 {
   private static String[] field43363;
   private static final long field43364 = 1094994246L;
   private long field43365;
   private boolean field43366;
   private byte[] field43367 = new byte[9];
   private boolean field43368;
   private boolean field43369;
   private boolean field43370;
   private int field43371;
   private int field43372;
   private int[] field43373;
   private Class6525[] field43374;

   public static boolean method35345(Class9189 var0) throws AACException {
      return (long)var0.method34400(32) == 1094994246L;
   }

   private Class9340() {
   }

   public static Class9340 method35346(Class9189 var0) throws AACException {
      Class9340 var3 = new Class9340();
      var3.method35347(var0);
      return var3;
   }

   private void method35347(Class9189 var1) throws AACException {
      this.field43365 = (long)var1.method34397(32);
      this.field43366 = var1.method34399();
      if (this.field43366) {
         for (int var4 = 0; var4 < 9; var4++) {
            this.field43367[var4] = (byte)var1.method34397(8);
         }
      }

      this.field43368 = var1.method34399();
      this.field43369 = var1.method34399();
      this.field43370 = var1.method34399();
      this.field43371 = var1.method34397(23);
      this.field43372 = var1.method34397(4) + 1;
      this.field43374 = new Class6525[this.field43372];
      this.field43373 = new int[this.field43372];

      for (int var5 = 0; var5 < this.field43372; var5++) {
         if (!this.field43370) {
            this.field43373[var5] = var1.method34397(20);
         } else {
            this.field43373[var5] = -1;
         }

         this.field43374[var5] = new Class6525();
         this.field43374[var5].method19782(var1);
      }
   }

   public Class6525 method35348() {
      return this.field43374[0];
   }
}
