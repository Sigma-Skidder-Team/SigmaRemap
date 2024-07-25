package remapped;

import com.google.common.primitives.Ints;
import java.util.Locale;
import java.util.Optional;

public class class_9330 {
   private static final String field_47638 = "ViaVersion|" + class_8633.class.getSimpleName();

   public static void method_43073(class_8633 var0) {
      class_3672 var3 = new class_3672(var0, class_9330::method_43074, class_9330::method_43071);
      var0.method_19015(class_2277.field_11364, new class_8858(var3));
      var0.method_19015(class_2277.field_11324, new class_3128(var3));
      var0.method_19015(class_2277.field_11369, new class_9534(var0));
      var0.method_19015(class_2277.field_11362, new class_5597());
      var0.method_19015(class_2277.field_11313, new class_840(var3));
      var0.method_18992(class_5975.field_30457, new class_5938(var3));
      var0.method_18992(class_5975.field_30464, new class_6270());
      var0.method_18992(class_5975.field_30455, new class_6118(var3));
   }

   public static void method_43074(class_9530 var0) {
      if (var0 != null) {
         class_5531 var3 = var0.method_43959();
         int var4 = var0.method_43963() << 16 | var0.method_43962() & '\uffff';
         int var5 = var0.method_43963() << 4 | var0.method_43962() & 15;
         if (method_43072(var0.method_43963())) {
            if (var3 == null) {
               var0.method_43960(var3 = new class_5531("tag"));
            }

            var3.<class_5232>method_25122(new class_5232("Damage", var0.method_43962()));
         }

         if (var0.method_43963() == 358) {
            if (var3 == null) {
               var0.method_43960(var3 = new class_5531("tag"));
            }

            var3.<class_5232>method_25122(new class_5232("map", var0.method_43962()));
         }

         if (var3 != null) {
            boolean var6 = var0.method_43963() == 425;
            if ((var6 || var0.method_43963() == 442) && var3.method_25123("BlockEntityTag") instanceof class_5531) {
               class_5531 var7 = var3.<class_5531>method_25123("BlockEntityTag");
               if (var7.method_25123("Base") instanceof class_5232) {
                  class_5232 var8 = var7.<class_5232>method_25123("Base");
                  if (var6) {
                     var5 = 6800 + var8.method_23973();
                  }

                  var8.method_23972(15 - var8.method_23973());
               }

               if (var7.method_25123("Patterns") instanceof class_913) {
                  for (class_5287 var9 : (class_913)var7.method_25123("Patterns")) {
                     if (var9 instanceof class_5531) {
                        class_5232 var10 = ((class_5531)var9).<class_5232>method_25123("Color");
                        var10.method_23972(15 - var10.method_23973());
                     }
                  }
               }
            }

            if (var3.method_25123("display") instanceof class_5531) {
               class_5531 var19 = var3.<class_5531>method_25123("display");
               if (var19.method_25123("Name") instanceof class_887) {
                  class_887 var26 = var19.<class_887>method_25123("Name");
                  var19.<class_887>method_25122(new class_887(field_47638 + "|Name", var26.method_3809()));
                  var26.method_3808(class_68.method_67(var26.method_3809(), class_2909.field_14206, true));
               }
            }

            if (var3.method_25123("ench") instanceof class_913) {
               class_913 var20 = var3.<class_913>method_25123("ench");
               class_913 var27 = new class_913("Enchantments", class_5531.class);

               for (class_5287 var36 : var20) {
                  if (var36 instanceof class_5531) {
                     class_5531 var11 = new class_5531("");
                     short var12 = ((Number)((class_5531)var36).<class_5287>method_25123("id").method_24129()).shortValue();
                     String var13 = (String)class_8633.field_44277.method_43100().get(var12);
                     if (var13 == null) {
                        var13 = "viaversion:legacy/" + var12;
                     }

                     var11.<class_887>method_25122(new class_887("id", var13));
                     var11.<class_6733>method_25122(
                        new class_6733("lvl", ((Number)((class_5531)var36).<class_5287>method_25123("lvl").method_24129()).shortValue())
                     );
                     var27.method_3919(var11);
                  }
               }

               var3.method_25126("ench");
               var3.<class_913>method_25122(var27);
            }

            if (var3.method_25123("StoredEnchantments") instanceof class_913) {
               class_913 var21 = var3.<class_913>method_25123("StoredEnchantments");
               class_913 var28 = new class_913("StoredEnchantments", class_5531.class);

               for (class_5287 var37 : var21) {
                  if (var37 instanceof class_5531) {
                     class_5531 var40 = new class_5531("");
                     short var43 = ((Number)((class_5531)var37).<class_5287>method_25123("id").method_24129()).shortValue();
                     String var46 = (String)class_8633.field_44277.method_43100().get(var43);
                     if (var46 == null) {
                        var46 = "viaversion:legacy/" + var43;
                     }

                     var40.<class_887>method_25122(new class_887("id", var46));
                     var40.<class_6733>method_25122(
                        new class_6733("lvl", ((Number)((class_5531)var37).<class_5287>method_25123("lvl").method_24129()).shortValue())
                     );
                     var28.method_3919(var40);
                  }
               }

               var3.method_25126("StoredEnchantments");
               var3.<class_913>method_25122(var28);
            }

            if (var3.method_25123("CanPlaceOn") instanceof class_913) {
               class_913 var22 = var3.<class_913>method_25123("CanPlaceOn");
               class_913 var29 = new class_913("CanPlaceOn", class_887.class);
               var3.<class_5287>method_25122(class_5737.<Object, class_5287>method_25979(field_47638 + "|CanPlaceOn", class_5737.method_25980(var22)));

               for (class_5287 var38 : var22) {
                  Object var41 = var38.method_24129();
                  String var44 = var41.toString().replace("minecraft:", "");
                  String var47 = (String)class_7101.field_36628.get(Ints.tryParse(var44));
                  if (var47 != null) {
                     var44 = var47;
                  }

                  String[] var14 = class_7101.field_36626.get(var44.toLowerCase(Locale.ROOT));
                  if (var14 == null) {
                     var29.method_3919(new class_887("", var44.toLowerCase(Locale.ROOT)));
                  } else {
                     for (String var18 : var14) {
                        var29.method_3919(new class_887("", var18));
                     }
                  }
               }

               var3.<class_913>method_25122(var29);
            }

            if (var3.method_25123("CanDestroy") instanceof class_913) {
               class_913 var23 = var3.<class_913>method_25123("CanDestroy");
               class_913 var30 = new class_913("CanDestroy", class_887.class);
               var3.<class_5287>method_25122(class_5737.<Object, class_5287>method_25979(field_47638 + "|CanDestroy", class_5737.method_25980(var23)));

               for (class_5287 var39 : var23) {
                  Object var42 = var39.method_24129();
                  String var45 = var42.toString().replace("minecraft:", "");
                  String var48 = (String)class_7101.field_36628.get(Ints.tryParse(var45));
                  if (var48 != null) {
                     var45 = var48;
                  }

                  String[] var49 = class_7101.field_36626.get(var45.toLowerCase(Locale.ROOT));
                  if (var49 == null) {
                     var30.method_3919(new class_887("", var45.toLowerCase(Locale.ROOT)));
                  } else {
                     for (String var53 : var49) {
                        var30.method_3919(new class_887("", var53));
                     }
                  }
               }

               var3.<class_913>method_25122(var30);
            }

            if (var0.method_43963() == 383) {
               if (!(var3.method_25123("EntityTag") instanceof class_5531)) {
                  var5 = 25100288;
               } else {
                  class_5531 var24 = var3.<class_5531>method_25123("EntityTag");
                  if (!(var24.method_25123("id") instanceof class_887)) {
                     var5 = 25100288;
                  } else {
                     class_887 var31 = var24.<class_887>method_25123("id");
                     var5 = class_6236.method_28483(var31.method_3809());
                     if (var5 != -1) {
                        var24.method_25126("id");
                        if (var24.method_25117()) {
                           var3.method_25126("EntityTag");
                        }
                     } else {
                        var5 = 25100288;
                     }
                  }
               }
            }

            if (var3.method_25117()) {
               var3 = null;
               var0.method_43960(null);
            }
         }

         if (!class_8633.field_44277.method_28215().containsKey(var5)) {
            if (!method_43072(var0.method_43963()) && var0.method_43963() != 358) {
               if (var3 == null) {
                  var0.method_43960(var3 = new class_5531("tag"));
               }

               var3.<class_5232>method_25122(new class_5232(field_47638, var4));
            }

            if (var0.method_43963() == 31 && var0.method_43962() == 0) {
               var5 = 512;
            } else if (!class_8633.field_44277.method_28215().containsKey(var5 & -16)) {
               if (!class_3446.method_15884().method_25845() || class_3446.method_15883().method_33731()) {
                  class_3446.method_15886().method_34617().warning("Failed to get 1.13 item for " + var0.method_43963());
               }

               var5 = 16;
            } else {
               var5 &= -16;
            }
         }

         var0.method_43965(class_8633.field_44277.method_28215().get(var5));
         var0.method_43966((short)0);
      }
   }

