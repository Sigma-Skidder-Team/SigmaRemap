package mapped;

import com.google.common.collect.ImmutableMap;
import net.minecraft.world.server.ServerWorld;

import java.util.Optional;

public class Class3743<E extends Class1034> extends Class3676<E> {
   private static String[] field19877;
   private final int field19878;

   public Class3743(int var1) {
      super(ImmutableMap.of(Class8830.field39851, Class2217.field14484, Class8830.field39847, Class2217.field14486));
      this.field19878 = var1;
   }

   public boolean method12508(ServerWorld var1, E var2) {
      if (var2.method3091().isEmpty()) {
         Optional var5 = var2.getBrain().<ItemEntity>method21410(Class8830.field39847);
         return var5.isPresent() ? !((ItemEntity)var5.get()).isEntityInRange(var2, (double)this.field19878) : true;
      } else {
         return false;
      }
   }

   public void method12502(ServerWorld var1, E var2, long var3) {
      var2.getBrain().method21405(Class8830.field39851);
   }
}
