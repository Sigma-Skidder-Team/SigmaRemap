package remapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import net.minecraft.util.text.TranslationTextComponent;

public class class_5268 {
   private static final SimpleCommandExceptionType field_26927 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.playsound.failed"));

   public static void method_24043(CommandDispatcher<class_9155> var0) {
      RequiredArgumentBuilder var3 = class_465.method_2236("sound", class_4195.method_19515()).suggests(class_7510.field_38351);

      for (class_562 var7 : class_562.values()) {
         var3.then(method_24040(var7));
      }

      var0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)class_465.method_2231("playsound").requires(var0x -> var0x.method_40314(2))).then(var3));
   }

   private static LiteralArgumentBuilder<class_9155> method_24040(class_562 var0) {
      return (LiteralArgumentBuilder<class_9155>)class_465.method_2231(var0.method_2681())
         .then(
            ((RequiredArgumentBuilder)class_465.method_2236("targets", class_5601.method_25409())
                  .executes(
                     var1 -> method_24041(
                           (class_9155)var1.getSource(),
                           class_5601.method_25412(var1, "targets"),
                           class_4195.method_19511(var1, "sound"),
                           var0,
                           ((class_9155)var1.getSource()).method_42192(),
                           1.0F,
                           1.0F,
                           0.0F
                        )
                  ))
               .then(
                  ((RequiredArgumentBuilder)class_465.method_2236("pos", class_1029.method_4556())
                        .executes(
                           var1 -> method_24041(
                                 (class_9155)var1.getSource(),
                                 class_5601.method_25412(var1, "targets"),
                                 class_4195.method_19511(var1, "sound"),
                                 var0,
                                 class_1029.method_4555(var1, "pos"),
                                 1.0F,
                                 1.0F,
                                 0.0F
                              )
                        ))
                     .then(
                        ((RequiredArgumentBuilder)class_465.method_2236("volume", FloatArgumentType.floatArg(0.0F))
                              .executes(
                                 var1 -> method_24041(
                                       (class_9155)var1.getSource(),
                                       class_5601.method_25412(var1, "targets"),
                                       class_4195.method_19511(var1, "sound"),
                                       var0,
                                       class_1029.method_4555(var1, "pos"),
                                       (Float)var1.getArgument("volume", Float.class),
                                       1.0F,
                                       0.0F
                                    )
                              ))
                           .then(
                              ((RequiredArgumentBuilder)class_465.method_2236("pitch", FloatArgumentType.floatArg(0.0F, 2.0F))
                                    .executes(
                                       var1 -> method_24041(
                                             (class_9155)var1.getSource(),
                                             class_5601.method_25412(var1, "targets"),
                                             class_4195.method_19511(var1, "sound"),
                                             var0,
                                             class_1029.method_4555(var1, "pos"),
                                             (Float)var1.getArgument("volume", Float.class),
                                             (Float)var1.getArgument("pitch", Float.class),
                                             0.0F
                                          )
                                    ))
                                 .then(
                                    class_465.method_2236("minVolume", FloatArgumentType.floatArg(0.0F, 1.0F))
                                       .executes(
                                          var1 -> method_24041(
                                                (class_9155)var1.getSource(),
                                                class_5601.method_25412(var1, "targets"),
                                                class_4195.method_19511(var1, "sound"),
                                                var0,
                                                class_1029.method_4555(var1, "pos"),
                                                (Float)var1.getArgument("volume", Float.class),
                                                (Float)var1.getArgument("pitch", Float.class),
                                                (Float)var1.getArgument("minVolume", Float.class)
                                             )
                                       )
                                 )
                           )
                     )
               )
         );
   }

   private static int method_24041(
           class_9155 var0, Collection<class_9359> var1, Identifier var2, class_562 var3, Vector3d var4, float var5, float var6, float var7
   ) throws CommandSyntaxException {
      double var10 = Math.pow(!(var5 > 1.0F) ? 16.0 : (double)(var5 * 16.0F), 2.0);
      int var12 = 0;

      for (class_9359 var14 : var1) {
         double var15 = var4.field_7336 - var14.getPosX();
         double var17 = var4.field_7333 - var14.method_37309();
         double var19 = var4.field_7334 - var14.getPosZ();
         double var21 = var15 * var15 + var17 * var17 + var19 * var19;
         Vector3d var23 = var4;
         float var24 = var5;
         if (var21 > var10) {
            if (var7 <= 0.0F) {
               continue;
            }

            double var25 = (double) MathHelper.sqrt(var21);
            var23 = new Vector3d(
               var14.getPosX() + var15 / var25 * 2.0, var14.method_37309() + var17 / var25 * 2.0, var14.getPosZ() + var19 / var25 * 2.0
            );
            var24 = var7;
         }

         var14.field_47794.method_4156(new class_8283(var2, var3, var23, var24, var6));
         var12++;
      }

      if (var12 != 0) {
         if (var1.size() != 1) {
            var0.method_42196(new TranslationTextComponent("commands.playsound.success.multiple", var2, var1.size()), true);
         } else {
            var0.method_42196(
               new TranslationTextComponent("commands.playsound.success.single", var2, ((class_9359)var1.iterator().next()).method_19839()), true
            );
         }

         return var12;
      } else {
         throw field_26927.create();
      }
   }
}
