package mapped;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

import net.minecraft.command.CommandSource;
import net.minecraft.util.text.StringTextComponent;

public class Class9418 implements ArgumentType<Class4871> {
   private static final Collection<String> field43679 = Arrays.<String>asList("techtests.piston", "techtests");

   public Class4871 parse(StringReader var1) throws CommandSyntaxException {
      String var4 = var1.readUnquotedString();
      Optional var5 = Class7936.method26708(var4);
      if (!var5.isPresent()) {
         StringTextComponent var6 = new StringTextComponent("No such test: " + var4);
         throw new CommandSyntaxException(new SimpleCommandExceptionType(var6), var6);
      } else {
         return (Class4871)var5.get();
      }
   }

   public static Class9418 method36138() {
      return new Class9418();
   }

   public static Class4871 method36139(CommandContext<CommandSource> var0, String var1) {
      return (Class4871)var0.getArgument(var1, Class4871.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      Stream var5 = Class7936.method26704().stream().<String>map(Class4871::method15034);
      return Class6618.method20148(var5, var2);
   }

   public Collection<String> getExamples() {
      return field43679;
   }
}
