package remapped;

import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;

public interface class_1449 extends class_6163 {
   class_2098 method_6673();

   @Nullable
   class_6163 method_6675(int var1, int var2);

   default boolean method_6678(Entity var1, class_4190 var2) {
      return true;
   }

   default boolean method_6671(class_2522 var1, BlockPos var2, class_214 var3) {
      class_4190 var6 = var1.method_8325(this, var2, var3);
      return var6.method_19485()
         || this.method_6678((Entity)null, var6.method_19496((double)var2.getX(), (double)var2.getY(), (double)var2.getZ()));
   }

   default boolean method_6677(Entity var1) {
      return this.method_6678(var1, class_3370.method_15523(var1.getBoundingBox()));
   }

   default boolean method_6681(Box var1) {
      return this.method_6672((Entity)null, var1, var0 -> true);
   }

   default boolean method_6682(Entity var1) {
      return this.method_6672(var1, var1.getBoundingBox(), var0 -> true);
   }

   default boolean method_6683(Entity var1, Box var2) {
      return this.method_6672(var1, var2, var0 -> true);
   }

   default boolean method_6672(Entity var1, Box var2, Predicate<Entity> var3) {
      return this.method_6676(var1, var2, var3).allMatch(class_4190::method_19485);
   }

   Stream<class_4190> method_6679(Entity var1, Box var2, Predicate<Entity> var3);

   default Stream<class_4190> method_6676(Entity var1, Box var2, Predicate<Entity> var3) {
      return Stream.<class_4190>concat(this.method_6680(var1, var2), this.method_6679(var1, var2, var3));
   }

   default Stream<class_4190> method_6680(Entity var1, Box var2) {
      return StreamSupport.<class_4190>stream(new class_4491(this, var1, var2), false);
   }

   default boolean method_6670(Entity var1, Box var2, BiPredicate<class_2522, BlockPos> var3) {
      return this.method_6674(var1, var2, var3).allMatch(class_4190::method_19485);
   }

   default Stream<class_4190> method_6674(Entity var1, Box var2, BiPredicate<class_2522, BlockPos> var3) {
      return StreamSupport.<class_4190>stream(new class_4491(this, var1, var2, var3), false);
   }
}
