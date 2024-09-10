package mapped;

import com.google.common.collect.ImmutableMap;
import net.minecraft.entity.LivingEntity;
import net.minecraft.world.server.ServerWorld;

public class Class3720 extends Class3676<MobEntity> {
   private static String[] field19804;
   private final float field19805;

   public Class3720(float var1) {
      super(
         ImmutableMap.of(
            Class8830.field39824,
            Class2217.field14486,
            Class8830.field39825,
            Class2217.field14486,
            Class8830.field39826,
            Class2217.field14484,
            Class8830.field39819,
            Class2217.field14486
         )
      );
      this.field19805 = var1;
   }

   public void method12502(ServerWorld var1, MobEntity var2, long var3) {
      LivingEntity var7 = var2.getBrain().<LivingEntity>method21410(Class8830.field39826).get();
      if (Class6983.method21583(var2, var7) && Class6983.method21580(var2, var7, 1)) {
         this.method12614(var2);
      } else {
         this.method12613(var2, var7);
      }
   }

   private void method12613(LivingEntity var1, LivingEntity var2) {
      Brain var5 = var1.getBrain();
      var5.method21406(Class8830.field39825, new Class7865(var2, true));
      Class8999 var6 = new Class8999(new Class7865(var2, false), this.field19805, 0);
      var5.method21406(Class8830.field39824, var6);
   }

   private void method12614(LivingEntity var1) {
      var1.getBrain().method21405(Class8830.field39824);
   }
}
