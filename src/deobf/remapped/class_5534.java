package remapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.function.Predicate;
import net.minecraft.util.text.TranslationTextComponent;

public class class_5534 {
   private static final SimpleCommandExceptionType field_28212 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.setblock.failed"));

   public static void method_25137(CommandDispatcher<class_9155> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)class_465.method_2231("setblock").requires(var0x -> var0x.method_40314(2)))
            .then(
               class_465.method_2236("pos", class_1024.method_4522())
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)class_465.method_2236("block", class_3190.method_14683())
                                 .executes(
                                    var0x -> method_25139(
                                          (class_9155)var0x.getSource(),
                                          class_1024.method_4519(var0x, "pos"),
                                          class_3190.method_14681(var0x, "block"),
                                          class_9532.field_48510,
                                          (Predicate<class_9115>)null
                                       )
                                 ))
                              .then(
                                 class_465.method_2231("destroy")
                                    .executes(
                                       var0x -> method_25139(
                                             (class_9155)var0x.getSource(),
                                             class_1024.method_4519(var0x, "pos"),
                                             class_3190.method_14681(var0x, "block"),
                                             class_9532.field_48512,
                                             (Predicate<class_9115>)null
                                          )
                                    )
                              ))
                           .then(
                              class_465.method_2231("keep")
                                 .executes(
                                    var0x -> method_25139(
                                          (class_9155)var0x.getSource(),
                                          class_1024.method_4519(var0x, "pos"),
                                          class_3190.method_14681(var0x, "block"),
                                          class_9532.field_48510,
                                          var0xx -> var0xx.method_41969().method_22548(var0xx.method_41966())
                                       )
                                 )
                           ))
                        .then(
                           class_465.method_2231("replace")
                              .executes(
                                 var0x -> method_25139(
                                       (class_9155)var0x.getSource(),
                                       class_1024.method_4519(var0x, "pos"),
                                       class_3190.method_14681(var0x, "block"),
                                       class_9532.field_48510,
                                       (Predicate<class_9115>)null
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int method_25139(class_9155 var0, class_1331 var1, class_6986 var2, class_9532 var3, Predicate<class_9115> var4) throws CommandSyntaxException {
      class_6331 var7 = var0.method_42198();
      if (var4 != null && !var4.test(new class_9115(var7, var1, true))) {
         throw field_28212.create();
      } else {
         boolean var9;
         if (var3 != class_9532.field_48512) {
            class_3757 var8 = var7.method_28260(var1);
            class_5507.method_24976(var8);
            var9 = true;
         } else {
            var7.method_7510(var1, true);
            var9 = !var2.method_31963().method_8345() || !var7.method_28262(var1).method_8345();
         }

         if (var9 && !var2.method_31964(var7, var1, 2)) {
            throw field_28212.create();
         } else {
            var7.method_43369(var1, var2.method_31963().method_8360());
            var0.method_42196(new TranslationTextComponent("commands.setblock.success", var1.method_12173(), var1.method_12165(), var1.method_12185()), true);
            return 1;
         }
      }
   }
}
