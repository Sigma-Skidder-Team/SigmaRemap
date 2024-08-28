package mapped;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import net.minecraft.util.text.TranslationTextComponent;

public class Class9082 implements ArgumentType<ResourceLocation> {
   private static final Collection<String> field41582 = Stream.<Class8705>of(World.field8999, World.field9000)
      .<String>map(var0 -> var0.method31399().toString())
      .collect(Collectors.<String>toList());
   private static final DynamicCommandExceptionType field41583 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("argument.dimension.invalid", var0)
   );

   public ResourceLocation parse(StringReader var1) throws CommandSyntaxException {
      return ResourceLocation.method8294(var1);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return !(var1.getSource() instanceof Class6618)
         ? Suggestions.empty()
         : Class6618.method20143(((Class6618)var1.getSource()).method20135().stream().<ResourceLocation>map(Class8705::method31399), var2);
   }

   public Collection<String> getExamples() {
      return field41582;
   }

   public static Class9082 method33872() {
      return new Class9082();
   }

   public static ServerWorld method33873(CommandContext<Class6619> var0, String var1) throws CommandSyntaxException {
      ResourceLocation var4 = (ResourceLocation)var0.getArgument(var1, ResourceLocation.class);
      Class8705 var5 = Class8705.<World>method31395(Class2348.field16067, var4);
      ServerWorld var6 = ((Class6619)var0.getSource()).method20177().method1318(var5);
      if (var6 != null) {
         return var6;
      } else {
         throw field41583.create(var4);
      }
   }
}
