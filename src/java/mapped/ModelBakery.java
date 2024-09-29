package mapped;

import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.util.Util;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.Property;
import net.minecraft.state.StateContainer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.tuple.Triple;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ModelBakery {
   public static final Class7826 field40508 = new Class7826(AtlasTexture.LOCATION_BLOCKS_TEXTURE, new ResourceLocation("block/fire_0"));
   public static final Class7826 LOCATION_FIRE_1 = new Class7826(AtlasTexture.LOCATION_BLOCKS_TEXTURE, new ResourceLocation("block/fire_1"));
   public static final Class7826 field40510 = new Class7826(AtlasTexture.LOCATION_BLOCKS_TEXTURE, new ResourceLocation("block/lava_flow"));
   public static final Class7826 field40511 = new Class7826(AtlasTexture.LOCATION_BLOCKS_TEXTURE, new ResourceLocation("block/water_flow"));
   public static final Class7826 field40512 = new Class7826(AtlasTexture.LOCATION_BLOCKS_TEXTURE, new ResourceLocation("block/water_overlay"));
   public static final Class7826 field40513 = new Class7826(AtlasTexture.LOCATION_BLOCKS_TEXTURE, new ResourceLocation("entity/banner_base"));
   public static final Class7826 field40514 = new Class7826(AtlasTexture.LOCATION_BLOCKS_TEXTURE, new ResourceLocation("entity/shield_base"));
   public static final Class7826 field40515 = new Class7826(AtlasTexture.LOCATION_BLOCKS_TEXTURE, new ResourceLocation("entity/shield_base_nopattern"));
   public static final List<ResourceLocation> field40516 = IntStream.range(0, 10)
      .<ResourceLocation>mapToObj(var0 -> new ResourceLocation("block/destroy_stage_" + var0))
      .collect(Collectors.<ResourceLocation>toList());
   public static final List<ResourceLocation> field40517 = field40516.stream()
      .<ResourceLocation>map(var0 -> new ResourceLocation("textures/" + var0.getPath() + ".png"))
      .collect(Collectors.<ResourceLocation>toList());
   public static final List<RenderType> field40518 = field40517.stream().<RenderType>map(RenderType::method14338).collect(Collectors.<RenderType>toList());
   private static final Set<Class7826> field40519 = Util.<Set<Class7826>>make(Sets.newHashSet(), var0 -> {
      var0.add(field40511);
      var0.add(field40510);
      var0.add(field40512);
      var0.add(field40508);
      var0.add(LOCATION_FIRE_1);
      var0.add(Class5944.field25932);
      var0.add(Class5956.field25968);
      var0.add(Class5956.field25969);
      var0.add(Class5956.field25970);
      var0.add(Class5956.field25971);
      var0.add(Class5956.field25972);
      var0.add(Class5956.field25973);
      var0.add(Class5951.field25950);
      var0.add(field40513);
      var0.add(field40514);
      var0.add(field40515);

      for (ResourceLocation var4 : field40516) {
         var0.add(new Class7826(AtlasTexture.LOCATION_BLOCKS_TEXTURE, var4));
      }

      var0.add(new Class7826(AtlasTexture.LOCATION_BLOCKS_TEXTURE, PlayerContainer.field25540));
      var0.add(new Class7826(AtlasTexture.LOCATION_BLOCKS_TEXTURE, PlayerContainer.field25541));
      var0.add(new Class7826(AtlasTexture.LOCATION_BLOCKS_TEXTURE, PlayerContainer.field25542));
      var0.add(new Class7826(AtlasTexture.LOCATION_BLOCKS_TEXTURE, PlayerContainer.field25543));
      var0.add(new Class7826(AtlasTexture.LOCATION_BLOCKS_TEXTURE, PlayerContainer.field25544));
      Class8624.method30910(var0::add);
   });
   private static final Logger field40520 = LogManager.getLogger();
   public static final Class1997 field40521 = new Class1997("builtin/missing", "missing");
   private static final String field40522 = field40521.toString();
   public static final String field40523 = ("{    'textures': {       'particle': '"
         + Class1714.method7513().getPath()
         + "',       'missingno': '"
         + Class1714.method7513().getPath()
         + "'    },    'elements': [         {  'from': [ 0, 0, 0 ],            'to': [ 16, 16, 16 ],            'faces': {                'down':  { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'down',  'texture': '#missingno' },                'up':    { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'up',    'texture': '#missingno' },                'north': { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'north', 'texture': '#missingno' },                'south': { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'south', 'texture': '#missingno' },                'west':  { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'west',  'texture': '#missingno' },                'east':  { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'east',  'texture': '#missingno' }            }        }    ]}")
      .replace('\'', '"');
   private static final Map<String, String> field40524 = Maps.newHashMap(ImmutableMap.of("missing", field40523));
   private static final Splitter field40525 = Splitter.on(',');
   private static final Splitter field40526 = Splitter.on('=').limit(2);
   public static final Class7496 field40527 = Util.<Class7496>make(
      Class7496.method24427("{\"gui_light\": \"front\"}"), var0 -> var0.field32207 = "generation marker"
   );
   public static final Class7496 field40528 = Util.<Class7496>make(
      Class7496.method24427("{\"gui_light\": \"side\"}"), var0 -> var0.field32207 = "block entity marker"
   );
   private static final StateContainer<Block, BlockState> field40529 = new StateContainer.Builder<Block, BlockState>(Blocks.AIR)
      .add(BooleanProperty.create("map"))
      .method24739(Block::getDefaultState, BlockState::new);
   private static final Class8451 field40530 = new Class8451();
   private static final Map<ResourceLocation, StateContainer<Block, BlockState>> field40531 = ImmutableMap.of(new ResourceLocation("item_frame"), field40529);
   private final IResourceManager field40532;
   private Class1694 field40533;
   private final BlockColors field40534;
   private final Set<ResourceLocation> field40535 = Sets.newHashSet();
   private final Class9786 field40536 = new Class9786();
   private final Map<ResourceLocation, Class7495> field40537 = Maps.newHashMap();
   private final Map<Triple<ResourceLocation, Class6979, Boolean>, IBakedModel> field40538 = Maps.newHashMap();
   private final Map<ResourceLocation, Class7495> field40539 = Maps.newHashMap();
   private final Map<ResourceLocation, IBakedModel> field40540 = Maps.newHashMap();
   private Map<ResourceLocation, Pair<AtlasTexture, Class8226>> field40541;
   private int field40542 = 1;
   private final Object2IntMap<BlockState> field40543 = Util.<Object2IntMap<BlockState>>make(
      new Object2IntOpenHashMap(), var0 -> var0.defaultReturnValue(-1)
   );
   public Map<ResourceLocation, Class7495> field40544;

   public ModelBakery(IResourceManager var1, BlockColors var2, IProfiler var3, int var4) {
      this(var1, var2, true);
      this.method32837(var3, var4);
   }

   public ModelBakery(IResourceManager var1, BlockColors var2, boolean var3) {
      this.field40532 = var1;
      this.field40534 = var2;
   }

   public void method32837(IProfiler var1, int var2) {
      Reflector.field42974.method20229();
      var1.startSection("missing_model");

      try {
         this.field40537.put(field40521, this.method32849(field40521));
         this.method32845(field40521);
      } catch (IOException var12) {
         field40520.error("Error loading missing model, should never happen :(", var12);
         throw new RuntimeException(var12);
      }

      var1.endStartSection("static_definitions");
      field40531.forEach((var1x, var2x) -> var2x.getValidStates().forEach(var2xx -> this.method32845(BlockModelShapes.method38157(var1x, var2xx))));
      var1.endStartSection("blocks");

      for (Block var6 : Registry.BLOCK) {
         var6.getStateContainer().getValidStates().forEach(var1x -> this.method32845(BlockModelShapes.method38156(var1x)));
      }

      var1.endStartSection("items");

      for (ResourceLocation var16 : Registry.ITEM.method9190()) {
         this.method32845(new Class1997(var16, "inventory"));
      }

      var1.endStartSection("special");
      this.method32845(new Class1997("minecraft:trident_in_hand#inventory"));

      for (ResourceLocation var17 : this.method32856()) {
         this.method32844(var17);
      }

      var1.endStartSection("textures");
      this.field40544 = this.field40537;
      Class8684.method31270(this);
      Set<Pair<String, String>> var15 = Sets.newLinkedHashSet();
      Set<Class7826> var18 = this.field40539
         .values()
         .stream()
         .<Class7826>flatMap(var2x -> var2x.method24424(this::method32841, var15).stream())
         .collect(Collectors.toSet());
      var18.addAll(field40519);
      Reflector.method35062(Reflector.field42872, var18);
      var15.stream()
         .filter(var0 -> !var0.getSecond().equals(field40522))
         .forEach(var0 -> field40520.warn("Unable to resolve texture reference: {} in {}", var0.getFirst(), var0.getSecond()));
      Map<ResourceLocation, List<Class7826>> var7 = var18.stream().collect(Collectors.groupingBy(Class7826::method26196));
      var1.endStartSection("stitching");
      this.field40541 = Maps.newHashMap();

      for (Entry<ResourceLocation, List<Class7826>> var9 : var7.entrySet()) {
         AtlasTexture var10 = new AtlasTexture(var9.getKey());
         Class8226 var11 = var10.method1092(this.field40532, var9.getValue().stream().map(Class7826::method26197), var1, var2);
         this.field40541.put(var9.getKey(), Pair.of(var10, var11));
      }

      var1.endSection();
   }

   public Class1694 method32838(TextureManager var1, IProfiler var2) {
      var2.startSection("atlas");

      for (Pair var6 : this.field40541.values()) {
         AtlasTexture var7 = (AtlasTexture)var6.getFirst();
         Class8226 var8 = (Class8226)var6.getSecond();
         var7.method1091(var8);
         var1.loadTexture(var7.getTextureLocation(), var7);
         var1.bindTexture(var7.getTextureLocation());
         var7.method1101(var8);
      }

      this.field40533 = new Class1694(this.field40541.values().stream().<AtlasTexture>map(Pair::getFirst).collect(Collectors.<AtlasTexture>toList()));
      var2.endStartSection("baking");
      this.field40539.keySet().forEach(var1x -> {
         IBakedModel var4 = null;

         try {
            var4 = this.method32847(var1x, Class1901.field11159);
         } catch (Exception var6x) {
            field40520.warn("Unable to bake model: '{}': {}", var1x, var6x);
         }

         if (var4 != null) {
            this.field40540.put(var1x, var4);
         }
      });
      var2.endSection();
      return this.field40533;
   }

   private static Predicate<BlockState> method32839(StateContainer<Block, BlockState> var0, String var1) {
      Map<Property<?>, Comparable<?>> var4 = Maps.newHashMap();

      for (String var6 : field40525.split(var1)) {
         Iterator<String> var7 = field40526.split(var6).iterator();
         if (var7.hasNext()) {
            String var8 = var7.next();
            Property<?> var9 = var0.method35396(var8);
            if (var9 != null && var7.hasNext()) {
               String var10 = var7.next();
               Comparable var11 = method32840(var9, var10);
               if (var11 == null) {
                  throw new RuntimeException("Unknown value: '" + var10 + "' for blockstate property: '" + var8 + "' " + var9.method30474());
               }

               var4.put(var9, var11);
            } else if (!var8.isEmpty()) {
               throw new RuntimeException("Unknown blockstate property: '" + var8 + "'");
            }
         }
      }

      Block var12 = (Block)var0.method35394();
      return var2 -> {
         if (var2 != null && var12 == var2.getBlock()) {
            for (Entry var6x : var4.entrySet()) {
               if (!Objects.equals(var2.get((Property)var6x.getKey()), var6x.getValue())) {
                  return false;
               }
            }

            return true;
         } else {
            return false;
         }
      };
   }

   @Nullable
   public static <T extends Comparable<T>> T method32840(Property<T> var0, String var1) {
      return (T)var0.method30476(var1).orElse(null);
   }

   public Class7495 method32841(ResourceLocation var1) {
      if (this.field40537.containsKey(var1)) {
         return this.field40537.get(var1);
      } else if (this.field40535.contains(var1)) {
         throw new IllegalStateException("Circular reference while loading " + var1);
      } else {
         this.field40535.add(var1);
         Class7495 var4 = this.field40537.get(field40521);

         while (!this.field40535.isEmpty()) {
            ResourceLocation var5 = this.field40535.iterator().next();

            try {
               if (!this.field40537.containsKey(var5)) {
                  this.method32842(var5);
               }
            } catch (Class2494 var11) {
               field40520.warn(var11.getMessage());
               this.field40537.put(var5, var4);
            } catch (Exception var12) {
               field40520.warn("Unable to load model: '{}' referenced from: {}: {}", var5, var1);
               field40520.warn(var12.getClass().getName() + ": " + var12.getMessage());
               this.field40537.put(var5, var4);
            } finally {
               this.field40535.remove(var5);
            }
         }

         return this.field40537.getOrDefault(var1, var4);
      }
   }

   private void method32842(ResourceLocation var1) throws Exception {
      if (!(var1 instanceof Class1997)) {
         this.method32843(var1, this.method32849(var1));
      } else {
         Class1997 var4 = (Class1997)var1;
         if (!Objects.equals(var4.method8303(), "inventory")) {
            ResourceLocation var31 = new ResourceLocation(var1.getNamespace(), var1.getPath());
            StateContainer<Block, BlockState> var32 = Optional.ofNullable(field40531.get(var31))
               .orElseGet(() -> Registry.BLOCK.getOrDefault(var31).getStateContainer());
            this.field40536.method38573(var32);
            ImmutableList<Property<?>> var33 = ImmutableList.copyOf(this.field40534.method29469((Block)var32.method35394()));
            ImmutableList<BlockState> var8 = var32.getValidStates();
            Map<Class1997, BlockState> var9 = Maps.newHashMap();
            var8.forEach(var2 -> {
               BlockState var5x = var9.put(BlockModelShapes.method38157(var31, var2), var2);
            });
            HashMap var10 = Maps.newHashMap();
            ResourceLocation var11 = new ResourceLocation(var1.getNamespace(), "blockstates/" + var1.getPath() + ".json");
            Class7495 var12 = this.field40537.get(field40521);
            Class9390 var13 = new Class9390(ImmutableList.of(var12), ImmutableList.of());
            Pair<Class7495, Supplier<Class9390>> var14 = Pair.of(var12, (Supplier<Class9390>)() -> var13);

            try {
               List<Pair<String, Class9032>> var15;
               try {
                  var15 = this.field40532
                     .method582(var11)
                     .stream()
                     .map(
                        var1x -> {
                           try (InputStream var4x = var1x.getFile()) {
                              return Pair.of(var1x.method7765(), Class9032.method33448(this.field40536, new InputStreamReader(var4x, StandardCharsets.UTF_8)));
                           } catch (Exception var18x) {
                              throw new Class2494(
                                 String.format(
                                    "Exception loading blockstate definition: '%s' in resourcepack: '%s': %s",
                                    var1x.method7762(),
                                    var1x.method7765(),
                                    var18x.getMessage()
                                 )
                              );
                           }
                        }
                     ).collect(Collectors.toList());
               } catch (IOException var27) {
                  field40520.warn("Exception loading blockstate definition: {}: {}", var11, var27);
                  return;
               }

               for (Pair<String, Class9032> var17 : var15) {
                  Class9032 var18 = var17.getSecond();
                  Map<BlockState, Pair<Class7495, Supplier<Class9390>>> var19 = Maps.newIdentityHashMap();
                  Class7498 var20;
                  if (var18.method33450()) {
                     var20 = var18.method33451();
                     var8.forEach(var3 -> {
                        Pair var6x = var19.put(var3, Pair.of(var20, () -> Class9390.method35649(var3, var20, var33)));
                     });
                  } else {
                     var20 = null;
                  }

                  var18.method33449()
                     .forEach(
                        (var9x, var10x) -> {
                           try {
                              var8.stream()
                                 .filter(method32839(var32, var9x))
                                 .forEach(
                                    var6xx -> {
                                       Pair var9xx = var19.put(var6xx, Pair.of(var10x, (Supplier<Class9390>)() -> Class9390.method35650(var6xx, var10x, var33)));
                                       if (var9xx != null && var9xx.getFirst() != var20) {
                                          var19.put(var6xx, var14);
                                          throw new RuntimeException(
                                             "Overlapping definition with: "
                                                + var18.method33449()
                                                   .entrySet()
                                                   .stream()
                                                   .filter(var1xxx -> var1xxx.getValue() == var9xx.getFirst())
                                                   .findFirst()
                                                   .get()
                                                   .getKey()
                                          );
                                       }
                                    }
                                 );
                           } catch (Exception var14x) {
                              field40520.warn(
                                 "Exception loading blockstate definition: '{}' in resourcepack: '{}' for variant: '{}': {}",
                                 var11,
                                 var17.getFirst(),
                                 var9x,
                                 var14x.getMessage()
                              );
                           }
                        }
                     );
                  var10.putAll(var19);
               }

               return;
            } catch (Class2494 var28) {
               throw var28;
            } catch (Exception var29) {
               throw new Class2494(String.format("Exception loading blockstate definition: '%s': %s", var11, var29));
            } finally {
               Map<Class9390, Set<BlockState>> var22 = Maps.newHashMap();
               var9.forEach((var5x, var6x) -> {
                  Pair var9x = (Pair)var10.get(var6x);
                  if (var9x == null) {
                     field40520.warn("Exception loading blockstate definition: '{}' missing model for variant: '{}'", var11, var5x);
                     var9x = var14;
                  }

                  this.method32843(var5x, (Class7495)var9x.getFirst());

                  try {
                     Class9390 var10x = (Class9390)((Supplier)var9x.getSecond()).get();
                     var22.computeIfAbsent(var10x, var0 -> Sets.newIdentityHashSet()).add(var6x);
                  } catch (Exception var11x) {
                     field40520.warn("Exception evaluating model definition: '{}'", var5x, var11x);
                  }
               });
               var22.forEach((var1x, var2) -> {
                  Iterator var5x = ((Set)var2).iterator();

                  while (var5x.hasNext()) {
                     BlockState var6x = (BlockState)var5x.next();
                     if (var6x.getRenderType() != BlockRenderType.MODEL) {
                        var5x.remove();
                        this.field40543.put(var6x, 0);
                     }
                  }

                  if (((Set)var2).size() > 1) {
                     this.method32846((Set)var2);
                  }
               });
            }
         }

         ResourceLocation var5 = new ResourceLocation(var1.getNamespace(), "item/" + var1.getPath());
         String var6 = var1.getPath();
         if (var6.startsWith("optifine/") || var6.startsWith("item/")) {
            var5 = var1;
         }

         Class7496 var7 = this.method32849(var5);
         this.method32843(var4, var7);
         this.field40537.put(var5, var7);
      }
   }

   private void method32843(ResourceLocation var1, Class7495 var2) {
      this.field40537.put(var1, var2);
      this.field40535.addAll(var2.method24423());
   }

   private void method32844(ResourceLocation var1) {
      Class7495 var4 = this.method32841(var1);
      this.field40537.put(var1, var4);
      this.field40539.put(var1, var4);
   }

   public void method32845(Class1997 var1) {
      Class7495 var4 = this.method32841(var1);
      this.field40537.put(var1, var4);
      this.field40539.put(var1, var4);
   }

   private void method32846(Iterable<BlockState> var1) {
      int var4 = this.field40542++;
      var1.forEach(var2 -> this.field40543.put(var2, var4));
   }

   @Nullable
   public IBakedModel method32847(ResourceLocation var1, Class1902 var2) {
      return this.method32848(var1, var2, this.field40533::method7289);
   }

   public IBakedModel method32848(ResourceLocation var1, Class1902 var2, Function<Class7826, TextureAtlasSprite> var3) {
      Triple var6 = Triple.of(var1, var2.method8166(), var2.method8170());
      if (!this.field40538.containsKey(var6)) {
         if (this.field40533 != null) {
            Class7495 var7 = this.method32841(var1);
            if (var7 instanceof Class7496) {
               Class7496 var8 = (Class7496)var7;
               if (var8.method24439() == field40527) {
                  if (!Reflector.field42864.method20245()) {
                     return field40530.method29717(this.field40533::method7289, var8).method24433(this, var8, this.field40533::method7289, var2, var1, false);
                  }

                  return field40530.method29717(var3, var8).method24433(this, var8, var3, var2, var1, false);
               }
            }

            IBakedModel var9 = var7.method24425(this, this.field40533::method7289, var2, var1);
            if (Reflector.field42864.method20245()) {
               var9 = var7.method24425(this, var3, var2, var1);
            }

            this.field40538.put(var6, var9);
            return var9;
         } else {
            throw new IllegalStateException("bake called too early");
         }
      } else {
         return this.field40538.get(var6);
      }
   }

   private Class7496 method32849(ResourceLocation var1) throws IOException {
      Object var4 = null;
      JSonShader var5 = null;

      Class7496 var10;
      try {
         String var6 = var1.getPath();
         ResourceLocation var7 = var1;
         if ("builtin/generated".equals(var6)) {
            return field40527;
         }

         if ("builtin/entity".equals(var6)) {
            return field40528;
         }

         if (var6.startsWith("builtin/")) {
            String var8 = var6.substring("builtin/".length());
            String var9 = field40524.get(var8);
            if (var9 == null) {
               throw new FileNotFoundException(var1.toString());
            }

            var4 = new StringReader(var9);
         } else {
            var7 = this.method32852(var1);
            var5 = this.field40532.getShader(var7);
            var4 = new InputStreamReader(var5.getFile(), StandardCharsets.UTF_8);
         }

         Class7496 var15 = Class7496.method24426((Reader)var4);
         var15.field32207 = var1.toString();
         String var17 = Class8684.method31275(var7.getPath());
         method32853(var15, var17);
         var10 = var15;
      } finally {
         IOUtils.closeQuietly((Reader)var4);
         IOUtils.closeQuietly(var5);
      }

      return var10;
   }

   public Map<ResourceLocation, IBakedModel> method32850() {
      return this.field40540;
   }

   public Object2IntMap<BlockState> method32851() {
      return this.field40543;
   }

   private ResourceLocation method32852(ResourceLocation var1) {
      String var4 = var1.getPath();
      if (!var4.startsWith("optifine/")) {
         return new ResourceLocation(var1.getNamespace(), "models/" + var1.getPath() + ".json");
      } else {
         if (!var4.endsWith(".json")) {
            var1 = new ResourceLocation(var1.getNamespace(), var4 + ".json");
         }

         return var1;
      }
   }

   public static void method32853(Class7496 var0, String var1) {
      ResourceLocation var4 = method32854(var0.field32210, var1);
      if (var4 != var0.field32210) {
         var0.field32210 = var4;
      }

      if (var0.field32208 != null) {
         for (Entry var6 : var0.field32208.entrySet()) {
            Either var7 = (Either)var6.getValue();
            Optional var8 = var7.left();
            if (var8.isPresent()) {
               Class7826 var9 = (Class7826)var8.get();
               ResourceLocation var10 = var9.method26197();
               String var11 = var10.getPath();
               String var12 = method32855(var11, var1);
               if (!var12.equals(var11)) {
                  ResourceLocation var13 = new ResourceLocation(var10.getNamespace(), var12);
                  Class7826 var14 = new Class7826(var9.method26196(), var13);
                  Either var15 = Either.left(var14);
                  var6.setValue(var15);
               }
            }
         }
      }
   }

   public static ResourceLocation method32854(ResourceLocation var0, String var1) {
      if (var0 != null && var1 != null) {
         if (var0.getNamespace().equals("minecraft")) {
            String var4 = var0.getPath();
            String var5 = method32855(var4, var1);
            if (var5 != var4) {
               var0 = new ResourceLocation(var0.getNamespace(), var5);
            }

            return var0;
         } else {
            return var0;
         }
      } else {
         return var0;
      }
   }

   private static String method32855(String var0, String var1) {
      var0 = Class8684.method31274(var0, var1);
      var0 = Class9402.method35763(var0, ".json");
      return Class9402.method35763(var0, ".png");
   }

   public Set<ResourceLocation> method32856() {
      return Collections.<ResourceLocation>emptySet();
   }

   public Class1694 method32857() {
      return this.field40533;
   }
}
