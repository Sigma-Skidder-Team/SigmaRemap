package mapped;

import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

import javax.annotation.Nullable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public enum Class112 implements Class83 {
   field386(0, "white", 16383998, Class7210.field30955, 15790320, 16777215),
   field387(1, "orange", 16351261, Class7210.field30962, 15435844, 16738335),
   field388(2, "magenta", 13061821, Class7210.field30963, 12801229, 16711935),
   field389(3, "light_blue", 3847130, Class7210.field30964, 6719955, 10141901),
   field390(4, "yellow", 16701501, Class7210.field30965, 14602026, 16776960),
   field391(5, "lime", 8439583, Class7210.field30966, 4312372, 12582656),
   field392(6, "pink", 15961002, Class7210.field30967, 14188952, 16738740),
   field393(7, "gray", 4673362, Class7210.field30968, 4408131, 8421504),
   field394(8, "light_gray", 10329495, Class7210.field30969, 11250603, 13882323),
   field395(9, "cyan", 1481884, Class7210.field30970, 2651799, 65535),
   field396(10, "purple", 8991416, Class7210.field30971, 8073150, 10494192),
   field397(11, "blue", 3949738, Class7210.field30972, 2437522, 255),
   field398(12, "brown", 8606770, Class7210.field30973, 5320730, 9127187),
   field399(13, "green", 6192150, Class7210.field30974, 3887386, 65280),
   field400(14, "red", 11546150, Class7210.field30975, 11743532, 16711680),
   field401(15, "black", 1908001, Class7210.field30976, 1973019, 0);

   private static final Class112[] field402 = Arrays.<Class112>stream(values())
      .sorted(Comparator.comparingInt(Class112::method309))
      .<Class112>toArray(Class112[]::new);
   private static final Int2ObjectOpenHashMap<Class112> field403 = new Int2ObjectOpenHashMap(
      Arrays.<Class112>stream(values()).collect(Collectors.toMap(var0 -> var0.field410, var0 -> (Class112)var0))
   );
   private final int field404;
   private final String field405;
   private final Class7210 field406;
   private final int field407;
   private final int field408;
   private final float[] field409;
   private final int field410;
   private final int field411;
   private static final Class112[] field412 = new Class112[]{
      field386,
      field387,
      field388,
      field389,
      field390,
      field391,
      field392,
      field393,
      field394,
      field395,
      field396,
      field397,
      field398,
      field399,
      field400,
      field401
   };

   private Class112(int var3, String var4, int var5, Class7210 var6, int var7, int var8) {
      this.field404 = var3;
      this.field405 = var4;
      this.field407 = var5;
      this.field406 = var6;
      this.field411 = var8;
      int var11 = (var5 & 0xFF0000) >> 16;
      int var12 = (var5 & 0xFF00) >> 8;
      int var13 = (var5 & 0xFF) >> 0;
      this.field408 = var13 << 16 | var12 << 8 | var11 << 0;
      this.field409 = new float[]{(float)var11 / 255.0F, (float)var12 / 255.0F, (float)var13 / 255.0F};
      this.field410 = var7;
   }

   public int method309() {
      return this.field404;
   }

   public String method310() {
      return this.field405;
   }

   public float[] method311() {
      return this.field409;
   }

   public Class7210 method312() {
      return this.field406;
   }

   public int method313() {
      return this.field410;
   }

   public int method314() {
      return this.field411;
   }

   public static Class112 method315(int var0) {
      if (var0 < 0 || var0 >= field402.length) {
         var0 = 0;
      }

      return field402[var0];
   }

   public static Class112 method316(String var0, Class112 var1) {
      for (Class112 var7 : values()) {
         if (var7.field405.equals(var0)) {
            return var7;
         }
      }

      return var1;
   }

   @Nullable
   public static Class112 method317(int var0) {
      return (Class112)field403.get(var0);
   }

   @Override
   public String toString() {
      return this.field405;
   }

   @Override
   public String method257() {
      return this.field405;
   }
}
