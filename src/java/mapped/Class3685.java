package mapped;

import com.google.common.collect.ImmutableMap;
import net.minecraft.entity.LivingEntity;
import net.minecraft.world.server.ServerWorld;

import java.util.Optional;
import java.util.function.Predicate;

public class Class3685<E extends MobEntity> extends Class3676<E> {
   private static String[] field19701;
   private final Predicate<LivingEntity> field19702;

   public Class3685(Predicate<LivingEntity> var1) {
      super(ImmutableMap.of(Class8830.field39826, Class2217.field14484, Class8830.field39841, Class2217.field14486));
      this.field19702 = var1;
   }

   public Class3685() {
      this(var0 -> false);
   }

   public void method12502(ServerWorld var1, E var2, long var3) {
      if (!method12528(var2)) {
         if (!this.method12529((E)var2)) {
            if (!this.method12526((E)var2)) {
               if (EntityPredicates.field34762.test(this.method12527((E)var2))) {
                  if (this.field19702.test(this.method12527((E)var2))) {
                     this.method12530((E)var2);
                  }
               } else {
                  this.method12530((E)var2);
               }
            } else {
               this.method12530((E)var2);
            }
         } else {
            this.method12530((E)var2);
         }
      } else {
         this.method12530((E)var2);
      }
   }

   private boolean method12526(E var1) {
      return this.method12527((E)var1).world != var1.world;
   }

   private LivingEntity method12527(E var1) {
      return var1.getBrain().<LivingEntity>method21410(Class8830.field39826).get();
   }

   private static <E extends LivingEntity> boolean method12528(E var0) {
      Optional var3 = var0.getBrain().<Long>method21410(Class8830.field39841);
      return var3.isPresent() && var0.world.getGameTime() - (Long)var3.get() > 200L;
   }

   private boolean method12529(E var1) {
      Optional var4 = var1.getBrain().<LivingEntity>method21410(Class8830.field39826);
      return var4.isPresent() && !((LivingEntity)var4.get()).isAlive();
   }

   private void method12530(E var1) {
      var1.getBrain().method21405(Class8830.field39826);
   }
}
