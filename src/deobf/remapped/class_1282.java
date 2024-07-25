package remapped;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;
import net.minecraft.util.text.ITextComponent;

public class class_1282 implements ArgumentType<class_9339> {
   private static final Collection<String> field_7052 = Arrays.<String>asList("Hello world!", "foo", "@e", "Hello @p :)");

   public static class_1282 method_5728() {
      return new class_1282();
   }

   public static ITextComponent method_5729(CommandContext<class_9155> var0, String var1) throws CommandSyntaxException {
      return ((class_9339)var0.getArgument(var1, class_9339.class)).method_43112((class_9155)var0.getSource(), ((class_9155)var0.getSource()).method_40314(2));
   }

   public class_9339 parse(StringReader var1) throws CommandSyntaxException {
      return class_9339.method_43113(var1, true);
   }

   public Collection<String> getExamples() {
      return field_7052;
   }
}
