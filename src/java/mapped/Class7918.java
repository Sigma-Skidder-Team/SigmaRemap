package mapped;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;
import net.minecraft.util.text.TranslationTextComponent;

public class Class7918 implements ArgumentType<Class7329> {
   private static final Collection<String> field33905 = Arrays.<String>asList("0 0", "~ ~", "~-5 ~5");
   public static final SimpleCommandExceptionType field33906 = new SimpleCommandExceptionType(new TranslationTextComponent("argument.rotation.incomplete"));

   public static Class7918 method26558() {
      return new Class7918();
   }

   public static Class7329 method26559(CommandContext<Class6619> var0, String var1) {
      return (Class7329)var0.getArgument(var1, Class7329.class);
   }

   public Class7329 parse(StringReader var1) throws CommandSyntaxException {
      int var4 = var1.getCursor();
      if (var1.canRead()) {
         Class8796 var5 = Class8796.method31755(var1, false);
         if (var1.canRead() && var1.peek() == ' ') {
            var1.skip();
            Class8796 var6 = Class8796.method31755(var1, false);
            return new Class7331(var6, var5, new Class8796(true, 0.0));
         } else {
            var1.setCursor(var4);
            throw field33906.createWithContext(var1);
         }
      } else {
         throw field33906.createWithContext(var1);
      }
   }

   public Collection<String> getExamples() {
      return field33905;
   }
}
