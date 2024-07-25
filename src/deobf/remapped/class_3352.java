package remapped;

import com.google.gson.JsonParseException;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.ITextComponent$class_40;
import net.minecraft.util.text.TranslationTextComponent;

public class class_3352 implements ArgumentType<ITextComponent> {
   private static final Collection<String> field_16535 = Arrays.<String>asList("\"hello world\"", "\"\"", "\"{\"text\":\"hello world\"}", "[\"\"]");
   public static final DynamicCommandExceptionType field_16534 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("argument.component.invalid", var0)
   );

   private class_3352() {
   }

   public static ITextComponent method_15360(CommandContext<class_9155> var0, String var1) {
      return (ITextComponent)var0.getArgument(var1, ITextComponent.class);
   }

   public static class_3352 method_15361() {
      return new class_3352();
   }

   public ITextComponent parse(StringReader var1) throws CommandSyntaxException {
      try {
         IFormattableTextComponent var4 = ITextComponent$class_40.func_240642_a_(var1);
         if (var4 == null) {
            throw field_16534.createWithContext(var1, "empty");
         } else {
            return var4;
         }
      } catch (JsonParseException var6) {
         String var5 = var6.getCause() != null ? var6.getCause().getMessage() : var6.getMessage();
         throw field_16534.createWithContext(var1, var5);
      }
   }

   public Collection<String> getExamples() {
      return field_16535;
   }
}
