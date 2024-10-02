package mapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import net.minecraft.command.CommandSource;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.server.ServerWorld;

public class Class8987 {
   private static final SimpleCommandExceptionType field40998 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.save.alreadyOn"));

   public static void method33189(CommandDispatcher<CommandSource> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)Class6099.method18839("save-on").requires(var0x -> var0x.method20129(4))).executes(var0x -> {
            CommandSource var3 = (CommandSource)var0x.getSource();
            boolean var4 = false;

            for (ServerWorld var6 : var3.method20177().method1320()) {
               if (var6 != null && var6.field9047) {
                  var6.field9047 = false;
                  var4 = true;
               }
            }

            if (var4) {
               var3.method20179(new TranslationTextComponent("commands.save.enabled"), true);
               return 1;
            } else {
               throw field40998.create();
            }
         })
      );
   }
}
