package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.util.math.BlockPos;

import javax.annotation.Nullable;

public class Class7100 extends Class7092 {
   private static String[] field30540;
   public static final Codec<Class7100> field30541 = Codec.unit(() -> Class7100.field30542);
   public static final Class7100 field30542 = new Class7100();

   private Class7100() {
   }

   @Nullable
   @Override
   public Class8266 method22068(Class1662 var1, BlockPos var2, BlockPos var3, Class8266 var4, Class8266 var5, Class9463 var6) {
      return var5;
   }

   @Override
   public Class7525<?> method22069() {
      return Class7525.field32299;
   }
}
