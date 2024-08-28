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

public class Class8050 implements ArgumentType<Class7436> {
   private static final Collection<String> field34574 = Arrays.<String>asList("foo", "foo:bar", "particle with options");
   public static final DynamicCommandExceptionType field34575 = new DynamicCommandExceptionType(var0 -> new TranslationTextComponent("particle.notFound", var0));

   public static Class8050 method27648() {
      return new Class8050();
   }

   public static Class7436 method27649(CommandContext<Class6619> var0, String var1) {
      return (Class7436)var0.getArgument(var1, Class7436.class);
   }

   public Class7436 parse(StringReader var1) throws CommandSyntaxException {
      return method27650(var1);
   }

   public Collection<String> getExamples() {
      return field34574;
   }

   public static Class7436 method27650(StringReader var0) throws CommandSyntaxException {
      ResourceLocation var3 = ResourceLocation.method8294(var0);
      Class7434 var4 = Class2348.field16077.method9187(var3).orElseThrow(() -> field34575.create(var3));
      return method27651(var0, var4);
   }

   private static <T extends Class7436> T method27651(StringReader var0, Class7434<T> var1) throws CommandSyntaxException {
      return (T)var1.method24007().method20913(var1, var0);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return Class6618.method20141(Class2348.field16077.method9190(), var2);
   }
}
