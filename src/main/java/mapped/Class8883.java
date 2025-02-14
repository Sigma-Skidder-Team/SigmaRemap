package mapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import net.minecraft.command.CommandSource;
import net.minecraft.util.text.TranslationTextComponent;

public class Class8883 {
   private static final SimpleCommandExceptionType field40198 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.publish.failed"));
   private static final DynamicCommandExceptionType field40199 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("commands.publish.alreadyPublished", var0)
   );

   public static void method32320(CommandDispatcher<CommandSource> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder) Commands.method18839("publish").requires(var0x -> var0x.method20129(4)))
               .executes(var0x -> method32321((CommandSource)var0x.getSource(), Class6639.method20257())))
            .then(
               Commands.method18840("port", IntegerArgumentType.integer(0, 65535))
                  .executes(var0x -> method32321((CommandSource)var0x.getSource(), IntegerArgumentType.getInteger(var0x, "port")))
            )
      );
   }

   private static int method32321(CommandSource var0, int var1) throws CommandSyntaxException {
      if (!var0.getServer().getPublic()) {
         if (var0.getServer().method1374(var0.getServer().method1286(), false, var1)) {
            var0.sendFeedback(new TranslationTextComponent("commands.publish.success", var1), true);
            return var1;
         } else {
            throw field40198.create();
         }
      } else {
         throw field40199.create(var0.getServer().getServerPort());
      }
   }
}
