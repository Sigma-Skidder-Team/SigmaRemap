package remapped;

import com.google.common.collect.Iterables;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import net.minecraft.util.text.TranslationTextComponent;

public class class_5601 implements ArgumentType<class_4550> {
   private static final Collection<String> field_28408 = Arrays.<String>asList("Player", "0123", "@e", "@e[type=foo]", "dd12be42-52a9-4a91-a8a1-11c01849e498");
   public static final SimpleCommandExceptionType field_28402 = new SimpleCommandExceptionType(new TranslationTextComponent("argument.entity.toomany"));
   public static final SimpleCommandExceptionType field_28405 = new SimpleCommandExceptionType(new TranslationTextComponent("argument.player.toomany"));
   public static final SimpleCommandExceptionType field_28400 = new SimpleCommandExceptionType(new TranslationTextComponent("argument.player.entities"));
   public static final SimpleCommandExceptionType field_28399 = new SimpleCommandExceptionType(new TranslationTextComponent("argument.entity.notfound.entity"));
   public static final SimpleCommandExceptionType field_28403 = new SimpleCommandExceptionType(new TranslationTextComponent("argument.entity.notfound.player"));
   public static final SimpleCommandExceptionType field_28407 = new SimpleCommandExceptionType(
      new TranslationTextComponent("argument.entity.selector.not_allowed")
   );
   private final boolean field_28401;
   private final boolean field_28406;

   public class_5601(boolean var1, boolean var2) {
      this.field_28401 = var1;
      this.field_28406 = var2;
   }

   public static class_5601 method_25411() {
      return new class_5601(true, false);
   }

   public static Entity method_25413(CommandContext<class_9155> var0, String var1) throws CommandSyntaxException {
      return ((class_4550)var0.getArgument(var1, class_4550.class)).method_21100((class_9155)var0.getSource());
   }

   public static class_5601 method_25407() {
      return new class_5601(false, false);
   }

   public static Collection<? extends Entity> method_25410(CommandContext<class_9155> var0, String var1) throws CommandSyntaxException {
      Collection var4 = method_25417(var0, var1);
      if (!var4.isEmpty()) {
         return var4;
      } else {
         throw field_28399.create();
      }
   }

   public static Collection<? extends Entity> method_25417(CommandContext<class_9155> var0, String var1) throws CommandSyntaxException {
      return ((class_4550)var0.getArgument(var1, class_4550.class)).method_21106((class_9155)var0.getSource());
   }

   public static Collection<class_9359> method_25414(CommandContext<class_9155> var0, String var1) throws CommandSyntaxException {
      return ((class_4550)var0.getArgument(var1, class_4550.class)).method_21103((class_9155)var0.getSource());
   }

   public static class_5601 method_25415() {
      return new class_5601(true, true);
   }

   public static class_9359 method_25408(CommandContext<class_9155> var0, String var1) throws CommandSyntaxException {
      return ((class_4550)var0.getArgument(var1, class_4550.class)).method_21110((class_9155)var0.getSource());
   }

   public static class_5601 method_25409() {
      return new class_5601(false, true);
   }

   public static Collection<class_9359> method_25412(CommandContext<class_9155> var0, String var1) throws CommandSyntaxException {
      List var4 = ((class_4550)var0.getArgument(var1, class_4550.class)).method_21103((class_9155)var0.getSource());
      if (!var4.isEmpty()) {
         return var4;
      } else {
         throw field_28403.create();
      }
   }

   public class_4550 parse(StringReader var1) throws CommandSyntaxException {
      boolean var4 = false;
      class_4964 var5 = new class_4964(var1);
      class_4550 var6 = var5.method_22744();
      if (var6.method_21107() > 1 && this.field_28401) {
         if (!this.field_28406) {
            var1.setCursor(0);
            throw field_28402.createWithContext(var1);
         } else {
            var1.setCursor(0);
            throw field_28405.createWithContext(var1);
         }
      } else if (var6.method_21109() && this.field_28406 && !var6.method_21104()) {
         var1.setCursor(0);
         throw field_28400.createWithContext(var1);
      } else {
         return var6;
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      if (var1.getSource() instanceof class_8773) {
         StringReader var5 = new StringReader(var2.getInput());
         var5.setCursor(var2.getStart());
         class_8773 var6 = (class_8773)var1.getSource();
         class_4964 var7 = new class_4964(var5, var6.method_40314(2));

         try {
            var7.method_22744();
         } catch (CommandSyntaxException var9) {
         }

         return var7.method_22769(var2, var2x -> {
            Collection var5x = var6.method_40307();
            Object var6x = !this.field_28406 ? Iterables.concat(var5x, var6.method_40313()) : var5x;
            class_8773.method_40319((Iterable<String>)var6x, var2x);
         });
      } else {
         return Suggestions.empty();
      }
   }

   public Collection<String> getExamples() {
      return field_28408;
   }
}
