package mapped;

import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

import net.minecraft.command.CommandSource;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.util.text.TranslationTextComponent;

public class Class9548 {
   private static final SimpleCommandExceptionType field44458 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.effect.give.failed"));
   private static final SimpleCommandExceptionType field44459 = new SimpleCommandExceptionType(
      new TranslationTextComponent("commands.effect.clear.everything.failed")
   );
   private static final SimpleCommandExceptionType field44460 = new SimpleCommandExceptionType(
      new TranslationTextComponent("commands.effect.clear.specific.failed")
   );

   public static void method36984(CommandDispatcher<CommandSource> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class6099.method18839("effect").requires(var0x -> var0x.method20129(2)))
               .then(
                  ((LiteralArgumentBuilder)Class6099.method18839("clear")
                        .executes(var0x -> method36986((CommandSource)var0x.getSource(), ImmutableList.of(((CommandSource)var0x.getSource()).method20174()))))
                     .then(
                        ((RequiredArgumentBuilder)Class6099.method18840("targets", Class8700.method31347())
                              .executes(var0x -> method36986((CommandSource)var0x.getSource(), Class8700.method31348(var0x, "targets"))))
                           .then(
                              Class6099.method18840("effect", Class9468.method36510())
                                 .executes(
                                    var0x -> method36987(
                                          (CommandSource)var0x.getSource(), Class8700.method31348(var0x, "targets"), Class9468.method36511(var0x, "effect")
                                       )
                                 )
                           )
                     )
               ))
            .then(
               Class6099.method18839("give")
                  .then(
                     Class6099.method18840("targets", Class8700.method31347())
                        .then(
                           ((RequiredArgumentBuilder)Class6099.method18840("effect", Class9468.method36510())
                                 .executes(
                                    var0x -> method36985(
                                          (CommandSource)var0x.getSource(),
                                          Class8700.method31348(var0x, "targets"),
                                          Class9468.method36511(var0x, "effect"),
                                          (Integer)null,
                                          0,
                                          true
                                       )
                                 ))
                              .then(
                                 ((RequiredArgumentBuilder)Class6099.method18840("seconds", IntegerArgumentType.integer(1, 1000000))
                                       .executes(
                                          var0x -> method36985(
                                                (CommandSource)var0x.getSource(),
                                                Class8700.method31348(var0x, "targets"),
                                                Class9468.method36511(var0x, "effect"),
                                                IntegerArgumentType.getInteger(var0x, "seconds"),
                                                0,
                                                true
                                             )
                                       ))
                                    .then(
                                       ((RequiredArgumentBuilder)Class6099.method18840("amplifier", IntegerArgumentType.integer(0, 255))
                                             .executes(
                                                var0x -> method36985(
                                                      (CommandSource)var0x.getSource(),
                                                      Class8700.method31348(var0x, "targets"),
                                                      Class9468.method36511(var0x, "effect"),
                                                      IntegerArgumentType.getInteger(var0x, "seconds"),
                                                      IntegerArgumentType.getInteger(var0x, "amplifier"),
                                                      true
                                                   )
                                             ))
                                          .then(
                                             Class6099.method18840("hideParticles", BoolArgumentType.bool())
                                                .executes(
                                                   var0x -> method36985(
                                                         (CommandSource)var0x.getSource(),
                                                         Class8700.method31348(var0x, "targets"),
                                                         Class9468.method36511(var0x, "effect"),
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

   private static int method36985(CommandSource var0, Collection<? extends Entity> var1, Effect var2, Integer var3, int var4, boolean var5) throws CommandSyntaxException {
      int var8 = 0;
      int var9;
      if (var3 == null) {
         if (!var2.isInstant()) {
            var9 = 600;
         } else {
            var9 = 1;
         }
      } else if (!var2.isInstant()) {
         var9 = var3 * 20;
      } else {
         var9 = var3;
      }

      for (Entity var11 : var1) {
         if (var11 instanceof LivingEntity) {
            EffectInstance var12 = new EffectInstance(var2, var9, var4, false, var5);
            if (((LivingEntity)var11).addPotionEffect(var12)) {
               var8++;
            }
         }
      }

      if (var8 != 0) {
         if (var1.size() != 1) {
            var0.method20179(new TranslationTextComponent("commands.effect.give.success.multiple", var2.getDisplayName(), var1.size(), var9 / 20), true);
         } else {
            var0.method20179(
               new TranslationTextComponent(
                  "commands.effect.give.success.single", var2.getDisplayName(), ((Entity)var1.iterator().next()).getDisplayName(), var9 / 20
               ),
               true
            );
         }

         return var8;
      } else {
         throw field44458.create();
      }
   }

   private static int method36986(CommandSource var0, Collection<? extends Entity> var1) throws CommandSyntaxException {
      int var4 = 0;

      for (Entity var6 : var1) {
         if (var6 instanceof LivingEntity && ((LivingEntity)var6).clearActivePotions()) {
            var4++;
         }
      }

      if (var4 != 0) {
         if (var1.size() != 1) {
            var0.method20179(new TranslationTextComponent("commands.effect.clear.everything.success.multiple", var1.size()), true);
         } else {
            var0.method20179(
               new TranslationTextComponent("commands.effect.clear.everything.success.single", ((Entity)var1.iterator().next()).getDisplayName()), true
            );
         }

         return var4;
      } else {
         throw field44459.create();
      }
   }

   private static int method36987(CommandSource var0, Collection<? extends Entity> var1, Effect var2) throws CommandSyntaxException {
      int var5 = 0;

      for (Entity var7 : var1) {
         if (var7 instanceof LivingEntity && ((LivingEntity)var7).removeEffects(var2)) {
            var5++;
         }
      }

      if (var5 != 0) {
         if (var1.size() != 1) {
            var0.method20179(new TranslationTextComponent("commands.effect.clear.specific.success.multiple", var2.getDisplayName(), var1.size()), true);
         } else {
            var0.method20179(
               new TranslationTextComponent(
                  "commands.effect.clear.specific.success.single", var2.getDisplayName(), ((Entity)var1.iterator().next()).getDisplayName()
               ),
               true
            );
         }

         return var5;
      } else {
         throw field44460.create();
      }
   }
}
