package mapped;

import com.mojang.serialization.Codec;

public class Class9455 {
   private static String[] field43935;
   public static final Codec<Class9455> field43936 = ResourceLocation.field13020.xmap(Class9455::new, var0 -> var0.field43937);
   private final ResourceLocation field43937;

   public Class9455(ResourceLocation var1) {
      this.field43937 = var1;
   }

   public ResourceLocation method36383() {
      return this.field43937;
   }
}
