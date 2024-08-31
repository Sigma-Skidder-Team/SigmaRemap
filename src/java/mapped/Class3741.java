package mapped;

import com.google.common.collect.ImmutableMap;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

public class Class3741<E extends LivingEntity> extends Class3676<E> {
   private static String[] field19867;
   private final float field19868;

   public Class3741(float var1) {
      super(ImmutableMap.of(Class8830.field39825, Class2217.field14486, Class8830.field39824, Class2217.field14485, Class8830.field39830, Class2217.field14484));
      this.field19868 = var1;
   }

   @Override
   public boolean method12508(ServerWorld var1, E var2) {
      return !var2.isPassenger();
   }

   @Override
   public void method12502(ServerWorld var1, E var2, long var3) {
      if (!this.method12699((E)var2)) {
         Class6983.method21576(var2, this.method12700((E)var2), this.field19868, 1);
      } else {
         var2.method3311(this.method12700((E)var2));
      }
   }

   private boolean method12699(E var1) {
      return this.method12700((E)var1).isEntityInRange(var1, 1.0);
   }

   private Entity method12700(E var1) {
      return var1.method2992().<Entity>method21410(Class8830.field39830).get();
   }
}
