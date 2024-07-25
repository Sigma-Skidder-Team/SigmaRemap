package remapped;

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
import net.minecraft.util.text.TranslationTextComponent;

public class class_2490 implements ArgumentType<class_2822> {
   private static final Collection<String> field_12393 = Arrays.<String>asList("Player", "0123", "dd12be42-52a9-4a91-a8a1-11c01849e498", "@e");
   public static final SimpleCommandExceptionType field_12392 = new SimpleCommandExceptionType(new TranslationTextComponent("argument.player.unknown"));

   public static Collection<GameProfile> method_11399(CommandContext<class_9155> var0, String var1) throws CommandSyntaxException {
      return ((class_2822)var0.getArgument(var1, class_2822.class)).method_12849((class_9155)var0.getSource());
   }

   public static class_2490 method_11397() {
      return new class_2490();
   }

   public class_2822 parse(StringReader var1) throws CommandSyntaxException {
      if (var1.canRead() && var1.peek() == '@') {
         class_4964 var6 = new class_4964(var1);
         class_4550 var7 = var6.method_22744();
         if (!var7.method_21109()) {
            return new class_525(var7);
         } else {
            throw class_5601.field_28400.create();
         }
      } else {
         int var4 = var1.getCursor();

         while (var1.canRead() && var1.peek() != ' ') {
            var1.skip();
         }

         String var5 = var1.getString().substring(var4, var1.getCursor());
         return var1x -> {
            GameProfile var4x = var1x.method_42177().method_1647().method_27255(var5);
            if (var4x != null) {
               return Collections.<GameProfile>singleton(var4x);
            } else {
               throw field_12392.create();
            }
         };
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      if (var1.getSource() instanceof class_8773) {
         StringReader var5 = new StringReader(var2.getInput());
         var5.setCursor(var2.getStart());
         class_4964 var6 = new class_4964(var5);

         try {
            var6.method_22744();
         } catch (CommandSyntaxException var8) {
         }

         return var6.method_22769(var2, var1x -> class_8773.method_40319(((class_8773)var1.getSource()).method_40307(), var1x));
      } else {
         return Suggestions.empty();
      }
   }

   public Collection<String> getExamples() {
      return field_12393;
   }
}
