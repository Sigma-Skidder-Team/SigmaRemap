package mapped;

import net.minecraft.client.util.Util;

public enum Class2054 implements Class2051 {
   field13380;

   private static final Class1806 field13381 = Util.<Class1806>make(new Class1806(Class2237.field14626, 5, 8, false), var0 -> {
      for (int var3 = 0; var3 < 8; var3++) {
         for (int var4 = 0; var4 < 5; var4++) {
            boolean var5 = var4 == 0 || var4 + 1 == 5 || var3 == 0 || var3 + 1 == 8;
            var0.method7890(var4, var3, !var5 ? 0 : -1);
         }
      }

      var0.method7908();
   });
   private static final Class2054[] field13382 = new Class2054[]{field13380};

   @Override
   public int method8687() {
      return 5;
   }

   @Override
   public int method8688() {
      return 8;
   }

   @Override
   public float method8689() {
      return 6.0F;
   }

   @Override
   public float method8690() {
      return 1.0F;
   }

   @Override
   public void method8691(int var1, int var2) {
      field13381.method7893(0, var1, var2, false);
   }

   @Override
   public boolean method8692() {
      return true;
   }
}
