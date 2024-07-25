package remapped;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;
import net.minecraft.util.text.TranslationTextComponent;

public class class_4195 implements ArgumentType<Identifier> {
   private static final Collection<String> field_20400 = Arrays.<String>asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType field_20401 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("advancement.advancementNotFound", var0)
   );
   private static final DynamicCommandExceptionType field_20402 = new DynamicCommandExceptionType(var0 -> new TranslationTextComponent("recipe.notFound", var0));
   private static final DynamicCommandExceptionType field_20403 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("predicate.unknown", var0)
   );
   private static final DynamicCommandExceptionType field_20399 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("attribute.unknown", var0)
   );

   public static class_4195 method_19515() {
      return new class_4195();
   }

   public static class_3139 method_19512(CommandContext<class_9155> var0, String var1) throws CommandSyntaxException {
      Identifier var4 = (Identifier)var0.getArgument(var1, Identifier.class);
      class_3139 var5 = ((class_9155)var0.getSource()).method_42177().method_1703().method_40818(var4);
      if (var5 != null) {
         return var5;
      } else {
         throw field_20401.create(var4);
      }
   }

   public static class_8932<?> method_19513(CommandContext<class_9155> var0, String var1) throws CommandSyntaxException {
      class_5023 var4 = ((class_9155)var0.getSource()).method_42177().method_1705();
      Identifier var5 = (Identifier)var0.getArgument(var1, Identifier.class);
      return (class_8932<?>)var4.method_23139(var5).orElseThrow(() -> field_20402.create(var5));
   }

   public static class_7279 method_19516(CommandContext<class_9155> var0, String var1) throws CommandSyntaxException {
      Identifier var4 = (Identifier)var0.getArgument(var1, Identifier.class);
      class_264 var5 = ((class_9155)var0.getSource()).method_42177().method_1676();
      class_7279 var6 = var5.method_1146(var4);
      if (var6 != null) {
         return var6;
      } else {
         throw field_20403.create(var4);
      }
   }

   public static class_225 method_19514(CommandContext<class_9155> var0, String var1) throws CommandSyntaxException {
      Identifier var4 = (Identifier)var0.getArgument(var1, Identifier.class);
      return class_8669.field_44403.method_39794(var4).orElseThrow(() -> field_20399.create(var4));
   }

   public static Identifier method_19511(CommandContext<class_9155> var0, String var1) {
      return (Identifier)var0.getArgument(var1, Identifier.class);
   }

   public Identifier parse(StringReader var1) throws CommandSyntaxException {
      return Identifier.method_21464(var1);
   }

   public Collection<String> getExamples() {
      return field_20400;
   }
}
