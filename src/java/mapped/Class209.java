package mapped;

import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class Class209 extends Class208<Class7585> {

   public Class209(Class1704 var1) {
      super(Class1977.field12882, var1, new Class7585(new Long2ObjectOpenHashMap<>()));
   }

   @Override
   public int method702(long var1) {
      long var5 = Class2002.method8419(var1);
      Class6785 var7 = this.method699(var5, false);
      return var7 != null
         ? var7.method20670(
            Class2002.method8397(BlockPos.method8328(var1)),
            Class2002.method8397(BlockPos.method8329(var1)),
            Class2002.method8397(BlockPos.method8330(var1))
         )
         : 0;
   }
}
