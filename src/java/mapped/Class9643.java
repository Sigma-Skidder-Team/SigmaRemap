package mapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import net.minecraft.command.CommandSource;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.GameRules;

public class Class9643 {
   public static void method37594(CommandDispatcher<CommandSource> var0) {
      LiteralArgumentBuilder var3 = (LiteralArgumentBuilder) Commands.method18839("gamerule").requires(var0x -> var0x.method20129(2));
      GameRules.method17131(new Class7571(var3));
      var0.register(var3);
   }

   private static <T extends Class7465<T>> int method37595(CommandContext<CommandSource> var0, Class9221<T> var1) {
      CommandSource var4 = (CommandSource)var0.getSource();
      Class7465 var5 = var4.getServer().getGameRules().get(var1);
      var5.method24170(var0, "value");
      var4.sendFeedback(new TranslationTextComponent("commands.gamerule.set", var1.method34672(), var5.toString()), true);
      return var5.method24160();
   }

   private static <T extends Class7465<T>> int method37596(CommandSource var0, Class9221<T> var1) {
      Class7465 var4 = var0.getServer().getGameRules().get(var1);
      var0.sendFeedback(new TranslationTextComponent("commands.gamerule.query", var1.method34672(), var4.toString()), false);
      return var4.method24160();
   }

   // $VF: synthetic method
   public static int method37598(CommandContext var0, Class9221 var1) {
      return method37595(var0, var1);
   }

   // $VF: synthetic method
   public static int method37599(CommandSource var0, Class9221 var1) {
      return method37596(var0, var1);
   }
}
