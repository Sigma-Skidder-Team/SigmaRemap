package remapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.regex.Matcher;
import net.minecraft.util.text.TranslationTextComponent;

public class class_7197 {
   private static final SimpleCommandExceptionType field_37003 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.pardonip.invalid"));
   private static final SimpleCommandExceptionType field_37004 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.pardonip.failed"));

   public static void method_32952(CommandDispatcher<class_9155> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)class_465.method_2231("pardon-ip").requires(var0x -> var0x.method_40314(3)))
            .then(
               class_465.method_2236("target", StringArgumentType.word())
                  .suggests(
                     (var0x, var1) -> class_8773.method_40321(((class_9155)var0x.getSource()).method_42177().method_1600().method_39952().method_19929(), var1)
                  )
                  .executes(var0x -> method_32951((class_9155)var0x.getSource(), StringArgumentType.getString(var0x, "target")))
            )
      );
   }

   private static int method_32951(class_9155 var0, String var1) throws CommandSyntaxException {
      Matcher var4 = class_4322.field_21030.matcher(var1);
      if (var4.matches()) {
         class_9065 var5 = var0.method_42177().method_1600().method_39952();
         if (var5.method_41615(var1)) {
            var5.method_19925(var1);
            var0.method_42196(new TranslationTextComponent("commands.pardonip.success", var1), true);
            return 1;
         } else {
            throw field_37004.create();
         }
      } else {
         throw field_37003.create();
      }
   }
}
