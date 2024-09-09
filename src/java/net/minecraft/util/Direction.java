package net.minecraft.util;

import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import mapped.*;
import net.minecraft.client.util.Util;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Quaternion;
import net.minecraft.util.math.vector.Vector3i;

import javax.annotation.Nullable;
import java.util.*;
import java.util.stream.Collectors;

public enum Direction implements IStringSerializable {
   DOWN(0, 1, -1, "down", Class1892.field11093, mapped.Direction.field414, new Vector3i(0, -1, 0)),
   field673(1, 0, -1, "up", Class1892.field11092, mapped.Direction.field414, new Vector3i(0, 1, 0)),
   NORTH(2, 3, 2, "north", Class1892.field11093, mapped.Direction.field415, new Vector3i(0, 0, -1)),
   SOUTH(3, 2, 0, "south", Class1892.field11092, mapped.Direction.field415, new Vector3i(0, 0, 1)),
   WEST(4, 5, 1, "west", Class1892.field11093, mapped.Direction.field413, new Vector3i(-1, 0, 0)),
   EAST(5, 4, 3, "east", Class1892.field11092, mapped.Direction.field413, new Vector3i(1, 0, 0));

   private final int field678;
   private final int field679;
   private final int field680;
   private final String field681;
   private final mapped.Direction field682;
   private final Class1892 field683;
   private final Vector3i field684;
   public static final Direction[] field685 = values();
   private static final Map<String, Direction> field686 = Arrays.<Direction>stream(field685)
      .collect(Collectors.toMap(net.minecraft.util.Direction::method543, var0 -> (Direction)var0));
   public static final Direction[] field687 = Arrays.<Direction>stream(field685)
      .sorted(Comparator.comparingInt(var0 -> var0.field678))
      .<Direction>toArray(Direction[]::new);
   private static final Direction[] field688 = Arrays.<Direction>stream(field685)
      .filter(var0 -> var0.getAxis().method324())
      .sorted(Comparator.comparingInt(var0 -> var0.field680))
      .<Direction>toArray(Direction[]::new);
   private static final Long2ObjectMap<Direction> field689 = Arrays.<Direction>stream(field685)
      .collect(Collectors.toMap(var0 -> new BlockPos(var0.method556()).method8332(), var0 -> (Direction)var0, (var0, var1) -> {
         throw new IllegalArgumentException("Duplicate keys");
      }, Long2ObjectOpenHashMap::new));
   private static final Direction[] field690 = new Direction[]{DOWN, field673, NORTH, SOUTH, WEST, EAST};

   private Direction(int var3, int var4, int var5, String var6, Class1892 var7, mapped.Direction var8, Vector3i var9) {
      this.field678 = var3;
      this.field680 = var5;
      this.field679 = var4;
      this.field681 = var6;
      this.field682 = var8;
      this.field683 = var7;
      this.field684 = var9;
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
      Direction var18 = !var10 ? DOWN : field673;
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
      return new Direction[]{var0, var1, var2, var2.method536(), var1.method536(), var0.method536()};
   }

   public static Direction method531(Matrix4f var0, Direction var1) {
      Vector3i var4 = var1.method556();
      Class7755 var5 = new Class7755((float)var4.getX(), (float)var4.getY(), (float)var4.getZ(), 0.0F);
      var5.method25709(var0);
      return method554(var5.method25701(), var5.method25702(), var5.method25703());
   }

   public Quaternion method532() {
      Quaternion var3 = Vector3f.field32898.rotationDegrees(90.0F);
      switch (Class7747.field33265[this.ordinal()]) {
         case 1:
            return Vector3f.field32898.rotationDegrees(180.0F);
         case 2:
            return Quaternion.field39030.method31189();
         case 3:
            var3.method31182(Vector3f.field32902.rotationDegrees(180.0F));
            return var3;
         case 4:
            return var3;
         case 5:
            var3.method31182(Vector3f.field32902.rotationDegrees(90.0F));
            return var3;
         case 6:
         default:
            var3.method31182(Vector3f.field32902.rotationDegrees(-90.0F));
            return var3;
      }
   }

