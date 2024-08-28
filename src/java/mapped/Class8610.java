package mapped;

import com.google.common.collect.Lists;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.ints.IntListIterator;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public final class Class8610 {
   private int field38724;
   private final Class6576[] field38725 = new Class6576[16];
   private final Dynamic<?> field38726;
   private final int field38727;
   private final int field38728;
   private final Int2ObjectMap<Dynamic<?>> field38729 = new Int2ObjectLinkedOpenHashMap(16);

   public Class8610(Dynamic<?> var1) {
      this.field38726 = var1;
      this.field38727 = var1.get("xPos").asInt(0) << 4;
      this.field38728 = var1.get("zPos").asInt(0) << 4;
      var1.get("TileEntities")
         .asStreamOpt()
         .result()
         .ifPresent(
            var1x -> var1x.forEach(
                  var1xx -> {
                     int var4x = var1xx.get("x").asInt(0) - this.field38727 & 15;
                     int var5 = var1xx.get("y").asInt(0);
                     int var6 = var1xx.get("z").asInt(0) - this.field38728 & 15;
                     int var7 = var5 << 8 | var6 << 4 | var4x;
                     if (this.field38729.put(var7, var1xx) != null) {
                        Class8782.method31699()
                           .warn(
                              "In chunk: {}x{} found a duplicate block entity at position: [{}, {}, {}]", this.field38727, this.field38728, var4x, var5, var6
                           );
                     }
                  }
               )
         );
      boolean var4 = var1.get("convertedFromAlphaFormat").asBoolean(false);
      var1.get("Sections").asStreamOpt().result().ifPresent(var1x -> var1x.forEach(var1xx -> {
            Class6576 var4x = new Class6576((Dynamic<?>)var1xx);
            this.field38724 = var4x.method19908(this.field38724);
            this.field38725[var4x.field28952] = var4x;
         }));

      for (Class6576 var8 : this.field38725) {
         if (var8 != null) {

             for (Entry<Integer, IntList> var10 : Class6576.method19913(var8).entrySet()) {
                 int var11 = var8.field28952 << 12;
                 switch (var10.getKey()) {
                     case 2:

                         for (int var52 : var10.getValue()) {
                             var52 |= var11;
                             Dynamic var63 = this.method30853(var52);
                             if ("minecraft:grass_block".equals(Class8782.method31668(var63))) {
                                 String var73 = Class8782.method31668(this.method30853(method30850(var52, Class2058.field13408)));
                                 if ("minecraft:snow".equals(var73) || "minecraft:snow_layer".equals(var73)) {
                                     this.method30851(var52, Class8782.method31683());
                                 }
                             }
                         }
                         break;
                     case 3:

                         for (int var50 : (IntList) var10.getValue()) {
                             var50 |= var11;
                             Dynamic var62 = this.method30853(var50);
                             if ("minecraft:podzol".equals(Class8782.method31668(var62))) {
                                 String var72 = Class8782.method31668(this.method30853(method30850(var50, Class2058.field13408)));
                                 if ("minecraft:snow".equals(var72) || "minecraft:snow_layer".equals(var72)) {
                                     this.method30851(var50, Class8782.method31684());
                                 }
                             }
                         }
                         break;
                     case 25:

                         for (int var48 : (IntList) var10.getValue()) {
                             var48 |= var11;
                             Dynamic var61 = this.method30849(var48);
                             if (var61 != null) {
                                 String var71 = Boolean.toString(var61.get("powered").asBoolean(false)) + (byte) Math.min(Math.max(var61.get("note").asInt(0), 0), 24);
                                 this.method30851(var48, (Dynamic<?>) Class8782.method31685().getOrDefault(var71, Class8782.method31685().get("false0")));
                             }
                         }
                         break;
                     case 26:

                         for (int var46 : (IntList) var10.getValue()) {
                             var46 |= var11;
                             Dynamic var60 = this.method30848(var46);
                             Dynamic var70 = this.method30853(var46);
                             if (var60 != null) {
                                 int var77 = var60.get("color").asInt(0);
                                 if (var77 != 14 && var77 >= 0 && var77 < 16) {
                                     String var80 = Class8782.method31669(var70, "facing")
                                             + Class8782.method31669(var70, "occupied")
                                             + Class8782.method31669(var70, "part")
                                             + var77;
                                     if (Class8782.method31686().containsKey(var80)) {
                                         this.method30851(var46, (Dynamic<?>) Class8782.method31686().get(var80));
                                     }
                                 }
                             }
                         }
                         break;
                     case 64:
                     case 71:
                     case 193:
                     case 194:
                     case 195:
                     case 196:
                     case 197:

                         for (int var44 : (IntList) var10.getValue()) {
                             var44 |= var11;
                             Dynamic var59 = this.method30853(var44);
                             if (Class8782.method31668(var59).endsWith("_door")) {
                                 Dynamic var69 = this.method30853(var44);
                                 if ("lower".equals(Class8782.method31669(var69, "half"))) {
                                     int var76 = method30850(var44, Class2058.field13408);
                                     Dynamic var79 = this.method30853(var76);
                                     String var18 = Class8782.method31668(var69);
                                     if (var18.equals(Class8782.method31668(var79))) {
                                         String var19 = Class8782.method31669(var69, "facing");
                                         String var20 = Class8782.method31669(var69, "open");
                                         String var21 = var4 ? "left" : Class8782.method31669(var79, "hinge");
                                         String var22 = var4 ? "false" : Class8782.method31669(var79, "powered");
                                         this.method30851(var44, (Dynamic<?>) Class8782.method31687().get(var18 + var19 + "lower" + var21 + var20 + var22));
                                         this.method30851(var76, (Dynamic<?>) Class8782.method31687().get(var18 + var19 + "upper" + var21 + var20 + var22));
                                     }
                                 }
                             }
                         }
                         break;
                     case 86:
                         IntListIterator var27 = ((IntList) var10.getValue()).iterator();

                         while (var27.hasNext()) {
                             int var42 = (Integer) var27.next();
                             var42 |= var11;
                             Dynamic var58 = this.method30853(var42);
                             if ("minecraft:carved_pumpkin".equals(Class8782.method31668(var58))) {
                                 String var68 = Class8782.method31668(this.method30853(method30850(var42, Class2058.field13407)));
                                 if ("minecraft:grass_block".equals(var68) || "minecraft:dirt".equals(var68)) {
                                     this.method30851(var42, Class8782.method31688());
                                 }
                             }
                         }
                         break;
                     case 110:
                         IntListIterator var26 = ((IntList) var10.getValue()).iterator();

                         while (var26.hasNext()) {
                             int var40 = (Integer) var26.next();
                             var40 |= var11;
                             Dynamic var57 = this.method30853(var40);
                             if ("minecraft:mycelium".equals(Class8782.method31668(var57))) {
                                 String var67 = Class8782.method31668(this.method30853(method30850(var40, Class2058.field13408)));
                                 if ("minecraft:snow".equals(var67) || "minecraft:snow_layer".equals(var67)) {
                                     this.method30851(var40, Class8782.method31689());
                                 }
                             }
                         }
                         break;
                     case 140:
                         IntListIterator var25 = ((IntList) var10.getValue()).iterator();

                         while (var25.hasNext()) {
                             int var38 = (Integer) var25.next();
                             var38 |= var11;
                             Dynamic var56 = this.method30849(var38);
                             if (var56 != null) {
                                 String var66 = var56.get("Item").asString("") + var56.get("Data").asInt(0);
                                 this.method30851(var38, (Dynamic<?>) Class8782.method31690().getOrDefault(var66, Class8782.method31690().get("minecraft:air0")));
                             }
                         }
                         break;
                     case 144:
                         IntListIterator var24 = ((IntList) var10.getValue()).iterator();

                         while (var24.hasNext()) {
                             int var36 = (Integer) var24.next();
                             var36 |= var11;
                             Dynamic var55 = this.method30848(var36);
                             if (var55 != null) {
                                 String var65 = String.valueOf(var55.get("SkullType").asInt(0));
                                 String var75 = Class8782.method31669(this.method30853(var36), "facing");
                                 String var78;
                                 if (!"up".equals(var75) && !"down".equals(var75)) {
                                     var78 = var65 + var75;
                                 } else {
                                     var78 = var65 + String.valueOf(var55.get("Rot").asInt(0));
                                 }

                                 var55.remove("SkullType");
                                 var55.remove("facing");
                                 var55.remove("Rot");
                                 this.method30851(var36, (Dynamic<?>) Class8782.method31691().getOrDefault(var78, Class8782.method31691().get("0north")));
                             }
                         }
                         break;
                     case 175:
                         IntListIterator var23 = ((IntList) var10.getValue()).iterator();

                         while (var23.hasNext()) {
                             int var34 = (Integer) var23.next();
                             var34 |= var11;
                             Dynamic var54 = this.method30853(var34);
                             if ("upper".equals(Class8782.method31669(var54, "half"))) {
                                 Dynamic var64 = this.method30853(method30850(var34, Class2058.field13407));
                                 String var74 = Class8782.method31668(var64);
                                 if ("minecraft:sunflower".equals(var74)) {
                                     this.method30851(var34, Class8782.method31692());
                                 } else if ("minecraft:lilac".equals(var74)) {
                                     this.method30851(var34, Class8782.method31693());
                                 } else if ("minecraft:tall_grass".equals(var74)) {
                                     this.method30851(var34, Class8782.method31694());
                                 } else if ("minecraft:large_fern".equals(var74)) {
                                     this.method30851(var34, Class8782.method31695());
                                 } else if ("minecraft:rose_bush".equals(var74)) {
                                     this.method30851(var34, Class8782.method31696());
                                 } else if ("minecraft:peony".equals(var74)) {
                                     this.method30851(var34, Class8782.method31697());
                                 }
                             }
                         }
                         break;
                     case 176:
                     case 177:
                         IntListIterator var12 = ((IntList) var10.getValue()).iterator();

                         while (var12.hasNext()) {
                             int var13 = (Integer) var12.next();
                             var13 |= var11;
                             Dynamic var14 = this.method30848(var13);
                             Dynamic var15 = this.method30853(var13);
                             if (var14 != null) {
                                 int var16 = var14.get("Base").asInt(0);
                                 if (var16 != 15 && var16 >= 0 && var16 < 16) {
                                     String var17 = Class8782.method31669(var15, var10.getKey() == 176 ? "rotation" : "facing") + "_" + var16;
                                     if (Class8782.method31698().containsKey(var17)) {
                                         this.method30851(var13, (Dynamic<?>) Class8782.method31698().get(var17));
                                     }
                                 }
                             }
                         }
                 }
             }
         }
      }
   }

   @Nullable
   private Dynamic<?> method30848(int var1) {
      return (Dynamic<?>)this.field38729.get(var1);
   }

   @Nullable
   private Dynamic<?> method30849(int var1) {
      return (Dynamic<?>)this.field38729.remove(var1);
   }

   public static int method30850(int var0, Class2058 var1) {
      switch (Class8932.field40417[var1.method8706().ordinal()]) {
         case 1:
            int var4 = (var0 & 15) + var1.method8705().method9009();
            return var4 >= 0 && var4 <= 15 ? var0 & -16 | var4 : -1;
         case 2:
            int var5 = (var0 >> 8) + var1.method8705().method9009();
            return var5 >= 0 && var5 <= 255 ? var0 & 0xFF | var5 << 8 : -1;
         case 3:
            int var6 = (var0 >> 4 & 15) + var1.method8705().method9009();
            return var6 >= 0 && var6 <= 15 ? var0 & -241 | var6 << 4 : -1;
         default:
            return -1;
      }
   }

   private void method30851(int var1, Dynamic<?> var2) {
      if (var1 >= 0 && var1 <= 65535) {
         Class6576 var5 = this.method30852(var1);
         if (var5 != null) {
            var5.method19907(var1 & 4095, var2);
         }
      }
   }

   @Nullable
   private Class6576 method30852(int var1) {
      int var4 = var1 >> 12;
      return var4 >= this.field38725.length ? null : this.field38725[var4];
   }

   public Dynamic<?> method30853(int var1) {
      if (var1 >= 0 && var1 <= 65535) {
         Class6576 var4 = this.method30852(var1);
         return var4 != null ? var4.method19906(var1 & 4095) : Class8782.method31680();
      } else {
         return Class8782.method31680();
      }
   }

   public Dynamic<?> method30854() {
      Dynamic var3 = this.field38726;
      if (!this.field38729.isEmpty()) {
         var3 = var3.set("TileEntities", var3.createList(this.field38729.values().stream()));
      } else {
         var3 = var3.remove("TileEntities");
      }

      Dynamic var4 = var3.emptyMap();
      ArrayList var5 = Lists.newArrayList();

      for (Class6576 var9 : this.field38725) {
         if (var9 != null) {
            var5.add(var9.method19910());
            var4 = var4.set(String.valueOf(var9.field28952), var4.createIntList(Arrays.stream(Class6576.method19914(var9).toIntArray())));
         }
      }

      Dynamic var11 = var3.emptyMap();
      var11 = var11.set("Sides", var11.createByte((byte)this.field38724));
      var11 = var11.set("Indices", var4);
      return var3.set("UpgradeData", var11).set("Sections", var11.createList(var5.stream()));
   }
}
