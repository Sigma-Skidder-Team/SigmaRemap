package remapped;

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

public class class_2282 implements ArgumentType<class_6605> {
   public static final SuggestionProvider<class_9155> field_11406 = (var0, var1) -> {
      StringReader var4 = new StringReader(var1.getInput());
      var4.setCursor(var1.getStart());
      class_4964 var5 = new class_4964(var4);

      try {
         var5.method_22744();
      } catch (CommandSyntaxException var7) {
      }

      return var5.method_22769(var1, var1x -> class_8773.method_40319(((class_9155)var0.getSource()).method_40307(), var1x));
   };
   private static final Collection<String> field_11408 = Arrays.<String>asList("Player", "0123", field_11409[0], "@e");
   private static final SimpleCommandExceptionType field_11405 = new SimpleCommandExceptionType(new TranslationTextComponent("argument.scoreHolder.empty"));
   private final boolean field_11407;

   public class_2282(boolean var1) {
      this.field_11407 = var1;
   }

   public static String method_10520(CommandContext<class_9155> var0, String var1) throws CommandSyntaxException {
      return method_10524(var0, var1).iterator().next();
   }

   public static Collection<String> method_10524(CommandContext<class_9155> var0, String var1) throws CommandSyntaxException {
      return method_10526(var0, var1, Collections::emptyList);
   }

   public static Collection<String> method_10525(CommandContext<class_9155> var0, String var1) throws CommandSyntaxException {
      return method_10526(var0, var1, ((class_9155)var0.getSource()).method_42177().method_1655()::method_4859);
   }

   public static Collection<String> method_10526(CommandContext<class_9155> var0, String var1, Supplier<Collection<String>> var2) throws CommandSyntaxException {
      Collection var5 = ((class_6605)var0.getArgument(var1, class_6605.class)).method_30391((class_9155)var0.getSource(), var2);
      if (!var5.isEmpty()) {
         return var5;
      } else {
         throw class_5601.field_28399.create();
      }
   }

   public static class_2282 method_10522() {
      return new class_2282(false);
   }

   public static class_2282 method_10523() {
      return new class_2282(true);
   }

   public class_6605 parse(StringReader var1) throws CommandSyntaxException {
      if (var1.canRead() && var1.peek() == '@') {
         class_4964 var7 = new class_4964(var1);
         class_4550 var8 = var7.method_22744();
         if (!this.field_11407 && var8.method_21107() > 1) {
            throw class_5601.field_28402.create();
         } else {
            return new class_8947(var8);
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
                  throw field_11405.create();
               }
            };
         }
      }
   }

   public Collection<String> getExamples() {
      return field_11408;
   }
}
