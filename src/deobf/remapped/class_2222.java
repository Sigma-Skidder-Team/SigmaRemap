package remapped;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import java.util.Arrays;
import java.util.Collection;
import net.minecraft.util.text.TranslationTextComponent;

public class class_2222 implements ArgumentType<class_9638> {
   private static final Collection<String> field_11106 = Arrays.<String>asList("foo", "foo:bar", "#foo");
   private static final DynamicCommandExceptionType field_11105 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("arguments.function.tag.unknown", var0)
   );
   private static final DynamicCommandExceptionType field_11108 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("arguments.function.unknown", var0)
   );

   public static class_2222 method_10260() {
      return new class_2222();
   }

   public class_9638 parse(StringReader var1) throws CommandSyntaxException {
      if (var1.canRead() && var1.peek() == '#') {
         var1.skip();
         Identifier var5 = Identifier.method_21464(var1);
         return new class_1854(this, var5);
      } else {
         Identifier var4 = Identifier.method_21464(var1);
         return new class_5835(this, var4);
      }
   }

   private static class_2581 method_10259(CommandContext<class_9155> var0, Identifier var1) throws CommandSyntaxException {
      return ((class_9155)var0.getSource()).method_42177().method_1642().method_7252(var1).orElseThrow(() -> field_11108.create(var1.toString()));
   }

   private static class_2307<class_2581> method_10257(CommandContext<class_9155> var0, Identifier var1) throws CommandSyntaxException {
      class_2307 var4 = ((class_9155)var0.getSource()).method_42177().method_1642().method_7249(var1);
      if (var4 != null) {
         return var4;
      } else {
         throw field_11105.create(var1.toString());
      }
   }

   public static Collection<class_2581> method_10256(CommandContext<class_9155> var0, String var1) throws CommandSyntaxException {
      return ((class_9638)var0.getArgument(var1, class_9638.class)).method_44495(var0);
   }

   public static Pair<Identifier, Either<class_2581, class_2307<class_2581>>> method_10258(CommandContext<class_9155> var0, String var1) throws CommandSyntaxException {
      return ((class_9638)var0.getArgument(var1, class_9638.class)).method_44494(var0);
   }

   public Collection<String> getExamples() {
      return field_11106;
   }
}
