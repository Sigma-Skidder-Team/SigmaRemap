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
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TranslationTextComponent;

public class Class7584 implements ArgumentType<Class9041> {
   private static final Collection<String> field32562 = Arrays.<String>asList("stick", "minecraft:stick", "#stick", "#stick{foo=bar}");
   private static final DynamicCommandExceptionType field32563 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("arguments.item.tag.unknown", var0)
   );

   public static Class7584 method24822() {
      return new Class7584();
   }

   public Class9041 parse(StringReader var1) throws CommandSyntaxException {
      Class9759 var4 = new Class9759(var1, true).method38359();
      if (var4.method38353() == null) {
         ResourceLocation var6 = var4.method38355();
         return var2 -> {
            ITag var5x = ((CommandSource)var2.getSource()).getServer().method1408().method32658().get(var6);
            if (var5x != null) {
               return new Class175(var5x, var4.method38354());
            } else {
               throw field32563.create(var6.toString());
            }
         };
      } else {
         Class169 var5 = new Class169(var4.method38353(), var4.method38354());
         return var1x -> var5;
      }
   }

   public static Predicate<ItemStack> method24823(CommandContext<CommandSource> var0, String var1) throws CommandSyntaxException {
      return ((Class9041)var0.getArgument(var1, Class9041.class)).method33539(var0);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      StringReader var5 = new StringReader(var2.getInput());
      var5.setCursor(var2.getStart());
      Class9759 var6 = new Class9759(var5, true);

      try {
         var6.method38359();
      } catch (CommandSyntaxException var8) {
      }

      return var6.method38363(var2, ItemTags.method18561());
   }

   public Collection<String> getExamples() {
      return field32562;
   }
}
