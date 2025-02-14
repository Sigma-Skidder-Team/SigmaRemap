package mapped;

public enum Class1841 implements Class1836 {
   field9852;

   private static final Class1841[] field9853 = new Class1841[]{field9852};

   @Override
   public int method8088(Class6661 var1, int var2, int var3, int var4, int var5, int var6) {
      int var9 = method8091(var6);
      return var9 == method8091(var5) && var9 == method8091(var2) && var9 == method8091(var3) && var9 == method8091(var4) ? -1 : 7;
   }

   private static int method8091(int var0) {
      return var0 < 2 ? var0 : 2 + (var0 & 1);
   }
}
