package mapped;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;

public class Class6779 extends Class6777 {
   private static final Class7380 field29568 = Blocks.BASALT.method11579();
   private static final Class7380 field29569 = Blocks.field37130.method11579();
   private static final Class7380 field29570 = Blocks.GRAVEL.method11579();
   private static final ImmutableList<Class7380> field29571 = ImmutableList.of(field29568, field29569);
   private static final ImmutableList<Class7380> field29572 = ImmutableList.of(field29568);

   public Class6779(Codec<Class8278> var1) {
      super(var1);
   }

   @Override
   public ImmutableList<Class7380> method20662() {
      return field29571;
   }

   @Override
   public ImmutableList<Class7380> method20663() {
      return field29572;
   }

   @Override
   public Class7380 method20664() {
      return field29570;
   }
}
