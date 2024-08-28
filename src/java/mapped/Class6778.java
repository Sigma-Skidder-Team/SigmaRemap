package mapped;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;

public class Class6778 extends Class6777 {
   private static final Class7380 field29564 = Class8487.field36581.method11579();
   private static final Class7380 field29565 = Class8487.field36582.method11579();
   private static final Class7380 field29566 = Class8487.field36417.method11579();
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
