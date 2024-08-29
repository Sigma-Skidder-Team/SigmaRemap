package mapped;

import com.google.common.collect.Iterators;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Stream;

public enum Class76 implements Iterable<Direction>, Predicate<Direction> {
   field161(new Direction[]{Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST}, new Class113[]{Class113.field413, Class113.field415}),
   field162(new Direction[]{Direction.field673, Direction.DOWN}, new Class113[]{Class113.field414});

   private final Direction[] field163;
   private final Class113[] field164;
   private static final Class76[] field165 = new Class76[]{field161, field162};

   private Class76(Direction[] var3, Class113[] var4) {
      this.field163 = var3;
      this.field164 = var4;
   }

   public Direction method247(Random var1) {
      return Util.<Direction>method38518(this.field163, var1);
   }

   public boolean test(Direction var1) {
      return var1 != null && var1.method544().method326() == this;
   }

   @Override
   public Iterator<Direction> iterator() {
      return Iterators.forArray(this.field163);
   }

   public Stream<Direction> method248() {
      return Arrays.<Direction>stream(this.field163);
   }
}
