package mapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.minecraft.command.CommandSource;
import net.minecraft.util.text.TranslationTextComponent;

public class Class9531 {
   public static void method36833(CommandDispatcher<CommandSource> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)Class6099.method18839("setidletimeout").requires(var0x -> var0x.method20129(3)))
            .then(
               Class6099.method18840("minutes", IntegerArgumentType.integer(0))
                  .executes(var0x -> method36834((CommandSource)var0x.getSource(), IntegerArgumentType.getInteger(var0x, "minutes")))
            )
      );
   }

   private static int method36834(CommandSource var0, int var1) {
      var0.method20177().setPlayerIdleTimeout(var1);
      var0.method20179(new TranslationTextComponent("commands.setidletimeout.success", var1), true);
      return var1;
   }
}
