package mapped;

import com.google.common.collect.ImmutableMap;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;

public class Class3748<E extends Class1006> extends Class3676<E> {
   private static String[] field19893;
   private final int field19894;
   private final float field19895;

   public Class3748(int var1, float var2) {
      super(
         ImmutableMap.of(
            Class8830.field39856,
            Class2217.field14484,
            Class8830.field39826,
            Class2217.field14485,
            Class8830.field39824,
            Class2217.field14485,
            Class8830.field39825,
            Class2217.field14486
         )
      );
      this.field19894 = var1;
      this.field19895 = var2;
   }

   public void method12502(ServerWorld var1, Class1006 var2, long var3) {
      BlockPos var7 = method12709(var2);
      boolean var8 = var7.method8316(var2.getPosition(), (double)this.field19894);
      if (!var8) {
         Class6983.method21577(var2, method12707(var2, var7), this.field19895, this.field19894);
      }
   }

   private static BlockPos method12707(Class1006 var0, BlockPos var1) {
      Random var4 = var0.world.rand;
      return var1.method8336(method12708(var4), 0, method12708(var4));
   }

   private static int method12708(Random var0) {
      return var0.nextInt(3) - 1;
   }

   private static BlockPos method12709(Class1006 var0) {
      return var0.getBrain().<BlockPos>method21410(Class8830.field39856).get();
   }
}
