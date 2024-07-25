package remapped;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.concurrent.CompletableFuture;

public class class_8300 implements SuggestionProvider<class_8773> {
   private static String[] field_42532;
   private final SuggestionProvider<class_8773> field_42533;
   private final Identifier field_42531;

   public class_8300(Identifier var1, SuggestionProvider<class_8773> var2) {
      this.field_42533 = var2;
      this.field_42531 = var1;
   }

   public CompletableFuture<Suggestions> getSuggestions(CommandContext<class_8773> var1, SuggestionsBuilder var2) throws CommandSyntaxException {
      return this.field_42533.getSuggestions(var1, var2);
   }
}
