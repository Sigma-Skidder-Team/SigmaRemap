package remapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import net.minecraft.util.text.TranslationTextComponent;

public class class_4022 {
   private static final SimpleCommandExceptionType field_19523 = new SimpleCommandExceptionType(
      new TranslationTextComponent("commands.worldborder.center.failed")
   );
   private static final SimpleCommandExceptionType field_19519 = new SimpleCommandExceptionType(
      new TranslationTextComponent("commands.worldborder.set.failed.nochange")
   );
   private static final SimpleCommandExceptionType field_19522 = new SimpleCommandExceptionType(
      new TranslationTextComponent("commands.worldborder.set.failed.small.")
   );
   private static final SimpleCommandExceptionType field_19520 = new SimpleCommandExceptionType(
      new TranslationTextComponent("commands.worldborder.set.failed.big.")
   );
   private static final SimpleCommandExceptionType field_19524 = new SimpleCommandExceptionType(
      new TranslationTextComponent("commands.worldborder.warning.time.failed")
   );
   private static final SimpleCommandExceptionType field_19521 = new SimpleCommandExceptionType(
      new TranslationTextComponent("commands.worldborder.warning.distance.failed")
   );
   private static final SimpleCommandExceptionType field_19518 = new SimpleCommandExceptionType(
      new TranslationTextComponent("commands.worldborder.damage.buffer.failed")
   );
   private static final SimpleCommandExceptionType field_19516 = new SimpleCommandExceptionType(
      new TranslationTextComponent("commands.worldborder.damage.amount.failed")
   );

