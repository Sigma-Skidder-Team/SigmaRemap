package mapped;

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

public class Class7848 {
   private static final SuggestionProvider<Class6619> field33657 = (var0, var1) -> {
      Collection<Class7952> var4 = var0.getSource().method20177().method1396().method1066();
      return Class6618.method20143(var4.stream().map(Class7952::method27033), var1);
   };

   public static void method26285(CommandDispatcher<Class6619> var0) {
      var0.register(
         (LiteralArgumentBuilder) ((LiteralArgumentBuilder)Class6099.method18839("advancement").requires(var0x -> var0x.method20129(2)))
               .then(
                  Class6099.method18839("grant")
                     .then(
                        ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)Class6099.method18840(
                                          "targets", Class8700.method31353()
                                       )
                                       .then(
                                          Class6099.method18839("only")
                                             .then(
                                                ((RequiredArgumentBuilder)Class6099.method18840("advancement", Class8303.method29031())
                                                      .suggests(field33657)
                                                      .executes(
                                                         var0x -> method26286(
                                                               (Class6619)var0x.getSource(),
                                                               Class8700.method31354(var0x, "targets"),
                                                               Class2289.field15224,
                                                               method26288(Class8303.method29032(var0x, "advancement"), Class2028.field13162)
                                                            )
                                                      ))
                                                   .then(
                                                      Class6099.method18840("criterion", StringArgumentType.greedyString())
                                                         .suggests(
                                                            (var0x, var1) -> Class6618.method20147(
                                                                  Class8303.method29032(var0x, "advancement").method27030().keySet(), var1
                                                               )
                                                         )
                                                         .executes(
                                                            var0x -> method26287(
                                                                  (Class6619)var0x.getSource(),
                                                                  Class8700.method31354(var0x, "targets"),
                                                                  Class2289.field15224,
                                                                  Class8303.method29032(var0x, "advancement"),
                                                                  StringArgumentType.getString(var0x, "criterion")
                                                               )
                                                         )
                                                   )
                                             )
                                       ))
                                    .then(
                                       Class6099.method18839("from")
                                          .then(
                                             Class6099.method18840("advancement", Class8303.method29031())
                                                .suggests(field33657)
                                                .executes(
                                                   var0x -> method26286(
                                                         (Class6619)var0x.getSource(),
                                                         Class8700.method31354(var0x, "targets"),
                                                         Class2289.field15224,
                                                         method26288(Class8303.method29032(var0x, "advancement"), Class2028.field13164)
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    Class6099.method18839("until")
                                       .then(
                                          Class6099.method18840("advancement", Class8303.method29031())
                                             .suggests(field33657)
                                             .executes(
                                                var0x -> method26286(
                                                      (Class6619)var0x.getSource(),
                                                      Class8700.method31354(var0x, "targets"),
                                                      Class2289.field15224,
                                                      method26288(Class8303.method29032(var0x, "advancement"), Class2028.field13165)
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 Class6099.method18839("through")
                                    .then(
                                       Class6099.method18840("advancement", Class8303.method29031())
                                          .suggests(field33657)
                                          .executes(
                                             var0x -> method26286(
                                                   (Class6619)var0x.getSource(),
                                                   Class8700.method31354(var0x, "targets"),
                                                   Class2289.field15224,
                                                   method26288(Class8303.method29032(var0x, "advancement"), Class2028.field13163)
                                                )
                                          )
                                    )
                              ))
                           .then(
                              Class6099.method18839("everything")
                                 .executes(
                                    var0x -> method26286(
                                          (Class6619)var0x.getSource(),
                                          Class8700.method31354(var0x, "targets"),
                                          Class2289.field15224,
                                          ((Class6619)var0x.getSource()).method20177().method1396().method1066()
                                       )
                                 )
                           )
                     )
               )
            .then(
               Class6099.method18839("revoke")
                  .then(
                     ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)Class6099.method18840(
                                       "targets", Class8700.method31353()
                                    )
                                    .then(
                                       Class6099.method18839("only")
                                          .then(
                                             ((RequiredArgumentBuilder)Class6099.method18840("advancement", Class8303.method29031())
                                                   .suggests(field33657)
                                                   .executes(
                                                      var0x -> method26286(
                                                            (Class6619)var0x.getSource(),
                                                            Class8700.method31354(var0x, "targets"),
                                                            Class2289.field15225,
                                                            method26288(Class8303.method29032(var0x, "advancement"), Class2028.field13162)
                                                         )
                                                   ))
                                                .then(
                                                   Class6099.method18840("criterion", StringArgumentType.greedyString())
                                                      .suggests(
                                                         (var0x, var1) -> Class6618.method20147(
                                                               Class8303.method29032(var0x, "advancement").method27030().keySet(), var1
                                                            )
                                                      )
                                                      .executes(
                                                         var0x -> method26287(
                                                               (Class6619)var0x.getSource(),
                                                               Class8700.method31354(var0x, "targets"),
                                                               Class2289.field15225,
                                                               Class8303.method29032(var0x, "advancement"),
                                                               StringArgumentType.getString(var0x, "criterion")
                                                            )
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    Class6099.method18839("from")
                                       .then(
                                          Class6099.method18840("advancement", Class8303.method29031())
                                             .suggests(field33657)
                                             .executes(
                                                var0x -> method26286(
                                                      (Class6619)var0x.getSource(),
                                                      Class8700.method31354(var0x, "targets"),
                                                      Class2289.field15225,
                                                      method26288(Class8303.method29032(var0x, "advancement"), Class2028.field13164)
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 Class6099.method18839("until")
                                    .then(
                                       Class6099.method18840("advancement", Class8303.method29031())
                                          .suggests(field33657)
                                          .executes(
                                             var0x -> method26286(
                                                   (Class6619)var0x.getSource(),
                                                   Class8700.method31354(var0x, "targets"),
                                                   Class2289.field15225,
                                                   method26288(Class8303.method29032(var0x, "advancement"), Class2028.field13165)
                                                )
                                          )
                                    )
                              ))
                           .then(
                              Class6099.method18839("through")
                                 .then(
                                    Class6099.method18840("advancement", Class8303.method29031())
                                       .suggests(field33657)
                                       .executes(
                                          var0x -> method26286(
                                                (Class6619)var0x.getSource(),
                                                Class8700.method31354(var0x, "targets"),
                                                Class2289.field15225,
                                                method26288(Class8303.method29032(var0x, "advancement"), Class2028.field13163)
                                             )
                                       )
                                 )
                           ))
                        .then(
                           Class6099.method18839("everything")
                              .executes(
                                 var0x -> method26286(
                                       (Class6619)var0x.getSource(),
                                       Class8700.method31354(var0x, "targets"),
                                       Class2289.field15225,
                                       ((Class6619)var0x.getSource()).method20177().method1396().method1066()
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int method26286(Class6619 var0, Collection<Class878> var1, Class2289 var2, Collection<Class7952> var3) {
      int var6 = 0;

      for (Class878 var8 : var1) {
         var6 += var2.method9037(var8, var3);
      }

      if (var6 != 0) {
         if (var3.size() != 1) {
            if (var1.size() != 1) {
               var0.method20179(new TranslationTextComponent(var2.method9040() + ".many.to.many.success", var3.size(), var1.size()), true);
            } else {
               var0.method20179(
                  new TranslationTextComponent(var2.method9040() + ".many.to.one.success", var3.size(), ((Class878)var1.iterator().next()).method2954()), true
               );
            }
         } else if (var1.size() != 1) {
            var0.method20179(
               new TranslationTextComponent(var2.method9040() + ".one.to.many.success", ((Class7952)var3.iterator().next()).method27035(), var1.size()), true
            );
         } else {
            var0.method20179(
               new TranslationTextComponent(
                  var2.method9040() + ".one.to.one.success", ((Class7952)var3.iterator().next()).method27035(), ((Class878)var1.iterator().next()).method2954()
               ),
               true
            );
         }

         return var6;
      } else if (var3.size() != 1) {
         if (var1.size() != 1) {
            throw new Class2468(new TranslationTextComponent(var2.method9040() + ".many.to.many.failure", var3.size(), var1.size()));
         } else {
            throw new Class2468(
               new TranslationTextComponent(var2.method9040() + ".many.to.one.failure", var3.size(), ((Class878)var1.iterator().next()).method2954())
            );
         }
      } else if (var1.size() != 1) {
         throw new Class2468(
            new TranslationTextComponent(var2.method9040() + ".one.to.many.failure", ((Class7952)var3.iterator().next()).method27035(), var1.size())
         );
      } else {
         throw new Class2468(
            new TranslationTextComponent(
               var2.method9040() + ".one.to.one.failure", ((Class7952)var3.iterator().next()).method27035(), ((Class878)var1.iterator().next()).method2954()
            )
         );
      }
   }

   private static int method26287(Class6619 var0, Collection<Class878> var1, Class2289 var2, Class7952 var3, String var4) {
      int var7 = 0;
      if (var3.method27030().containsKey(var4)) {
         for (Class878 var9 : var1) {
            if (var2.method9039(var9, var3, var4)) {
               var7++;
            }
         }

         if (var7 != 0) {
            if (var1.size() != 1) {
               var0.method20179(new TranslationTextComponent(var2.method9040() + ".criterion.to.many.success", var4, var3.method27035(), var1.size()), true);
            } else {
               var0.method20179(
                  new TranslationTextComponent(
                     var2.method9040() + ".criterion.to.one.success", var4, var3.method27035(), ((Class878)var1.iterator().next()).method2954()
                  ),
                  true
               );
            }

            return var7;
         } else if (var1.size() != 1) {
            throw new Class2468(new TranslationTextComponent(var2.method9040() + ".criterion.to.many.failure", var4, var3.method27035(), var1.size()));
         } else {
            throw new Class2468(
               new TranslationTextComponent(
                  var2.method9040() + ".criterion.to.one.failure", var4, var3.method27035(), ((Class878)var1.iterator().next()).method2954()
               )
            );
         }
      } else {
         throw new Class2468(new TranslationTextComponent("commands.advancement.criterionNotFound", var3.method27035(), var4));
      }
   }

   private static List<Class7952> method26288(Class7952 var0, Class2028 var1) {
      ArrayList var4 = Lists.newArrayList();
      if (Class2028.method8661(var1)) {
         for (Class7952 var5 = var0.method27026(); var5 != null; var5 = var5.method27026()) {
            var4.add(var5);
         }
      }

      var4.add(var0);
      if (Class2028.method8662(var1)) {
         method26289(var0, var4);
      }

      return var4;
   }

   private static void method26289(Class7952 var0, List<Class7952> var1) {
      for (Class7952 var5 : var0.method27029()) {
         var1.add(var5);
         method26289(var5, var1);
      }
   }
}
