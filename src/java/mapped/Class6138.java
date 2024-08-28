package mapped;

import it.unimi.dsi.fastutil.ints.Int2IntFunction;

public class Class6138<S extends Class944> implements Class6139<S, Int2IntFunction> {
   private static String[] field27536;

   public Int2IntFunction method19043(S var1, S var2) {
      return var2x -> {
         if (!Class8564.method30596()) {
            int var5 = Class264.method944(var1.method3734(), var1.method3774());
            int var6 = Class264.method944(var2.method3734(), var2.method3774());
            int var7 = Class1699.method7322(var5);
            int var8 = Class1699.method7322(var6);
            int var9 = Class1699.method7323(var5);
            int var10 = Class1699.method7323(var6);
            return Class1699.method7321(Math.max(var7, var8), Math.max(var9, var10));
         } else {
            return Class1699.field9258;
         }
      };
   }

   public Int2IntFunction method19042(S var1) {
      return var0 -> var0;
   }

   public Int2IntFunction method19041() {
      return var0 -> var0;
   }
}
