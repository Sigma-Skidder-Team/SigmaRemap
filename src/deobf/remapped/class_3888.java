package remapped;

import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.datafixers.DataFixUtils;
import it.unimi.dsi.fastutil.longs.LongSets;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import net.minecraft.util.text.TextFormatting;

public class class_3888 extends class_2089 {
   private static final Map<class_3801, String> field_18927 = Util.<EnumMap<class_3801, String>>method_44659(
      new EnumMap<class_3801, String>(class_3801.class), var0 -> {
         var0.put(class_3801.field_18598, "SW");
         var0.put(class_3801.field_18592, "S");
         var0.put(class_3801.field_18591, "OW");
         var0.put(class_3801.field_18599, "O");
         var0.put(class_3801.field_18595, "M");
         var0.put(class_3801.field_18590, "ML");
      }
   );
   private final MinecraftClient field_18930;
   private final TextRenderer field_18918;
   private class_7474 field_18928;
   private class_7474 field_18929;
   private class_2034 field_18921;
   private class_2654 field_18920;
   private CompletableFuture<class_2654> field_18926;
   private String field_18923 = null;
   private List<String> field_18925 = null;
   public List<String> field_18917 = null;
   private long field_18924 = 0L;
   private long field_18919 = 0L;

   public class_3888(MinecraftClient var1) {
      this.field_18930 = var1;
      this.field_18918 = var1.textRenderer;
   }

   public void method_17995() {
      this.field_18926 = null;
      this.field_18920 = null;
   }

   public void method_17982(class_7966 var1) {
      this.field_18930.method_8562().method_16056("debug");
      class_3542.method_16438();
      Entity var4 = this.field_18930.method_8516();
      this.field_18928 = var4.method_37201(20.0, 0.0F, false);
      this.field_18929 = var4.method_37201(20.0, 0.0F, true);
      this.method_17993(var1);
      this.method_17989(var1);
      class_3542.method_16489();
      if (this.field_18930.gameOptions.field_45549) {
         int var5 = this.field_18930.method_8552().method_43165();
         this.method_17984(var1, this.field_18930.method_8592(), 0, var5 / 2, true);
         class_7762 var6 = this.field_18930.method_8515();
         if (var6 != null) {
            this.method_17984(var1, var6.method_1643(), var5 - Math.min(var5 / 2, 240), var5 / 2, false);
         }
      }

      this.field_18930.method_8562().method_16054();
   }

   public void method_17993(class_7966 var1) {
      List var4 = this.field_18925;
      if (var4 == null || System.currentTimeMillis() > this.field_18924) {
         var4 = this.method_17996();
         var4.add("");
         boolean var5 = this.field_18930.method_8515() != null;
         var4.add(
            "Debug: Pie [shift]: "
               + (!this.field_18930.gameOptions.field_45471 ? "hidden" : "visible")
               + (!var5 ? " FPS" : " FPS + TPS")
               + " [alt]: "
               + (!this.field_18930.gameOptions.field_45549 ? "hidden" : "visible")
         );
         var4.add("For help: press F3 + Q");
         this.field_18925 = var4;
         this.field_18924 = System.currentTimeMillis() + 100L;
      }

      class_9460[] var13 = new class_9460[var4.size()];
      class_2513[] var6 = new class_2513[var4.size()];

      for (int var7 = 0; var7 < var4.size(); var7++) {
         String var8 = (String)var4.get(var7);
         if (!Strings.isNullOrEmpty(var8)) {
            byte var9 = 9;
            int var10 = this.field_18918.method_45395(var8);
            byte var11 = 2;
            int var12 = 2 + var9 * var7;
            var6[var7] = new class_2513(1, var12 - 1, 2 + var10 + 1, var12 + var9 - 1);
            var13[var7] = new class_9460(2, var12);
         }
      }

      class_2148.method_10032(var1.method_36058().method_28620(), var6, -1873784752);
      this.field_18918.method_45401(var4, var13, 14737632, var1.method_36058().method_28620(), false, this.field_18918.method_45383());
   }

