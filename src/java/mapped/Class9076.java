package mapped;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;
import net.minecraft.util.text.TranslationTextComponent;

public class Class9076 implements ArgumentType<Class9580> {
   private static final Collection<String> field41522 = Arrays.<String>asList("0", "~", "~-5");
   public static final SimpleCommandExceptionType field41523 = new SimpleCommandExceptionType(new TranslationTextComponent("argument.angle.incomplete"));

   public static Class9076 method33816() {
      return new Class9076();
   }

   public static float method33817(CommandContext<Class6619> var0, String var1) {
      return ((Class9580)var0.getArgument(var1, Class9580.class)).method37196((Class6619)var0.getSource());
   }

   public Class9580 parse(StringReader var1) throws CommandSyntaxException {
      if (!var1.canRead()) {
         throw field41523.createWithContext(var1);
      } else {
         boolean var4 = Class8796.method31757(var1);
         float var5 = var1.canRead() && var1.peek() != ' ' ? var1.readFloat() : 0.0F;
         return new Class9580(var5, var4);
      }
   }

   public Collection<String> getExamples() {
      return field41522;
   }
}
