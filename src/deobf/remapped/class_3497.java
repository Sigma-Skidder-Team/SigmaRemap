package remapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import net.minecraft.util.text.TranslationTextComponent;

public class class_3497 {
   private static final SimpleCommandExceptionType field_17158 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.particle.failed"));

   public static void method_16077(CommandDispatcher<class_9155> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)class_465.method_2231("particle").requires(var0x -> var0x.method_40314(2)))
            .then(
               ((RequiredArgumentBuilder)class_465.method_2236("name", class_3469.method_15951())
                     .executes(
                        var0x -> method_16079(
                              (class_9155)var0x.getSource(),
                              class_3469.method_15953(var0x, "name"),
                              ((class_9155)var0x.getSource()).method_42192(),
                              Vector3d.ZERO,
                              0.0F,
                              0,
                              false,
                              ((class_9155)var0x.getSource()).method_42177().method_1600().method_39951()
                           )
                     ))
                  .then(
                     ((RequiredArgumentBuilder)class_465.method_2236("pos", class_1029.method_4556())
                           .executes(
                              var0x -> method_16079(
                                    (class_9155)var0x.getSource(),
                                    class_3469.method_15953(var0x, "name"),
                                    class_1029.method_4555(var0x, "pos"),
                                    Vector3d.ZERO,
                                    0.0F,
                                    0,
                                    false,
                                    ((class_9155)var0x.getSource()).method_42177().method_1600().method_39951()
                                 )
                           ))
                        .then(
                           class_465.method_2236("delta", class_1029.method_4557(false))
                              .then(
                                 class_465.method_2236("speed", FloatArgumentType.floatArg(0.0F))
                                    .then(
                                       ((RequiredArgumentBuilder)((RequiredArgumentBuilder)class_465.method_2236("count", IntegerArgumentType.integer(0))
                                                .executes(
                                                   var0x -> method_16079(
                                                         (class_9155)var0x.getSource(),
                                                         class_3469.method_15953(var0x, "name"),
                                                         class_1029.method_4555(var0x, "pos"),
                                                         class_1029.method_4555(var0x, "delta"),
                                                         FloatArgumentType.getFloat(var0x, "speed"),
                                                         IntegerArgumentType.getInteger(var0x, "count"),
                                                         false,
                                                         ((class_9155)var0x.getSource()).method_42177().method_1600().method_39951()
                                                      )
                                                ))
                                             .then(
                                                ((LiteralArgumentBuilder)class_465.method_2231("force")
                                                      .executes(
                                                         var0x -> method_16079(
                                                               (class_9155)var0x.getSource(),
                                                               class_3469.method_15953(var0x, "name"),
                                                               class_1029.method_4555(var0x, "pos"),
                                                               class_1029.method_4555(var0x, "delta"),
                                                               FloatArgumentType.getFloat(var0x, "speed"),
                                                               IntegerArgumentType.getInteger(var0x, "count"),
                                                               true,
                                                               ((class_9155)var0x.getSource()).method_42177().method_1600().method_39951()
                                                            )
                                                      ))
                                                   .then(
                                                      class_465.method_2236("viewers", class_5601.method_25409())
                                                         .executes(
                                                            var0x -> method_16079(
                                                                  (class_9155)var0x.getSource(),
                                                                  class_3469.method_15953(var0x, "name"),
                                                                  class_1029.method_4555(var0x, "pos"),
                                                                  class_1029.method_4555(var0x, "delta"),
                                                                  FloatArgumentType.getFloat(var0x, "speed"),
                                                                  IntegerArgumentType.getInteger(var0x, "count"),
                                                                  true,
                                                                  class_5601.method_25412(var0x, "viewers")
                                                               )
                                                         )
                                                   )
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)class_465.method_2231("normal")
                                                   .executes(
                                                      var0x -> method_16079(
                                                            (class_9155)var0x.getSource(),
                                                            class_3469.method_15953(var0x, "name"),
                                                            class_1029.method_4555(var0x, "pos"),
                                                            class_1029.method_4555(var0x, "delta"),
                                                            FloatArgumentType.getFloat(var0x, "speed"),
                                                            IntegerArgumentType.getInteger(var0x, "count"),
                                                            false,
                                                            ((class_9155)var0x.getSource()).method_42177().method_1600().method_39951()
                                                         )
                                                   ))
                                                .then(
                                                   class_465.method_2236("viewers", class_5601.method_25409())
                                                      .executes(
                                                         var0x -> method_16079(
                                                               (class_9155)var0x.getSource(),
                                                               class_3469.method_15953(var0x, "name"),
                                                               class_1029.method_4555(var0x, "pos"),
                                                               class_1029.method_4555(var0x, "delta"),
                                                               FloatArgumentType.getFloat(var0x, "speed"),
                                                               IntegerArgumentType.getInteger(var0x, "count"),
                                                               false,
                                                               class_5601.method_25412(var0x, "viewers")
                                                            )
                                                      )
                                                )
                                          )
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int method_16079(
           class_9155 var0, class_5079 var1, Vector3d var2, Vector3d var3, float var4, int var5, boolean var6, Collection<class_9359> var7
   ) throws CommandSyntaxException {
      int var10 = 0;

      for (class_9359 var12 : var7) {
         if (var0.method_42198()
            .method_28958(
               var12, var1, var6, var2.field_7336, var2.field_7333, var2.field_7334, var5, var3.field_7336, var3.field_7333, var3.field_7334, (double)var4
            )) {
            var10++;
         }
      }

      if (var10 != 0) {
         var0.method_42196(new TranslationTextComponent("commands.particle.success", class_8669.field_44387.method_39797(var1.method_23357()).toString()), true);
         return var10;
      } else {
         throw field_17158.create();
      }
   }
}