   public static String method_43075(String var0) {
      switch (var0) {
         case "MC|TrList":
            return "minecraft:trader_list";
         case "MC|Brand":
            return "minecraft:brand";
         case "MC|BOpen":
            return "minecraft:book_open";
         case "MC|DebugPath":
            return "minecraft:debug/paths";
         case "MC|DebugNeighborsUpdate":
            return "minecraft:debug/neighbors_update";
         case "REGISTER":
            return "minecraft:register";
         case "UNREGISTER":
            return "minecraft:unregister";
         case "BungeeCord":
            return "bungeecord:main";
         case "bungeecord:main":
            return null;
         default:
            String var5 = (String)class_8633.field_44277.method_43091().get(var0);
            if (var5 != null) {
               return var5;
            } else {
               return class_9333.method_43099(var0) ? var0 : null;
            }
      }
   }

   public static void method_43071(class_9530 var0) {
      if (var0 != null) {
         Integer var3 = null;
         boolean var4 = false;
         class_5531 var5 = var0.method_43959();
         if (var5 != null && var5.method_25123(field_47638) instanceof class_5232) {
            var3 = (Integer)var5.<class_5287>method_25123(field_47638).method_24129();
            var5.method_25126(field_47638);
            var4 = true;
         }

         if (var3 == null) {
            int var6 = class_8633.field_44277.method_28215().method_13803().get(var0.method_43963());
            if (var6 != -1) {
               Optional var7 = class_6236.method_28485(var6);
               if (!var7.isPresent()) {
                  var3 = var6 >> 4 << 16 | var6 & 15;
               } else {
                  var3 = 25100288;
                  if (var5 == null) {
                     var0.method_43960(var5 = new class_5531("tag"));
                  }

                  if (!var5.method_25125("EntityTag")) {
                     class_5531 var8 = new class_5531("EntityTag");
                     var8.<class_887>method_25122(new class_887("id", (String)var7.get()));
                     var5.<class_5531>method_25122(var8);
                  }
               }
            }
         }

         if (var3 == null) {
            if (!class_3446.method_15884().method_25845() || class_3446.method_15883().method_33731()) {
               class_3446.method_15886().method_34617().warning("Failed to get 1.12 item for " + var0.method_43963());
            }

            var3 = 65536;
         }

         var0.method_43965((short)(var3 >> 16));
         var0.method_43966((short)(var3 & 65535));
         if (var5 != null) {
            if (method_43072(var0.method_43963()) && var5.method_25123("Damage") instanceof class_5232) {
               if (!var4) {
                  var0.method_43966((short)((Integer)var5.<class_5287>method_25123("Damage").method_24129()).intValue());
               }

               var5.method_25126("Damage");
            }

            if (var0.method_43963() == 358 && var5.method_25123("map") instanceof class_5232) {
               if (!var4) {
                  var0.method_43966((short)((Integer)var5.<class_5287>method_25123("map").method_24129()).intValue());
               }

               var5.method_25126("map");
            }

            if ((var0.method_43963() == 442 || var0.method_43963() == 425) && var5.method_25123("BlockEntityTag") instanceof class_5531) {
               class_5531 var16 = var5.<class_5531>method_25123("BlockEntityTag");
               if (var16.method_25123("Base") instanceof class_5232) {
                  class_5232 var22 = var16.<class_5232>method_25123("Base");
                  var22.method_23972(15 - var22.method_23973());
               }

               if (var16.method_25123("Patterns") instanceof class_913) {
                  for (class_5287 var29 : (class_913)var16.method_25123("Patterns")) {
                     if (var29 instanceof class_5531) {
                        class_5232 var9 = ((class_5531)var29).<class_5232>method_25123("Color");
                        var9.method_23972(15 - var9.method_23973());
                     }
                  }
               }
            }

            if (var5.method_25123("display") instanceof class_5531) {
               class_5531 var17 = var5.<class_5531>method_25123("display");
               if (var17.method_25123("Name") instanceof class_887) {
                  class_887 var24 = var17.<class_887>method_25123("Name");
                  class_887 var30 = var17.<class_887>method_25126(field_47638 + "|Name");
                  var24.method_3808(var30 == null ? class_68.method_72(var24.method_3809()) : var30.method_3809());
               }
            }

            if (var5.method_25123("Enchantments") instanceof class_913) {
               class_913 var18 = var5.<class_913>method_25123("Enchantments");
               class_913 var25 = new class_913("ench", class_5531.class);

               for (class_5287 var35 : var18) {
                  if (var35 instanceof class_5531) {
                     class_5531 var10 = new class_5531("");
                     String var11 = (String)((class_5531)var35).<class_5287>method_25123("id").method_24129();
                     Short var12 = (Short)class_8633.field_44277.method_43100().inverse().get(var11);
                     if (var12 == null && var11.startsWith("viaversion:legacy/")) {
                        var12 = Short.valueOf(var11.substring(18));
                     }

                     if (var12 != null) {
                        var10.<class_6733>method_25122(new class_6733("id", var12));
                        var10.<class_6733>method_25122(new class_6733("lvl", (Short)((class_5531)var35).<class_5287>method_25123("lvl").method_24129()));
                        var25.method_3919(var10);
                     }
                  }
               }

               var5.method_25126("Enchantments");
               var5.<class_913>method_25122(var25);
            }

            if (var5.method_25123("StoredEnchantments") instanceof class_913) {
               class_913 var19 = var5.<class_913>method_25123("StoredEnchantments");
               class_913 var26 = new class_913("StoredEnchantments", class_5531.class);

               for (class_5287 var36 : var19) {
                  if (var36 instanceof class_5531) {
                     class_5531 var39 = new class_5531("");
                     String var42 = (String)((class_5531)var36).<class_5287>method_25123("id").method_24129();
                     Short var45 = (Short)class_8633.field_44277.method_43100().inverse().get(var42);
                     if (var45 == null && var42.startsWith("viaversion:legacy/")) {
                        var45 = Short.valueOf(var42.substring(18));
                     }

                     if (var45 != null) {
                        var39.<class_6733>method_25122(new class_6733("id", var45));
                        var39.<class_6733>method_25122(new class_6733("lvl", (Short)((class_5531)var36).<class_5287>method_25123("lvl").method_24129()));
                        var26.method_3919(var39);
                     }
                  }
               }

               var5.method_25126("StoredEnchantments");
               var5.<class_913>method_25122(var26);
            }

            if (var5.method_25123(field_47638 + "|CanPlaceOn") instanceof class_913) {
               var5.<class_5287>method_25122(
                  class_5737.<Object, class_5287>method_25979("CanPlaceOn", class_5737.method_25980(var5.<class_5287>method_25123(field_47638 + "|CanPlaceOn")))
               );
               var5.method_25126(field_47638 + "|CanPlaceOn");
            } else if (var5.method_25123("CanPlaceOn") instanceof class_913) {
               class_913 var20 = var5.<class_913>method_25123("CanPlaceOn");
               class_913 var27 = new class_913("CanPlaceOn", class_887.class);

               for (class_5287 var37 : var20) {
                  Object var40 = var37.method_24129();
                  String[] var43 = class_7101.field_36630.get(!(var40 instanceof String) ? null : ((String)var40).replace("minecraft:", ""));
                  if (var43 == null) {
                     var27.method_3919(var37);
                  } else {
                     for (String var15 : var43) {
                        var27.method_3919(new class_887("", var15));
                     }
                  }
               }

               var5.<class_913>method_25122(var27);
            }

            if (!(var5.method_25123(field_47638 + "|CanDestroy") instanceof class_913)) {
               if (var5.method_25123("CanDestroy") instanceof class_913) {
                  class_913 var21 = var5.<class_913>method_25123("CanDestroy");
                  class_913 var28 = new class_913("CanDestroy", class_887.class);

                  for (class_5287 var38 : var21) {
                     Object var41 = var38.method_24129();
                     String[] var44 = class_7101.field_36630.get(!(var41 instanceof String) ? null : ((String)var41).replace("minecraft:", ""));
                     if (var44 == null) {
                        var28.method_3919(var38);
                     } else {
                        for (String var50 : var44) {
                           var28.method_3919(new class_887("", var50));
                        }
                     }
                  }

                  var5.<class_913>method_25122(var28);
               }
            } else {
               var5.<class_5287>method_25122(
                  class_5737.<Object, class_5287>method_25979("CanDestroy", class_5737.method_25980(var5.<class_5287>method_25123(field_47638 + "|CanDestroy")))
               );
               var5.method_25126(field_47638 + "|CanDestroy");
            }
         }
      }
   }

