package mapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.Collection;
import net.minecraft.util.text.TranslationTextComponent;

public class Class8910 {
   private static final SimpleCommandExceptionType field40324 = new SimpleCommandExceptionType(
      new TranslationTextComponent("commands.experience.set.points.invalid")
   );

   public static void method32556(CommandDispatcher<Class6619> var0) {
      LiteralCommandNode var3 = var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class6099.method18839("experience")
                     .requires(var0x -> var0x.method20129(2)))
                  .then(
                     Class6099.method18839("add")
                        .then(
                           Class6099.method18840("targets", Class8700.method31353())
                              .then(
                                 ((RequiredArgumentBuilder)((RequiredArgumentBuilder)Class6099.method18840("amount", IntegerArgumentType.integer())
                                          .executes(
                                             var0x -> method32558(
                                                   (Class6619)var0x.getSource(),
                                                   Class8700.method31354(var0x, "targets"),
                                                   IntegerArgumentType.getInteger(var0x, "amount"),
                                                   Class2319.field15891
                                                )
                                          ))
                                       .then(
                                          Class6099.method18839("points")
                                             .executes(
                                                var0x -> method32558(
                                                      (Class6619)var0x.getSource(),
                                                      Class8700.method31354(var0x, "targets"),
                                                      IntegerArgumentType.getInteger(var0x, "amount"),
                                                      Class2319.field15891
                                                   )
                                             )
                                       ))
                                    .then(
                                       Class6099.method18839("levels")
                                          .executes(
                                             var0x -> method32558(
                                                   (Class6619)var0x.getSource(),
                                                   Class8700.method31354(var0x, "targets"),
                                                   IntegerArgumentType.getInteger(var0x, "amount"),
                                                   Class2319.field15892
                                                )
                                          )
                                    )
                              )
                        )
                  ))
               .then(
                  Class6099.method18839("set")
                     .then(
                        Class6099.method18840("targets", Class8700.method31353())
                           .then(
                              ((RequiredArgumentBuilder)((RequiredArgumentBuilder)Class6099.method18840("amount", IntegerArgumentType.integer(0))
                                       .executes(
                                          var0x -> method32559(
                                                (Class6619)var0x.getSource(),
                                                Class8700.method31354(var0x, "targets"),
                                                IntegerArgumentType.getInteger(var0x, "amount"),
                                                Class2319.field15891
                                             )
                                       ))
                                    .then(
                                       Class6099.method18839("points")
                                          .executes(
                                             var0x -> method32559(
                                                   (Class6619)var0x.getSource(),
                                                   Class8700.method31354(var0x, "targets"),
                                                   IntegerArgumentType.getInteger(var0x, "amount"),
                                                   Class2319.field15891
                                                )
                                          )
                                    ))
                                 .then(
                                    Class6099.method18839("levels")
                                       .executes(
                                          var0x -> method32559(
                                                (Class6619)var0x.getSource(),
                                                Class8700.method31354(var0x, "targets"),
                                                IntegerArgumentType.getInteger(var0x, "amount"),
                                                Class2319.field15892
                                             )
                                       )
                                 )
                           )
                     )
               ))
            .then(
               Class6099.method18839("query")
                  .then(
                     ((RequiredArgumentBuilder)Class6099.method18840("targets", Class8700.method31351())
                           .then(
                              Class6099.method18839("points")
                                 .executes(var0x -> method32557((Class6619)var0x.getSource(), Class8700.method31352(var0x, "targets"), Class2319.field15891))
                           ))
                        .then(
                           Class6099.method18839("levels")
                              .executes(var0x -> method32557((Class6619)var0x.getSource(), Class8700.method31352(var0x, "targets"), Class2319.field15892))
                        )
                  )
            )
      );
      var0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class6099.method18839("xp").requires(var0x -> var0x.method20129(2))).redirect(var3));
   }

   private static int method32557(Class6619 var0, ServerPlayerEntity var1, Class2319 var2) {
      int var5 = Class2319.method9097(var2).applyAsInt(var1);
      var0.method20179(new TranslationTextComponent("commands.experience.query." + var2.field15895, var1.getDisplayName(), var5), false);
      return var5;
   }

   private static int method32558(Class6619 var0, Collection<? extends ServerPlayerEntity> var1, int var2, Class2319 var3) {
      for (ServerPlayerEntity var7 : var1) {
         var3.field15893.accept(var7, var2);
      }

      if (var1.size() != 1) {
         var0.method20179(new TranslationTextComponent("commands.experience.add." + var3.field15895 + ".success.multiple", var2, var1.size()), true);
      } else {
         var0.method20179(
            new TranslationTextComponent(
               "commands.experience.add." + var3.field15895 + ".success.single", var2, ((ServerPlayerEntity)var1.iterator().next()).getDisplayName()
            ),
            true
         );
      }

      return var1.size();
   }

   private static int method32559(Class6619 var0, Collection<? extends ServerPlayerEntity> var1, int var2, Class2319 var3) throws CommandSyntaxException {
      int var6 = 0;

      for (ServerPlayerEntity var8 : var1) {
         if (var3.field15894.test(var8, var2)) {
            var6++;
         }
      }

      if (var6 != 0) {
         if (var1.size() != 1) {
            var0.method20179(new TranslationTextComponent("commands.experience.set." + var3.field15895 + ".success.multiple", var2, var1.size()), true);
         } else {
            var0.method20179(
               new TranslationTextComponent(
                  "commands.experience.set." + var3.field15895 + ".success.single", var2, ((ServerPlayerEntity)var1.iterator().next()).getDisplayName()
               ),
               true
            );
         }

         return var1.size();
      } else {
         throw field40324.create();
      }
   }
}