   public void method_17989(class_7966 var1) {
      List var4 = this.field_18917;
      if (var4 == null || System.currentTimeMillis() > this.field_18919) {
         var4 = this.method_17994();
         this.field_18917 = var4;
         this.field_18919 = System.currentTimeMillis() + 100L;
      }

      class_9460[] var5 = new class_9460[var4.size()];
      class_2513[] var6 = new class_2513[var4.size()];

      for (int var7 = 0; var7 < var4.size(); var7++) {
         String var8 = (String)var4.get(var7);
         if (!Strings.isNullOrEmpty(var8)) {
            byte var9 = 9;
            int var10 = this.field_18918.method_45395(var8);
            int var11 = this.field_18930.method_8552().method_43165() - 2 - var10;
            int var12 = 2 + var9 * var7;
            var6[var7] = new class_2513(var11 - 1, var12 - 1, var11 + var10 + 1, var12 + var9 - 1);
            var5[var7] = new class_9460(var11, var12);
         }
      }

      class_2148.method_10032(var1.method_36058().method_28620(), var6, -1873784752);
      this.field_18918.method_45401(var4, var5, 14737632, var1.method_36058().method_28620(), false, this.field_18918.method_45383());
   }

   public List<String> method_17996() {
      if (this.field_18930.field_9584 != this.field_18923) {
         StringBuffer var3 = new StringBuffer(this.field_18930.field_9584);
         int var4 = class_3111.method_14273();
         int var5 = this.field_18930.field_9584.indexOf("T: ");
         if (var5 >= 0) {
            var3.insert(var5, "(" + var4 + " chunk updates) ");
         }

         int var6 = class_3111.method_14304();
         int var7 = this.field_18930.field_9584.indexOf(" fps ");
         if (var7 >= 0) {
            var3.insert(var7, "/" + var6);
         }

         if (class_3111.method_14337()) {
            var3.append(" sf");
         }

         if (class_3111.method_14238()) {
            var3.append(" fr");
         }

         if (class_3111.method_14423()) {
            var3.append(" af");
         }

         if (class_3111.method_14248()) {
            var3.append(" aa");
         }

         if (class_3111.method_14351()) {
            var3.append(" reg");
         }

         if (class_3111.method_14424()) {
            var3.append(" sh");
         }

         this.field_18930.field_9584 = var3.toString();
         this.field_18923 = this.field_18930.field_9584;
      }

      List var9 = this.method_17985();
      StringBuilder var10 = new StringBuilder();
      class_8359 var11 = class_3111.method_14295();
      var10.append(", A: ");
      if (class_153.method_611()) {
         var10.append(var11.method_38511() + class_4454.method_20647());
         var10.append("/");
      }

      var10.append(var11.method_38530() + class_4454.method_20651());
      String var12 = var10.toString();

      for (int var13 = 0; var13 < var9.size(); var13++) {
         String var8 = (String)var9.get(var13);
         if (var8 != null && var8.startsWith("P: ")) {
            var8 = var8 + var12;
            var9.set(var13, var8);
            break;
         }
      }

      return var9;
   }

