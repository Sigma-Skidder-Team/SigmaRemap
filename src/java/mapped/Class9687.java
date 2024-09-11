package mapped;

import com.google.common.primitives.Ints;
import java.util.Locale;
import java.util.Optional;

public class Class9687 {
   private static final String field45297 = "ViaVersion|" + Class6380.class.getSimpleName();

   public static void method37922(Class6380 var0) {
      Class8123 var3 = new Class8123(var0, Class9687::method37923, Class9687::method37925);
      var0.method19360(Class1914.field11378, new Class3762(var3));
      var0.method19360(Class1914.field11376, new Class3921(var3));
      var0.method19360(Class1914.field11377, new Class3896(var0));
      var0.method19360(Class1914.field11380, new Class4027());
      var0.method19360(Class1914.field11419, new Class4021(var3));
      var0.method19364(Class1921.field11780, new Class3893(var3));
      var0.method19364(Class1921.field11782, new Class3849());
      var0.method19364(Class1921.field11808, new Class3992(var3));
   }

   public static void method37923(Class9738 var0) {
      if (var0 != null) {
         Class72 var3 = var0.method38167();
         int var4 = var0.method38161() << 16 | var0.method38165() & '\uffff';
         int var5 = var0.method38161() << 4 | var0.method38165() & 15;
         if (method37927(var0.method38161())) {
            if (var3 == null) {
               var0.method38168(var3 = new Class72("tag"));
            }

            var3.<Class66>method236(new Class66("Damage", var0.method38165()));
         }

         if (var0.method38161() == 358) {
            if (var3 == null) {
               var0.method38168(var3 = new Class72("tag"));
            }

            var3.<Class66>method236(new Class66("map", var0.method38165()));
         }

         if (var3 != null) {
            boolean var6 = var0.method38161() == 425;
            if ((var6 || var0.method38161() == 442) && var3.method235("BlockEntityTag") instanceof Class72) {
               Class72 var7 = var3.<Class72>method235("BlockEntityTag");
               if (var7.method235("Base") instanceof Class66) {
                  Class66 var8 = var7.<Class66>method235("Base");
                  if (var6) {
                     var5 = 6800 + var8.method205();
                  }

                  var8.method223(15 - var8.method205());
               }

               if (var7.method235("Patterns") instanceof Class60) {
                  for (Class61 var9 : (Class60)var7.method235("Patterns")) {
                     if (var9 instanceof Class72) {
                        Class66 var10 = ((Class72)var9).<Class66>method235("Color");
                        var10.method223(15 - var10.method205());
                     }
                  }
               }
            }

            if (var3.method235("display") instanceof Class72) {
               Class72 var19 = var3.<Class72>method235("display");
               if (var19.method235("Name") instanceof Class71) {
                  Class71 var26 = var19.<Class71>method235("Name");
                  var19.<Class71>method236(new Class71(field45297 + "|Name", var26.method205()));
                  var26.method231(Class2980.method11392(var26.method205(), Class2307.field15782, true));
               }
            }

            if (var3.method235("ench") instanceof Class60) {
               Class60 var20 = var3.<Class60>method235("ench");
               Class60 var27 = new Class60("Enchantments", Class72.class);

               for (Class61 var36 : var20) {
                  if (var36 instanceof Class72) {
                     Class72 var11 = new Class72("");
                     short var12 = ((Number)((Class72)var36).<Class61>method235("id").method205()).shortValue();
                     String var13 = (String)Class6380.field27947.method18550().get(var12);
                     if (var13 == null) {
                        var13 = "viaversion:legacy/" + var12;
                     }

                     var11.<Class71>method236(new Class71("id", var13));
                     var11.<Class73>method236(new Class73("lvl", ((Number)((Class72)var36).<Class61>method235("lvl").method205()).shortValue()));
                     var27.method199(var11);
                  }
               }

               var3.method237("ench");
               var3.<Class60>method236(var27);
            }

            if (var3.method235("StoredEnchantments") instanceof Class60) {
               Class60 var21 = var3.<Class60>method235("StoredEnchantments");
               Class60 var28 = new Class60("StoredEnchantments", Class72.class);

               for (Class61 var37 : var21) {
                  if (var37 instanceof Class72) {
                     Class72 var40 = new Class72("");
                     short var43 = ((Number)((Class72)var37).<Class61>method235("id").method205()).shortValue();
                     String var46 = (String)Class6380.field27947.method18550().get(var43);
                     if (var46 == null) {
                        var46 = "viaversion:legacy/" + var43;
                     }

                     var40.<Class71>method236(new Class71("id", var46));
                     var40.<Class73>method236(new Class73("lvl", ((Number)((Class72)var37).<Class61>method235("lvl").method205()).shortValue()));
                     var28.method199(var40);
                  }
               }

               var3.method237("StoredEnchantments");
               var3.<Class60>method236(var28);
            }

            if (var3.method235("CanPlaceOn") instanceof Class60) {
               Class60 var22 = var3.<Class60>method235("CanPlaceOn");
               Class60 var29 = new Class60("CanPlaceOn", Class71.class);
               var3.<Class61>method236(Class8742.<Object, Class61>method31541(field45297 + "|CanPlaceOn", Class8742.method31540(var22)));

               for (Class61 var38 : var22) {
                  Object var41 = var38.method205();
                  String var44 = var41.toString().replace("minecraft:", "");
                  String var47 = (String)Class9123.field41927.get(Ints.tryParse(var44));
                  if (var47 != null) {
                     var44 = var47;
                  }

                  String[] var14 = Class9123.field41925.get(var44.toLowerCase(Locale.ROOT));
                  if (var14 == null) {
                     var29.method199(new Class71("", var44.toLowerCase(Locale.ROOT)));
                  } else {
                     for (String var18 : var14) {
                        var29.method199(new Class71("", var18));
                     }
                  }
               }

               var3.<Class60>method236(var29);
            }

            if (var3.method235("CanDestroy") instanceof Class60) {
               Class60 var23 = var3.<Class60>method235("CanDestroy");
               Class60 var30 = new Class60("CanDestroy", Class71.class);
               var3.<Class61>method236(Class8742.<Object, Class61>method31541(field45297 + "|CanDestroy", Class8742.method31540(var23)));

               for (Class61 var39 : var23) {
                  Object var42 = var39.method205();
                  String var45 = var42.toString().replace("minecraft:", "");
                  String var48 = (String)Class9123.field41927.get(Ints.tryParse(var45));
                  if (var48 != null) {
                     var45 = var48;
                  }

                  String[] var49 = Class9123.field41925.get(var45.toLowerCase(Locale.ROOT));
                  if (var49 == null) {
                     var30.method199(new Class71("", var45.toLowerCase(Locale.ROOT)));
                  } else {
                     for (String var53 : var49) {
                        var30.method199(new Class71("", var53));
                     }
                  }
               }

               var3.<Class60>method236(var30);
            }

            if (var0.method38161() == 383) {
               if (!(var3.method235("EntityTag") instanceof Class72)) {
                  var5 = 25100288;
               } else {
                  Class72 var24 = var3.<Class72>method235("EntityTag");
                  if (!(var24.method235("id") instanceof Class71)) {
                     var5 = 25100288;
                  } else {
                     Class71 var31 = var24.<Class71>method235("id");
                     var5 = Class8877.method32297(var31.method205());
                     if (var5 != -1) {
                        var24.method237("id");
                        if (var24.method233()) {
                           var3.method237("EntityTag");
                        }
                     } else {
                        var5 = 25100288;
                     }
                  }
               }
            }

            if (var3.method233()) {
               var3 = null;
               var0.method38168(null);
            }
         }

         if (!Class6380.field27947.method18533().containsKey(var5)) {
            if (!method37927(var0.method38161()) && var0.method38161() != 358) {
               if (var3 == null) {
                  var0.method38168(var3 = new Class72("tag"));
               }

               var3.<Class66>method236(new Class66(field45297, var4));
            }

            if (var0.method38161() == 31 && var0.method38165() == 0) {
               var5 = 512;
            } else if (!Class6380.field27947.method18533().containsKey(var5 & -16)) {
               if (!ViaVersion3.method27612().method21941() || ViaVersion3.getInstance().method34425()) {
                  ViaVersion3.method27613().getLogger().warning("Failed to get 1.13 item for " + var0.method38161());
               }

               var5 = 16;
            } else {
               var5 &= -16;
            }
         }

         var0.method38162(Class6380.field27947.method18533().get(var5));
         var0.method38166((short)0);
      }
   }

