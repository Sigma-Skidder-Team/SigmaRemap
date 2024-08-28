package mapped;

import com.mojang.serialization.Codec;

public class Class9654<P extends Class6698> {
   public static final Class9654<Class6700> field45131 = method37703("simple_state_provider", Class6700.field29333);
   public static final Class9654<Class6699> field45132 = method37703("weighted_state_provider", Class6699.field29331);
   public static final Class9654<Class6697> field45133 = method37703("plain_flower_provider", Class6697.field29326);
   public static final Class9654<Class6702> field45134 = method37703("forest_flower_provider", Class6702.field29338);
   public static final Class9654<Class6701> field45135 = method37703("rotated_block_provider", Class6701.field29335);
   private final Codec<P> field45136;

   private static <P extends Class6698> Class9654<P> method37703(String var0, Codec<P> var1) {
      return Registry.<Class9654<P>>method9194(Registry.field16129, var0, new Class9654<P>(var1));
   }

   private Class9654(Codec<P> var1) {
      this.field45136 = var1;
   }

   public Codec<P> method37704() {
      return this.field45136;
   }
}
