package mapped;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;
import net.minecraft.util.text.ITextComponent;

public class Class7026 implements ArgumentType<Class9688> {
   private static final Collection<String> field30339 = Arrays.<String>asList("Hello world!", "foo", "@e", "Hello @p :)");

   public static Class7026 method21755() {
      return new Class7026();
   }

   public static ITextComponent method21756(CommandContext<Class6619> var0, String var1) throws CommandSyntaxException {
      return ((Class9688)var0.getArgument(var1, Class9688.class)).method37928((Class6619)var0.getSource(), ((Class6619)var0.getSource()).method20129(2));
   }

   public Class9688 parse(StringReader var1) throws CommandSyntaxException {
      return Class9688.method37929(var1, true);
   }

   public Collection<String> getExamples() {
      return field30339;
   }
}
