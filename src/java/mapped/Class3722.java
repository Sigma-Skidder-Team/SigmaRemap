package mapped;

import com.google.common.collect.ImmutableMap;
import net.minecraft.world.server.ServerWorld;

public class Class3722<E extends Class1034> extends Class3676<E> {
   private static String[] field19807;

   public Class3722() {
      super(ImmutableMap.of(Class8830.field39851, Class2217.field14485));
   }

   public boolean method12508(ServerWorld var1, E var2) {
      return !var2.method3091().isEmpty() && var2.method3091().getItem() != Items.field38119;
   }

   public void method12502(ServerWorld var1, E var2, long var3) {
      Class4388.method13817(var2, true);
   }
}
