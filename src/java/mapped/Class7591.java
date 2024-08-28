package mapped;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.function.Supplier;
import net.minecraft.util.text.TranslationTextComponent;

public class Class7591 implements ArgumentType<Class8985> {
   public static final SuggestionProvider<Class6619> field32590 = (var0, var1) -> {
      StringReader var4 = new StringReader(var1.getInput());
      var4.setCursor(var1.getStart());
      Class8533 var5 = new Class8533(var4);

      try {
         var5.method30303();
      } catch (CommandSyntaxException var7) {
      }

      return var5.method30314(var1, var1x -> Class6618.method20147(var0.getSource().method20124(), var1x));
   };
   private static final Collection<String> field32591 = Arrays.asList("Player", "0123", "*", "@e");
   private static final SimpleCommandExceptionType field32592 = new SimpleCommandExceptionType(new TranslationTextComponent("argument.scoreHolder.empty"));
   private final boolean field32593;

   public Class7591(boolean var1) {
      this.field32593 = var1;
   }

   public static String method24858(CommandContext<Class6619> var0, String var1) throws CommandSyntaxException {
      return method24859(var0, var1).iterator().next();
   }

   public static Collection<String> method24859(CommandContext<Class6619> var0, String var1) throws CommandSyntaxException {
      return method24861(var0, var1, Collections::emptyList);
   }

   public static Collection<String> method24860(CommandContext<Class6619> var0, String var1) throws CommandSyntaxException {
      return method24861(var0, var1, ((Class6619)var0.getSource()).method20177().method1409()::method20984);
   }

   public static Collection<String> method24861(CommandContext<Class6619> var0, String var1, Supplier<Collection<String>> var2) throws CommandSyntaxException {
      Collection var5 = ((Class8985)var0.getArgument(var1, Class8985.class)).method33188((Class6619)var0.getSource(), var2);
      if (!var5.isEmpty()) {
         return var5;
      } else {
         throw Class8700.field39263.create();
      }
   }

   public static Class7591 method24862() {
      return new Class7591(false);
   }

   public static Class7591 method24863() {
      return new Class7591(true);
   }

   public Class8985 parse(StringReader var1) throws CommandSyntaxException {
      if (var1.canRead() && var1.peek() == '@') {
         Class8533 var7 = new Class8533(var1);
         Class8429 var8 = var7.method30303();
         if (!this.field32593 && var8.method29611() > 1) {
            throw Class8700.field39260.create();
         } else {
            return new Class8986(var8);
         }
      } else {
         int var4 = var1.getCursor();

         while (var1.canRead() && var1.peek() != ' ') {
            var1.skip();
         }

         String var5 = var1.getString().substring(var4, var1.getCursor());
         if (!var5.equals("*")) {
            Set var6 = Collections.<String>singleton(var5);
            return (var1x, var2) -> var6;
         } else {
            return (var0, var1x) -> {
               Collection var4x = (Collection)var1x.get();
               if (!var4x.isEmpty()) {
                  return var4x;
               } else {
                  throw field32592.create();
               }
            };
         }
      }
   }

   public Collection<String> getExamples() {
      return field32591;
   }

   // $VF: synthetic method
   public static boolean method24868(Class7591 var0) {
      return var0.field32593;
   }
}
