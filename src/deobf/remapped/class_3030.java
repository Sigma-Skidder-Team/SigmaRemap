package remapped;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;
import net.minecraft.util.text.TranslationTextComponent;

public class class_3030 implements ArgumentType<class_1808> {
   private static final Collection<String> field_14845 = Arrays.<String>asList("0 0", "~ ~", "~-5 ~5");
   public static final SimpleCommandExceptionType field_14844 = new SimpleCommandExceptionType(new TranslationTextComponent("argument.rotation.incomplete"));

   public static class_3030 method_13831() {
      return new class_3030();
   }

   public static class_1808 method_13832(CommandContext<class_9155> var0, String var1) {
      return (class_1808)var0.getArgument(var1, class_1808.class);
   }

   public class_1808 parse(StringReader var1) throws CommandSyntaxException {
      int var4 = var1.getCursor();
      if (var1.canRead()) {
         class_5941 var5 = class_5941.method_27171(var1, false);
         if (var1.canRead() && var1.peek() == ' ') {
            var1.skip();
            class_5941 var6 = class_5941.method_27171(var1, false);
            return new class_5095(var6, var5, new class_5941(true, 0.0));
         } else {
            var1.setCursor(var4);
            throw field_14844.createWithContext(var1);
         }
      } else {
         throw field_14844.createWithContext(var1);
      }
   }

   public Collection<String> getExamples() {
      return field_14845;
   }
}
