package remapped;

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
import java.util.function.Predicate;
import net.minecraft.util.text.TranslationTextComponent;

public class class_2061 implements ArgumentType<class_4584> {
   private static final Collection<String> field_10415 = Arrays.<String>asList(
      "stone", "minecraft:stone", "stone[foo=bar]", "#stone", "#stone[foo=bar]{baz=nbt}"
   );
   private static final DynamicCommandExceptionType field_10416 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("arguments.block.tag.unknown", var0)
   );

   public static class_2061 method_9620() {
      return new class_2061();
   }

   public class_4584 parse(StringReader var1) throws CommandSyntaxException {
      class_4104 var4 = new class_4104(var1, true).method_18973(true);
      if (var4.method_18967() == null) {
         Identifier var6 = var4.method_18971();
         return var2 -> {
            class_2307 var5x = var2.method_29392().method_43140(var6);
            if (var5x != null) {
               return new class_5082(var5x, var4.method_18974(), var4.method_18958(), null);
            } else {
               throw field_10416.create(var6.toString());
            }
         };
      } else {
         class_7393 var5 = new class_7393(var4.method_18967(), var4.method_18985().keySet(), var4.method_18958());
         return var1x -> var5;
      }
   }

   public static Predicate<class_9115> method_9622(CommandContext<class_9155> var0, String var1) throws CommandSyntaxException {
      return ((class_4584)var0.getArgument(var1, class_4584.class)).method_21239(((class_9155)var0.getSource()).method_42177().method_1754());
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      StringReader var5 = new StringReader(var2.getInput());
      var5.setCursor(var2.getStart());
      class_4104 var6 = new class_4104(var5, true);

      try {
         var6.method_18973(true);
      } catch (CommandSyntaxException var8) {
      }

      return var6.method_18969(var2, class_2351.method_10755());
   }

   public Collection<String> getExamples() {
      return field_10415;
   }
}
