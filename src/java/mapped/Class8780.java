package mapped;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public class Class8780 implements ArgumentType<Class30> {
   private static final Collection<String> field39489 = Arrays.<String>asList("0", "0b", "0l", "0.0", "\"foo\"", "{foo=bar}", "[0]");

   private Class8780() {
   }

   public static Class8780 method31660() {
      return new Class8780();
   }

   public static <S> Class30 method31661(CommandContext<S> var0, String var1) {
      return (Class30)var0.getArgument(var1, Class30.class);
   }

   public Class30 parse(StringReader var1) throws CommandSyntaxException {
      return new Class7671(var1).method25193();
   }

   public Collection<String> getExamples() {
      return field39489;
   }
}
