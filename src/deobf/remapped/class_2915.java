package remapped;

import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import net.minecraft.util.text.TranslationTextComponent;

public class class_2915 {
   private static final SuggestionProvider<class_9155> field_14235 = (var0, var1) -> {
      Collection var4 = ((class_9155)var0.getSource()).method_42177().method_1703().method_40816();
      return class_8773.method_40310(var4.stream().<class_4639>map(class_3139::method_14520), var1);
   };

   public static void method_13341(CommandDispatcher<class_9155> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class_465.method_2231("advancement")
                  .requires(var0x -> var0x.method_40314(2)))
               .then(
                  class_465.method_2231("grant")
                     .then(
                        ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)class_465.method_2236(
                                          "targets", class_5601.method_25409()
                                       )
                                       .then(
                                          class_465.method_2231("only")
                                             .then(
                                                ((RequiredArgumentBuilder)class_465.method_2236("advancement", class_4195.method_19515())
                                                      .suggests(field_14235)
                                                      .executes(
                                                         var0x -> method_13342(
                                                               (class_9155)var0x.getSource(),
                                                               class_5601.method_25412(var0x, "targets"),
                                                               class_5022.field_25977,
                                                               method_13345(class_4195.method_19512(var0x, "advancement"), class_9409.field_48122)
                                                            )
                                                      ))
                                                   .then(
                                                      class_465.method_2236("criterion", StringArgumentType.greedyString())
                                                         .suggests(
                                                            (var0x, var1) -> class_8773.method_40319(
                                                                  class_4195.method_19512(var0x, "advancement").method_14518().keySet(), var1
                                                               )
                                                         )
                                                         .executes(
                                                            var0x -> method_13346(
                                                                  (class_9155)var0x.getSource(),
                                                                  class_5601.method_25412(var0x, "targets"),
                                                                  class_5022.field_25977,
                                                                  class_4195.method_19512(var0x, "advancement"),
                                                                  StringArgumentType.getString(var0x, "criterion")
                                                               )
                                                         )
                                                   )
                                             )
                                       ))
                                    .then(
                                       class_465.method_2231("from")
                                          .then(
                                             class_465.method_2236("advancement", class_4195.method_19515())
                                                .suggests(field_14235)
                                                .executes(
                                                   var0x -> method_13342(
                                                         (class_9155)var0x.getSource(),
                                                         class_5601.method_25412(var0x, "targets"),
                                                         class_5022.field_25977,
                                                         method_13345(class_4195.method_19512(var0x, "advancement"), class_9409.field_48116)
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    class_465.method_2231("until")
                                       .then(
                                          class_465.method_2236("advancement", class_4195.method_19515())
                                             .suggests(field_14235)
                                             .executes(
                                                var0x -> method_13342(
                                                      (class_9155)var0x.getSource(),
                                                      class_5601.method_25412(var0x, "targets"),
                                                      class_5022.field_25977,
                                                      method_13345(class_4195.method_19512(var0x, "advancement"), class_9409.field_48118)
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 class_465.method_2231("through")
                                    .then(
                                       class_465.method_2236("advancement", class_4195.method_19515())
                                          .suggests(field_14235)
                                          .executes(
                                             var0x -> method_13342(
                                                   (class_9155)var0x.getSource(),
                                                   class_5601.method_25412(var0x, "targets"),
                                                   class_5022.field_25977,
                                                   method_13345(class_4195.method_19512(var0x, "advancement"), class_9409.field_48121)
                                                )
                                          )
                                    )
                              ))
                           .then(
                              class_465.method_2231("everything")
                                 .executes(
                                    var0x -> method_13342(
                                          (class_9155)var0x.getSource(),
                                          class_5601.method_25412(var0x, "targets"),
                                          class_5022.field_25977,
                                          ((class_9155)var0x.getSource()).method_42177().method_1703().method_40816()
                                       )
                                 )
                           )
                     )
               ))
            .then(
               class_465.method_2231("revoke")
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)class_465.method_2236(
                                       "targets", class_5601.method_25409()
                                    )
                                    .then(
                                       class_465.method_2231("only")
                                          .then(
                                             ((RequiredArgumentBuilder)class_465.method_2236("advancement", class_4195.method_19515())
                                                   .suggests(field_14235)
                                                   .executes(
                                                      var0x -> method_13342(
                                                            (class_9155)var0x.getSource(),
                                                            class_5601.method_25412(var0x, "targets"),
                                                            class_5022.field_25978,
                                                            method_13345(class_4195.method_19512(var0x, "advancement"), class_9409.field_48122)
                                                         )
                                                   ))
                                                .then(
                                                   class_465.method_2236("criterion", StringArgumentType.greedyString())
                                                      .suggests(
                                                         (var0x, var1) -> class_8773.method_40319(
                                                               class_4195.method_19512(var0x, "advancement").method_14518().keySet(), var1
                                                            )
                                                      )
                                                      .executes(
                                                         var0x -> method_13346(
                                                               (class_9155)var0x.getSource(),
                                                               class_5601.method_25412(var0x, "targets"),
                                                               class_5022.field_25978,
                                                               class_4195.method_19512(var0x, "advancement"),
                                                               StringArgumentType.getString(var0x, "criterion")
                                                            )
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    class_465.method_2231("from")
                                       .then(
                                          class_465.method_2236("advancement", class_4195.method_19515())
                                             .suggests(field_14235)
                                             .executes(
                                                var0x -> method_13342(
                                                      (class_9155)var0x.getSource(),
                                                      class_5601.method_25412(var0x, "targets"),
                                                      class_5022.field_25978,
                                                      method_13345(class_4195.method_19512(var0x, "advancement"), class_9409.field_48116)
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 class_465.method_2231("until")
                                    .then(
                                       class_465.method_2236("advancement", class_4195.method_19515())
                                          .suggests(field_14235)
                                          .executes(
                                             var0x -> method_13342(
                                                   (class_9155)var0x.getSource(),
                                                   class_5601.method_25412(var0x, "targets"),
                                                   class_5022.field_25978,
                                                   method_13345(class_4195.method_19512(var0x, "advancement"), class_9409.field_48118)
                                                )
                                          )
                                    )
                              ))
                           .then(
                              class_465.method_2231("through")
                                 .then(
                                    class_465.method_2236("advancement", class_4195.method_19515())
                                       .suggests(field_14235)
                                       .executes(
                                          var0x -> method_13342(
                                                (class_9155)var0x.getSource(),
                                                class_5601.method_25412(var0x, "targets"),
                                                class_5022.field_25978,
                                                method_13345(class_4195.method_19512(var0x, "advancement"), class_9409.field_48121)
                                             )
                                       )
                                 )
                           ))
                        .then(
                           class_465.method_2231("everything")
                              .executes(
                                 var0x -> method_13342(
                                       (class_9155)var0x.getSource(),
                                       class_5601.method_25412(var0x, "targets"),
                                       class_5022.field_25978,
                                       ((class_9155)var0x.getSource()).method_42177().method_1703().method_40816()
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int method_13342(class_9155 var0, Collection<class_9359> var1, class_5022 var2, Collection<class_3139> var3) {
      int var6 = 0;

      for (class_9359 var8 : var1) {
         var6 += var2.method_23120(var8, var3);
      }

      if (var6 != 0) {
         if (var3.size() != 1) {
            if (var1.size() != 1) {
               var0.method_42196(new TranslationTextComponent(var2.method_23123() + ".many.to.many.success", var3.size(), var1.size()), true);
            } else {
               var0.method_42196(
                  new TranslationTextComponent(var2.method_23123() + ".many.to.one.success", var3.size(), ((class_9359)var1.iterator().next()).method_19839()),
                  true
               );
            }
         } else if (var1.size() != 1) {
            var0.method_42196(
               new TranslationTextComponent(var2.method_23123() + ".one.to.many.success", ((class_3139)var3.iterator().next()).method_14512(), var1.size()),
               true
            );
         } else {
            var0.method_42196(
               new TranslationTextComponent(
                  var2.method_23123() + ".one.to.one.success",
                  ((class_3139)var3.iterator().next()).method_14512(),
                  ((class_9359)var1.iterator().next()).method_19839()
               ),
               true
            );
         }

         return var6;
      } else if (var3.size() != 1) {
         if (var1.size() != 1) {
            throw new class_720(new TranslationTextComponent(var2.method_23123() + ".many.to.many.failure", var3.size(), var1.size()));
         } else {
            throw new class_720(
               new TranslationTextComponent(var2.method_23123() + ".many.to.one.failure", var3.size(), ((class_9359)var1.iterator().next()).method_19839())
            );
         }
      } else if (var1.size() != 1) {
         throw new class_720(
            new TranslationTextComponent(var2.method_23123() + ".one.to.many.failure", ((class_3139)var3.iterator().next()).method_14512(), var1.size())
         );
      } else {
         throw new class_720(
            new TranslationTextComponent(
               var2.method_23123() + ".one.to.one.failure",
               ((class_3139)var3.iterator().next()).method_14512(),
               ((class_9359)var1.iterator().next()).method_19839()
            )
         );
      }
   }

   private static int method_13346(class_9155 var0, Collection<class_9359> var1, class_5022 var2, class_3139 var3, String var4) {
      int var7 = 0;
      if (var3.method_14518().containsKey(var4)) {
         for (class_9359 var9 : var1) {
            if (var2.method_23121(var9, var3, var4)) {
               var7++;
            }
         }

         if (var7 != 0) {
            if (var1.size() != 1) {
               var0.method_42196(new TranslationTextComponent(var2.method_23123() + ".criterion.to.many.success", var4, var3.method_14512(), var1.size()), true);
            } else {
               var0.method_42196(
                  new TranslationTextComponent(
                     var2.method_23123() + ".criterion.to.one.success", var4, var3.method_14512(), ((class_9359)var1.iterator().next()).method_19839()
                  ),
                  true
               );
            }

            return var7;
         } else if (var1.size() != 1) {
            throw new class_720(new TranslationTextComponent(var2.method_23123() + ".criterion.to.many.failure", var4, var3.method_14512(), var1.size()));
         } else {
            throw new class_720(
               new TranslationTextComponent(
                  var2.method_23123() + ".criterion.to.one.failure", var4, var3.method_14512(), ((class_9359)var1.iterator().next()).method_19839()
               )
            );
         }
      } else {
         throw new class_720(new TranslationTextComponent("commands.advancement.criterionNotFound", var3.method_14512(), var4));
      }
   }

   private static List<class_3139> method_13345(class_3139 var0, class_9409 var1) {
      ArrayList var4 = Lists.newArrayList();
      if (class_9409.method_43590(var1)) {
         for (class_3139 var5 = var0.method_14510(); var5 != null; var5 = var5.method_14510()) {
            var4.add(var5);
         }
      }

      var4.add(var0);
      if (class_9409.method_43591(var1)) {
         method_13344(var0, var4);
      }

      return var4;
   }

   private static void method_13344(class_3139 var0, List<class_3139> var1) {
      for (class_3139 var5 : var0.method_14516()) {
         var1.add(var5);
         method_13344(var5, var1);
      }
   }
}
