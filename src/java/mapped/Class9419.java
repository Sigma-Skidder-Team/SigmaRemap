package mapped;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.concurrent.CompletableFuture;

public class Class9419 implements SuggestionProvider<Class6618> {
   private static String[] field43680;
   private final SuggestionProvider<Class6618> field43681;
   private final ResourceLocation field43682;

   public Class9419(ResourceLocation var1, SuggestionProvider<Class6618> var2) {
      this.field43681 = var2;
      this.field43682 = var1;
   }

   public CompletableFuture<Suggestions> getSuggestions(CommandContext<Class6618> var1, SuggestionsBuilder var2) throws CommandSyntaxException {
      return this.field43681.getSuggestions(var1, var2);
   }

   // $VF: synthetic method
   public static ResourceLocation method36140(Class9419 var0) {
      return var0.field43682;
   }
}