   public static String method_43077(String var0) {
      var0 = class_9333.method_43090(var0);
      if (var0 == null) {
         return null;
      } else {
         switch (var0) {
            case "minecraft:trader_list":
               return "MC|TrList";
            case "minecraft:book_open":
               return "MC|BOpen";
            case "minecraft:debug/paths":
               return "MC|DebugPath";
            case "minecraft:debug/neighbors_update":
               return "MC|DebugNeighborsUpdate";
            case "minecraft:register":
               return "REGISTER";
            case "minecraft:unregister":
               return "UNREGISTER";
            case "minecraft:brand":
               return "MC|Brand";
            case "bungeecord:main":
               return "BungeeCord";
            default:
               String var5 = (String)class_8633.field_44277.method_43091().inverse().get(var0);
               if (var5 != null) {
                  return var5;
               } else {
                  return var0.length() > 20 ? var0.substring(0, 20) : var0;
               }
         }
      }
   }

   public static boolean method_43072(int var0) {
      return var0 >= 256 && var0 <= 259
         || var0 == 261
         || var0 >= 267 && var0 <= 279
         || var0 >= 283 && var0 <= 286
         || var0 >= 290 && var0 <= 294
         || var0 >= 298 && var0 <= 317
         || var0 == 346
         || var0 == 359
         || var0 == 398
         || var0 == 442
         || var0 == 443;
   }
}
