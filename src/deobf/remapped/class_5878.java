package remapped;

import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.BitSet;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_5878 extends DataFix {
   private static final Logger field_29850 = LogManager.getLogger();
   private static final BitSet field_29845 = new BitSet(256);
   private static final BitSet field_29843 = new BitSet(256);
   private static final Dynamic<?> field_29836 = class_8237.method_37727("{Name:'minecraft:pumpkin'}");
   private static final Dynamic<?> field_29837 = class_8237.method_37727("{Name:'minecraft:podzol',Properties:{snowy:'true'}}");
   private static final Dynamic<?> field_29844 = class_8237.method_37727("{Name:'minecraft:grass_block',Properties:{snowy:'true'}}");
   private static final Dynamic<?> field_29853 = class_8237.method_37727("{Name:'minecraft:mycelium',Properties:{snowy:'true'}}");
   private static final Dynamic<?> field_29840 = class_8237.method_37727("{Name:'minecraft:sunflower',Properties:{half:'upper'}}");
   private static final Dynamic<?> field_29855 = class_8237.method_37727("{Name:'minecraft:lilac',Properties:{half:'upper'}}");
   private static final Dynamic<?> field_29852 = class_8237.method_37727("{Name:'minecraft:tall_grass',Properties:{half:'upper'}}");
   private static final Dynamic<?> field_29856 = class_8237.method_37727("{Name:'minecraft:large_fern',Properties:{half:'upper'}}");
   private static final Dynamic<?> field_29849 = class_8237.method_37727("{Name:'minecraft:rose_bush',Properties:{half:'upper'}}");
   private static final Dynamic<?> field_29846 = class_8237.method_37727("{Name:'minecraft:peony',Properties:{half:'upper'}}");
   private static final Map<String, Dynamic<?>> field_29838 = (Map<String, Dynamic<?>>)DataFixUtils.make(Maps.newHashMap(), var0 -> {
      var0.put("minecraft:air0", class_8237.method_37727("{Name:'minecraft:flower_pot'}"));
      var0.put("minecraft:red_flower0", class_8237.method_37727("{Name:'minecraft:potted_poppy'}"));
      var0.put("minecraft:red_flower1", class_8237.method_37727("{Name:'minecraft:potted_blue_orchid'}"));
      var0.put("minecraft:red_flower2", class_8237.method_37727("{Name:'minecraft:potted_allium'}"));
      var0.put("minecraft:red_flower3", class_8237.method_37727("{Name:'minecraft:potted_azure_bluet'}"));
      var0.put("minecraft:red_flower4", class_8237.method_37727("{Name:'minecraft:potted_red_tulip'}"));
      var0.put("minecraft:red_flower5", class_8237.method_37727("{Name:'minecraft:potted_orange_tulip'}"));
      var0.put("minecraft:red_flower6", class_8237.method_37727("{Name:'minecraft:potted_white_tulip'}"));
      var0.put("minecraft:red_flower7", class_8237.method_37727("{Name:'minecraft:potted_pink_tulip'}"));
      var0.put("minecraft:red_flower8", class_8237.method_37727("{Name:'minecraft:potted_oxeye_daisy'}"));
      var0.put("minecraft:yellow_flower0", class_8237.method_37727("{Name:'minecraft:potted_dandelion'}"));
      var0.put("minecraft:sapling0", class_8237.method_37727("{Name:'minecraft:potted_oak_sapling'}"));
      var0.put("minecraft:sapling1", class_8237.method_37727("{Name:'minecraft:potted_spruce_sapling'}"));
      var0.put("minecraft:sapling2", class_8237.method_37727("{Name:'minecraft:potted_birch_sapling'}"));
      var0.put("minecraft:sapling3", class_8237.method_37727("{Name:'minecraft:potted_jungle_sapling'}"));
      var0.put("minecraft:sapling4", class_8237.method_37727("{Name:'minecraft:potted_acacia_sapling'}"));
      var0.put("minecraft:sapling5", class_8237.method_37727("{Name:'minecraft:potted_dark_oak_sapling'}"));
      var0.put("minecraft:red_mushroom0", class_8237.method_37727("{Name:'minecraft:potted_red_mushroom'}"));
      var0.put("minecraft:brown_mushroom0", class_8237.method_37727("{Name:'minecraft:potted_brown_mushroom'}"));
      var0.put("minecraft:deadbush0", class_8237.method_37727("{Name:'minecraft:potted_dead_bush'}"));
      var0.put("minecraft:tallgrass2", class_8237.method_37727("{Name:'minecraft:potted_fern'}"));
      var0.put("minecraft:cactus0", class_8237.method_37732(2240));
   });
   private static final Map<String, Dynamic<?>> field_29851 = (Map<String, Dynamic<?>>)DataFixUtils.make(Maps.newHashMap(), var0 -> {
      method_26789(var0, 0, "skeleton", "skull");
      method_26789(var0, 1, "wither_skeleton", "skull");
      method_26789(var0, 2, "zombie", "head");
      method_26789(var0, 3, "player", "head");
      method_26789(var0, 4, "creeper", "head");
      method_26789(var0, 5, "dragon", "head");
   });
   private static final Map<String, Dynamic<?>> field_29847 = (Map<String, Dynamic<?>>)DataFixUtils.make(Maps.newHashMap(), var0 -> {
      method_26801(var0, "oak_door", 1024);
      method_26801(var0, "iron_door", 1136);
      method_26801(var0, "spruce_door", 3088);
      method_26801(var0, "birch_door", 3104);
      method_26801(var0, "jungle_door", 3120);
      method_26801(var0, "acacia_door", 3136);
      method_26801(var0, "dark_oak_door", 3152);
   });
   private static final Map<String, Dynamic<?>> field_29854 = (Map<String, Dynamic<?>>)DataFixUtils.make(Maps.newHashMap(), var0 -> {
      for (int var3 = 0; var3 < 26; var3++) {
         var0.put("true" + var3, class_8237.method_37727("{Name:'minecraft:note_block',Properties:{powered:'true',note:'" + var3 + "'}}"));
         var0.put("false" + var3, class_8237.method_37727("{Name:'minecraft:note_block',Properties:{powered:'false',note:'" + var3 + "'}}"));
      }
   });
   private static final Int2ObjectMap<String> field_29848 = (Int2ObjectMap<String>)DataFixUtils.make(new Int2ObjectOpenHashMap(), var0 -> {
      var0.put(0, "white");
      var0.put(1, "orange");
      var0.put(2, "magenta");
      var0.put(3, "light_blue");
      var0.put(4, "yellow");
      var0.put(5, "lime");
      var0.put(6, "pink");
      var0.put(7, "gray");
      var0.put(8, "light_gray");
      var0.put(9, "cyan");
      var0.put(10, "purple");
      var0.put(11, "blue");
      var0.put(12, "brown");
      var0.put(13, "green");
      var0.put(14, "red");
      var0.put(15, "black");
   });
   private static final Map<String, Dynamic<?>> field_29839 = (Map<String, Dynamic<?>>)DataFixUtils.make(Maps.newHashMap(), var0 -> {
      ObjectIterator var3 = field_29848.int2ObjectEntrySet().iterator();

      while (var3.hasNext()) {
         Entry var4 = (Entry)var3.next();
         if (!Objects.equals(var4.getValue(), "red")) {
            method_26803(var0, var4.getIntKey(), (String)var4.getValue());
         }
      }
   });
   private static final Map<String, Dynamic<?>> field_29842 = (Map<String, Dynamic<?>>)DataFixUtils.make(Maps.newHashMap(), var0 -> {
      ObjectIterator var3 = field_29848.int2ObjectEntrySet().iterator();

      while (var3.hasNext()) {
         Entry var4 = (Entry)var3.next();
         if (!Objects.equals(var4.getValue(), "white")) {
            method_26785(var0, 15 - var4.getIntKey(), (String)var4.getValue());
         }
      }
   });
   private static final Dynamic<?> field_29835 = class_8237.method_37732(0);

   public class_5878(Schema var1, boolean var2) {
      super(var1, var2);
   }

   private static void method_26789(Map<String, Dynamic<?>> var0, int var1, String var2, String var3) {
      var0.put(var1 + "north", class_8237.method_37727("{Name:'minecraft:" + var2 + "_wall_" + var3 + "',Properties:{facing:'north'}}"));
      var0.put(var1 + "east", class_8237.method_37727("{Name:'minecraft:" + var2 + "_wall_" + var3 + "',Properties:{facing:'east'}}"));
      var0.put(var1 + "south", class_8237.method_37727("{Name:'minecraft:" + var2 + "_wall_" + var3 + "',Properties:{facing:'south'}}"));
      var0.put(var1 + "west", class_8237.method_37727("{Name:'minecraft:" + var2 + "_wall_" + var3 + "',Properties:{facing:'west'}}"));

      for (int var6 = 0; var6 < 16; var6++) {
         var0.put(var1 + "" + var6, class_8237.method_37727("{Name:'minecraft:" + var2 + "_" + var3 + "',Properties:{rotation:'" + var6 + "'}}"));
      }
   }

   private static void method_26801(Map<String, Dynamic<?>> var0, String var1, int var2) {
      var0.put(
         "minecraft:" + var1 + "eastlowerleftfalsefalse",
         class_8237.method_37727("{Name:'minecraft:" + var1 + "',Properties:{facing:'east',half:'lower',hinge:'left',open:'false',powered:'false'}}")
      );
      var0.put(
         "minecraft:" + var1 + "eastlowerleftfalsetrue",
         class_8237.method_37727("{Name:'minecraft:" + var1 + "',Properties:{facing:'east',half:'lower',hinge:'left',open:'false',powered:'true'}}")
      );
      var0.put(
         "minecraft:" + var1 + "eastlowerlefttruefalse",
         class_8237.method_37727("{Name:'minecraft:" + var1 + "',Properties:{facing:'east',half:'lower',hinge:'left',open:'true',powered:'false'}}")
      );
      var0.put(
         "minecraft:" + var1 + "eastlowerlefttruetrue",
         class_8237.method_37727("{Name:'minecraft:" + var1 + "',Properties:{facing:'east',half:'lower',hinge:'left',open:'true',powered:'true'}}")
      );
      var0.put("minecraft:" + var1 + "eastlowerrightfalsefalse", class_8237.method_37732(var2));
      var0.put(
         "minecraft:" + var1 + "eastlowerrightfalsetrue",
         class_8237.method_37727("{Name:'minecraft:" + var1 + "',Properties:{facing:'east',half:'lower',hinge:'right',open:'false',powered:'true'}}")
      );
      var0.put("minecraft:" + var1 + "eastlowerrighttruefalse", class_8237.method_37732(var2 + 4));
      var0.put(
         "minecraft:" + var1 + "eastlowerrighttruetrue",
         class_8237.method_37727("{Name:'minecraft:" + var1 + "',Properties:{facing:'east',half:'lower',hinge:'right',open:'true',powered:'true'}}")
      );
      var0.put("minecraft:" + var1 + "eastupperleftfalsefalse", class_8237.method_37732(var2 + 8));
      var0.put("minecraft:" + var1 + "eastupperleftfalsetrue", class_8237.method_37732(var2 + 10));
      var0.put(
         "minecraft:" + var1 + "eastupperlefttruefalse",
         class_8237.method_37727("{Name:'minecraft:" + var1 + "',Properties:{facing:'east',half:'upper',hinge:'left',open:'true',powered:'false'}}")
      );
      var0.put(
         "minecraft:" + var1 + "eastupperlefttruetrue",
         class_8237.method_37727("{Name:'minecraft:" + var1 + "',Properties:{facing:'east',half:'upper',hinge:'left',open:'true',powered:'true'}}")
      );
      var0.put("minecraft:" + var1 + "eastupperrightfalsefalse", class_8237.method_37732(var2 + 9));
      var0.put("minecraft:" + var1 + "eastupperrightfalsetrue", class_8237.method_37732(var2 + 11));
      var0.put(
         "minecraft:" + var1 + "eastupperrighttruefalse",
         class_8237.method_37727("{Name:'minecraft:" + var1 + "',Properties:{facing:'east',half:'upper',hinge:'right',open:'true',powered:'false'}}")
      );
      var0.put(
         "minecraft:" + var1 + "eastupperrighttruetrue",
         class_8237.method_37727("{Name:'minecraft:" + var1 + "',Properties:{facing:'east',half:'upper',hinge:'right',open:'true',powered:'true'}}")
      );
      var0.put(
         "minecraft:" + var1 + "northlowerleftfalsefalse",
         class_8237.method_37727("{Name:'minecraft:" + var1 + "',Properties:{facing:'north',half:'lower',hinge:'left',open:'false',powered:'false'}}")
      );
      var0.put(
         "minecraft:" + var1 + "northlowerleftfalsetrue",
         class_8237.method_37727("{Name:'minecraft:" + var1 + "',Properties:{facing:'north',half:'lower',hinge:'left',open:'false',powered:'true'}}")
      );
      var0.put(
         "minecraft:" + var1 + "northlowerlefttruefalse",
         class_8237.method_37727("{Name:'minecraft:" + var1 + "',Properties:{facing:'north',half:'lower',hinge:'left',open:'true',powered:'false'}}")
      );
      var0.put(
         "minecraft:" + var1 + "northlowerlefttruetrue",
         class_8237.method_37727("{Name:'minecraft:" + var1 + "',Properties:{facing:'north',half:'lower',hinge:'left',open:'true',powered:'true'}}")
      );
      var0.put("minecraft:" + var1 + "northlowerrightfalsefalse", class_8237.method_37732(var2 + 3));
      var0.put(
         "minecraft:" + var1 + "northlowerrightfalsetrue",
         class_8237.method_37727("{Name:'minecraft:" + var1 + "',Properties:{facing:'north',half:'lower',hinge:'right',open:'false',powered:'true'}}")
      );
      var0.put("minecraft:" + var1 + "northlowerrighttruefalse", class_8237.method_37732(var2 + 7));
      var0.put(
         "minecraft:" + var1 + "northlowerrighttruetrue",
         class_8237.method_37727("{Name:'minecraft:" + var1 + "',Properties:{facing:'north',half:'lower',hinge:'right',open:'true',powered:'true'}}")
      );
      var0.put(
         "minecraft:" + var1 + "northupperleftfalsefalse",
         class_8237.method_37727("{Name:'minecraft:" + var1 + "',Properties:{facing:'north',half:'upper',hinge:'left',open:'false',powered:'false'}}")
      );
      var0.put(
         "minecraft:" + var1 + "northupperleftfalsetrue",
         class_8237.method_37727("{Name:'minecraft:" + var1 + "',Properties:{facing:'north',half:'upper',hinge:'left',open:'false',powered:'true'}}")
      );
      var0.put(
         "minecraft:" + var1 + "northupperlefttruefalse",
         class_8237.method_37727("{Name:'minecraft:" + var1 + "',Properties:{facing:'north',half:'upper',hinge:'left',open:'true',powered:'false'}}")
      );
      var0.put(
         "minecraft:" + var1 + "northupperlefttruetrue",
         class_8237.method_37727("{Name:'minecraft:" + var1 + "',Properties:{facing:'north',half:'upper',hinge:'left',open:'true',powered:'true'}}")
      );
      var0.put(
         "minecraft:" + var1 + "northupperrightfalsefalse",
         class_8237.method_37727("{Name:'minecraft:" + var1 + "',Properties:{facing:'north',half:'upper',hinge:'right',open:'false',powered:'false'}}")
      );
      var0.put(
         "minecraft:" + var1 + "northupperrightfalsetrue",
         class_8237.method_37727("{Name:'minecraft:" + var1 + "',Properties:{facing:'north',half:'upper',hinge:'right',open:'false',powered:'true'}}")
      );
      var0.put(
         "minecraft:" + var1 + "northupperrighttruefalse",
         class_8237.method_37727("{Name:'minecraft:" + var1 + "',Properties:{facing:'north',half:'upper',hinge:'right',open:'true',powered:'false'}}")
      );
      var0.put(
         "minecraft:" + var1 + "northupperrighttruetrue",
         class_8237.method_37727("{Name:'minecraft:" + var1 + "',Properties:{facing:'north',half:'upper',hinge:'right',open:'true',powered:'true'}}")
      );
      var0.put(
         "minecraft:" + var1 + "southlowerleftfalsefalse",
         class_8237.method_37727("{Name:'minecraft:" + var1 + "',Properties:{facing:'south',half:'lower',hinge:'left',open:'false',powered:'false'}}")
      );
      var0.put(
         "minecraft:" + var1 + "southlowerleftfalsetrue",
         class_8237.method_37727("{Name:'minecraft:" + var1 + "',Properties:{facing:'south',half:'lower',hinge:'left',open:'false',powered:'true'}}")
      );
      var0.put(
         "minecraft:" + var1 + "southlowerlefttruefalse",
         class_8237.method_37727("{Name:'minecraft:" + var1 + "',Properties:{facing:'south',half:'lower',hinge:'left',open:'true',powered:'false'}}")
      );
      var0.put(
         "minecraft:" + var1 + "southlowerlefttruetrue",
         class_8237.method_37727("{Name:'minecraft:" + var1 + "',Properties:{facing:'south',half:'lower',hinge:'left',open:'true',powered:'true'}}")
      );
      var0.put("minecraft:" + var1 + "southlowerrightfalsefalse", class_8237.method_37732(var2 + 1));
      var0.put(
         "minecraft:" + var1 + "southlowerrightfalsetrue",
         class_8237.method_37727("{Name:'minecraft:" + var1 + "',Properties:{facing:'south',half:'lower',hinge:'right',open:'false',powered:'true'}}")
      );
      var0.put("minecraft:" + var1 + "southlowerrighttruefalse", class_8237.method_37732(var2 + 5));
      var0.put(
         "minecraft:" + var1 + "southlowerrighttruetrue",
         class_8237.method_37727("{Name:'minecraft:" + var1 + "',Properties:{facing:'south',half:'lower',hinge:'right',open:'true',powered:'true'}}")
      );
      var0.put(
         "minecraft:" + var1 + "southupperleftfalsefalse",
         class_8237.method_37727("{Name:'minecraft:" + var1 + "',Properties:{facing:'south',half:'upper',hinge:'left',open:'false',powered:'false'}}")
      );
      var0.put(
         "minecraft:" + var1 + "southupperleftfalsetrue",
         class_8237.method_37727("{Name:'minecraft:" + var1 + "',Properties:{facing:'south',half:'upper',hinge:'left',open:'false',powered:'true'}}")
      );
      var0.put(
         "minecraft:" + var1 + "southupperlefttruefalse",
         class_8237.method_37727("{Name:'minecraft:" + var1 + "',Properties:{facing:'south',half:'upper',hinge:'left',open:'true',powered:'false'}}")
      );
      var0.put(
         "minecraft:" + var1 + "southupperlefttruetrue",
         class_8237.method_37727("{Name:'minecraft:" + var1 + "',Properties:{facing:'south',half:'upper',hinge:'left',open:'true',powered:'true'}}")
      );
      var0.put(
         "minecraft:" + var1 + "southupperrightfalsefalse",
         class_8237.method_37727("{Name:'minecraft:" + var1 + "',Properties:{facing:'south',half:'upper',hinge:'right',open:'false',powered:'false'}}")
      );
      var0.put(
         "minecraft:" + var1 + "southupperrightfalsetrue",
         class_8237.method_37727("{Name:'minecraft:" + var1 + "',Properties:{facing:'south',half:'upper',hinge:'right',open:'false',powered:'true'}}")
      );
      var0.put(
         "minecraft:" + var1 + "southupperrighttruefalse",
         class_8237.method_37727("{Name:'minecraft:" + var1 + "',Properties:{facing:'south',half:'upper',hinge:'right',open:'true',powered:'false'}}")
      );
      var0.put(
         "minecraft:" + var1 + "southupperrighttruetrue",
         class_8237.method_37727("{Name:'minecraft:" + var1 + "',Properties:{facing:'south',half:'upper',hinge:'right',open:'true',powered:'true'}}")
      );
      var0.put(
         "minecraft:" + var1 + "westlowerleftfalsefalse",
         class_8237.method_37727("{Name:'minecraft:" + var1 + "',Properties:{facing:'west',half:'lower',hinge:'left',open:'false',powered:'false'}}")
      );
      var0.put(
         "minecraft:" + var1 + "westlowerleftfalsetrue",
         class_8237.method_37727("{Name:'minecraft:" + var1 + "',Properties:{facing:'west',half:'lower',hinge:'left',open:'false',powered:'true'}}")
      );
      var0.put(
         "minecraft:" + var1 + "westlowerlefttruefalse",
         class_8237.method_37727("{Name:'minecraft:" + var1 + "',Properties:{facing:'west',half:'lower',hinge:'left',open:'true',powered:'false'}}")
      );
      var0.put(
         "minecraft:" + var1 + "westlowerlefttruetrue",
         class_8237.method_37727("{Name:'minecraft:" + var1 + "',Properties:{facing:'west',half:'lower',hinge:'left',open:'true',powered:'true'}}")
      );
      var0.put("minecraft:" + var1 + "westlowerrightfalsefalse", class_8237.method_37732(var2 + 2));
      var0.put(
         "minecraft:" + var1 + "westlowerrightfalsetrue",
         class_8237.method_37727("{Name:'minecraft:" + var1 + "',Properties:{facing:'west',half:'lower',hinge:'right',open:'false',powered:'true'}}")
      );
      var0.put("minecraft:" + var1 + "westlowerrighttruefalse", class_8237.method_37732(var2 + 6));
      var0.put(
         "minecraft:" + var1 + "westlowerrighttruetrue",
         class_8237.method_37727("{Name:'minecraft:" + var1 + "',Properties:{facing:'west',half:'lower',hinge:'right',open:'true',powered:'true'}}")
      );
      var0.put(
         "minecraft:" + var1 + "westupperleftfalsefalse",
         class_8237.method_37727("{Name:'minecraft:" + var1 + "',Properties:{facing:'west',half:'upper',hinge:'left',open:'false',powered:'false'}}")
      );
      var0.put(
         "minecraft:" + var1 + "westupperleftfalsetrue",
         class_8237.method_37727("{Name:'minecraft:" + var1 + "',Properties:{facing:'west',half:'upper',hinge:'left',open:'false',powered:'true'}}")
      );
      var0.put(
         "minecraft:" + var1 + "westupperlefttruefalse",
         class_8237.method_37727("{Name:'minecraft:" + var1 + "',Properties:{facing:'west',half:'upper',hinge:'left',open:'true',powered:'false'}}")
      );
      var0.put(
         "minecraft:" + var1 + "westupperlefttruetrue",
         class_8237.method_37727("{Name:'minecraft:" + var1 + "',Properties:{facing:'west',half:'upper',hinge:'left',open:'true',powered:'true'}}")
      );
      var0.put(
         "minecraft:" + var1 + "westupperrightfalsefalse",
         class_8237.method_37727("{Name:'minecraft:" + var1 + "',Properties:{facing:'west',half:'upper',hinge:'right',open:'false',powered:'false'}}")
      );
      var0.put(
         "minecraft:" + var1 + "westupperrightfalsetrue",
         class_8237.method_37727("{Name:'minecraft:" + var1 + "',Properties:{facing:'west',half:'upper',hinge:'right',open:'false',powered:'true'}}")
      );
      var0.put(
         "minecraft:" + var1 + "westupperrighttruefalse",
         class_8237.method_37727("{Name:'minecraft:" + var1 + "',Properties:{facing:'west',half:'upper',hinge:'right',open:'true',powered:'false'}}")
      );
      var0.put(
         "minecraft:" + var1 + "westupperrighttruetrue",
         class_8237.method_37727("{Name:'minecraft:" + var1 + "',Properties:{facing:'west',half:'upper',hinge:'right',open:'true',powered:'true'}}")
      );
   }

   private static void method_26803(Map<String, Dynamic<?>> var0, int var1, String var2) {
      var0.put("southfalsefoot" + var1, class_8237.method_37727("{Name:'minecraft:" + var2 + "_bed',Properties:{facing:'south',occupied:'false',part:'foot'}}"));
      var0.put("westfalsefoot" + var1, class_8237.method_37727("{Name:'minecraft:" + var2 + "_bed',Properties:{facing:'west',occupied:'false',part:'foot'}}"));
      var0.put("northfalsefoot" + var1, class_8237.method_37727("{Name:'minecraft:" + var2 + "_bed',Properties:{facing:'north',occupied:'false',part:'foot'}}"));
      var0.put("eastfalsefoot" + var1, class_8237.method_37727("{Name:'minecraft:" + var2 + "_bed',Properties:{facing:'east',occupied:'false',part:'foot'}}"));
      var0.put("southfalsehead" + var1, class_8237.method_37727("{Name:'minecraft:" + var2 + "_bed',Properties:{facing:'south',occupied:'false',part:'head'}}"));
      var0.put("westfalsehead" + var1, class_8237.method_37727("{Name:'minecraft:" + var2 + "_bed',Properties:{facing:'west',occupied:'false',part:'head'}}"));
      var0.put("northfalsehead" + var1, class_8237.method_37727("{Name:'minecraft:" + var2 + "_bed',Properties:{facing:'north',occupied:'false',part:'head'}}"));
      var0.put("eastfalsehead" + var1, class_8237.method_37727("{Name:'minecraft:" + var2 + "_bed',Properties:{facing:'east',occupied:'false',part:'head'}}"));
      var0.put("southtruehead" + var1, class_8237.method_37727("{Name:'minecraft:" + var2 + "_bed',Properties:{facing:'south',occupied:'true',part:'head'}}"));
      var0.put("westtruehead" + var1, class_8237.method_37727("{Name:'minecraft:" + var2 + "_bed',Properties:{facing:'west',occupied:'true',part:'head'}}"));
      var0.put("northtruehead" + var1, class_8237.method_37727("{Name:'minecraft:" + var2 + "_bed',Properties:{facing:'north',occupied:'true',part:'head'}}"));
      var0.put("easttruehead" + var1, class_8237.method_37727("{Name:'minecraft:" + var2 + "_bed',Properties:{facing:'east',occupied:'true',part:'head'}}"));
   }

   private static void method_26785(Map<String, Dynamic<?>> var0, int var1, String var2) {
      for (int var5 = 0; var5 < 16; var5++) {
         var0.put("" + var5 + "_" + var1, class_8237.method_37727("{Name:'minecraft:" + var2 + "_banner',Properties:{rotation:'" + var5 + "'}}"));
      }

      var0.put("north_" + var1, class_8237.method_37727("{Name:'minecraft:" + var2 + "_wall_banner',Properties:{facing:'north'}}"));
      var0.put("south_" + var1, class_8237.method_37727("{Name:'minecraft:" + var2 + "_wall_banner',Properties:{facing:'south'}}"));
      var0.put("west_" + var1, class_8237.method_37727("{Name:'minecraft:" + var2 + "_wall_banner',Properties:{facing:'west'}}"));
      var0.put("east_" + var1, class_8237.method_37727("{Name:'minecraft:" + var2 + "_wall_banner',Properties:{facing:'east'}}"));
   }

   public static String method_26796(Dynamic<?> var0) {
      return var0.get("Name").asString("");
   }

   public static String method_26806(Dynamic<?> var0, String var1) {
      return var0.get("Properties").get(var1).asString("");
   }

   public static int method_26787(class_6834<Dynamic<?>> var0, Dynamic<?> var1) {
      int var4 = var0.method_14041(var1);
      if (var4 == -1) {
         var4 = var0.method_31341(var1);
      }

      return var4;
   }

   private Dynamic<?> method_26794(Dynamic<?> var1) {
      Optional var4 = var1.get("Level").result();
      return var4.isPresent() && ((Dynamic)var4.get()).get("Sections").asStreamOpt().result().isPresent()
         ? var1.set("Level", new class_5200((Dynamic<?>)var4.get()).method_23867())
         : var1;
   }

   public TypeRewriteRule makeRule() {
      Type var3 = this.getInputSchema().getType(class_4002.field_19449);
      Type var4 = this.getOutputSchema().getType(class_4002.field_19449);
      return this.writeFixAndRead("ChunkPalettedStorageFix", var3, var4, this::method_26794);
   }

   public static int method_26795(boolean var0, boolean var1, boolean var2, boolean var3) {
      short var6 = 0;
      if (!var2) {
         if (!var3) {
            if (!var1) {
               if (var0) {
                  var6 |= 64;
               }
            } else {
               var6 |= 4;
            }
         } else if (!var0) {
            if (!var1) {
               var6 |= 16;
            } else {
               var6 |= 8;
            }
         } else {
            var6 |= 32;
         }
      } else if (!var1) {
         if (!var0) {
            var6 |= 1;
         } else {
            var6 |= 128;
         }
      } else {
         var6 |= 2;
      }

      return var6;
   }

   static {
      field_29843.set(2);
      field_29843.set(3);
      field_29843.set(110);
      field_29843.set(140);
      field_29843.set(144);
      field_29843.set(25);
      field_29843.set(86);
      field_29843.set(26);
      field_29843.set(176);
      field_29843.set(177);
      field_29843.set(175);
      field_29843.set(64);
      field_29843.set(71);
      field_29843.set(193);
      field_29843.set(194);
      field_29843.set(195);
      field_29843.set(196);
      field_29843.set(197);
      field_29845.set(54);
      field_29845.set(146);
      field_29845.set(25);
      field_29845.set(26);
      field_29845.set(51);
      field_29845.set(53);
      field_29845.set(67);
      field_29845.set(108);
      field_29845.set(109);
      field_29845.set(114);
      field_29845.set(128);
      field_29845.set(134);
      field_29845.set(135);
      field_29845.set(136);
      field_29845.set(156);
      field_29845.set(163);
      field_29845.set(164);
      field_29845.set(180);
      field_29845.set(203);
      field_29845.set(55);
      field_29845.set(85);
      field_29845.set(113);
      field_29845.set(188);
      field_29845.set(189);
      field_29845.set(190);
      field_29845.set(191);
      field_29845.set(192);
      field_29845.set(93);
      field_29845.set(94);
      field_29845.set(101);
      field_29845.set(102);
      field_29845.set(160);
      field_29845.set(106);
      field_29845.set(107);
      field_29845.set(183);
      field_29845.set(184);
      field_29845.set(185);
      field_29845.set(186);
      field_29845.set(187);
      field_29845.set(132);
      field_29845.set(139);
      field_29845.set(199);
   }
}
