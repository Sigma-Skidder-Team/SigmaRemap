package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import net.minecraft.util.text.TranslationTextComponent;

public class Class8158 {
   private static final SimpleCommandExceptionType field35105 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.data.merge.failed"));
   private static final DynamicCommandExceptionType field35106 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("commands.data.get.invalid", var0)
   );
   private static final DynamicCommandExceptionType field35107 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("commands.data.get.unknown", var0)
   );
   private static final SimpleCommandExceptionType field35108 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.data.get.multiple"));
   private static final DynamicCommandExceptionType field35109 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("commands.data.modify.expected_list", var0)
   );
   private static final DynamicCommandExceptionType field35110 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("commands.data.modify.expected_object", var0)
   );
   private static final DynamicCommandExceptionType field35111 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("commands.data.modify.invalid_index", var0)
   );
   public static final List<Function<String, Class8196>> field35112 = ImmutableList.of(Class7154.field30732, Class7152.field30724, Class7153.field30728);
   public static final List<Class8196> field35113 = field35112.stream().<Class8196>map(var0 -> var0.apply("target")).collect(ImmutableList.toImmutableList());
   public static final List<Class8196> field35114 = field35112.stream().<Class8196>map(var0 -> var0.apply("source")).collect(ImmutableList.toImmutableList());

   public static void method28315(CommandDispatcher<Class6619> var0) {
      LiteralArgumentBuilder var3 = (LiteralArgumentBuilder)Class6099.method18839("data").requires(var0x -> var0x.method20129(2));

      for (Class8196 var5 : field35113) {
         ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)var3.then(
                     var5.method28504(
                        Class6099.method18839("merge"),
                        var1 -> var1.then(
                              Class6099.method18840("nbt", Class9770.method38432())
                                 .executes(var1x -> method28324((Class6619)var1x.getSource(), var5.method28503(var1x), Class9770.method38433(var1x, "nbt")))
                           )
                     )
                  ))
                  .then(
                     var5.method28504(
                        Class6099.method18839("get"),
                        var1 -> var1.executes(var1x -> method28323((Class6619)var1x.getSource(), var5.method28503(var1x)))
                              .then(
                                 ((RequiredArgumentBuilder)Class6099.method18840("path", Class8320.method29128())
                                       .executes(
                                          var1x -> method28321((Class6619)var1x.getSource(), var5.method28503(var1x), Class8320.method29129(var1x, "path"))
                                       ))
                                    .then(
                                       Class6099.method18840("scale", DoubleArgumentType.doubleArg())
                                          .executes(
                                             var1x -> method28322(
                                                   (Class6619)var1x.getSource(),
                                                   var5.method28503(var1x),
                                                   Class8320.method29129(var1x, "path"),
                                                   DoubleArgumentType.getDouble(var1x, "scale")
                                                )
                                          )
                                    )
                              )
                     )
                  ))
               .then(
                  var5.method28504(
                     Class6099.method18839("remove"),
                     var1 -> var1.then(
                           Class6099.method18840("path", Class8320.method29128())
                              .executes(var1x -> method28319((Class6619)var1x.getSource(), var5.method28503(var1x), Class8320.method29129(var1x, "path")))
                        )
                  )
               ))
            .then(
               method28317(
                  (var0x, var1) -> var0x.then(
                           Class6099.method18839("insert")
                              .then(Class6099.method18840("index", IntegerArgumentType.integer()).then(var1.method25731((var0xx, var1x, var2, var3x) -> {
                                 int var6 = IntegerArgumentType.getInteger(var0xx, "index");
                                 return method28316(var6, var1x, var2, var3x);
                              })))
                        )
                        .then(Class6099.method18839("prepend").then(var1.method25731((var0xx, var1x, var2, var3x) -> method28316(0, var1x, var2, var3x))))
                        .then(Class6099.method18839("append").then(var1.method25731((var0xx, var1x, var2, var3x) -> method28316(-1, var1x, var2, var3x))))
                        .then(
                           Class6099.method18839("set")
                              .then(var1.method25731((var0xx, var1x, var2, var3x) -> var2.method37730(var1x, ((Class30)Iterables.getLast(var3x))::method79)))
                        )
                        .then(Class6099.method18839("merge").then(var1.method25731((var0xx, var1x, var2, var3x) -> {
                           List<Class30> var6 = var2.method37728(var1x, Class39::new);
                           int var7 = 0;

                           for (Class30 var9 : var6) {
                              if (!(var9 instanceof Class39)) {
                                 throw field35110.create(var9);
                              }

                              Class39 var10 = (Class39)var9;
                              Class39 var11 = var10.method79();

                              for (Class30 var13 : var3x) {
                                 if (!(var13 instanceof Class39)) {
                                    throw field35110.create(var13);
                                 }

                                 var10.method140((Class39)var13);
                              }

                              var7 += !var11.equals(var10) ? 1 : 0;
                           }

                           return var7;
                        })))
               )
            );
      }

      var0.register(var3);
   }

   private static int method28316(int var0, Class39 var1, Class9670 var2, List<Class30> var3) throws CommandSyntaxException {
      List<Class30> var6 = var2.method37728(var1, Class41::new);
      int var7 = 0;

      for (Class30 var9 : var6) {
         if (!(var9 instanceof Class27)) {
            throw field35109.create(var9);
         }

         boolean var10 = false;
         Class27 var11 = (Class27)var9;
         int var12 = var0 < 0 ? var11.size() + var0 + 1 : var0;

         for (Class30 var14 : var3) {
            try {
               if (var11.method71(var12, var14.method79())) {
                  var12++;
                  var10 = true;
               }
            } catch (IndexOutOfBoundsException var16) {
               throw field35111.create(var12);
            }
         }

         var7 += var10 ? 1 : 0;
      }

      return var7;
   }

   private static ArgumentBuilder<Class6619, ?> method28317(BiConsumer<ArgumentBuilder<Class6619, ?>, Class7761> var0) {
      LiteralArgumentBuilder var3 = Class6099.method18839("modify");

      for (Class8196 var5 : field35113) {
         var5.method28504(var3, var2 -> {
            RequiredArgumentBuilder var5x = Class6099.method18840("targetPath", Class8320.method29128());

            for (Class8196 var7 : field35114) {
               var0.accept(var5x, var2x -> var7.method28504(Class6099.method18839("from"), var3x -> var3x.executes(var3xx -> {
                        List var6 = Collections.<Class39>singletonList(var7.method28503(var3xx).method22312());
                        return method28318(var3xx, var5, var2x, var6);
                     }).then(Class6099.method18840("sourcePath", Class8320.method29128()).executes(var3xx -> {
                        Class7151 var6 = var7.method28503(var3xx);
                        Class9670 var7x = Class8320.method29129(var3xx, "sourcePath");
                        List var8 = var7x.method37725(var6.method22312());
                        return method28318(var3xx, var5, var2x, var8);
                     }))));
            }

            var0.accept(var5x, var1x -> Class6099.method18839("value").then(Class6099.method18840("value", Class8780.method31660()).executes(var2x -> {
                  List var5xx = Collections.<Class30>singletonList(Class8780.method31661(var2x, "value"));
                  return method28318(var2x, var5, var1x, var5xx);
               })));
            return var2.then(var5x);
         });
      }

      return var3;
   }

   private static int method28318(CommandContext<Class6619> var0, Class8196 var1, Class7823 var2, List<Class30> var3) throws CommandSyntaxException {
      Class7151 var6 = var1.method28503(var0);
      Class9670 var7 = Class8320.method29129(var0, "targetPath");
      Class39 var8 = var6.method22312();
      int var9 = var2.method26160(var0, var8, var7, var3);
      if (var9 != 0) {
         var6.method22311(var8);
         ((Class6619)var0.getSource()).method20179(var6.method22313(), true);
         return var9;
      } else {
         throw field35105.create();
      }
   }

   private static int method28319(Class6619 var0, Class7151 var1, Class9670 var2) throws CommandSyntaxException {
      Class39 var5 = var1.method22312();
      int var6 = var2.method37731(var5);
      if (var6 != 0) {
         var1.method22311(var5);
         var0.method20179(var1.method22313(), true);
         return var6;
      } else {
         throw field35105.create();
      }
   }

   private static Class30 method28320(Class9670 var0, Class7151 var1) throws CommandSyntaxException {
      List var4 = var0.method37725(var1.method22312());
      Iterator var5 = var4.iterator();
      Class30 var6 = (Class30)var5.next();
      if (!var5.hasNext()) {
         return var6;
      } else {
         throw field35108.create();
      }
   }

   private static int method28321(Class6619 var0, Class7151 var1, Class9670 var2) throws CommandSyntaxException {
      Class30 var5 = method28320(var2, var1);
      int var6;
      if (!(var5 instanceof Class31)) {
         if (!(var5 instanceof Class27)) {
            if (!(var5 instanceof Class39)) {
               if (!(var5 instanceof Class40)) {
                  throw field35107.create(var2.toString());
               }

               var6 = var5.method81().length();
            } else {
               var6 = ((Class39)var5).method98();
            }
         } else {
            var6 = ((Class27)var5).size();
         }
      } else {
         var6 = Class9679.method37769(((Class31)var5).method87());
      }

      var0.method20179(var1.method22314(var5), false);
      return var6;
   }

   private static int method28322(Class6619 var0, Class7151 var1, Class9670 var2, double var3) throws CommandSyntaxException {
      Class30 var7 = method28320(var2, var1);
      if (var7 instanceof Class31) {
         int var8 = Class9679.method37769(((Class31)var7).method87() * var3);
         var0.method20179(var1.method22315(var2, var3, var8), false);
         return var8;
      } else {
         throw field35106.create(var2.toString());
      }
   }

   private static int method28323(Class6619 var0, Class7151 var1) throws CommandSyntaxException {
      var0.method20179(var1.method22314(var1.method22312()), false);
      return 1;
   }

   private static int method28324(Class6619 var0, Class7151 var1, Class39 var2) throws CommandSyntaxException {
      Class39 var5 = var1.method22312();
      Class39 var6 = var5.method79().method140(var2);
      if (!var5.equals(var6)) {
         var1.method22311(var6);
         var0.method20179(var1.method22313(), true);
         return 1;
      } else {
         throw field35105.create();
      }
   }
}
