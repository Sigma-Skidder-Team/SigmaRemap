package mapped;

import com.google.gson.JsonParseException;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;

import net.minecraft.command.CommandSource;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class8010 implements ArgumentType<ITextComponent> {
   private static final Collection<String> field34438 = Arrays.<String>asList("\"hello world\"", "\"\"", "\"{\"text\":\"hello world\"}", "[\"\"]");
   public static final DynamicCommandExceptionType field34439 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("argument.component.invalid", var0)
   );

   private Class8010() {
   }

   public static ITextComponent method27394(CommandContext<CommandSource> var0, String var1) {
      return (ITextComponent)var0.getArgument(var1, ITextComponent.class);
   }

   public static Class8010 method27395() {
      return new Class8010();
   }

   public ITextComponent parse(StringReader var1) throws CommandSyntaxException {
      try {
         IFormattableTextComponent var4 = ITextComponent.Serializer.func_240642_a_(var1);
         if (var4 == null) {
            throw field34439.createWithContext(var1, "empty");
         } else {
            return var4;
         }
      } catch (JsonParseException var6) {
         String var5 = var6.getCause() != null ? var6.getCause().getMessage() : var6.getMessage();
         throw field34439.createWithContext(var1, var5);
      }
   }

   public Collection<String> getExamples() {
      return field34438;
   }
}
