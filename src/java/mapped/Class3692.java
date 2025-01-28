package mapped;

import com.mojang.datafixers.util.Pair;
import net.minecraft.entity.LivingEntity;
import net.minecraft.world.server.ServerWorld;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Class3692<E extends LivingEntity> extends Class3676<E> {
   private final Set<MemoryModuleType<?>> field19720;
   private final Class1956 field19721;
   private final Class2111 field19722;
   private final Class7271<Class3676<? super E>> field19723 = new Class7271<Class3676<? super E>>();

   public Class3692(Map<MemoryModuleType<?>, Class2217> var1, Set<MemoryModuleType<?>> var2, Class1956 var3, Class2111 var4, List<Pair<Class3676<? super E>, Integer>> var5) {
      super(var1);
      this.field19720 = var2;
      this.field19721 = var3;
      this.field19722 = var4;
      var5.forEach(var1x -> this.field19723.method22837((Class3676<? super E>)var1x.getFirst(), (Integer)var1x.getSecond()));
   }

   @Override
   public boolean method12499(ServerWorld var1, E var2, long var3) {
      return this.field19723.method22841().filter(var0 -> var0.method12500() == Class2092.field13633).anyMatch(var4 -> var4.method12499(var1, (E)var2, var3));
   }

   @Override
   public boolean method12507(long var1) {
      return false;
   }

   @Override
   public void method12502(ServerWorld var1, E var2, long var3) {
      this.field19721.method8219(this.field19723);
      this.field19722.method8780(this.field19723, var1, (E)var2, var3);
   }

   @Override
   public void method12504(ServerWorld var1, E var2, long var3) {
      this.field19723.method22841().filter(var0 -> var0.method12500() == Class2092.field13633).forEach(var4 -> var4.method12503(var1, (E)var2, var3));
   }

   @Override
   public void method12506(ServerWorld var1, E var2, long var3) {
      this.field19723.method22841().filter(var0 -> var0.method12500() == Class2092.field13633).forEach(var4 -> var4.method12505(var1, (E)var2, var3));
      this.field19720.forEach(var2.getBrain()::method21405);
   }

   @Override
   public String toString() {
      Set var3 = this.field19723.method22841().filter(var0 -> var0.method12500() == Class2092.field13633).collect(Collectors.toSet());
      return "(" + this.getClass().getSimpleName() + "): " + var3;
   }
}
