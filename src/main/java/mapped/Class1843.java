package mapped;

public enum Class1843 implements Class1836 {
   field9856;

   private static final Class1843[] field9857 = new Class1843[]{field9856};

   @Override
   public int method8088(Class6661 var1, int var2, int var3, int var4, int var5, int var6) {
      boolean var9 = var3 == var5;
      boolean var10 = var2 == var4;
      if (var9 != var10) {
         return !var9 ? var2 : var5;
      } else if (!var9) {
         return var6;
      } else {
         return var1.method20312(2) != 0 ? var2 : var5;
      }
   }
}