   public static void method_18532(CommandDispatcher<class_9155> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class_465.method_2231(
                                 "worldborder"
                              )
                              .requires(var0x -> var0x.method_40314(2)))
                           .then(
                              class_465.method_2231("add")
                                 .then(
                                    ((RequiredArgumentBuilder)class_465.method_2236("distance", FloatArgumentType.floatArg(-6.0E7F, 6.0E7F))
                                          .executes(
                                             var0x -> method_18537(
                                                   (class_9155)var0x.getSource(),
                                                   ((class_9155)var0x.getSource()).method_42198().method_6673().method_9824()
                                                      + (double)FloatArgumentType.getFloat(var0x, "distance"),
                                                   0L
                                                )
                                          ))
                                       .then(
                                          class_465.method_2236("time", IntegerArgumentType.integer(0))
                                             .executes(
                                                var0x -> method_18537(
                                                      (class_9155)var0x.getSource(),
                                                      ((class_9155)var0x.getSource()).method_42198().method_6673().method_9824()
                                                         + (double)FloatArgumentType.getFloat(var0x, "distance"),
                                                      ((class_9155)var0x.getSource()).method_42198().method_6673().method_9804()
                                                         + (long)IntegerArgumentType.getInteger(var0x, "time") * 1000L
                                                   )
                                             )
                                       )
                                 )
                           ))
                        .then(
                           class_465.method_2231("set")
                              .then(
                                 ((RequiredArgumentBuilder)class_465.method_2236("distance", FloatArgumentType.floatArg(-6.0E7F, 6.0E7F))
                                       .executes(
                                          var0x -> method_18537((class_9155)var0x.getSource(), (double)FloatArgumentType.getFloat(var0x, "distance"), 0L)
                                       ))
                                    .then(
                                       class_465.method_2236("time", IntegerArgumentType.integer(0))
                                          .executes(
                                             var0x -> method_18537(
                                                   (class_9155)var0x.getSource(),
                                                   (double)FloatArgumentType.getFloat(var0x, "distance"),
                                                   (long)IntegerArgumentType.getInteger(var0x, "time") * 1000L
                                                )
                                          )
                                    )
                              )
                        ))
                     .then(
                        class_465.method_2231("center")
                           .then(
                              class_465.method_2236("pos", class_1843.method_8148())
                                 .executes(var0x -> method_18531((class_9155)var0x.getSource(), class_1843.method_8146(var0x, "pos")))
                           )
                     ))
                  .then(
                     ((LiteralArgumentBuilder)class_465.method_2231("damage")
                           .then(
                              class_465.method_2231("amount")
                                 .then(
                                    class_465.method_2236("damagePerBlock", FloatArgumentType.floatArg(0.0F))
                                       .executes(var0x -> method_18529((class_9155)var0x.getSource(), FloatArgumentType.getFloat(var0x, "damagePerBlock")))
                                 )
                           ))
                        .then(
                           class_465.method_2231("buffer")
                              .then(
                                 class_465.method_2236("distance", FloatArgumentType.floatArg(0.0F))
                                    .executes(var0x -> method_18536((class_9155)var0x.getSource(), FloatArgumentType.getFloat(var0x, "distance")))
                              )
                        )
                  ))
               .then(class_465.method_2231("get").executes(var0x -> method_18534((class_9155)var0x.getSource()))))
            .then(
               ((LiteralArgumentBuilder)class_465.method_2231("warning")
                     .then(
                        class_465.method_2231("distance")
                           .then(
                              class_465.method_2236("distance", IntegerArgumentType.integer(0))
                                 .executes(var0x -> method_18533((class_9155)var0x.getSource(), IntegerArgumentType.getInteger(var0x, "distance")))
                           )
                     ))
                  .then(
                     class_465.method_2231("time")
                        .then(
                           class_465.method_2236("time", IntegerArgumentType.integer(0))
                              .executes(var0x -> method_18530((class_9155)var0x.getSource(), IntegerArgumentType.getInteger(var0x, "time")))
                        )
                  )
            )
      );
   }

   private static int method_18536(class_9155 var0, float var1) throws CommandSyntaxException {
      class_2098 var4 = var0.method_42198().method_6673();
      if (var4.method_9830() != (double)var1) {
         var4.method_9827((double)var1);
         var0.method_42196(new TranslationTextComponent("commands.worldborder.damage.buffer.success", String.format(Locale.ROOT, "%.2f", var1)), true);
         return (int)var1;
      } else {
         throw field_19518.create();
      }
   }

   private static int method_18529(class_9155 var0, float var1) throws CommandSyntaxException {
      class_2098 var4 = var0.method_42198().method_6673();
      if (var4.method_9826() != (double)var1) {
         var4.method_9829((double)var1);
         var0.method_42196(new TranslationTextComponent("commands.worldborder.damage.amount.success", String.format(Locale.ROOT, "%.2f", var1)), true);
         return (int)var1;
      } else {
         throw field_19516.create();
      }
   }

   private static int method_18530(class_9155 var0, int var1) throws CommandSyntaxException {
      class_2098 var4 = var0.method_42198().method_6673();
      if (var4.method_9812() != var1) {
         var4.method_9803(var1);
         var0.method_42196(new TranslationTextComponent("commands.worldborder.warning.time.success", var1), true);
         return var1;
      } else {
         throw field_19524.create();
      }
   }

   private static int method_18533(class_9155 var0, int var1) throws CommandSyntaxException {
      class_2098 var4 = var0.method_42198().method_6673();
      if (var4.method_9819() != var1) {
         var4.method_9832(var1);
         var0.method_42196(new TranslationTextComponent("commands.worldborder.warning.distance.success", var1), true);
         return var1;
      } else {
         throw field_19521.create();
      }
   }

   private static int method_18534(class_9155 var0) {
      double var3 = var0.method_42198().method_6673().method_9824();
      var0.method_42196(new TranslationTextComponent("commands.worldborder.get", String.format(Locale.ROOT, "%.0f", var3)), false);
      return class_9299.method_42847(var3 + 0.5);
   }

   private static int method_18531(class_9155 var0, class_4895 var1) throws CommandSyntaxException {
      class_2098 var4 = var0.method_42198().method_6673();
      if (var4.method_9807() == (double)var1.field_24326 && var4.method_9835() == (double)var1.field_24329) {
         throw field_19523.create();
      } else {
         var4.method_9836((double)var1.field_24326, (double)var1.field_24329);
         var0.method_42196(
            new TranslationTextComponent(
               "commands.worldborder.center.success", String.format(Locale.ROOT, "%.2f", var1.field_24326), String.format("%.2f", var1.field_24329)
            ),
            true
         );
         return 0;
      }
   }

   private static int method_18537(class_9155 var0, double var1, long var3) throws CommandSyntaxException {
      class_2098 var7 = var0.method_42198().method_6673();
      double var8 = var7.method_9824();
      if (var8 != var1) {
         if (!(var1 < 1.0)) {
            if (!(var1 > 6.0E7)) {
               if (var3 <= 0L) {
                  var7.method_9822(var1);
                  var0.method_42196(new TranslationTextComponent("commands.worldborder.set.immediate", String.format(Locale.ROOT, "%.1f", var1)), true);
               } else {
                  var7.method_9823(var8, var1, var3);
                  if (!(var1 > var8)) {
                     var0.method_42196(
                        new TranslationTextComponent("commands.worldborder.set.shrink", String.format(Locale.ROOT, "%.1f", var1), Long.toString(var3 / 1000L)),
                        true
                     );
                  } else {
                     var0.method_42196(
                        new TranslationTextComponent("commands.worldborder.set.grow", String.format(Locale.ROOT, "%.1f", var1), Long.toString(var3 / 1000L)),
                        true
                     );
                  }
               }

               return (int)(var1 - var8);
            } else {
               throw field_19520.create();
            }
         } else {
            throw field_19522.create();
         }
      } else {
         throw field_19519.create();
      }
   }
}
