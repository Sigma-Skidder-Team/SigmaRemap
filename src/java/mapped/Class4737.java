package mapped;

import com.mojang.serialization.Codec;

public class Class4737 implements Class4698 {
   public static final Codec<Class4737> field22431 = Codec.BOOL.fieldOf("is_beached").orElse(false).xmap(Class4737::new, var0 -> var0.field22432).codec();
   public final boolean field22432;

   public Class4737(boolean var1) {
      this.field22432 = var1;
   }
}