   public List<String> method_17985() {
      class_7762 var3 = this.field_18930.method_8515();
      class_5121 var4 = this.field_18930.method_8614().method_9091();
      float var5 = var4.method_23492();
      float var6 = var4.method_23498();
      String var7;
      if (var3 != null) {
         var7 = String.format("Integrated server @ %.0f ms ticks, %.0f tx, %.0f rx", var3.method_1733(), var5, var6);
      } else {
         var7 = String.format("\"%s\" server, %.0f tx, %.0f rx", this.field_18930.field_9632.method_27309(), var5, var6);
      }

      class_1331 var8 = this.field_18930.method_8516().method_37075();
      String var9 = class_7665.method_34674().getName();
      if (!this.field_18930.method_8520()) {
         var9 = class_412.method_2051(class_3347.method_15349()).method_2045();
      }

      if (this.field_18930.method_8503()) {
         return Lists.newArrayList(
            new String[]{
               "Minecraft " + var9 + " (" + this.field_18930.method_8559() + "/" + class_6489.method_29605() + ")",
               this.field_18930.field_9584,
               var7,
               this.field_18930.worldRenderer.method_20005(),
               this.field_18930.worldRenderer.method_20056(),
               "P: " + this.field_18930.field_9572.method_43053() + ". T: " + this.field_18930.field_9601.method_741(),
               this.field_18930.field_9601.method_29580(),
               "",
               String.format("Chunk-relative: %d %d %d", var8.method_12173() & 15, var8.method_12165() & 15, var8.method_12185() & 15)
            }
         );
      } else {
         Entity var10 = this.field_18930.method_8516();
         Direction var11 = var10.method_37365();
         String var12;
         switch (var11) {
            case field_818:
               var12 = "Towards negative Z";
               break;
            case field_800:
               var12 = "Towards positive Z";
               break;
            case field_809:
               var12 = "Towards negative X";
               break;
            case field_804:
               var12 = "Towards positive X";
               break;
            default:
               var12 = "Invalid";
         }

         class_2034 var13 = new class_2034(var8);
         if (!Objects.equals(this.field_18921, var13)) {
            this.field_18921 = var13;
            this.method_17995();
         }

         World var14 = this.method_17981();
         Object var15 = var14 instanceof class_6331 ? ((class_6331)var14).method_28923() : LongSets.EMPTY_SET;
         ArrayList var16 = Lists.newArrayList(
            new String[]{
               "Minecraft "
                  + class_7665.method_34674().getName()
                  + " ("
                  + this.field_18930.method_8559()
                  + "/"
                  + class_6489.method_29605()
                  + ("release".equalsIgnoreCase(this.field_18930.method_8539()) ? "" : "/" + this.field_18930.method_8539())
                  + ")",
               this.field_18930.field_9584,
               var7,
               this.field_18930.worldRenderer.method_20005(),
               this.field_18930.worldRenderer.method_20056(),
               "P: " + this.field_18930.field_9572.method_43053() + ". T: " + this.field_18930.field_9601.method_741(),
               this.field_18930.field_9601.method_29580()
            }
         );
         String var17 = this.method_17983();
         if (var17 != null) {
            var16.add(var17);
         }

         var16.add(this.field_18930.field_9601.method_29545().method_25499() + " FC: " + var15.size());
         var16.add("");
         var16.add(
            String.format(
               Locale.ROOT,
               "XYZ: %.3f / %.5f / %.3f",
               this.field_18930.method_8516().method_37302(),
               this.field_18930.method_8516().method_37309(),
               this.field_18930.method_8516().method_37156()
            )
         );
         var16.add(String.format("Block: %d %d %d", var8.method_12173(), var8.method_12165(), var8.method_12185()));
         var16.add(
            String.format(
               "Chunk: %d %d %d in %d %d %d",
               var8.method_12173() & 15,
               var8.method_12165() & 15,
               var8.method_12185() & 15,
               var8.method_12173() >> 4,
               var8.method_12165() >> 4,
               var8.method_12185() >> 4
            )
         );
         var16.add(
            String.format(
               Locale.ROOT,
               "Facing: %s (%s) (%.1f / %.1f)",
               var11,
               var12,
               class_9299.method_42810(var10.field_41701),
               class_9299.method_42810(var10.field_41755)
            )
         );
         if (this.field_18930.field_9601 != null) {
            if (this.field_18930.field_9601.method_22559(var8)) {
               class_2654 var18 = this.method_17990();
               if (var18.method_12003()) {
                  var16.add("Waiting for chunk...");
               } else {
                  int var19 = this.field_18930.field_9601.method_745().method_14813().method_21565(var8, 0);
                  int var20 = this.field_18930.field_9601.method_25266(class_2957.field_14437, var8);
                  int var21 = this.field_18930.field_9601.method_25266(class_2957.field_14440, var8);
                  var16.add("Client Light: " + var19 + " (" + var20 + " sky, " + var21 + " block)");
                  class_2654 var22 = this.method_17991();
                  if (var22 != null) {
                     class_4663 var23 = var14.method_43363().method_14813();
                     var16.add(
                        "Server Light: ("
                           + var23.method_21562(class_2957.field_14437).method_45335(var8)
                           + " sky, "
                           + var23.method_21562(class_2957.field_14440).method_45335(var8)
                           + " block)"
                     );
                  } else {
                     var16.add("Server Light: (?? sky, ?? block)");
                  }

                  StringBuilder var35 = new StringBuilder("CH");

                  for (class_3801 var27 : class_3801.values()) {
                     if (var27.method_17677()) {
                        var35.append(" ")
                           .append(field_18927.get(var27))
                           .append(": ")
                           .append(var18.method_27367(var27, var8.method_12173(), var8.method_12185()));
                     }
                  }

                  var16.add(var35.toString());
                  var35.setLength(0);
                  var35.append("SH");

                  for (class_3801 var40 : class_3801.values()) {
                     if (var40.method_17678()) {
                        var35.append(" ").append(field_18927.get(var40)).append(": ");
                        if (var22 != null) {
                           var35.append(var22.method_27367(var40, var8.method_12173(), var8.method_12185()));
                        } else {
                           var35.append("??");
                        }
                     }
                  }

                  var16.add(var35.toString());
                  if (var8.method_12165() >= 0 && var8.method_12165() < 256) {
                     var16.add(
                        "Biome: "
                           + this.field_18930
                              .field_9601
                              .method_2755()
                              .<class_6325>method_28813(class_8669.field_44359)
                              .method_39797(this.field_18930.field_9601.method_22561(var8))
                     );
                     long var28 = 0L;
                     float var39 = 0.0F;
                     if (var22 != null) {
                        var39 = var14.method_13576();
                        var28 = var22.method_27340();
                     }

                     class_9589 var41 = new class_9589(var14.method_43370(), var14.method_29584(), var28, var39);
                     var16.add(
                        String.format(
                           Locale.ROOT,
                           "Local Difficulty: %.2f // %.2f (Day %d)",
                           var41.method_44283(),
                           var41.method_44284(),
                           this.field_18930.field_9601.method_29584() / 24000L
                        )
                     );
                  }
               }
            } else {
               var16.add("Outside of world...");
            }
         } else {
            var16.add("Outside of world...");
         }

         class_6331 var30 = this.method_17992();
         if (var30 != null) {
            class_1728 var31 = var30.method_28945().method_10185();
            if (var31 != null) {
               Object2IntMap var33 = var31.method_7732();
               int var34 = var31.method_7729();
               var16.add(
                  "SC: "
                     + var34
                     + ", "
                     + Stream.<class_4565>of(class_4565.values())
                        .<CharSequence>map(var1 -> Character.toUpperCase(var1.method_21202().charAt(0)) + ": " + var33.getInt(var1))
                        .collect(Collectors.joining(", "))
               );
            } else {
               var16.add("SC: N/A");
            }
         }

         class_4067 var32 = this.field_18930.gameRenderer.method_35930();
         if (var32 != null) {
            var16.add("Shader: " + var32.method_18752());
         }

         var16.add(
            this.field_18930.method_8590().method_16332() + String.format(" (Mood %d%%)", Math.round(this.field_18930.field_9632.method_27306() * 100.0F))
         );
         return var16;
      }
   }

