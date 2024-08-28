package mapped;

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

public class Class8700 implements ArgumentType<Class8429> {
   private static final Collection<String> field39259 = Arrays.<String>asList("Player", "0123", "@e", "@e[type=foo]", "dd12be42-52a9-4a91-a8a1-11c01849e498");
   public static final SimpleCommandExceptionType field39260 = new SimpleCommandExceptionType(new TranslationTextComponent("argument.entity.toomany"));
   public static final SimpleCommandExceptionType field39261 = new SimpleCommandExceptionType(new TranslationTextComponent("argument.player.toomany"));
   public static final SimpleCommandExceptionType field39262 = new SimpleCommandExceptionType(new TranslationTextComponent("argument.player.entities"));
   public static final SimpleCommandExceptionType field39263 = new SimpleCommandExceptionType(new TranslationTextComponent("argument.entity.notfound.entity"));
   public static final SimpleCommandExceptionType field39264 = new SimpleCommandExceptionType(new TranslationTextComponent("argument.entity.notfound.player"));
   public static final SimpleCommandExceptionType field39265 = new SimpleCommandExceptionType(
      new TranslationTextComponent("argument.entity.selector.not_allowed")
   );
   private final boolean field39266;
   private final boolean field39267;

   public Class8700(boolean var1, boolean var2) {
      this.field39266 = var1;
      this.field39267 = var2;
   }

   public static Class8700 method31345() {
      return new Class8700(true, false);
   }

   public static Entity method31346(CommandContext<Class6619> var0, String var1) throws CommandSyntaxException {
      return ((Class8429)var0.getArgument(var1, Class8429.class)).method29616((Class6619)var0.getSource());
   }

   public static Class8700 method31347() {
      return new Class8700(false, false);
   }

   public static Collection<? extends Entity> method31348(CommandContext<Class6619> var0, String var1) throws CommandSyntaxException {
      Collection var4 = method31349(var0, var1);
      if (!var4.isEmpty()) {
         return var4;
      } else {
         throw field39263.create();
      }
   }

   public static Collection<? extends Entity> method31349(CommandContext<Class6619> var0, String var1) throws CommandSyntaxException {
      return ((Class8429)var0.getArgument(var1, Class8429.class)).method29617((Class6619)var0.getSource());
   }

   public static Collection<ServerPlayerEntity> method31350(CommandContext<Class6619> var0, String var1) throws CommandSyntaxException {
      return ((Class8429)var0.getArgument(var1, Class8429.class)).method29620((Class6619)var0.getSource());
   }

   public static Class8700 method31351() {
      return new Class8700(true, true);
   }

   public static ServerPlayerEntity method31352(CommandContext<Class6619> var0, String var1) throws CommandSyntaxException {
      return ((Class8429)var0.getArgument(var1, Class8429.class)).method29619((Class6619)var0.getSource());
   }

   public static Class8700 method31353() {
      return new Class8700(false, true);
   }

   public static Collection<ServerPlayerEntity> method31354(CommandContext<Class6619> var0, String var1) throws CommandSyntaxException {
      List var4 = ((Class8429)var0.getArgument(var1, Class8429.class)).method29620((Class6619)var0.getSource());
      if (!var4.isEmpty()) {
         return var4;
      } else {
         throw field39264.create();
      }
   }

   public Class8429 parse(StringReader var1) throws CommandSyntaxException {
      boolean var4 = false;
      Class8533 var5 = new Class8533(var1);
      Class8429 var6 = var5.method30303();
      if (var6.method29611() > 1 && this.field39266) {
         if (!this.field39267) {
            var1.setCursor(0);
            throw field39260.createWithContext(var1);
         } else {
            var1.setCursor(0);
            throw field39261.createWithContext(var1);
         }
      } else if (var6.method29612() && this.field39267 && !var6.method29613()) {
         var1.setCursor(0);
         throw field39262.createWithContext(var1);
      } else {
         return var6;
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      if (var1.getSource() instanceof Class6618) {
         StringReader var5 = new StringReader(var2.getInput());
         var5.setCursor(var2.getStart());
         Class6618 var6 = (Class6618)var1.getSource();
         Class8533 var7 = new Class8533(var5, var6.method20129(2));

         try {
            var7.method30303();
         } catch (CommandSyntaxException var9) {
         }

         return var7.method30314(var2, var2x -> {
            Collection var5x = var6.method20124();
            Object var6x = !this.field39267 ? Iterables.concat(var5x, var6.method20125()) : var5x;
            Class6618.method20147((Iterable<String>)var6x, var2x);
         });
      } else {
         return Suggestions.empty();
      }
   }

   public Collection<String> getExamples() {
      return field39259;
   }

   // $VF: synthetic method
   public static boolean method31356(Class8700 var0) {
      return var0.field39266;
   }

   // $VF: synthetic method
   public static boolean method31357(Class8700 var0) {
      return var0.field39267;
   }
}
