package remapped;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestModule extends Module {
   private double field_8815;
   private double field_8828;
   private double field_8819;
   private double field_8825;
   private double field_8821;
   private double field_8823;
   private double field_8817;
   private double field_8814;
   public boolean field_8831;
   private long field_8818;
   private float field_8832;
   private float field_8826;
   private float field_8827;
   private float field_8829;
   private float field_8830;
   private float field_8833;
   public class_2440 field_8816;
   public class_1343 field_8820;
   private Entity field_8822;

   public TestModule() {
      super(Category.MISC, "Test", "A mod for testing things");
      this.addSetting(new SomeWeirdMultiFloatSetting("Bezier", "ey", 0.57F, -0.035F, 0.095F, -0.0F));
      this.addSetting(
         new BooleanSetting("Test Checkbox", "A test checkbox", true)
            .setModeClass(var0 -> SigmaMainClass.getInstance().method_3326().method_12863("Changed checkbox: " + var0.method_23031()))
      );
      this.addSetting(
         new FloatSetting<Float>("Test Slider", "A test slider", 0.5F, Float.class, 0.0F, 1.0F, 0.1F)
            .setModeClass(var0 -> SigmaMainClass.getInstance().method_3326().method_12863("Changed slider: " + var0.method_23031()))
      );
      this.addSetting(
         new SomeWeirdIntegerSetting("Test Type", "A test type button", 0, "hello", "goodbye")
            .setModeClass(var0 -> SigmaMainClass.getInstance().method_3326().method_12863("Changed type: " + var0.method_23031()))
      );
      this.addSetting(
         new class_7131(
            "Test Suboptions",
            "A test suboption",
            false,
            new BooleanSetting("Test Checkbox", "A test checkbox", true),
            new FloatSetting<Float>("Test Slider", "A test slider", 0.5F, Float.class, 0.0F, 1.0F, 0.1F)
         )
      );
   }

   @Override
   public void onEnable() {
      this.field_8821 = 0.0;
      this.field_8816 = new class_2440(1000, 100000, class_4043.field_19620);
      this.field_8832 = class_9299.method_42810(client.thePlayer.rotationYaw);
      this.field_8832 = 39.0F;
      this.field_8826 = client.thePlayer.rotationPitch;
      double var3 = client.thePlayer.getPosX();
      double var5 = client.thePlayer.method_37309();
      double var7 = client.thePlayer.getPosZ();
      double var9 = 3200000.000000002;
      this.field_8831 = false;
      this.field_8825 = 0.0;
   }

   @Override
   public void onDisable() {
      client.theTimer.timerSpeed = 1.0F;
   }

   @EventListen
   @class_7664
   public void method_7654(class_7767 var1) {
      if (this.method_42015()) {
         double var4 = Math.sqrt(var1.method_35234() * var1.method_35234() + var1.method_35231() * var1.method_35231());
         class_314.method_1408(var1.method_35236());
      }
   }

   @EventListen
   public void method_7665(class_1393 var1) {
      if (!this.method_42015() || !var1.method_6449()) {
         ;
      }
   }

   @EventListen
   public void method_7653(class_5596 var1) {
      if (!this.method_42015()) {
         ;
      }
   }

   @EventListen
   public void method_7651(class_3278 var1) {
      if (!this.method_42015()) {
         ;
      }
   }

   @EventListen
   public void method_7652(class_3368 var1) {
   }

   @EventListen
   public void method_7660(class_4996 var1) {
      if (!this.method_42015()) {
         ;
      }
   }

   @EventListen
   public void method_7658(class_7982 var1) {
      if (!this.method_42015()) {
         ;
      }
   }

   @EventListen
   @class_4249
   public void method_7662(class_717 var1) {
   }

   @EventListen
   @class_4249
   public void method_7663(class_6435 var1) {
      if (!this.method_42015()) {
         ;
      }
   }

   @EventListen
   @class_4249
   public void method_7650(class_8706 var1) {
      if (!this.method_42015() || client.field_9623 != null) {
         ;
      }
   }

   @EventListen
   public void method_7648(class_3368 var1) {
   }

   @EventListen
   @class_4249
   public void method_7655(class_2157 var1) {
      Packet var4 = var1.method_10047();
      if (this.method_42015() && client.thePlayer != null) {
         if (!(var4 instanceof class_3398)) {
            if (!(var4 instanceof class_4609)) {
               if (!(var4 instanceof class_7371)) {
                  if (!(var4 instanceof class_1022)) {
                     if (!(var4 instanceof class_3195)) {
                        if (!(var4 instanceof class_8585)) {
                           if (!(var4 instanceof class_1586)) {
                              if (!(var4 instanceof class_1194)) {
                                 if (!(var4 instanceof class_8559)) {
                                    if (!(var4 instanceof class_3211)) {
                                       if (!(var4 instanceof class_8244)) {
                                          if (!(var4 instanceof class_2669) && var4 instanceof class_5955) {
                                             class_5955 var5 = (class_5955)var4;
                                          }
                                       } else {
                                          class_8244 var11 = (class_8244)var4;
                                       }
                                    } else {
                                       new class_3211();
                                    }
                                 } else {
                                    class_8559 var12 = (class_8559)var4;
                                    if (var12.method_39391() != class_2105.field_10551) {
                                    }
                                 }
                              }
                           } else {
                              class_1586 var13 = (class_1586)var4;
                              if (var13.method_7130() != class_7500.field_38259) {
                              }
                           }
                        } else {
                           class_8585 var14 = (class_8585)var4;
                        }
                     }
                  } else {
                     class_1022 var15 = (class_1022)var4;
                     if (var15.method_4516() != Hand.OFF_HAND) {
                     }
                  }
               } else {
                  class_7371 var16 = (class_7371)var4;
               }
            } else {
               class_4609 var17 = (class_4609)var4;
               double var8 = var17.method_21368(0.0);
               String var10 = !var17.method_21365() ? "§c" : "§a";
               class_6324.method_28832(var10 + var8);
            }
         } else {
            class_3398 var18 = (class_3398)var4;
            Entity var6 = var18.method_15695(client.theWorld);
            if (var6 != null) {
               var6.method_45509().getString();
            } else {
               String var10000 = "null";
            }

            if (var18.method_15694() != class_92.field_183) {
            }
         }

         if (!(var4 instanceof class_4609) && !(var4 instanceof class_2669) && var4 instanceof class_3835) {
         }
      }
   }

   @EventListen
   public void method_7659(PacketEvent var1) {
      Packet var4 = var1.method_557();
      if (this.method_42015()) {
         if (!(var4 instanceof class_527)) {
         }

         if (!(var4 instanceof class_7573)) {
            if (!(var4 instanceof class_8913)) {
               if (!(var4 instanceof class_509)) {
                  if (!(var4 instanceof class_1625)) {
                     if (!(var4 instanceof class_624)) {
                        if (!(var4 instanceof class_8077)) {
                           if (!(var4 instanceof class_4548)) {
                              if (var4 instanceof class_1897 && this.getBooleanValueByName("Explosions")) {
                                 class_1897 var5 = (class_1897)var1.method_557();
                              }
                           } else {
                              class_4548 var8 = (class_4548)var1.method_557();
                              if (var8.method_21093() != client.thePlayer.method_37145()) {
                              }
                           }
                        } else {
                           class_8077 var9 = (class_8077)var4;
                           if (var9.method_36690().startsWith("team_")) {
                           }

                           for (String var7 : var9.method_36692()) {
                              if (!var7.contains("§") && var7.length() < 2) {
                              }
                           }
                        }
                     } else {
                        class_624 var10 = (class_624)var4;
                     }
                  } else {
                     class_1625 var11 = (class_1625)var4;
                  }
               } else {
                  class_509 var12 = (class_509)var4;
               }
            } else {
               class_8913 var13 = (class_8913)var4;
            }
         } else {
            class_7573 var14 = (class_7573)var4;
         }

         ArrayList var15 = new ArrayList<Class>(
            Arrays.asList(
               class_7573.class,
               class_8913.class,
               class_509.class,
               class_9014.class,
               class_662.class,
               class_4467.class,
               class_5182.class,
               class_457.class,
               class_4548.class
            )
         );
         if (var15.contains(var4.getClass())) {
         }

         if (!(var4 instanceof class_9889)) {
         }
      }
   }

   public List<Entity> method_7664(float var1) {
      List var4 = class_314.method_1440();
      Iterator var5 = var4.iterator();

      while (var5.hasNext()) {
         Entity var6 = (Entity)var5.next();
         if (var6 != client.thePlayer) {
            if (!SigmaMainClass.getInstance().method_3307().method_14460(var6)) {
               if (var6 instanceof class_5834) {
                  if (((class_5834)var6).method_26551() != 0.0F) {
                     if (!(client.thePlayer.method_37175(var6) > var1)) {
                        if (client.thePlayer.method_26608((class_5834)var6)) {
                           if (!(var6 instanceof class_9399) && !(var6 instanceof PlayerEntity)) {
                              if (var6 instanceof PlayerEntity && SigmaMainClass.getInstance().method_3331().method_20495(var6)) {
                                 var5.remove();
                              } else if (client.thePlayer.method_37243() != null && client.thePlayer.method_37243().equals(var6)) {
                                 var5.remove();
                              } else if (!var6.method_37367()) {
                                 if (var6 instanceof PlayerEntity && class_5876.method_26760((PlayerEntity)var6)) {
                                    var5.remove();
                                 }
                              } else {
                                 var5.remove();
                              }
                           } else {
                              var5.remove();
                           }
                        } else {
                           var5.remove();
                        }
                     } else {
                        var5.remove();
                     }
                  } else {
                     var5.remove();
                  }
               } else {
                  var5.remove();
               }
            } else {
               var5.remove();
            }
         } else {
            var5.remove();
         }
      }

      Collections.sort(var4, new class_2659(this));
      return var4;
   }

   public Entity method_7656(float var1) {
      List var4 = class_314.method_1440();
      Entity var5 = null;
      Iterator var6 = var4.iterator();

      while (var6.hasNext()) {
         Entity var7 = (Entity)var6.next();
         if (var7 != client.thePlayer) {
            if (!SigmaMainClass.getInstance().method_3307().method_14460(var7)) {
               if (var7 instanceof class_5834) {
                  if (((class_5834)var7).method_26551() != 0.0F) {
                     if (!(client.thePlayer.method_37175(var7) > var1)) {
                        if (client.thePlayer.method_26608((class_5834)var7)) {
                           if (!(var7 instanceof class_9399)) {
                              if (var7 instanceof PlayerEntity && SigmaMainClass.getInstance().method_3331().method_20495(var7)) {
                                 var6.remove();
                              } else if (client.thePlayer.method_37243() != null && client.thePlayer.method_37243().equals(var7)) {
                                 var6.remove();
                              } else if (!var7.method_37367()) {
                                 if (var5 == null || client.thePlayer.method_37175(var7) < client.thePlayer.method_37175(var5)) {
                                    var5 = var7;
                                 }
                              } else {
                                 var6.remove();
                              }
                           } else {
                              var6.remove();
                           }
                        } else {
                           var6.remove();
                        }
                     } else {
                        var6.remove();
                     }
                  } else {
                     var6.remove();
                  }
               } else {
                  var6.remove();
               }
            } else {
               var6.remove();
            }
         } else {
            var6.remove();
         }
      }

      return var5;
   }

   public static float[] method_7647(Entity var0) {
      double var3 = var0.getPosX() - client.thePlayer.getPosX();
      double var5 = var0.getPosZ() - client.thePlayer.getPosZ();
      double var7 = client.thePlayer.method_37309() + (double) client.thePlayer.method_37277() - (var0.method_37309() + (double)var0.method_37277());
      float var9 = (float)Math.toDegrees(Math.atan2(var5, var3)) - 90.0F;
      double var10 = (double)class_9299.method_42842(var3 * var3 + var5 * var5);
      float var12 = (float)(-(Math.atan2(var7, var10) * 180.0 / Math.PI));
      return new float[]{var9, -var12};
   }

   public static float method_7657(float var0, double var1, double var3) {
      double var7 = var1 - client.thePlayer.getPosX();
      double var9 = var3 - client.thePlayer.getPosZ();
      double var11 = 0.0;
      if (var9 < 0.0 && var7 < 0.0) {
         if (var7 != 0.0) {
            var11 = 90.0 + Math.toDegrees(Math.atan(var9 / var7));
         }
      } else if (var9 < 0.0 && var7 > 0.0) {
         if (var7 != 0.0) {
            var11 = -90.0 + Math.toDegrees(Math.atan(var9 / var7));
         }
      } else if (var9 != 0.0) {
         var11 = Math.toDegrees(-Math.atan(var7 / var9));
      }

      return class_9299.method_42810(-(var0 - (float)var11));
   }

   private double method_7661(double var1, double var3) {
      return var1 + Math.random() * (var3 - var1);
   }

   public static float method_7649(float var0, Entity var1, double var2) {
      double var6 = var1.getPosX() - client.thePlayer.getPosX();
      double var8 = var1.getPosZ() - client.thePlayer.getPosZ();
      double var10 = var2 - 2.2 + (double)var1.method_37277() - client.thePlayer.method_37309();
      double var12 = (double)class_9299.method_42842(var6 * var6 + var8 * var8);
      double var14 = -Math.toDegrees(Math.atan(var10 / var12));
      return -class_9299.method_42810(var0 - (float)var14) - 2.5F;
   }
}