   @Nullable
   private class_6331 method_17992() {
      class_7762 var3 = this.field_18930.method_8515();
      return var3 == null ? null : var3.method_1697(this.field_18930.field_9601.method_29545());
   }

   @Nullable
   private String method_17983() {
      class_6331 var3 = this.method_17992();
      return var3 == null ? null : var3.method_29580();
   }

   private World method_17981() {
      return (World)DataFixUtils.orElse(
         Optional.<class_7762>ofNullable(this.field_18930.method_8515())
            .<class_6331>flatMap(var1 -> Optional.ofNullable(var1.method_1697(this.field_18930.field_9601.method_29545()))),
         this.field_18930.field_9601
      );
   }

   @Nullable
   private class_2654 method_17991() {
      if (this.field_18926 == null) {
         class_6331 var3 = this.method_17992();
         if (var3 != null) {
            this.field_18926 = var3.method_28945()
               .method_10187(this.field_18921.field_10328, this.field_18921.field_10327, class_7335.field_37514, false)
               .<class_2654>thenApply(var0 -> (class_2654)var0.map(var0x -> (class_2654)var0x, var0x -> null));
         }

         if (this.field_18926 == null) {
            this.field_18926 = CompletableFuture.<class_2654>completedFuture(this.method_17990());
         }
      }

      return this.field_18926.getNow((class_2654)null);
   }

