package mapped;

import com.mojang.serialization.Codec;
import java.util.Random;
import javax.annotation.Nullable;

public class Class7094 extends Class7092 {
   public static final Codec<Class7094> field30523 = Codec.FLOAT.fieldOf("integrity").orElse(1.0F).xmap(Class7094::new, var0 -> var0.field30524).codec();
   private final float field30524;

   public Class7094(float var1) {
      this.field30524 = var1;
   }

   @Nullable
   @Override
   public Class8266 method22068(Class1662 var1, BlockPos var2, BlockPos var3, Class8266 var4, Class8266 var5, Class9463 var6) {
      Random var9 = var6.method36439(var5.field35530);
      return !(this.field30524 >= 1.0F) && !(var9.nextFloat() <= this.field30524) ? null : var5;
   }

   @Override
   public Class7525<?> method22069() {
      return Class7525.field32295;
   }
}
