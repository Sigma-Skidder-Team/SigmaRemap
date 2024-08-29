package mapped;

import com.google.common.collect.ImmutableMap;
import java.util.function.Predicate;

public class Class3699 extends Class3676<Class880> {
   private static String[] field19747;
   private final Class8830<Class9378> field19748;
   private final Predicate<Class4913> field19749;

   public Class3699(Class4913 var1, Class8830<Class9378> var2) {
      super(ImmutableMap.of(var2, Class2217.field14484));
      this.field19749 = var1.method15182();
      this.field19748 = var2;
   }

   @Override
   public boolean method12508(ServerWorld var1, Class880 var2) {
      Class9378 var5 = var2.method2992().<Class9378>method21410(this.field19748).get();
      return var1.getDimensionKey() == var5.method35578() && var5.method35579().method8317(var2.getPositionVec(), 16.0);
   }

   @Override
   public void method12502(ServerWorld var1, Class880 var2, long var3) {
      Class6947<?> var7 = var2.method2992();
      Class9378 var8 = var7.method21410(this.field19748).get();
      BlockPos var9 = var8.method35579();
      ServerWorld var10 = var1.getServer().method1318(var8.method35578());
      if (var10 == null || this.method12577(var10, var9)) {
         var7.method21405(this.field19748);
      } else if (this.method12576(var10, var9, var2)) {
         var7.method21405(this.field19748);
         var1.method6951().method6674(var9);
         Class7393.method23615(var1, var9);
      }
   }

   private boolean method12576(ServerWorld var1, BlockPos var2, Class880 var3) {
      BlockState var6 = var1.getBlockState(var2);
      return var6.getBlock().method11540(BlockTags.field32770) && var6.<Boolean>method23463(Class3250.field18714) && !var3.isSleeping();
   }

   private boolean method12577(ServerWorld var1, BlockPos var2) {
      return !var1.method6951().method6675(var2, this.field19749);
   }
}
