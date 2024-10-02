package mapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import net.minecraft.command.CommandSource;
import net.minecraft.util.text.TranslationTextComponent;

public class Class8971 {
   private static final SimpleCommandExceptionType field40555 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.save.failed"));

   public static void method32923(CommandDispatcher<CommandSource> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class6099.method18839("save-all").requires(var0x -> var0x.method20129(4)))
               .executes(var0x -> method32924((CommandSource)var0x.getSource(), false)))
            .then(Class6099.method18839("flush").executes(var0x -> method32924((CommandSource)var0x.getSource(), true)))
      );
   }

   private static int method32924(CommandSource var0, boolean var1) throws CommandSyntaxException {
      var0.method20179(new TranslationTextComponent("commands.save.saving"), false);
      MinecraftServer var4 = var0.method20177();
      var4.getPlayerList().saveAllPlayerData();
      boolean var5 = var4.method1291(true, var1, true);
      if (var5) {
         var0.method20179(new TranslationTextComponent("commands.save.success"), true);
         return 1;
      } else {
         throw field40555.create();
      }
   }
}
