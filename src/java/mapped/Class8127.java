package mapped;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;

import net.minecraft.command.ISuggestionProvider;
import net.minecraft.util.text.TranslationTextComponent;

public class Class8127 implements ArgumentType<Integer> {
   private static final Collection<String> field34951 = Arrays.<String>asList("0d", "0s", "0t", "0");
   private static final SimpleCommandExceptionType field34952 = new SimpleCommandExceptionType(new TranslationTextComponent("argument.time.invalid_unit"));
   private static final DynamicCommandExceptionType field34953 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("argument.time.invalid_tick_count", var0)
   );
   private static final Object2IntMap<String> field34954 = new Object2IntOpenHashMap();

   public static Class8127 method28154() {
      return new Class8127();
   }

   public Integer parse(StringReader var1) throws CommandSyntaxException {
      float var4 = var1.readFloat();
      String var5 = var1.readUnquotedString();
      int var6 = field34954.getOrDefault(var5, 0);
      if (var6 != 0) {
         int var7 = Math.round(var4 * (float)var6);
         if (var7 >= 0) {
            return var7;
         } else {
            throw field34953.create(var7);
         }
      } else {
         throw field34952.create();
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      StringReader var5 = new StringReader(var2.getRemaining());

      try {
         var5.readFloat();
      } catch (CommandSyntaxException var7) {
         return var2.buildFuture();
      }

      return ISuggestionProvider.suggest(field34954.keySet(), var2.createOffset(var2.getStart() + var5.getCursor()));
   }

   public Collection<String> getExamples() {
      return field34951;
   }

   static {
      field34954.put("d", 24000);
      field34954.put("s", 20);
      field34954.put("t", 1);
      field34954.put("", 1);
   }
}