   private class_2654 method_17990() {
      if (this.field_18920 == null) {
         this.field_18920 = this.field_18930.field_9601.method_29554(this.field_18921.field_10328, this.field_18921.field_10327);
      }

      return this.field_18920;
   }

   public List<String> method_17994() {
      long var3 = Runtime.getRuntime().maxMemory();
      long var5 = Runtime.getRuntime().totalMemory();
      long var7 = Runtime.getRuntime().freeMemory();
      long var9 = var5 - var7;
      ArrayList var11 = Lists.newArrayList(
         new String[]{
            String.format("Java: %s %dbit", System.getProperty("java.version"), !this.field_18930.method_8533() ? 32 : 64),
            String.format("Mem: % 2d%% %03d/%03dMB", var9 * 100L / var3, method_17986(var9), method_17986(var3)),
            String.format("Allocated: % 2d%% %03dMB", var5 * 100L / var3, method_17986(var5)),
            "",
            String.format("CPU: %s", class_6765.method_31015()),
            "",
            String.format(
               "Display: %dx%d (%s)",
               MinecraftClient.getInstance().method_8552().method_43178(),
               MinecraftClient.getInstance().method_8552().method_43198(),
               class_6765.method_31017()
            ),
            class_6765.method_31016(),
            class_6765.method_31018()
         }
      );
      long var12 = class_7949.method_35984();
      long var14 = class_7949.method_35981();
      long var16 = class_7949.method_35988();
      String var18 = "Native: " + method_17986(var12) + "/" + method_17986(var14) + "+" + method_17986(var16) + "MB";
      var11.add(3, var18);
      var11.set(4, "GC: " + class_5849.method_26673() + "MB/s");
      if (class_7860.field_40027.method_3596()) {
         var11.add("");

         for (String var20 : (Iterable)class_7860.method_35556(class_7860.field_40027, true, false)) {
            if (!var20.startsWith("Minecraft ")) {
               var11.add(var20);
            }
         }
      }

      if (this.field_18930.method_8503()) {
         return var11;
      } else {
         if (this.field_18928.method_33990() == class_1430.field_7717) {
            class_1331 var24 = ((class_9529)this.field_18928).method_43955();
            class_2522 var27 = this.field_18930.field_9601.method_28262(var24);
            var11.add("");
            var11.add(TextFormatting.UNDERLINE + "Targeted Block: " + var24.method_12173() + ", " + var24.method_12165() + ", " + var24.method_12185());
            var11.add(String.valueOf(class_8669.field_44462.method_39797(var27.method_8360())));
            UnmodifiableIterator var21 = var27.method_10316().entrySet().iterator();

            while (var21.hasNext()) {
               Entry var22 = (Entry)var21.next();
               var11.add(this.method_17988(var22));
            }

            Collection var30;
            if (!class_7860.field_40138.method_3596()) {
               var30 = this.field_18930.method_8614().method_4804().method_29392().method_43143(var27.method_8360());
            } else {
               var30 = (Collection)class_7860.method_35555(var27.method_8360(), class_7860.field_40138);
            }

            for (Identifier var23 : var30) {
               var11.add("#" + var23);
            }
         }

         if (this.field_18929.method_33990() == class_1430.field_7717) {
            class_1331 var25 = ((class_9529)this.field_18929).method_43955();
            class_4774 var28 = this.field_18930.field_9601.method_28258(var25);
            var11.add("");
            var11.add(TextFormatting.UNDERLINE + "Targeted Fluid: " + var25.method_12173() + ", " + var25.method_12165() + ", " + var25.method_12185());
            var11.add(String.valueOf(class_8669.field_44447.method_39797(var28.method_22005())));
            UnmodifiableIterator var31 = var28.method_10316().entrySet().iterator();

            while (var31.hasNext()) {
               Entry var34 = (Entry)var31.next();
               var11.add(this.method_17988(var34));
            }

            Collection var32;
            if (!class_7860.field_39971.method_3596()) {
               var32 = this.field_18930.method_8614().method_4804().method_29391().method_43143(var28.method_22005());
            } else {
               var32 = (Collection)class_7860.method_35555(var28.method_22005(), class_7860.field_39971);
            }

            for (Identifier var36 : var32) {
               var11.add("#" + var36);
            }
         }

         Entity var26 = this.field_18930.field_9662;
         if (var26 != null) {
            var11.add("");
            var11.add(TextFormatting.UNDERLINE + "Targeted Entity");
            var11.add(String.valueOf(class_8669.field_44400.method_39797(var26.method_37387())));
            if (class_7860.field_39843.method_3596()) {
               Collection var29 = (Collection)class_7860.method_35555(var26.method_37387(), class_7860.field_39843);
               var29.forEach(var1 -> var11.add("#" + var1));
            }
         }

         return var11;
      }
   }

