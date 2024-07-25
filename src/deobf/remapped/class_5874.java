package remapped;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public class class_5874 implements ArgumentType<class_8406> {
   private static final Collection<String> field_29829 = Arrays.<String>asList("0", "0b", "0l", "0.0", "\"foo\"", "{foo=bar}", "[0]");

   private class_5874() {
   }

   public static class_5874 method_26749() {
      return new class_5874();
   }

   public static <S> class_8406 method_26747(CommandContext<S> var0, String var1) {
      return (class_8406)var0.getArgument(var1, class_8406.class);
   }

   public class_8406 parse(StringReader var1) throws CommandSyntaxException {
      return new class_2392(var1).method_10917();
   }

   public Collection<String> getExamples() {
      return field_29829;
   }
}
