package mapped;

public final class Class6106 implements Class6105 {
   private static String[] field27362;

   @Override
   public Class8600 method18869(Class8600 var1, Integer[] var2) {
      Class9738 var5;
      if (var2.length != 1) {
         if (var2.length != 2) {
            return var1;
         }

         var5 = new Class9738(var2[0], (byte)1, var2[1].shortValue(), null);
      } else {
         var5 = new Class9738(var2[0], (byte)1, (short)0, null);
      }

      Class9687.method37923(var5);
      var1.method30773().add(new Class9231(Class4750.field22568, var5));
      return var1;
   }
}
