package mapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import net.minecraft.util.text.TranslationTextComponent;

public class Class8883 {
   private static final SimpleCommandExceptionType field40198 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.publish.failed"));
   private static final DynamicCommandExceptionType field40199 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("commands.publish.alreadyPublished", var0)
   );

   public static void method32320(CommandDispatcher<Class6619> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class6099.method18839("publish").requires(var0x -> var0x.method20129(4)))
               .executes(var0x -> method32321((Class6619)var0x.getSource(), Class6639.method20257())))
            .then(
               Class6099.method18840("port", IntegerArgumentType.integer(0, 65535))
                  .executes(var0x -> method32321((Class6619)var0x.getSource(), IntegerArgumentType.getInteger(var0x, "port")))
            )
      );
   }

   private static int method32321(Class6619 var0, int var1) throws CommandSyntaxException {
      if (!var0.method20177().getPublic()) {
         if (var0.method20177().method1374(var0.method20177().method1286(), false, var1)) {
            var0.method20179(new TranslationTextComponent("commands.publish.success", var1), true);
            return var1;
         } else {
            throw field40198.create();
         }
      } else {
         throw field40199.create(var0.method20177().method1330());
      }
   }
}
