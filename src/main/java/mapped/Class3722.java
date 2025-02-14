package mapped;

import com.google.common.collect.ImmutableMap;
import net.minecraft.item.Items;
import net.minecraft.world.server.ServerWorld;

public class Class3722<E extends PiglinEntity> extends Class3676<E> {
   private static String[] field19807;

   public Class3722() {
      super(ImmutableMap.of(MemoryModuleType.field39851, Class2217.field14485));
   }

   public boolean method12508(ServerWorld var1, E var2) {
      return !var2.getHeldItemOffhand().isEmpty() && var2.getHeldItemOffhand().getItem() != Items.field38119;
   }

   public void startExecuting(ServerWorld var1, E var2, long var3) {
      Class4388.method13817(var2, true);
   }
}
