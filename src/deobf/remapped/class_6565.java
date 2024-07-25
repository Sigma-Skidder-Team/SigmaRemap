package remapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import net.minecraft.util.text.TranslationTextComponent;

public class class_6565 {
   private static final SimpleCommandExceptionType field_33491 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.save.failed"));

   public static void method_30008(CommandDispatcher<class_9155> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class_465.method_2231("save-all").requires(var0x -> var0x.method_40314(4)))
               .executes(var0x -> method_30006((class_9155)var0x.getSource(), false)))
            .then(class_465.method_2231("flush").executes(var0x -> method_30006((class_9155)var0x.getSource(), true)))
      );
   }

   private static int method_30006(class_9155 var0, boolean var1) throws CommandSyntaxException {
      var0.method_42196(new TranslationTextComponent("commands.save.saving"), false);
      class_341 var4 = var0.method_42177();
      var4.method_1600().method_39964();
      boolean var5 = var4.method_1635(true, var1, true);
      if (var5) {
         var0.method_42196(new TranslationTextComponent("commands.save.success"), true);
         return 1;
      } else {
         throw field_33491.create();
      }
   }
}
