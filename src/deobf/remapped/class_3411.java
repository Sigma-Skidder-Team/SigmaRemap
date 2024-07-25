package remapped;

import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;
import net.minecraft.util.text.TranslationTextComponent;

public class class_3411 {
   private static final Dynamic2CommandExceptionType field_16796 = new Dynamic2CommandExceptionType(
      (var0, var1) -> new TranslationTextComponent("commands.fill.toobig", var0, var1)
   );
   private static final class_6986 field_16795 = new class_6986(class_4783.field_23184.method_29260(), Collections.<class_5019<?>>emptySet(), (CompoundNBT)null);
   private static final SimpleCommandExceptionType field_16794 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.fill.failed"));

   public static void method_15748(CommandDispatcher<class_9155> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)class_465.method_2231("fill").requires(var0x -> var0x.method_40314(2)))
            .then(
               class_465.method_2236("from", class_1024.method_4522())
                  .then(
                     class_465.method_2236("to", class_1024.method_4522())
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)class_465.method_2236(
                                                "block", class_3190.method_14683()
                                             )
                                             .executes(
                                                var0x -> method_15750(
                                                      (class_9155)var0x.getSource(),
                                                      new class_9616(class_1024.method_4519(var0x, "from"), class_1024.method_4519(var0x, "to")),
                                                      class_3190.method_14681(var0x, "block"),
                                                      class_837.field_4399,
                                                      (Predicate<class_9115>)null
                                                   )
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)class_465.method_2231("replace")
                                                   .executes(
                                                      var0x -> method_15750(
                                                            (class_9155)var0x.getSource(),
                                                            new class_9616(class_1024.method_4519(var0x, "from"), class_1024.method_4519(var0x, "to")),
                                                            class_3190.method_14681(var0x, "block"),
                                                            class_837.field_4399,
                                                            (Predicate<class_9115>)null
                                                         )
                                                   ))
                                                .then(
                                                   class_465.method_2236("filter", class_2061.method_9620())
                                                      .executes(
                                                         var0x -> method_15750(
                                                               (class_9155)var0x.getSource(),
                                                               new class_9616(class_1024.method_4519(var0x, "from"), class_1024.method_4519(var0x, "to")),
                                                               class_3190.method_14681(var0x, "block"),
                                                               class_837.field_4399,
                                                               class_2061.method_9622(var0x, "filter")
                                                            )
                                                      )
                                                )
                                          ))
                                       .then(
                                          class_465.method_2231("keep")
                                             .executes(
                                                var0x -> method_15750(
                                                      (class_9155)var0x.getSource(),
                                                      new class_9616(class_1024.method_4519(var0x, "from"), class_1024.method_4519(var0x, "to")),
                                                      class_3190.method_14681(var0x, "block"),
                                                      class_837.field_4399,
                                                      var0xx -> var0xx.method_41969().method_22548(var0xx.method_41966())
                                                   )
                                             )
                                       ))
                                    .then(
                                       class_465.method_2231("outline")
                                          .executes(
                                             var0x -> method_15750(
                                                   (class_9155)var0x.getSource(),
                                                   new class_9616(class_1024.method_4519(var0x, "from"), class_1024.method_4519(var0x, "to")),
                                                   class_3190.method_14681(var0x, "block"),
                                                   class_837.field_4400,
                                                   (Predicate<class_9115>)null
                                                )
                                          )
                                    ))
                                 .then(
                                    class_465.method_2231("hollow")
                                       .executes(
                                          var0x -> method_15750(
                                                (class_9155)var0x.getSource(),
                                                new class_9616(class_1024.method_4519(var0x, "from"), class_1024.method_4519(var0x, "to")),
                                                class_3190.method_14681(var0x, "block"),
                                                class_837.field_4396,
                                                (Predicate<class_9115>)null
                                             )
                                       )
                                 ))
                              .then(
                                 class_465.method_2231("destroy")
                                    .executes(
                                       var0x -> method_15750(
                                             (class_9155)var0x.getSource(),
                                             new class_9616(class_1024.method_4519(var0x, "from"), class_1024.method_4519(var0x, "to")),
                                             class_3190.method_14681(var0x, "block"),
                                             class_837.field_4395,
                                             (Predicate<class_9115>)null
                                          )
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int method_15750(class_9155 var0, class_9616 var1, class_6986 var2, class_837 var3, Predicate<class_9115> var4) throws CommandSyntaxException {
      int var7 = var1.method_44393() * var1.method_44398() * var1.method_44387();
      if (var7 > 32768) {
         throw field_16796.create(32768, var7);
      } else {
         ArrayList var8 = Lists.newArrayList();
         class_6331 var9 = var0.method_42198();
         int var10 = 0;

         for (BlockPos var12 : BlockPos.method_6075(
            var1.field_48996, var1.field_48995, var1.field_48992, var1.field_48991, var1.field_48993, var1.field_48994
         )) {
            if (var4 == null || var4.test(new class_9115(var9, var12, true))) {
               class_6986 var13 = var3.field_4397.method_13305(var1, var12, var2, var9);
               if (var13 != null) {
                  class_3757 var14 = var9.method_28260(var12);
                  class_5507.method_24976(var14);
                  if (var13.method_31964(var9, var12, 2)) {
                     var8.add(var12.method_6072());
                     var10++;
                  }
               }
            }
         }

         for (BlockPos var16 : var8) {
            class_6414 var17 = var9.method_28262(var16).method_8360();
            var9.method_43369(var16, var17);
         }

         if (var10 != 0) {
            var0.method_42196(new TranslationTextComponent("commands.fill.success", var10), true);
            return var10;
         } else {
            throw field_16794.create();
         }
      }
   }
}
