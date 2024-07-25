package remapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.minecraft.util.text.TranslationTextComponent;

public class class_3532 {
   public static void method_16313(CommandDispatcher<class_9155> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class_465.method_2231("time")
                     .requires(var0x -> var0x.method_40314(2)))
                  .then(
                     ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class_465.method_2231("set")
                                    .then(class_465.method_2231("day").executes(var0x -> method_16317((class_9155)var0x.getSource(), 1000))))
                                 .then(class_465.method_2231("noon").executes(var0x -> method_16317((class_9155)var0x.getSource(), 6000))))
                              .then(class_465.method_2231("night").executes(var0x -> method_16317((class_9155)var0x.getSource(), 13000))))
                           .then(class_465.method_2231("midnight").executes(var0x -> method_16317((class_9155)var0x.getSource(), 18000))))
                        .then(
                           class_465.method_2236("time", class_3678.method_17084())
                              .executes(var0x -> method_16317((class_9155)var0x.getSource(), IntegerArgumentType.getInteger(var0x, "time")))
                        )
                  ))
               .then(
                  class_465.method_2231("add")
                     .then(
                        class_465.method_2236("time", class_3678.method_17084())
                           .executes(var0x -> method_16312((class_9155)var0x.getSource(), IntegerArgumentType.getInteger(var0x, "time")))
                     )
               ))
            .then(
               ((LiteralArgumentBuilder)((LiteralArgumentBuilder)class_465.method_2231("query")
                        .then(
                           class_465.method_2231("daytime")
                              .executes(var0x -> method_16314((class_9155)var0x.getSource(), method_16316(((class_9155)var0x.getSource()).method_42198())))
                        ))
                     .then(
                        class_465.method_2231("gametime")
                           .executes(
                              var0x -> method_16314(
                                    (class_9155)var0x.getSource(), (int)(((class_9155)var0x.getSource()).method_42198().method_29546() % 2147483647L)
                                 )
                           )
                     ))
                  .then(
                     class_465.method_2231("day")
                        .executes(
                           var0x -> method_16314(
                                 (class_9155)var0x.getSource(), (int)(((class_9155)var0x.getSource()).method_42198().method_29584() / 24000L % 2147483647L)
                              )
                        )
                  )
            )
      );
   }

   private static int method_16316(class_6331 var0) {
      return (int)(var0.method_29584() % 24000L);
   }

   private static int method_16314(class_9155 var0, int var1) {
      var0.method_42196(new TranslationTextComponent("commands.time.query", var1), false);
      return var1;
   }

   public static int method_16317(class_9155 var0, int var1) {
      for (class_6331 var5 : var0.method_42177().method_1719()) {
         var5.method_28970((long)var1);
      }

      var0.method_42196(new TranslationTextComponent("commands.time.set", var1), true);
      return method_16316(var0.method_42198());
   }

   public static int method_16312(class_9155 var0, int var1) {
      for (class_6331 var5 : var0.method_42177().method_1719()) {
         var5.method_28970(var5.method_29584() + (long)var1);
      }

      int var6 = method_16316(var0.method_42198());
      var0.method_42196(new TranslationTextComponent("commands.time.set", var6), true);
      return var6;
   }
}
