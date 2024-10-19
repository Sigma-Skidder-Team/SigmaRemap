package mapped;

import com.google.common.collect.Maps;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Map;

import net.minecraft.command.ISuggestionProvider;
import net.minecraft.util.Util;
import net.minecraft.command.CommandSource;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.biome.Biome;

public class Class9222 {
   private static final Map<ResourceLocation, SuggestionProvider<ISuggestionProvider>> field42451 = Maps.newHashMap();
   private static final ResourceLocation field42452 = new ResourceLocation("ask_server");
   public static final SuggestionProvider<ISuggestionProvider> field42453 = method34676(field42452, (var0, var1) -> ((ISuggestionProvider)var0.getSource()).getSuggestionsFromServer(var0, var1));
   public static final SuggestionProvider<CommandSource> field42454 = method34676(
      new ResourceLocation("all_recipes"), (var0, var1) -> ISuggestionProvider.method20143(((ISuggestionProvider)var0.getSource()).getRecipeResourceLocations(), var1)
   );
   public static final SuggestionProvider<CommandSource> field42455 = method34676(
      new ResourceLocation("available_sounds"), (var0, var1) -> ISuggestionProvider.suggestIterable(((ISuggestionProvider)var0.getSource()).getSoundResourceLocations(), var1)
   );
   public static final SuggestionProvider<CommandSource> field42456 = method34676(
      new ResourceLocation("available_biomes"),
      (var0, var1) -> ISuggestionProvider.suggestIterable(((ISuggestionProvider)var0.getSource()).method20136().<Biome>getRegistry(Registry.BIOME_KEY).method9190(), var1)
   );
   public static final SuggestionProvider<CommandSource> field42457 = method34676(
      new ResourceLocation("summonable_entities"),
      (var0, var1) -> ISuggestionProvider.method20144(
            Registry.ENTITY_TYPE.stream().filter(EntityType::method33206),
            var1,
            EntityType::method33198,
            var0x -> new TranslationTextComponent(Util.makeTranslationKey("entity", EntityType.method33198(var0x)))
         )
   );

   public static <S extends ISuggestionProvider> SuggestionProvider<S> method34676(ResourceLocation var0, SuggestionProvider<ISuggestionProvider> var1) {
      if (!field42451.containsKey(var0)) {
         field42451.put(var0, var1);
         return (SuggestionProvider<S>) new Class9419(var0, var1);
      } else {
         throw new IllegalArgumentException("A command suggestion provider is already registered with the name " + var0);
      }
   }

   public static SuggestionProvider<ISuggestionProvider> method34677(ResourceLocation var0) {
      return field42451.getOrDefault(var0, field42453);
   }

   public static ResourceLocation method34678(SuggestionProvider<ISuggestionProvider> var0) {
      return !(var0 instanceof Class9419) ? field42452 : Class9419.method36140((Class9419)var0);
   }

   public static SuggestionProvider<ISuggestionProvider> method34679(SuggestionProvider<ISuggestionProvider> var0) {
      return !(var0 instanceof Class9419) ? field42453 : var0;
   }
}
