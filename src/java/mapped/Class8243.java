package mapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;

import net.minecraft.command.CommandSource;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector2f;
import net.minecraft.util.text.TranslationTextComponent;

public class Class8243 {
   private static final SimpleCommandExceptionType field35415 = new SimpleCommandExceptionType(
      new TranslationTextComponent("commands.worldborder.center.failed")
   );
   private static final SimpleCommandExceptionType field35416 = new SimpleCommandExceptionType(
      new TranslationTextComponent("commands.worldborder.set.failed.nochange")
   );
   private static final SimpleCommandExceptionType field35417 = new SimpleCommandExceptionType(
      new TranslationTextComponent("commands.worldborder.set.failed.small.")
   );
   private static final SimpleCommandExceptionType field35418 = new SimpleCommandExceptionType(
      new TranslationTextComponent("commands.worldborder.set.failed.big.")
   );
   private static final SimpleCommandExceptionType field35419 = new SimpleCommandExceptionType(
      new TranslationTextComponent("commands.worldborder.warning.time.failed")
   );
   private static final SimpleCommandExceptionType field35420 = new SimpleCommandExceptionType(
      new TranslationTextComponent("commands.worldborder.warning.distance.failed")
   );
   private static final SimpleCommandExceptionType field35421 = new SimpleCommandExceptionType(
      new TranslationTextComponent("commands.worldborder.damage.buffer.failed")
   );
   private static final SimpleCommandExceptionType field35422 = new SimpleCommandExceptionType(
      new TranslationTextComponent("commands.worldborder.damage.amount.failed")
   );

