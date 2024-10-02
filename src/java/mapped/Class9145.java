package mapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.minecraft.command.CommandSource;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.GameType;

public class Class9145 {
   public static void method34158(CommandDispatcher<CommandSource> var0) {
      LiteralArgumentBuilder var3 = (LiteralArgumentBuilder)Class6099.method18839("defaultgamemode").requires(var0x -> var0x.method20129(2));

      for (GameType var7 : GameType.values()) {
         if (var7 != GameType.field11101) {
            var3.then(Class6099.method18839(var7.method8153()).executes(var1 -> method34159((CommandSource)var1.getSource(), var7)));
         }
      }

      var0.register(var3);
   }

   private static int method34159(CommandSource var0, GameType var1) {
      int var4 = 0;
      MinecraftServer var5 = var0.method20177();
      var5.method1370(var1);
      if (var5.method1380()) {
         for (ServerPlayerEntity var7 : var5.getPlayerList().getPlayers()) {
            if (var7.interactionManager.getGameType() != var1) {
               var7.method2799(var1);
               var4++;
            }
         }
      }

      var0.method20179(new TranslationTextComponent("commands.defaultgamemode.success", var1.method8154()), true);
      return var4;
   }
}
