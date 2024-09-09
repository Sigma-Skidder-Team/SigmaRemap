package mapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.google.common.collect.Maps;
import com.google.gson.*;
import net.minecraft.client.util.Util;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Class282 extends Class281 {
   private static final Gson field1074 = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private static final Logger field1075 = LogManager.getLogger();
   private Map<Class7207<?>, Map<ResourceLocation, IRecipe<?>>> field1076 = ImmutableMap.of();
   private boolean field1077;

   public Class282() {
      super(field1074, "recipes");
   }

   public void method971(Map<ResourceLocation, JsonElement> var1, IResourceManager var2, IProfiler var3) {
      this.field1077 = false;
      Map<Class7207<?>, Builder<ResourceLocation, IRecipe<?>>> var6 = Maps.newHashMap();

      for (Entry<ResourceLocation, JsonElement> var8 : var1.entrySet()) {
         ResourceLocation var9 = var8.getKey();

         try {
            IRecipe<?> var10 = method1038(var9, JSONUtils.method32781((JsonElement)var8.getValue(), "top element"));
            var6.computeIfAbsent(var10.method14967(), var0 -> ImmutableMap.builder()).put(var9, var10);
         } catch (JsonParseException | IllegalArgumentException var11) {
            field1075.error("Parsing error loading recipe {}", var9, var11);
         }
      }

      this.field1076 = var6.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, var0 -> ((Builder)var0.getValue()).build()));
      field1075.info("Loaded {} recipes", var6.size());
   }

   public <C extends IInventory, T extends IRecipe<C>> Optional<T> method1030(Class7207<T> var1, C var2, World var3) {
      return this.method1033(var1)
         .values()
         .stream()
         .<T>flatMap(var3x -> Util.method38511(var1.method22635((IRecipe<IInventory>)var3x, var3, var2)))
         .findFirst();
   }

   public <C extends IInventory, T extends IRecipe<C>> List<T> method1031(Class7207<T> var1) {
      return (List<T>) this.method1033(var1).values().stream().map(var0 -> (T) var0).collect(Collectors.toList());
   }

   public <C extends IInventory, T extends IRecipe<C>> List<T> method1032(Class7207<T> var1, C var2, World var3) {
      return this.method1033(var1)
         .values()
         .stream()
         .flatMap(var3x -> Util.method38511(var1.method22635(var3x, var3, var2)))
         .sorted(Comparator.comparing(var0 -> var0.getRecipeOutput().getTranslationKey()))
         .collect(Collectors.<T>toList());
   }

   private <C extends IInventory, T extends IRecipe<C>> Map<ResourceLocation, IRecipe<C>> method1033(Class7207<T> var1) {
      return (Map)this.field1076.getOrDefault(var1, Collections.emptyMap());
   }

   public <C extends IInventory, T extends IRecipe<C>> NonNullList<ItemStack> method1034(Class7207<T> var1, C var2, World var3) {
      Optional<T> var6 = this.method1030(var1, var2, var3);
      if (var6.isPresent()) {
         return ((IRecipe)var6.get()).method14968(var2);
      } else {
         NonNullList var7 = NonNullList.<ItemStack>method68(var2.getSizeInventory(), ItemStack.EMPTY);

         for (int var8 = 0; var8 < var7.size(); var8++) {
            var7.set(var8, var2.getStackInSlot(var8));
         }

         return var7;
      }
   }

   public Optional<? extends IRecipe<?>> method1035(ResourceLocation var1) {
      return this.field1076.values().stream().<IRecipe<?>>map(var1x -> var1x.get(var1)).filter(Objects::nonNull).findFirst();
   }

   public Collection<IRecipe<?>> method1036() {
      return this.field1076.values().stream().<IRecipe<?>>flatMap(var0 -> var0.values().stream()).collect(Collectors.<IRecipe<?>>toSet());
   }

   public Stream<ResourceLocation> method1037() {
      return this.field1076.values().stream().<ResourceLocation>flatMap(var0 -> var0.keySet().stream());
   }

   public static IRecipe<?> method1038(ResourceLocation var0, JsonObject var1) {
      String var4 = JSONUtils.method32763(var1, "type");
      return Registry.field16086
         .method9187(new ResourceLocation(var4))
         .orElseThrow(() -> new JsonSyntaxException("Invalid or unsupported recipe type '" + var4 + "'"))
         .method19700(var0, var1);
   }

   public void method1039(Iterable<IRecipe<?>> var1) {
      this.field1077 = false;
      Map<Class7207<?>, Map<ResourceLocation, IRecipe<?>>> var4 = Maps.newHashMap();
      var1.forEach(var1x -> {
         Map<ResourceLocation, IRecipe<?>> var4x = var4.computeIfAbsent(var1x.method14967(), var0x -> Maps.newHashMap());
         IRecipe<?> var5 = var4x.put(var1x.getId(), var1x);
         if (var5 != null) {
            throw new IllegalStateException("Duplicate recipe ignored with ID " + var1x.getId());
         }
      });
      this.field1076 = ImmutableMap.copyOf(var4);
   }
}
