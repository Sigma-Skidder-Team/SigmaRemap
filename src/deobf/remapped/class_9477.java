package remapped;

import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.shorts.ShortList;
import it.unimi.dsi.fastutil.shorts.ShortListIterator;
import java.util.Arrays;
import java.util.BitSet;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_9477 {
   private static final Logger field_48308 = LogManager.getLogger();

   public static class_7481 method_43781(class_6331 var0, class_5799 var1, class_1489 var2, class_2034 var3, CompoundNBT var4) {
      class_6541 var7 = var0.method_28945().method_10189();
      class_3498 var8 = var7.method_29817();
      CompoundNBT var9 = var4.getCompound("Level");
      class_2034 var10 = new class_2034(var9.method_25947("xPos"), var9.method_25947("zPos"));
      if (!Objects.equals(var3, var10)) {
         field_48308.error("Chunk file at {} is in the wrong location; relocating. (Expected {}, got {})", var3, var3, var10);
      }

      class_546 var11 = new class_546(
         var0.method_2755().<class_6325>method_28813(class_8669.field_44359), var3, var8, !var9.contains("Biomes", 11) ? null : var9.method_25922("Biomes")
      );
      class_6397 var12 = !var9.contains("UpgradeData", 10) ? class_6397.field_32658 : new class_6397(var9.getCompound("UpgradeData"));
      class_2080 var13 = new class_2080<class_6414>(var0x -> var0x == null || var0x.method_29260().method_8345(), var3, var9.method_25927("ToBeTicked", 9));
      class_2080 var14 = new class_2080<class_2340>(var0x -> var0x == null || var0x == class_8532.field_43673, var3, var9.method_25927("LiquidsToBeTicked", 9));
      boolean var15 = var9.getBoolean("isLightOn");
      class_3416 var16 = var9.method_25927("Sections", 10);
      byte var17 = 16;
      class_1315[] var18 = new class_1315[16];
      boolean var19 = var0.method_22572().method_40229();
      class_2206 var20 = var0.method_28945();
      class_4663 var21 = var20.method_14813();
      if (var15) {
         var21.method_21561(var3, true);
      }

      for (int var22 = 0; var22 < var16.size(); var22++) {
         CompoundNBT var30 = var16.method_15764(var22);
         byte var25 = var30.method_25950("Y");
         if (var30.contains("Palette", 9) && var30.contains("BlockStates", 12)) {
            class_1315 var27 = new class_1315(var25 << 4);
            var27.method_6006().method_24692(var30.method_25927("Palette", 10), var30.method_25942("BlockStates"));
            var27.method_6005();
            if (!var27.method_6002()) {
               var18[var25] = var27;
            }

            var2.method_6879(var3, var27);
         }

         if (var15) {
            if (var30.contains("BlockLight", 7)) {
               var21.method_21568(class_2957.field_14440, class_6979.method_31922(var3, var25), new class_1201(var30.method_25930("BlockLight")), true);
            }

            if (var19 && var30.contains("SkyLight", 7)) {
               var21.method_21568(class_2957.field_14437, class_6979.method_31922(var3, var25), new class_1201(var30.method_25930("SkyLight")), true);
            }
         }
      }

      long var23 = var9.method_25948("InhabitedTime");
      class_5592 var40 = method_43785(var4);
      Object var43;
      if (var40 != class_5592.field_28385) {
         class_7481 var26 = new class_7481(var3, var12, var18, var13, var14);
         var26.method_34032(var11);
         var43 = var26;
         var26.method_27369(var23);
         var26.method_34030(class_7335.method_33461(var9.method_25965("Status")));
         if (var26.method_27364().method_33453(class_7335.field_37499)) {
            var26.method_34033(var21);
         }

         if (!var15 && var26.method_27364().method_33453(class_7335.field_37512)) {
            for (BlockPos var29 : BlockPos.method_6075(var3.method_9535(), 0, var3.method_9545(), var3.method_9536(), 255, var3.method_9538())) {
               if (((class_5990)var43).method_28262(var29).method_8339() != 0) {
                  var26.method_34021(var29);
               }
            }
         }
      } else {
         Object var41;
         if (!var9.contains("TileTicks", 9)) {
            var41 = var13;
         } else {
            var41 = class_968.<class_6414>method_4243(
               var9.method_25927("TileTicks", 10), class_8669.field_44462::method_39797, class_8669.field_44462::method_39806
            );
         }

         Object var44;
         if (!var9.contains("LiquidTicks", 9)) {
            var44 = var14;
         } else {
            var44 = class_968.<class_2340>method_4243(
               var9.method_25927("LiquidTicks", 10), class_8669.field_44447::method_39797, class_8669.field_44447::method_39806
            );
         }

         var43 = new class_2654(
            var0.method_7066(),
            var3,
            var11,
            var12,
            (class_3065<class_6414>)var41,
            (class_3065<class_2340>)var44,
            var23,
            var18,
            var1x -> method_43780(var9, var1x)
         );
      }

      ((class_5990)var43).method_27362(var15);
      CompoundNBT var42 = var9.getCompound("Heightmaps");
      EnumSet var45 = EnumSet.<class_3801>noneOf(class_3801.class);

      for (class_3801 var31 : ((class_5990)var43).method_27364().method_33447()) {
         String var32 = var31.method_17676();
         if (!var42.contains(var32, 12)) {
            var45.add(var31);
         } else {
            ((class_5990)var43).method_27357(var31, var42.method_25942(var32));
         }
      }

      class_2131.method_9953((class_5990)var43, var45);
      CompoundNBT var47 = var9.getCompound("Structures");
      ((class_5990)var43).method_27351(method_43784(var1, var47, var0.method_3133()));
      ((class_5990)var43).method_15065(method_43778(var3, var47));
      if (var9.getBoolean("shouldSave")) {
         ((class_5990)var43).method_27361(true);
      }

      class_3416 var48 = var9.method_25927("PostProcessing", 9);

      for (int var49 = 0; var49 < var48.size(); var49++) {
         class_3416 var33 = var48.method_15760(var49);

         for (int var34 = 0; var34 < var33.size(); var34++) {
            ((class_5990)var43).method_27341(var33.method_15765(var34), var49);
         }
      }

      if (var40 == class_5592.field_28385) {
         return new class_2711((class_2654)var43);
      } else {
         class_7481 var50 = (class_7481)var43;
         class_3416 var51 = var9.method_25927("Entities", 10);

         for (int var52 = 0; var52 < var51.size(); var52++) {
            var50.method_34020(var51.method_15764(var52));
         }

         class_3416 var53 = var9.method_25927("TileEntities", 10);

         for (int var35 = 0; var35 < var53.size(); var35++) {
            CompoundNBT var36 = var53.method_15764(var35);
            ((class_5990)var43).method_27347(var36);
         }

         class_3416 var54 = var9.method_25927("Lights", 9);

         for (int var55 = 0; var55 < var54.size(); var55++) {
            class_3416 var37 = var54.method_15760(var55);

            for (int var38 = 0; var38 < var37.size(); var38++) {
               var50.method_34018(var37.method_15765(var38), var55);
            }
         }

         CompoundNBT var56 = var9.getCompound("CarvingMasks");

         for (String var58 : var56.method_25952()) {
            class_6033 var39 = class_6033.valueOf(var58);
            var50.method_34014(var39, BitSet.valueOf(var56.method_25930(var58)));
         }

         return var50;
      }
   }

   public static CompoundNBT method_43779(class_6331 var0, class_5990 var1) {
      class_2034 var4 = var1.method_27352();
      CompoundNBT var5 = new CompoundNBT();
      CompoundNBT var6 = new CompoundNBT();
      var5.method_25931("DataVersion", class_7665.method_34674().getWorldVersion());
      var5.put("Level", var6);
      var6.method_25931("xPos", var4.field_10328);
      var6.method_25931("zPos", var4.field_10327);
      var6.method_25949("LastUpdate", var0.method_29546());
      var6.method_25949("InhabitedTime", var1.method_27340());
      var6.method_25941("Status", var1.method_27364().method_33460());
      class_6397 var7 = var1.method_27343();
      if (!var7.method_29208()) {
         var6.put("UpgradeData", var7.method_29205());
      }

      class_1315[] var8 = var1.method_27349();
      class_3416 var9 = new class_3416();
      class_2087 var10 = var0.method_28945().method_10175();
      boolean var11 = var1.method_27339();

      for (int var12 = -1; var12 < 17; var12++) {
         int var13 = var12;
         class_1315 var14 = Arrays.<class_1315>stream(var8)
            .filter(var1x -> var1x != null && var1x.method_5997() >> 4 == var13)
            .findFirst()
            .orElse(class_2654.field_13073);
         class_1201 var15 = var10.method_21562(class_2957.field_14440).method_45336(class_6979.method_31922(var4, var13));
         class_1201 var16 = var10.method_21562(class_2957.field_14437).method_45336(class_6979.method_31922(var4, var13));
         if (var14 != class_2654.field_13073 || var15 != null || var16 != null) {
            CompoundNBT var17 = new CompoundNBT();
            var17.method_25921("Y", (byte)(var13 & 0xFF));
            if (var14 != class_2654.field_13073) {
               var14.method_6006().method_24683(var17, "Palette", "BlockStates");
            }

            if (var15 != null && !var15.method_5315()) {
               var17.method_25953("BlockLight", var15.method_5317());
            }

            if (var16 != null && !var16.method_5315()) {
               var17.method_25953("SkyLight", var16.method_5317());
            }

            var9.add(var17);
         }
      }

      var6.put("Sections", var9);
      if (var11) {
         var6.putBoolean("isLightOn", true);
      }

      class_546 var22 = var1.method_27356();
      if (var22 != null) {
         var6.method_25969("Biomes", var22.method_2643());
      }

      class_3416 var23 = new class_3416();

      for (BlockPos var26 : var1.method_27366()) {
         CompoundNBT var30 = var1.method_27345(var26);
         if (var30 != null) {
            var23.add(var30);
         }
      }

      var6.put("TileEntities", var23);
      class_3416 var25 = new class_3416();
      if (var1.method_27364().method_33446() != class_5592.field_28385) {
         class_7481 var27 = (class_7481)var1;
         var25.addAll(var27.method_34027());
         var6.put("Lights", method_43782(var27.method_34029()));
         CompoundNBT var31 = new CompoundNBT();

         for (class_6033 var20 : class_6033.values()) {
            BitSet var21 = var27.method_34023(var20);
            if (var21 != null) {
               var31.method_25953(var20.toString(), var21.toByteArray());
            }
         }

         var6.put("CarvingMasks", var31);
      } else {
         class_2654 var28 = (class_2654)var1;
         var28.method_11996(false);

         for (int var32 = 0; var32 < var28.method_11979().length; var32++) {
            for (Entity var37 : var28.method_11979()[var32]) {
               CompoundNBT var39 = new CompoundNBT();
               if (var37.method_37350(var39)) {
                  var28.method_11996(true);
                  var25.add(var39);
               }
            }
         }
      }

      var6.put("Entities", var25);
      class_3065 var29 = var1.method_27335();
      if (!(var29 instanceof class_2080)) {
         if (!(var29 instanceof class_968)) {
            var6.put("TileTicks", var0.method_28968().method_13098(var4));
         } else {
            var6.put("TileTicks", ((class_968)var29).method_4244());
         }
      } else {
         var6.put("ToBeTicked", ((class_2080)var29).method_9707());
      }

      class_3065 var33 = var1.method_27336();
      if (!(var33 instanceof class_2080)) {
         if (!(var33 instanceof class_968)) {
            var6.put("LiquidTicks", var0.method_28940().method_13098(var4));
         } else {
            var6.put("LiquidTicks", ((class_968)var33).method_4244());
         }
      } else {
         var6.put("LiquidsToBeTicked", ((class_2080)var33).method_9707());
      }

      var6.put("PostProcessing", method_43782(var1.method_27359()));
      CompoundNBT var36 = new CompoundNBT();

      for (Entry var40 : var1.method_27354()) {
         if (var1.method_27364().method_33447().contains(var40.getKey())) {
            var36.put(((class_3801)var40.getKey()).method_17676(), new class_1129(((class_2131)var40.getValue()).method_9954()));
         }
      }

      var6.put("Heightmaps", var36);
      var6.put("Structures", method_43786(var4, var1.method_27363(), var1.method_15066()));
      return var5;
   }

   public static class_5592 method_43785(CompoundNBT var0) {
      if (var0 != null) {
         class_7335 var3 = class_7335.method_33461(var0.getCompound("Level").method_25965("Status"));
         if (var3 != null) {
            return var3.method_33446();
         }
      }

      return class_5592.field_28386;
   }

   private static void method_43780(CompoundNBT var0, class_2654 var1) {
      class_3416 var4 = var0.method_25927("Entities", 10);
      World var5 = var1.method_11997();

      for (int var6 = 0; var6 < var4.size(); var6++) {
         CompoundNBT var7 = var4.method_15764(var6);
         EntityType.method_30455(var7, var5, var1x -> {
            var1.method_27342(var1x);
            return var1x;
         });
         var1.method_11996(true);
      }

      class_3416 var12 = var0.method_25927("TileEntities", 10);

      for (int var13 = 0; var13 < var12.size(); var13++) {
         CompoundNBT var8 = var12.method_15764(var13);
         boolean var9 = var8.getBoolean("keepPacked");
         if (!var9) {
            BlockPos var10 = new BlockPos(var8.method_25947("x"), var8.method_25947("y"), var8.method_25947("z"));
            class_3757 var11 = class_3757.method_17410(var1.method_28262(var10), var8);
            if (var11 != null) {
               var1.method_11982(var11);
            }
         } else {
            var1.method_27347(var8);
         }
      }
   }

   private static CompoundNBT method_43786(class_2034 var0, Map<class_5390<?>, class_3200<?>> var1, Map<class_5390<?>, LongSet> var2) {
      CompoundNBT var5 = new CompoundNBT();
      CompoundNBT var6 = new CompoundNBT();

      for (Entry var8 : var1.entrySet()) {
         var6.put(((class_5390)var8.getKey()).method_24556(), ((class_3200)var8.getValue()).method_14734(var0.field_10328, var0.field_10327));
      }

      var5.put("Starts", var6);
      CompoundNBT var10 = new CompoundNBT();

      for (Entry var9 : var2.entrySet()) {
         var10.put(((class_5390)var9.getKey()).method_24556(), new class_1129((LongSet)var9.getValue()));
      }

      var5.put("References", var10);
      return var5;
   }

   private static Map<class_5390<?>, class_3200<?>> method_43784(class_5799 var0, CompoundNBT var1, long var2) {
      HashMap var6 = Maps.newHashMap();
      CompoundNBT var7 = var1.getCompound("Starts");

      for (String var9 : var7.method_25952()) {
         String var10 = var9.toLowerCase(Locale.ROOT);
         class_5390 var11 = (class_5390)class_5390.field_27500.get(var10);
         if (var11 != null) {
            class_3200 var12 = class_5390.method_24555(var0, var7.getCompound(var9), var2);
            if (var12 != null) {
               var6.put(var11, var12);
            }
         } else {
            field_48308.error("Unknown structure start: {}", var10);
         }
      }

      return var6;
   }

   private static Map<class_5390<?>, LongSet> method_43778(class_2034 var0, CompoundNBT var1) {
      HashMap var4 = Maps.newHashMap();
      CompoundNBT var5 = var1.getCompound("References");

      for (String var7 : var5.method_25952()) {
         var4.put(class_5390.field_27500.get(var7.toLowerCase(Locale.ROOT)), new LongOpenHashSet(Arrays.stream(var5.method_25942(var7)).filter(var2 -> {
            class_2034 var6 = new class_2034(var2);
            if (var6.method_9549(var0) <= 8) {
               return true;
            } else {
               field_48308.warn("Found invalid structure reference [ {} @ {} ] for chunk {}.", var7, var6, var0);
               return false;
            }
         }).toArray()));
      }

      return var4;
   }

   public static class_3416 method_43782(ShortList[] var0) {
      class_3416 var3 = new class_3416();

      for (ShortList var7 : var0) {
         class_3416 var8 = new class_3416();
         if (var7 != null) {
            ShortListIterator var9 = var7.iterator();

            while (var9.hasNext()) {
               Short var10 = (Short)var9.next();
               var8.add(class_7745.method_35070(var10));
            }
         }

         var3.add(var8);
      }

      return var3;
   }
}
