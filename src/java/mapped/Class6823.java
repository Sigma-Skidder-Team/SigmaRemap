package mapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;

import java.util.Random;
import java.util.Set;

public class Class6823 extends Class6819 {
   private static String[] field29694;
   public static final Codec<Class6823> field29695 = RecordCodecBuilder.create(var0 -> method20792(var0).apply(var0, Class6823::new));

   public Class6823(Class8045 var1, Class8045 var2) {
      super(var1, var2);
   }

   @Override
   public Class5984<?> method20785() {
      return Class5984.field26067;
   }

   @Override
   public void method20786(
           IWorldGenerationReader var1, Random var2, Class4733 var3, int var4, Class9359 var5, int var6, int var7, Set<BlockPos> var8, int var9, MutableBoundingBox var10
   ) {
      BlockPos var13 = var5.method35437().up(var9);
      boolean var14 = var5.method35439();
      if (!var14) {
         this.method20796(var1, var2, var3, var13, var7 + 2, var8, -1, var14, var10);
         this.method20796(var1, var2, var3, var13, var7 + 1, var8, 0, var14, var10);
      } else {
         this.method20796(var1, var2, var3, var13, var7 + 2, var8, -1, var14, var10);
         this.method20796(var1, var2, var3, var13, var7 + 3, var8, 0, var14, var10);
         this.method20796(var1, var2, var3, var13, var7 + 2, var8, 1, var14, var10);
         if (var2.nextBoolean()) {
            this.method20796(var1, var2, var3, var13, var7, var8, 2, var14, var10);
         }
      }
   }

   @Override
   public int method20788(Random var1, int var2, Class4733 var3) {
      return 4;
   }

   @Override
   public boolean method20795(Random var1, int var2, int var3, int var4, int var5, boolean var6) {
      return var3 == 0 && var6 && (var2 == -var5 || var2 >= var5) && (var4 == -var5 || var4 >= var5)
         ? true
         : super.method20795(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public boolean method20789(Random var1, int var2, int var3, int var4, int var5, boolean var6) {
      if (var3 == -1 && !var6) {
         return var2 == var5 && var4 == var5;
      } else {
         return var3 != 1 ? false : var2 + var4 > var5 * 2 - 2;
      }
   }
}
