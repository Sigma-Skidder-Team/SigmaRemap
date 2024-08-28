package mapped;

import com.mojang.serialization.Codec;

public class Class4710 implements Class4698 {
   public static final Codec<Class4710> field22342 = Class6698.field29330.fieldOf("state_provider").xmap(Class4710::new, var0 -> var0.field22343).codec();
   public final Class6698 field22343;

   public Class4710(Class6698 var1) {
      this.field22343 = var1;
   }
}
