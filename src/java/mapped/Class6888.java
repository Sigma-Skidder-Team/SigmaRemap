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
import java.util.concurrent.CompletableFuture;
import net.minecraft.util.text.TranslationTextComponent;

public class Class6888 implements ArgumentType<Class8420> {
   private static final Collection<String> field29851 = Arrays.asList("=", ">", "<");
   private static final SimpleCommandExceptionType field29852 = new SimpleCommandExceptionType(new TranslationTextComponent("arguments.operation.invalid"));
   private static final SimpleCommandExceptionType field29853 = new SimpleCommandExceptionType(new TranslationTextComponent("arguments.operation.div0"));

   public static Class6888 method21028() {
      return new Class6888();
   }

   public static Class8420 method21029(CommandContext<Class6619> var0, String var1) throws CommandSyntaxException {
      return (Class8420)var0.getArgument(var1, Class8420.class);
   }

   public Class8420 parse(StringReader var1) throws CommandSyntaxException {
      if (!var1.canRead()) {
         throw field29852.create();
      } else {
         int var4 = var1.getCursor();

         while (var1.canRead() && var1.peek() != ' ') {
            var1.skip();
         }

         return method21030(var1.getString().substring(var4, var1.getCursor()));
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return Class6618.method20149(new String[]{"=", "+=", "-=", "*=", "/=", "%=", "<", ">", "><"}, var2);
   }

   public Collection<String> getExamples() {
      return field29851;
   }

   private static Class8420 method21030(String var0) throws CommandSyntaxException {
      return (!var0.equals("><") ? method21031(var0) : (var0x, var1) -> {
         int var4 = var0x.method36050();
         var0x.method36052(var1.method36050());
         var1.method36052(var4);
      });
   }

   private static Class8421 method21031(String var0) throws CommandSyntaxException {
      switch (var0) {
         case "=":
            return (var0x, var1) -> var1;
         case "+=":
            return (var0x, var1) -> var0x + var1;
         case "-=":
            return (var0x, var1) -> var0x - var1;
         case "*=":
            return (var0x, var1) -> var0x * var1;
         case "/=":
            return (var0x, var1) -> {
               if (var1 != 0) {
                  return Class9679.method37781(var0x, var1);
               } else {
                  throw field29853.create();
               }
            };
         case "%=":
            return (var0x, var1) -> {
               if (var1 != 0) {
                  return Class9679.method37788(var0x, var1);
               } else {
                  throw field29853.create();
               }
            };
         case "<":
            return Math::min;
         case ">":
            return Math::max;
         default:
            throw field29852.create();
      }
   }
}
