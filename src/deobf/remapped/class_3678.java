package remapped;

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
import net.minecraft.util.text.TranslationTextComponent;

public class class_3678 implements ArgumentType<Integer> {
   private static final Collection<String> field_17938 = Arrays.<String>asList("0d", "0s", "0t", "0");
   private static final SimpleCommandExceptionType field_17936 = new SimpleCommandExceptionType(new TranslationTextComponent("argument.time.invalid_unit"));
   private static final DynamicCommandExceptionType field_17939 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("argument.time.invalid_tick_count", var0)
   );
   private static final Object2IntMap<String> field_17937 = new Object2IntOpenHashMap();

   public static class_3678 method_17084() {
      return new class_3678();
   }

   public Integer parse(StringReader var1) throws CommandSyntaxException {
      float var4 = var1.readFloat();
      String var5 = var1.readUnquotedString();
      int var6 = field_17937.getOrDefault(var5, 0);
      if (var6 != 0) {
         int var7 = Math.round(var4 * (float)var6);
         if (var7 >= 0) {
            return var7;
         } else {
            throw field_17939.create(var7);
         }
      } else {
         throw field_17936.create();
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      StringReader var5 = new StringReader(var2.getRemaining());

      try {
         var5.readFloat();
      } catch (CommandSyntaxException var7) {
         return var2.buildFuture();
      }

      return class_8773.method_40319(field_17937.keySet(), var2.createOffset(var2.getStart() + var5.getCursor()));
   }

   public Collection<String> getExamples() {
      return field_17938;
   }

   static {
      field_17937.put("d", 24000);
      field_17937.put("s", 20);
      field_17937.put("t", 1);
      field_17937.put("", 1);
   }
}
