package mapped;

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

public class Class8782 extends DataFix {
   private static final Logger field39491 = LogManager.getLogger();
   private static final BitSet field39492 = new BitSet(256);
   private static final BitSet field39493 = new BitSet(256);
   private static final Dynamic<?> field39494 = Class9398.method35691("{Name:'minecraft:pumpkin'}");
   private static final Dynamic<?> field39495 = Class9398.method35691("{Name:'minecraft:podzol',Properties:{snowy:'true'}}");
   private static final Dynamic<?> field39496 = Class9398.method35691("{Name:'minecraft:grass_block',Properties:{snowy:'true'}}");
   private static final Dynamic<?> field39497 = Class9398.method35691("{Name:'minecraft:mycelium',Properties:{snowy:'true'}}");
   private static final Dynamic<?> field39498 = Class9398.method35691("{Name:'minecraft:sunflower',Properties:{half:'upper'}}");
   private static final Dynamic<?> field39499 = Class9398.method35691("{Name:'minecraft:lilac',Properties:{half:'upper'}}");
   private static final Dynamic<?> field39500 = Class9398.method35691("{Name:'minecraft:tall_grass',Properties:{half:'upper'}}");
   private static final Dynamic<?> field39501 = Class9398.method35691("{Name:'minecraft:large_fern',Properties:{half:'upper'}}");
   private static final Dynamic<?> field39502 = Class9398.method35691("{Name:'minecraft:rose_bush',Properties:{half:'upper'}}");
   private static final Dynamic<?> field39503 = Class9398.method35691("{Name:'minecraft:peony',Properties:{half:'upper'}}");
   private static final Map<String, Dynamic<?>> field39504 = DataFixUtils.make(Maps.newHashMap(), var0 -> {
      var0.put("minecraft:air0", Class9398.method35691("{Name:'minecraft:flower_pot'}"));
      var0.put("minecraft:red_flower0", Class9398.method35691("{Name:'minecraft:potted_poppy'}"));
      var0.put("minecraft:red_flower1", Class9398.method35691("{Name:'minecraft:potted_blue_orchid'}"));
      var0.put("minecraft:red_flower2", Class9398.method35691("{Name:'minecraft:potted_allium'}"));
      var0.put("minecraft:red_flower3", Class9398.method35691("{Name:'minecraft:potted_azure_bluet'}"));
      var0.put("minecraft:red_flower4", Class9398.method35691("{Name:'minecraft:potted_red_tulip'}"));
      var0.put("minecraft:red_flower5", Class9398.method35691("{Name:'minecraft:potted_orange_tulip'}"));
      var0.put("minecraft:red_flower6", Class9398.method35691("{Name:'minecraft:potted_white_tulip'}"));
      var0.put("minecraft:red_flower7", Class9398.method35691("{Name:'minecraft:potted_pink_tulip'}"));
      var0.put("minecraft:red_flower8", Class9398.method35691("{Name:'minecraft:potted_oxeye_daisy'}"));
      var0.put("minecraft:yellow_flower0", Class9398.method35691("{Name:'minecraft:potted_dandelion'}"));
      var0.put("minecraft:sapling0", Class9398.method35691("{Name:'minecraft:potted_oak_sapling'}"));
      var0.put("minecraft:sapling1", Class9398.method35691("{Name:'minecraft:potted_spruce_sapling'}"));
      var0.put("minecraft:sapling2", Class9398.method35691("{Name:'minecraft:potted_birch_sapling'}"));
      var0.put("minecraft:sapling3", Class9398.method35691("{Name:'minecraft:potted_jungle_sapling'}"));
      var0.put("minecraft:sapling4", Class9398.method35691("{Name:'minecraft:potted_acacia_sapling'}"));
      var0.put("minecraft:sapling5", Class9398.method35691("{Name:'minecraft:potted_dark_oak_sapling'}"));
      var0.put("minecraft:red_mushroom0", Class9398.method35691("{Name:'minecraft:potted_red_mushroom'}"));
      var0.put("minecraft:brown_mushroom0", Class9398.method35691("{Name:'minecraft:potted_brown_mushroom'}"));
      var0.put("minecraft:deadbush0", Class9398.method35691("{Name:'minecraft:potted_dead_bush'}"));
      var0.put("minecraft:tallgrass2", Class9398.method35691("{Name:'minecraft:potted_fern'}"));
      var0.put("minecraft:cactus0", Class9398.method35692(2240));
   });
   private static final Map<String, Dynamic<?>> field39505 = DataFixUtils.make(Maps.newHashMap(), var0 -> {
      method31664(var0, 0, "skeleton", "skull");
      method31664(var0, 1, "wither_skeleton", "skull");
      method31664(var0, 2, "zombie", "head");
      method31664(var0, 3, "player", "head");
      method31664(var0, 4, "creeper", "head");
      method31664(var0, 5, "dragon", "head");
   });
   private static final Map<String, Dynamic<?>> field39506 = DataFixUtils.make(Maps.newHashMap(), var0 -> {
      method31665(var0, "oak_door", 1024);
      method31665(var0, "iron_door", 1136);
      method31665(var0, "spruce_door", 3088);
      method31665(var0, "birch_door", 3104);
      method31665(var0, "jungle_door", 3120);
      method31665(var0, "acacia_door", 3136);
      method31665(var0, "dark_oak_door", 3152);
   });
   private static final Map<String, Dynamic<?>> field39507 = DataFixUtils.make(Maps.newHashMap(), var0 -> {
      for (int var3 = 0; var3 < 26; var3++) {
         var0.put("true" + var3, Class9398.method35691("{Name:'minecraft:note_block',Properties:{powered:'true',note:'" + var3 + "'}}"));
         var0.put("false" + var3, Class9398.method35691("{Name:'minecraft:note_block',Properties:{powered:'false',note:'" + var3 + "'}}"));
      }
   });
   private static final Int2ObjectMap<String> field39508 = (Int2ObjectMap<String>)DataFixUtils.make(new Int2ObjectOpenHashMap(), var0 -> {
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
   private static final Map<String, Dynamic<?>> field39509 = DataFixUtils.make(Maps.newHashMap(), var0 -> {
      ObjectIterator var3 = field39508.int2ObjectEntrySet().iterator();

      while (var3.hasNext()) {
         Entry var4 = (Entry)var3.next();
         if (!Objects.equals(var4.getValue(), "red")) {
            method31666(var0, var4.getIntKey(), (String)var4.getValue());
         }
      }
   });
   private static final Map<String, Dynamic<?>> field39510 = DataFixUtils.make(Maps.newHashMap(), var0 -> {
      ObjectIterator var3 = field39508.int2ObjectEntrySet().iterator();

      while (var3.hasNext()) {
         Entry var4 = (Entry)var3.next();
         if (!Objects.equals(var4.getValue(), "white")) {
            method31667(var0, 15 - var4.getIntKey(), (String)var4.getValue());
         }
      }
   });
   private static final Dynamic<?> field39511 = Class9398.method35692(0);

   public Class8782(Schema var1, boolean var2) {
      super(var1, var2);
   }

   private static void method31664(Map<String, Dynamic<?>> var0, int var1, String var2, String var3) {
      var0.put(var1 + "north", Class9398.method35691("{Name:'minecraft:" + var2 + "_wall_" + var3 + "',Properties:{facing:'north'}}"));
      var0.put(var1 + "east", Class9398.method35691("{Name:'minecraft:" + var2 + "_wall_" + var3 + "',Properties:{facing:'east'}}"));
      var0.put(var1 + "south", Class9398.method35691("{Name:'minecraft:" + var2 + "_wall_" + var3 + "',Properties:{facing:'south'}}"));
      var0.put(var1 + "west", Class9398.method35691("{Name:'minecraft:" + var2 + "_wall_" + var3 + "',Properties:{facing:'west'}}"));

      for (int var6 = 0; var6 < 16; var6++) {
         var0.put(var1 + "" + var6, Class9398.method35691("{Name:'minecraft:" + var2 + "_" + var3 + "',Properties:{rotation:'" + var6 + "'}}"));
      }
   }

   private static void method31665(Map<String, Dynamic<?>> var0, String var1, int var2) {
      var0.put(
         "minecraft:" + var1 + "eastlowerleftfalsefalse",
         Class9398.method35691("{Name:'minecraft:" + var1 + "',Properties:{facing:'east',half:'lower',hinge:'left',open:'false',powered:'false'}}")
      );
      var0.put(
         "minecraft:" + var1 + "eastlowerleftfalsetrue",
         Class9398.method35691("{Name:'minecraft:" + var1 + "',Properties:{facing:'east',half:'lower',hinge:'left',open:'false',powered:'true'}}")
      );
      var0.put(
         "minecraft:" + var1 + "eastlowerlefttruefalse",
         Class9398.method35691("{Name:'minecraft:" + var1 + "',Properties:{facing:'east',half:'lower',hinge:'left',open:'true',powered:'false'}}")
      );
      var0.put(
         "minecraft:" + var1 + "eastlowerlefttruetrue",
         Class9398.method35691("{Name:'minecraft:" + var1 + "',Properties:{facing:'east',half:'lower',hinge:'left',open:'true',powered:'true'}}")
      );
      var0.put("minecraft:" + var1 + "eastlowerrightfalsefalse", Class9398.method35692(var2));
      var0.put(
         "minecraft:" + var1 + "eastlowerrightfalsetrue",
         Class9398.method35691("{Name:'minecraft:" + var1 + "',Properties:{facing:'east',half:'lower',hinge:'right',open:'false',powered:'true'}}")
      );
      var0.put("minecraft:" + var1 + "eastlowerrighttruefalse", Class9398.method35692(var2 + 4));
      var0.put(
         "minecraft:" + var1 + "eastlowerrighttruetrue",
         Class9398.method35691("{Name:'minecraft:" + var1 + "',Properties:{facing:'east',half:'lower',hinge:'right',open:'true',powered:'true'}}")
      );
      var0.put("minecraft:" + var1 + "eastupperleftfalsefalse", Class9398.method35692(var2 + 8));
      var0.put("minecraft:" + var1 + "eastupperleftfalsetrue", Class9398.method35692(var2 + 10));
      var0.put(
         "minecraft:" + var1 + "eastupperlefttruefalse",
         Class9398.method35691("{Name:'minecraft:" + var1 + "',Properties:{facing:'east',half:'upper',hinge:'left',open:'true',powered:'false'}}")
      );
      var0.put(
         "minecraft:" + var1 + "eastupperlefttruetrue",
         Class9398.method35691("{Name:'minecraft:" + var1 + "',Properties:{facing:'east',half:'upper',hinge:'left',open:'true',powered:'true'}}")
      );
      var0.put("minecraft:" + var1 + "eastupperrightfalsefalse", Class9398.method35692(var2 + 9));
      var0.put("minecraft:" + var1 + "eastupperrightfalsetrue", Class9398.method35692(var2 + 11));
      var0.put(
         "minecraft:" + var1 + "eastupperrighttruefalse",
         Class9398.method35691("{Name:'minecraft:" + var1 + "',Properties:{facing:'east',half:'upper',hinge:'right',open:'true',powered:'false'}}")
      );
      var0.put(
         "minecraft:" + var1 + "eastupperrighttruetrue",
         Class9398.method35691("{Name:'minecraft:" + var1 + "',Properties:{facing:'east',half:'upper',hinge:'right',open:'true',powered:'true'}}")
      );
      var0.put(
         "minecraft:" + var1 + "northlowerleftfalsefalse",
         Class9398.method35691("{Name:'minecraft:" + var1 + "',Properties:{facing:'north',half:'lower',hinge:'left',open:'false',powered:'false'}}")
      );
      var0.put(
         "minecraft:" + var1 + "northlowerleftfalsetrue",
         Class9398.method35691("{Name:'minecraft:" + var1 + "',Properties:{facing:'north',half:'lower',hinge:'left',open:'false',powered:'true'}}")
      );
      var0.put(
         "minecraft:" + var1 + "northlowerlefttruefalse",
         Class9398.method35691("{Name:'minecraft:" + var1 + "',Properties:{facing:'north',half:'lower',hinge:'left',open:'true',powered:'false'}}")
      );
      var0.put(
         "minecraft:" + var1 + "northlowerlefttruetrue",
         Class9398.method35691("{Name:'minecraft:" + var1 + "',Properties:{facing:'north',half:'lower',hinge:'left',open:'true',powered:'true'}}")
      );
      var0.put("minecraft:" + var1 + "northlowerrightfalsefalse", Class9398.method35692(var2 + 3));
      var0.put(
         "minecraft:" + var1 + "northlowerrightfalsetrue",
         Class9398.method35691("{Name:'minecraft:" + var1 + "',Properties:{facing:'north',half:'lower',hinge:'right',open:'false',powered:'true'}}")
      );
      var0.put("minecraft:" + var1 + "northlowerrighttruefalse", Class9398.method35692(var2 + 7));
      var0.put(
         "minecraft:" + var1 + "northlowerrighttruetrue",
         Class9398.method35691("{Name:'minecraft:" + var1 + "',Properties:{facing:'north',half:'lower',hinge:'right',open:'true',powered:'true'}}")
      );
      var0.put(
         "minecraft:" + var1 + "northupperleftfalsefalse",
         Class9398.method35691("{Name:'minecraft:" + var1 + "',Properties:{facing:'north',half:'upper',hinge:'left',open:'false',powered:'false'}}")
      );
      var0.put(
         "minecraft:" + var1 + "northupperleftfalsetrue",
         Class9398.method35691("{Name:'minecraft:" + var1 + "',Properties:{facing:'north',half:'upper',hinge:'left',open:'false',powered:'true'}}")
      );
      var0.put(
         "minecraft:" + var1 + "northupperlefttruefalse",
         Class9398.method35691("{Name:'minecraft:" + var1 + "',Properties:{facing:'north',half:'upper',hinge:'left',open:'true',powered:'false'}}")
      );
      var0.put(
         "minecraft:" + var1 + "northupperlefttruetrue",
         Class9398.method35691("{Name:'minecraft:" + var1 + "',Properties:{facing:'north',half:'upper',hinge:'left',open:'true',powered:'true'}}")
      );
      var0.put(
         "minecraft:" + var1 + "northupperrightfalsefalse",
         Class9398.method35691("{Name:'minecraft:" + var1 + "',Properties:{facing:'north',half:'upper',hinge:'right',open:'false',powered:'false'}}")
      );
      var0.put(
         "minecraft:" + var1 + "northupperrightfalsetrue",
         Class9398.method35691("{Name:'minecraft:" + var1 + "',Properties:{facing:'north',half:'upper',hinge:'right',open:'false',powered:'true'}}")
      );
      var0.put(
         "minecraft:" + var1 + "northupperrighttruefalse",
         Class9398.method35691("{Name:'minecraft:" + var1 + "',Properties:{facing:'north',half:'upper',hinge:'right',open:'true',powered:'false'}}")
      );
      var0.put(
         "minecraft:" + var1 + "northupperrighttruetrue",
         Class9398.method35691("{Name:'minecraft:" + var1 + "',Properties:{facing:'north',half:'upper',hinge:'right',open:'true',powered:'true'}}")
      );
      var0.put(
         "minecraft:" + var1 + "southlowerleftfalsefalse",
         Class9398.method35691("{Name:'minecraft:" + var1 + "',Properties:{facing:'south',half:'lower',hinge:'left',open:'false',powered:'false'}}")
      );
      var0.put(
         "minecraft:" + var1 + "southlowerleftfalsetrue",
         Class9398.method35691("{Name:'minecraft:" + var1 + "',Properties:{facing:'south',half:'lower',hinge:'left',open:'false',powered:'true'}}")
      );
      var0.put(
         "minecraft:" + var1 + "southlowerlefttruefalse",
         Class9398.method35691("{Name:'minecraft:" + var1 + "',Properties:{facing:'south',half:'lower',hinge:'left',open:'true',powered:'false'}}")
      );
      var0.put(
         "minecraft:" + var1 + "southlowerlefttruetrue",
         Class9398.method35691("{Name:'minecraft:" + var1 + "',Properties:{facing:'south',half:'lower',hinge:'left',open:'true',powered:'true'}}")
      );
      var0.put("minecraft:" + var1 + "southlowerrightfalsefalse", Class9398.method35692(var2 + 1));
      var0.put(
         "minecraft:" + var1 + "southlowerrightfalsetrue",
         Class9398.method35691("{Name:'minecraft:" + var1 + "',Properties:{facing:'south',half:'lower',hinge:'right',open:'false',powered:'true'}}")
      );
      var0.put("minecraft:" + var1 + "southlowerrighttruefalse", Class9398.method35692(var2 + 5));
      var0.put(
         "minecraft:" + var1 + "southlowerrighttruetrue",
         Class9398.method35691("{Name:'minecraft:" + var1 + "',Properties:{facing:'south',half:'lower',hinge:'right',open:'true',powered:'true'}}")
      );
      var0.put(
         "minecraft:" + var1 + "southupperleftfalsefalse",
         Class9398.method35691("{Name:'minecraft:" + var1 + "',Properties:{facing:'south',half:'upper',hinge:'left',open:'false',powered:'false'}}")
      );
      var0.put(
         "minecraft:" + var1 + "southupperleftfalsetrue",
         Class9398.method35691("{Name:'minecraft:" + var1 + "',Properties:{facing:'south',half:'upper',hinge:'left',open:'false',powered:'true'}}")
      );
      var0.put(
         "minecraft:" + var1 + "southupperlefttruefalse",
         Class9398.method35691("{Name:'minecraft:" + var1 + "',Properties:{facing:'south',half:'upper',hinge:'left',open:'true',powered:'false'}}")
      );
      var0.put(
         "minecraft:" + var1 + "southupperlefttruetrue",
         Class9398.method35691("{Name:'minecraft:" + var1 + "',Properties:{facing:'south',half:'upper',hinge:'left',open:'true',powered:'true'}}")
      );
      var0.put(
         "minecraft:" + var1 + "southupperrightfalsefalse",
         Class9398.method35691("{Name:'minecraft:" + var1 + "',Properties:{facing:'south',half:'upper',hinge:'right',open:'false',powered:'false'}}")
      );
      var0.put(
         "minecraft:" + var1 + "southupperrightfalsetrue",
         Class9398.method35691("{Name:'minecraft:" + var1 + "',Properties:{facing:'south',half:'upper',hinge:'right',open:'false',powered:'true'}}")
      );
      var0.put(
         "minecraft:" + var1 + "southupperrighttruefalse",
         Class9398.method35691("{Name:'minecraft:" + var1 + "',Properties:{facing:'south',half:'upper',hinge:'right',open:'true',powered:'false'}}")
      );
      var0.put(
         "minecraft:" + var1 + "southupperrighttruetrue",
         Class9398.method35691("{Name:'minecraft:" + var1 + "',Properties:{facing:'south',half:'upper',hinge:'right',open:'true',powered:'true'}}")
      );
      var0.put(
         "minecraft:" + var1 + "westlowerleftfalsefalse",
         Class9398.method35691("{Name:'minecraft:" + var1 + "',Properties:{facing:'west',half:'lower',hinge:'left',open:'false',powered:'false'}}")
      );
      var0.put(
         "minecraft:" + var1 + "westlowerleftfalsetrue",
         Class9398.method35691("{Name:'minecraft:" + var1 + "',Properties:{facing:'west',half:'lower',hinge:'left',open:'false',powered:'true'}}")
      );
      var0.put(
         "minecraft:" + var1 + "westlowerlefttruefalse",
         Class9398.method35691("{Name:'minecraft:" + var1 + "',Properties:{facing:'west',half:'lower',hinge:'left',open:'true',powered:'false'}}")
      );
      var0.put(
         "minecraft:" + var1 + "westlowerlefttruetrue",
         Class9398.method35691("{Name:'minecraft:" + var1 + "',Properties:{facing:'west',half:'lower',hinge:'left',open:'true',powered:'true'}}")
      );
      var0.put("minecraft:" + var1 + "westlowerrightfalsefalse", Class9398.method35692(var2 + 2));
      var0.put(
         "minecraft:" + var1 + "westlowerrightfalsetrue",
         Class9398.method35691("{Name:'minecraft:" + var1 + "',Properties:{facing:'west',half:'lower',hinge:'right',open:'false',powered:'true'}}")
      );
      var0.put("minecraft:" + var1 + "westlowerrighttruefalse", Class9398.method35692(var2 + 6));
      var0.put(
         "minecraft:" + var1 + "westlowerrighttruetrue",
         Class9398.method35691("{Name:'minecraft:" + var1 + "',Properties:{facing:'west',half:'lower',hinge:'right',open:'true',powered:'true'}}")
      );
      var0.put(
         "minecraft:" + var1 + "westupperleftfalsefalse",
         Class9398.method35691("{Name:'minecraft:" + var1 + "',Properties:{facing:'west',half:'upper',hinge:'left',open:'false',powered:'false'}}")
      );
      var0.put(
         "minecraft:" + var1 + "westupperleftfalsetrue",
         Class9398.method35691("{Name:'minecraft:" + var1 + "',Properties:{facing:'west',half:'upper',hinge:'left',open:'false',powered:'true'}}")
      );
      var0.put(
         "minecraft:" + var1 + "westupperlefttruefalse",
         Class9398.method35691("{Name:'minecraft:" + var1 + "',Properties:{facing:'west',half:'upper',hinge:'left',open:'true',powered:'false'}}")
      );
      var0.put(
         "minecraft:" + var1 + "westupperlefttruetrue",
         Class9398.method35691("{Name:'minecraft:" + var1 + "',Properties:{facing:'west',half:'upper',hinge:'left',open:'true',powered:'true'}}")
      );
      var0.put(
         "minecraft:" + var1 + "westupperrightfalsefalse",
         Class9398.method35691("{Name:'minecraft:" + var1 + "',Properties:{facing:'west',half:'upper',hinge:'right',open:'false',powered:'false'}}")
      );
      var0.put(
         "minecraft:" + var1 + "westupperrightfalsetrue",
         Class9398.method35691("{Name:'minecraft:" + var1 + "',Properties:{facing:'west',half:'upper',hinge:'right',open:'false',powered:'true'}}")
      );
      var0.put(
         "minecraft:" + var1 + "westupperrighttruefalse",
         Class9398.method35691("{Name:'minecraft:" + var1 + "',Properties:{facing:'west',half:'upper',hinge:'right',open:'true',powered:'false'}}")
      );
      var0.put(
         "minecraft:" + var1 + "westupperrighttruetrue",
         Class9398.method35691("{Name:'minecraft:" + var1 + "',Properties:{facing:'west',half:'upper',hinge:'right',open:'true',powered:'true'}}")
      );
   }

   private static void method31666(Map<String, Dynamic<?>> var0, int var1, String var2) {
      var0.put("southfalsefoot" + var1, Class9398.method35691("{Name:'minecraft:" + var2 + "_bed',Properties:{facing:'south',occupied:'false',part:'foot'}}"));
      var0.put("westfalsefoot" + var1, Class9398.method35691("{Name:'minecraft:" + var2 + "_bed',Properties:{facing:'west',occupied:'false',part:'foot'}}"));
      var0.put("northfalsefoot" + var1, Class9398.method35691("{Name:'minecraft:" + var2 + "_bed',Properties:{facing:'north',occupied:'false',part:'foot'}}"));
      var0.put("eastfalsefoot" + var1, Class9398.method35691("{Name:'minecraft:" + var2 + "_bed',Properties:{facing:'east',occupied:'false',part:'foot'}}"));
      var0.put("southfalsehead" + var1, Class9398.method35691("{Name:'minecraft:" + var2 + "_bed',Properties:{facing:'south',occupied:'false',part:'head'}}"));
      var0.put("westfalsehead" + var1, Class9398.method35691("{Name:'minecraft:" + var2 + "_bed',Properties:{facing:'west',occupied:'false',part:'head'}}"));
      var0.put("northfalsehead" + var1, Class9398.method35691("{Name:'minecraft:" + var2 + "_bed',Properties:{facing:'north',occupied:'false',part:'head'}}"));
      var0.put("eastfalsehead" + var1, Class9398.method35691("{Name:'minecraft:" + var2 + "_bed',Properties:{facing:'east',occupied:'false',part:'head'}}"));
      var0.put("southtruehead" + var1, Class9398.method35691("{Name:'minecraft:" + var2 + "_bed',Properties:{facing:'south',occupied:'true',part:'head'}}"));
      var0.put("westtruehead" + var1, Class9398.method35691("{Name:'minecraft:" + var2 + "_bed',Properties:{facing:'west',occupied:'true',part:'head'}}"));
      var0.put("northtruehead" + var1, Class9398.method35691("{Name:'minecraft:" + var2 + "_bed',Properties:{facing:'north',occupied:'true',part:'head'}}"));
      var0.put("easttruehead" + var1, Class9398.method35691("{Name:'minecraft:" + var2 + "_bed',Properties:{facing:'east',occupied:'true',part:'head'}}"));
   }

   private static void method31667(Map<String, Dynamic<?>> var0, int var1, String var2) {
      for (int var5 = 0; var5 < 16; var5++) {
         var0.put("" + var5 + "_" + var1, Class9398.method35691("{Name:'minecraft:" + var2 + "_banner',Properties:{rotation:'" + var5 + "'}}"));
      }

      var0.put("north_" + var1, Class9398.method35691("{Name:'minecraft:" + var2 + "_wall_banner',Properties:{facing:'north'}}"));
      var0.put("south_" + var1, Class9398.method35691("{Name:'minecraft:" + var2 + "_wall_banner',Properties:{facing:'south'}}"));
      var0.put("west_" + var1, Class9398.method35691("{Name:'minecraft:" + var2 + "_wall_banner',Properties:{facing:'west'}}"));
      var0.put("east_" + var1, Class9398.method35691("{Name:'minecraft:" + var2 + "_wall_banner',Properties:{facing:'east'}}"));
   }

   public static String method31668(Dynamic<?> var0) {
      return var0.get("Name").asString("");
   }

   public static String method31669(Dynamic<?> var0, String var1) {
      return var0.get("Properties").get(var1).asString("");
   }

   public static int method31670(Class2353<Dynamic<?>> var0, Dynamic<?> var1) {
      int var4 = var0.getId(var1);
      if (var4 == -1) {
         var4 = var0.method9272(var1);
      }

      return var4;
   }

   private Dynamic<?> method31671(Dynamic<?> var1) {
      Optional var4 = var1.get("Level").result();
      return var4.isPresent() && ((Dynamic)var4.get()).get("Sections").asStreamOpt().result().isPresent()
         ? var1.set("Level", new Class8610((Dynamic<?>)var4.get()).method30854())
         : var1;
   }

   public TypeRewriteRule makeRule() {
      Type var3 = this.getInputSchema().getType(Class8239.field35378);
      Type var4 = this.getOutputSchema().getType(Class8239.field35378);
      return this.writeFixAndRead("ChunkPalettedStorageFix", var3, var4, this::method31671);
   }

   public static int method31672(boolean var0, boolean var1, boolean var2, boolean var3) {
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

   // $VF: synthetic method
   public static Dynamic method31680() {
      return field39511;
   }

   // $VF: synthetic method
   public static BitSet method31681() {
      return field39493;
   }

   // $VF: synthetic method
   public static BitSet method31682() {
      return field39492;
   }

   // $VF: synthetic method
   public static Dynamic method31683() {
      return field39496;
   }

   // $VF: synthetic method
   public static Dynamic method31684() {
      return field39495;
   }

   // $VF: synthetic method
   public static Map method31685() {
      return field39507;
   }

   // $VF: synthetic method
   public static Map method31686() {
      return field39509;
   }

   // $VF: synthetic method
   public static Map method31687() {
      return field39506;
   }

   // $VF: synthetic method
   public static Dynamic method31688() {
      return field39494;
   }

   // $VF: synthetic method
   public static Dynamic method31689() {
      return field39497;
   }

   // $VF: synthetic method
   public static Map method31690() {
      return field39504;
   }

   // $VF: synthetic method
   public static Map method31691() {
      return field39505;
   }

   // $VF: synthetic method
   public static Dynamic method31692() {
      return field39498;
   }

   // $VF: synthetic method
   public static Dynamic method31693() {
      return field39499;
   }

   // $VF: synthetic method
   public static Dynamic method31694() {
      return field39500;
   }

   // $VF: synthetic method
   public static Dynamic method31695() {
      return field39501;
   }

   // $VF: synthetic method
   public static Dynamic method31696() {
      return field39502;
   }

   // $VF: synthetic method
   public static Dynamic method31697() {
      return field39503;
   }

   // $VF: synthetic method
   public static Map method31698() {
      return field39510;
   }

   // $VF: synthetic method
   public static Logger method31699() {
      return field39491;
   }

   static {
      field39493.set(2);
      field39493.set(3);
      field39493.set(110);
      field39493.set(140);
      field39493.set(144);
      field39493.set(25);
      field39493.set(86);
      field39493.set(26);
      field39493.set(176);
      field39493.set(177);
      field39493.set(175);
      field39493.set(64);
      field39493.set(71);
      field39493.set(193);
      field39493.set(194);
      field39493.set(195);
      field39493.set(196);
      field39493.set(197);
      field39492.set(54);
      field39492.set(146);
      field39492.set(25);
      field39492.set(26);
      field39492.set(51);
      field39492.set(53);
      field39492.set(67);
      field39492.set(108);
      field39492.set(109);
      field39492.set(114);
      field39492.set(128);
      field39492.set(134);
      field39492.set(135);
      field39492.set(136);
      field39492.set(156);
      field39492.set(163);
      field39492.set(164);
      field39492.set(180);
      field39492.set(203);
      field39492.set(55);
      field39492.set(85);
      field39492.set(113);
      field39492.set(188);
      field39492.set(189);
      field39492.set(190);
      field39492.set(191);
      field39492.set(192);
      field39492.set(93);
      field39492.set(94);
      field39492.set(101);
      field39492.set(102);
      field39492.set(160);
      field39492.set(106);
      field39492.set(107);
      field39492.set(183);
      field39492.set(184);
      field39492.set(185);
      field39492.set(186);
      field39492.set(187);
      field39492.set(132);
      field39492.set(139);
      field39492.set(199);
   }
}
