package mapped;

import com.google.common.collect.ImmutableMap;

public class Class3679 extends Class3676<Class880> {
   private static String[] field19691;

   public Class3679() {
      super(ImmutableMap.of(Class8830.field39816, Class2217.field14484));
   }

   @Override
   public boolean method12508(ServerWorld var1, Class880 var2) {
      return var1.field9016.nextFloat() > 0.95F;
   }

   @Override
   public void method12502(ServerWorld var1, Class880 var2, long var3) {
      Class6947<?> var7 = var2.method2992();
      BlockPos var8 = var7.method21410(Class8830.field39816).get().method35579();
      if (var8.method8316(var2.getPosition(), 3.0)) {
         BlockState var9 = var1.getBlockState(var8);
         if (var9.method23448(Blocks.field37064)) {
            Class3369 var10 = (Class3369)var9.getBlock();
            var10.method11962(var1, var8, (Direction)null);
         }
      }
   }
}
