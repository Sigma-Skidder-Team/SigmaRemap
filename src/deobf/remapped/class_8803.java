package remapped;

import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import net.minecraft.util.text.TranslationTextComponent;

public class class_8803 {
   private static final SimpleCommandExceptionType field_45033 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.effect.give.failed"));
   private static final SimpleCommandExceptionType field_45031 = new SimpleCommandExceptionType(
      new TranslationTextComponent("commands.effect.clear.everything.failed")
   );
   private static final SimpleCommandExceptionType field_45034 = new SimpleCommandExceptionType(
      new TranslationTextComponent("commands.effect.clear.specific.failed")
   );

   public static void method_40470(CommandDispatcher<class_9155> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class_465.method_2231("effect").requires(var0x -> var0x.method_40314(2)))
               .then(
                  ((LiteralArgumentBuilder)class_465.method_2231("clear")
                        .executes(var0x -> method_40471((class_9155)var0x.getSource(), ImmutableList.of(((class_9155)var0x.getSource()).method_42178()))))
                     .then(
                        ((RequiredArgumentBuilder)class_465.method_2236("targets", class_5601.method_25407())
                              .executes(var0x -> method_40471((class_9155)var0x.getSource(), class_5601.method_25410(var0x, "targets"))))
                           .then(
                              class_465.method_2236("effect", class_8493.method_39144())
                                 .executes(
                                    var0x -> method_40467(
                                          (class_9155)var0x.getSource(), class_5601.method_25410(var0x, "targets"), class_8493.method_39145(var0x, "effect")
                                       )
                                 )
                           )
                     )
               ))
            .then(
               class_465.method_2231("give")
                  .then(
                     class_465.method_2236("targets", class_5601.method_25407())
                        .then(
                           ((RequiredArgumentBuilder)class_465.method_2236("effect", class_8493.method_39144())
                                 .executes(
                                    var0x -> method_40468(
                                          (class_9155)var0x.getSource(),
                                          class_5601.method_25410(var0x, "targets"),
                                          class_8493.method_39145(var0x, "effect"),
                                          (Integer)null,
                                          0,
                                          true
                                       )
                                 ))
                              .then(
                                 ((RequiredArgumentBuilder)class_465.method_2236("seconds", IntegerArgumentType.integer(1, 1000000))
                                       .executes(
                                          var0x -> method_40468(
                                                (class_9155)var0x.getSource(),
                                                class_5601.method_25410(var0x, "targets"),
                                                class_8493.method_39145(var0x, "effect"),
                                                IntegerArgumentType.getInteger(var0x, "seconds"),
                                                0,
                                                true
                                             )
                                       ))
                                    .then(
                                       ((RequiredArgumentBuilder)class_465.method_2236("amplifier", IntegerArgumentType.integer(0, 255))
                                             .executes(
                                                var0x -> method_40468(
                                                      (class_9155)var0x.getSource(),
                                                      class_5601.method_25410(var0x, "targets"),
                                                      class_8493.method_39145(var0x, "effect"),
                                                      IntegerArgumentType.getInteger(var0x, "seconds"),
                                                      IntegerArgumentType.getInteger(var0x, "amplifier"),
                                                      true
                                                   )
                                             ))
                                          .then(
                                             class_465.method_2236("hideParticles", BoolArgumentType.bool())
                                                .executes(
                                                   var0x -> method_40468(
                                                         (class_9155)var0x.getSource(),
                                                         class_5601.method_25410(var0x, "targets"),
                                                         class_8493.method_39145(var0x, "effect"),
                                                         IntegerArgumentType.getInteger(var0x, "seconds"),
                                                         IntegerArgumentType.getInteger(var0x, "amplifier"),
                                                         !BoolArgumentType.getBool(var0x, "hideParticles")
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

   private static int method_40468(class_9155 var0, Collection<? extends class_8145> var1, class_1425 var2, Integer var3, int var4, boolean var5) throws CommandSyntaxException {
      int var8 = 0;
      int var9;
      if (var3 == null) {
         if (!var2.method_6535()) {
            var9 = 600;
         } else {
            var9 = 1;
         }
      } else if (!var2.method_6535()) {
         var9 = var3 * 20;
      } else {
         var9 = var3;
      }

      for (class_8145 var11 : var1) {
         if (var11 instanceof class_5834) {
            class_2250 var12 = new class_2250(var2, var9, var4, false, var5);
            if (((class_5834)var11).method_26558(var12)) {
               var8++;
            }
         }
      }

      if (var8 != 0) {
         if (var1.size() != 1) {
            var0.method_42196(new TranslationTextComponent("commands.effect.give.success.multiple", var2.method_6541(), var1.size(), var9 / 20), true);
         } else {
            var0.method_42196(
               new TranslationTextComponent(
                  "commands.effect.give.success.single", var2.method_6541(), ((class_8145)var1.iterator().next()).method_19839(), var9 / 20
               ),
               true
            );
         }

         return var8;
      } else {
         throw field_45033.create();
      }
   }

   private static int method_40471(class_9155 var0, Collection<? extends class_8145> var1) throws CommandSyntaxException {
      int var4 = 0;

      for (class_8145 var6 : var1) {
         if (var6 instanceof class_5834 && ((class_5834)var6).method_26523()) {
            var4++;
         }
      }

      if (var4 != 0) {
         if (var1.size() != 1) {
            var0.method_42196(new TranslationTextComponent("commands.effect.clear.everything.success.multiple", var1.size()), true);
         } else {
            var0.method_42196(
               new TranslationTextComponent("commands.effect.clear.everything.success.single", ((class_8145)var1.iterator().next()).method_19839()), true
            );
         }

         return var4;
      } else {
         throw field_45031.create();
      }
   }

   private static int method_40467(class_9155 var0, Collection<? extends class_8145> var1, class_1425 var2) throws CommandSyntaxException {
      int var5 = 0;

      for (class_8145 var7 : var1) {
         if (var7 instanceof class_5834 && ((class_5834)var7).method_26607(var2)) {
            var5++;
         }
      }

      if (var5 != 0) {
         if (var1.size() != 1) {
            var0.method_42196(new TranslationTextComponent("commands.effect.clear.specific.success.multiple", var2.method_6541(), var1.size()), true);
         } else {
            var0.method_42196(
               new TranslationTextComponent(
                  "commands.effect.clear.specific.success.single", var2.method_6541(), ((class_8145)var1.iterator().next()).method_19839()
               ),
               true
            );
         }

         return var5;
      } else {
         throw field_45034.create();
      }
   }
}
