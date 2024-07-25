package remapped;

import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public enum class_9077 implements class_4530 {
   field_46493(0, "white", 16383998, class_1513.field_8012, 15790320, 16777215),
   field_46486(1, "orange", 16351261, class_1513.field_8051, 15435844, 16738335),
   field_46480(2, "magenta", 13061821, class_1513.field_8011, 12801229, 16711935),
   field_46491(3, "light_blue", 3847130, class_1513.field_8071, 6719955, 10141901),
   field_46477(4, "yellow", 16701501, class_1513.field_8013, 14602026, 16776960),
   field_46489(5, "lime", 8439583, class_1513.field_8025, 4312372, 12582656),
   field_46495(6, "pink", 15961002, class_1513.field_8026, 14188952, 16738740),
   field_46498(7, "gray", 4673362, class_1513.field_8016, 4408131, 8421504),
   field_46503(8, "light_gray", 10329495, class_1513.field_8058, 11250603, 13882323),
   field_46501(9, "cyan", 1481884, class_1513.field_8073, 2651799, 65535),
   field_46499(10, "purple", 8991416, class_1513.field_8020, 8073150, 10494192),
   field_46487(11, "blue", 3949738, class_1513.field_8037, 2437522, 255),
   field_46479(12, "brown", 8606770, class_1513.field_8070, 5320730, 9127187),
   field_46497(13, "green", 6192150, class_1513.field_8063, 3887386, 65280),
   field_46494(14, "red", 11546150, class_1513.field_8017, 11743532, 16711680),
   field_46496(15, "black", 1908001, class_1513.field_8059, 1973019, 0);

   private static final class_9077[] field_46488 = Arrays.<class_9077>stream(values())
      .sorted(Comparator.comparingInt(class_9077::method_41794))
      .<class_9077>toArray(class_9077[]::new);
   private static final Int2ObjectOpenHashMap<class_9077> field_46483 = new Int2ObjectOpenHashMap(
      Arrays.<class_9077>stream(values()).collect(Collectors.toMap(var0 -> var0.field_46500, var0 -> (class_9077)var0))
   );
   private final int field_46482;
   private final String field_46476;
   private final class_1513 field_46484;
   private final int field_46490;
   private final int field_46478;
   private final float[] field_46502;
   private final int field_46500;
   private final int field_46481;

   private class_9077(int var3, String var4, int var5, class_1513 var6, int var7, int var8) {
      this.field_46482 = var3;
      this.field_46476 = var4;
      this.field_46490 = var5;
      this.field_46484 = var6;
      this.field_46481 = var8;
      int var11 = (var5 & 0xFF0000) >> 16;
      int var12 = (var5 & 0xFF00) >> 8;
      int var13 = (var5 & 0xFF) >> 0;
      this.field_46478 = var13 << 16 | var12 << 8 | var11 << 0;
      this.field_46502 = new float[]{(float)var11 / 255.0F, (float)var12 / 255.0F, (float)var13 / 255.0F};
      this.field_46500 = var7;
   }

   public int method_41794() {
      return this.field_46482;
   }

   public String method_41796() {
      return this.field_46476;
   }

   public float[] method_41792() {
      return this.field_46502;
   }

   public class_1513 method_41787() {
      return this.field_46484;
   }

   public int method_41793() {
      return this.field_46500;
   }

   public int method_41791() {
      return this.field_46481;
   }

   public static class_9077 method_41789(int var0) {
      if (var0 < 0 || var0 >= field_46488.length) {
         var0 = 0;
      }

      return field_46488[var0];
   }

   public static class_9077 method_41788(String var0, class_9077 var1) {
      for (class_9077 var7 : values()) {
         if (var7.field_46476.equals(var0)) {
            return var7;
         }
      }

      return var1;
   }

   @Nullable
   public static class_9077 method_41790(int var0) {
      return (class_9077)field_46483.get(var0);
   }

   @Override
   public String toString() {
      return this.field_46476;
   }

   @Override
   public String method_21049() {
      return this.field_46476;
   }
}
