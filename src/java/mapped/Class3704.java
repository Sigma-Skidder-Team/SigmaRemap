package mapped;

import com.google.common.collect.ImmutableMap;
import net.minecraft.entity.LivingEntity;
import net.minecraft.world.server.ServerWorld;

import java.util.List;

public class Class3704<E extends MobEntity> extends Class3676<E> {
   private static String[] field19763;
   private final int field19764;
   private final float field19765;

   public Class3704(int var1, float var2) {
      super(
         ImmutableMap.of(
            Class8830.field39824,
            Class2217.field14485,
            Class8830.field39825,
            Class2217.field14486,
            Class8830.field39826,
            Class2217.field14484,
            Class8830.field39819,
            Class2217.field14484
         )
      );
      this.field19764 = var1;
      this.field19765 = var2;
   }

   public boolean method12508(ServerWorld var1, E var2) {
      return this.method12581((E)var2) && this.method12582((E)var2);
   }

   public void method12502(ServerWorld var1, E var2, long var3) {
      var2.getBrain().method21406(Class8830.field39825, new Class7865(this.method12583((E)var2), true));
      var2.method4228().method20814(-this.field19765, 0.0F);
      var2.rotationYaw = MathHelper.method37796(var2.rotationYaw, var2.rotationYawHead, 0.0F);
   }

   private boolean method12581(E var1) {
      return var1.getBrain().<List<LivingEntity>>method21410(Class8830.field39819).get().contains(this.method12583((E)var1));
   }

   private boolean method12582(E var1) {
      return this.method12583((E)var1).isEntityInRange(var1, (double)this.field19764);
   }

   private LivingEntity method12583(E var1) {
      return var1.getBrain().<LivingEntity>method21410(Class8830.field39826).get();
   }
}
