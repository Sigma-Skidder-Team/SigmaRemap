package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.client.util.Util;
import net.minecraft.util.IStringSerializable;

import javax.annotation.Nullable;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public enum Direction implements IStringSerializable, Predicate<net.minecraft.util.Direction> {
   field413("x") {
      @Override
      public int method327(int var1, int var2, int var3) {
         return var1;
      }

      @Override
      public double method328(double var1, double var3, double var5) {
         return var1;
      }
   },
   field414("y") {
      @Override
      public int method327(int var1, int var2, int var3) {
         return var2;
      }

      @Override
      public double method328(double var1, double var3, double var5) {
         return var3;
      }
   },
   field415("z") {
      @Override
      public int method327(int var1, int var2, int var3) {
         return var3;
      }

      @Override
      public double method328(double var1, double var3, double var5) {
         return var5;
      }
   };

   private static final Direction[] field416 = values();
   public static final Codec<Direction> field417 = IStringSerializable.<Direction>method258(Direction::values, Direction::method321);
   private static final Map<String, Direction> field418 = Arrays.<Direction>stream(field416)
      .collect(Collectors.toMap(Direction::method322, var0 -> (Direction)var0));
   private final String field419;
   private static final Direction[] field420 = new Direction[]{field413, field414, field415};

   private Direction(String var3) {
      this.field419 = var3;
   }

   @Nullable
   public static Direction method321(String var0) {
      return field418.get(var0.toLowerCase(Locale.ROOT));
   }

   public String method322() {
      return this.field419;
   }

   public boolean method323() {
      return this == field414;
   }

   public boolean method324() {
      return this == field413 || this == field415;
   }

   @Override
   public String toString() {
      return this.field419;
   }

   public static Direction method325(Random var0) {
      return Util.<Direction>method38518(field416, var0);
   }

   public boolean test(net.minecraft.util.Direction var1) {
      return var1 != null && var1.getAxis() == this;
   }

   public Class76 method326() {
      switch (Class7747.field33266[this.ordinal()]) {
         case 1:
         case 3:
            return Class76.field161;
         case 2:
            return Class76.field162;
         default:
            throw new Error("Someone's been tampering with the universe!");
      }
   }

   @Override
   public String getString() {
      return this.field419;
   }

   public abstract int method327(int var1, int var2, int var3);

   public abstract double method328(double var1, double var3, double var5);
}
