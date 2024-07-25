package remapped;

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

public final class class_5200 {
   private int field_26739;
   private final class_725[] field_26737 = new class_725[16];
   private final Dynamic<?> field_26735;
   private final int field_26734;
   private final int field_26738;
   private final Int2ObjectMap<Dynamic<?>> field_26736 = new Int2ObjectLinkedOpenHashMap(16);

   public class_5200(Dynamic<?> var1) {
      this.field_26735 = var1;
      this.field_26734 = var1.get("xPos").asInt(0) << 4;
      this.field_26738 = var1.get("zPos").asInt(0) << 4;
      var1.get("TileEntities")
         .asStreamOpt()
         .result()
         .ifPresent(
            var1x -> var1x.forEach(
                  var1xx -> {
                     int var4x = var1xx.get("x").asInt(0) - this.field_26734 & 15;
                     int var5 = var1xx.get("y").asInt(0);
                     int var6 = var1xx.get("z").asInt(0) - this.field_26738 & 15;
                     int var7 = var5 << 8 | var6 << 4 | var4x;
                     if (this.field_26736.put(var7, var1xx) != null) {
                        class_5878.method_26799()
                           .warn(
                              "In chunk: {}x{} found a duplicate block entity at position: [{}, {}, {}]", this.field_26734, this.field_26738, var4x, var5, var6
                           );
                     }
                  }
               )
         );
      boolean var4 = var1.get("convertedFromAlphaFormat").asBoolean(false);
      var1.get("Sections").asStreamOpt().result().ifPresent(var1x -> var1x.forEach(var1xx -> {
            class_725 var4x = new class_725((Dynamic<?>)var1xx);
            this.field_26739 = var4x.method_3286(this.field_26739);
            this.field_26737[var4x.field_3935] = var4x;
         }));

      for (class_725 var8 : this.field_26737) {
         if (var8 != null) {
            ObjectIterator var9 = class_725.method_3285(var8).entrySet().iterator();

            while (var9.hasNext()) {
               Entry var10 = (Entry)var9.next();
               int var11 = var8.field_3935 << 12;
               switch (var10.getKey()) {
                  case 2:
                     IntListIterator var32 = ((IntList)var10.getValue()).iterator();

                     while (var32.hasNext()) {
                        int var52 = (Integer)var32.next();
                        var52 |= var11;
                        Dynamic var63 = this.method_23873(var52);
                        if ("minecraft:grass_block".equals(class_5878.method_26796(var63))) {
                           String var73 = class_5878.method_26796(this.method_23873(method_23870(var52, class_7625.field_38802)));
                           if ("minecraft:snow".equals(var73) || "minecraft:snow_layer".equals(var73)) {
                              this.method_23871(var52, class_5878.method_26791());
                           }
                        }
                     }
                     break;
                  case 3:
                     IntListIterator var31 = ((IntList)var10.getValue()).iterator();

                     while (var31.hasNext()) {
                        int var50 = (Integer)var31.next();
                        var50 |= var11;
                        Dynamic var62 = this.method_23873(var50);
                        if ("minecraft:podzol".equals(class_5878.method_26796(var62))) {
                           String var72 = class_5878.method_26796(this.method_23873(method_23870(var50, class_7625.field_38802)));
                           if ("minecraft:snow".equals(var72) || "minecraft:snow_layer".equals(var72)) {
                              this.method_23871(var50, class_5878.method_26790());
                           }
                        }
                     }
                     break;
                  case 25:
                     IntListIterator var30 = ((IntList)var10.getValue()).iterator();

                     while (var30.hasNext()) {
                        int var48 = (Integer)var30.next();
                        var48 |= var11;
                        Dynamic var61 = this.method_23874(var48);
                        if (var61 != null) {
                           String var71 = Boolean.toString(var61.get("powered").asBoolean(false)) + (byte)Math.min(Math.max(var61.get("note").asInt(0), 0), 24);
                           this.method_23871(var48, (Dynamic<?>)class_5878.method_26797().getOrDefault(var71, class_5878.method_26797().get("false0")));
                        }
                     }
                     break;
                  case 26:
                     IntListIterator var29 = ((IntList)var10.getValue()).iterator();

                     while (var29.hasNext()) {
                        int var46 = (Integer)var29.next();
                        var46 |= var11;
                        Dynamic var60 = this.method_23872(var46);
                        Dynamic var70 = this.method_23873(var46);
                        if (var60 != null) {
                           int var77 = var60.get("color").asInt(0);
                           if (var77 != 14 && var77 >= 0 && var77 < 16) {
                              String var80 = class_5878.method_26806(var70, "facing")
                                 + class_5878.method_26806(var70, "occupied")
                                 + class_5878.method_26806(var70, "part")
                                 + var77;
                              if (class_5878.method_26793().containsKey(var80)) {
                                 this.method_23871(var46, (Dynamic<?>)class_5878.method_26793().get(var80));
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
                     IntListIterator var28 = ((IntList)var10.getValue()).iterator();

                     while (var28.hasNext()) {
                        int var44 = (Integer)var28.next();
                        var44 |= var11;
                        Dynamic var59 = this.method_23873(var44);
                        if (class_5878.method_26796(var59).endsWith("_door")) {
                           Dynamic var69 = this.method_23873(var44);
                           if ("lower".equals(class_5878.method_26806(var69, "half"))) {
                              int var76 = method_23870(var44, class_7625.field_38802);
                              Dynamic var79 = this.method_23873(var76);
                              String var18 = class_5878.method_26796(var69);
                              if (var18.equals(class_5878.method_26796(var79))) {
                                 String var19 = class_5878.method_26806(var69, "facing");
                                 String var20 = class_5878.method_26806(var69, "open");
                                 String var21 = var4 ? "left" : class_5878.method_26806(var79, "hinge");
                                 String var22 = var4 ? "false" : class_5878.method_26806(var79, "powered");
                                 this.method_23871(var44, (Dynamic<?>)class_5878.method_26807().get(var18 + var19 + "lower" + var21 + var20 + var22));
                                 this.method_23871(var76, (Dynamic<?>)class_5878.method_26807().get(var18 + var19 + "upper" + var21 + var20 + var22));
                              }
                           }
                        }
                     }
                     break;
                  case 86:
                     IntListIterator var27 = ((IntList)var10.getValue()).iterator();

                     while (var27.hasNext()) {
                        int var42 = (Integer)var27.next();
                        var42 |= var11;
                        Dynamic var58 = this.method_23873(var42);
                        if ("minecraft:carved_pumpkin".equals(class_5878.method_26796(var58))) {
                           String var68 = class_5878.method_26796(this.method_23873(method_23870(var42, class_7625.field_38796)));
                           if ("minecraft:grass_block".equals(var68) || "minecraft:dirt".equals(var68)) {
                              this.method_23871(var42, class_5878.method_26792());
                           }
                        }
                     }
                     break;
                  case 110:
                     IntListIterator var26 = ((IntList)var10.getValue()).iterator();

                     while (var26.hasNext()) {
                        int var40 = (Integer)var26.next();
                        var40 |= var11;
                        Dynamic var57 = this.method_23873(var40);
                        if ("minecraft:mycelium".equals(class_5878.method_26796(var57))) {
                           String var67 = class_5878.method_26796(this.method_23873(method_23870(var40, class_7625.field_38802)));
                           if ("minecraft:snow".equals(var67) || "minecraft:snow_layer".equals(var67)) {
                              this.method_23871(var40, class_5878.method_26811());
                           }
                        }
                     }
                     break;
                  case 140:
                     IntListIterator var25 = ((IntList)var10.getValue()).iterator();

                     while (var25.hasNext()) {
                        int var38 = (Integer)var25.next();
                        var38 |= var11;
                        Dynamic var56 = this.method_23874(var38);
                        if (var56 != null) {
                           String var66 = var56.get("Item").asString("") + var56.get("Data").asInt(0);
                           this.method_23871(var38, (Dynamic<?>)class_5878.method_26809().getOrDefault(var66, class_5878.method_26809().get("minecraft:air0")));
                        }
                     }
                     break;
                  case 144:
                     IntListIterator var24 = ((IntList)var10.getValue()).iterator();

                     while (var24.hasNext()) {
                        int var36 = (Integer)var24.next();
                        var36 |= var11;
                        Dynamic var55 = this.method_23872(var36);
                        if (var55 != null) {
                           String var65 = String.valueOf(var55.get("SkullType").asInt(0));
                           String var75 = class_5878.method_26806(this.method_23873(var36), "facing");
                           String var78;
                           if (!"up".equals(var75) && !"down".equals(var75)) {
                              var78 = var65 + var75;
                           } else {
                              var78 = var65 + String.valueOf(var55.get("Rot").asInt(0));
                           }

                           var55.remove("SkullType");
                           var55.remove("facing");
                           var55.remove("Rot");
                           this.method_23871(var36, (Dynamic<?>)class_5878.method_26808().getOrDefault(var78, class_5878.method_26808().get("0north")));
                        }
                     }
                     break;
                  case 175:
                     IntListIterator var23 = ((IntList)var10.getValue()).iterator();

                     while (var23.hasNext()) {
                        int var34 = (Integer)var23.next();
                        var34 |= var11;
                        Dynamic var54 = this.method_23873(var34);
                        if ("upper".equals(class_5878.method_26806(var54, "half"))) {
                           Dynamic var64 = this.method_23873(method_23870(var34, class_7625.field_38796));
                           String var74 = class_5878.method_26796(var64);
                           if ("minecraft:sunflower".equals(var74)) {
                              this.method_23871(var34, class_5878.method_26788());
                           } else if ("minecraft:lilac".equals(var74)) {
                              this.method_23871(var34, class_5878.method_26805());
                           } else if ("minecraft:tall_grass".equals(var74)) {
                              this.method_23871(var34, class_5878.method_26804());
                           } else if ("minecraft:large_fern".equals(var74)) {
                              this.method_23871(var34, class_5878.method_26800());
                           } else if ("minecraft:rose_bush".equals(var74)) {
                              this.method_23871(var34, class_5878.method_26802());
                           } else if ("minecraft:peony".equals(var74)) {
                              this.method_23871(var34, class_5878.method_26783());
                           }
                        }
                     }
                     break;
                  case 176:
                  case 177:
                     IntListIterator var12 = ((IntList)var10.getValue()).iterator();

                     while (var12.hasNext()) {
                        int var13 = (Integer)var12.next();
                        var13 |= var11;
                        Dynamic var14 = this.method_23872(var13);
                        Dynamic var15 = this.method_23873(var13);
                        if (var14 != null) {
                           int var16 = var14.get("Base").asInt(0);
                           if (var16 != 15 && var16 >= 0 && var16 < 16) {
                              String var17 = class_5878.method_26806(var15, var10.getKey() == 176 ? "rotation" : "facing") + "_" + var16;
                              if (class_5878.method_26786().containsKey(var17)) {
                                 this.method_23871(var13, (Dynamic<?>)class_5878.method_26786().get(var17));
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
   private Dynamic<?> method_23872(int var1) {
      return (Dynamic<?>)this.field_26736.get(var1);
   }

   @Nullable
   private Dynamic<?> method_23874(int var1) {
      return (Dynamic<?>)this.field_26736.remove(var1);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static int method_23870(int var0, class_7625 var1) {
      switch (var1.method_34561()) {
         case field_4451:
            int var4 = (var0 & 15) + var1.method_34560().method_31452();
            return var4 >= 0 && var4 <= 15 ? var0 & -16 | var4 : -1;
         case field_4450:
            int var5 = (var0 >> 8) + var1.method_34560().method_31452();
            return var5 >= 0 && var5 <= 255 ? var0 & 0xFF | var5 << 8 : -1;
         case field_4447:
            int var6 = (var0 >> 4 & 15) + var1.method_34560().method_31452();
            return var6 >= 0 && var6 <= 15 ? var0 & -241 | var6 << 4 : -1;
         default:
            return -1;
      }
   }

   private void method_23871(int var1, Dynamic<?> var2) {
      if (var1 >= 0 && var1 <= 65535) {
         class_725 var5 = this.method_23869(var1);
         if (var5 != null) {
            var5.method_3290(var1 & 4095, var2);
         }
      }
   }

   @Nullable
   private class_725 method_23869(int var1) {
      int var4 = var1 >> 12;
      return var4 >= this.field_26737.length ? null : this.field_26737[var4];
   }

   public Dynamic<?> method_23873(int var1) {
      if (var1 >= 0 && var1 <= 65535) {
         class_725 var4 = this.method_23869(var1);
         return var4 != null ? var4.method_3289(var1 & 4095) : class_5878.method_26782();
      } else {
         return class_5878.method_26782();
      }
   }

   public Dynamic<?> method_23867() {
      Dynamic var3 = this.field_26735;
      if (!this.field_26736.isEmpty()) {
         var3 = var3.set("TileEntities", var3.createList(this.field_26736.values().stream()));
      } else {
         var3 = var3.remove("TileEntities");
      }

      Dynamic var4 = var3.emptyMap();
      ArrayList var5 = Lists.newArrayList();

      for (class_725 var9 : this.field_26737) {
         if (var9 != null) {
            var5.add(var9.method_3287());
            var4 = var4.set(String.valueOf(var9.field_3935), var4.createIntList(Arrays.stream(class_725.method_3291(var9).toIntArray())));
         }
      }

      Dynamic var11 = var3.emptyMap();
      var11 = var11.set("Sides", var11.createByte((byte)this.field_26739));
      var11 = var11.set("Indices", var4);
      return var3.set("UpgradeData", var11).set("Sections", var11.createList(var5.stream()));
   }
}
