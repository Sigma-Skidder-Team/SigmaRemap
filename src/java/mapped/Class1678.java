package mapped;

import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface Class1678 extends Class1682, Class1662, Class1679 {
   @Override
   default Stream<Class6408> method7046(Entity var1, Class6488 var2, Predicate<Entity> var3) {
      return Class1682.super.method7046(var1, var2, var3);
   }

   @Override
   default boolean method7048(Entity var1, Class6408 var2) {
      return Class1682.super.method7048(var1, var2);
   }

   @Override
   default BlockPos method7006(Class101 var1, BlockPos var2) {
      return Class1662.super.method7006(var1, var2);
   }

   Class8904 method6867();

   default Optional<Class8705<Class8907>> method7178(BlockPos var1) {
      return this.method6867().<Class8907>method32453(Class2348.field16106).method9182(this.method7003(var1));
   }
}
