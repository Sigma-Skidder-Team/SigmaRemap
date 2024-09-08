package mapped;

import com.google.common.collect.ImmutableMap;
import net.minecraft.util.RangedInteger;
import net.minecraft.world.server.ServerWorld;

import java.util.function.Predicate;

public class Class3744<E extends Class1006, T> extends Class3676<E> {
   private static String[] field19879;
   private final Predicate<E> field19880;
   private final Class8830<? extends T> field19881;
   private final Class8830<T> field19882;
   private final RangedInteger field19883;

   public Class3744(Predicate<E> var1, Class8830<? extends T> var2, Class8830<T> var3, RangedInteger var4) {
      super(ImmutableMap.of(var2, Class2217.field14484, var3, Class2217.field14485));
      this.field19880 = var1;
      this.field19881 = var2;
      this.field19882 = var3;
      this.field19883 = var4;
   }

   public boolean method12508(ServerWorld var1, E var2) {
      return this.field19880.test((E)var2);
   }

   public void method12502(ServerWorld var1, E var2, long var3) {
      Class6947 var7 = var2.method2992();
      var7.method21407(this.field19882, (T)var7.method21410(this.field19881).get(), (long)this.field19883.method29319(var1.rand));
   }
}
