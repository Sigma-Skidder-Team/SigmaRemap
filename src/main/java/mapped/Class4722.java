package mapped;

import com.mojang.serialization.Codec;

public class Class4722 implements Class4716 {
   public static final Codec<Class4722> field22380 = Codec.INT.fieldOf("chance").xmap(Class4722::new, var0 -> var0.field22381).codec();
   public final int field22381;

   public Class4722(int var1) {
      this.field22381 = var1;
   }
}
