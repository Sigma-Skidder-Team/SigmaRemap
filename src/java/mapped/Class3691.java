package mapped;

import com.google.common.collect.ImmutableMap;
import net.minecraft.world.server.ServerWorld;

public class Class3691 extends Class3676<MobEntity> {
   private static String[] field19718;
   private final float field19719;

   public Class3691(float var1) {
      super(ImmutableMap.of());
      this.field19719 = var1;
   }

   public boolean method12508(ServerWorld var1, MobEntity var2) {
      return var2.isInWater() && var2.method3427(FluidTags.field40469) > var2.func_233579_cu_() || var2.isInLava();
   }

   public boolean method12499(ServerWorld var1, MobEntity var2, long var3) {
      return this.method12508(var1, var2);
   }

   public void method12504(ServerWorld var1, MobEntity var2, long var3) {
      if (var2.getRNG().nextFloat() < this.field19719) {
         var2.method4229().method27049();
      }
   }
}
