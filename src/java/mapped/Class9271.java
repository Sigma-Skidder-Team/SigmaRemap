package mapped;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic4CommandExceptionType;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Random;

import net.minecraft.command.CommandSource;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.scoreboard.Team;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector2f;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.server.ServerWorld;

public class Class9271 {
   private static final Dynamic4CommandExceptionType field42644 = new Dynamic4CommandExceptionType(
      (var0, var1, var2, var3) -> new TranslationTextComponent("commands.spreadplayers.failed.teams", var0, var1, var2, var3)
   );
   private static final Dynamic4CommandExceptionType field42645 = new Dynamic4CommandExceptionType(
      (var0, var1, var2, var3) -> new TranslationTextComponent("commands.spreadplayers.failed.entities", var0, var1, var2, var3)
   );

   public static void method34922(CommandDispatcher<CommandSource> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)Class6099.method18839("spreadplayers").requires(var0x -> var0x.method20129(2)))
            .then(
               Class6099.method18840("center", Class7347.method23292())
                  .then(
                     Class6099.method18840("spreadDistance", FloatArgumentType.floatArg(0.0F))
                        .then(
                           ((RequiredArgumentBuilder)Class6099.method18840("maxRange", FloatArgumentType.floatArg(1.0F))
                                 .then(
                                    Class6099.method18840("respectTeams", BoolArgumentType.bool())
                                       .then(
                                          Class6099.method18840("targets", Class8700.method31347())
                                             .executes(
                                                var0x -> method34923(
                                                      (CommandSource)var0x.getSource(),
                                                      Class7347.method23293(var0x, "center"),
                                                      FloatArgumentType.getFloat(var0x, "spreadDistance"),
                                                      FloatArgumentType.getFloat(var0x, "maxRange"),
                                                      256,
                                                      BoolArgumentType.getBool(var0x, "respectTeams"),
                                                      Class8700.method31348(var0x, "targets")
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 Class6099.method18839("under")
                                    .then(
                                       Class6099.method18840("maxHeight", IntegerArgumentType.integer(0))
                                          .then(
                                             Class6099.method18840("respectTeams", BoolArgumentType.bool())
                                                .then(
                                                   Class6099.method18840("targets", Class8700.method31347())
                                                      .executes(
                                                         var0x -> method34923(
                                                               (CommandSource)var0x.getSource(),
                                                               Class7347.method23293(var0x, "center"),
                                                               FloatArgumentType.getFloat(var0x, "spreadDistance"),
                                                               FloatArgumentType.getFloat(var0x, "maxRange"),
                                                               IntegerArgumentType.getInteger(var0x, "maxHeight"),
                                                               BoolArgumentType.getBool(var0x, "respectTeams"),
                                                               Class8700.method31348(var0x, "targets")
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

   private static int method34923(CommandSource var0, Vector2f var1, float var2, float var3, int var4, boolean var5, Collection<? extends Entity> var6) throws CommandSyntaxException {
      Random var9 = new Random();
      double var10 = (double)(var1.field37220 - var3);
      double var12 = (double)(var1.field37221 - var3);
      double var14 = (double)(var1.field37220 + var3);
      double var16 = (double)(var1.field37221 + var3);
      Class9169[] var18 = method34927(var9, !var5 ? var6.size() : method34924(var6), var10, var12, var14, var16);
      method34925(var1, (double)var2, var0.method20172(), var9, var10, var12, var14, var16, var4, var18, var5);
      double var19 = method34926(var6, var0.method20172(), var18, var4, var5);
      var0.method20179(
         new TranslationTextComponent(
            "commands.spreadplayers.success." + (!var5 ? "entities" : "teams"),
            var18.length,
            var1.field37220,
            var1.field37221,
            String.format(Locale.ROOT, "%.2f", var19)
         ),
         true
      );
      return var18.length;
   }

   private static int method34924(Collection<? extends Entity> var0) {
      HashSet var3 = Sets.newHashSet();

      for (Entity var5 : var0) {
         if (!(var5 instanceof PlayerEntity)) {
            var3.add((Team)null);
         } else {
            var3.add(var5.getTeam());
         }
      }

      return var3.size();
   }

   private static void method34925(
      Vector2f var0,
      double var1,
      ServerWorld var3,
      Random var4,
      double var5,
      double var7,
      double var9,
      double var11,
      int var13,
      Class9169[] var14,
      boolean var15
   ) throws CommandSyntaxException {
      boolean var18 = true;
      double var19 = Float.MAX_VALUE;

      int var21;
      for (var21 = 0; var21 < 10000 && var18; var21++) {
         var18 = false;
         var19 = Float.MAX_VALUE;

         for (int var22 = 0; var22 < var14.length; var22++) {
            Class9169 var23 = var14[var22];
            int var24 = 0;
            Class9169 var25 = new Class9169();

            for (int var26 = 0; var26 < var14.length; var26++) {
               if (var22 != var26) {
                  Class9169 var27 = var14[var26];
                  double var28 = var23.method34245(var27);
                  var19 = Math.min(var28, var19);
                  if (var28 < var1) {
                     var24++;
                     Class9169.method34253(var25, Class9169.method34254(var25) + (Class9169.method34254(var27) - Class9169.method34254(var23)));
                     Class9169.method34255(var25, Class9169.method34256(var25) + (Class9169.method34256(var27) - Class9169.method34256(var23)));
                  }
               }
            }

            if (var24 > 0) {
               Class9169.method34253(var25, Class9169.method34254(var25) / (double)var24);
               Class9169.method34255(var25, Class9169.method34256(var25) / (double)var24);
               double var30 = (double)var25.method34247();
               if (!(var30 > 0.0)) {
                  var23.method34252(var4, var5, var7, var9, var11);
               } else {
                  var25.method34246();
                  var23.method34248(var25);
               }

               var18 = true;
            }

            if (var23.method34249(var5, var7, var9, var11)) {
               var18 = true;
            }
         }

         if (!var18) {
            for (Class9169 var35 : var14) {
               if (!var35.method34251(var3, var13)) {
                  var35.method34252(var4, var5, var7, var9, var11);
                  var18 = true;
               }
            }
         }
      }

      if (var19 == Float.MAX_VALUE) {
         var19 = 0.0;
      }

      if (var21 >= 10000) {
         if (!var15) {
            throw field42645.create(var14.length, var0.field37220, var0.field37221, String.format(Locale.ROOT, "%.2f", var19));
         } else {
            throw field42644.create(var14.length, var0.field37220, var0.field37221, String.format(Locale.ROOT, "%.2f", var19));
         }
      }
   }

   private static double method34926(Collection<? extends Entity> var0, ServerWorld var1, Class9169[] var2, int var3, boolean var4) {
      double var7 = 0.0;
      int var9 = 0;
      HashMap var10 = Maps.newHashMap();

      for (Entity var12 : var0) {
         Class9169 var13;
         if (!var4) {
            var13 = var2[var9++];
         } else {
            Team var14 = !(var12 instanceof PlayerEntity) ? null : var12.getTeam();
            if (!var10.containsKey(var14)) {
               var10.put(var14, var2[var9++]);
            }

            var13 = (Class9169)var10.get(var14);
         }

         var12.teleportKeepLoaded(
            (double) MathHelper.floor(Class9169.method34254(var13)) + 0.5,
            (double)var13.method34250(var1, var3),
            (double) MathHelper.floor(Class9169.method34256(var13)) + 0.5
         );
         double var15 = Double.MAX_VALUE;

         for (Class9169 var20 : var2) {
            if (var13 != var20) {
               double var21 = var13.method34245(var20);
               var15 = Math.min(var21, var15);
            }
         }

         var7 += var15;
      }

      return var0.size() >= 2 ? var7 / (double)var0.size() : 0.0;
   }

   private static Class9169[] method34927(Random var0, int var1, double var2, double var4, double var6, double var8) {
      Class9169[] var12 = new Class9169[var1];

      for (int var13 = 0; var13 < var12.length; var13++) {
         Class9169 var14 = new Class9169();
         var14.method34252(var0, var2, var4, var6, var8);
         var12[var13] = var14;
      }

      return var12;
   }
}
