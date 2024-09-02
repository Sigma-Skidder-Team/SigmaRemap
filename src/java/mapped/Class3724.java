package mapped;

import com.google.common.collect.ImmutableMap;
import net.minecraft.entity.LivingEntity;
import net.minecraft.world.server.ServerWorld;

import java.util.function.Predicate;

public class Class3724<E extends LivingEntity> extends Class3676<E> {
   private static String[] field19810;
   private final Predicate<E> field19811;
   private final int field19812;
   private final float field19813;

   public Class3724(float var1, boolean var2, int var3) {
      this(var0 -> true, var1, var2, var3);
   }

   public Class3724(Predicate<E> var1, float var2, boolean var3, int var4) {
      super(
         ImmutableMap.of(
            Class8830.field39825,
            Class2217.field14486,
            Class8830.field39824,
            !var3 ? Class2217.field14485 : Class2217.field14486,
            Class8830.field39847,
            Class2217.field14484
         )
      );
      this.field19811 = var1;
      this.field19812 = var4;
      this.field19813 = var2;
   }

   @Override
   public boolean method12508(ServerWorld var1, E var2) {
      return this.field19811.test((E)var2) && this.method12623((E)var2).isEntityInRange(var2, (double)this.field19812);
   }

   @Override
   public void method12502(ServerWorld var1, E var2, long var3) {
      Class6983.method21576(var2, this.method12623((E)var2), this.field19813, 0);
   }

   private ItemEntity method12623(E var1) {
      return var1.method2992().<ItemEntity>method21410(Class8830.field39847).get();
   }
}
