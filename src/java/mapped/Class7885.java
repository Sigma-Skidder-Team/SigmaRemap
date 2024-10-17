package mapped;

import com.google.common.collect.ImmutableSet;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.world.server.ServerWorld;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public class Class7885 extends Class7882<LivingEntity> {
   private static String[] field33833;

   public Class7885() {
      this(200);
   }

   public Class7885(int var1) {
      super(var1);
   }

   @Override
   public void method26425(ServerWorld var1, LivingEntity var2) {
      method26441(var2);
   }

   @Override
   public Set<Class8830<?>> method26424() {
      return ImmutableSet.of(Class8830.field39818);
   }

   public static void method26441(LivingEntity var0) {
      Optional<List<LivingEntity>> var3 = var0.getBrain().<List<LivingEntity>>method21410(Class8830.field39818);
      if (var3.isPresent()) {
         boolean var4 = var3.get().stream().anyMatch(var0x -> var0x.getType().equals(EntityType.IRON_GOLEM));
         if (var4) {
            method26442(var0);
         }
      }
   }

   public static void method26442(LivingEntity var0) {
      var0.getBrain().method21407(Class8830.field39842, true, 600L);
   }
}
