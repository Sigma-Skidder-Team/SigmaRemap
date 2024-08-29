package mapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.util.math.BlockPos;

import java.util.Random;
import java.util.Set;

public class Class6818 extends Class6819 {
   public static final Codec<Class6818> field29683 = RecordCodecBuilder.create(
      var0 -> method20792(var0).and(Class8045.method27630(0, 16, 8).fieldOf("height").forGetter(var0x -> var0x.field29684)).apply(var0, Class6818::new)
   );
   private final Class8045 field29684;

   public Class6818(Class8045 var1, Class8045 var2, Class8045 var3) {
      super(var1, var2);
      this.field29684 = var3;
   }

   @Override
   public Class5984<?> method20785() {
      return Class5984.field26061;
   }

   @Override
   public void method20786(
           Class1679 var1, Random var2, Class4733 var3, int var4, Class9359 var5, int var6, int var7, Set<BlockPos> var8, int var9, Class9764 var10
   ) {
      int var13 = 0;

      for (int var14 = var9; var14 >= var9 - var6; var14--) {
         this.method20796(var1, var2, var3, var5.method35437(), var13, var8, var14, var5.method35439(), var10);
         if (var13 >= 1 && var14 == var9 - var6 + 1) {
            var13--;
         } else if (var13 < var7 + var5.method35438()) {
            var13++;
         }
      }
   }

   @Override
   public int method20787(Random var1, int var2) {
      return super.method20787(var1, var2) + var1.nextInt(var2 + 1);
   }

   @Override
   public int method20788(Random var1, int var2, Class4733 var3) {
      return this.field29684.method27633(var1);
   }

   @Override
   public boolean method20789(Random var1, int var2, int var3, int var4, int var5, boolean var6) {
      return var2 == var5 && var4 == var5 && var5 > 0;
   }
}
