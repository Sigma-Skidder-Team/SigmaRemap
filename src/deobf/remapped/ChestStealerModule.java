package remapped;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class ChestStealerModule extends Module {
   public boolean field_15894;
   private ConcurrentHashMap<class_7099, Boolean> field_15896;
   private Timer field_15895 = new Timer();
   private Timer field_15893 = new Timer();
   private class_7099 field_15892;

   public ChestStealerModule() {
      super(Category.ITEM, "ChestStealer", "Steals items from chest");
      this.addSetting(new BooleanSetting("Aura", "Automatically open chests near you.", false));
      this.addSetting(new BooleanSetting("Ignore Junk", "Ignores useless items.", true));
      this.addSetting(new BooleanSetting("Fix ViaVersion", "Fixes ViaVersion delay.", true));
      this.addSetting(new BooleanSetting("Close", "Automatically closes the chest when done", true));
      this.addSetting(new FloatSetting<Float>("Delay", "Click delay", 0.2F, Float.class, 0.0F, 1.0F, 0.01F));
      this.addSetting(new FloatSetting<Float>("First Item", "Tick delay before grabbing first item", 0.2F, Float.class, 0.0F, 1.0F, 0.01F));
      this.field_15896 = new ConcurrentHashMap<class_7099, Boolean>();
   }

   @Override
   public void onEnable() {
      this.field_15892 = null;
      this.field_15894 = false;
      if (!this.field_15896.isEmpty()) {
         this.field_15896.clear();
      }
   }

   @EventListen
   public void method_14639(class_1393 var1) {
      if (this.method_42015() && var1.method_6449()) {
         if (this.getBooleanValueByName("Aura")) {
            if (this.field_15893.method_14772() > 2000L && this.field_15894) {
               this.field_15893.method_14773();
               this.field_15894 = false;
            }

            if (!this.field_15893.method_14771()) {
               this.field_15893.method_14776();
            }

            this.method_14638();
            if (this.field_15892 != null && client.field_9623 == null && this.field_15893.method_14772() > 1000L) {
               class_9529 var4 = (class_9529)class_7494.method_34100(this.field_15892.method_17399());
               if (var4.method_43955().method_12173() == this.field_15892.method_17399().method_12173()
                  && var4.method_43955().method_12165() == this.field_15892.method_17399().method_12165()
                  && var4.method_43955().method_12185() == this.field_15892.method_17399().method_12185()) {
                  this.field_15894 = true;
                  client.method_8614().method_4813(new class_8585(Hand.MAIN_HAND, var4));
                  client.method_8614().method_4813(new class_3195(Hand.MAIN_HAND));
                  this.field_15893.method_14773();
               }
            }

            boolean var14 = false;

            for (Entry var6 : this.field_15896.entrySet()) {
               class_7099 var7 = (class_7099)var6.getKey();
               boolean var8 = (Boolean)var6.getValue();
               float var9 = (float)var7.method_17399().method_12173();
               float var10 = (float)var7.method_17399().method_12165() + 0.1F;
               float var11 = (float)var7.method_17399().method_12185();
               if (!this.field_15894
                  && (
                     this.field_15892 == null
                        || client.thePlayer.method_37273((double)var9, (double)var10, (double)var11)
                           > client.thePlayer.method_37273((double)var9, (double)var10, (double)var11)
                  )
                  && !var8
                  && Math.sqrt(client.thePlayer.method_37273((double)var9, (double)var10, (double)var11)) < 5.0
                  && this.field_15893.method_14772() > 1000L
                  && client.field_9623 == null) {
                  class_9529 var12 = (class_9529)class_7494.method_34100(var7.method_17399());
                  if (var12.method_43955().method_12173() == var7.method_17399().method_12173()
                     && var12.method_43955().method_12165() == var7.method_17399().method_12165()
                     && var12.method_43955().method_12185() == var7.method_17399().method_12185()) {
                     this.field_15892 = var7;
                     float[] var13 = class_7211.method_33006((double)var9 + 0.5, (double)var11 + 0.5, (double)var10 + 0.35);
                     var1.method_6441(var13[0]);
                     var1.method_6448(var13[1]);
                     var14 = true;
                  }
               }
            }

            if (!var14 && client.field_9623 == null && this.field_15892 != null) {
               this.field_15896.put(this.field_15892, true);
               this.field_15892 = null;
            }
         }
      }
   }

   @EventListen
   public void method_14640(class_717 var1) {
      if (!this.field_15896.isEmpty()) {
         this.field_15896.clear();
      }
   }

   @EventListen
   public void method_14635(class_3278 var1) {
      if (this.method_42015()) {
         if (!(client.field_9623 instanceof class_2141)) {
            this.field_15894 = false;
            this.field_15895.method_14774();
            this.field_15895.method_14773();
            if (client.field_9623 == null && class_2740.method_12366()) {
               this.field_15893.method_14773();
            }
         } else {
            if (!this.field_15895.method_14771()) {
               this.field_15895.method_14776();
            }

            if (!((float) SigmaMainClass.getInstance().method_3310().method_25303() < this.getFloatValueByName("Delay") * 20.0F)) {
               if (class_2740.method_12366()) {
                  if (this.getBooleanValueByName("Close")) {
                     client.thePlayer.method_3207();
                  }
               } else {
                  class_2141 var4 = (class_2141) client.field_9623;
                  if (!this.method_14637(var4)) {
                     if (this.field_15892 != null) {
                        this.field_15896.put(this.field_15892, true);
                     }
                  } else {
                     boolean var5 = true;

                     for (class_7934 var7 : var4.field_10956.field_19926) {
                        if (var7.method_35884() && var7.field_40588 < var4.field_10956.method_6777() * 9) {
                           ItemStack var8 = var7.method_35898();
                           if (!this.method_14636(var8)) {
                              if (!this.field_15894) {
                                 if ((float)this.field_15895.method_14772() < this.getFloatValueByName("First Item") * 1000.0F) {
                                    return;
                                 }

                                 this.field_15894 = !this.field_15894;
                              }

                              if (!this.getBooleanValueByName("Fix ViaVersion")) {
                                 class_2740.method_12355(var4.field_10956.field_19925, var7.field_40588, 0, class_6269.field_32019, client.thePlayer);
                              } else {
                                 class_2740.method_12356(
                                    var4.field_10956.field_19925, var7.field_40588, 0, class_6269.field_32019, client.thePlayer, true
                                 );
                              }

                              this.field_15895.method_14773();
                              var5 = false;
                              if (this.getFloatValueByName("Delay") > 0.0F) {
                                 break;
                              }
                           }
                        }
                     }

                     if (var5) {
                        if (this.field_15894) {
                           this.field_15894 = !this.field_15894;
                        }

                        if (this.getBooleanValueByName("Close")) {
                           client.thePlayer.method_3207();
                        }

                        for (class_7099 var10 : this.field_15896.keySet()) {
                           if (var10 == this.field_15892) {
                              this.field_15892 = null;
                              this.field_15896.put(var10, true);
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private boolean method_14637(class_2141 var1) {
      ArrayList var4 = new ArrayList<String>(
         Arrays.asList(
            "menu",
            "selector",
            "game",
            "gui",
            "server",
            "inventory",
            "play",
            "teleporter",
            "shop",
            "melee",
            "armor",
            "block",
            "castle",
            "mini",
            "warp",
            "teleport",
            "user",
            "team",
            "tool",
            "sure",
            "trade",
            "cancel",
            "accept",
            "soul",
            "book",
            "recipe",
            "profile",
            "tele",
            "port",
            "map",
            "kit",
            "select",
            "lobby",
            "vault",
            "lock",
            "anticheat",
            "travel",
            "settings",
            "user",
            "preference",
            "compass",
            "cake",
            "wars",
            "buy",
            "upgrade",
            "ranged",
            "potions",
            "utility",
            "choose",
            "modalidades"
         )
      );
      List var5 = class_7494.method_34110(8.0F);
      String var6 = var1.method_1165().replaceAll("§.", "").toLowerCase();

      for (Object var8 : var4) {
         int var9 = var6.indexOf((Integer) var8);
         if (var9 > 0 && var9 < 40) {
            return false;
         }
      }

      for (Object var11 : var5) {
         if (class_7494.method_34120((BlockPos) var11) instanceof class_6942 || class_7494.method_34120((BlockPos) var11) instanceof class_3311) {
            return true;
         }
      }

      return false;
   }

   private boolean method_14636(ItemStack var1) {
      class_2451 var4 = var1.method_27960();
      if (!this.getBooleanValueByName("Ignore Junk")) {
         return false;
      } else if (!(var4 instanceof class_2235)) {
         if (var4 instanceof class_670) {
            return !InvManagerModule.method_23722(var1);
         } else if (!(var4 instanceof class_7938)) {
            if (var4 instanceof class_9406) {
               return !InvManagerModule.method_23719(var1);
            } else if (!(var4 instanceof class_5518)) {
               if (var4 instanceof class_6201) {
                  return !BlockFlyModule.method_17216(var4);
               } else if (!(var4 instanceof class_603)
                  && (!(var4 instanceof class_2100) || !SigmaMainClass.getInstance().getModuleManager().getModuleByClass(InvManagerModule.class).getBooleanValueByName("Archery"))) {
                  if (var4 == class_4897.field_24999 && SigmaMainClass.getInstance().getModuleManager().getModuleByClass(AutoMLGModule.class).method_42015()) {
                     return false;
                  } else {
                     ArrayList var5 = new ArrayList<class_2451>(
                        Arrays.asList(
                           class_4897.field_24830,
                           class_4897.field_24922,
                           class_4897.field_24720,
                           class_4897.field_24962,
                           class_4897.field_25259,
                           class_4897.field_24413,
                           class_4897.field_24699,
                           class_4897.field_24548,
                           class_4897.field_24938,
                           class_4897.field_24999,
                           class_4897.field_24635,
                           class_4897.field_24879,
                           class_4897.field_24623,
                           class_4897.field_24853,
                           class_4897.field_25296,
                           class_4897.field_24839,
                           class_4897.field_24883,
                           class_4897.field_24435,
                           class_4897.field_24480,
                           class_4897.field_24621,
                           class_4897.field_24808,
                           class_4897.field_24812,
                           class_4897.field_25038,
                           class_4897.field_24601,
                           class_4897.field_24505
                        )
                     );
                     return var1 == null || var5.contains(var4) || var4.method_11219().getString().toLowerCase().contains("seed");
                  }
               } else {
                  return true;
               }
            } else {
               return class_2740.method_12360(var1);
            }
         } else {
            return !InvManagerModule.method_23711(var1);
         }
      } else {
         return !InvManagerModule.method_23720(var1);
      }
   }

   private void method_14638() {
      List var3 = client.theWorld.field_33053;
      var3.removeIf(var0 -> !(var0 instanceof class_7099));

      for (Object var5 : var3) {
         if (!this.field_15896.containsKey((class_7099)var5)) {
            this.field_15896.put((class_7099)var5, false);
         }
      }

      for (class_7099 var7 : this.field_15896.keySet()) {
         if (!var3.contains(var7)) {
            this.field_15896.remove(var7);
         }
      }
   }
}
