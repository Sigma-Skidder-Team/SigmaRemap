package mapped;

import com.mojang.serialization.Codec;

import java.util.Random;

public class Class2922 extends Class2921<Class4703> {
   public Class2922(Codec<Class4703> var1) {
      super(var1);
   }

   public boolean method11251(Class1660 var1, BlockPos var2, Class4703 var3) {
      return !var3.field22309.contains(var1.getBlockState(var2));
   }

   public int method11252(Class4703 var1) {
      return var1.field22310;
   }

   public BlockPos method11253(Random var1, BlockPos var2, Class4703 var3) {
      return var2.method8336(
         var1.nextInt(var3.field22311) - var1.nextInt(var3.field22311),
         var1.nextInt(var3.field22312) - var1.nextInt(var3.field22312),
         var1.nextInt(var3.field22313) - var1.nextInt(var3.field22313)
      );
   }

   public BlockState method11254(Random var1, BlockPos var2, Class4703 var3) {
      return var3.field22306.method20424(var1, var2);
   }
}
