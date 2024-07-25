package remapped;

import com.google.common.collect.Maps;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Map;
import net.minecraft.util.text.TranslationTextComponent;

public class class_7510 {
   private static final Map<Identifier, SuggestionProvider<class_8773>> field_38357 = Maps.newHashMap();
   private static final Identifier field_38358 = new Identifier("ask_server");
   public static final SuggestionProvider<class_8773> field_38353 = method_34235(
      field_38358, (var0, var1) -> ((class_8773)var0.getSource()).method_40316(var0, var1)
   );
   public static final SuggestionProvider<class_9155> field_38355 = method_34235(
      new Identifier("all_recipes"), (var0, var1) -> class_8773.method_40310(((class_8773)var0.getSource()).method_40326(), var1)
   );
   public static final SuggestionProvider<class_9155> field_38351 = method_34235(
      new Identifier("available_sounds"), (var0, var1) -> class_8773.method_40324(((class_8773)var0.getSource()).method_40309(), var1)
   );
   public static final SuggestionProvider<class_9155> field_38352 = method_34235(
      new Identifier("available_biomes"),
      (var0, var1) -> class_8773.method_40324(
            ((class_8773)var0.getSource()).method_40327().<class_6325>method_28813(class_8669.field_44359).method_39805(), var1
         )
   );
   public static final SuggestionProvider<class_9155> field_38354 = method_34235(
      new Identifier("summonable_entities"),
      (var0, var1) -> class_8773.method_40318(
            class_8669.field_44400.method_39801().filter(EntityType::method_30465),
            var1,
            EntityType::method_30472,
            var0x -> new TranslationTextComponent(Util.createTranslationKey("entity", EntityType.method_30472(var0x)))
         )
   );

   public static <S extends class_8773> SuggestionProvider<S> method_34235(Identifier var0, SuggestionProvider<class_8773> var1) {
      if (!field_38357.containsKey(var0)) {
         field_38357.put(var0, var1);
         return new class_8300(var0, var1);
      } else {
         throw new IllegalArgumentException("A command suggestion provider is already registered with the name " + var0);
      }
   }

   public static SuggestionProvider<class_8773> method_34237(Identifier var0) {
      return field_38357.getOrDefault(var0, field_38353);
   }

   public static Identifier method_34234(SuggestionProvider<class_8773> var0) {
      return !(var0 instanceof class_8300) ? field_38358 : class_8300.method_38287((class_8300)var0);
   }

   public static SuggestionProvider<class_8773> method_34238(SuggestionProvider<class_8773> var0) {
      return !(var0 instanceof class_8300) ? field_38353 : var0;
   }
}
