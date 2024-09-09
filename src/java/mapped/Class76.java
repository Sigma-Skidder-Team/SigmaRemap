package mapped;

import com.google.common.collect.Iterators;
import net.minecraft.client.util.Util;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Stream;

public enum Class76 implements Iterable<net.minecraft.util.Direction>, Predicate<net.minecraft.util.Direction> {
   field161(new net.minecraft.util.Direction[]{net.minecraft.util.Direction.NORTH, net.minecraft.util.Direction.EAST, net.minecraft.util.Direction.SOUTH, net.minecraft.util.Direction.WEST}, new Direction[]{Direction.field413, Direction.field415}),
   field162(new net.minecraft.util.Direction[]{net.minecraft.util.Direction.field673, net.minecraft.util.Direction.DOWN}, new Direction[]{Direction.field414});

   private final net.minecraft.util.Direction[] field163;
   private final Direction[] field164;
   private static final Class76[] field165 = new Class76[]{field161, field162};

   private Class76(net.minecraft.util.Direction[] var3, Direction[] var4) {
      this.field163 = var3;
      this.field164 = var4;
   }

   public net.minecraft.util.Direction method247(Random var1) {
      return Util.<net.minecraft.util.Direction>method38518(this.field163, var1);
   }

   public boolean test(net.minecraft.util.Direction var1) {
      return var1 != null && var1.getAxis().method326() == this;
   }

   @Override
   public Iterator<net.minecraft.util.Direction> iterator() {
      return Iterators.forArray(this.field163);
   }

   public Stream<net.minecraft.util.Direction> method248() {
      return Arrays.<net.minecraft.util.Direction>stream(this.field163);
   }
}
