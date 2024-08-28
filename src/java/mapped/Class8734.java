package mapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.minecraft.util.text.TranslationTextComponent;

public class Class8734 {
   public static void method31520(CommandDispatcher<Class6619> var0) {
      var0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class6099.method18839("stop").requires(var0x -> var0x.method20129(4))).executes(var0x -> {
         ((Class6619)var0x.getSource()).method20179(new TranslationTextComponent("commands.stop.stopping"), true);
         ((Class6619)var0x.getSource()).method20177().method1296(false);
         return 1;
      }));
   }
}
