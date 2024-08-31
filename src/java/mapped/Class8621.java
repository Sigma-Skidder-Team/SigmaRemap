package mapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import net.minecraft.util.text.TranslationTextComponent;

public class Class8621 {
   private static final SimpleCommandExceptionType field38754 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.playsound.failed"));

   public static void method30876(CommandDispatcher<Class6619> var0) {
      RequiredArgumentBuilder var3 = Class6099.method18840("sound", Class8303.method29031()).suggests(Class9222.field42455);

      for (Class2266 var7 : Class2266.values()) {
         var3.then(method30877(var7));
      }

      var0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class6099.method18839("playsound").requires(var0x -> var0x.method20129(2))).then(var3));
   }

   private static LiteralArgumentBuilder<Class6619> method30877(Class2266 var0) {
      return (LiteralArgumentBuilder<Class6619>)Class6099.method18839(var0.method8995())
         .then(
            ((RequiredArgumentBuilder)Class6099.method18840("targets", Class8700.method31353())
                  .executes(
                     var1 -> method30878(
                           (Class6619)var1.getSource(),
                           Class8700.method31354(var1, "targets"),
                           Class8303.method29036(var1, "sound"),
                           var0,
                           ((Class6619)var1.getSource()).method20171(),
                           1.0F,
                           1.0F,
                           0.0F
                        )
                  ))
               .then(
                  ((RequiredArgumentBuilder)Class6099.method18840("pos", Class6851.method20857())
                        .executes(
                           var1 -> method30878(
                                 (Class6619)var1.getSource(),
                                 Class8700.method31354(var1, "targets"),
                                 Class8303.method29036(var1, "sound"),
                                 var0,
                                 Class6851.method20859(var1, "pos"),
                                 1.0F,
                                 1.0F,
                                 0.0F
                              )
                        ))
                     .then(
                        ((RequiredArgumentBuilder)Class6099.method18840("volume", FloatArgumentType.floatArg(0.0F))
                              .executes(
                                 var1 -> method30878(
                                       (Class6619)var1.getSource(),
                                       Class8700.method31354(var1, "targets"),
                                       Class8303.method29036(var1, "sound"),
                                       var0,
                                       Class6851.method20859(var1, "pos"),
                                       (Float)var1.getArgument("volume", Float.class),
                                       1.0F,
                                       0.0F
                                    )
                              ))
                           .then(
                              ((RequiredArgumentBuilder)Class6099.method18840("pitch", FloatArgumentType.floatArg(0.0F, 2.0F))
                                    .executes(
                                       var1 -> method30878(
                                             (Class6619)var1.getSource(),
                                             Class8700.method31354(var1, "targets"),
                                             Class8303.method29036(var1, "sound"),
                                             var0,
                                             Class6851.method20859(var1, "pos"),
                                             (Float)var1.getArgument("volume", Float.class),
                                             (Float)var1.getArgument("pitch", Float.class),
                                             0.0F
                                          )
                                    ))
                                 .then(
                                    Class6099.method18840("minVolume", FloatArgumentType.floatArg(0.0F, 1.0F))
                                       .executes(
                                          var1 -> method30878(
                                                (Class6619)var1.getSource(),
                                                Class8700.method31354(var1, "targets"),
                                                Class8303.method29036(var1, "sound"),
                                                var0,
                                                Class6851.method20859(var1, "pos"),
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

   private static int method30878(Class6619 var0, Collection<ServerPlayerEntity> var1, ResourceLocation var2, Class2266 var3, Vector3d var4, float var5, float var6, float var7) throws CommandSyntaxException {
      double var10 = Math.pow(!(var5 > 1.0F) ? 16.0 : (double)(var5 * 16.0F), 2.0);
      int var12 = 0;

      for (ServerPlayerEntity var14 : var1) {
         double var15 = var4.x - var14.getPosX();
         double var17 = var4.y - var14.getPosY();
         double var19 = var4.z - var14.getPosZ();
         double var21 = var15 * var15 + var17 * var17 + var19 * var19;
         Vector3d var23 = var4;
         float var24 = var5;
         if (var21 > var10) {
            if (var7 <= 0.0F) {
               continue;
            }

            double var25 = (double) MathHelper.method37766(var21);
            var23 = new Vector3d(var14.getPosX() + var15 / var25 * 2.0, var14.getPosY() + var17 / var25 * 2.0, var14.getPosZ() + var19 / var25 * 2.0);
            var24 = var7;
         }

         var14.field4855.sendPacket(new Class5475(var2, var3, var23, var24, var6));
         var12++;
      }

      if (var12 != 0) {
         if (var1.size() != 1) {
            var0.method20179(new TranslationTextComponent("commands.playsound.success.multiple", var2, var1.size()), true);
         } else {
            var0.method20179(new TranslationTextComponent("commands.playsound.success.single", var2, ((ServerPlayerEntity)var1.iterator().next()).getDisplayName()), true);
         }

         return var12;
      } else {
         throw field38754.create();
      }
   }
}
