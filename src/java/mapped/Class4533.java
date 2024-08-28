package mapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import net.minecraft.util.text.TranslationTextComponent;

public class Class4533 {
   private static final SimpleCommandExceptionType field21847 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.spectate.self"));
   private static final DynamicCommandExceptionType field21848 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("commands.spectate.not_spectator", var0)
   );

   public static void method14453(CommandDispatcher<Class6619> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class6099.method18839("spectate").requires(var0x -> var0x.method20129(2)))
               .executes(var0x -> method14454((Class6619)var0x.getSource(), (Entity)null, ((Class6619)var0x.getSource()).method20175())))
            .then(
               ((RequiredArgumentBuilder)Class6099.method18840("target", Class8700.method31345())
                     .executes(
                        var0x -> method14454((Class6619)var0x.getSource(), Class8700.method31346(var0x, "target"), ((Class6619)var0x.getSource()).method20175())
                     ))
                  .then(
                     Class6099.method18840("player", Class8700.method31351())
                        .executes(
                           var0x -> method14454((Class6619)var0x.getSource(), Class8700.method31346(var0x, "target"), Class8700.method31352(var0x, "player"))
                        )
                  )
            )
      );
   }

   private static int method14454(Class6619 var0, Entity var1, Class878 var2) throws CommandSyntaxException {
      if (var2 != var1) {
         if (var2.field4857.method33863() == Class1894.field11105) {
            var2.method2815(var1);
            if (var1 == null) {
               var0.method20179(new TranslationTextComponent("commands.spectate.success.stopped"), false);
            } else {
               var0.method20179(new TranslationTextComponent("commands.spectate.success.started", var1.getDisplayName()), false);
            }

            return 1;
         } else {
            throw field21848.create(var2.getDisplayName());
         }
      } else {
         throw field21847.create();
      }
   }
}
