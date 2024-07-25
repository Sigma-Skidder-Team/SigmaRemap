package remapped;

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
import net.minecraft.util.text.TranslationTextComponent;

public class class_7744 {
   private static final Dynamic4CommandExceptionType field_39272 = new Dynamic4CommandExceptionType(
      (var0, var1, var2, var3) -> new TranslationTextComponent("commands.spreadplayers.failed.teams", var0, var1, var2, var3)
   );
   private static final Dynamic4CommandExceptionType field_39273 = new Dynamic4CommandExceptionType(
      (var0, var1, var2, var3) -> new TranslationTextComponent("commands.spreadplayers.failed.entities", var0, var1, var2, var3)
   );

   public static void method_35062(CommandDispatcher<class_9155> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)class_465.method_2231("spreadplayers").requires(var0x -> var0x.method_40314(2)))
            .then(
               class_465.method_2236("center", class_1843.method_8148())
                  .then(
                     class_465.method_2236("spreadDistance", FloatArgumentType.floatArg(0.0F))
                        .then(
                           ((RequiredArgumentBuilder)class_465.method_2236("maxRange", FloatArgumentType.floatArg(1.0F))
                                 .then(
                                    class_465.method_2236("respectTeams", BoolArgumentType.bool())
                                       .then(
                                          class_465.method_2236("targets", class_5601.method_25407())
                                             .executes(
                                                var0x -> method_35065(
                                                      (class_9155)var0x.getSource(),
                                                      class_1843.method_8146(var0x, "center"),
                                                      FloatArgumentType.getFloat(var0x, "spreadDistance"),
                                                      FloatArgumentType.getFloat(var0x, "maxRange"),
                                                      256,
                                                      BoolArgumentType.getBool(var0x, "respectTeams"),
                                                      class_5601.method_25410(var0x, "targets")
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 class_465.method_2231("under")
                                    .then(
                                       class_465.method_2236("maxHeight", IntegerArgumentType.integer(0))
                                          .then(
                                             class_465.method_2236("respectTeams", BoolArgumentType.bool())
                                                .then(
                                                   class_465.method_2236("targets", class_5601.method_25407())
                                                      .executes(
                                                         var0x -> method_35065(
                                                               (class_9155)var0x.getSource(),
                                                               class_1843.method_8146(var0x, "center"),
                                                               FloatArgumentType.getFloat(var0x, "spreadDistance"),
                                                               FloatArgumentType.getFloat(var0x, "maxRange"),
                                                               IntegerArgumentType.getInteger(var0x, "maxHeight"),
                                                               BoolArgumentType.getBool(var0x, "respectTeams"),
                                                               class_5601.method_25410(var0x, "targets")
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

   private static int method_35065(class_9155 var0, class_4895 var1, float var2, float var3, int var4, boolean var5, Collection<? extends Entity> var6) throws CommandSyntaxException {
      Random var9 = new Random();
      double var10 = (double)(var1.field_24326 - var3);
      double var12 = (double)(var1.field_24329 - var3);
      double var14 = (double)(var1.field_24326 + var3);
      double var16 = (double)(var1.field_24329 + var3);
      class_7321[] var18 = method_35067(var9, !var5 ? var6.size() : method_35063(var6), var10, var12, var14, var16);
      method_35064(var1, (double)var2, var0.method_42198(), var9, var10, var12, var14, var16, var4, var18, var5);
      double var19 = method_35068(var6, var0.method_42198(), var18, var4, var5);
      var0.method_42196(
         new TranslationTextComponent(
            "commands.spreadplayers.success." + (!var5 ? "entities" : "teams"),
            var18.length,
            var1.field_24326,
            var1.field_24329,
            String.format(Locale.ROOT, "%.2f", var19)
         ),
         true
      );
      return var18.length;
   }

   private static int method_35063(Collection<? extends Entity> var0) {
      HashSet var3 = Sets.newHashSet();

      for (Entity var5 : var0) {
         if (!(var5 instanceof PlayerEntity)) {
            var3.add((class_5086)null);
         } else {
            var3.add(var5.method_37095());
         }
      }

      return var3.size();
   }

   private static void method_35064(
      class_4895 var0,
      double var1,
      class_6331 var3,
      Random var4,
      double var5,
      double var7,
      double var9,
      double var11,
      int var13,
      class_7321[] var14,
      boolean var15
   ) throws CommandSyntaxException {
      boolean var18 = true;
      double var19 = Float.MAX_VALUE;

      int var21;
      for (var21 = 0; var21 < 10000 && var18; var21++) {
         var18 = false;
         var19 = Float.MAX_VALUE;

         for (int var22 = 0; var22 < var14.length; var22++) {
            class_7321 var23 = var14[var22];
            int var24 = 0;
            class_7321 var25 = new class_7321();

            for (int var26 = 0; var26 < var14.length; var26++) {
               if (var22 != var26) {
                  class_7321 var27 = var14[var26];
                  double var28 = var23.method_33376(var27);
                  var19 = Math.min(var28, var19);
                  if (var28 < var1) {
                     var24++;
                     class_7321.method_33372(var25, class_7321.method_33381(var25) + (class_7321.method_33381(var27) - class_7321.method_33381(var23)));
                     class_7321.method_33373(var25, class_7321.method_33380(var25) + (class_7321.method_33380(var27) - class_7321.method_33380(var23)));
                  }
               }
            }

            if (var24 > 0) {
               class_7321.method_33372(var25, class_7321.method_33381(var25) / (double)var24);
               class_7321.method_33373(var25, class_7321.method_33380(var25) / (double)var24);
               double var30 = (double)var25.method_33379();
               if (!(var30 > 0.0)) {
                  var23.method_33383(var4, var5, var7, var9, var11);
               } else {
                  var25.method_33377();
                  var23.method_33378(var25);
               }

               var18 = true;
            }

            if (var23.method_33374(var5, var7, var9, var11)) {
               var18 = true;
            }
         }

         if (!var18) {
            for (class_7321 var35 : var14) {
               if (!var35.method_33382(var3, var13)) {
                  var35.method_33383(var4, var5, var7, var9, var11);
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
            throw field_39273.create(var14.length, var0.field_24326, var0.field_24329, String.format(Locale.ROOT, "%.2f", var19));
         } else {
            throw field_39272.create(var14.length, var0.field_24326, var0.field_24329, String.format(Locale.ROOT, "%.2f", var19));
         }
      }
   }

   private static double method_35068(Collection<? extends Entity> var0, class_6331 var1, class_7321[] var2, int var3, boolean var4) {
      double var7 = 0.0;
      int var9 = 0;
      HashMap var10 = Maps.newHashMap();

      for (Entity var12 : var0) {
         class_7321 var13;
         if (!var4) {
            var13 = var2[var9++];
         } else {
            class_5086 var14 = !(var12 instanceof PlayerEntity) ? null : var12.method_37095();
            if (!var10.containsKey(var14)) {
               var10.put(var14, var2[var9++]);
            }

            var13 = (class_7321)var10.get(var14);
         }

         var12.method_37079(
            (double)class_9299.method_42847(class_7321.method_33381(var13)) + 0.5,
            (double)var13.method_33384(var1, var3),
            (double)class_9299.method_42847(class_7321.method_33380(var13)) + 0.5
         );
         double var15 = Double.MAX_VALUE;

         for (class_7321 var20 : var2) {
            if (var13 != var20) {
               double var21 = var13.method_33376(var20);
               var15 = Math.min(var21, var15);
            }
         }

         var7 += var15;
      }

      return var0.size() >= 2 ? var7 / (double)var0.size() : 0.0;
   }

   private static class_7321[] method_35067(Random var0, int var1, double var2, double var4, double var6, double var8) {
      class_7321[] var12 = new class_7321[var1];

      for (int var13 = 0; var13 < var12.length; var13++) {
         class_7321 var14 = new class_7321();
         var14.method_33383(var0, var2, var4, var6, var8);
         var12[var13] = var14;
      }

      return var12;
   }
}
