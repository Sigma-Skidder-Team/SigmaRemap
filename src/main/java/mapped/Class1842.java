package mapped;

public enum Class1842 implements Class1836 {
   field9854;

   private static final Class1842[] field9855 = new Class1842[]{field9854};

   @Override
   public int method8088(Class6661 var1, int var2, int var3, int var4, int var5, int var6) {
      if (Class9320.method35219(var6)) {
         int var9 = 0;
         if (Class9320.method35219(var2)) {
            var9++;
         }

         if (Class9320.method35219(var3)) {
            var9++;
         }

         if (Class9320.method35219(var5)) {
            var9++;
         }

         if (Class9320.method35219(var4)) {
            var9++;
         }

         if (var9 > 3) {
            if (var6 != 44) {
               if (var6 != 45) {
                  if (var6 != 0) {
                     if (var6 != 46) {
                        if (var6 != 10) {
                           return 24;
                        }

                        return 50;
                     }

                     return 49;
                  }

                  return 24;
               }

               return 48;
            }

            return 47;
         }
      }

      return var6;
   }
}
