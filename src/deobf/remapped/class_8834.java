package remapped;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import net.minecraft.util.text.TranslationTextComponent;

public class class_8834 implements ArgumentType<EnumSet<class_9249>> {
   private static final Collection<String> field_45186 = Arrays.<String>asList("xyz", "x");
   private static final SimpleCommandExceptionType field_45184 = new SimpleCommandExceptionType(new TranslationTextComponent("arguments.swizzle.invalid"));

   public static class_8834 method_40633() {
      return new class_8834();
   }

   public static EnumSet<class_9249> method_40632(CommandContext<class_9155> var0, String var1) {
      return (EnumSet<class_9249>)var0.getArgument(var1, EnumSet.class);
   }

   public EnumSet<class_9249> parse(StringReader var1) throws CommandSyntaxException {
      EnumSet var4 = EnumSet.<class_9249>noneOf(class_9249.class);

      while (var1.canRead() && var1.peek() != ' ') {
         char var5 = var1.read();
         class_9249 var6;
         switch (var5) {
            case 'x':
               var6 = class_9249.field_47215;
               break;
            case 'y':
               var6 = class_9249.field_47216;
               break;
            case 'z':
               var6 = class_9249.field_47219;
               break;
            default:
               throw field_45184.create();
         }

         if (var4.contains(var6)) {
            throw field_45184.create();
         }

         var4.add(var6);
      }

      return var4;
   }

   public Collection<String> getExamples() {
      return field_45186;
   }
}
