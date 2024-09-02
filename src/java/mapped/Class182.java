package mapped;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import net.minecraft.util.Direction;
import net.minecraft.util.IStringSerializable;

public enum Class182 implements IStringSerializable {
   field647("down_east", Direction.DOWN, Direction.EAST),
   field648("down_north", Direction.DOWN, Direction.NORTH),
   field649("down_south", Direction.DOWN, Direction.SOUTH),
   field650("down_west", Direction.DOWN, Direction.WEST),
   field651("up_east", Direction.field673, Direction.EAST),
   field652("up_north", Direction.field673, Direction.NORTH),
   field653("up_south", Direction.field673, Direction.SOUTH),
   field654("up_west", Direction.field673, Direction.WEST),
   field655("west_up", Direction.WEST, Direction.field673),
   field656("east_up", Direction.EAST, Direction.field673),
   field657("north_up", Direction.NORTH, Direction.field673),
   field658("south_up", Direction.SOUTH, Direction.field673);

   private static final Int2ObjectMap<Class182> field659 = new Int2ObjectOpenHashMap(values().length);
   private final String field660;
   private final Direction field661;
   private final Direction field662;
   private static final Class182[] field663 = new Class182[]{
      field647, field648, field649, field650, field651, field652, field653, field654, field655, field656, field657, field658
   };

   private static int method525(Direction var0, Direction var1) {
      return var0.ordinal() << 3 | var1.ordinal();
   }

   private Class182(String var3, Direction var4, Direction var5) {
      this.field660 = var3;
      this.field662 = var4;
      this.field661 = var5;
   }

   @Override
   public String getString() {
      return this.field660;
   }

   public static Class182 method526(Direction var0, Direction var1) {
      int var4 = method525(var1, var0);
      return (Class182)field659.get(var4);
   }

   public Direction method527() {
      return this.field662;
   }

   public Direction method528() {
      return this.field661;
   }

   static {
      for (Class182 var9 : values()) {
         field659.put(method525(var9.field661, var9.field662), var9);
      }
   }
}
