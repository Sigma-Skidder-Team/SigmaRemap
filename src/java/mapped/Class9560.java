package mapped;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import net.minecraft.util.text.TranslationTextComponent;

public class Class9560 implements ArgumentType<EnumSet<Direction>> {
   private static final Collection<String> field44530 = Arrays.<String>asList("xyz", "x");
   private static final SimpleCommandExceptionType field44531 = new SimpleCommandExceptionType(new TranslationTextComponent("arguments.swizzle.invalid"));

   public static Class9560 method37040() {
      return new Class9560();
   }

   public static EnumSet<Direction> method37041(CommandContext<Class6619> var0, String var1) {
      return (EnumSet<Direction>)var0.getArgument(var1, EnumSet.class);
   }

   public EnumSet<Direction> parse(StringReader var1) throws CommandSyntaxException {
      EnumSet var4 = EnumSet.<Direction>noneOf(Direction.class);

      while (var1.canRead() && var1.peek() != ' ') {
         char var5 = var1.read();
         Direction var6;
         switch (var5) {
            case 'x':
               var6 = Direction.X;
               break;
            case 'y':
               var6 = Direction.Y;
               break;
            case 'z':
               var6 = Direction.Z;
               break;
            default:
               throw field44531.create();
         }

         if (var4.contains(var6)) {
            throw field44531.create();
         }

         var4.add(var6);
      }

      return var4;
   }

   public Collection<String> getExamples() {
      return field44530;
   }
}
