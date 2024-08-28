package mapped;

import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Class7138 extends Class7139 {
   public static final Codec<Class7138> field30694 = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(Class7138::new, var0 -> var0.field30695).codec();
   private final float field30695;

   public Class7138(float var1) {
      this.field30695 = var1;
   }

   @Override
   public Class9542<?> method22268() {
      return Class9542.field44430;
   }

   @Override
   public void method22269(Class1658 var1, Random var2, List<BlockPos> var3, List<BlockPos> var4, Set<BlockPos> var5, Class9764 var6) {
      if (!(var2.nextFloat() >= this.field30695)) {
         int var9 = ((BlockPos)var3.get(0)).getY();
         var3.stream()
            .filter(var1x -> var1x.getY() - var9 <= 2)
            .forEach(
               var5x -> {
                  for (Direction var9x : Class76.field161) {
                     if (var2.nextFloat() <= 0.25F) {
                        Direction var10 = var9x.method536();
                        BlockPos var11 = var5x.method8336(var10.method539(), 0, var10.method541());
                        if (Class2898.method11221(var1, var11)) {
                           Class7380 var12 = Blocks.COCOA
                              .method11579()
                              .method23465(Class3197.field18479, Integer.valueOf(var2.nextInt(3)))
                              .method23465(Class3197.field18484, var9x);
                           this.method22274(var1, var11, var12, var5, var6);
                        }
                     }
                  }
               }
            );
      }
   }
}
