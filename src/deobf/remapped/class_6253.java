package remapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import net.minecraft.util.text.TranslationTextComponent;

public class class_6253 {
   private static final SimpleCommandExceptionType field_31975 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.publish.failed"));
   private static final DynamicCommandExceptionType field_31974 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("commands.publish.alreadyPublished", var0)
   );

   public static void method_28546(CommandDispatcher<class_9155> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class_465.method_2231("publish").requires(var0x -> var0x.method_40314(4)))
               .executes(var0x -> method_28547((class_9155)var0x.getSource(), class_828.method_3611())))
            .then(
               class_465.method_2236("port", IntegerArgumentType.integer(0, 65535))
                  .executes(var0x -> method_28547((class_9155)var0x.getSource(), IntegerArgumentType.getInteger(var0x, "port")))
            )
      );
   }

   private static int method_28547(class_9155 var0, int var1) throws CommandSyntaxException {
      if (!var0.method_42177().method_1624()) {
         if (var0.method_42177().method_1625(var0.method_42177().method_1602(), false, var1)) {
            var0.method_42196(new TranslationTextComponent("commands.publish.success", var1), true);
            return var1;
         } else {
            throw field_31975.create();
         }
      } else {
         throw field_31974.create(var0.method_42177().method_1650());
      }
   }
}
