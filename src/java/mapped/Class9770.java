package mapped;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public class Class9770 implements ArgumentType<Class39> {
   private static final Collection<String> field45708 = Arrays.<String>asList("{}", "{foo=bar}");

   private Class9770() {
   }

   public static Class9770 method38432() {
      return new Class9770();
   }

   public static <S> Class39 method38433(CommandContext<S> var0, String var1) {
      return (Class39)var0.getArgument(var1, Class39.class);
   }

   public Class39 parse(StringReader var1) throws CommandSyntaxException {
      return new Class7671(var1).method25195();
   }

   public Collection<String> getExamples() {
      return field45708;
   }
}
