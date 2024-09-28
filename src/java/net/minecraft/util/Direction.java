package net.minecraft.util;

import com.google.common.collect.Iterators;
import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import mapped.*;
import net.minecraft.client.util.Util;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Quaternion;
import net.minecraft.util.math.vector.Vector3i;

import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum Direction implements IStringSerializable {
   DOWN(0, 1, -1, "down", AxisDirection.NEGATIVE, Axis.Y, new Vector3i(0, -1, 0)),
   UP(1, 0, -1, "up", AxisDirection.POSITIVE, Axis.Y, new Vector3i(0, 1, 0)),
   NORTH(2, 3, 2, "north", AxisDirection.NEGATIVE, Axis.Z, new Vector3i(0, 0, -1)),
   SOUTH(3, 2, 0, "south", AxisDirection.POSITIVE, Axis.Z, new Vector3i(0, 0, 1)),
   WEST(4, 5, 1, "west", AxisDirection.NEGATIVE, Axis.X, new Vector3i(-1, 0, 0)),
   EAST(5, 4, 3, "east", AxisDirection.POSITIVE, Axis.X, new Vector3i(1, 0, 0));

   private final int index;
   private final int opposite;
   private final int horizontalIndex;
   private final String name;
   private final Axis axis;
   private final AxisDirection axisDirection;
   private final Vector3i directionVec;
   public static final Direction[] VALUES = values();
   private static final Map<String, Direction> NAME_LOOKUP = Arrays.<Direction>stream(VALUES)
      .collect(Collectors.toMap(Direction::getName2, var0 -> (Direction)var0));
   public static final Direction[] BY_INDEX = Arrays.<Direction>stream(VALUES)
      .sorted(Comparator.comparingInt(var0 -> var0.index))
      .<Direction>toArray(Direction[]::new);
   private static final Direction[] BY_HORIZONTAL_INDEX = Arrays.<Direction>stream(VALUES)
      .filter(var0 -> var0.getAxis().method324())
      .sorted(Comparator.comparingInt(var0 -> var0.horizontalIndex))
      .<Direction>toArray(Direction[]::new);
   private static final Long2ObjectMap<Direction> BY_LONG = Arrays.<Direction>stream(VALUES)
      .collect(Collectors.toMap(var0 -> new BlockPos(var0.getDirectionVec()).method8332(), var0 -> (Direction)var0, (var0, var1) -> {
         throw new IllegalArgumentException("Duplicate keys");
      }, Long2ObjectOpenHashMap::new));
   private static final Direction[] field690 = new Direction[]{DOWN, UP, NORTH, SOUTH, WEST, EAST};

   private Direction(int var3, int var4, int var5, String var6, AxisDirection var7, Axis var8, Vector3i var9) {
      this.index = var3;
      this.horizontalIndex = var5;
      this.opposite = var4;
      this.name = var6;
      this.axis = var8;
      this.axisDirection = var7;
      this.directionVec = var9;
   }

   public static Direction[] method529(Entity var0) {
      float var3 = var0.getPitch(1.0F) * (float) (Math.PI / 180.0);
      float var4 = -var0.getYaw(1.0F) * (float) (Math.PI / 180.0);
      float var5 = MathHelper.sin(var3);
      float var6 = MathHelper.cos(var3);
      float var7 = MathHelper.sin(var4);
      float var8 = MathHelper.cos(var4);
      boolean var9 = var7 > 0.0F;
      boolean var10 = var5 < 0.0F;
      boolean var11 = var8 > 0.0F;
      float var12 = !var9 ? -var7 : var7;
      float var13 = !var10 ? var5 : -var5;
      float var14 = !var11 ? -var8 : var8;
      float var15 = var12 * var6;
      float var16 = var14 * var6;
      Direction var17 = !var9 ? WEST : EAST;
      Direction var18 = !var10 ? DOWN : UP;
      Direction var19 = !var11 ? NORTH : SOUTH;
      if (!(var12 > var14)) {
         if (!(var13 > var16)) {
            return !(var15 > var13) ? method530(var19, var18, var17) : method530(var19, var17, var18);
         } else {
            return method530(var18, var19, var17);
         }
      } else if (!(var13 > var15)) {
         return !(var16 > var13) ? method530(var17, var18, var19) : method530(var17, var19, var18);
      } else {
         return method530(var18, var17, var19);
      }
   }

   private static Direction[] method530(Direction var0, Direction var1, Direction var2) {
      return new Direction[]{var0, var1, var2, var2.getOpposite(), var1.getOpposite(), var0.getOpposite()};
   }

   public static Direction method531(Matrix4f var0, Direction var1) {
      Vector3i var4 = var1.getDirectionVec();
      Class7755 var5 = new Class7755((float)var4.getX(), (float)var4.getY(), (float)var4.getZ(), 0.0F);
      var5.method25709(var0);
      return getFacingFromVector(var5.method25701(), var5.method25702(), var5.method25703());
   }

   public Quaternion method532() {
      Quaternion var3 = Vector3f.XP.rotationDegrees(90.0F);
      switch (Class7747.field33265[this.ordinal()]) {
         case 1:
            return Vector3f.XP.rotationDegrees(180.0F);
         case 2:
            return Quaternion.field39030.method31189();
         case 3:
            var3.method31182(Vector3f.ZP.rotationDegrees(180.0F));
            return var3;
         case 4:
            return var3;
         case 5:
            var3.method31182(Vector3f.ZP.rotationDegrees(90.0F));
            return var3;
         case 6:
         default:
            var3.method31182(Vector3f.ZP.rotationDegrees(-90.0F));
            return var3;
      }
   }

   public int getIndex() {
      return this.index;
   }

   public int method534() {
      return this.horizontalIndex;
   }

   public AxisDirection getAxisDirection() {
      return this.axisDirection;
   }

   public Direction getOpposite() {
      return VALUES[this.opposite];
   }

   public Direction rotateY() {
      switch (this)
      {
         case NORTH:
            return EAST;

         case SOUTH:
            return WEST;

         case WEST:
            return NORTH;

         case EAST:
            return SOUTH;

         default:
            throw new IllegalStateException("Unable to get Y-rotated facing of " + this);
      }
   }

   public Direction rotateYCCW() {
      switch (this)
      {
         case NORTH:
            return WEST;

         case SOUTH:
            return EAST;

         case WEST:
            return SOUTH;

         case EAST:
            return NORTH;

         default:
            throw new IllegalStateException("Unable to get CCW facing of " + this);
      }
   }

   public int getXOffset() {
      return this.directionVec.getX();
   }

   public int getYOffset() {
      return this.directionVec.getY();
   }

   public int getZOffset() {
      return this.directionVec.getZ();
   }

   public Vector3f toVector3f() {
      return new Vector3f((float)this.getXOffset(), (float)this.getYOffset(), (float)this.getZOffset());
   }

   public String getName2() {
      return this.name;
   }

   public Axis getAxis() {
      return this.axis;
   }

   @Nullable
   public static Direction byName(String var0) {
      return var0 != null ? NAME_LOOKUP.get(var0.toLowerCase(Locale.ROOT)) : null;
   }

   public static Direction byIndex(int var0) {
      return BY_INDEX[MathHelper.abs(var0 % BY_INDEX.length)];
   }

   public static Direction byHorizontalIndex(int var0) {
      return BY_HORIZONTAL_INDEX[MathHelper.abs(var0 % BY_HORIZONTAL_INDEX.length)];
   }

   @Nullable
   public static Direction byLong(int var0, int var1, int var2) {
      return BY_LONG.get(BlockPos.pack(var0, var1, var2));
   }

   public static Direction fromAngle(double var0) {
      return byHorizontalIndex(MathHelper.floor(var0 / 90.0 + 0.5) & 3);
   }

   public static Direction getFacingFromAxisDirection(Axis axisIn, AxisDirection axisDirectionIn) {
      switch (axisIn)
      {
         case X:
            return axisDirectionIn == Direction.AxisDirection.POSITIVE ? EAST : WEST;

         case Y:
            return axisDirectionIn == Direction.AxisDirection.POSITIVE ? UP : DOWN;

         case Z:
         default:
            return axisDirectionIn == Direction.AxisDirection.POSITIVE ? SOUTH : NORTH;
      }
   }

   public float getHorizontalAngle() {
      return (float)((this.horizontalIndex & 3) * 90);
   }

   public static Direction getRandomDirection(Random var0) {
      return Util.getRandomObject(VALUES, var0);
   }

   public static Direction getFacingFromVector(double var0, double var2, double var4) {
      return getFacingFromVector((float)var0, (float)var2, (float)var4);
   }

   public static Direction getFacingFromVector(float x, float y, float z) {
      Direction direction = NORTH;
      float f = Float.MIN_VALUE;

      for (Direction var10 : VALUES) {
         float f1 = x * (float)var10.directionVec.getX() + y * (float)var10.directionVec.getY() + z * (float)var10.directionVec.getZ();
         if (f1 > f) {
            f = f1;
            direction = var10;
         }
      }

      return direction;
   }

   @Override
   public String toString() {
      return this.name;
   }

   @Override
   public String getString() {
      return this.name;
   }

   public static Direction getFacingFromAxis(AxisDirection var0, Axis var1) {
      for (Direction var7 : VALUES) {
         if (var7.getAxisDirection() == var0 && var7.getAxis() == var1) {
            return var7;
         }
      }

      throw new IllegalArgumentException("No such direction: " + var0 + " " + var1);
   }

   public Vector3i getDirectionVec() {
      return this.directionVec;
   }

   public boolean hasOrientation(float var1) {
      float var4 = var1 * (float) (Math.PI / 180.0);
      float var5 = -MathHelper.sin(var4);
      float var6 = MathHelper.cos(var4);
      return (float)this.directionVec.getX() * var5 + (float)this.directionVec.getZ() * var6 > 0.0F;
   }

   public enum AxisDirection {
      POSITIVE(1, "Towards positive"),
      NEGATIVE(-1, "Towards negative");

      private final int offset;
      private final String description;

      private AxisDirection(int var3, String var4) {
         this.offset = var3;
         this.description = var4;
      }

      public int getOffset() {
         return this.offset;
      }

      @Override
      public String toString() {
         return this.description;
      }

      public AxisDirection inverted() {
         return this != POSITIVE ? POSITIVE : NEGATIVE;
      }
   }

   public enum Axis implements IStringSerializable, Predicate<Direction> {
      X("x") {
         @Override
         public int method327(int var1, int var2, int var3) {
            return var1;
         }

         @Override
         public double method328(double var1, double var3, double var5) {
            return var1;
         }
      },
      Y("y") {
         @Override
         public int method327(int var1, int var2, int var3) {
            return var2;
         }

         @Override
         public double method328(double var1, double var3, double var5) {
            return var3;
         }
      },
      Z("z") {
         @Override
         public int method327(int var1, int var2, int var3) {
            return var3;
         }

         @Override
         public double method328(double var1, double var3, double var5) {
            return var5;
         }
      };

      private static final Axis[] VALUES = values();
      public static final Codec<Axis> CODEC = IStringSerializable.<Axis>method258(Axis::values, Axis::method321);
      private static final Map<String, Axis> NAME_LOOKUP = Arrays.<Axis>stream(VALUES)
         .collect(Collectors.toMap(Axis::method322, var0 -> (Axis)var0));
      private final String field419;

      private Axis(String var3) {
         this.field419 = var3;
      }

      @Nullable
      public static Axis method321(String var0) {
         return NAME_LOOKUP.get(var0.toLowerCase(Locale.ROOT));
      }

      public String method322() {
         return this.field419;
      }

      public boolean method323() {
         return this == Y;
      }

      public boolean method324() {
         return this == X || this == Z;
      }

      @Override
      public String toString() {
         return this.field419;
      }

      public static Axis method325(Random var0) {
         return Util.<Axis>getRandomObject(VALUES, var0);
      }

      public boolean test(Direction var1) {
         return var1 != null && var1.getAxis() == this;
      }

      public Plane method326() {
         switch (Class7747.field33266[this.ordinal()]) {
            case 1:
            case 3:
               return Plane.HORIZONTAL;
            case 2:
               return Plane.field162;
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

   public enum Plane implements Iterable<Direction>, Predicate<Direction> {
      HORIZONTAL(new Direction[]{NORTH, EAST, SOUTH, WEST}, new Axis[]{Axis.X, Axis.Z}),
      field162(new Direction[]{UP, DOWN}, new Axis[]{Axis.Y});

      private final Direction[] field163;
      private final Axis[] field164;
      private static final Plane[] field165 = new Plane[]{HORIZONTAL, field162};

      private Plane(Direction[] var3, Axis[] var4) {
         this.field163 = var3;
         this.field164 = var4;
      }

      public Direction method247(Random var1) {
         return Util.<Direction>getRandomObject(this.field163, var1);
      }

      public boolean test(Direction var1) {
         return var1 != null && var1.getAxis().method326() == this;
      }

      @Override
      public Iterator<Direction> iterator() {
         return Iterators.forArray(this.field163);
      }

      public Stream<Direction> method248() {
         return Arrays.<Direction>stream(this.field163);
      }
   }
}
