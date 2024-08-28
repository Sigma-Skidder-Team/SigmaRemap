package mapped;

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

public class Class9653 {
   public static final SuggestionProvider<Class6619> field45128 = (var0, var1) -> {
      Class284 var4 = ((Class6619)var0.getSource()).method20177().method1411();
      return Class6618.method20141(var4.method1061(), var1);
   };
   private static final DynamicCommandExceptionType field45129 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("commands.drop.no_held_items", var0)
   );
   private static final DynamicCommandExceptionType field45130 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("commands.drop.no_loot_table", var0)
   );

   public static void method37658(CommandDispatcher<Class6619> var0) {
      var0.register(
         method37659(
            Class6099.method18839("loot").requires(var0x -> var0x.method20129(2)),
            (var0x, var1) -> var0x.then(
                     Class6099.method18839("fish")
                        .then(
                           Class6099.method18840("loot_table", Class8303.method29031())
                              .suggests(field45128)
                              .then(
                                 ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)Class6099.method18840(
                                                "pos", Class6849.method20826()
                                             )
                                             .executes(
                                                var1x -> method37675(
                                                      var1x,
                                                      Class8303.method29036(var1x, "loot_table"),
                                                      Class6849.method20827(var1x, "pos"),
                                                      ItemStack.EMPTY,
                                                      var1
                                                   )
                                             ))
                                          .then(
                                             Class6099.method18840("tool", Class8722.method31481())
                                                .executes(
                                                   var1x -> method37675(
                                                         var1x,
                                                         Class8303.method29036(var1x, "loot_table"),
                                                         Class6849.method20827(var1x, "pos"),
                                                         Class8722.method31482(var1x, "tool").method503(1, false),
                                                         var1
                                                      )
                                                )
                                          ))
                                       .then(
                                          Class6099.method18839("mainhand")
                                             .executes(
                                                var1x -> method37675(
                                                      var1x,
                                                      Class8303.method29036(var1x, "loot_table"),
                                                      Class6849.method20827(var1x, "pos"),
                                                      method37671((Class6619)var1x.getSource(), Class2106.field13731),
                                                      var1
                                                   )
                                             )
                                       ))
                                    .then(
                                       Class6099.method18839("offhand")
                                          .executes(
                                             var1x -> method37675(
                                                   var1x,
                                                   Class8303.method29036(var1x, "loot_table"),
                                                   Class6849.method20827(var1x, "pos"),
                                                   method37671((Class6619)var1x.getSource(), Class2106.field13732),
                                                   var1
                                                )
                                          )
                                    )
                              )
                        )
                  )
                  .then(
                     Class6099.method18839("loot")
                        .then(
                           Class6099.method18840("loot_table", Class8303.method29031())
                              .suggests(field45128)
                              .executes(var1x -> method37674(var1x, Class8303.method29036(var1x, "loot_table"), var1))
                        )
                  )
                  .then(
                     Class6099.method18839("kill")
                        .then(
                           Class6099.method18840("target", Class8700.method31345())
                              .executes(var1x -> method37673(var1x, Class8700.method31346(var1x, "target"), var1))
                        )
                  )
                  .then(
                     Class6099.method18839("mine")
                        .then(
                           ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)Class6099.method18840("pos", Class6849.method20826())
                                       .executes(var1x -> method37672(var1x, Class6849.method20827(var1x, "pos"), ItemStack.EMPTY, var1)))
                                    .then(
                                       Class6099.method18840("tool", Class8722.method31481())
                                          .executes(
                                             var1x -> method37672(
                                                   var1x, Class6849.method20827(var1x, "pos"), Class8722.method31482(var1x, "tool").method503(1, false), var1
                                                )
                                          )
                                    ))
                                 .then(
                                    Class6099.method18839("mainhand")
                                       .executes(
                                          var1x -> method37672(
                                                var1x,
                                                Class6849.method20827(var1x, "pos"),
                                                method37671((Class6619)var1x.getSource(), Class2106.field13731),
                                                var1
                                             )
                                       )
                                 ))
                              .then(
                                 Class6099.method18839("offhand")
                                    .executes(
                                       var1x -> method37672(
                                             var1x, Class6849.method20827(var1x, "pos"), method37671((Class6619)var1x.getSource(), Class2106.field13732), var1
                                          )
                                    )
                              )
                        )
                  )
         )
      );
   }

   private static <T extends ArgumentBuilder<Class6619, T>> T method37659(T var0, Class8236 var1) {
      return (T)var0.then(
            ((LiteralArgumentBuilder)Class6099.method18839("replace")
                  .then(
                     Class6099.method18839("entity")
                        .then(
                           Class6099.method18840("entities", Class8700.method31347())
                              .then(
                                 var1.method28672(
                                       Class6099.method18840("slot", Class4914.method15195()),
                                       (var0x, var1x, var2) -> method37667(
                                             Class8700.method31348(var0x, "entities"), Class4914.method15196(var0x, "slot"), var1x.size(), var1x, var2
                                          )
                                    )
                                    .then(
                                       var1.method28672(
                                          Class6099.method18840("count", IntegerArgumentType.integer(0)),
                                          (var0x, var1x, var2) -> method37667(
                                                Class8700.method31348(var0x, "entities"),
                                                Class4914.method15196(var0x, "slot"),
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
                  Class6099.method18839("block")
                     .then(
                        Class6099.method18840("targetPos", Class6849.method20826())
                           .then(
                              var1.method28672(
                                    Class6099.method18840("slot", Class4914.method15195()),
                                    (var0x, var1x, var2) -> method37663(
                                          (Class6619)var0x.getSource(),
                                          Class6849.method20827(var0x, "targetPos"),
                                          Class4914.method15196(var0x, "slot"),
                                          var1x.size(),
                                          var1x,
                                          var2
                                       )
                                 )
                                 .then(
                                    var1.method28672(
                                       Class6099.method18840("count", IntegerArgumentType.integer(0)),
                                       (var0x, var1x, var2) -> method37663(
                                             (Class6619)var0x.getSource(),
                                             Class6849.method20827(var0x, "targetPos"),
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
            Class6099.method18839("insert")
               .then(
                  var1.method28672(
                     Class6099.method18840("targetPos", Class6849.method20826()),
                     (var0x, var1x, var2) -> method37661((Class6619)var0x.getSource(), Class6849.method20827(var0x, "targetPos"), var1x, var2)
                  )
               )
         )
         .then(
            Class6099.method18839("give")
               .then(
                  var1.method28672(
                     Class6099.method18840("players", Class8700.method31353()),
                     (var0x, var1x, var2) -> method37665(Class8700.method31354(var0x, "players"), var1x, var2)
                  )
               )
         )
         .then(
            Class6099.method18839("spawn")
               .then(
                  var1.method28672(
                     Class6099.method18840("targetPos", Class6851.method20857()),
                     (var0x, var1x, var2) -> method37668((Class6619)var0x.getSource(), Class6851.method20859(var0x, "targetPos"), var1x, var2)
                  )
               )
         );
   }

   private static Class920 method37660(Class6619 var0, BlockPos var1) throws CommandSyntaxException {
      Class944 var4 = var0.method20172().method6759(var1);
      if (var4 instanceof Class920) {
         return (Class920)var4;
      } else {
         throw Class9195.field42233.create();
      }
   }

   private static int method37661(Class6619 var0, BlockPos var1, List<ItemStack> var2, Class7946 var3) throws CommandSyntaxException {
      Class920 var6 = method37660(var0, var1);
      ArrayList var7 = Lists.newArrayListWithCapacity(var2.size());

      for (ItemStack var9 : var2) {
         if (method37662(var6, var9.copy())) {
            var6.method3622();
            var7.add(var9);
         }
      }

      var3.method27014(var7);
      return var7.size();
   }

   private static boolean method37662(Class920 var0, ItemStack var1) {
      boolean var4 = false;

      for (int var5 = 0; var5 < var0.method3629() && !var1.method32105(); var5++) {
         ItemStack var6 = var0.method3618(var5);
         if (var0.method3633(var5, var1)) {
            if (var6.method32105()) {
               var0.method3621(var5, var1);
               var4 = true;
               break;
            }

            if (method37664(var6, var1)) {
               int var7 = var1.method32113() - var6.method32179();
               int var8 = Math.min(var1.method32179(), var7);
               var1.method32182(var8);
               var6.method32181(var8);
               var4 = true;
            }
         }
      }

      return var4;
   }

   private static int method37663(Class6619 var0, BlockPos var1, int var2, int var3, List<ItemStack> var4, Class7946 var5) throws CommandSyntaxException {
      Class920 var8 = method37660(var0, var1);
      int var9 = var8.method3629();
      if (var2 >= 0 && var2 < var9) {
         ArrayList var10 = Lists.newArrayListWithCapacity(var4.size());

         for (int var11 = 0; var11 < var3; var11++) {
            int var12 = var2 + var11;
            ItemStack var13 = var11 >= var4.size() ? ItemStack.EMPTY : (ItemStack)var4.get(var11);
            if (var8.method3633(var12, var13)) {
               var8.method3621(var12, var13);
               var10.add(var13);
            }
         }

         var5.method27014(var10);
         return var10.size();
      } else {
         throw Class9195.field42234.create(var2);
      }
   }

   private static boolean method37664(ItemStack var0, ItemStack var1) {
      return var0.method32107() == var1.method32107()
         && var0.method32117() == var1.method32117()
         && var0.method32179() <= var0.method32113()
         && Objects.equals(var0.method32142(), var1.method32142());
   }

   private static int method37665(Collection<ServerPlayerEntity> var0, List<ItemStack> var1, Class7946 var2) throws CommandSyntaxException {
      ArrayList var5 = Lists.newArrayListWithCapacity(var1.size());

      for (ItemStack var7 : var1) {
         for (ServerPlayerEntity var9 : var0) {
            if (var9.field4902.method4045(var7.copy())) {
               var5.add(var7);
            }
         }
      }

      var2.method27014(var5);
      return var5.size();
   }

   private static void method37666(Entity var0, List<ItemStack> var1, int var2, int var3, List<ItemStack> var4) {
      for (int var7 = 0; var7 < var3; var7++) {
         ItemStack var8 = var7 >= var1.size() ? ItemStack.EMPTY : (ItemStack)var1.get(var7);
         if (var0.method2963(var2 + var7, var8.copy())) {
            var4.add(var8);
         }
      }
   }

   private static int method37667(Collection<? extends Entity> var0, int var1, int var2, List<ItemStack> var3, Class7946 var4) throws CommandSyntaxException {
      ArrayList var7 = Lists.newArrayListWithCapacity(var3.size());

      for (Entity var9 : var0) {
         if (!(var9 instanceof ServerPlayerEntity)) {
            method37666(var9, var3, var1, var2, var7);
         } else {
            ServerPlayerEntity var10 = (ServerPlayerEntity)var9;
            var10.field4904.method18130();
            method37666(var9, var3, var1, var2, var7);
            var10.field4904.method18130();
         }
      }

      var4.method27014(var7);
      return var7.size();
   }

   private static int method37668(Class6619 var0, Vector3d var1, List<ItemStack> var2, Class7946 var3) throws CommandSyntaxException {
      ServerWorld var6 = var0.method20172();
      var2.forEach(var2x -> {
         ItemEntity var5 = new ItemEntity(var6, var1.field18048, var1.field18049, var1.field18050, var2x.copy());
         var5.method4131();
         var6.method6916(var5);
      });
      var3.method27014(var2);
      return var2.size();
   }

   private static void method37669(Class6619 var0, List<ItemStack> var1) {
      if (var1.size() != 1) {
         var0.method20179(new TranslationTextComponent("commands.drop.success.multiple", var1.size()), false);
      } else {
         ItemStack var4 = (ItemStack)var1.get(0);
         var0.method20179(new TranslationTextComponent("commands.drop.success.single", var4.method32179(), var4.method32173()), false);
      }
   }

   private static void method37670(Class6619 var0, List<ItemStack> var1, ResourceLocation var2) {
      if (var1.size() != 1) {
         var0.method20179(new TranslationTextComponent("commands.drop.success.multiple_with_table", var1.size(), var2), false);
      } else {
         ItemStack var5 = (ItemStack)var1.get(0);
         var0.method20179(new TranslationTextComponent("commands.drop.success.single_with_table", var5.method32179(), var5.method32173(), var2), false);
      }
   }

   private static ItemStack method37671(Class6619 var0, Class2106 var1) throws CommandSyntaxException {
      Entity var4 = var0.method20174();
      if (!(var4 instanceof Class880)) {
         throw field45129.create(var4.getDisplayName());
      } else {
         return ((Class880)var4).method2943(var1);
      }
   }

   private static int method37672(CommandContext<Class6619> var0, BlockPos var1, ItemStack var2, Class8914 var3) throws CommandSyntaxException {
      Class6619 var6 = (Class6619)var0.getSource();
      ServerWorld var7 = var6.method20172();
      Class7380 var8 = var7.method6738(var1);
      Class944 var9 = var7.method6759(var1);
      Class9464 var10 = new Class9464(var7)
         .method36454(Class9525.field44335, Vector3d.method11328(var1))
         .method36454(Class9525.field44336, var8)
         .method36455(Class9525.field44337, var9)
         .method36455(Class9525.field44330, var6.method20173())
         .method36454(Class9525.field44338, var2);
      List var11 = var8.method23434(var10);
      return var3.method32583(var0, var11, var2x -> method37670(var6, var2x, var8.method23383().method11999()));
   }

   private static int method37673(CommandContext<Class6619> var0, Entity var1, Class8914 var2) throws CommandSyntaxException {
      if (var1 instanceof Class880) {
         ResourceLocation var5 = ((Class880)var1).method3055();
         Class6619 var6 = (Class6619)var0.getSource();
         Class9464 var7 = new Class9464(var6.method20172());
         Entity var8 = var6.method20173();
         if (var8 instanceof PlayerEntity) {
            var7.method36454(Class9525.field44331, (PlayerEntity)var8);
         }

         var7.method36454(Class9525.field44332, Class8654.field39006);
         var7.method36455(Class9525.field44334, var8);
         var7.method36455(Class9525.field44333, var8);
         var7.method36454(Class9525.field44330, var1);
         var7.method36454(Class9525.field44335, var6.method20171());
         Class7318 var9 = var6.method20177().method1411().method1058(var5);
         List var10 = var9.method23182(var7.method36460(Class8524.field38286));
         return var2.method32583(var0, var10, var2x -> method37670(var6, var2x, var5));
      } else {
         throw field45130.create(var1.getDisplayName());
      }
   }

   private static int method37674(CommandContext<Class6619> var0, ResourceLocation var1, Class8914 var2) throws CommandSyntaxException {
      Class6619 var5 = (Class6619)var0.getSource();
      Class9464 var6 = new Class9464(var5.method20172())
         .method36455(Class9525.field44330, var5.method20173())
         .method36454(Class9525.field44335, var5.method20171());
      return method37676(var0, var1, var6.method36460(Class8524.field38282), var2);
   }

   private static int method37675(CommandContext<Class6619> var0, ResourceLocation var1, BlockPos var2, ItemStack var3, Class8914 var4) throws CommandSyntaxException {
      Class6619 var7 = (Class6619)var0.getSource();
      LootContext var8 = new Class9464(var7.method20172())
         .method36454(Class9525.field44335, Vector3d.method11328(var2))
         .method36454(Class9525.field44338, var3)
         .method36455(Class9525.field44330, var7.method20173())
         .method36460(Class8524.field38285);
      return method37676(var0, var1, var8, var4);
   }

   private static int method37676(CommandContext<Class6619> var0, ResourceLocation var1, LootContext var2, Class8914 var3) throws CommandSyntaxException {
      Class6619 var6 = (Class6619)var0.getSource();
      Class7318 var7 = var6.method20177().method1411().method1058(var1);
      List var8 = var7.method23182(var2);
      return var3.method32583(var0, var8, var1x -> method37669(var6, var1x));
   }
}
