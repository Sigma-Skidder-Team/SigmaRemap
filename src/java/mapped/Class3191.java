package mapped;

import com.google.common.collect.ImmutableMap;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;

import java.util.List;
import java.util.Map;
import java.util.Random;

public class Class3191 {
   private static final ResourceLocation field18453 = new ResourceLocation("igloo/top");
   private static final ResourceLocation field18454 = new ResourceLocation("igloo/middle");
   private static final ResourceLocation field18455 = new ResourceLocation("igloo/bottom");
   private static final Map<ResourceLocation, BlockPos> field18456 = ImmutableMap.of(
      field18453, new BlockPos(3, 5, 5), field18454, new BlockPos(1, 3, 1), field18455, new BlockPos(3, 6, 7)
   );
   private static final Map<ResourceLocation, BlockPos> field18457 = ImmutableMap.of(
      field18453, BlockPos.ZERO, field18454, new BlockPos(2, -3, 4), field18455, new BlockPos(0, -3, -2)
   );

   public static void method11407(Class8761 var0, BlockPos var1, Class80 var2, List<Class4178> var3, Random var4) {
      if (var4.nextDouble() < 0.5) {
         int var7 = var4.nextInt(8) + 4;
         var3.add(new Class4185(var0, field18455, var1, var2, var7 * 3));

         for (int var8 = 0; var8 < var7 - 1; var8++) {
            var3.add(new Class4185(var0, field18454, var1, var2, var8 * 3));
         }
      }

      var3.add(new Class4185(var0, field18453, var1, var2, 0));
   }

   // $VF: synthetic method
   public static Map method11408() {
      return field18457;
   }

   // $VF: synthetic method
   public static Map method11409() {
      return field18456;
   }

   // $VF: synthetic method
   public static ResourceLocation method11410() {
      return field18453;
   }
}
