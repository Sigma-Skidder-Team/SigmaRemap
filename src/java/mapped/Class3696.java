package mapped;

import com.google.common.collect.ImmutableMap;
import net.minecraft.entity.EntityType;

import java.util.List;
import java.util.function.Predicate;

public class Class3696<E extends Class880, T extends Class880> extends Class3676<E> {
   private final int field19730;
   private final float field19731;
   private final EntityType<? extends T> field19732;
   private final int field19733;
   private final Predicate<T> field19734;
   private final Predicate<E> field19735;
   private final Class8830<T> field19736;

   public Class3696(EntityType<? extends T> var1, int var2, Predicate<E> var3, Predicate<T> var4, Class8830<T> var5, float var6, int var7) {
      super(ImmutableMap.of(Class8830.field39825, Class2217.field14486, Class8830.field39824, Class2217.field14485, Class8830.field39819, Class2217.field14484));
      this.field19732 = var1;
      this.field19731 = var6;
      this.field19733 = var2 * var2;
      this.field19730 = var7;
      this.field19734 = var4;
      this.field19735 = var3;
      this.field19736 = var5;
   }

   public static <T extends Class880> Class3696<Class880, T> method12551(EntityType<? extends T> var0, int var1, Class8830<T> var2, float var3, int var4) {
      return new Class3696<Class880, T>(var0, var1, var0x -> true, var0x -> true, var2, var3, var4);
   }

   @Override
   public boolean method12508(ServerWorld var1, E var2) {
      return this.field19735.test((E)var2) && this.method12552((E)var2);
   }

   private boolean method12552(E var1) {
      List<Class880> var4 = var1.method2992().<List<Class880>>method21410(Class8830.field39819).get();
      return var4.stream().anyMatch(this::method12553);
   }

   private boolean method12553(Class880 var1) {
      return this.field19732.equals(var1.getType()) && this.field19734.test((T)var1);
   }

   @Override
   public void method12502(ServerWorld var1, E var2, long var3) {
      Class6947<?> var7 = var2.method2992();
      var7.method21410(Class8830.field39819).ifPresent(
            var3x -> var3x.stream()
                  .filter(var1xx -> this.field19732.equals(var1xx.getType()))
                  .map(var0 -> (T) var0)
                  .filter(var2xx -> var2xx.getDistanceSq(var2) <= (double)this.field19733)
                  .filter(this.field19734)
                  .findFirst()
                  .ifPresent(var2xx -> {
                     var7.method21406(this.field19736, (T)var2xx);
                     var7.method21406(Class8830.field39825, new Class7865(var2xx, true));
                     var7.method21406(Class8830.field39824, new Class8999(new Class7865(var2xx, false), this.field19731, this.field19730));
                  })
         );
   }
}
