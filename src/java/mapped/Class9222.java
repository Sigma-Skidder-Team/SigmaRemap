package mapped;

import com.google.common.collect.Maps;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Map;

import net.minecraft.client.util.Util;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.text.TranslationTextComponent;

public class Class9222 {
   private static final Map<ResourceLocation, SuggestionProvider<Class6618>> field42451 = Maps.newHashMap();
   private static final ResourceLocation field42452 = new ResourceLocation("ask_server");
   public static final SuggestionProvider<Class6618> field42453 = method34676(field42452, (var0, var1) -> ((Class6618)var0.getSource()).method20130(var0, var1));
   public static final SuggestionProvider<Class6619> field42454 = method34676(
      new ResourceLocation("all_recipes"), (var0, var1) -> Class6618.method20143(((Class6618)var0.getSource()).method20128(), var1)
   );
   public static final SuggestionProvider<Class6619> field42455 = method34676(
      new ResourceLocation("available_sounds"), (var0, var1) -> Class6618.method20141(((Class6618)var0.getSource()).method20127(), var1)
   );
   public static final SuggestionProvider<Class6619> field42456 = method34676(
      new ResourceLocation("available_biomes"),
      (var0, var1) -> Class6618.method20141(((Class6618)var0.getSource()).method20136().<Biome>getRegistry(Registry.BIOME_KEY).method9190(), var1)
   );
   public static final SuggestionProvider<Class6619> field42457 = method34676(
      new ResourceLocation("summonable_entities"),
      (var0, var1) -> Class6618.method20144(
            Registry.ENTITY_TYPE.method9192().filter(EntityType::method33206),
            var1,
            EntityType::method33198,
            var0x -> new TranslationTextComponent(Util.method38486("entity", EntityType.method33198(var0x)))
         )
   );

   public static <S extends Class6618> SuggestionProvider<S> method34676(ResourceLocation var0, SuggestionProvider<Class6618> var1) {
      if (!field42451.containsKey(var0)) {
         field42451.put(var0, var1);
         return (SuggestionProvider<S>) new Class9419(var0, var1);
      } else {
         throw new IllegalArgumentException("A command suggestion provider is already registered with the name " + var0);
      }
   }

   public static SuggestionProvider<Class6618> method34677(ResourceLocation var0) {
      return field42451.getOrDefault(var0, field42453);
   }

   public static ResourceLocation method34678(SuggestionProvider<Class6618> var0) {
      return !(var0 instanceof Class9419) ? field42452 : Class9419.method36140((Class9419)var0);
   }

   public static SuggestionProvider<Class6618> method34679(SuggestionProvider<Class6618> var0) {
      return !(var0 instanceof Class9419) ? field42453 : var0;
   }
}
