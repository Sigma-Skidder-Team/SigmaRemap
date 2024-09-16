package mapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;

import java.util.Random;
import java.util.Set;

public class Class6822 extends Class6819 {
   public static final Codec<Class6822> field29692 = RecordCodecBuilder.create(
      var0 -> method20792(var0).and(Class8045.method27630(0, 16, 8).fieldOf("crown_height").forGetter(var0x -> var0x.field29693)).apply(var0, Class6822::new)
   );
   private final Class8045 field29693;

   public Class6822(Class8045 var1, Class8045 var2, Class8045 var3) {
      super(var1, var2);
      this.field29693 = var3;
   }

   @Override
   public Class5984<?> method20785() {
      return Class5984.field26066;
   }

   @Override
   public void method20786(
           Class1679 var1, Random var2, Class4733 var3, int var4, Class9359 var5, int var6, int var7, Set<BlockPos> var8, int var9, Class9764 var10
   ) {
      BlockPos var13 = var5.method35437();
      int var14 = 0;

      for (int var15 = var13.getY() - var6 + var9; var15 <= var13.getY() + var9; var15++) {
         int var16 = var13.getY() - var15;
         int var17 = var7 + var5.method35438() + MathHelper.method37767((float)var16 / (float)var6 * 3.5F);
         int var18;
         if (var16 > 0 && var17 == var14 && (var15 & 1) == 0) {
            var18 = var17 + 1;
         } else {
            var18 = var17;
         }

         this.method20796(var1, var2, var3, new BlockPos(var13.getX(), var15, var13.getZ()), var18, var8, 0, var5.method35439(), var10);
         var14 = var17;
      }
   }

   @Override
   public int method20788(Random var1, int var2, Class4733 var3) {
      return this.field29693.method27633(var1);
   }

   @Override
   public boolean method20789(Random var1, int var2, int var3, int var4, int var5, boolean var6) {
      return var2 + var4 < 7 ? var2 * var2 + var4 * var4 > var5 * var5 : true;
   }
}
