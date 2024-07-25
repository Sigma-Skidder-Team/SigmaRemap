package remapped;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;
import net.minecraft.util.text.TranslationTextComponent;

public class class_6919 implements ArgumentType<class_8901> {
   private static final Collection<String> field_35549 = Arrays.<String>asList("0", "~", "~-5");
   public static final SimpleCommandExceptionType field_35550 = new SimpleCommandExceptionType(new TranslationTextComponent("argument.angle.incomplete"));

   public static class_6919 method_31676() {
      return new class_6919();
   }

   public static float method_31675(CommandContext<class_9155> var0, String var1) {
      return ((class_8901)var0.getArgument(var1, class_8901.class)).method_40960((class_9155)var0.getSource());
   }

   public class_8901 parse(StringReader var1) throws CommandSyntaxException {
      if (!var1.canRead()) {
         throw field_35550.createWithContext(var1);
      } else {
         boolean var4 = class_5941.method_27169(var1);
         float var5 = var1.canRead() && var1.peek() != ' ' ? var1.readFloat() : 0.0F;
         return new class_8901(var5, var4, null);
      }
   }

   public Collection<String> getExamples() {
      return field_35549;
   }
}
