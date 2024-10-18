package mapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;

import java.util.Random;
import java.util.Set;

public class Class6820 extends Class6819 {
   public static final Codec<Class6820> field29688 = RecordCodecBuilder.create(
      var0 -> method20792(var0).and(Class8045.method27630(0, 16, 8).fieldOf("trunk_height").forGetter(var0x -> var0x.field29689)).apply(var0, Class6820::new)
   );
   private final Class8045 field29689;

   public Class6820(Class8045 var1, Class8045 var2, Class8045 var3) {
      super(var1, var2);
      this.field29689 = var3;
   }

   @Override
   public Class5984<?> method20785() {
      return Class5984.field26060;
   }

   @Override
   public void method20786(
           Class1679 var1, Random var2, Class4733 var3, int var4, Class9359 var5, int var6, int var7, Set<BlockPos> var8, int var9, MutableBoundingBox var10
   ) {
      BlockPos var13 = var5.method35437();
      int var14 = var2.nextInt(2);
      int var15 = 1;
      byte var16 = 0;

      for (int var17 = var9; var17 >= -var6; var17--) {
         this.method20796(var1, var2, var3, var13, var14, var8, var17, var5.method35439(), var10);
         if (var14 < var15) {
            var14++;
         } else {
            var14 = var16;
            var16 = 1;
            var15 = Math.min(var15 + 1, var7 + var5.method35438());
         }
      }
   }

   @Override
   public int method20788(Random var1, int var2, Class4733 var3) {
      return Math.max(4, var2 - this.field29689.method27633(var1));
   }

   @Override
   public boolean method20789(Random var1, int var2, int var3, int var4, int var5, boolean var6) {
      return var2 == var5 && var4 == var5 && var5 > 0;
   }
}
