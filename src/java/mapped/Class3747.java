package mapped;

import com.google.common.collect.ImmutableMap;
import net.minecraft.world.server.ServerWorld;

public class Class3747<E extends PiglinEntity> extends Class3676<E> {
   private static String[] field19891;
   private final int field19892;

   public Class3747(int var1) {
      super(
         ImmutableMap.of(
            Class8830.field39847,
            Class2217.field14484,
            Class8830.field39851,
            Class2217.field14485,
            Class8830.field39854,
            Class2217.field14485,
            Class8830.field39853,
            Class2217.field14485
         )
      );
      this.field19892 = var1;
   }

   public boolean method12508(ServerWorld var1, E var2) {
      ItemEntity var5 = var2.getBrain().<ItemEntity>method21410(Class8830.field39847).get();
      return Class4388.method13827(var5.method4124().getItem());
   }

   public void method12502(ServerWorld var1, E var2, long var3) {
      var2.getBrain().method21407(Class8830.field39851, true, (long)this.field19892);
   }
}