   private String method_17988(Entry<class_5019<?>, Comparable<?>> var1) {
      class_5019 var4 = (class_5019)var1.getKey();
      Comparable var5 = (Comparable)var1.getValue();
      Object var6 = Util.getValueAsString(var4, var5);
      if (!Boolean.TRUE.equals(var5)) {
         if (Boolean.FALSE.equals(var5)) {
            var6 = TextFormatting.RED + var6;
         }
      } else {
         var6 = TextFormatting.GREEN + var6;
      }

      return var4.method_23109() + ": " + var6;
   }

   private void method_17984(class_7966 var1, class_9703 var2, int var3, int var4, boolean var5) {
      if (!var5) {
         int var8 = (int)(512.0 / this.field_18930.method_8552().method_43189());
         var3 = Math.max(var3, var8);
         var4 = this.field_18930.method_8552().method_43165() - var3;
         class_3542.method_16491();
         int var9 = var2.method_44834();
         int var10 = var2.method_44832();
         long[] var11 = var2.method_44838();
         int var12 = var3;
         int var13 = Math.max(0, var11.length - var4);
         int var14 = var11.length - var13;
         int var15 = var2.method_44835(var9 + var13);
         long var16 = 0L;
         int var18 = Integer.MAX_VALUE;
         int var19 = Integer.MIN_VALUE;

         for (int var20 = 0; var20 < var14; var20++) {
            int var21 = (int)(var11[var2.method_44835(var15 + var20)] / 1000000L);
            var18 = Math.min(var18, var21);
            var19 = Math.max(var19, var21);
            var16 += (long)var21;
         }

         int var32 = this.field_18930.method_8552().method_43177();
         method_9774(var1, var3, var32 - 60, var3 + var14, var32, -1873784752);
         class_9633 var33 = class_8042.method_36499().method_36501();
         class_3542.method_16488();
         class_3542.method_16354();
         class_3542.method_16437();
         var33.method_44471(7, class_7985.field_40903);

         for (class_8107 var22 = class_1221.method_5406().method_5410(); var15 != var10; var15 = var2.method_44835(var15 + 1)) {
            int var23 = var2.method_44833(var11[var15], !var5 ? 60 : 30, !var5 ? 20 : 60);
            int var24 = !var5 ? 60 : 100;
            int var25 = this.method_17987(class_9299.method_42829(var23, 0, var24), 0, var24 / 2, var24);
            int var26 = var25 >> 24 & 0xFF;
            int var27 = var25 >> 16 & 0xFF;
            int var28 = var25 >> 8 & 0xFF;
            int var29 = var25 & 0xFF;
            var33.method_35762(var22, (float)(var12 + 1), (float)var32, 0.0F).method_35743(var27, var28, var29, var26).method_35735();
            var33.method_35762(var22, (float)(var12 + 1), (float)(var32 - var23 + 1), 0.0F).method_35743(var27, var28, var29, var26).method_35735();
            var33.method_35762(var22, (float)var12, (float)(var32 - var23 + 1), 0.0F).method_35743(var27, var28, var29, var26).method_35735();
            var33.method_35762(var22, (float)var12, (float)var32, 0.0F).method_35743(var27, var28, var29, var26).method_35735();
            var12++;
         }

         var33.method_44487();
         class_138.method_554(var33);
         class_3542.method_16432();
         class_3542.method_16448();
         if (!var5) {
            method_9774(var1, var3 + 1, var32 - 60 + 1, var3 + 14, var32 - 60 + 10, -1873784752);
            this.field_18918.method_45385(var1, "20 TPS", (float)(var3 + 2), (float)(var32 - 60 + 2), 14737632);
            this.method_9789(var1, var3, var3 + var14 - 1, var32 - 60, -1);
         } else {
            method_9774(var1, var3 + 1, var32 - 30 + 1, var3 + 14, var32 - 30 + 10, -1873784752);
            this.field_18918.method_45385(var1, "60 FPS", (float)(var3 + 2), (float)(var32 - 30 + 2), 14737632);
            this.method_9789(var1, var3, var3 + var14 - 1, var32 - 30, -1);
            method_9774(var1, var3 + 1, var32 - 60 + 1, var3 + 14, var32 - 60 + 10, -1873784752);
            this.field_18918.method_45385(var1, "30 FPS", (float)(var3 + 2), (float)(var32 - 60 + 2), 14737632);
            this.method_9789(var1, var3, var3 + var14 - 1, var32 - 60, -1);
         }

         this.method_9789(var1, var3, var3 + var14 - 1, var32 - 1, -1);
         this.method_9790(var1, var3, var32 - 60, var32, -1);
         this.method_9790(var1, var3 + var14 - 1, var32 - 60, var32, -1);
         if (var5 && this.field_18930.gameOptions.field_45439 > 0 && this.field_18930.gameOptions.field_45439 <= 250) {
            this.method_9789(var1, var3, var3 + var14 - 1, var32 - 1 - (int)(1800.0 / (double)this.field_18930.gameOptions.field_45439), -16711681);
         }

         String var34 = var18 + " ms min";
         String var35 = var16 / (long)var14 + " ms avg";
         String var36 = var19 + " ms max";
         this.field_18918.method_45390(var1, var34, (float)(var3 + 2), (float)(var32 - 60 - 9), 14737632);
         this.field_18918.method_45390(var1, var35, (float)(var3 + var14 / 2 - this.field_18918.method_45395(var35) / 2), (float)(var32 - 60 - 9), 14737632);
         this.field_18918.method_45390(var1, var36, (float)(var3 + var14 - this.field_18918.method_45395(var36)), (float)(var32 - 60 - 9), 14737632);
         class_3542.method_16428();
      }
   }

