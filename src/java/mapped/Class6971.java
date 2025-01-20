package mapped;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import net.minecraft.entity.LivingEntity;

import java.util.Collection;

public final class Class6971<E extends LivingEntity> {
   private static String[] field30180;
   private final Collection<? extends Class8830<?>> field30181;
   private final Collection<? extends Class7963<? extends Class7882<? super E>>> field30182;
   private final Codec<Brain<E>> field30183;

   private Class6971(Collection<? extends Class8830<?>> var1, Collection<? extends Class7963<? extends Class7882<? super E>>> var2) {
      this.field30181 = var1;
      this.field30182 = var2;
      this.field30183 = Brain.<E>method21401(var1, var2);
   }

   public Brain<E> deserialize(Dynamic<?> var1) {
      return this.field30183
         .parse(var1)
         .resultOrPartial(Brain.method21445()::error)
         .orElseGet(() -> new Brain<E>(this.field30181, this.field30182, ImmutableList.of(), () -> this.field30183));
   }

   // $VF: synthetic method
   public Class6971(Collection var1, Collection var2, Class9490 var3) {
      this(var1, var2);
   }
}
