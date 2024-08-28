package mapped;

import java.util.ArrayList;
import java.util.List;

public class Class5419 implements Class5402 {
   public List<Object> method17013(Object var1, Class6051 var2) throws Exception {
      if (!(var1 instanceof Class8563)) {
         throw new IllegalArgumentException("The default packet has to be a PacketWrapper for transformMapChunkBulk, unexpected " + var1.getClass());
      } else {
         ArrayList var5 = new ArrayList();
         Class8563 var6 = (Class8563)var1;
         boolean var7 = var6.<Boolean>method30559(Class4750.field22524);
         int var8 = var6.<Integer>method30559(Class4750.field22544);
         Class9384[] var9 = new Class9384[var8];

         for (int var10 = 0; var10 < var8; var10++) {
            var9[var10] = Class9384.method35610(var6, var7);
         }

         for (Class9384 var13 : var9) {
            Class4746 var14 = new Class4746(var13.method35617());
            var13.method35620(var6.<byte[]>method30559(var14));
            Class8563 var15 = new Class8563(33, null, var6.method30580());
            var15.method30560(Class4750.field22526, var13.method35611());
            var15.method30560(Class4750.field22526, var13.method35613());
            var15.method30560(Class4750.field22524, true);
            var15.method30560(Class4750.field22536, var13.method35615());
            var15.method30560(Class4750.field22544, var13.method35617());
            var15.method30560(var14, var13.method35619());
            var2.method18739().add(Class6051.method18736(var13.method35611(), var13.method35613()));
            var5.add(var15);
         }

         return var5;
      }
   }

   public boolean method17014(Class<?> var1) {
      return false;
   }

   public boolean method17015() {
      return true;
   }
}
