package mapped;



public class Class6524 extends Class6522 {
   private static String[] field28611;
   private byte[] field28612;

   public void method19781(Class9189 var1) throws AACException {
      boolean var4 = var1.method34399();
      int var5 = var1.method34397(8);
      if (var5 == 255) {
         var5 += var1.method34397(8);
      }

      if (var4) {
         var1.method34392();
      }

      this.field28612 = new byte[var5];

      for (int var6 = 0; var6 < var5; var6++) {
         this.field28612[var6] = (byte)var1.method34397(8);
      }
   }
}
