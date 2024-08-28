package mapped;

import javax.annotation.Nullable;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public interface Class1668 extends Class1665 {
   Class7522 method6810();

   @Nullable
   Class1665 method6769(int var1, int var2);

   default boolean method7048(Entity var1, Class6408 var2) {
      return true;
   }

   default boolean method7049(Class7380 var1, BlockPos var2, Class4832 var3) {
      Class6408 var6 = var1.method23415(this, var2, var3);
      return var6.method19516()
         || this.method7048((Entity)null, var6.method19517((double)var2.method8304(), (double)var2.getY(), (double)var2.method8306()));
   }

   default boolean method7050(Entity var1) {
      return this.method7048(var1, Class8022.method27428(var1.method3389()));
   }

   default boolean method7051(Class6488 var1) {
      return this.method7054((Entity)null, var1, var0 -> true);
   }

   default boolean method7052(Entity var1) {
      return this.method7054(var1, var1.method3389(), var0 -> true);
   }

   default boolean method7053(Entity var1, Class6488 var2) {
      return this.method7054(var1, var2, var0 -> true);
   }

   default boolean method7054(Entity var1, Class6488 var2, Predicate<Entity> var3) {
      return this.method7047(var1, var2, var3).allMatch(Class6408::method19516);
   }

   Stream<Class6408> method7046(Entity var1, Class6488 var2, Predicate<Entity> var3);

   default Stream<Class6408> method7047(Entity var1, Class6488 var2, Predicate<Entity> var3) {
      return Stream.<Class6408>concat(this.method7055(var1, var2), this.method7046(var1, var2, var3));
   }

   default Stream<Class6408> method7055(Entity var1, Class6488 var2) {
      return StreamSupport.<Class6408>stream(new Class8181(this, var1, var2), false);
   }

   default boolean method7056(Entity var1, Class6488 var2, BiPredicate<Class7380, BlockPos> var3) {
      return this.method7057(var1, var2, var3).allMatch(Class6408::method19516);
   }

   default Stream<Class6408> method7057(Entity var1, Class6488 var2, BiPredicate<Class7380, BlockPos> var3) {
      return StreamSupport.<Class6408>stream(new Class8181(this, var1, var2, var3), false);
   }
}
