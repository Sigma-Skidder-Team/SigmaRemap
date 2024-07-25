package remapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.minecraft.util.text.TranslationTextComponent;

public class class_5699 {
   public static void method_25775(CommandDispatcher<class_9155> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)class_465.method_2231("stop").requires(var0x -> var0x.method_40314(4))).executes(var0x -> {
            ((class_9155)var0x.getSource()).method_42196(new TranslationTextComponent("commands.stop.stopping"), true);
            ((class_9155)var0x.getSource()).method_42177().method_1641(false);
            return 1;
         })
      );
   }
}
