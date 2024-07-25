package remapped;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public enum class_7660 implements class_4530 {
   field_38913("down_east", Direction.field_802, Direction.field_804),
   field_38919("down_north", Direction.field_802, Direction.field_818),
   field_38925("down_south", Direction.field_802, Direction.field_800),
   field_38915("down_west", Direction.field_802, Direction.field_809),
   field_38911("up_east", Direction.field_817, Direction.field_804),
   field_38917("up_north", Direction.field_817, Direction.field_818),
   field_38923("up_south", Direction.field_817, Direction.field_800),
   field_38920("up_west", Direction.field_817, Direction.field_809),
   field_38918("west_up", Direction.field_809, Direction.field_817),
   field_38914("east_up", Direction.field_804, Direction.field_817),
   field_38921("north_up", Direction.field_818, Direction.field_817),
   field_38912("south_up", Direction.field_800, Direction.field_817);

   private static final Int2ObjectMap<class_7660> field_38916 = new Int2ObjectOpenHashMap(values().length);
   private final String field_38922;
   private final Direction field_38909;
   private final Direction field_38924;

   private static int method_34668(Direction var0, Direction var1) {
      return var0.ordinal() << 3 | var1.ordinal();
   }

   private class_7660(String var3, Direction var4, Direction var5) {
      this.field_38922 = var3;
      this.field_38924 = var4;
      this.field_38909 = var5;
   }

   @Override
   public String method_21049() {
      return this.field_38922;
   }

   public static class_7660 method_34669(Direction var0, Direction var1) {
      int var4 = method_34668(var1, var0);
      return (class_7660)field_38916.get(var4);
   }

   public Direction method_34671() {
      return this.field_38924;
   }

   public Direction method_34670() {
      return this.field_38909;
   }

   static {
      for (class_7660 var9 : values()) {
         field_38916.put(method_34668(var9.field_38909, var9.field_38924), var9);
      }
   }
}
