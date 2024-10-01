package mapped;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.util.math.BlockPos;

import java.util.List;
import java.util.Random;
import java.util.Set;

public class Class6897 extends Class6896 {
   private static String[] field29888;
   public static final Codec<Class6897> field29889 = RecordCodecBuilder.create(var0 -> method21063(var0).apply(var0, Class6897::new));

   public Class6897(int var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   @Override
   public Class9107<?> method21064() {
      return Class9107.field41831;
   }

   @Override
   public List<Class9359> method21065(Class1679 var1, Random var2, int var3, BlockPos var4, Set<BlockPos> var5, Class9764 var6, Class4733 var7) {
      method21069(var1, var4.down());

      for (int var10 = 0; var10 < var3; var10++) {
         method21070(var1, var2, var4.up(var10), var5, var6, var7);
      }

      return ImmutableList.of(new Class9359(var4.up(var3), 0, false));
   }
}
