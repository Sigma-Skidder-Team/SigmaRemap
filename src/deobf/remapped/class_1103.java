package remapped;

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

public class class_1103 implements ArgumentType<class_4533> {
   private static final Collection<String> field_6335 = Arrays.<String>asList(field_6336[0], field_6336[7], field_6336[6]);
   private static final SimpleCommandExceptionType field_6333 = new SimpleCommandExceptionType(new TranslationTextComponent("arguments.operation.invalid"));
   private static final SimpleCommandExceptionType field_6334 = new SimpleCommandExceptionType(new TranslationTextComponent("arguments.operation.div0"));

   public static class_1103 method_4906() {
      return new class_1103();
   }

   public static class_4533 method_4903(CommandContext<class_9155> var0, String var1) throws CommandSyntaxException {
      return (class_4533)var0.getArgument(var1, class_4533.class);
   }

   public class_4533 parse(StringReader var1) throws CommandSyntaxException {
      if (!var1.canRead()) {
         throw field_6333.create();
      } else {
         int var4 = var1.getCursor();

         while (var1.canRead() && var1.peek() != ' ') {
            var1.skip();
         }

         return method_4905(var1.getString().substring(var4, var1.getCursor()));
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return class_8773.method_40321(new String[]{"=", "+=", "-=", "*=", "/=", "%=", "<", ">", "><"}, var2);
   }

   public Collection<String> getExamples() {
      return field_6335;
   }

   private static class_4533 method_4905(String var0) throws CommandSyntaxException {
      return (class_4533)(!var0.equals("><") ? method_4904(var0) : (var0x, var1) -> {
         int var4 = var0x.method_38146();
         var0x.method_38140(var1.method_38146());
         var1.method_38140(var4);
      });
   }

   private static class_9416 method_4904(String var0) throws CommandSyntaxException {
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
                  return MathHelper.intFloorDiv(var0x, var1);
               } else {
                  throw field_6334.create();
               }
            };
         case "%=":
            return (var0x, var1) -> {
               if (var1 != 0) {
                  return MathHelper.normalizeAngle(var0x, var1);
               } else {
                  throw field_6334.create();
               }
            };
         case "<":
            return Math::min;
         case ">":
            return Math::max;
         default:
            throw field_6333.create();
      }
   }
}
