package remapped;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public enum class_7660 implements class_4530 {
   field_38913("down_east", class_240.field_802, class_240.field_804),
   field_38919("down_north", class_240.field_802, class_240.field_818),
   field_38925("down_south", class_240.field_802, class_240.field_800),
   field_38915("down_west", class_240.field_802, class_240.field_809),
   field_38911("up_east", class_240.field_817, class_240.field_804),
   field_38917("up_north", class_240.field_817, class_240.field_818),
   field_38923("up_south", class_240.field_817, class_240.field_800),
   field_38920("up_west", class_240.field_817, class_240.field_809),
   field_38918("west_up", class_240.field_809, class_240.field_817),
   field_38914("east_up", class_240.field_804, class_240.field_817),
   field_38921("north_up", class_240.field_818, class_240.field_817),
   field_38912("south_up", class_240.field_800, class_240.field_817);

   private static final Int2ObjectMap<class_7660> field_38916 = new Int2ObjectOpenHashMap(values().length);
   private final String field_38922;
   private final class_240 field_38909;
   private final class_240 field_38924;

   private static int method_34668(class_240 var0, class_240 var1) {
      return var0.ordinal() << 3 | var1.ordinal();
   }

   private class_7660(String var3, class_240 var4, class_240 var5) {
      this.field_38922 = var3;
      this.field_38924 = var4;
      this.field_38909 = var5;
   }

   @Override
   public String method_21049() {
      return this.field_38922;
   }

   public static class_7660 method_34669(class_240 var0, class_240 var1) {
      int var4 = method_34668(var1, var0);
      return (class_7660)field_38916.get(var4);
   }

   public class_240 method_34671() {
      return this.field_38924;
   }

   public class_240 method_34670() {
      return this.field_38909;
   }

   static {
      for (class_7660 var9 : values()) {
         field_38916.put(method_34668(var9.field_38909, var9.field_38924), var9);
      }
   }
}
