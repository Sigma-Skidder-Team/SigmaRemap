package mapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.minecraft.command.CommandSource;
import net.minecraft.util.text.TranslationTextComponent;

public class Class8734 {
   public static void method31520(CommandDispatcher<CommandSource> var0) {
      var0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder) Commands.method18839("stop").requires(var0x -> var0x.method20129(4))).executes(var0x -> {
         ((CommandSource)var0x.getSource()).sendFeedback(new TranslationTextComponent("commands.stop.stopping"), true);
         ((CommandSource)var0x.getSource()).getServer().initiateShutdown(false);
         return 1;
      }));
   }
}
