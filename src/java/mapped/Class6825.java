package mapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.util.math.BlockPos;

import java.util.Random;
import java.util.Set;

public class Class6825 extends Class6824 {
   private static String[] field29698;
   public static final Codec<Class6825> field29699 = RecordCodecBuilder.create(var0 -> method20805(var0).apply(var0, Class6825::new));

   public Class6825(Class8045 var1, Class8045 var2, int var3) {
      super(var1, var2, var3);
   }

   @Override
   public Class5984<?> method20785() {
      return Class5984.field26064;
   }

   @Override
   public void method20786(
           Class1679 var1, Random var2, Class4733 var3, int var4, Class9359 var5, int var6, int var7, Set<BlockPos> var8, int var9, Class9764 var10
   ) {
      for (int var13 = var9; var13 >= var9 - var6; var13--) {
         int var14 = var7 + (var13 != var9 && var13 != var9 - var6 ? 1 : 0);
         this.method20796(var1, var2, var3, var5.method35437(), var14, var8, var13, var5.method35439(), var10);
      }
   }

   @Override
   public boolean method20789(Random var1, int var2, int var3, int var4, int var5, boolean var6) {
      return MathHelper.method37831((float)var2 + 0.5F) + MathHelper.method37831((float)var4 + 0.5F) > (float)(var5 * var5);
   }
}
