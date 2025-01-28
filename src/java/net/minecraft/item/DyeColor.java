package net.minecraft.item;

import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import net.minecraft.material.MaterialColor;
import net.minecraft.util.IStringSerializable;

import javax.annotation.Nullable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public enum DyeColor implements IStringSerializable {
   field386(0, "white", 16383998, MaterialColor.SNOW, 15790320, 16777215),
   field387(1, "orange", 16351261, MaterialColor.field30962, 15435844, 16738335),
   field388(2, "magenta", 13061821, MaterialColor.field30963, 12801229, 16711935),
   field389(3, "light_blue", 3847130, MaterialColor.field30964, 6719955, 10141901),
   field390(4, "yellow", 16701501, MaterialColor.field30965, 14602026, 16776960),
   field391(5, "lime", 8439583, MaterialColor.field30966, 4312372, 12582656),
   field392(6, "pink", 15961002, MaterialColor.field30967, 14188952, 16738740),
   field393(7, "gray", 4673362, MaterialColor.field30968, 4408131, 8421504),
   field394(8, "light_gray", 10329495, MaterialColor.field30969, 11250603, 13882323),
   field395(9, "cyan", 1481884, MaterialColor.field30970, 2651799, 65535),
   field396(10, "purple", 8991416, MaterialColor.field30971, 8073150, 10494192),
   field397(11, "blue", 3949738, MaterialColor.field30972, 2437522, 255),
   field398(12, "brown", 8606770, MaterialColor.field30973, 5320730, 9127187),
   field399(13, "green", 6192150, MaterialColor.field30974, 3887386, 65280),
   field400(14, "red", 11546150, MaterialColor.field30975, 11743532, 16711680),
   field401(15, "black", 1908001, MaterialColor.field30976, 1973019, 0);

   private static final DyeColor[] field402 = Arrays.<DyeColor>stream(values())
      .sorted(Comparator.comparingInt(DyeColor::method309))
      .<DyeColor>toArray(DyeColor[]::new);
   private static final Int2ObjectOpenHashMap<DyeColor> field403 = new Int2ObjectOpenHashMap(
      Arrays.<DyeColor>stream(values()).collect(Collectors.toMap(var0 -> var0.field410, var0 -> (DyeColor)var0))
   );
   private final int field404;
   private final String field405;
   private final MaterialColor field406;
   private final int field407;
   private final int field408;
   private final float[] field409;
   private final int field410;
   private final int field411;
   private static final DyeColor[] field412 = new DyeColor[]{
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

   private DyeColor(int var3, String var4, int var5, MaterialColor var6, int var7, int var8) {
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

   public MaterialColor method312() {
      return this.field406;
   }

   public int method313() {
      return this.field410;
   }

   public int method314() {
      return this.field411;
   }

   public static DyeColor method315(int var0) {
      if (var0 < 0 || var0 >= field402.length) {
         var0 = 0;
      }

      return field402[var0];
   }

   public static DyeColor method316(String var0, DyeColor var1) {
      for (DyeColor var7 : values()) {
         if (var7.field405.equals(var0)) {
            return var7;
         }
      }

      return var1;
   }

   @Nullable
   public static DyeColor method317(int var0) {
      return (DyeColor)field403.get(var0);
   }

   @Override
   public String toString() {
      return this.field405;
   }

   @Override
   public String getString() {
      return this.field405;
   }
}
