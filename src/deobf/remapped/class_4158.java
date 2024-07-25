package remapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.minecraft.util.text.TranslationTextComponent;

public class class_4158 {
   public static void method_19296(CommandDispatcher<class_9155> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class_465.method_2231("weather")
                     .requires(var0x -> var0x.method_40314(2)))
                  .then(
                     ((LiteralArgumentBuilder)class_465.method_2231("clear").executes(var0x -> method_19293((class_9155)var0x.getSource(), 6000)))
                        .then(
                           class_465.method_2236("duration", IntegerArgumentType.integer(0, 1000000))
                              .executes(var0x -> method_19293((class_9155)var0x.getSource(), IntegerArgumentType.getInteger(var0x, "duration") * 20))
                        )
                  ))
               .then(
                  ((LiteralArgumentBuilder)class_465.method_2231("rain").executes(var0x -> method_19295((class_9155)var0x.getSource(), 6000)))
                     .then(
                        class_465.method_2236("duration", IntegerArgumentType.integer(0, 1000000))
                           .executes(var0x -> method_19295((class_9155)var0x.getSource(), IntegerArgumentType.getInteger(var0x, "duration") * 20))
                     )
               ))
            .then(
               ((LiteralArgumentBuilder)class_465.method_2231("thunder").executes(var0x -> method_19297((class_9155)var0x.getSource(), 6000)))
                  .then(
                     class_465.method_2236("duration", IntegerArgumentType.integer(0, 1000000))
                        .executes(var0x -> method_19297((class_9155)var0x.getSource(), IntegerArgumentType.getInteger(var0x, "duration") * 20))
                  )
            )
      );
   }

   private static int method_19293(class_9155 var0, int var1) {
      var0.method_42198().method_28927(var1, 0, false, false);
      var0.method_42196(new TranslationTextComponent("commands.weather.set.clear"), true);
      return var1;
   }

   private static int method_19295(class_9155 var0, int var1) {
      var0.method_42198().method_28927(0, var1, true, false);
      var0.method_42196(new TranslationTextComponent("commands.weather.set.rain"), true);
      return var1;
   }

   private static int method_19297(class_9155 var0, int var1) {
      var0.method_42198().method_28927(0, var1, true, true);
      var0.method_42196(new TranslationTextComponent("commands.weather.set.thunder"), true);
      return var1;
   }
}
