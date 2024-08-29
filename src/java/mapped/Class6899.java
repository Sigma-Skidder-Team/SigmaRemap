package mapped;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Class6899 extends Class6896 {
   private static String[] field29892;
   public static final Codec<Class6899> field29893 = RecordCodecBuilder.create(var0 -> method21063(var0).apply(var0, Class6899::new));

   public Class6899(int var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   @Override
   public Class9107<?> method21064() {
      return Class9107.field41833;
   }

   @Override
   public List<Class9359> method21065(Class1679 var1, Random var2, int var3, BlockPos var4, Set<BlockPos> var5, Class9764 var6, Class4733 var7) {
      BlockPos var10 = var4.down();
      method21069(var1, var10);
      method21069(var1, var10.east());
      method21069(var1, var10.south());
      method21069(var1, var10.south().east());
      Mutable var11 = new Mutable();

      for (int var12 = 0; var12 < var3; var12++) {
         method21084(var1, var2, var11, var5, var6, var7, var4, 0, var12, 0);
         if (var12 < var3 - 1) {
            method21084(var1, var2, var11, var5, var6, var7, var4, 1, var12, 0);
            method21084(var1, var2, var11, var5, var6, var7, var4, 1, var12, 1);
            method21084(var1, var2, var11, var5, var6, var7, var4, 0, var12, 1);
         }
      }

      return ImmutableList.of(new Class9359(var4.method8339(var3), 0, true));
   }

   private static void method21084(
           Class1679 var0, Random var1, Mutable var2, Set<BlockPos> var3, Class9764 var4, Class4733 var5, BlockPos var6, int var7, int var8, int var9
   ) {
      var2.method8378(var6, var7, var8, var9);
      method21071(var0, var1, var2, var3, var4, var5);
   }
}
