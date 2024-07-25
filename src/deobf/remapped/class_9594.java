package remapped;

import com.google.common.collect.Iterators;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Stream;

public enum class_9594 implements Iterable<Direction>, Predicate<Direction> {
   field_48893(
      new Direction[]{Direction.field_818, Direction.field_804, Direction.field_800, Direction.field_809},
      new class_9249[]{class_9249.field_47215, class_9249.field_47219}
   ),
   field_48896(new Direction[]{Direction.field_817, Direction.field_802}, new class_9249[]{class_9249.field_47216});

   private final Direction[] field_48898;
   private final class_9249[] field_48894;

   private class_9594(Direction[] var3, class_9249[] var4) {
      this.field_48898 = var3;
      this.field_48894 = var4;
   }

   public Direction method_44313(Random var1) {
      return Util.<Direction>method_44697(this.field_48898, var1);
   }

   public boolean test(Direction var1) {
      return var1 != null && var1.method_1029().method_42628() == this;
   }

   @Override
   public Iterator<Direction> iterator() {
      return Iterators.forArray(this.field_48898);
   }

   public Stream<Direction> method_44315() {
      return Arrays.<Direction>stream(this.field_48898);
   }
}
