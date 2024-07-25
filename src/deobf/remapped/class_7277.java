package remapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.util.Collection;
import java.util.Collections;
import net.minecraft.util.text.TranslationTextComponent;

public class class_7277 {
   public static void method_33259(CommandDispatcher<class_9155> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class_465.method_2231("spawnpoint").requires(var0x -> var0x.method_40314(2)))
               .executes(
                  var0x -> method_33260(
                        (class_9155)var0x.getSource(),
                        Collections.<class_9359>singleton(((class_9155)var0x.getSource()).method_42179()),
                        new class_1331(((class_9155)var0x.getSource()).method_42192()),
                        0.0F
                     )
               ))
            .then(
               ((RequiredArgumentBuilder)class_465.method_2236("targets", class_5601.method_25409())
                     .executes(
                        var0x -> method_33260(
                              (class_9155)var0x.getSource(),
                              class_5601.method_25412(var0x, "targets"),
                              new class_1331(((class_9155)var0x.getSource()).method_42192()),
                              0.0F
                           )
                     ))
                  .then(
                     ((RequiredArgumentBuilder)class_465.method_2236("pos", class_1024.method_4522())
                           .executes(
                              var0x -> method_33260(
                                    (class_9155)var0x.getSource(), class_5601.method_25412(var0x, "targets"), class_1024.method_4520(var0x, "pos"), 0.0F
                                 )
                           ))
                        .then(
                           class_465.method_2236("angle", class_6919.method_31676())
                              .executes(
                                 var0x -> method_33260(
                                       (class_9155)var0x.getSource(),
                                       class_5601.method_25412(var0x, "targets"),
                                       class_1024.method_4520(var0x, "pos"),
                                       class_6919.method_31675(var0x, "angle")
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int method_33260(class_9155 var0, Collection<class_9359> var1, class_1331 var2, float var3) {
      class_5621 var6 = var0.method_42198().method_29545();

      for (class_9359 var8 : var1) {
         var8.method_43248(var6, var2, var3, true, false);
      }

      String var9 = var6.method_25499().toString();
      if (var1.size() != 1) {
         var0.method_42196(
            new TranslationTextComponent(
               "commands.spawnpoint.success.multiple", var2.method_12173(), var2.method_12165(), var2.method_12185(), var3, var9, var1.size()
            ),
            true
         );
      } else {
         var0.method_42196(
            new TranslationTextComponent(
               "commands.spawnpoint.success.single",
               var2.method_12173(),
               var2.method_12165(),
               var2.method_12185(),
               var3,
               var9,
               ((class_9359)var1.iterator().next()).method_19839()
            ),
            true
         );
      }

      return var1.size();
   }
}