   public static String method37924(String var0) {
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
            String var5 = (String)Class6380.field27947.method18553().get(var0);
            if (var5 != null) {
               return var5;
            } else {
               return Class5980.method18544(var0) ? var0 : null;
            }
      }
   }

   public static void method37925(Class9738 var0) {
      if (var0 != null) {
         Integer var3 = null;
         boolean var4 = false;
         Class72 var5 = var0.method38167();
         if (var5 != null && var5.method235(field45297) instanceof Class66) {
            var3 = (Integer)var5.<Class61>method235(field45297).method205();
            var5.method237(field45297);
            var4 = true;
         }

         if (var3 == null) {
            int var6 = Class6380.field27947.method18533().method57().get(var0.method38161());
            if (var6 != -1) {
               Optional var7 = Class8877.method32298(var6);
               if (!var7.isPresent()) {
                  var3 = var6 >> 4 << 16 | var6 & 15;
               } else {
                  var3 = 25100288;
                  if (var5 == null) {
                     var0.method38168(var5 = new Class72("tag"));
                  }

                  if (!var5.method234("EntityTag")) {
                     Class72 var8 = new Class72("EntityTag");
                     var8.<Class71>method236(new Class71("id", (String)var7.get()));
                     var5.<Class72>method236(var8);
                  }
               }
            }
         }

         if (var3 == null) {
            if (!ViaVersion3.method27612().method21941() || ViaVersion3.getInstance().method34425()) {
               ViaVersion3.method27613().getLogger().warning("Failed to get 1.12 item for " + var0.method38161());
            }

            var3 = 65536;
         }

         var0.method38162((short)(var3 >> 16));
         var0.method38166((short)(var3 & 65535));
         if (var5 != null) {
            if (method37927(var0.method38161()) && var5.method235("Damage") instanceof Class66) {
               if (!var4) {
                  var0.method38166((short)((Integer)var5.<Class61>method235("Damage").method205()).intValue());
               }

               var5.method237("Damage");
            }

            if (var0.method38161() == 358 && var5.method235("map") instanceof Class66) {
               if (!var4) {
                  var0.method38166((short)((Integer)var5.<Class61>method235("map").method205()).intValue());
               }

               var5.method237("map");
            }

            if ((var0.method38161() == 442 || var0.method38161() == 425) && var5.method235("BlockEntityTag") instanceof Class72) {
               Class72 var16 = var5.<Class72>method235("BlockEntityTag");
               if (var16.method235("Base") instanceof Class66) {
                  Class66 var22 = var16.<Class66>method235("Base");
                  var22.method223(15 - var22.method205());
               }

               if (var16.method235("Patterns") instanceof Class60) {
                  for (Class61 var29 : (Class60)var16.method235("Patterns")) {
                     if (var29 instanceof Class72) {
                        Class66 var9 = ((Class72)var29).<Class66>method235("Color");
                        var9.method223(15 - var9.method205());
                     }
                  }
               }
            }

            if (var5.method235("display") instanceof Class72) {
               Class72 var17 = var5.<Class72>method235("display");
               if (var17.method235("Name") instanceof Class71) {
                  Class71 var24 = var17.<Class71>method235("Name");
                  Class71 var30 = var17.<Class71>method237(field45297 + "|Name");
                  var24.method231(var30 == null ? Class2980.method11396(var24.method205()) : var30.method205());
               }
            }

            if (var5.method235("Enchantments") instanceof Class60) {
               Class60 var18 = var5.<Class60>method235("Enchantments");
               Class60 var25 = new Class60("ench", Class72.class);

               for (Class61 var35 : var18) {
                  if (var35 instanceof Class72) {
                     Class72 var10 = new Class72("");
                     String var11 = (String)((Class72)var35).<Class61>method235("id").method205();
                     Short var12 = (Short)Class6380.field27947.method18550().inverse().get(var11);
                     if (var12 == null && var11.startsWith("viaversion:legacy/")) {
                        var12 = Short.valueOf(var11.substring(18));
                     }

                     if (var12 != null) {
                        var10.<Class73>method236(new Class73("id", var12));
                        var10.<Class73>method236(new Class73("lvl", (Short)((Class72)var35).<Class61>method235("lvl").method205()));
                        var25.method199(var10);
                     }
                  }
               }

               var5.method237("Enchantments");
               var5.<Class60>method236(var25);
            }

            if (var5.method235("StoredEnchantments") instanceof Class60) {
               Class60 var19 = var5.<Class60>method235("StoredEnchantments");
               Class60 var26 = new Class60("StoredEnchantments", Class72.class);

               for (Class61 var36 : var19) {
                  if (var36 instanceof Class72) {
                     Class72 var39 = new Class72("");
                     String var42 = (String)((Class72)var36).<Class61>method235("id").method205();
                     Short var45 = (Short)Class6380.field27947.method18550().inverse().get(var42);
                     if (var45 == null && var42.startsWith("viaversion:legacy/")) {
                        var45 = Short.valueOf(var42.substring(18));
                     }

                     if (var45 != null) {
                        var39.<Class73>method236(new Class73("id", var45));
                        var39.<Class73>method236(new Class73("lvl", (Short)((Class72)var36).<Class61>method235("lvl").method205()));
                        var26.method199(var39);
                     }
                  }
               }

               var5.method237("StoredEnchantments");
               var5.<Class60>method236(var26);
            }

            if (var5.method235(field45297 + "|CanPlaceOn") instanceof Class60) {
               var5.<Class61>method236(
                  Class8742.<Object, Class61>method31541("CanPlaceOn", Class8742.method31540(var5.<Class61>method235(field45297 + "|CanPlaceOn")))
               );
               var5.method237(field45297 + "|CanPlaceOn");
            } else if (var5.method235("CanPlaceOn") instanceof Class60) {
               Class60 var20 = var5.<Class60>method235("CanPlaceOn");
               Class60 var27 = new Class60("CanPlaceOn", Class71.class);

               for (Class61 var37 : var20) {
                  Object var40 = var37.method205();
                  String[] var43 = Class9123.field41926.get(!(var40 instanceof String) ? null : ((String)var40).replace("minecraft:", ""));
                  if (var43 == null) {
                     var27.method199(var37);
                  } else {
                     for (String var15 : var43) {
                        var27.method199(new Class71("", var15));
                     }
                  }
               }

               var5.<Class60>method236(var27);
            }

            if (!(var5.method235(field45297 + "|CanDestroy") instanceof Class60)) {
               if (var5.method235("CanDestroy") instanceof Class60) {
                  Class60 var21 = var5.<Class60>method235("CanDestroy");
                  Class60 var28 = new Class60("CanDestroy", Class71.class);

                  for (Class61 var38 : var21) {
                     Object var41 = var38.method205();
                     String[] var44 = Class9123.field41926.get(!(var41 instanceof String) ? null : ((String)var41).replace("minecraft:", ""));
                     if (var44 == null) {
                        var28.method199(var38);
                     } else {
                        for (String var50 : var44) {
                           var28.method199(new Class71("", var50));
                        }
                     }
                  }

                  var5.<Class60>method236(var28);
               }
            } else {
               var5.<Class61>method236(
                  Class8742.<Object, Class61>method31541("CanDestroy", Class8742.method31540(var5.<Class61>method235(field45297 + "|CanDestroy")))
               );
               var5.method237(field45297 + "|CanDestroy");
            }
         }
      }
   }

   public static String method37926(String var0) {
      var0 = Class5980.method18543(var0);
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
               String var5 = (String)Class6380.field27947.method18553().inverse().get(var0);
               if (var5 != null) {
                  return var5;
               } else {
                  return var0.length() > 20 ? var0.substring(0, 20) : var0;
               }
         }
      }
   }

   public static boolean method37927(int var0) {
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
