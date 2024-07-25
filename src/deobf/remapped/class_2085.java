package remapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import net.minecraft.util.text.TranslationTextComponent;

public class class_2085 {
   private static final SimpleCommandExceptionType field_10485 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.schedule.same_tick"));
   private static final DynamicCommandExceptionType field_10483 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("commands.schedule.cleared.failure", var0)
   );
   private static final SuggestionProvider<class_9155> field_10482 = (var0, var1) -> class_8773.method_40319(
         ((class_9155)var0.getSource()).method_42177().method_1601().method_25706().method_32969().method_23180(), var1
      );

   public static void method_9732(CommandDispatcher<class_9155> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class_465.method_2231("schedule").requires(var0x -> var0x.method_40314(2)))
               .then(
                  class_465.method_2231("function")
                     .then(
                        class_465.method_2236("function", class_2222.method_10260())
                           .suggests(class_530.field_3226)
                           .then(
                              ((RequiredArgumentBuilder)((RequiredArgumentBuilder)class_465.method_2236("time", class_3678.method_17084())
                                       .executes(
                                          var0x -> method_9730(
                                                (class_9155)var0x.getSource(),
                                                class_2222.method_10258(var0x, "function"),
                                                IntegerArgumentType.getInteger(var0x, "time"),
                                                true
                                             )
                                       ))
                                    .then(
                                       class_465.method_2231("append")
                                          .executes(
                                             var0x -> method_9730(
                                                   (class_9155)var0x.getSource(),
                                                   class_2222.method_10258(var0x, "function"),
                                                   IntegerArgumentType.getInteger(var0x, "time"),
                                                   false
                                                )
                                          )
                                    ))
                                 .then(
                                    class_465.method_2231("replace")
                                       .executes(
                                          var0x -> method_9730(
                                                (class_9155)var0x.getSource(),
                                                class_2222.method_10258(var0x, "function"),
                                                IntegerArgumentType.getInteger(var0x, "time"),
                                                true
                                             )
                                       )
                                 )
                           )
                     )
               ))
            .then(
               class_465.method_2231("clear")
                  .then(
                     class_465.method_2236("function", StringArgumentType.greedyString())
                        .suggests(field_10482)
                        .executes(var0x -> method_9731((class_9155)var0x.getSource(), StringArgumentType.getString(var0x, "function")))
                  )
            )
      );
   }

   private static int method_9730(class_9155 var0, Pair<class_4639, Either<class_2581, class_2307<class_2581>>> var1, int var2, boolean var3) throws CommandSyntaxException {
      if (var2 != 0) {
         long var6 = var0.method_42198().method_29546() + (long)var2;
         class_4639 var8 = (class_4639)var1.getFirst();
         class_5026 var9 = var0.method_42177().method_1601().method_25706().method_32969();
         ((Either)var1.getSecond()).ifLeft(var7 -> {
            String var10 = var8.toString();
            if (var3) {
               var9.method_23182(var10);
            }

            var9.method_23179(var10, var6, new class_1057(var8));
            var0.method_42196(new TranslationTextComponent("commands.schedule.created.function", var8, var2, var6), true);
         }).ifRight(var7 -> {
            String var10 = "#" + var8.toString();
            if (var3) {
               var9.method_23182(var10);
            }

            var9.method_23179(var10, var6, new class_3137(var8));
            var0.method_42196(new TranslationTextComponent("commands.schedule.created.tag", var8, var2, var6), true);
         });
         return (int)Math.floorMod(var6, 2147483647L);
      } else {
         throw field_10485.create();
      }
   }

   private static int method_9731(class_9155 var0, String var1) throws CommandSyntaxException {
      int var4 = var0.method_42177().method_1601().method_25706().method_32969().method_23182(var1);
      if (var4 != 0) {
         var0.method_42196(new TranslationTextComponent("commands.schedule.cleared.success", var4, var1), true);
         return var4;
      } else {
         throw field_10483.create(var1);
      }
   }
}
