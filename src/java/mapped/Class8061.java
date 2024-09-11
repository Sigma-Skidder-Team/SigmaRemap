package mapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

import net.minecraft.particles.IParticleData;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.text.TranslationTextComponent;

public class Class8061 {
   private static final SimpleCommandExceptionType field34601 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.particle.failed"));

   public static void method27671(CommandDispatcher<Class6619> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)Class6099.method18839("particle").requires(var0x -> var0x.method20129(2)))
            .then(
               ((RequiredArgumentBuilder)Class6099.method18840("name", Class8050.method27648())
                     .executes(
                        var0x -> method27672(
                              (Class6619)var0x.getSource(),
                              Class8050.method27649(var0x, "name"),
                              ((Class6619)var0x.getSource()).method20171(),
                              Vector3d.ZERO,
                              0.0F,
                              0,
                              false,
                              ((Class6619)var0x.getSource()).method20177().getPlayerList().method19488()
                           )
                     ))
                  .then(
                     ((RequiredArgumentBuilder)Class6099.method18840("pos", Class6851.method20857())
                           .executes(
                              var0x -> method27672(
                                    (Class6619)var0x.getSource(),
                                    Class8050.method27649(var0x, "name"),
                                    Class6851.method20859(var0x, "pos"),
                                    Vector3d.ZERO,
                                    0.0F,
                                    0,
                                    false,
                                    ((Class6619)var0x.getSource()).method20177().getPlayerList().method19488()
                                 )
                           ))
                        .then(
                           Class6099.method18840("delta", Class6851.method20858(false))
                              .then(
                                 Class6099.method18840("speed", FloatArgumentType.floatArg(0.0F))
                                    .then(
                                       ((RequiredArgumentBuilder)((RequiredArgumentBuilder)Class6099.method18840("count", IntegerArgumentType.integer(0))
                                                .executes(
                                                   var0x -> method27672(
                                                         (Class6619)var0x.getSource(),
                                                         Class8050.method27649(var0x, "name"),
                                                         Class6851.method20859(var0x, "pos"),
                                                         Class6851.method20859(var0x, "delta"),
                                                         FloatArgumentType.getFloat(var0x, "speed"),
                                                         IntegerArgumentType.getInteger(var0x, "count"),
                                                         false,
                                                         ((Class6619)var0x.getSource()).method20177().getPlayerList().method19488()
                                                      )
                                                ))
                                             .then(
                                                ((LiteralArgumentBuilder)Class6099.method18839("force")
                                                      .executes(
                                                         var0x -> method27672(
                                                               (Class6619)var0x.getSource(),
                                                               Class8050.method27649(var0x, "name"),
                                                               Class6851.method20859(var0x, "pos"),
                                                               Class6851.method20859(var0x, "delta"),
                                                               FloatArgumentType.getFloat(var0x, "speed"),
                                                               IntegerArgumentType.getInteger(var0x, "count"),
                                                               true,
                                                               ((Class6619)var0x.getSource()).method20177().getPlayerList().method19488()
                                                            )
                                                      ))
                                                   .then(
                                                      Class6099.method18840("viewers", Class8700.method31353())
                                                         .executes(
                                                            var0x -> method27672(
                                                                  (Class6619)var0x.getSource(),
                                                                  Class8050.method27649(var0x, "name"),
                                                                  Class6851.method20859(var0x, "pos"),
                                                                  Class6851.method20859(var0x, "delta"),
                                                                  FloatArgumentType.getFloat(var0x, "speed"),
                                                                  IntegerArgumentType.getInteger(var0x, "count"),
                                                                  true,
                                                                  Class8700.method31354(var0x, "viewers")
                                                               )
                                                         )
                                                   )
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)Class6099.method18839("normal")
                                                   .executes(
                                                      var0x -> method27672(
                                                            (Class6619)var0x.getSource(),
                                                            Class8050.method27649(var0x, "name"),
                                                            Class6851.method20859(var0x, "pos"),
                                                            Class6851.method20859(var0x, "delta"),
                                                            FloatArgumentType.getFloat(var0x, "speed"),
                                                            IntegerArgumentType.getInteger(var0x, "count"),
                                                            false,
                                                            ((Class6619)var0x.getSource()).method20177().getPlayerList().method19488()
                                                         )
                                                   ))
                                                .then(
                                                   Class6099.method18840("viewers", Class8700.method31353())
                                                      .executes(
                                                         var0x -> method27672(
                                                               (Class6619)var0x.getSource(),
                                                               Class8050.method27649(var0x, "name"),
                                                               Class6851.method20859(var0x, "pos"),
                                                               Class6851.method20859(var0x, "delta"),
                                                               FloatArgumentType.getFloat(var0x, "speed"),
                                                               IntegerArgumentType.getInteger(var0x, "count"),
                                                               false,
                                                               Class8700.method31354(var0x, "viewers")
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

   private static int method27672(Class6619 var0, IParticleData var1, Vector3d var2, Vector3d var3, float var4, int var5, boolean var6, Collection<ServerPlayerEntity> var7) throws CommandSyntaxException {
      int var10 = 0;

      for (ServerPlayerEntity var12 : var7) {
         if (var0.method20172()
            .method6940(
               var12, var1, var6, var2.x, var2.y, var2.z, var5, var3.x, var3.y, var3.z, (double)var4
            )) {
            var10++;
         }
      }

      if (var10 != 0) {
         var0.method20179(new TranslationTextComponent("commands.particle.success", Registry.PARTICLE_TYPE.getKey(var1.getType()).toString()), true);
         return var10;
      } else {
         throw field34601.create();
      }
   }
}
