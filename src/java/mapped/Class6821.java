package mapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.util.math.BlockPos;

import java.util.Random;
import java.util.Set;

public class Class6821 extends Class6819 {
   private static String[] field29690;
   public static final Codec<Class6821> field29691 = RecordCodecBuilder.create(var0 -> method20792(var0).apply(var0, Class6821::new));

   public Class6821(Class8045 var1, Class8045 var2) {
      super(var1, var2);
   }

   @Override
   public Class5984<?> method20785() {
      return Class5984.field26062;
   }

   @Override
   public void method20786(
           Class1679 var1, Random var2, Class4733 var3, int var4, Class9359 var5, int var6, int var7, Set<BlockPos> var8, int var9, Class9764 var10
   ) {
      boolean var13 = var5.method35439();
      BlockPos var14 = var5.method35437().up(var9);
      this.method20796(var1, var2, var3, var14, var7 + var5.method35438(), var8, -1 - var6, var13, var10);
      this.method20796(var1, var2, var3, var14, var7 - 1, var8, -var6, var13, var10);
      this.method20796(var1, var2, var3, var14, var7 + var5.method35438() - 1, var8, 0, var13, var10);
   }

   @Override
   public int method20788(Random var1, int var2, Class4733 var3) {
      return 0;
   }

   @Override
   public boolean method20789(Random var1, int var2, int var3, int var4, int var5, boolean var6) {
      return var3 != 0 ? var2 == var5 && var4 == var5 && var5 > 0 : (var2 > 1 || var4 > 1) && var2 != 0 && var4 != 0;
   }
}
