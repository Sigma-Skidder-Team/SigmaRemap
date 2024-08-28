package mapped;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public class Class8590 implements Class8591<Class8841> {
   private static final Collection<String> field38670 = Arrays.<String>asList("0..5.2", "0", "-5.4", "-100.76..", "..100");

   public Class8841 parse(StringReader var1) throws CommandSyntaxException {
      return Class8841.method32026(var1);
   }

   public Collection<String> getExamples() {
      return field38670;
   }
}
