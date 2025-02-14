package mapped;

public enum Class1852 implements Class1833, Class1827 {
   field9870;

   private static final Class1852[] field9871 = new Class1852[]{field9870};

   @Override
   public int method8083(Class6661 var1, Class7899 var2, Class7899 var3, int var4, int var5) {
      int var8 = var2.method26471(this.method8075(var4), this.method8076(var5));
      int var9 = var3.method26471(this.method8075(var4), this.method8076(var5));
      if (Class9320.method35218(var8)) {
         return var8;
      } else if (var9 != 7) {
         return var8;
      } else if (var8 == 12) {
         return 11;
      } else {
         return var8 != 14 && var8 != 15 ? var9 & 0xFF : 15;
      }
   }
}