   public static void method28741(CommandDispatcher<CommandSource> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class6099.method18839(
                                 "worldborder"
                              )
                              .requires(var0x -> var0x.method20129(2)))
                           .then(
                              Class6099.method18839("add")
                                 .then(
                                    ((RequiredArgumentBuilder)Class6099.method18840("distance", FloatArgumentType.floatArg(-6.0E7F, 6.0E7F))
                                          .executes(
                                             var0x -> method28748(
                                                   (CommandSource)var0x.getSource(),
                                                   ((CommandSource)var0x.getSource()).method20172().getWorldBorder().method24537()
                                                      + (double)FloatArgumentType.getFloat(var0x, "distance"),
                                                   0L
                                                )
                                          ))
                                       .then(
                                          Class6099.method18840("time", IntegerArgumentType.integer(0))
                                             .executes(
                                                var0x -> method28748(
                                                      (CommandSource)var0x.getSource(),
                                                      ((CommandSource)var0x.getSource()).method20172().getWorldBorder().method24537()
                                                         + (double)FloatArgumentType.getFloat(var0x, "distance"),
                                                      ((CommandSource)var0x.getSource()).method20172().getWorldBorder().method24538()
                                                         + (long)IntegerArgumentType.getInteger(var0x, "time") * 1000L
                                                   )
                                             )
                                       )
                                 )
                           ))
                        .then(
                           Class6099.method18839("set")
                              .then(
                                 ((RequiredArgumentBuilder)Class6099.method18840("distance", FloatArgumentType.floatArg(-6.0E7F, 6.0E7F))
                                       .executes(var0x -> method28748((CommandSource)var0x.getSource(), (double)FloatArgumentType.getFloat(var0x, "distance"), 0L)))
                                    .then(
                                       Class6099.method18840("time", IntegerArgumentType.integer(0))
                                          .executes(
                                             var0x -> method28748(
                                                   (CommandSource)var0x.getSource(),
                                                   (double)FloatArgumentType.getFloat(var0x, "distance"),
                                                   (long)IntegerArgumentType.getInteger(var0x, "time") * 1000L
                                                )
                                          )
                                    )
                              )
                        ))
                     .then(
                        Class6099.method18839("center")
                           .then(
                              Class6099.method18840("pos", Class7347.method23292())
                                 .executes(var0x -> method28747((CommandSource)var0x.getSource(), Class7347.method23293(var0x, "pos")))
                           )
                     ))
                  .then(
                     ((LiteralArgumentBuilder)Class6099.method18839("damage")
                           .then(
                              Class6099.method18839("amount")
                                 .then(
                                    Class6099.method18840("damagePerBlock", FloatArgumentType.floatArg(0.0F))
                                       .executes(var0x -> method28743((CommandSource)var0x.getSource(), FloatArgumentType.getFloat(var0x, "damagePerBlock")))
                                 )
                           ))
                        .then(
                           Class6099.method18839("buffer")
                              .then(
                                 Class6099.method18840("distance", FloatArgumentType.floatArg(0.0F))
                                    .executes(var0x -> method28742((CommandSource)var0x.getSource(), FloatArgumentType.getFloat(var0x, "distance")))
                              )
                        )
                  ))
               .then(Class6099.method18839("get").executes(var0x -> method28746((CommandSource)var0x.getSource()))))
            .then(
               ((LiteralArgumentBuilder)Class6099.method18839("warning")
                     .then(
                        Class6099.method18839("distance")
                           .then(
                              Class6099.method18840("distance", IntegerArgumentType.integer(0))
                                 .executes(var0x -> method28745((CommandSource)var0x.getSource(), IntegerArgumentType.getInteger(var0x, "distance")))
                           )
                     ))
                  .then(
                     Class6099.method18839("time")
                        .then(
                           Class6099.method18840("time", IntegerArgumentType.integer(0))
                              .executes(var0x -> method28744((CommandSource)var0x.getSource(), IntegerArgumentType.getInteger(var0x, "time")))
                        )
                  )
            )
      );
   }

   private static int method28742(CommandSource var0, float var1) throws CommandSyntaxException {
      WorldBorder var4 = var0.method20172().getWorldBorder();
      if (var4.method24546() != (double)var1) {
         var4.method24547((double)var1);
         var0.method20179(new TranslationTextComponent("commands.worldborder.damage.buffer.success", String.format(Locale.ROOT, "%.2f", var1)), true);
         return (int)var1;
      } else {
         throw field35421.create();
      }
   }

   private static int method28743(CommandSource var0, float var1) throws CommandSyntaxException {
      WorldBorder var4 = var0.method20172().getWorldBorder();
      if (var4.method24548() != (double)var1) {
         var4.method24549((double)var1);
         var0.method20179(new TranslationTextComponent("commands.worldborder.damage.amount.success", String.format(Locale.ROOT, "%.2f", var1)), true);
         return (int)var1;
      } else {
         throw field35422.create();
      }
   }

   private static int method28744(CommandSource var0, int var1) throws CommandSyntaxException {
      WorldBorder var4 = var0.method20172().getWorldBorder();
      if (var4.method24551() != var1) {
         var4.method24552(var1);
         var0.method20179(new TranslationTextComponent("commands.worldborder.warning.time.success", var1), true);
         return var1;
      } else {
         throw field35419.create();
      }
   }

   private static int method28745(CommandSource var0, int var1) throws CommandSyntaxException {
      WorldBorder var4 = var0.method20172().getWorldBorder();
      if (var4.method24553() != var1) {
         var4.method24554(var1);
         var0.method20179(new TranslationTextComponent("commands.worldborder.warning.distance.success", var1), true);
         return var1;
      } else {
         throw field35420.create();
      }
   }

   private static int method28746(CommandSource var0) {
      double var3 = var0.method20172().getWorldBorder().method24537();
      var0.method20179(new TranslationTextComponent("commands.worldborder.get", String.format(Locale.ROOT, "%.0f", var3)), false);
      return MathHelper.floor(var3 + 0.5);
   }

   private static int method28747(CommandSource var0, Vector2f var1) throws CommandSyntaxException {
      WorldBorder var4 = var0.method20172().getWorldBorder();
      if (var4.getCenterX() == (double)var1.x && var4.getCenterZ() == (double)var1.y) {
         throw field35415.create();
      } else {
         var4.method24536((double)var1.x, (double)var1.y);
         var0.method20179(
            new TranslationTextComponent(
               "commands.worldborder.center.success", String.format(Locale.ROOT, "%.2f", var1.x), String.format("%.2f", var1.y)
            ),
            true
         );
         return 0;
      }
   }

   private static int method28748(CommandSource var0, double var1, long var3) throws CommandSyntaxException {
      WorldBorder var7 = var0.method20172().getWorldBorder();
      double var8 = var7.method24537();
      if (var8 != var1) {
         if (!(var1 < 1.0)) {
            if (!(var1 > 6.0E7)) {
               if (var3 <= 0L) {
                  var7.method24540(var1);
                  var0.method20179(new TranslationTextComponent("commands.worldborder.set.immediate", String.format(Locale.ROOT, "%.1f", var1)), true);
               } else {
                  var7.method24541(var8, var1, var3);
                  if (!(var1 > var8)) {
                     var0.method20179(
                        new TranslationTextComponent("commands.worldborder.set.shrink", String.format(Locale.ROOT, "%.1f", var1), Long.toString(var3 / 1000L)),
                        true
                     );
                  } else {
                     var0.method20179(
                        new TranslationTextComponent("commands.worldborder.set.grow", String.format(Locale.ROOT, "%.1f", var1), Long.toString(var3 / 1000L)),
                        true
                     );
                  }
               }

               return (int)(var1 - var8);
            } else {
               throw field35418.create();
            }
         } else {
            throw field35417.create();
         }
      } else {
         throw field35416.create();
      }
   }
}
