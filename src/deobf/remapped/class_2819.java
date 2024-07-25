package remapped;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;
import net.minecraft.util.text.TranslationTextComponent;

public class class_2819 implements ArgumentType<Identifier> {
   private static final Collection<String> field_13840 = Arrays.<String>asList("minecraft:pig", "cow");
   public static final DynamicCommandExceptionType field_13842 = new DynamicCommandExceptionType(var0 -> new TranslationTextComponent("entity.notFound", var0));

   public static class_2819 method_12842() {
      return new class_2819();
   }

   public static Identifier method_12843(CommandContext<class_9155> var0, String var1) throws CommandSyntaxException {
      return method_12844((Identifier)var0.getArgument(var1, Identifier.class));
   }

   private static Identifier method_12844(Identifier var0) throws CommandSyntaxException {
      class_8669.field_44400.method_39794(var0).filter(class_6629::method_30465).orElseThrow(() -> field_13842.create(var0));
      return var0;
   }

   public Identifier parse(StringReader var1) throws CommandSyntaxException {
      return method_12844(Identifier.method_21464(var1));
   }

   public Collection<String> getExamples() {
      return field_13840;
   }
}
