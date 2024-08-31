package mapped;

import com.google.common.collect.Maps;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;

import java.util.*;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class9748 {
   private static final Map<String, Class9034> field45498 = Maps.newHashMap();
   public static final DynamicCommandExceptionType field45499 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("argument.entity.options.unknown", var0)
   );
   public static final DynamicCommandExceptionType field45500 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("argument.entity.options.inapplicable", var0)
   );
   public static final SimpleCommandExceptionType field45501 = new SimpleCommandExceptionType(
      new TranslationTextComponent("argument.entity.options.distance.negative")
   );
   public static final SimpleCommandExceptionType field45502 = new SimpleCommandExceptionType(
      new TranslationTextComponent("argument.entity.options.level.negative")
   );
   public static final SimpleCommandExceptionType field45503 = new SimpleCommandExceptionType(
      new TranslationTextComponent("argument.entity.options.limit.toosmall")
   );
   public static final DynamicCommandExceptionType field45504 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("argument.entity.options.sort.irreversible", var0)
   );
   public static final DynamicCommandExceptionType field45505 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("argument.entity.options.mode.invalid", var0)
   );
   public static final DynamicCommandExceptionType field45506 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("argument.entity.options.type.invalid", var0)
   );

   private static void method38218(String var0, Class8642 var1, Predicate<Class8533> var2, ITextComponent var3) {
      field45498.put(var0, new Class9034(var1, var2, var3));
   }

   public static void method38219() {
      if (field45498.isEmpty()) {
         method38218("name", var0 -> {
            int var3 = var0.method30277().getCursor();
            boolean var4 = var0.method30275();
            String var5 = var0.method30277().readString();
            if (var0.method30317() && !var4) {
               var0.method30277().setCursor(var3);
               throw field45500.createWithContext(var0.method30277(), "name");
            } else {
               if (!var4) {
                  var0.method30316(true);
               } else {
                  var0.method30318(true);
               }

               var0.method30278(var2 -> var2.getName().getString().equals(var5) != var4);
            }
         }, var0 -> !var0.method30315(), new TranslationTextComponent("argument.entity.options.name.description"));
         method38218("distance", var0 -> {
            int var3 = var0.method30277().getCursor();
            Class8841 var4 = Class8841.method32026(var0.method30277());
            if (var4.method32002() != null && var4.method32002() < 0.0F || var4.method32003() != null && var4.method32003() < 0.0F) {
               var0.method30277().setCursor(var3);
               throw field45501.createWithContext(var0.method30277());
            } else {
               var0.method30281(var4);
               var0.method30279();
            }
         }, var0 -> var0.method30280().method32004(), new TranslationTextComponent("argument.entity.options.distance.description"));
         method38218("level", var0 -> {
            int var3 = var0.method30277().getCursor();
            Class8840 var4 = Class8840.method32017(var0.method30277());
            if (var4.method32002() != null && var4.method32002() < 0 || var4.method32003() != null && var4.method32003() < 0) {
               var0.method30277().setCursor(var3);
               throw field45502.createWithContext(var0.method30277());
            } else {
               var0.method30283(var4);
               var0.method30301(false);
            }
         }, var0 -> var0.method30282().method32004(), new TranslationTextComponent("argument.entity.options.level.description"));
         method38218("x", var0 -> {
            var0.method30279();
            var0.method30291(var0.method30277().readDouble());
         }, var0 -> var0.method30288() == null, new TranslationTextComponent("argument.entity.options.x.description"));
         method38218("y", var0 -> {
            var0.method30279();
            var0.method30292(var0.method30277().readDouble());
         }, var0 -> var0.method30289() == null, new TranslationTextComponent("argument.entity.options.y.description"));
         method38218("z", var0 -> {
            var0.method30279();
            var0.method30293(var0.method30277().readDouble());
         }, var0 -> var0.method30290() == null, new TranslationTextComponent("argument.entity.options.z.description"));
         method38218("dx", var0 -> {
            var0.method30279();
            var0.method30294(var0.method30277().readDouble());
         }, var0 -> var0.method30297() == null, new TranslationTextComponent("argument.entity.options.dx.description"));
         method38218("dy", var0 -> {
            var0.method30279();
            var0.method30295(var0.method30277().readDouble());
         }, var0 -> var0.method30298() == null, new TranslationTextComponent("argument.entity.options.dy.description"));
         method38218("dz", var0 -> {
            var0.method30279();
            var0.method30296(var0.method30277().readDouble());
         }, var0 -> var0.method30299() == null, new TranslationTextComponent("argument.entity.options.dz.description"));
         method38218(
            "x_rotation",
            var0 -> var0.method30285(Class9795.method38632(var0.method30277(), true, MathHelper::method37792)),
            var0 -> var0.method30284() == Class9795.field45809,
            new TranslationTextComponent("argument.entity.options.x_rotation.description")
         );
         method38218(
            "y_rotation",
            var0 -> var0.method30287(Class9795.method38632(var0.method30277(), true, MathHelper::method37792)),
            var0 -> var0.method30286() == Class9795.field45809,
            new TranslationTextComponent("argument.entity.options.y_rotation.description")
         );
         method38218("limit", var0 -> {
            int var3 = var0.method30277().getCursor();
            int var4 = var0.method30277().readInt();
            if (var4 >= 1) {
               var0.method30300(var4);
               var0.method30320(true);
            } else {
               var0.method30277().setCursor(var3);
               throw field45503.createWithContext(var0.method30277());
            }
         }, var0 -> !var0.method30312() && !var0.method30319(), new TranslationTextComponent("argument.entity.options.limit.description"));
         method38218("sort", var0 -> {
            int var3 = var0.method30277().getCursor();
            String var4 = var0.method30277().readUnquotedString();
            var0.method30313((var0x, var1) -> Class6618.method20147(Arrays.<String>asList("nearest", "furthest", "random", "arbitrary"), var0x));
            BiConsumer var7;
            switch (var4) {
               case "nearest":
                  var7 = Class8533.field38335;
                  break;
               case "furthest":
                  var7 = Class8533.field38336;
                  break;
               case "random":
                  var7 = Class8533.field38337;
                  break;
               case "arbitrary":
                  var7 = Class8533.field38334;
                  break;
               default:
                  var0.method30277().setCursor(var3);
                  throw field45504.createWithContext(var0.method30277(), var4);
            }

            var0.method30302(var7);
            var0.method30322(true);
         }, var0 -> !var0.method30312() && !var0.method30321(), new TranslationTextComponent("argument.entity.options.sort.description"));
         method38218("gamemode", var0 -> {
            var0.method30313((var1, var2) -> {
               String var5x = var1.getRemaining().toLowerCase(Locale.ROOT);
               boolean var6x = !var0.method30325();
               boolean var7 = true;
               if (!var5x.isEmpty()) {
                  if (var5x.charAt(0) != '!') {
                     var7 = false;
                  } else {
                     var6x = false;
                     var5x = var5x.substring(1);
                  }
               }

               for (Class1894 var11 : Class1894.values()) {
                  if (var11 != Class1894.field11101 && var11.method8153().toLowerCase(Locale.ROOT).startsWith(var5x)) {
                     if (var7) {
                        var1.suggest('!' + var11.method8153());
                     }

                     if (var6x) {
                        var1.suggest(var11.method8153());
                     }
                  }
               }

               return var1.buildFuture();
            });
            int var3 = var0.method30277().getCursor();
            boolean var4 = var0.method30275();
            if (var0.method30325() && !var4) {
               var0.method30277().setCursor(var3);
               throw field45500.createWithContext(var0.method30277(), "gamemode");
            } else {
               String var5 = var0.method30277().readUnquotedString();
               Class1894 var6 = Class1894.method8162(var5, Class1894.field11101);
               if (var6 != Class1894.field11101) {
                  var0.method30301(false);
                  var0.method30278(var2 -> {
                     if (var2 instanceof ServerPlayerEntity) {
                        Class1894 var5x = ((ServerPlayerEntity)var2).field4857.method33863();
                        return !var4 ? var5x == var6 : var5x != var6;
                     } else {
                        return false;
                     }
                  });
                  if (!var4) {
                     var0.method30324(true);
                  } else {
                     var0.method30326(true);
                  }
               } else {
                  var0.method30277().setCursor(var3);
                  throw field45505.createWithContext(var0.method30277(), var5);
               }
            }
         }, var0 -> !var0.method30323(), new TranslationTextComponent("argument.entity.options.gamemode.description"));
         method38218("team", var0 -> {
            boolean var3 = var0.method30275();
            String var4 = var0.method30277().readUnquotedString();
            var0.method30278(var2 -> {
               if (var2 instanceof LivingEntity) {
                  Team var5 = var2.getTeam();
                  String var6 = var5 != null ? var5.method28567() : "";
                  return var6.equals(var4) != var3;
               } else {
                  return false;
               }
            });
            if (!var3) {
               var0.method30328(true);
            } else {
               var0.method30329(true);
            }
         }, var0 -> !var0.method30327(), new TranslationTextComponent("argument.entity.options.team.description"));
         method38218("type", var0 -> {
            var0.method30313((var1, var2) -> {
               Class6618.method20140(Registry.ENTITY_TYPE.method9190(), var1, String.valueOf('!'));
               Class6618.method20140(Class8613.method30861().method27137(), var1, "!#");
               if (!var0.method30333()) {
                  Class6618.method20141(Registry.ENTITY_TYPE.method9190(), var1);
                  Class6618.method20140(Class8613.method30861().method27137(), var1, String.valueOf('#'));
               }

               return var1.buildFuture();
            });
            int var3 = var0.method30277().getCursor();
            boolean var4 = var0.method30275();
            if (var0.method30333() && !var4) {
               var0.method30277().setCursor(var3);
               throw field45500.createWithContext(var0.method30277(), "type");
            } else {
               if (var4) {
                  var0.method30331();
               }

               if (!var0.method30276()) {
                  ResourceLocation var5 = ResourceLocation.method8294(var0.method30277());
                  EntityType var6 = Registry.ENTITY_TYPE.method9187(var5).orElseThrow(() -> {
                     var0.method30277().setCursor(var3);
                     return field45506.createWithContext(var0.method30277(), var5.toString());
                  });
                  if (Objects.equals(EntityType.PLAYER, var6) && !var4) {
                     var0.method30301(false);
                  }

                  var0.method30278(var2 -> Objects.equals(var6, var2.getType()) != var4);
                  if (!var4) {
                     var0.method30330(var6);
                  }
               } else {
                  ResourceLocation var7 = ResourceLocation.method8294(var0.method30277());
                  var0.method30278(var2 -> var2.method3396().method1408().method32660().method27132(var7).method24917(var2.getType()) != var4);
               }
            }
         }, var0 -> !var0.method30332(), new TranslationTextComponent("argument.entity.options.type.description"));
         method38218("tag", var0 -> {
            boolean var3 = var0.method30275();
            String var4 = var0.method30277().readUnquotedString();
            var0.method30278(var2 -> !"".equals(var4) ? var2.method3207().contains(var4) != var3 : var2.method3207().isEmpty() != var3);
         }, var0 -> true, new TranslationTextComponent("argument.entity.options.tag.description"));
         method38218("nbt", var0 -> {
            boolean var3 = var0.method30275();
            CompoundNBT var4 = new Class7671(var0.method30277()).method25195();
            var0.method30278(var2 -> {
               CompoundNBT var5 = var2.method3294(new CompoundNBT());
               if (var2 instanceof ServerPlayerEntity) {
                  ItemStack var6 = ((ServerPlayerEntity)var2).inventory.method4028();
                  if (!var6.isEmpty()) {
                     var5.put("SelectedItem", var6.method32112(new CompoundNBT()));
                  }
               }

               return Class8354.method29280(var4, var5, true) != var3;
            });
         }, var0 -> true, new TranslationTextComponent("argument.entity.options.nbt.description"));
         method38218("scores", var0 -> {
            StringReader var3 = var0.method30277();
            HashMap<String, Class8840> var4 = Maps.newHashMap();
            var3.expect('{');
            var3.skipWhitespace();

            while (var3.canRead() && var3.peek() != '}') {
               var3.skipWhitespace();
               String var5 = var3.readUnquotedString();
               var3.skipWhitespace();
               var3.expect('=');
               var3.skipWhitespace();
               Class8840 var6 = Class8840.method32017(var3);
               var4.put(var5, var6);
               var3.skipWhitespace();
               if (var3.canRead() && var3.peek() == ',') {
                  var3.skip();
               }
            }

            var3.expect('}');
            if (!var4.isEmpty()) {
               var0.method30278(var1 -> {
                  Class6887 var4x = var1.method3396().method1409();
                  String var5x = var1.method2956();

                  for (Entry var7 : var4.entrySet()) {
                     Class8375 var8 = var4x.method20976((String)var7.getKey());
                     if (var8 == null) {
                        return false;
                     }

                     if (!var4x.method20979(var5x, var8)) {
                        return false;
                     }

                     Class9411 var9 = var4x.method20980(var5x, var8);
                     int var10 = var9.method36050();
                     if (!((Class8840)var7.getValue()).method32015(var10)) {
                        return false;
                     }
                  }

                  return true;
               });
            }

            var0.method30335(true);
         }, var0 -> !var0.method30334(), new TranslationTextComponent("argument.entity.options.scores.description"));
         method38218("advancements", var0 -> {
            StringReader var3 = var0.method30277();
            HashMap<ResourceLocation, Predicate<Class2006>> var4 = Maps.newHashMap();
            var3.expect('{');
            var3.skipWhitespace();

            while (var3.canRead() && var3.peek() != '}') {
               var3.skipWhitespace();
               ResourceLocation var5 = ResourceLocation.method8294(var3);
               var3.skipWhitespace();
               var3.expect('=');
               var3.skipWhitespace();
               if (var3.canRead() && var3.peek() == '{') {
                  HashMap<String, Predicate<Class9599>> var9 = Maps.newHashMap();
                  var3.skipWhitespace();
                  var3.expect('{');
                  var3.skipWhitespace();

                  while (var3.canRead() && var3.peek() != '}') {
                     var3.skipWhitespace();
                     String var7 = var3.readUnquotedString();
                     var3.skipWhitespace();
                     var3.expect('=');
                     var3.skipWhitespace();
                     boolean var8 = var3.readBoolean();
                     var9.put(var7, var1 -> var1.method37263() == var8);
                     var3.skipWhitespace();
                     if (var3.canRead() && var3.peek() == ',') {
                        var3.skip();
                     }
                  }

                  var3.skipWhitespace();
                  var3.expect('}');
                  var3.skipWhitespace();
                  var4.put(var5, var1 -> {
                     for (Entry var5x : var9.entrySet()) {
                        Class9599 var6x = var1.method8495((String)var5x.getKey());
                        if (var6x == null || !((Predicate)var5x.getValue()).test(var6x)) {
                           return false;
                        }
                     }

                     return true;
                  });
               } else {
                  boolean var6 = var3.readBoolean();
                  var4.put(var5, var1 -> var1.method8489() == var6);
               }

               var3.skipWhitespace();
               if (var3.canRead() && var3.peek() == ',') {
                  var3.skip();
               }
            }

            var3.expect('}');
            if (!var4.isEmpty()) {
               var0.method30278(var1 -> {
                  if (!(var1 instanceof ServerPlayerEntity)) {
                     return false;
                  } else {
                     ServerPlayerEntity var4x = (ServerPlayerEntity)var1;
                     Class8019 var5x = var4x.method2823();
                     Class285 var6x = var4x.method3396().method1396();

                     for (Entry var8x : var4.entrySet()) {
                        Class7952 var9x = var6x.method1065((ResourceLocation)var8x.getKey());
                        if (var9x == null || !((Predicate)var8x.getValue()).test(var5x.method27416(var9x))) {
                           return false;
                        }
                     }

                     return true;
                  }
               });
               var0.method30301(false);
            }

            var0.method30337(true);
         }, var0 -> !var0.method30336(), new TranslationTextComponent("argument.entity.options.advancements.description"));
         method38218(
            "predicate",
            var0 -> {
               boolean var3 = var0.method30275();
               ResourceLocation var4 = ResourceLocation.method8294(var0.method30277());
               var0.method30278(
                  var2 -> {
                     if (var2.world instanceof ServerWorld) {
                        ServerWorld var5 = (ServerWorld)var2.world;
                        ILootCondition var6 = var5.getServer().method1412().method1052(var4);
                        if (var6 != null) {
                           LootContext var7 = new Class9464(var5)
                              .method36454(Class9525.field44330, var2)
                              .method36454(Class9525.field44335, var2.getPositionVec())
                              .method36460(Class8524.field38284);
                           return var3 ^ var6.test(var7);
                        } else {
                           return false;
                        }
                     } else {
                        return false;
                     }
                  }
               );
            },
            var0 -> true,
            new TranslationTextComponent("argument.entity.options.predicate.description")
         );
      }
   }

   public static Class8642 method38220(Class8533 var0, String var1, int var2) throws CommandSyntaxException {
      Class9034 var5 = field45498.get(var1);
      if (var5 == null) {
         var0.method30277().setCursor(var2);
         throw field45499.createWithContext(var0.method30277(), var1);
      } else if (!var5.field41335.test(var0)) {
         throw field45500.createWithContext(var0.method30277(), var1);
      } else {
         return var5.field41334;
      }
   }

   public static void method38221(Class8533 var0, SuggestionsBuilder var1) {
      String var4 = var1.getRemaining().toLowerCase(Locale.ROOT);

      for (Entry var6 : field45498.entrySet()) {
         if (((Class9034)var6.getValue()).field41335.test(var0) && ((String)var6.getKey()).toLowerCase(Locale.ROOT).startsWith(var4)) {
            var1.suggest((String)var6.getKey() + '=', ((Class9034)var6.getValue()).field41336);
         }
      }
   }
}
