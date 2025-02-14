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
import java.util.function.Predicate;

import net.minecraft.command.CommandSource;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ITag;
import net.minecraft.util.CachedBlockInfo;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TranslationTextComponent;

public class Class7505 implements ArgumentType<Class8439> {
   private static final Collection<String> field32226 = Arrays.<String>asList(
      "stone", "minecraft:stone", "stone[foo=bar]", "#stone", "#stone[foo=bar]{baz=nbt}"
   );
   private static final DynamicCommandExceptionType field32227 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("arguments.block.tag.unknown", var0)
   );

   public static Class7505 method24464() {
      return new Class7505();
   }

   public Class8439 parse(StringReader var1) throws CommandSyntaxException {
      Class8268 var4 = new Class8268(var1, true).method28840(true);
      if (var4.method28837() == null) {
         ResourceLocation var6 = var4.method28839();
         return var2 -> {
            ITag var5x = var2.method32657().get(var6);
            if (var5x != null) {
               return new Class170(var5x, var4.method28863(), var4.method28838());
            } else {
               throw field32227.create(var6.toString());
            }
         };
      } else {
         Class171 var5 = new Class171(var4.method28837(), var4.method28836().keySet(), var4.method28838());
         return var1x -> var5;
      }
   }

   public static Predicate<CachedBlockInfo> method24465(CommandContext<CommandSource> var0, String var1) throws CommandSyntaxException {
      return ((Class8439)var0.getArgument(var1, Class8439.class)).method29657(((CommandSource)var0.getSource()).getServer().method1408());
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      StringReader var5 = new StringReader(var2.getInput());
      var5.setCursor(var2.getStart());
      Class8268 var6 = new Class8268(var5, true);

      try {
         var6.method28840(true);
      } catch (CommandSyntaxException var8) {
      }

      return var6.method28862(var2, BlockTags.getCollection());
   }

   public Collection<String> getExamples() {
      return field32226;
   }
}
