package mapped;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;

public class Class6778 extends Class6777 {
   private static final Class7380 field29564 = Blocks.SOUL_SAND.method11579();
   private static final Class7380 field29565 = Blocks.SOUL_SOIL.method11579();
   private static final Class7380 field29566 = Blocks.GRAVEL.method11579();
   private static final ImmutableList<Class7380> field29567 = ImmutableList.of(field29564, field29565);

   public Class6778(Codec<Class8278> var1) {
      super(var1);
   }

   @Override
   public ImmutableList<Class7380> method20662() {
      return field29567;
   }

   @Override
   public ImmutableList<Class7380> method20663() {
      return field29567;
   }

   @Override
   public Class7380 method20664() {
      return field29566;
   }
}
