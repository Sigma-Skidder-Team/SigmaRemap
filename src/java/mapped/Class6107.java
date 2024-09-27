package mapped;

public final class Class6107 implements Class6105 {
   private static String[] field27363;

   @Override
   public Class8600 method18869(Class8600 var1, Integer[] var2) {
      int var5 = var2[0];
      int var6 = (var5 & 4095) << 4 | var5 >> 12 & 15;
      int var7 = Class7795.method25886(var6);
      var1.method30773().add(new Class9231(BruhMotha.field22544, var7));
      return var1;
   }
}
