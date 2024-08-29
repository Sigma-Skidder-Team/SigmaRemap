package mapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Random;

public class Class6699 extends Class6698 {
   public static final Codec<Class6699> field29331 = Class7271.method22836(BlockState.field31585)
      .comapFlatMap(Class6699::method20426, var0 -> var0.field29332)
      .fieldOf("entries")
      .codec();
   private final Class7271<BlockState> field29332;

   private static DataResult<Class6699> method20426(Class7271<BlockState> var0) {
      return !var0.method22840() ? DataResult.success(new Class6699(var0)) : DataResult.error("WeightedStateProvider with no states");
   }

   private Class6699(Class7271<BlockState> var1) {
      this.field29332 = var1;
   }

   @Override
   public Class9654<?> method20423() {
      return Class9654.field45132;
   }

   public Class6699() {
      this(new Class7271<BlockState>());
   }

   public Class6699 method20427(BlockState var1, int var2) {
      this.field29332.method22837(var1, var2);
      return this;
   }

   @Override
   public BlockState method20424(Random var1, BlockPos var2) {
      return this.field29332.method22842(var1);
   }
}
