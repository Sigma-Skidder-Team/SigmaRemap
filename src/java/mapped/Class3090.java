package mapped;

import java.util.List;

public class Class3090 implements Class2982 {
   private static String[] field18269;
   public final Class3962 field18270;

   public Class3090(Class3962 var1) {
      this.field18270 = var1;
   }

   @Override
   public void method11398(Class8563 var1) throws Exception {
      Class6047 var4 = var1.method30580().<Class6047>method22438(Class6047.class);
      Class4825 var5 = new Class4825(var4);
      Class8173 var6 = var1.<Class8173>method30561(var5);
      List var7 = var6.method28451();

      for (int var8 = 0; var8 < var6.method28446().length; var8++) {
         Class8225 var9 = var6.method28446()[var8];
         if (var9 != null) {
            for (int var10 = 0; var10 < 16; var10++) {
               for (int var11 = 0; var11 < 16; var11++) {
                  for (int var12 = 0; var12 < 16; var12++) {
                     int var13 = var9.method28624(var12, var10, var11);
                     if (Class9572.method37137(var13)) {
                        var7.add(Class9572.method37138(var12 + (var6.method28440() << 4), var10 + (var8 << 4), var11 + (var6.method28441() << 4), var13));
                     }
                  }
               }
            }
         }
      }

      var1.method30560(Class4750.field22556, var6.method28451().<Class72>toArray(new Class72[0]));
   }
}
