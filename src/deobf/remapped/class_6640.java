package remapped;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public class class_6640 implements class_5303<class_7781> {
   private static final Collection<String> field_34373 = Arrays.<String>asList("0..5", "0", "-5", "-100..", "..100");

   public static class_7781 method_30512(CommandContext<class_9155> var0, String var1) {
      return (class_7781)var0.getArgument(var1, class_7781.class);
   }

   public class_7781 parse(StringReader var1) throws CommandSyntaxException {
      return class_7781.method_35308(var1);
   }

   public Collection<String> getExamples() {
      return field_34373;
   }
}
