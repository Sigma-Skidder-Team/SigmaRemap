package remapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import net.minecraft.util.text.TranslationTextComponent;

public class class_165 {
   private static final SimpleCommandExceptionType field_498 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.spectate.self"));
   private static final DynamicCommandExceptionType field_497 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("commands.spectate.not_spectator", var0)
   );

   public static void method_661(CommandDispatcher<class_9155> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class_465.method_2231("spectate").requires(var0x -> var0x.method_40314(2)))
               .executes(var0x -> method_662((class_9155)var0x.getSource(), (Entity)null, ((class_9155)var0x.getSource()).method_42179())))
            .then(
               ((RequiredArgumentBuilder)class_465.method_2236("target", class_5601.method_25411())
                     .executes(
                        var0x -> method_662(
                              (class_9155)var0x.getSource(), class_5601.method_25413(var0x, "target"), ((class_9155)var0x.getSource()).method_42179()
                           )
                     ))
                  .then(
                     class_465.method_2236("player", class_5601.method_25415())
                        .executes(
                           var0x -> method_662(
                                 (class_9155)var0x.getSource(), class_5601.method_25413(var0x, "target"), class_5601.method_25408(var0x, "player")
                              )
                        )
                  )
            )
      );
   }

   private static int method_662(class_9155 var0, Entity var1, class_9359 var2) throws CommandSyntaxException {
      if (var2 != var1) {
         if (var2.field_47807.method_39517() == GameType.SPECTATOR) {
            var2.method_43284(var1);
            if (var1 == null) {
               var0.method_42196(new TranslationTextComponent("commands.spectate.success.stopped"), false);
            } else {
               var0.method_42196(new TranslationTextComponent("commands.spectate.success.started", var1.method_19839()), false);
            }

            return 1;
         } else {
            throw field_497.create(var2.method_19839());
         }
      } else {
         throw field_498.create();
      }
   }
}
