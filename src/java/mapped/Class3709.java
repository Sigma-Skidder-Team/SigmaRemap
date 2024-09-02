package mapped;

import com.google.common.collect.ImmutableMap;
import net.minecraft.entity.LivingEntity;
import net.minecraft.world.server.ServerWorld;

public class Class3709 extends Class3676<LivingEntity> {
   private static String[] field19773;
   private final int field19774;

   public Class3709(Class8830<?> var1, int var2) {
      super(ImmutableMap.of(Class8830.field39826, Class2217.field14486, Class8830.field39871, Class2217.field14485, var1, Class2217.field14484));
      this.field19774 = var2;
   }

   @Override
   public void method12502(ServerWorld var1, LivingEntity var2, long var3) {
      var2.method2992().method21407(Class8830.field39871, true, (long)this.field19774);
      var2.method2992().method21405(Class8830.field39826);
   }
}
