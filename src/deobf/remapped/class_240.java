package remapped;

import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public enum class_240 implements class_4530 {
   field_802(0, 1, -1, "down", class_137.field_403, class_9249.field_47216, new class_2700(0, -1, 0)),
   field_817(1, 0, -1, "up", class_137.field_405, class_9249.field_47216, new class_2700(0, 1, 0)),
   field_818(2, 3, 2, "north", class_137.field_403, class_9249.field_47219, new class_2700(0, 0, -1)),
   field_800(3, 2, 0, "south", class_137.field_405, class_9249.field_47219, new class_2700(0, 0, 1)),
   field_809(4, 5, 1, "west", class_137.field_403, class_9249.field_47215, new class_2700(-1, 0, 0)),
   field_804(5, 4, 3, "east", class_137.field_405, class_9249.field_47215, new class_2700(1, 0, 0));

   private final int field_811;
   private final int field_808;
   private final int field_813;
   private final String field_815;
   private final class_9249 field_812;
   private final class_137 field_806;
   private final class_2700 field_814;
   public static final class_240[] field_803 = values();
   private static final Map<String, class_240> field_810 = Arrays.<class_240>stream(field_803)
      .collect(Collectors.toMap(class_240::method_1047, var0 -> (class_240)var0));
   public static final class_240[] field_816 = Arrays.<class_240>stream(field_803)
      .sorted(Comparator.comparingInt(var0 -> var0.field_811))
      .<class_240>toArray(class_240[]::new);
   private static final class_240[] field_807 = Arrays.<class_240>stream(field_803)
      .filter(var0 -> var0.method_1029().method_42629())
      .sorted(Comparator.comparingInt(var0 -> var0.field_813))
      .<class_240>toArray(class_240[]::new);
   private static final Long2ObjectMap<class_240> field_801 = Arrays.<class_240>stream(field_803)
      .collect(Collectors.toMap(var0 -> new class_1331(var0.method_1037()).method_6077(), var0 -> (class_240)var0, (var0, var1) -> {
         throw new IllegalArgumentException("Duplicate keys");
      }, Long2ObjectOpenHashMap::new));

   private class_240(int var3, int var4, int var5, String var6, class_137 var7, class_9249 var8, class_2700 var9) {
      this.field_811 = var3;
      this.field_813 = var5;
      this.field_808 = var4;
      this.field_815 = var6;
      this.field_812 = var8;
      this.field_806 = var7;
      this.field_814 = var9;
   }

   public static class_240[] method_1051(class_8145 var0) {
      float var3 = var0.method_37184(1.0F) * (float) (Math.PI / 180.0);
      float var4 = -var0.method_37291(1.0F) * (float) (Math.PI / 180.0);
      float var5 = class_9299.method_42818(var3);
      float var6 = class_9299.method_42840(var3);
      float var7 = class_9299.method_42818(var4);
      float var8 = class_9299.method_42840(var4);
      boolean var9 = var7 > 0.0F;
      boolean var10 = var5 < 0.0F;
      boolean var11 = var8 > 0.0F;
      float var12 = !var9 ? -var7 : var7;
      float var13 = !var10 ? var5 : -var5;
      float var14 = !var11 ? -var8 : var8;
      float var15 = var12 * var6;
      float var16 = var14 * var6;
      class_240 var17 = !var9 ? field_809 : field_804;
      class_240 var18 = !var10 ? field_802 : field_817;
      class_240 var19 = !var11 ? field_818 : field_800;
      if (!(var12 > var14)) {
         if (!(var13 > var16)) {
            return !(var15 > var13) ? method_1030(var19, var18, var17) : method_1030(var19, var17, var18);
         } else {
            return method_1030(var18, var19, var17);
         }
      } else if (!(var13 > var15)) {
         return !(var16 > var13) ? method_1030(var17, var18, var19) : method_1030(var17, var19, var18);
      } else {
         return method_1030(var18, var17, var19);
      }
   }

   private static class_240[] method_1030(class_240 var0, class_240 var1, class_240 var2) {
      return new class_240[]{var0, var1, var2, var2.method_1046(), var1.method_1046(), var0.method_1046()};
   }

   public static class_240 method_1048(class_8107 var0, class_240 var1) {
      class_2700 var4 = var1.method_1037();
      class_2637 var5 = new class_2637((float)var4.method_12173(), (float)var4.method_12165(), (float)var4.method_12185(), 0.0F);
      var5.method_11929(var0);
      return method_1045(var5.method_11923(), var5.method_11922(), var5.method_11927());
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public class_5422 method_1026() {
      class_5422 var3 = class_2426.field_12080.method_11074(90.0F);
      switch (this) {
         case field_802:
            return class_2426.field_12080.method_11074(180.0F);
         case field_817:
            return class_5422.field_27621.method_24651();
         case field_818:
            var3.method_24658(class_2426.field_12076.method_11074(180.0F));
            return var3;
         case field_800:
            return var3;
         case field_809:
            var3.method_24658(class_2426.field_12076.method_11074(90.0F));
            return var3;
         case field_804:
         default:
            var3.method_24658(class_2426.field_12076.method_11074(-90.0F));
            return var3;
      }
   }

   public int method_1050() {
      return this.field_811;
   }

   public int method_1031() {
      return this.field_813;
   }

   public class_137 method_1049() {
      return this.field_806;
   }

   public class_240 method_1046() {
      return field_803[this.field_808];
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public class_240 method_1042() {
      switch (this) {
         case field_818:
            return field_804;
         case field_800:
            return field_809;
         case field_809:
            return field_818;
         case field_804:
            return field_800;
         default:
            throw new IllegalStateException("Unable to get Y-rotated facing of " + this);
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public class_240 method_1053() {
      switch (this) {
         case field_818:
            return field_809;
         case field_800:
            return field_804;
         case field_809:
            return field_800;
         case field_804:
            return field_818;
         default:
            throw new IllegalStateException("Unable to get CCW facing of " + this);
      }
   }

   public int method_1041() {
      return this.field_814.method_12173();
   }

   public int method_1054() {
      return this.field_814.method_12165();
   }

   public int method_1034() {
      return this.field_814.method_12185();
   }

   public class_2426 method_1038() {
      return new class_2426((float)this.method_1041(), (float)this.method_1054(), (float)this.method_1034());
   }

   public String method_1047() {
      return this.field_815;
   }

   public class_9249 method_1029() {
      return this.field_812;
   }

   @Nullable
   public static class_240 method_1035(String var0) {
      return var0 != null ? field_810.get(var0.toLowerCase(Locale.ROOT)) : null;
   }

   public static class_240 method_1033(int var0) {
      return field_816[class_9299.method_42805(var0 % field_816.length)];
   }

   public static class_240 method_1040(int var0) {
      return field_807[class_9299.method_42805(var0 % field_807.length)];
   }

   @Nullable
   public static class_240 method_1032(int var0, int var1, int var2) {
      return (class_240)field_801.get(class_1331.method_6107(var0, var1, var2));
   }

   public static class_240 method_1036(double var0) {
      return method_1040(class_9299.method_42847(var0 / 90.0 + 0.5) & 3);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static class_240 method_1055(class_9249 var0, class_137 var1) {
      switch (var0) {
         case field_47215:
            return var1 == class_137.field_405 ? field_804 : field_809;
         case field_47216:
            return var1 == class_137.field_405 ? field_817 : field_802;
         case field_47219:
         default:
            return var1 == class_137.field_405 ? field_800 : field_818;
      }
   }

   public float method_1028() {
      return (float)((this.field_813 & 3) * 90);
   }

   public static class_240 method_1039(Random var0) {
      return class_9665.<class_240>method_44697(field_803, var0);
   }

   public static class_240 method_1044(double var0, double var2, double var4) {
      return method_1045((float)var0, (float)var2, (float)var4);
   }

   public static class_240 method_1045(float var0, float var1, float var2) {
      class_240 var5 = field_818;
      float var6 = Float.MIN_VALUE;

      for (class_240 var10 : field_803) {
         float var11 = var0 * (float)var10.field_814.method_12173()
            + var1 * (float)var10.field_814.method_12165()
            + var2 * (float)var10.field_814.method_12185();
         if (var11 > var6) {
            var6 = var11;
            var5 = var10;
         }
      }

      return var5;
   }

   @Override
   public String toString() {
      return this.field_815;
   }

   @Override
   public String method_21049() {
      return this.field_815;
   }

   public static class_240 method_1043(class_137 var0, class_9249 var1) {
      for (class_240 var7 : field_803) {
         if (var7.method_1049() == var0 && var7.method_1029() == var1) {
            return var7;
         }
      }

      throw new IllegalArgumentException("No such direction: " + var0 + " " + var1);
   }

   public class_2700 method_1037() {
      return this.field_814;
   }

   public boolean method_1052(float var1) {
      float var4 = var1 * (float) (Math.PI / 180.0);
      float var5 = -class_9299.method_42818(var4);
      float var6 = class_9299.method_42840(var4);
      return (float)this.field_814.method_12173() * var5 + (float)this.field_814.method_12185() * var6 > 0.0F;
   }
}
