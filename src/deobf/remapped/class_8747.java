package remapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.minecraft.util.text.TranslationTextComponent;

public class class_8747 {
   public static void method_40151(CommandDispatcher<class_9155> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)class_465.method_2231("setidletimeout").requires(var0x -> var0x.method_40314(3)))
            .then(
               class_465.method_2236("minutes", IntegerArgumentType.integer(0))
                  .executes(var0x -> method_40149((class_9155)var0x.getSource(), IntegerArgumentType.getInteger(var0x, "minutes")))
            )
      );
   }

   private static int method_40149(class_9155 var0, int var1) {
      var0.method_42177().method_1731(var1);
      var0.method_42196(new TranslationTextComponent("commands.setidletimeout.success", var1), true);
      return var1;
   }
}
