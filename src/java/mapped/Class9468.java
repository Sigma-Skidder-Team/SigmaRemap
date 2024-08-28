package mapped;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;
import net.minecraft.util.text.TranslationTextComponent;

public class Class9468 implements ArgumentType<Class7144> {
   private static final Collection<String> field44000 = Arrays.<String>asList("spooky", "effect");
   public static final DynamicCommandExceptionType field44001 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("effect.effectNotFound", var0)
   );

   public static Class9468 method36510() {
      return new Class9468();
   }

   public static Class7144 method36511(CommandContext<Class6619> var0, String var1) throws CommandSyntaxException {
      return (Class7144)var0.getArgument(var1, Class7144.class);
   }

   public Class7144 parse(StringReader var1) throws CommandSyntaxException {
      ResourceLocation var4 = ResourceLocation.method8294(var1);
      return Registry.field16071.method9187(var4).orElseThrow(() -> field44001.create(var4));
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return Class6618.method20141(Registry.field16071.method9190(), var2);
   }

   public Collection<String> getExamples() {
      return field44000;
   }
}