   public int getIndex() {
      return this.field678;
   }

   public int method534() {
      return this.field680;
   }

   public Class1892 getAxisDirection() {
      return this.field683;
   }

   public Direction method536() {
      return field685[this.field679];
   }

   public Direction method537() {
      switch (Class7747.field33265[this.ordinal()]) {
         case 3:
            return EAST;
         case 4:
            return WEST;
         case 5:
            return NORTH;
         case 6:
            return SOUTH;
         default:
            throw new IllegalStateException("Unable to get Y-rotated facing of " + this);
      }
   }

   public Direction method538() {
      switch (Class7747.field33265[this.ordinal()]) {
         case 3:
            return WEST;
         case 4:
            return EAST;
         case 5:
            return SOUTH;
         case 6:
            return NORTH;
         default:
            throw new IllegalStateException("Unable to get CCW facing of " + this);
      }
   }

   public int method539() {
      return this.field684.getX();
   }

   public int method540() {
      return this.field684.getY();
   }

   public int method541() {
      return this.field684.getZ();
   }

   public Vector3f method542() {
      return new Vector3f((float)this.method539(), (float)this.method540(), (float)this.method541());
   }

   public String method543() {
      return this.field681;
   }

   public mapped.Direction getAxis() {
      return this.field682;
   }

   @Nullable
   public static Direction method545(String var0) {
      return var0 != null ? field686.get(var0.toLowerCase(Locale.ROOT)) : null;
   }

   public static Direction byIndex(int var0) {
      return field687[MathHelper.method37772(var0 % field687.length)];
   }

   public static Direction method547(int var0) {
      return field688[MathHelper.method37772(var0 % field688.length)];
   }

   @Nullable
   public static Direction method548(int var0, int var1, int var2) {
      return (Direction)field689.get(BlockPos.method8333(var0, var1, var2));
   }

   public static Direction method549(double var0) {
      return method547(MathHelper.floor(var0 / 90.0 + 0.5) & 3);
   }

   public static Direction method550(mapped.Direction var0, Class1892 var1) {
      switch (Class7747.field33266[var0.ordinal()]) {
         case 1:
            return var1 == Class1892.field11092 ? EAST : WEST;
         case 2:
            return var1 == Class1892.field11092 ? field673 : DOWN;
         case 3:
         default:
            return var1 == Class1892.field11092 ? SOUTH : NORTH;
      }
   }

   public float method551() {
      return (float)((this.field680 & 3) * 90);
   }

   public static Direction method552(Random var0) {
      return Util.<Direction>method38518(field685, var0);
   }

   public static Direction method553(double var0, double var2, double var4) {
      return method554((float)var0, (float)var2, (float)var4);
   }

   public static Direction method554(float var0, float var1, float var2) {
      Direction var5 = NORTH;
      float var6 = Float.MIN_VALUE;

      for (Direction var10 : field685) {
         float var11 = var0 * (float)var10.field684.getX() + var1 * (float)var10.field684.getY() + var2 * (float)var10.field684.getZ();
         if (var11 > var6) {
            var6 = var11;
            var5 = var10;
         }
      }

      return var5;
   }

   @Override
   public String toString() {
      return this.field681;
   }

   @Override
   public String getString() {
      return this.field681;
   }

   public static Direction method555(Class1892 var0, mapped.Direction var1) {
      for (Direction var7 : field685) {
         if (var7.getAxisDirection() == var0 && var7.getAxis() == var1) {
            return var7;
         }
      }

      throw new IllegalArgumentException("No such direction: " + var0 + " " + var1);
   }

   public Vector3i method556() {
      return this.field684;
   }

   public boolean method557(float var1) {
      float var4 = var1 * (float) (Math.PI / 180.0);
      float var5 = -MathHelper.sin(var4);
      float var6 = MathHelper.cos(var4);
      return (float)this.field684.getX() * var5 + (float)this.field684.getZ() * var6 > 0.0F;
   }
}
