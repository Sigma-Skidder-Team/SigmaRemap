package remapped;

import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import net.minecraft.util.text.TranslationTextComponent;

public class class_9209 {
   public static final SuggestionProvider<class_9155> field_47105 = (var0, var1) -> {
      class_1040 var4 = ((class_9155)var0.getSource()).method_42177().method_1722();
      return class_8773.method_40324(var4.method_4606(), var1);
   };
   private static final DynamicCommandExceptionType field_47102 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("commands.drop.no_held_items", var0)
   );
   private static final DynamicCommandExceptionType field_47104 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("commands.drop.no_loot_table", var0)
   );

   public static void method_42515(CommandDispatcher<class_9155> var0) {
      var0.register(
         method_42519(
            class_465.method_2231("loot").requires(var0x -> var0x.method_40314(2)),
            (var0x, var1) -> var0x.then(
                     class_465.method_2231("fish")
                        .then(
                           class_465.method_2236("loot_table", class_4195.method_19515())
                              .suggests(field_47105)
                              .then(
                                 ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)class_465.method_2236(
                                                "pos", class_1024.method_4522()
                                             )
                                             .executes(
                                                var1x -> method_42524(
                                                      var1x,
                                                      class_4195.method_19511(var1x, "loot_table"),
                                                      class_1024.method_4519(var1x, "pos"),
                                                      class_6098.field_31203,
                                                      var1
                                                   )
                                             ))
                                          .then(
                                             class_465.method_2236("tool", class_5663.method_25627())
                                                .executes(
                                                   var1x -> method_42524(
                                                         var1x,
                                                         class_4195.method_19511(var1x, "loot_table"),
                                                         class_1024.method_4519(var1x, "pos"),
                                                         class_5663.method_25625(var1x, "tool").method_14833(1, false),
                                                         var1
                                                      )
                                                )
                                          ))
                                       .then(
                                          class_465.method_2231("mainhand")
                                             .executes(
                                                var1x -> method_42524(
                                                      var1x,
                                                      class_4195.method_19511(var1x, "loot_table"),
                                                      class_1024.method_4519(var1x, "pos"),
                                                      method_42527((class_9155)var1x.getSource(), class_6943.field_35707),
                                                      var1
                                                   )
                                             )
                                       ))
                                    .then(
                                       class_465.method_2231("offhand")
                                          .executes(
                                             var1x -> method_42524(
                                                   var1x,
                                                   class_4195.method_19511(var1x, "loot_table"),
                                                   class_1024.method_4519(var1x, "pos"),
                                                   method_42527((class_9155)var1x.getSource(), class_6943.field_35701),
                                                   var1
                                                )
                                          )
                                    )
                              )
                        )
                  )
                  .then(
                     class_465.method_2231("loot")
                        .then(
                           class_465.method_2236("loot_table", class_4195.method_19515())
                              .suggests(field_47105)
                              .executes(var1x -> method_42511(var1x, class_4195.method_19511(var1x, "loot_table"), var1))
                        )
                  )
                  .then(
                     class_465.method_2231("kill")
                        .then(
                           class_465.method_2236("target", class_5601.method_25411())
                              .executes(var1x -> method_42510(var1x, class_5601.method_25413(var1x, "target"), var1))
                        )
                  )
                  .then(
                     class_465.method_2231("mine")
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)class_465.method_2236("pos", class_1024.method_4522())
                                       .executes(var1x -> method_42517(var1x, class_1024.method_4519(var1x, "pos"), class_6098.field_31203, var1)))
                                    .then(
                                       class_465.method_2236("tool", class_5663.method_25627())
                                          .executes(
                                             var1x -> method_42517(
                                                   var1x,
                                                   class_1024.method_4519(var1x, "pos"),
                                                   class_5663.method_25625(var1x, "tool").method_14833(1, false),
                                                   var1
                                                )
                                          )
                                    ))
                                 .then(
                                    class_465.method_2231("mainhand")
                                       .executes(
                                          var1x -> method_42517(
                                                var1x,
                                                class_1024.method_4519(var1x, "pos"),
                                                method_42527((class_9155)var1x.getSource(), class_6943.field_35707),
                                                var1
                                             )
                                       )
                                 ))
                              .then(
                                 class_465.method_2231("offhand")
                                    .executes(
                                       var1x -> method_42517(
                                             var1x,
                                             class_1024.method_4519(var1x, "pos"),
                                             method_42527((class_9155)var1x.getSource(), class_6943.field_35701),
                                             var1
                                          )
                                    )
                              )
                        )
                  )
         )
      );
   }

   private static <T extends ArgumentBuilder<class_9155, T>> T method_42519(T var0, class_3986 var1) {
      return (T)var0.then(
            ((LiteralArgumentBuilder)class_465.method_2231("replace")
                  .then(
                     class_465.method_2231("entity")
                        .then(
                           class_465.method_2236("entities", class_5601.method_25407())
                              .then(
                                 var1.method_18383(
                                       class_465.method_2236("slot", class_237.method_1011()),
                                       (var0x, var1x, var2) -> method_42521(
                                             class_5601.method_25410(var0x, "entities"), class_237.method_1013(var0x, "slot"), var1x.size(), var1x, var2
                                          )
                                    )
                                    .then(
                                       var1.method_18383(
                                          class_465.method_2236("count", IntegerArgumentType.integer(0)),
                                          (var0x, var1x, var2) -> method_42521(
                                                class_5601.method_25410(var0x, "entities"),
                                                class_237.method_1013(var0x, "slot"),
                                                IntegerArgumentType.getInteger(var0x, "count"),
                                                var1x,
                                                var2
                                             )
                                       )
                                    )
                              )
                        )
                  ))
               .then(
                  class_465.method_2231("block")
                     .then(
                        class_465.method_2236("targetPos", class_1024.method_4522())
                           .then(
                              var1.method_18383(
                                    class_465.method_2236("slot", class_237.method_1011()),
                                    (var0x, var1x, var2) -> method_42514(
                                          (class_9155)var0x.getSource(),
                                          class_1024.method_4519(var0x, "targetPos"),
                                          class_237.method_1013(var0x, "slot"),
                                          var1x.size(),
                                          var1x,
                                          var2
                                       )
                                 )
                                 .then(
                                    var1.method_18383(
                                       class_465.method_2236("count", IntegerArgumentType.integer(0)),
                                       (var0x, var1x, var2) -> method_42514(
                                             (class_9155)var0x.getSource(),
                                             class_1024.method_4519(var0x, "targetPos"),
                                             IntegerArgumentType.getInteger(var0x, "slot"),
                                             IntegerArgumentType.getInteger(var0x, "count"),
                                             var1x,
                                             var2
                                          )
                                    )
                                 )
                           )
                     )
               )
         )
         .then(
            class_465.method_2231("insert")
               .then(
                  var1.method_18383(
                     class_465.method_2236("targetPos", class_1024.method_4522()),
                     (var0x, var1x, var2) -> method_42516((class_9155)var0x.getSource(), class_1024.method_4519(var0x, "targetPos"), var1x, var2)
                  )
               )
         )
         .then(
            class_465.method_2231("give")
               .then(
                  var1.method_18383(
                     class_465.method_2236("players", class_5601.method_25409()),
                     (var0x, var1x, var2) -> method_42528(class_5601.method_25412(var0x, "players"), var1x, var2)
                  )
               )
         )
         .then(
            class_465.method_2231("spawn")
               .then(
                  var1.method_18383(
                     class_465.method_2236("targetPos", class_1029.method_4556()),
                     (var0x, var1x, var2) -> method_42522((class_9155)var0x.getSource(), class_1029.method_4555(var0x, "targetPos"), var1x, var2)
                  )
               )
         );
   }

   private static class_6867 method_42523(class_9155 var0, class_1331 var1) throws CommandSyntaxException {
      class_3757 var4 = var0.method_42198().method_28260(var1);
      if (var4 instanceof class_6867) {
         return (class_6867)var4;
      } else {
         throw class_7427.field_37896.create();
      }
   }

   private static int method_42516(class_9155 var0, class_1331 var1, List<class_6098> var2, class_3119 var3) throws CommandSyntaxException {
      class_6867 var6 = method_42523(var0, var1);
      ArrayList var7 = Lists.newArrayListWithCapacity(var2.size());

      for (class_6098 var9 : var2) {
         if (method_42513(var6, var9.method_27973())) {
            var6.method_17407();
            var7.add(var9);
         }
      }

      var3.method_14478(var7);
      return var7.size();
   }

   private static boolean method_42513(class_6867 var0, class_6098 var1) {
      boolean var4 = false;

      for (int var5 = 0; var5 < var0.method_31505() && !var1.method_28022(); var5++) {
         class_6098 var6 = var0.method_31498(var5);
         if (var0.method_31500(var5, var1)) {
            if (var6.method_28022()) {
               var0.method_31503(var5, var1);
               var4 = true;
               break;
            }

            if (method_42520(var6, var1)) {
               int var7 = var1.method_28016() - var6.method_27997();
               int var8 = Math.min(var1.method_27997(), var7);
               var1.method_27970(var8);
               var6.method_28030(var8);
               var4 = true;
            }
         }
      }

      return var4;
   }

   private static int method_42514(class_9155 var0, class_1331 var1, int var2, int var3, List<class_6098> var4, class_3119 var5) throws CommandSyntaxException {
      class_6867 var8 = method_42523(var0, var1);
      int var9 = var8.method_31505();
      if (var2 >= 0 && var2 < var9) {
         ArrayList var10 = Lists.newArrayListWithCapacity(var4.size());

         for (int var11 = 0; var11 < var3; var11++) {
            int var12 = var2 + var11;
            class_6098 var13 = var11 >= var4.size() ? class_6098.field_31203 : (class_6098)var4.get(var11);
            if (var8.method_31500(var12, var13)) {
               var8.method_31503(var12, var13);
               var10.add(var13);
            }
         }

         var5.method_14478(var10);
         return var10.size();
      } else {
         throw class_7427.field_37897.create(var2);
      }
   }

   private static boolean method_42520(class_6098 var0, class_6098 var1) {
      return var0.method_27960() == var1.method_27960()
         && var0.method_28026() == var1.method_28026()
         && var0.method_27997() <= var0.method_28016()
         && Objects.equals(var0.method_27990(), var1.method_27990());
   }

   private static int method_42528(Collection<class_9359> var0, List<class_6098> var1, class_3119 var2) throws CommandSyntaxException {
      ArrayList var5 = Lists.newArrayListWithCapacity(var1.size());

      for (class_6098 var7 : var1) {
         for (class_9359 var9 : var0) {
            if (var9.field_3853.method_32414(var7.method_27973())) {
               var5.add(var7);
            }
         }
      }

      var2.method_14478(var5);
      return var5.size();
   }

   private static void method_42525(Entity var0, List<class_6098> var1, int var2, int var3, List<class_6098> var4) {
      for (int var7 = 0; var7 < var3; var7++) {
         class_6098 var8 = var7 >= var1.size() ? class_6098.field_31203 : (class_6098)var1.get(var7);
         if (var0.method_37166(var2 + var7, var8.method_27973())) {
            var4.add(var8);
         }
      }
   }

   private static int method_42521(Collection<? extends Entity> var0, int var1, int var2, List<class_6098> var3, class_3119 var4) throws CommandSyntaxException {
      ArrayList var7 = Lists.newArrayListWithCapacity(var3.size());

      for (Entity var9 : var0) {
         if (!(var9 instanceof class_9359)) {
            method_42525(var9, var3, var1, var2, var7);
         } else {
            class_9359 var10 = (class_9359)var9;
            var10.field_3869.method_18877();
            method_42525(var9, var3, var1, var2, var7);
            var10.field_3869.method_18877();
         }
      }

      var4.method_14478(var7);
      return var7.size();
   }

   private static int method_42522(class_9155 var0, class_1343 var1, List<class_6098> var2, class_3119 var3) throws CommandSyntaxException {
      class_6331 var6 = var0.method_42198();
      var2.forEach(var2x -> {
         class_91 var5 = new class_91(var6, var1.field_7336, var1.field_7333, var1.field_7334, var2x.method_27973());
         var5.method_257();
         var6.method_7509(var5);
      });
      var3.method_14478(var2);
      return var2.size();
   }

   private static void method_42518(class_9155 var0, List<class_6098> var1) {
      if (var1.size() != 1) {
         var0.method_42196(new TranslationTextComponent("commands.drop.success.multiple", var1.size()), false);
      } else {
         class_6098 var4 = (class_6098)var1.get(0);
         var0.method_42196(new TranslationTextComponent("commands.drop.success.single", var4.method_27997(), var4.method_28001()), false);
      }
   }

   private static void method_42512(class_9155 var0, List<class_6098> var1, Identifier var2) {
      if (var1.size() != 1) {
         var0.method_42196(new TranslationTextComponent("commands.drop.success.multiple_with_table", var1.size(), var2), false);
      } else {
         class_6098 var5 = (class_6098)var1.get(0);
         var0.method_42196(new TranslationTextComponent("commands.drop.success.single_with_table", var5.method_27997(), var5.method_28001(), var2), false);
      }
   }

   private static class_6098 method_42527(class_9155 var0, class_6943 var1) throws CommandSyntaxException {
      Entity var4 = var0.method_42178();
      if (!(var4 instanceof class_5834)) {
         throw field_47102.create(var4.method_19839());
      } else {
         return ((class_5834)var4).method_26520(var1);
      }
   }

   private static int method_42517(CommandContext<class_9155> var0, class_1331 var1, class_6098 var2, class_6374 var3) throws CommandSyntaxException {
      class_9155 var6 = (class_9155)var0.getSource();
      class_6331 var7 = var6.method_42198();
      class_2522 var8 = var7.method_28262(var1);
      class_3757 var9 = var7.method_28260(var1);
      class_8480 var10 = new class_8480(var7)
         .method_39065(class_8712.field_44671, class_1343.method_6216(var1))
         .method_39065(class_8712.field_44677, var8)
         .method_39069(class_8712.field_44673, var9)
         .method_39069(class_8712.field_44676, var6.method_42200())
         .method_39065(class_8712.field_44670, var2);
      List var11 = var8.method_8333(var10);
      return var3.method_29152(var0, var11, var2x -> method_42512(var6, var2x, var8.method_8360().method_10786()));
   }

   private static int method_42510(CommandContext<class_9155> var0, Entity var1, class_6374 var2) throws CommandSyntaxException {
      if (var1 instanceof class_5834) {
         Identifier var5 = ((class_5834)var1).method_26591();
         class_9155 var6 = (class_9155)var0.getSource();
         class_8480 var7 = new class_8480(var6.method_42198());
         Entity var8 = var6.method_42200();
         if (var8 instanceof class_704) {
            var7.method_39065(class_8712.field_44675, (class_704)var8);
         }

         var7.method_39065(class_8712.field_44674, class_6199.field_31686);
         var7.method_39069(class_8712.field_44669, var8);
         var7.method_39069(class_8712.field_44678, var8);
         var7.method_39065(class_8712.field_44676, var1);
         var7.method_39065(class_8712.field_44671, var6.method_42192());
         class_1758 var9 = var6.method_42177().method_1722().method_4604(var5);
         List var10 = var9.method_7862(var7.method_39064(class_4933.field_25566));
         return var2.method_29152(var0, var10, var2x -> method_42512(var6, var2x, var5));
      } else {
         throw field_47104.create(var1.method_19839());
      }
   }

   private static int method_42511(CommandContext<class_9155> var0, Identifier var1, class_6374 var2) throws CommandSyntaxException {
      class_9155 var5 = (class_9155)var0.getSource();
      class_8480 var6 = new class_8480(var5.method_42198())
         .method_39069(class_8712.field_44676, var5.method_42200())
         .method_39065(class_8712.field_44671, var5.method_42192());
      return method_42509(var0, var1, var6.method_39064(class_4933.field_25565), var2);
   }

   private static int method_42524(CommandContext<class_9155> var0, Identifier var1, class_1331 var2, class_6098 var3, class_6374 var4) throws CommandSyntaxException {
      class_9155 var7 = (class_9155)var0.getSource();
      class_2792 var8 = new class_8480(var7.method_42198())
         .method_39065(class_8712.field_44671, class_1343.method_6216(var2))
         .method_39065(class_8712.field_44670, var3)
         .method_39069(class_8712.field_44676, var7.method_42200())
         .method_39064(class_4933.field_25570);
      return method_42509(var0, var1, var8, var4);
   }

   private static int method_42509(CommandContext<class_9155> var0, Identifier var1, class_2792 var2, class_6374 var3) throws CommandSyntaxException {
      class_9155 var6 = (class_9155)var0.getSource();
      class_1758 var7 = var6.method_42177().method_1722().method_4604(var1);
      List var8 = var7.method_7862(var2);
      return var3.method_29152(var0, var8, var1x -> method_42518(var6, var1x));
   }
}
