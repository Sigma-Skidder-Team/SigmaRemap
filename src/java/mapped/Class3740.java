package mapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import net.minecraft.entity.LivingEntity;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class Class3740<E extends LivingEntity> extends Class3676<E> {
   private final Predicate<E> field19864;
   private final Class3676<? super E> field19865;
   private final boolean field19866;

   public Class3740(Map<Class8830<?>, Class2217> var1, Predicate<E> var2, Class3676<? super E> var3, boolean var4) {
      super(method12698(var1, var3.field19684));
      this.field19864 = var2;
      this.field19865 = var3;
      this.field19866 = var4;
   }

   private static Map<Class8830<?>, Class2217> method12698(Map<Class8830<?>, Class2217> var0, Map<Class8830<?>, Class2217> var1) {
      HashMap var4 = Maps.newHashMap();
      var4.putAll(var0);
      var4.putAll(var1);
      return var4;
   }

   public Class3740(Predicate<E> var1, Class3676<? super E> var2) {
      this(ImmutableMap.of(), var1, var2, false);
   }

   @Override
   public boolean method12508(ServerWorld var1, E var2) {
      return this.field19864.test((E)var2) && this.field19865.method12508(var1, (E)var2);
   }

   @Override
   public boolean method12499(ServerWorld var1, E var2, long var3) {
      return this.field19866 && this.field19864.test((E)var2) && this.field19865.method12499(var1, (E)var2, var3);
   }

   @Override
   public boolean method12507(long var1) {
      return false;
   }

   @Override
   public void method12502(ServerWorld var1, E var2, long var3) {
      this.field19865.method12502(var1, (E)var2, var3);
   }

   @Override
   public void method12504(ServerWorld var1, E var2, long var3) {
      this.field19865.method12504(var1, (E)var2, var3);
   }

   @Override
   public void method12506(ServerWorld var1, E var2, long var3) {
      this.field19865.method12506(var1, (E)var2, var3);
   }

   @Override
   public String toString() {
      return "RunIf: " + this.field19865;
   }
}