   private int method_17987(int var1, int var2, int var3, int var4) {
      return var1 >= var3
         ? this.method_17980(-256, -65536, (float)(var1 - var3) / (float)(var4 - var3))
         : this.method_17980(-16711936, -256, (float)var1 / (float)var3);
   }

   private int method_17980(int var1, int var2, float var3) {
      int var6 = var1 >> 24 & 0xFF;
      int var7 = var1 >> 16 & 0xFF;
      int var8 = var1 >> 8 & 0xFF;
      int var9 = var1 & 0xFF;
      int var10 = var2 >> 24 & 0xFF;
      int var11 = var2 >> 16 & 0xFF;
      int var12 = var2 >> 8 & 0xFF;
      int var13 = var2 & 0xFF;
      int var14 = class_9299.method_42829((int)class_9299.method_42795(var3, (float)var6, (float)var10), 0, 255);
      int var15 = class_9299.method_42829((int)class_9299.method_42795(var3, (float)var7, (float)var11), 0, 255);
      int var16 = class_9299.method_42829((int)class_9299.method_42795(var3, (float)var8, (float)var12), 0, 255);
      int var17 = class_9299.method_42829((int)class_9299.method_42795(var3, (float)var9, (float)var13), 0, 255);
      return var14 << 24 | var15 << 16 | var16 << 8 | var17;
   }

   private static long method_17986(long var0) {
      return var0 / 1024L / 1024L;
   }
}
