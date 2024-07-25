package remapped;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public class class_5132 implements class_5303<class_6115> {
   private static final Collection<String> field_26471 = Arrays.<String>asList("0..5.2", "0", "-5.4", "-100.76..", "..100");

   public class_6115 parse(StringReader var1) throws CommandSyntaxException {
      return class_6115.method_28091(var1);
   }

   public Collection<String> getExamples() {
      return field_26471;
   }
}
