package mapped;

import net.minecraft.util.math.BlockPos;

import java.util.List;
import java.util.Random;

public class Class4203 extends Class4194 {
   private static String[] field20510;

   public Class4203(int var1, Random var2, Class9764 var3, Direction var4) {
      super(Class7792.field33456, var1);
      this.method12939(var4);
      this.field20495 = this.method12985(var2);
      this.field20444 = var3;
   }

   public Class4203(Class8761 var1, CompoundNBT var2) {
      super(Class7792.field33456, var2);
   }

   @Override
   public void method12894(Class4178 var1, List<Class4178> var2, Random var3) {
      this.method12986((Class4196)var1, var2, var3, 1, 1);
   }

   public static Class4203 method12996(List<Class4178> var0, Random var1, int var2, int var3, int var4, Direction var5, int var6) {
      Class9764 var9 = Class9764.method38388(var2, var3, var4, -1, -7, 0, 5, 11, 8, var5);
      return method12989(var9) && Class4178.method12918(var0, var9) == null ? new Class4203(var6, var1, var9, var5) : null;
   }

   @Override
   public boolean method12896(Class1658 var1, Class7480 var2, ChunkGenerator var3, Random var4, Class9764 var5, Class7481 var6, BlockPos var7) {
      this.method12928(var1, var5, 0, 0, 0, 4, 10, 7, true, var4, Class9331.method35288());
      this.method12984(var1, var4, var5, this.field20495, 1, 7, 0);
      this.method12984(var1, var4, var5, Class2213.field14470, 1, 1, 7);
      BlockState var10 = Blocks.COBBLESTONE_STAIRS.method11579().method23465(Class3421.field19131, Direction.SOUTH);

      for (int var11 = 0; var11 < 6; var11++) {
         this.method12923(var1, var10, 1, 6 - var11, 1 + var11, var5);
         this.method12923(var1, var10, 2, 6 - var11, 1 + var11, var5);
         this.method12923(var1, var10, 3, 6 - var11, 1 + var11, var5);
         if (var11 < 5) {
            this.method12923(var1, Blocks.field36615.method11579(), 1, 5 - var11, 1 + var11, var5);
            this.method12923(var1, Blocks.field36615.method11579(), 2, 5 - var11, 1 + var11, var5);
            this.method12923(var1, Blocks.field36615.method11579(), 3, 5 - var11, 1 + var11, var5);
         }
      }

      return true;
   }
}
