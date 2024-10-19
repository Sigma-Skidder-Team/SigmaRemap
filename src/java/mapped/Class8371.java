package mapped;

import com.google.common.collect.Lists;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

import net.minecraft.command.CommandSource;
import net.minecraft.command.ISuggestionProvider;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.text.TranslationTextComponent;

public class Class8371 implements ArgumentType<Class9008> {
   private static final Collection<String> field35933 = Arrays.<String>asList("foo", "foo.bar.baz", "minecraft:foo");
   public static final DynamicCommandExceptionType field35934 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("argument.criteria.invalid", var0)
   );

   private Class8371() {
   }

   public static Class8371 method29322() {
      return new Class8371();
   }

   public static Class9008 method29323(CommandContext<CommandSource> var0, String var1) {
      return (Class9008)var0.getArgument(var1, Class9008.class);
   }

   public Class9008 parse(StringReader var1) throws CommandSyntaxException {
      int var4 = var1.getCursor();

      while (var1.canRead() && var1.peek() != ' ') {
         var1.skip();
      }

      String var5 = var1.getString().substring(var4, var1.getCursor());
      return Class9008.method33278(var5).orElseThrow(() -> {
         var1.setCursor(var4);
         return field35934.create(var5);
      });
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      ArrayList var5 = Lists.newArrayList(Class9008.field41188.keySet());

      for (Class49 var7 : Registry.field16088) {
         for (Object var9 : var7.method171()) {
            String var10 = this.method29324(var7, var9);
            var5.add(var10);
         }
      }

      return ISuggestionProvider.method20147(var5, var2);
   }

   public <T> String method29324(Class49<T> var1, T var2) {
      return Class9007.method33273(var1, var2);
   }

   public Collection<String> getExamples() {
      return field35933;
   }
}
