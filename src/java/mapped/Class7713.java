package mapped;

import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.CompletableFuture;

import net.minecraft.command.CommandSource;
import net.minecraft.util.text.TranslationTextComponent;

public class Class7713 implements ArgumentType<Class6205> {
   private static final Collection<String> field33104 = Arrays.<String>asList("Player", "0123", "dd12be42-52a9-4a91-a8a1-11c01849e498", "@e");
   public static final SimpleCommandExceptionType field33105 = new SimpleCommandExceptionType(new TranslationTextComponent("argument.player.unknown"));

   public static Collection<GameProfile> method25482(CommandContext<CommandSource> var0, String var1) throws CommandSyntaxException {
      return ((Class6205)var0.getArgument(var1, Class6205.class)).method19110((CommandSource)var0.getSource());
   }

   public static Class7713 method25483() {
      return new Class7713();
   }

   public Class6205 parse(StringReader var1) throws CommandSyntaxException {
      if (var1.canRead() && var1.peek() == '@') {
         Class8533 var6 = new Class8533(var1);
         Class8429 var7 = var6.method30303();
         if (!var7.method29612()) {
            return new Class6204(var7);
         } else {
            throw Class8700.field39262.create();
         }
      } else {
         int var4 = var1.getCursor();

         while (var1.canRead() && var1.peek() != ' ') {
            var1.skip();
         }

         String var5 = var1.getString().substring(var4, var1.getCursor());
         return var1x -> {
            GameProfile var4x = var1x.method20177().getPlayerProfileCache().method31792(var5);
            if (var4x != null) {
               return Collections.<GameProfile>singleton(var4x);
            } else {
               throw field33105.create();
            }
         };
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      if (var1.getSource() instanceof Class6618) {
         StringReader var5 = new StringReader(var2.getInput());
         var5.setCursor(var2.getStart());
         Class8533 var6 = new Class8533(var5);

         try {
            var6.method30303();
         } catch (CommandSyntaxException var8) {
         }

         return var6.method30314(var2, var1x -> Class6618.method20147(((Class6618)var1.getSource()).method20124(), var1x));
      } else {
         return Suggestions.empty();
      }
   }

   public Collection<String> getExamples() {
      return field33104;
   }
}
