package remapped;

import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import net.minecraft.util.text.TranslationTextComponent;

public class class_921 {
   private static final SimpleCommandExceptionType field_4733 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.op.failed"));

   public static void method_4039(CommandDispatcher<class_9155> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)class_465.method_2231("op").requires(var0x -> var0x.method_40314(3)))
            .then(
               class_465.method_2236("targets", class_2490.method_11397())
                  .suggests(
                     (var0x, var1) -> {
                        class_8704 var4 = ((class_9155)var0x.getSource()).method_42177().method_1600();
                        return class_8773.method_40320(
                           var4.method_39951()
                              .stream()
                              .filter(var1x -> !var4.method_39962(var1x.method_3247()))
                              .<String>map(var0xx -> var0xx.method_3247().getName()),
                           var1
                        );
                     }
                  )
                  .executes(var0x -> method_4037((class_9155)var0x.getSource(), class_2490.method_11399(var0x, "targets")))
            )
      );
   }

   private static int method_4037(class_9155 var0, Collection<GameProfile> var1) throws CommandSyntaxException {
      class_8704 var4 = var0.method_42177().method_1600();
      int var5 = 0;

      for (GameProfile var7 : var1) {
         if (!var4.method_39962(var7)) {
            var4.method_39966(var7);
            var5++;
            var0.method_42196(new TranslationTextComponent("commands.op.success", ((GameProfile)var1.iterator().next()).getName()), true);
         }
      }

      if (var5 != 0) {
         return var5;
      } else {
         throw field_4733.create();
      }
   }
}
