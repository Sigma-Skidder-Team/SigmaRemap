package mapped;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public class Class8592 implements Class8591<Class8840> {
   private static final Collection<String> field38671 = Arrays.<String>asList("0..5", "0", "-5", "-100..", "..100");

   public static Class8840 method30738(CommandContext<Class6619> var0, String var1) {
      return (Class8840)var0.getArgument(var1, Class8840.class);
   }

   public Class8840 parse(StringReader var1) throws CommandSyntaxException {
      return Class8840.method32017(var1);
   }

   public Collection<String> getExamples() {
      return field38671;
   }
}
