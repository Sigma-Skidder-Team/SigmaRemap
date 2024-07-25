package remapped;

import com.google.common.collect.Maps;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_9558 {
   private static final Map<String, class_6760> field_48624 = Maps.newHashMap();
   public static final DynamicCommandExceptionType field_48630 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("argument.entity.options.unknown", var0)
   );
   public static final DynamicCommandExceptionType field_48625 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("argument.entity.options.inapplicable", var0)
   );
   public static final SimpleCommandExceptionType field_48632 = new SimpleCommandExceptionType(
      new TranslationTextComponent("argument.entity.options.distance.negative")
   );
   public static final SimpleCommandExceptionType field_48629 = new SimpleCommandExceptionType(
      new TranslationTextComponent("argument.entity.options.level.negative")
   );
   public static final SimpleCommandExceptionType field_48626 = new SimpleCommandExceptionType(
      new TranslationTextComponent("argument.entity.options.limit.toosmall")
   );
   public static final DynamicCommandExceptionType field_48631 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("argument.entity.options.sort.irreversible", var0)
   );
   public static final DynamicCommandExceptionType field_48628 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("argument.entity.options.mode.invalid", var0)
   );
   public static final DynamicCommandExceptionType field_48633 = new DynamicCommandExceptionType(
      var0 -> new TranslationTextComponent("argument.entity.options.type.invalid", var0)
   );

   private static void method_44159(String var0, class_5353 var1, Predicate<class_4964> var2, ITextComponent var3) {
      field_48624.put(var0, new class_6760(var1, var2, var3, null));
   }

   public static void method_44158() {
      if (field_48624.isEmpty()) {
         method_44159("name", var0 -> {
            int var3 = var0.method_22749().getCursor();
            boolean var4 = var0.method_22796();
            String var5 = var0.method_22749().readString();
            if (var0.method_22753() && !var4) {
               var0.method_22749().setCursor(var3);
               throw field_48625.createWithContext(var0.method_22749(), "name");
            } else {
               if (!var4) {
                  var0.method_22782(true);
               } else {
                  var0.method_22757(true);
               }

               var0.method_22758(var2 -> var2.method_45509().getString().equals(var5) != var4);
            }
         }, var0 -> !var0.method_22748(), new TranslationTextComponent("argument.entity.options.name.description"));
         method_44159("distance", var0 -> {
            int var3 = var0.method_22749().getCursor();
            class_6115 var4 = class_6115.method_28091(var0.method_22749());
            if (var4.method_27854() != null && var4.method_27854() < 0.0F || var4.method_27855() != null && var4.method_27855() < 0.0F) {
               var0.method_22749().setCursor(var3);
               throw field_48632.createWithContext(var0.method_22749());
            } else {
               var0.method_22747(var4);
               var0.method_22785();
            }
         }, var0 -> var0.method_22799().method_27852(), new TranslationTextComponent("argument.entity.options.distance.description"));
         method_44159("level", var0 -> {
            int var3 = var0.method_22749().getCursor();
            class_7781 var4 = class_7781.method_35308(var0.method_22749());
            if (var4.method_27854() != null && var4.method_27854() < 0 || var4.method_27855() != null && var4.method_27855() < 0) {
               var0.method_22749().setCursor(var3);
               throw field_48629.createWithContext(var0.method_22749());
            } else {
               var0.method_22772(var4);
               var0.method_22768(false);
            }
         }, var0 -> var0.method_22779().method_27852(), new TranslationTextComponent("argument.entity.options.level.description"));
         method_44159("x", var0 -> {
            var0.method_22785();
            var0.method_22798(var0.method_22749().readDouble());
         }, var0 -> var0.method_22789() == null, new TranslationTextComponent("argument.entity.options.x.description"));
         method_44159("y", var0 -> {
            var0.method_22785();
            var0.method_22787(var0.method_22749().readDouble());
         }, var0 -> var0.method_22741() == null, new TranslationTextComponent("argument.entity.options.y.description"));
         method_44159("z", var0 -> {
            var0.method_22785();
            var0.method_22766(var0.method_22749().readDouble());
         }, var0 -> var0.method_22778() == null, new TranslationTextComponent("argument.entity.options.z.description"));
         method_44159("dx", var0 -> {
            var0.method_22785();
            var0.method_22788(var0.method_22749().readDouble());
         }, var0 -> var0.method_22792() == null, new TranslationTextComponent("argument.entity.options.dx.description"));
         method_44159("dy", var0 -> {
            var0.method_22785();
            var0.method_22790(var0.method_22749().readDouble());
         }, var0 -> var0.method_22803() == null, new TranslationTextComponent("argument.entity.options.dy.description"));
         method_44159("dz", var0 -> {
            var0.method_22785();
            var0.method_22759(var0.method_22749().readDouble());
         }, var0 -> var0.method_22752() == null, new TranslationTextComponent("argument.entity.options.dz.description"));
         method_44159(
            "x_rotation",
            var0 -> var0.method_22763(class_9721.method_44918(var0.method_22749(), true, MathHelper::wrapDegrees)),
            var0 -> var0.method_22746() == class_9721.field_49421,
            new TranslationTextComponent("argument.entity.options.x_rotation.description")
         );
         method_44159(
            "y_rotation",
            var0 -> var0.method_22775(class_9721.method_44918(var0.method_22749(), true, MathHelper::wrapDegrees)),
            var0 -> var0.method_22765() == class_9721.field_49421,
            new TranslationTextComponent("argument.entity.options.y_rotation.description")
         );
         method_44159("limit", var0 -> {
            int var3 = var0.method_22749().getCursor();
            int var4 = var0.method_22749().readInt();
            if (var4 >= 1) {
               var0.method_22745(var4);
               var0.method_22770(true);
            } else {
               var0.method_22749().setCursor(var3);
               throw field_48626.createWithContext(var0.method_22749());
            }
         }, var0 -> !var0.method_22783() && !var0.method_22773(), new TranslationTextComponent("argument.entity.options.limit.description"));
         method_44159("sort", var0 -> {
            int var3 = var0.method_22749().getCursor();
            String var4 = var0.method_22749().readUnquotedString();
            var0.method_22776((var0x, var1) -> class_8773.method_40319(Arrays.<String>asList("nearest", "furthest", "random", "arbitrary"), var0x));
            BiConsumer var7;
            switch (var4) {
               case "nearest":
                  var7 = class_4964.field_25697;
                  break;
               case "furthest":
                  var7 = class_4964.field_25703;
                  break;
               case "random":
                  var7 = class_4964.field_25696;
                  break;
               case "arbitrary":
                  var7 = class_4964.field_25668;
                  break;
               default:
                  var0.method_22749().setCursor(var3);
                  throw field_48631.createWithContext(var0.method_22749(), var4);
            }

            var0.method_22806(var7);
            var0.method_22760(true);
         }, var0 -> !var0.method_22783() && !var0.method_22771(), new TranslationTextComponent("argument.entity.options.sort.description"));
         method_44159("gamemode", var0 -> {
            var0.method_22776((var1, var2) -> {
               String var5x = var1.getRemaining().toLowerCase(Locale.ROOT);
               boolean var6x = !var0.method_22780();
               boolean var7 = true;
               if (!var5x.isEmpty()) {
                  if (var5x.charAt(0) != '!') {
                     var7 = false;
                  } else {
                     var6x = false;
                     var5x = var5x.substring(1);
                  }
               }

               for (GameType var11 : GameType.values()) {
                  if (var11 != GameType.NOT_SET && var11.getName().toLowerCase(Locale.ROOT).startsWith(var5x)) {
                     if (var7) {
                        var1.suggest('!' + var11.getName());
                     }

                     if (var6x) {
                        var1.suggest(var11.getName());
                     }
                  }
               }

               return var1.buildFuture();
            });
            int var3 = var0.method_22749().getCursor();
            boolean var4 = var0.method_22796();
            if (var0.method_22780() && !var4) {
               var0.method_22749().setCursor(var3);
               throw field_48625.createWithContext(var0.method_22749(), "gamemode");
            } else {
               String var5 = var0.method_22749().readUnquotedString();
               GameType var6 = GameType.method_21595(var5, GameType.NOT_SET);
               if (var6 != GameType.NOT_SET) {
                  var0.method_22768(false);
                  var0.method_22758(var2 -> {
                     if (var2 instanceof class_9359) {
                        GameType var5x = ((class_9359)var2).field_47807.method_39517();
                        return !var4 ? var5x == var6 : var5x != var6;
                     } else {
                        return false;
                     }
                  });
                  if (!var4) {
                     var0.method_22762(true);
                  } else {
                     var0.method_22794(true);
                  }
               } else {
                  var0.method_22749().setCursor(var3);
                  throw field_48628.createWithContext(var0.method_22749(), var5);
               }
            }
         }, var0 -> !var0.method_22767(), new TranslationTextComponent("argument.entity.options.gamemode.description"));
         method_44159("team", var0 -> {
            boolean var3 = var0.method_22796();
            String var4 = var0.method_22749().readUnquotedString();
            var0.method_22758(var2 -> {
               if (var2 instanceof LivingEntity) {
                  class_5086 var5 = var2.method_37095();
                  String var6 = var5 != null ? var5.method_23383() : "";
                  return var6.equals(var4) != var3;
               } else {
                  return false;
               }
            });
            if (!var3) {
               var0.method_22755(true);
            } else {
               var0.method_22784(true);
            }
         }, var0 -> !var0.method_22754(), new TranslationTextComponent("argument.entity.options.team.description"));
         method_44159("type", var0 -> {
            var0.method_22776((var1, var2) -> {
               class_8773.method_40325(class_8669.field_44400.method_39805(), var1, String.valueOf('!'));
               class_8773.method_40325(EntityTypeTags.getCollection().method_43141(), var1, "!#");
               if (!var0.method_22807()) {
                  class_8773.method_40324(class_8669.field_44400.method_39805(), var1);
                  class_8773.method_40325(EntityTypeTags.getCollection().method_43141(), var1, String.valueOf('#'));
               }

               return var1.buildFuture();
            });
            int var3 = var0.method_22749().getCursor();
            boolean var4 = var0.method_22796();
            if (var0.method_22807() && !var4) {
               var0.method_22749().setCursor(var3);
               throw field_48625.createWithContext(var0.method_22749(), "type");
            } else {
               if (var4) {
                  var0.method_22743();
               }

               if (!var0.method_22774()) {
                  Identifier var5 = Identifier.method_21464(var0.method_22749());
                  EntityType var6 = class_8669.field_44400.method_39794(var5).orElseThrow(() -> {
                     var0.method_22749().setCursor(var3);
                     return field_48633.createWithContext(var0.method_22749(), var5.toString());
                  });
                  if (Objects.equals(EntityType.field_34300, var6) && !var4) {
                     var0.method_22768(false);
                  }

                  var0.method_22758(var2 -> Objects.equals(var6, var2.getType()) != var4);
                  if (!var4) {
                     var0.method_22751(var6);
                  }
               } else {
                  Identifier var7 = Identifier.method_21464(var0.method_22749());
                  var0.method_22758(var2 -> var2.method_37268().method_1754().getEntityTypeTags().method_43145(var7).method_10609(var2.getType()) != var4);
               }
            }
         }, var0 -> !var0.method_22756(), new TranslationTextComponent("argument.entity.options.type.description"));
         method_44159("tag", var0 -> {
            boolean var3 = var0.method_22796();
            String var4 = var0.method_22749().readUnquotedString();
            var0.method_22758(var2 -> !"".equals(var4) ? var2.method_37293().contains(var4) != var3 : var2.method_37293().isEmpty() != var3);
         }, var0 -> true, new TranslationTextComponent("argument.entity.options.tag.description"));
         method_44159("nbt", var0 -> {
            boolean var3 = var0.method_22796();
            CompoundNBT var4 = new class_2392(var0.method_22749()).method_10905();
            var0.method_22758(var2 -> {
               CompoundNBT var5 = var2.method_37258(new CompoundNBT());
               if (var2 instanceof class_9359) {
                  ItemStack var6 = ((class_9359)var2).inventory.method_32403();
                  if (!var6.method_28022()) {
                     var5.put("SelectedItem", var6.method_27998(new CompoundNBT()));
                  }
               }

               return class_4338.method_20182(var4, var5, true) != var3;
            });
         }, var0 -> true, new TranslationTextComponent("argument.entity.options.nbt.description"));
         method_44159("scores", var0 -> {
            StringReader var3 = var0.method_22749();
            HashMap var4 = Maps.newHashMap();
            var3.expect('{');
            var3.skipWhitespace();

            while (var3.canRead() && var3.peek() != '}') {
               var3.skipWhitespace();
               String var5 = var3.readUnquotedString();
               var3.skipWhitespace();
               var3.expect('=');
               var3.skipWhitespace();
               class_7781 var6 = class_7781.method_35308(var3);
               var4.put(var5, var6);
               var3.skipWhitespace();
               if (var3.canRead() && var3.peek() == ',') {
                  var3.skip();
               }
            }

            var3.expect('}');
            if (!var4.isEmpty()) {
               var0.method_22758(var1 -> {
                  class_2917 var4x = var1.method_37268().method_1655();
                  String var5x = var1.method_37206();

                  for (Entry var7 : var4.entrySet()) {
                     class_4399 var8 = var4x.method_4858((String)var7.getKey());
                     if (var8 == null) {
                        return false;
                     }

                     if (!var4x.method_4857(var5x, var8)) {
                        return false;
                     }

                     class_8274 var9 = var4x.method_4855(var5x, var8);
                     int var10 = var9.method_38146();
                     if (!((class_7781)var7.getValue()).method_35307(var10)) {
                        return false;
                     }
                  }

                  return true;
               });
            }

            var0.method_22801(true);
         }, var0 -> !var0.method_22742(), new TranslationTextComponent("argument.entity.options.scores.description"));
         method_44159("advancements", var0 -> {
            StringReader var3 = var0.method_22749();
            HashMap var4 = Maps.newHashMap();
            var3.expect('{');
            var3.skipWhitespace();

            while (var3.canRead() && var3.peek() != '}') {
               var3.skipWhitespace();
               Identifier var5 = Identifier.method_21464(var3);
               var3.skipWhitespace();
               var3.expect('=');
               var3.skipWhitespace();
               if (var3.canRead() && var3.peek() == '{') {
                  HashMap var9 = Maps.newHashMap();
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
                     var9.put(var7, var1 -> var1.method_41192() == var8);
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
                        class_8984 var6x = var1.method_16820((String)var5x.getKey());
                        if (var6x == null || !((Predicate)var5x.getValue()).test(var6x)) {
                           return false;
                        }
                     }

                     return true;
                  });
               } else {
                  boolean var6 = var3.readBoolean();
                  var4.put(var5, var1 -> var1.method_16811() == var6);
               }

               var3.skipWhitespace();
               if (var3.canRead() && var3.peek() == ',') {
                  var3.skip();
               }
            }

            var3.expect('}');
            if (!var4.isEmpty()) {
               var0.method_22758(var1 -> {
                  if (!(var1 instanceof class_9359)) {
                     return false;
                  } else {
                     class_9359 var4x = (class_9359)var1;
                     class_3362 var5x = var4x.method_43253();
                     class_8873 var6x = var4x.method_37268().method_1703();

                     for (Entry var8x : var4.entrySet()) {
                        class_3139 var9x = var6x.method_40818((Identifier)var8x.getKey());
                        if (var9x == null || !((Predicate)var8x.getValue()).test(var5x.method_15389(var9x))) {
                           return false;
                        }
                     }

                     return true;
                  }
               });
               var0.method_22768(false);
            }

            var0.method_22795(true);
         }, var0 -> !var0.method_22793(), new TranslationTextComponent("argument.entity.options.advancements.description"));
         method_44159(
            "predicate",
            var0 -> {
               boolean var3 = var0.method_22796();
               Identifier var4 = Identifier.method_21464(var0.method_22749());
               var0.method_22758(
                  var2 -> {
                     if (var2.world instanceof class_6331) {
                        class_6331 var5 = (class_6331)var2.world;
                        class_7279 var6 = var5.method_29522().method_1676().method_1146(var4);
                        if (var6 != null) {
                           class_2792 var7 = new class_8480(var5)
                              .method_39065(class_8712.field_44676, var2)
                              .method_39065(class_8712.field_44671, var2.method_37245())
                              .method_39064(class_4933.field_25574);
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

   public static class_5353 method_44157(class_4964 var0, String var1, int var2) throws CommandSyntaxException {
      class_6760 var5 = field_48624.get(var1);
      if (var5 == null) {
         var0.method_22749().setCursor(var2);
         throw field_48630.createWithContext(var0.method_22749(), var1);
      } else if (!var5.field_34881.test(var0)) {
         throw field_48625.createWithContext(var0.method_22749(), var1);
      } else {
         return var5.field_34882;
      }
   }

   public static void method_44160(class_4964 var0, SuggestionsBuilder var1) {
      String var4 = var1.getRemaining().toLowerCase(Locale.ROOT);

      for (Entry var6 : field_48624.entrySet()) {
         if (((class_6760)var6.getValue()).field_34881.test(var0) && ((String)var6.getKey()).toLowerCase(Locale.ROOT).startsWith(var4)) {
            var1.suggest((String)var6.getKey() + '=', ((class_6760)var6.getValue()).field_34884);
         }
      }
   }
}
