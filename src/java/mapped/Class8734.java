package mapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.minecraft.command.CommandSource;
import net.minecraft.util.text.TranslationTextComponent;

public class Class8734 {
   public static void method31520(CommandDispatcher<CommandSource> var0) {
      var0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class6099.method18839("stop").requires(var0x -> var0x.method20129(4))).executes(var0x -> {
         ((CommandSource)var0x.getSource()).method20179(new TranslationTextComponent("commands.stop.stopping"), true);
         ((CommandSource)var0x.getSource()).method20177().initiateShutdown(false);
         return 1;
      }));
   }
}
