package remapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;
import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import io.netty.buffer.Unpooled;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_1092 implements class_392 {
   private static final Logger field_6038 = LogManager.getLogger();
   private static final ITextComponent field_6028 = new TranslationTextComponent("disconnect.lost");
   private final class_5121 field_6035;
   private final GameProfile field_6022;
   private final Screen field_6041;
   private MinecraftClient field_6026;
   private ClientWorld field_6021;
   private class_784 field_6025;
   private boolean field_6030;
   private final Map<UUID, class_753> field_6034 = Maps.newHashMap();
   private final class_5692 field_6027;
   private final class_793 field_6032;
   private class_6437 field_6039 = class_6437.field_32865;
   private final class_147 field_6042 = new class_147(this);
   private int field_6023 = 3;
   private final Random field_6033 = new Random();
   private CommandDispatcher<class_8773> field_6040 = new CommandDispatcher();
   private final class_5023 field_6024 = new class_5023();
   private final UUID field_6031 = UUID.randomUUID();
   private Set<class_5621<World>> field_6029;
   public class_6322 field_6037 = class_6322.method_28810();

   public class_1092(MinecraftClient var1, Screen var2, class_5121 var3, GameProfile var4) {
      this.field_6026 = var1;
      this.field_6041 = var2;
      this.field_6035 = var3;
      this.field_6022 = var4;
      this.field_6027 = new class_5692(var1);
      this.field_6032 = new class_793(this, var1);
   }

   public class_793 method_4797() {
      return this.field_6032;
   }

   public void method_4818() {
      this.field_6021 = null;
   }

   public class_5023 method_4812() {
      return this.field_6024;
   }

   @Override
   public void method_1902(class_1992 var1) {
      class_5965.method_27246(var1, this, this.field_6026);
      this.field_6026.playerController = new class_1749(this.field_6026, this);
      if (!this.field_6035.method_23500()) {
         class_4438.method_20596();
      }

      ArrayList var4 = Lists.newArrayList(var1.method_9233());
      Collections.shuffle(var4);
      this.field_6029 = Sets.newLinkedHashSet(var4);
      this.field_6037 = var1.method_9228();
      class_5621 var5 = var1.method_9234();
      class_8760 var6 = var1.method_9232();
      this.field_6023 = var1.method_9229();
      boolean var7 = var1.method_9236();
      boolean var8 = var1.method_9240();
      class_784 var9 = new class_784(class_423.field_1789, var1.method_9231(), var8);
      this.field_6025 = var9;
      this.field_6021 = new ClientWorld(
         this, var9, var5, var6, this.field_6023, this.field_6026::getProfiler, this.field_6026.worldRenderer, var7, var1.method_9235()
      );
      this.field_6026.method_8508(this.field_6021);
      if (this.field_6026.thePlayer == null) {
         this.field_6026.thePlayer = this.field_6026.playerController.method_42131(this.field_6021, new class_4156(), new class_2716());
         this.field_6026.thePlayer.field_41701 = -180.0F;
         if (this.field_6026.method_8515() != null) {
            this.field_6026.method_8515().method_35214(this.field_6026.thePlayer.method_37328());
         }
      }

      this.field_6026.field_9612.method_15551();
      this.field_6026.thePlayer.method_37100();
      int var10 = var1.method_9225();
      this.field_6021.method_762(var10, this.field_6026.thePlayer);
      this.field_6026.thePlayer.field_30533 = new class_8439(this.field_6026.gameOptions);
      this.field_6026.playerController.method_42136(this.field_6026.thePlayer);
      this.field_6026.field_9669 = this.field_6026.thePlayer;
      this.field_6026.method_8609(new class_881());
      this.field_6026.thePlayer.method_37091(var10);
      this.field_6026.thePlayer.method_3151(var1.method_9227());
      this.field_6026.thePlayer.method_27333(var1.method_9230());
      this.field_6026.playerController.method_42126(var1.method_9226());
      this.field_6026.playerController.method_42141(var1.method_9238());
      this.field_6026.gameOptions.method_40870();
      this.field_6035.method_23485(new class_5930(class_5930.field_30076, new class_8248(Unpooled.buffer()).method_37760(class_6489.method_29605())));
      this.field_6026.method_8583().method_19174();
   }

   @Override
   public void method_1919(class_6589 var1) {
      class_5965.method_27246(var1, this, this.field_6026);
      double var4 = var1.method_30329();
      double var6 = var1.method_30331();
      double var8 = var1.method_30339();
      class_6629 var10 = var1.method_30334();
      Object var11;
      if (var10 != class_6629.field_34221) {
         if (var10 != class_6629.field_34311) {
            if (var10 != class_6629.field_34282) {
               if (var10 != class_6629.field_34209) {
                  if (var10 != class_6629.field_34213) {
                     if (var10 != class_6629.field_34254) {
                        if (var10 != class_6629.field_34239) {
                           if (var10 != class_6629.field_34215) {
                              if (var10 != class_6629.field_34290) {
                                 if (var10 != class_6629.field_34260) {
                                    if (var10 != class_6629.field_34284) {
                                       if (var10 != class_6629.field_34247) {
                                          if (var10 != class_6629.field_34328) {
                                             if (var10 != class_6629.field_34319) {
                                                if (var10 != class_6629.field_34275) {
                                                   if (var10 != class_6629.field_34259) {
                                                      if (var10 != class_6629.field_34323) {
                                                         if (var10 != class_6629.field_34280) {
                                                            if (var10 != class_6629.field_34216) {
                                                               if (var10 != class_6629.field_34267) {
                                                                  if (var10 != class_6629.field_34288) {
                                                                     if (var10 != class_6629.field_34329) {
                                                                        if (var10 != class_6629.field_34271) {
                                                                           if (var10 != class_6629.field_34274) {
                                                                              if (var10 != class_6629.field_34309) {
                                                                                 if (var10 != class_6629.field_34312) {
                                                                                    if (var10 != class_6629.field_34219) {
                                                                                       if (var10 != class_6629.field_34330) {
                                                                                          if (var10 != class_6629.field_34291) {
                                                                                             if (var10 != class_6629.field_34289) {
                                                                                                if (var10 != class_6629.field_34273) {
                                                                                                   if (var10 != class_6629.field_34208) {
                                                                                                      if (var10 != class_6629.field_34245) {
                                                                                                         if (var10 != class_6629.field_34279) {
                                                                                                            if (var10 != class_6629.field_34224) {
                                                                                                               var11 = null;
                                                                                                            } else {
                                                                                                               var11 = new class_900(
                                                                                                                  class_6629.field_34224, this.field_6021
                                                                                                               );
                                                                                                            }
                                                                                                         } else {
                                                                                                            var11 = new class_4478(
                                                                                                               this.field_6021, var4, var6, var8
                                                                                                            );
                                                                                                         }
                                                                                                      } else {
                                                                                                         var11 = new class_1453(
                                                                                                            this.field_6021,
                                                                                                            var4,
                                                                                                            var6,
                                                                                                            var8,
                                                                                                            class_6414.method_29293(var1.method_30335())
                                                                                                         );
                                                                                                      }
                                                                                                   } else {
                                                                                                      var11 = new class_91(this.field_6021, var4, var6, var8);
                                                                                                   }
                                                                                                } else {
                                                                                                   var11 = new class_3577(this.field_6021, var4, var6, var8);
                                                                                                }
                                                                                             } else {
                                                                                                var11 = new class_9399(this.field_6021, var4, var6, var8);
                                                                                             }
                                                                                          } else {
                                                                                             var11 = new class_1356(
                                                                                                this.field_6021, var4, var6, var8, (class_5834)null
                                                                                             );
                                                                                          }
                                                                                       } else {
                                                                                          var11 = new class_9149(this.field_6021, var4, var6, var8);
                                                                                       }
                                                                                    } else {
                                                                                       var11 = new class_6093(this.field_6021, var4, var6, var8);
                                                                                    }
                                                                                 } else {
                                                                                    var11 = new class_8011(this.field_6021, var4, var6, var8);
                                                                                 }
                                                                              } else {
                                                                                 var11 = new class_1511(
                                                                                    this.field_6021, var4, var6, var8, 0.0F, 0, (class_5834)null
                                                                                 );
                                                                              }
                                                                           } else {
                                                                              var11 = new class_1890(this.field_6021, var4, var6, var8);
                                                                           }
                                                                        } else {
                                                                           var11 = new class_9552(
                                                                              this.field_6021,
                                                                              var4,
                                                                              var6,
                                                                              var8,
                                                                              var1.method_30336(),
                                                                              var1.method_30338(),
                                                                              var1.method_30332()
                                                                           );
                                                                        }
                                                                     } else {
                                                                        var11 = new class_1044(
                                                                           this.field_6021,
                                                                           var4,
                                                                           var6,
                                                                           var8,
                                                                           var1.method_30336(),
                                                                           var1.method_30338(),
                                                                           var1.method_30332()
                                                                        );
                                                                     }
                                                                  } else {
                                                                     var11 = new class_1593(
                                                                        this.field_6021,
                                                                        var4,
                                                                        var6,
                                                                        var8,
                                                                        var1.method_30336(),
                                                                        var1.method_30338(),
                                                                        var1.method_30332()
                                                                     );
                                                                  }
                                                               } else {
                                                                  var11 = new class_2844(
                                                                     this.field_6021,
                                                                     var4,
                                                                     var6,
                                                                     var8,
                                                                     var1.method_30336(),
                                                                     var1.method_30338(),
                                                                     var1.method_30332()
                                                                  );
                                                               }
                                                            } else {
                                                               var11 = new class_9053(
                                                                  this.field_6021,
                                                                  var4,
                                                                  var6,
                                                                  var8,
                                                                  var1.method_30336(),
                                                                  var1.method_30338(),
                                                                  var1.method_30332()
                                                               );
                                                            }
                                                         } else {
                                                            var11 = new class_8612(this.field_6021, var4, var6, var8, ItemStack.EMPTY);
                                                         }
                                                      } else {
                                                         var11 = new class_7483(this.field_6021, var4, var6, var8);
                                                      }
                                                   } else {
                                                      var11 = new class_1537(this.field_6021, var4, var6, var8);
                                                   }
                                                } else {
                                                   var11 = new class_8008(this.field_6021, new class_1331(var4, var6, var8));
                                                }
                                             } else {
                                                var11 = new class_7451(
                                                   this.field_6021, new class_1331(var4, var6, var8), Direction.method_1033(var1.method_30335())
                                                );
                                             }
                                          } else {
                                             var11 = new class_7548(
                                                this.field_6021, var4, var6, var8, var1.method_30336(), var1.method_30338(), var1.method_30332()
                                             );
                                          }
                                       } else {
                                          var11 = new class_6889(this.field_6021, var4, var6, var8);
                                       }
                                    } else {
                                       var11 = new class_3348(this.field_6021, var4, var6, var8);
                                       Entity var12 = this.field_6021.method_29534(var1.method_30335());
                                       if (var12 != null) {
                                          ((class_6749)var11).method_26159(var12);
                                       }
                                    }
                                 } else {
                                    var11 = new class_7841(this.field_6021, var4, var6, var8);
                                    Entity var13 = this.field_6021.method_29534(var1.method_30335());
                                    if (var13 != null) {
                                       ((class_6749)var11).method_26159(var13);
                                    }
                                 }
                              } else {
                                 var11 = new class_581(this.field_6021, var4, var6, var8);
                                 Entity var14 = this.field_6021.method_29534(var1.method_30335());
                                 if (var14 != null) {
                                    ((class_6749)var11).method_26159(var14);
                                 }
                              }
                           } else {
                              Entity var15 = this.field_6021.method_29534(var1.method_30335());
                              if (!(var15 instanceof class_704)) {
                                 var11 = null;
                              } else {
                                 var11 = new class_3942(this.field_6021, (class_704)var15, var4, var6, var8);
                              }
                           }
                        } else {
                           var11 = new class_1601(this.field_6021, var4, var6, var8);
                        }
                     } else {
                        var11 = new class_4648(this.field_6021, var4, var6, var8);
                     }
                  } else {
                     var11 = new class_9715(this.field_6021, var4, var6, var8);
                  }
               } else {
                  var11 = new class_7339(this.field_6021, var4, var6, var8);
               }
            } else {
               var11 = new class_2048(this.field_6021, var4, var6, var8);
            }
         } else {
            var11 = new class_7851(this.field_6021, var4, var6, var8);
         }
      } else {
         var11 = new class_5340(this.field_6021, var4, var6, var8);
      }

      if (var11 != null) {
         int var16 = var1.method_30333();
         ((Entity)var11).method_37223(var4, var6, var8);
         ((Entity)var11).method_37195(var4, var6, var8);
         ((Entity)var11).field_41755 = (float)(var1.method_30327() * 360) / 256.0F;
         ((Entity)var11).field_41701 = (float)(var1.method_30328() * 360) / 256.0F;
         ((Entity)var11).method_37091(var16);
         ((Entity)var11).method_37377(var1.method_30337());
         this.field_6021.method_725(var16, (Entity)var11);
         if (var11 instanceof class_1080) {
            this.field_6026.method_8590().method_16345(new class_826((class_1080)var11));
         }
      }
   }

   @Override
   public void method_1934(class_3491 var1) {
      class_5965.method_27246(var1, this, this.field_6026);
      double var4 = var1.method_16046();
      double var6 = var1.method_16044();
      double var8 = var1.method_16043();
      class_5614 var10 = new class_5614(this.field_6021, var4, var6, var8, var1.method_16049());
      var10.method_37223(var4, var6, var8);
      var10.field_41701 = 0.0F;
      var10.field_41755 = 0.0F;
      var10.method_37091(var1.method_16045());
      this.field_6021.method_725(var1.method_16045(), var10);
   }

   @Override
   public void method_1900(class_4448 var1) {
      class_5965.method_27246(var1, this, this.field_6026);
      class_5490 var4 = new class_5490(this.field_6021, var1.method_20629(), var1.method_20626(), var1.method_20625());
      var4.method_37091(var1.method_20628());
      var4.method_37377(var1.method_20624());
      this.field_6021.method_725(var1.method_20628(), var4);
   }

   @Override
   public void method_1936(class_4548 var1) {
      class_5965.method_27246(var1, this, this.field_6026);
      Entity var4 = this.field_6021.method_29534(var1.method_21093());
      if (var4 != null) {
         var4.method_37162((double)var1.method_21094() / 8000.0, (double)var1.method_21095() / 8000.0, (double)var1.method_21091() / 8000.0);
      }
   }

   @Override
   public void method_1964(class_8163 var1) {
      class_5965.method_27246(var1, this, this.field_6026);
      Entity var4 = this.field_6021.method_29534(var1.method_37454());
      if (var4 != null && var1.method_37452() != null) {
         var4.method_37372().method_36642(var1.method_37452());
      }
   }

   @Override
   public void method_1947(class_5000 var1) {
      class_5965.method_27246(var1, this, this.field_6026);
      double var4 = var1.method_23016();
      double var6 = var1.method_23020();
      double var8 = var1.method_23018();
      float var10 = (float)(var1.method_23022() * 360) / 256.0F;
      float var11 = (float)(var1.method_23015() * 360) / 256.0F;
      if (this.method_4800(var1.method_23019()) != null) {
         int var12 = var1.method_23017();
         class_9745 var13 = new class_9745(this.field_6026.theWorld, this.method_4800(var1.method_23019()).method_3392());
         var13.method_37091(var12);
         var13.method_37306(var4, var6, var8);
         var13.method_37223(var4, var6, var8);
         var13.method_37249(var4, var6, var8, var10, var11);
         this.field_6021.method_762(var12, var13);
      }
   }

   @Override
   public void method_1933(class_2171 var1) {
      class_5965.method_27246(var1, this, this.field_6026);
      Entity var4 = this.field_6021.method_29534(var1.method_10082());
      if (var4 != null) {
         double var5 = var1.method_10084();
         double var7 = var1.method_10085();
         double var9 = var1.method_10081();
         var4.method_37223(var5, var7, var9);
         if (!var4.method_37069()) {
            float var11 = (float)(var1.method_10088() * 360) / 256.0F;
            float var12 = (float)(var1.method_10086() * 360) / 256.0F;
            var4.method_37318(var5, var7, var9, var11, var12, 3, true);
            var4.method_37386(var1.method_10089());
         }
      }
   }

   @Override
   public void method_1965(class_4020 var1) {
      class_5965.method_27246(var1, this, this.field_6026);
      if (class_7051.method_32417(var1.method_18514())) {
         this.field_6026.thePlayer.inventory.field_36404 = var1.method_18514();
      }
   }

   @Override
   public void method_1962(class_527 var1) {
      class_5965.method_27246(var1, this, this.field_6026);
      Entity var4 = var1.method_2564(this.field_6021);
      if (var4 != null && !var4.method_37069()) {
         if (!var1.method_2565()) {
            if (var1.method_2560()) {
               float var5 = (float)(var1.method_2557() * 360) / 256.0F;
               float var6 = (float)(var1.method_2561() * 360) / 256.0F;
               var4.method_37318(var4.method_37302(), var4.method_37309(), var4.method_37156(), var5, var6, 3, false);
            }
         } else {
            class_1343 var8 = var1.method_2558(var4.method_37103());
            var4.method_37358(var8);
            float var9 = !var1.method_2560() ? var4.field_41701 : (float)(var1.method_2557() * 360) / 256.0F;
            float var7 = !var1.method_2560() ? var4.field_41755 : (float)(var1.method_2561() * 360) / 256.0F;
            var4.method_37318(var8.method_61(), var8.method_60(), var8.method_62(), var9, var7, 3, false);
         }

         var4.method_37386(var1.method_2554());
      }
   }

   @Override
   public void method_1981(class_457 var1) {
      class_5965.method_27246(var1, this, this.field_6026);
      Entity var4 = var1.method_2192(this.field_6021);
      if (var4 != null) {
         float var5 = (float)(var1.method_2191() * 360) / 256.0F;
         var4.method_37257(var5, 3);
      }
   }

   @Override
   public void method_1895(class_3985 var1) {
      class_5965.method_27246(var1, this, this.field_6026);

      for (int var4 = 0; var4 < var1.method_18381().length; var4++) {
         int var5 = var1.method_18381()[var4];
         this.field_6021.method_754(var5);
      }
   }

   @Override
   public void method_1894(class_509 var1) {
      class_5965.method_27246(var1, this, this.field_6026);
      ClientPlayerEntity var4 = this.field_6026.thePlayer;
      class_1343 var5 = var4.method_37098();
      boolean var6 = var1.method_2518().contains(class_8089.field_41423);
      boolean var7 = var1.method_2518().contains(class_8089.field_41427);
      boolean var8 = var1.method_2518().contains(class_8089.field_41424);
      double var9;
      double var11;
      if (!var6) {
         var9 = 0.0;
         var11 = var1.method_2520();
         var4.field_41754 = var11;
      } else {
         var9 = var5.method_61();
         var11 = var4.method_37302() + var1.method_2520();
         var4.field_41754 = var4.field_41754 + var1.method_2520();
      }

      double var13;
      double var15;
      if (!var7) {
         var13 = 0.0;
         var15 = var1.method_2517();
         var4.field_41713 = var15;
      } else {
         var13 = var5.method_60();
         var15 = var4.method_37309() + var1.method_2517();
         var4.field_41713 = var4.field_41713 + var1.method_2517();
      }

      double var17;
      double var19;
      if (!var8) {
         var17 = 0.0;
         var19 = var1.method_2519();
         var4.field_41724 = var19;
      } else {
         var17 = var5.method_62();
         var19 = var4.method_37156() + var1.method_2519();
         var4.field_41724 = var4.field_41724 + var1.method_2519();
      }

      if (var4.field_41697 > 0 && var4.method_37243() != null) {
         var4.method_37389();
      }

      var4.method_37222(var11, var15, var19);
      var4.field_41767 = var11;
      var4.field_41698 = var15;
      var4.field_41725 = var19;
      var4.method_37214(var9, var13, var17);
      float var21 = var1.method_2522();
      float var22 = var1.method_2523();
      if (var1.method_2518().contains(class_8089.field_41429)) {
         var22 += var4.field_41755;
      }

      if (var1.method_2518().contains(class_8089.field_41428)) {
         var21 += var4.field_41701;
      }

      var4.method_37249(var11, var15, var19, var21, var22);
      this.field_6035.method_23485(new class_2492(var1.method_2521()));
      this.field_6035.method_23485(new class_1514(var4.method_37302(), var4.method_37309(), var4.method_37156(), var4.field_41701, var4.field_41755, false));
      if (!this.field_6030) {
         this.field_6030 = true;
         this.field_6026.method_8609((Screen)null);
      }
   }

   @Override
   public void method_1932(class_4467 var1) {
      class_5965.method_27246(var1, this, this.field_6026);
      int var4 = 19 | (!var1.method_20732() ? 0 : 128);
      var1.method_20730((var2, var3) -> this.field_6021.method_7513(var2, var3, var4));
   }

   @Override
   public void method_1923(class_4808 var1) {
      class_5965.method_27246(var1, this, this.field_6026);
      int var4 = var1.method_22149();
      int var5 = var1.method_22151();
      class_546 var6 = var1.method_22144() != null
         ? new class_546(this.field_6037.<class_6325>method_28813(class_8669.field_44359), var1.method_22144())
         : null;
      class_2654 var7 = this.field_6021
         .method_745()
         .method_24465(var4, var5, var6, var1.method_22147(), var1.method_22146(), var1.method_22152(), var1.method_22141());
      if (var7 != null && var1.method_22141()) {
         this.field_6021.method_723(var7);
      }

      for (int var8 = 0; var8 < 16; var8++) {
         this.field_6021.method_720(var4, var8, var5);
      }

      for (CompoundNBT var9 : var1.method_22143()) {
         class_1331 var10 = new class_1331(var9.method_25947("x"), var9.method_25947("y"), var9.method_25947("z"));
         class_3757 var11 = this.field_6021.method_28260(var10);
         if (var11 != null) {
            var11.method_17394(this.field_6021.method_28262(var10), var9);
         }
      }
   }

   @Override
   public void method_1897(class_2972 var1) {
      class_5965.method_27246(var1, this, this.field_6026);
      int var4 = var1.method_13579();
      int var5 = var1.method_13580();
      class_5360 var6 = this.field_6021.method_745();
      var6.method_24471(var4, var5);
      class_4663 var7 = var6.method_14813();

      for (int var8 = 0; var8 < 16; var8++) {
         this.field_6021.method_720(var4, var8, var5);
         var7.method_34830(class_6979.method_31893(var4, var8, var5), true);
      }

      var7.method_21563(new class_2034(var4, var5), false);
   }

   @Override
   public void method_1960(class_4267 var1) {
      class_5965.method_27246(var1, this, this.field_6026);
      this.field_6021.method_743(var1.method_19867(), var1.method_19868());
   }

   @Override
   public void method_1914(class_7957 var1) {
      this.field_6035.method_23482(var1.method_35999());
   }

   @Override
   public void method_9090(ITextComponent var1) {
      this.field_6026.method_8499();
      if (this.field_6041 == null) {
         this.field_6026.method_8609(new class_7773(new class_4145(new class_1876()), field_6028, var1));
      } else if (!(this.field_6041 instanceof class_1094)) {
         this.field_6026.method_8609(new class_7773(this.field_6041, field_6028, var1));
      } else {
         this.field_6026.method_8609(new class_6185(this.field_6041, field_6028, var1));
      }
   }

   public void method_4813(Packet<?> var1) {
      this.field_6035.method_23485(var1);
   }

   @Override
   public void method_1961(class_4476 var1) {
      class_5965.method_27246(var1, this, this.field_6026);
      Entity var4 = this.field_6021.method_29534(var1.method_20771());
      Object var5 = (class_5834)this.field_6021.method_29534(var1.method_20770());
      if (var5 == null) {
         var5 = this.field_6026.thePlayer;
      }

      if (var4 != null) {
         if (!(var4 instanceof class_5614)) {
            this.field_6021
               .method_29527(
                  var4.method_37302(),
                  var4.method_37309(),
                  var4.method_37156(),
                  class_463.field_2732,
                  class_562.field_3335,
                  0.2F,
                  (this.field_6033.nextFloat() - this.field_6033.nextFloat()) * 1.4F + 2.0F,
                  false
               );
         } else {
            this.field_6021
               .method_29527(
                  var4.method_37302(),
                  var4.method_37309(),
                  var4.method_37156(),
                  class_463.field_2688,
                  class_562.field_3335,
                  0.1F,
                  (this.field_6033.nextFloat() - this.field_6033.nextFloat()) * 0.35F + 0.9F,
                  false
               );
         }

         this.field_6026
            .field_9572
            .method_43044(new class_7314(this.field_6026.method_8587(), this.field_6026.method_8589(), this.field_6021, var4, (Entity)var5));
         if (!(var4 instanceof class_91)) {
            this.field_6021.method_754(var1.method_20771());
         } else {
            class_91 var6 = (class_91)var4;
            ItemStack var7 = var6.method_264();
            var7.method_27970(var1.method_20769());
            if (var7.method_28022()) {
               this.field_6021.method_754(var1.method_20771());
            }
         }
      }
   }

   @Override
   public void method_1951(class_5182 var1) {
      class_5965.method_27246(var1, this, this.field_6026);
      this.field_6026.field_9614.method_13992(var1.method_23771(), var1.method_23768(), var1.method_23772());
   }

   @Override
   public void method_1918(class_8329 var1) {
      class_5965.method_27246(var1, this, this.field_6026);
      Entity var4 = this.field_6021.method_29534(var1.method_38366());
      if (var4 != null) {
         if (var1.method_38365() != 0) {
            if (var1.method_38365() != 3) {
               if (var1.method_38365() != 1) {
                  if (var1.method_38365() != 2) {
                     if (var1.method_38365() != 4) {
                        if (var1.method_38365() == 5) {
                           this.field_6026.field_9572.method_43051(var4, class_3090.field_15360);
                        }
                     } else {
                        this.field_6026.field_9572.method_43051(var4, class_3090.field_15322);
                     }
                  } else {
                     class_704 var5 = (class_704)var4;
                     var5.method_3162(false, false);
                  }
               } else {
                  var4.method_37082();
               }
            } else {
               class_5834 var6 = (class_5834)var4;
               var6.method_26597(class_2584.field_12794);
            }
         } else {
            class_5834 var7 = (class_5834)var4;
            var7.method_26597(class_2584.field_12791);
         }
      }
   }

   @Override
   public void method_1905(class_4228 var1) {
      class_5965.method_27246(var1, this, this.field_6026);
      double var4 = var1.method_19688();
      double var6 = var1.method_19694();
      double var8 = var1.method_19697();
      float var10 = (float)(var1.method_19700() * 360) / 256.0F;
      float var11 = (float)(var1.method_19696() * 360) / 256.0F;
      class_5834 var12 = (class_5834)class_6629.method_30482(var1.method_19692(), this.field_6026.theWorld);
      if (var12 == null) {
         field_6038.warn("Skipping Entity with id {}", var1.method_19692());
      } else {
         var12.method_37223(var4, var6, var8);
         var12.field_29605 = (float)(var1.method_19690() * 360) / 256.0F;
         var12.field_29618 = (float)(var1.method_19690() * 360) / 256.0F;
         if (var12 instanceof class_2770) {
            class_5708[] var13 = ((class_2770)var12).method_12615();

            for (int var14 = 0; var14 < var13.length; var14++) {
               var13[var14].method_37091(var14 + var1.method_19693());
            }
         }

         var12.method_37091(var1.method_19693());
         var12.method_37377(var1.method_19691());
         var12.method_37249(var4, var6, var8, var10, var11);
         var12.method_37214(
            (double)((float)var1.method_19687() / 8000.0F), (double)((float)var1.method_19689() / 8000.0F), (double)((float)var1.method_19695() / 8000.0F)
         );
         this.field_6021.method_725(var1.method_19693(), var12);
         if (var12 instanceof class_8829) {
            boolean var15 = ((class_8829)var12).method_28537();
            Object var16;
            if (!var15) {
               var16 = new class_9309((class_8829)var12);
            } else {
               var16 = new class_7328((class_8829)var12);
            }

            this.field_6026.method_8590().method_16351((class_6483)var16);
         }
      }
   }

   @Override
   public void method_1971(class_8508 var1) {
      class_5965.method_27246(var1, this, this.field_6026);
      this.field_6026.theWorld.method_735(var1.method_39180());
      this.field_6026.theWorld.method_719(var1.method_39179());
   }

   @Override
   public void method_1893(class_2073 var1) {
      class_5965.method_27246(var1, this, this.field_6026);
      this.field_6026.theWorld.method_752(var1.method_9676(), var1.method_9679());
   }

   @Override
   public void method_1917(class_4597 var1) {
      class_5965.method_27246(var1, this, this.field_6026);
      Entity var4 = this.field_6021.method_29534(var1.method_21303());
      if (var4 != null) {
         boolean var5 = var4.method_37315(this.field_6026.thePlayer);
         var4.method_37305();

         for (int var9 : var1.method_21304()) {
            Entity var10 = this.field_6021.method_29534(var9);
            if (var10 != null) {
               var10.method_37354(var4, true);
               if (var10 == this.field_6026.thePlayer && !var5) {
                  this.field_6026
                     .field_9614
                     .method_13982(new TranslationTextComponent("mount.onboard", this.field_6026.gameOptions.keySneak.method_27061()), false);
               }
            }
         }
      } else {
         field_6038.warn("Received passengers for unknown entity");
      }
   }

   @Override
   public void method_1910(class_2708 var1) {
      class_5965.method_27246(var1, this, this.field_6026);
      Entity var4 = this.field_6021.method_29534(var1.method_12206());
      if (var4 instanceof class_5886) {
         ((class_5886)var4).method_26894(var1.method_12204());
      }
   }

   private static ItemStack method_4816(class_704 var0) {
      for (class_2584 var6 : class_2584.values()) {
         ItemStack var7 = var0.method_26617(var6);
         if (var7.method_27960() == class_4897.field_24472) {
            return var7;
         }
      }

      return new ItemStack(class_4897.field_24472);
   }

   @Override
   public void method_1906(class_295 var1) {
      class_5965.method_27246(var1, this, this.field_6026);
      Entity var4 = var1.method_1331(this.field_6021);
      if (var4 != null) {
         if (var1.method_1329() != 21) {
            if (var1.method_1329() != 35) {
               var4.method_37336(var1.method_1329());
            } else {
               byte var5 = 40;
               this.field_6026.field_9572.method_43042(var4, class_3090.field_15334, 30);
               this.field_6021
                  .method_29527(var4.method_37302(), var4.method_37309(), var4.method_37156(), class_463.field_2834, var4.method_37197(), 1.0F, 1.0F, false);
               if (var4 == this.field_6026.thePlayer) {
                  this.field_6026.gameRenderer.method_35946(method_4816(this.field_6026.thePlayer));
               }
            }
         } else {
            this.field_6026.method_8590().method_16345(new class_2704((class_337)var4));
         }
      }
   }

   @Override
   public void method_1968(class_3605 var1) {
      class_5965.method_27246(var1, this, this.field_6026);
      this.field_6026.thePlayer.method_27310(var1.method_16823());
      this.field_6026.thePlayer.method_3161().method_42235(var1.method_16824());
      this.field_6026.thePlayer.method_3161().method_42232(var1.method_16821());
   }

   @Override
   public void method_1955(class_8175 var1) {
      class_5965.method_27246(var1, this, this.field_6026);
      this.field_6026.thePlayer.method_27314(var1.method_37479(), var1.method_37480(), var1.method_37478());
   }

   @Override
   public void method_1941(class_7786 var1) {
      class_5965.method_27246(var1, this, this.field_6026);
      class_5621 var4 = var1.method_35339();
      class_8760 var5 = var1.method_35335();
      ClientPlayerEntity var6 = this.field_6026.thePlayer;
      int var7 = var6.method_37145();
      this.field_6030 = false;
      if (var4 != var6.field_41768.method_29545()) {
         class_1097 var8 = this.field_6021.method_29562();
         boolean var9 = var1.method_35336();
         boolean var10 = var1.method_35338();
         class_784 var11 = new class_784(this.field_6025.method_8661(), this.field_6025.method_8659(), var10);
         this.field_6025 = var11;
         this.field_6021 = new ClientWorld(
            this, var11, var4, var5, this.field_6023, this.field_6026::getProfiler, this.field_6026.worldRenderer, var9, var1.method_35332()
         );
         this.field_6021.method_756(var8);
         this.field_6026.method_8508(this.field_6021);
         this.field_6026.method_8609(new class_881());
      }

      this.field_6021.method_718();
      String var12 = var6.method_27309();
      this.field_6026.field_9669 = null;
      ClientPlayerEntity var13 = this.field_6026
         .playerController
         .method_42130(this.field_6021, var6.method_27331(), var6.method_27334(), var6.method_37252(), var6.method_37321());
      var13.method_37091(var7);
      this.field_6026.thePlayer = var13;
      if (var4 != var6.field_41768.method_29545()) {
         this.field_6026.method_8575().method_31312();
      }

      this.field_6026.field_9669 = var13;
      var13.method_37372().method_36642(var6.method_37372().method_36629());
      if (var1.method_35333()) {
         var13.method_26590().method_30804(var6.method_26590());
      }

      var13.method_37100();
      var13.method_27315(var12);
      this.field_6021.method_762(var7, var13);
      var13.field_41701 = -180.0F;
      var13.field_30533 = new class_8439(this.field_6026.gameOptions);
      this.field_6026.playerController.method_42136(var13);
      var13.method_3151(var6.method_3179());
      var13.method_27333(var6.method_27329());
      if (this.field_6026.field_9623 instanceof class_7696) {
         this.field_6026.method_8609((Screen)null);
      }

      this.field_6026.playerController.method_42126(var1.method_35334());
      this.field_6026.playerController.method_42141(var1.method_35330());
   }

   @Override
   public void method_1931(class_1897 var1) {
      class_5965.method_27246(var1, this, this.field_6026);
      class_2730 var4 = new class_2730(
         this.field_6026.theWorld, (Entity)null, var1.method_8624(), var1.method_8622(), var1.method_8623(), var1.method_8630(), var1.method_8629()
      );
      var4.method_12272(true);
      this.field_6026
         .thePlayer
         .method_37215(
            this.field_6026.thePlayer.method_37098().method_6214((double)var1.method_8628(), (double)var1.method_8627(), (double)var1.method_8626())
         );
   }

   @Override
   public void method_1967(class_6390 var1) {
      class_5965.method_27246(var1, this, this.field_6026);
      Entity var4 = this.field_6021.method_29534(var1.method_29185());
      if (var4 instanceof class_4109) {
         ClientPlayerEntity var5 = this.field_6026.thePlayer;
         class_4109 var6 = (class_4109)var4;
         class_4657 var7 = new class_4657(var1.method_29186());
         class_7741 var8 = new class_7741(var1.method_29189(), var5.inventory, var7, var6);
         var5.field_3874 = var8;
         this.field_6026.method_8609(new class_4401(var8, var5.inventory, var6));
      }
   }

   @Override
   public void method_1956(class_5149 var1) {
      class_5965.method_27246(var1, this, this.field_6026);
      class_2150.method_10038(var1.method_23575(), this.field_6026, var1.method_23577(), var1.method_23576());
   }

   @Override
   public void method_1935(class_5491 var1) {
      class_5965.method_27246(var1, this, this.field_6026);
      ClientPlayerEntity var4 = this.field_6026.thePlayer;
      ItemStack var5 = var1.method_24953();
      int var6 = var1.method_24956();
      this.field_6026.method_8531().method_40531(var5);
      if (var1.method_24952() != -1) {
         if (var1.method_24952() != -2) {
            boolean var7 = false;
            if (this.field_6026.field_9623 instanceof class_2546) {
               class_2546 var8 = (class_2546)this.field_6026.field_9623;
               var7 = var8.method_11595() != class_8230.field_42263.method_37688();
            }

            if (var1.method_24952() == 0 && var1.method_24956() >= 36 && var6 < 45) {
               if (!var5.method_28022()) {
                  ItemStack var9 = var4.field_3869.method_18878(var6).method_35898();
                  if (var9.method_28022() || var9.method_27997() < var5.method_27997()) {
                     var5.method_27968(5);
                  }
               }

               var4.field_3869.method_18871(var6, var5);
            } else if (var1.method_24952() == var4.field_3874.field_19925 && (var1.method_24952() != 0 || !var7)) {
               var4.field_3874.method_18871(var6, var5);
            }
         } else {
            var4.inventory.method_31503(var6, var5);
         }
      } else if (!(this.field_6026.field_9623 instanceof class_2546)) {
         var4.inventory.method_32408(var5);
      }
   }

   @Override
   public void method_1970(class_8913 var1) {
      class_5965.method_27246(var1, this, this.field_6026);
      Object var4 = null;
      ClientPlayerEntity var5 = this.field_6026.thePlayer;
      if (var1.method_40994() != 0) {
         if (var1.method_40994() == var5.field_3874.field_19925) {
            var4 = var5.field_3874;
         }
      } else {
         var4 = var5.field_3869;
      }

      if (var4 != null && !var1.method_40997()) {
         this.method_4813(new class_3835(var1.method_40994(), var1.method_40996(), true));
      }
   }

   @Override
   public void method_1921(class_9860 var1) {
      class_5965.method_27246(var1, this, this.field_6026);
      ClientPlayerEntity var4 = this.field_6026.thePlayer;
      if (var1.method_45476() != 0) {
         if (var1.method_45476() == var4.field_3874.field_19925) {
            var4.field_3874.method_18854(var1.method_45478());
         }
      } else {
         var4.field_3869.method_18854(var1.method_45478());
      }
   }

   @Override
   public void method_1979(class_9402 var1) {
      class_5965.method_27246(var1, this, this.field_6026);
      Object var4 = this.field_6021.method_28260(var1.method_43546());
      if (!(var4 instanceof class_8398)) {
         var4 = new class_8398();
         ((class_3757)var4).method_17393(this.field_6021, var1.method_43546());
      }

      this.field_6026.thePlayer.method_3244((class_8398)var4);
   }

   @Override
   public void method_1903(class_5029 var1) {
      class_5965.method_27246(var1, this, this.field_6026);
      class_1331 var4 = var1.method_23192();
      class_3757 var5 = this.field_6026.theWorld.method_28260(var4);
      int var6 = var1.method_23195();
      boolean var7 = var6 == 2 && var5 instanceof class_7454;
      if (var6 == 1 && var5 instanceof class_1896
         || var7
         || var6 == 3 && var5 instanceof class_1100
         || var6 == 4 && var5 instanceof class_4797
         || var6 == 6 && var5 instanceof class_8837
         || var6 == 7 && var5 instanceof class_945
         || var6 == 8 && var5 instanceof class_5555
         || var6 == 9 && var5 instanceof class_8398
         || var6 == 11 && var5 instanceof class_1578
         || var6 == 5 && var5 instanceof class_3756
         || var6 == 12 && var5 instanceof class_6786
         || var6 == 13 && var5 instanceof class_557
         || var6 == 14 && var5 instanceof class_5354) {
         var5.method_17394(this.field_6026.theWorld.method_28262(var4), var1.method_23191());
      }

      if (var7 && this.field_6026.field_9623 instanceof class_7808) {
         ((class_7808)this.field_6026.field_9623).method_35394();
      }
   }

   @Override
   public void method_1977(class_5403 var1) {
      class_5965.method_27246(var1, this, this.field_6026);
      ClientPlayerEntity var4 = this.field_6026.thePlayer;
      if (var4.field_3874 != null && var4.field_3874.field_19925 == var1.method_24598()) {
         var4.field_3874.method_18869(var1.method_24595(), var1.method_24594());
      }
   }

   @Override
   public void method_1957(class_9014 var1) {
      class_5965.method_27246(var1, this, this.field_6026);
      Entity var4 = this.field_6021.method_29534(var1.method_41364());
      if (var4 != null) {
         var1.method_41363().forEach(var1x -> var4.method_37349((class_6943)var1x.getFirst(), (ItemStack)var1x.getSecond()));
      }
   }

   @Override
   public void method_1952(class_5257 var1) {
      class_5965.method_27246(var1, this, this.field_6026);
      this.field_6026.thePlayer.method_27327();
   }

   @Override
   public void method_1939(class_6944 var1) {
      class_5965.method_27246(var1, this, this.field_6026);
      this.field_6026.theWorld.method_29521(var1.method_31774(), var1.method_31777(), var1.method_31775(), var1.method_31776());
   }

   @Override
   public void method_1908(class_4729 var1) {
      class_5965.method_27246(var1, this, this.field_6026);
      this.field_6026.theWorld.method_29568(var1.method_21845(), var1.method_21847(), var1.method_21844());
   }

   @Override
   public void method_1909(class_2161 var1) {
      class_5965.method_27246(var1, this, this.field_6026);
      ClientPlayerEntity var4 = this.field_6026.thePlayer;
      class_8183 var5 = var1.method_10056();
      float var6 = var1.method_10055();
      int var7 = class_9299.method_42848(var6 + 0.5F);
      if (var5 != class_2161.field_10779) {
         if (var5 != class_2161.field_10786) {
            if (var5 != class_2161.field_10778) {
               if (var5 != class_2161.field_10791) {
                  if (var5 != class_2161.field_10784) {
                     if (var5 != class_2161.field_10781) {
                        if (var5 != class_2161.field_10780) {
                           if (var5 != class_2161.field_10777) {
                              if (var5 != class_2161.field_10789) {
                                 if (var5 != class_2161.field_10787) {
                                    if (var5 != class_2161.field_10788) {
                                       if (var5 == class_2161.field_10782) {
                                          this.field_6026.thePlayer.method_27333(var6 == 0.0F);
                                       }
                                    } else {
                                       this.field_6021
                                          .method_43361(class_3090.field_15335, var4.method_37302(), var4.method_37309(), var4.method_37156(), 0.0, 0.0, 0.0);
                                       if (var7 == 1) {
                                          this.field_6021
                                             .method_29528(
                                                var4,
                                                var4.method_37302(),
                                                var4.method_37309(),
                                                var4.method_37156(),
                                                class_463.field_2239,
                                                class_562.field_3332,
                                                1.0F,
                                                1.0F
                                             );
                                       }
                                    }
                                 } else {
                                    this.field_6021
                                       .method_29528(
                                          var4,
                                          var4.method_37302(),
                                          var4.method_37309(),
                                          var4.method_37156(),
                                          class_463.field_1961,
                                          class_562.field_3328,
                                          1.0F,
                                          1.0F
                                       );
                                 }
                              } else {
                                 this.field_6021.method_29560(var6);
                              }
                           } else {
                              this.field_6021.method_29582(var6);
                           }
                        } else {
                           this.field_6021
                              .method_29528(
                                 var4, var4.method_37302(), var4.method_37388(), var4.method_37156(), class_463.field_2743, class_562.field_3335, 0.18F, 0.45F
                              );
                        }
                     } else {
                        GameOptions var8 = this.field_6026.gameOptions;
                        if (var6 != 0.0F) {
                           if (var6 != 101.0F) {
                              if (var6 != 102.0F) {
                                 if (var6 != 103.0F) {
                                    if (var6 == 104.0F) {
                                       this.field_6026
                                          .field_9614
                                          .method_13991()
                                          .method_18676(new TranslationTextComponent("demo.day.6", var8.keyScreenshot.method_27061()));
                                    }
                                 } else {
                                    this.field_6026
                                       .field_9614
                                       .method_13991()
                                       .method_18676(new TranslationTextComponent("demo.help.inventory", var8.keyInventory.method_27061()));
                                 }
                              } else {
                                 this.field_6026
                                    .field_9614
                                    .method_13991()
                                    .method_18676(new TranslationTextComponent("demo.help.jump", var8.keyJump.method_27061()));
                              }
                           } else {
                              this.field_6026
                                 .field_9614
                                 .method_13991()
                                 .method_18676(
                                    new TranslationTextComponent(
                                       "demo.help.movement",
                                       var8.keyForward.method_27061(),
                                       var8.keyLeft.method_27061(),
                                       var8.keyBack.method_27061(),
                                       var8.keyRight.method_27061()
                                    )
                                 );
                           }
                        } else {
                           this.field_6026.method_8609(new class_207());
                        }
                     }
                  } else if (var7 != 0) {
                     if (var7 == 1) {
                        this.field_6026
                           .method_8609(new class_3129(true, () -> this.field_6026.thePlayer.field_30532.method_4813(new class_8559(class_2105.field_10549))));
                     }
                  } else {
                     this.field_6026.thePlayer.field_30532.method_4813(new class_8559(class_2105.field_10549));
                     this.field_6026.method_8609(new class_881());
                  }
               } else {
                  this.field_6026.playerController.method_42126(GameType.method_21590(var7));
               }
            } else {
               this.field_6021.method_749().method_8665(false);
               this.field_6021.method_29582(1.0F);
            }
         } else {
            this.field_6021.method_749().method_8665(true);
            this.field_6021.method_29582(0.0F);
         }
      } else {
         var4.method_3251(new TranslationTextComponent("block.minecraft.spawn.not_valid"), false);
      }
   }

   @Override
   public void method_1963(class_1053 var1) {
      class_5965.method_27246(var1, this, this.field_6026);
      class_8451 var4 = this.field_6026.gameRenderer.method_35928();
      String var5 = class_2143.method_10015(var1.method_4633());
      class_2134 var6 = this.field_6026.theWorld.method_29533(var5);
      if (var6 == null) {
         var6 = new class_2134(var5);
         if (var4.method_38865(var5) != null) {
            class_2134 var7 = var4.method_38861(var4.method_38865(var5));
            if (var7 != null) {
               var6 = var7;
            }
         }

         this.field_6026.theWorld.method_29524(var6);
      }

      var1.method_4632(var6);
      var4.method_38857(var6);
   }

   @Override
   public void method_1974(class_6639 var1) {
      class_5965.method_27246(var1, this, this.field_6026);
      if (!var1.method_30509()) {
         this.field_6026.theWorld.method_43364(var1.method_30508(), var1.method_30506(), var1.method_30507());
      } else {
         this.field_6026.theWorld.method_29589(var1.method_30508(), var1.method_30506(), var1.method_30507());
      }
   }

   @Override
   public void method_1926(class_6642 var1) {
      class_5965.method_27246(var1, this, this.field_6026);
      this.field_6027.method_25745(var1);
   }

   @Override
   public void method_1943(class_4472 var1) {
      class_5965.method_27246(var1, this, this.field_6026);
      Identifier var4 = var1.method_20755();
      if (var4 != null) {
         class_3139 var5 = this.field_6027.method_25749().method_18078(var4);
         this.field_6027.method_25746(var5, false);
      } else {
         this.field_6027.method_25746((class_3139)null, false);
      }
   }

   @Override
   public void method_1922(class_8376 var1) {
      class_5965.method_27246(var1, this, this.field_6026);
      this.field_6040 = new CommandDispatcher(var1.method_38585());
   }

   @Override
   public void method_1896(class_4935 var1) {
      class_5965.method_27246(var1, this, this.field_6026);
      this.field_6026.method_8590().method_16337(var1.method_22631(), var1.method_22632());
   }

   @Override
   public void method_1953(class_2610 var1) {
      class_5965.method_27246(var1, this, this.field_6026);
      this.field_6032.method_3521(var1.method_11845(), var1.method_11842());
   }

   @Override
   public void method_1946(class_6621 var1) {
      class_5965.method_27246(var1, this, this.field_6026);
      this.field_6024.method_23140(var1.method_30439());
      class_1272 var4 = this.field_6026.<class_7735>method_8532(SearchManager.field_4278);
      var4.method_5711();
      class_2716 var5 = this.field_6026.thePlayer.method_27334();
      var5.method_12235(this.field_6024.method_23141());
      var5.method_12232().forEach(var4::method_5709);
      var4.method_5710();
   }

   @Override
   public void method_1920(class_2436 var1) {
      class_5965.method_27246(var1, this, this.field_6026);
      class_1343 var4 = var1.method_11101(this.field_6021);
      if (var4 != null) {
         this.field_6026.thePlayer.method_37332(var1.method_11099(), var4);
      }
   }

   @Override
   public void method_1942(class_4798 var1) {
      class_5965.method_27246(var1, this, this.field_6026);
      if (!this.field_6042.method_568(var1.method_22115(), var1.method_22116())) {
         field_6038.debug("Got unhandled response to tag query {}", var1.method_22115());
      }
   }

   @Override
   public void method_1929(class_7630 var1) {
      class_5965.method_27246(var1, this, this.field_6026);

      for (Entry var5 : var1.method_34578().entrySet()) {
         class_6676 var6 = (class_6676)var5.getKey();
         int var7 = (Integer)var5.getValue();
         this.field_6026.thePlayer.method_27331().method_19275(this.field_6026.thePlayer, var6, var7);
      }

      if (this.field_6026.field_9623 instanceof class_2092) {
         ((class_2092)this.field_6026.field_9623).method_9793();
      }
   }

   @Override
   public void method_1912(class_6791 var1) {
      class_5965.method_27246(var1, this, this.field_6026);
      class_2716 var4 = this.field_6026.thePlayer.method_27334();
      var4.method_5080(var1.method_31130());
      class_6265 var5 = var1.method_31128();
      switch (var5) {
         case field_32010:
            for (Identifier var13 : var1.method_31127()) {
               this.field_6024.method_23139(var13).ifPresent(var4::method_5070);
            }
            break;
         case field_32013:
            for (Identifier var11 : var1.method_31127()) {
               this.field_6024.method_23139(var11).ifPresent(var4::method_5084);
            }

            for (Identifier var12 : var1.method_31129()) {
               this.field_6024.method_23139(var12).ifPresent(var4::method_5078);
            }
            break;
         case field_32011:
            for (Identifier var7 : var1.method_31127()) {
               this.field_6024.method_23139(var7).ifPresent(var2 -> {
                  var4.method_5084((class_8932<?>)var2);
                  var4.method_5078((class_8932<?>)var2);
                  class_4678.method_21628(this.field_6026.method_8519(), (class_8932<?>)var2);
               });
            }
      }

      var4.method_12232().forEach(var1x -> var1x.method_35015(var4));
      if (this.field_6026.field_9623 instanceof class_474) {
         ((class_474)this.field_6026.field_9623).method_2263();
      }
   }

   @Override
   public void method_1904(class_1661 var1) {
      class_5965.method_27246(var1, this, this.field_6026);
      Entity var4 = this.field_6021.method_29534(var1.method_7395());
      if (var4 instanceof class_5834) {
         class_1425 var5 = class_1425.method_6538(var1.method_7396());
         if (var5 != null) {
            class_2250 var6 = new class_2250(var5, var1.method_7404(), var1.method_7398(), var1.method_7402(), var1.method_7399(), var1.method_7397());
            var6.method_10335(var1.method_7400());
            ((class_5834)var4).method_26440(var6);
         }
      }
   }

   @Override
   public void method_1973(class_5042 var1) {
      class_5965.method_27246(var1, this, this.field_6026);
      class_6437 var4 = var1.method_23216();
      Multimap var5 = class_4438.method_20601(var4);
      if (var5.isEmpty()) {
         this.field_6039 = var4;
         if (!this.field_6035.method_23500()) {
            var4.method_29395();
         }

         this.field_6026.<ItemStack>method_8532(SearchManager.field_4275).method_5710();
      } else {
         field_6038.warn("Incomplete server tags, disconnecting. Missing: {}", var5);
         this.field_6035.method_23482(new TranslationTextComponent("multiplayer.disconnect.missing_tags"));
      }
   }

   @Override
   public void method_1924(class_7214 var1) {
      class_5965.method_27246(var1, this, this.field_6026);
      if (var1.field_37049 == class_2820.field_13845) {
         Entity var4 = this.field_6021.method_29534(var1.field_37048);
         if (var4 == this.field_6026.thePlayer) {
            if (!this.field_6026.thePlayer.method_27329()) {
               this.field_6026.thePlayer.method_3205();
            } else {
               this.field_6026.method_8609(new class_7696(var1.field_37047, this.field_6021.method_749().method_8659()));
            }
         }
      }
   }

   @Override
   public void method_1959(class_9275 var1) {
      class_5965.method_27246(var1, this, this.field_6026);
      this.field_6025.method_3495(var1.method_42728());
      this.field_6025.method_3497(var1.method_42731());
   }

   @Override
   public void method_1966(class_8101 var1) {
      class_5965.method_27246(var1, this, this.field_6026);
      Entity var4 = var1.method_36787(this.field_6021);
      if (var4 != null) {
         this.field_6026.method_8550(var4);
      }
   }

   @Override
   public void method_1954(class_1388 var1) {
      class_5965.method_27246(var1, this, this.field_6026);
      var1.method_6429(this.field_6021.method_6673());
   }

   @Override
   public void method_1950(class_3299 var1) {
      class_5965.method_27246(var1, this, this.field_6026);
      class_7357 var4 = var1.method_15125();
      ITextComponent var5 = null;
      ITextComponent var6 = null;
      ITextComponent var7 = var1.method_15124() != null ? var1.method_15124() : StringTextComponent.EMPTY;
      switch (var4) {
         case field_37609:
            var5 = var7;
            break;
         case field_37607:
            var6 = var7;
            break;
         case field_37610:
            this.field_6026.field_9614.method_13982(var7, false);
            return;
         case field_37603:
            this.field_6026.field_9614.method_14002((ITextComponent)null, (ITextComponent)null, -1, -1, -1);
            this.field_6026.field_9614.setDefaultTitlesTimes();
            return;
      }

      this.field_6026.field_9614.method_14002(var5, var6, var1.method_15123(), var1.method_15121(), var1.method_15127());
   }

   @Override
   public void method_1945(class_4750 var1) {
      this.field_6026.field_9614.method_13985().method_9942(!var1.method_21931().getString().isEmpty() ? var1.method_21931() : null);
      this.field_6026.field_9614.method_13985().method_9939(!var1.method_21932().getString().isEmpty() ? var1.method_21932() : null);
   }

   @Override
   public void method_1978(class_4671 var1) {
      class_5965.method_27246(var1, this, this.field_6026);
      Entity var4 = var1.method_21615(this.field_6021);
      if (var4 instanceof class_5834) {
         ((class_5834)var4).method_26421(var1.method_21613());
      }
   }

   @Override
   public void method_1901(class_7867 var1) {
      class_5965.method_27246(var1, this, this.field_6026);

      for (class_5902 var5 : var1.method_35609()) {
         if (var1.method_35608() == class_2236.field_11143) {
            this.field_6026.method_8586().method_42341(var5.method_27005().getId());
            this.field_6034.remove(var5.method_27005().getId());
         } else {
            class_753 var6 = this.field_6034.get(var5.method_27005().getId());
            if (var1.method_35608() == class_2236.field_11144) {
               var6 = new class_753(var5);
               this.field_6034.put(var6.method_3392().getId(), var6);
               this.field_6026.method_8586().method_42343(var6);
            }

            if (var6 != null) {
               switch (var1.method_35608()) {
                  case field_11144:
                     var6.method_3395(var5.method_27003());
                     var6.method_3415(var5.method_27002());
                     var6.method_3414(var5.method_27001());
                     break;
                  case field_11147:
                     var6.method_3395(var5.method_27003());
                     break;
                  case field_11141:
                     var6.method_3415(var5.method_27002());
                     break;
                  case field_11142:
                     var6.method_3414(var5.method_27001());
               }
            }
         }
      }
   }

   @Override
   public void method_1937(class_7573 var1) {
      this.method_4813(new class_2669(var1.method_34428()));
   }

   @Override
   public void method_1969(class_3727 var1) {
      class_5965.method_27246(var1, this, this.field_6026);
      ClientPlayerEntity var4 = this.field_6026.thePlayer;
      var4.playerAbilities.isFlying = var1.method_17271();
      var4.playerAbilities.isCreativeMode = var1.method_17274();
      var4.playerAbilities.disableDamage = var1.method_17273();
      var4.playerAbilities.allowFlying = var1.method_17272();
      var4.playerAbilities.setFlySpeed(var1.method_17275());
      var4.playerAbilities.setWalkSpeed(var1.method_17276());
   }

   @Override
   public void method_1958(class_3740 var1) {
      class_5965.method_27246(var1, this, this.field_6026);
      this.field_6026
         .theWorld
         .method_29528(
            this.field_6026.thePlayer,
            var1.method_17347(),
            var1.method_17340(),
            var1.method_17344(),
            var1.method_17341(),
            var1.method_17342(),
            var1.method_17343(),
            var1.method_17339()
         );
   }

   @Override
   public void method_1949(class_2404 var1) {
      class_5965.method_27246(var1, this, this.field_6026);
      Entity var4 = this.field_6021.method_29534(var1.method_10932());
      if (var4 != null) {
         this.field_6026
            .theWorld
            .method_29540(this.field_6026.thePlayer, var4, var1.method_10931(), var1.method_10936(), var1.method_10933(), var1.method_10930());
      }
   }

   @Override
   public void method_1898(class_8283 var1) {
      class_5965.method_27246(var1, this, this.field_6026);
      this.field_6026
         .method_8590()
         .method_16345(
            new class_4949(
               var1.method_38221(),
               var1.method_38225(),
               var1.method_38222(),
               var1.method_38219(),
               false,
               0,
               class_6656.field_34440,
               var1.method_38223(),
               var1.method_38226(),
               var1.method_38224(),
               false
            )
         );
   }

   @Override
   public void method_1944(class_2289 var1) {
      String var4 = var1.method_10537();
      String var5 = var1.method_10539();
      if (this.method_4802(var4)) {
         if (var4.startsWith("level://")) {
            try {
               String var6 = URLDecoder.decode(var4.substring("level://".length()), StandardCharsets.UTF_8.toString());
               File var7 = new File(this.field_6026.runDirectory, "saves");
               File var8 = new File(var7, var6);
               if (var8.isFile()) {
                  this.method_4801(class_6538.field_33250);
                  CompletableFuture var9 = this.field_6026.method_8606().method_25054(var8, class_2541.field_12594);
                  this.method_4814(var9);
                  return;
               }
            } catch (UnsupportedEncodingException var10) {
            }

            this.method_4801(class_6538.field_33247);
         } else {
            class_2560 var11 = this.field_6026.method_8530();
            if (var11 != null && var11.method_11628() == class_6931.field_35608) {
               this.method_4801(class_6538.field_33250);
               this.method_4814(this.field_6026.method_8606().method_25055(var4, var5));
            } else if (var11 != null && var11.method_11628() != class_6931.field_35609) {
               this.method_4801(class_6538.field_33248);
            } else {
               this.field_6026.execute(() -> this.field_6026.method_8609(new class_9640(var3 -> {
                     this.field_6026 = MinecraftClient.getInstance();
                     class_2560 var6x = this.field_6026.method_8530();
                     if (!var3) {
                        if (var6x != null) {
                           var6x.method_11624(class_6931.field_35604);
                        }

                        this.method_4801(class_6538.field_33248);
                     } else {
                        if (var6x != null) {
                           var6x.method_11624(class_6931.field_35608);
                        }

                        this.method_4801(class_6538.field_33250);
                        this.method_4814(this.field_6026.method_8606().method_25055(var4, var5));
                     }

                     class_3187.method_14669(var6x);
                     this.field_6026.method_8609((Screen)null);
                  }, new TranslationTextComponent("multiplayer.texturePrompt.line1"), new TranslationTextComponent("multiplayer.texturePrompt.line2"))));
            }
         }
      }
   }

   private boolean method_4802(String var1) {
      try {
         URI var4 = new URI(var1);
         String var5 = var4.getScheme();
         boolean var6 = "level".equals(var5);
         if (!"http".equals(var5) && !"https".equals(var5) && !var6) {
            throw new URISyntaxException(var1, "Wrong protocol");
         } else if (var6 && (var1.contains("..") || !var1.endsWith("/resources.zip"))) {
            throw new URISyntaxException(var1, "Invalid levelstorage resourcepack path");
         } else {
            return true;
         }
      } catch (URISyntaxException var7) {
         this.method_4801(class_6538.field_33247);
         return false;
      }
   }

   private void method_4814(CompletableFuture<?> var1) {
      var1.thenRun(() -> this.method_4801(class_6538.field_33246)).exceptionally(var1x -> {
         this.method_4801(class_6538.field_33247);
         return null;
      });
   }

   private void method_4801(class_6538 var1) {
      this.field_6035.method_23485(new class_5982(var1));
   }

   @Override
   public void method_1911(class_9889 var1) {
      class_5965.method_27246(var1, this, this.field_6026);
      this.field_6026.field_9614.method_13972().method_21874(var1);
   }

   @Override
   public void method_1925(class_2036 var1) {
      class_5965.method_27246(var1, this, this.field_6026);
      if (var1.method_9553() != 0) {
         this.field_6026.thePlayer.method_3173().method_32957(var1.method_9552(), var1.method_9553());
      } else {
         this.field_6026.thePlayer.method_3173().method_32961(var1.method_9552());
      }
   }

   @Override
   public void method_1980(class_3931 var1) {
      class_5965.method_27246(var1, this, this.field_6026);
      Entity var4 = this.field_6026.thePlayer.method_37240();
      if (var4 != this.field_6026.thePlayer && var4.method_37069()) {
         var4.method_37249(var1.method_18197(), var1.method_18199(), var1.method_18196(), var1.method_18201(), var1.method_18195());
         this.field_6035.method_23485(new class_4148(var4));
      }
   }

   @Override
   public void method_1930(class_5036 var1) {
      class_5965.method_27246(var1, this, this.field_6026);
      ItemStack var4 = this.field_6026.thePlayer.method_26617(var1.method_23207());
      if (var4.method_27960() == class_4897.field_24698) {
         this.field_6026.method_8609(new class_7680(new class_2059(var4)));
      }
   }

   @Override
   public void method_1915(class_6197 var1) {
      class_5965.method_27246(var1, this, this.field_6026);
      Identifier var4 = var1.method_28332();
      class_8248 var5 = null;

      try {
         var5 = var1.method_28334();
         if (class_6197.field_31656.equals(var4)) {
            this.field_6026.thePlayer.method_27315(var5.method_37784(32767));
         } else if (class_6197.field_31651.equals(var4)) {
            int var6 = var5.readInt();
            float var7 = var5.readFloat();
            class_3998 var8 = class_3998.method_18441(var5);
            this.field_6026.field_9612.field_16626.method_34332(var6, var8, var7);
         } else if (class_6197.field_31652.equals(var4)) {
            long var9 = var5.method_37781();
            class_1331 var62 = var5.method_37748();
            ((class_4921)this.field_6026.field_9612.field_16631).method_22539(var9, var62);
         } else if (class_6197.field_31654.equals(var4)) {
            class_1331 var42 = var5.method_37748();
            int var52 = var5.readInt();
            ArrayList var63 = Lists.newArrayList();
            ArrayList var11 = Lists.newArrayList();

            for (int var12 = 0; var12 < var52; var12++) {
               var63.add(var5.method_37748());
               var11.add(var5.readFloat());
            }

            this.field_6026.field_9612.field_16623.method_39313(var42, var63, var11);
         } else if (class_6197.field_31655.equals(var4)) {
            class_8760 var43 = this.field_6037.method_28811().method_39806(var5.method_37768());
            class_9616 var53 = new class_9616(var5.readInt(), var5.readInt(), var5.readInt(), var5.readInt(), var5.readInt(), var5.readInt());
            int var64 = var5.readInt();
            ArrayList var73 = Lists.newArrayList();
            ArrayList var78 = Lists.newArrayList();

            for (int var13 = 0; var13 < var64; var13++) {
               var73.add(new class_9616(var5.readInt(), var5.readInt(), var5.readInt(), var5.readInt(), var5.readInt(), var5.readInt()));
               var78.add(var5.readBoolean());
            }

            this.field_6026.field_9612.field_16634.method_12649(var53, var73, var78, var43);
         } else if (class_6197.field_31639.equals(var4)) {
            ((class_7897)this.field_6026.field_9612.field_16629)
               .method_35695(var5.method_37748(), var5.readFloat(), var5.readFloat(), var5.readFloat(), var5.readFloat(), var5.readFloat());
         } else if (class_6197.field_31645.equals(var4)) {
            int var44 = var5.readInt();

            for (int var54 = 0; var54 < var44; var54++) {
               this.field_6026.field_9612.field_16624.method_39940(var5.method_37769());
            }

            int var55 = var5.readInt();

            for (int var65 = 0; var65 < var55; var65++) {
               this.field_6026.field_9612.field_16624.method_39937(var5.method_37769());
            }
         } else if (class_6197.field_31646.equals(var4)) {
            class_1331 var45 = var5.method_37748();
            String var56 = var5.method_37783();
            int var66 = var5.readInt();
            class_7942 var74 = new class_7942(var45, var56, var66);
            this.field_6026.field_9612.field_16637.method_13604(var74);
         } else if (class_6197.field_31642.equals(var4)) {
            class_1331 var46 = var5.method_37748();
            this.field_6026.field_9612.field_16637.method_13613(var46);
         } else if (class_6197.field_31649.equals(var4)) {
            class_1331 var47 = var5.method_37748();
            int var57 = var5.readInt();
            this.field_6026.field_9612.field_16637.method_13591(var47, var57);
         } else if (class_6197.field_31647.equals(var4)) {
            class_1331 var48 = var5.method_37748();
            int var58 = var5.readInt();
            int var67 = var5.readInt();
            ArrayList var75 = Lists.newArrayList();

            for (int var79 = 0; var79 < var67; var79++) {
               int var81 = var5.readInt();
               boolean var14 = var5.readBoolean();
               String var15 = var5.method_37784(255);
               var75.add(new class_118(var48, var81, var15, var14));
            }

            this.field_6026.field_9612.field_16627.method_30887(var58, var75);
         } else if (class_6197.field_31638.equals(var4)) {
            int var49 = var5.readInt();
            ArrayList var59 = Lists.newArrayList();

            for (int var68 = 0; var68 < var49; var68++) {
               var59.add(var5.method_37748());
            }

            this.field_6026.field_9612.field_16622.method_28819(var59);
         } else if (class_6197.field_31657.equals(var4)) {
            double var71 = var5.readDouble();
            double var16 = var5.readDouble();
            double var18 = var5.readDouble();
            class_8998 var83 = new class_8998(var71, var16, var18);
            UUID var85 = var5.method_37753();
            int var20 = var5.readInt();
            String var21 = var5.method_37783();
            String var22 = var5.method_37783();
            int var23 = var5.readInt();
            float var24 = var5.readFloat();
            float var25 = var5.readFloat();
            String var26 = var5.method_37783();
            boolean var27 = var5.readBoolean();
            class_3998 var28;
            if (var27) {
               var28 = class_3998.method_18441(var5);
            } else {
               var28 = null;
            }

            boolean var29 = var5.readBoolean();
            class_6388 var30 = new class_6388(var85, var20, var21, var22, var23, var24, var25, var83, var26, var28, var29);
            int var31 = var5.readInt();

            for (int var32 = 0; var32 < var31; var32++) {
               String var33 = var5.method_37783();
               var30.field_32614.add(var33);
            }

            int var103 = var5.readInt();

            for (int var105 = 0; var105 < var103; var105++) {
               String var34 = var5.method_37783();
               var30.field_32628.add(var34);
            }

            int var106 = var5.readInt();

            for (int var107 = 0; var107 < var106; var107++) {
               String var35 = var5.method_37783();
               var30.field_32611.add(var35);
            }

            int var108 = var5.readInt();

            for (int var109 = 0; var109 < var108; var109++) {
               class_1331 var36 = var5.method_37748();
               var30.field_32612.add(var36);
            }

            int var110 = var5.readInt();

            for (int var111 = 0; var111 < var110; var111++) {
               class_1331 var37 = var5.method_37748();
               var30.field_32623.add(var37);
            }

            int var112 = var5.readInt();

            for (int var113 = 0; var113 < var112; var113++) {
               String var38 = var5.method_37783();
               var30.field_32626.add(var38);
            }

            this.field_6026.field_9612.field_16637.method_13607(var30);
         } else if (class_6197.field_31650.equals(var4)) {
            double var72 = var5.readDouble();
            double var87 = var5.readDouble();
            double var88 = var5.readDouble();
            class_8998 var84 = new class_8998(var72, var87, var88);
            UUID var86 = var5.method_37753();
            int var89 = var5.readInt();
            boolean var90 = var5.readBoolean();
            class_1331 var91 = null;
            if (var90) {
               var91 = var5.method_37748();
            }

            boolean var92 = var5.readBoolean();
            class_1331 var93 = null;
            if (var92) {
               var93 = var5.method_37748();
            }

            int var94 = var5.readInt();
            boolean var95 = var5.readBoolean();
            class_3998 var96 = null;
            if (var95) {
               var96 = class_3998.method_18441(var5);
            }

            class_1236 var97 = new class_1236(var86, var89, var84, var96, var91, var93, var94);
            int var98 = var5.readInt();

            for (int var99 = 0; var99 < var98; var99++) {
               String var101 = var5.method_37783();
               var97.field_6817.add(var101);
            }

            int var100 = var5.readInt();

            for (int var102 = 0; var102 < var100; var102++) {
               class_1331 var104 = var5.method_37748();
               var97.field_6822.add(var104);
            }

            this.field_6026.field_9612.field_16638.method_21178(var97);
         } else if (class_6197.field_31641.equals(var4)) {
            class_1331 var50 = var5.method_37748();
            String var60 = var5.method_37783();
            int var69 = var5.readInt();
            int var76 = var5.readInt();
            boolean var80 = var5.readBoolean();
            class_6569 var82 = new class_6569(var50, var60, var69, var76, var80, this.field_6021.method_29546());
            this.field_6026.field_9612.field_16638.method_21160(var82);
         } else if (class_6197.field_31640.equals(var4)) {
            this.field_6026.field_9612.field_16635.method_13699();
         } else if (class_6197.field_31648.equals(var4)) {
            class_1331 var51 = var5.method_37748();
            int var61 = var5.readInt();
            String var70 = var5.method_37783();
            int var77 = var5.readInt();
            this.field_6026.field_9612.field_16635.method_38854(var51, var61, var70, var77);
         } else {
            field_6038.warn("Unknown custom packed identifier: {}", var4);
         }
      } finally {
         if (var5 != null) {
            var5.release();
         }
      }
   }

   @Override
   public void method_1940(class_3263 var1) {
      class_5965.method_27246(var1, this, this.field_6026);
      class_1097 var4 = this.field_6021.method_29562();
      String var5 = var1.method_14884();
      if (var1.method_14881() != 0) {
         if (var4.method_4853(var5)) {
            class_4399 var6 = var4.method_4858(var5);
            if (var1.method_14881() != 1) {
               if (var1.method_14881() == 2) {
                  var6.method_20484(var1.method_14883());
                  var6.method_20485(var1.method_14886());
               }
            } else {
               var4.method_4834(var6);
            }
         }
      } else {
         var4.method_4830(var5, class_6810.field_35129, var1.method_14886(), var1.method_14883());
      }
   }

   @Override
   public void method_1899(class_1625 var1) {
      class_5965.method_27246(var1, this, this.field_6026);
      class_1097 var4 = this.field_6021.method_29562();
      String var5 = var1.method_7243();
      switch (var1.method_7241()) {
         case field_46678:
            class_4399 var6 = var4.method_4849(var5);
            class_8274 var7 = var4.method_4855(var1.method_7240(), var6);
            var7.method_38140(var1.method_7238());
            break;
         case field_46675:
            var4.method_4869(var1.method_7240(), var4.method_4858(var5));
      }
   }

   @Override
   public void method_1907(class_624 var1) {
      class_5965.method_27246(var1, this, this.field_6026);
      class_1097 var4 = this.field_6021.method_29562();
      String var5 = var1.method_2911();
      class_4399 var6 = var5 != null ? var4.method_4849(var5) : null;
      var4.method_4831(var1.method_2910(), var6);
   }

   @Override
   public void method_1938(class_8077 var1) {
      class_5965.method_27246(var1, this, this.field_6026);
      class_1097 var4 = this.field_6021.method_29562();
      class_3903 var5;
      if (var1.method_36694() != 0) {
         var5 = var4.method_4850(var1.method_36690());
      } else {
         var5 = var4.method_4865(var1.method_36690());
      }

      if (var1.method_36694() == 0 || var1.method_36694() == 2) {
         var5.method_18059(var1.method_36688());
         var5.method_18060(var1.method_36684());
         var5.method_18072(var1.method_36689());
         class_1014 var6 = class_1014.method_4496(var1.method_36685());
         if (var6 != null) {
            var5.method_18061(var6);
         }

         class_5006 var7 = class_5006.method_23049(var1.method_36695());
         if (var7 != null) {
            var5.method_18071(var7);
         }

         var5.method_18064(var1.method_36687());
         var5.method_18068(var1.method_36686());
      }

      if (var1.method_36694() == 0 || var1.method_36694() == 3) {
         for (String var10 : var1.method_36692()) {
            var4.method_4842(var10, var5);
         }
      }

      if (var1.method_36694() == 4) {
         for (String var11 : var1.method_36692()) {
            var4.method_4860(var11, var5);
         }
      }

      if (var1.method_36694() == 1) {
         var4.method_4835(var5);
      }
   }

   @Override
   public void method_1976(class_662 var1) {
      class_5965.method_27246(var1, this, this.field_6026);
      if (var1.method_3020() == 0) {
         double var4 = (double)(var1.method_3029() * var1.method_3030());
         double var6 = (double)(var1.method_3029() * var1.method_3027());
         double var8 = (double)(var1.method_3029() * var1.method_3022());

         try {
            this.field_6021.method_29543(var1.method_3025(), var1.method_3021(), var1.method_3026(), var1.method_3024(), var1.method_3028(), var4, var6, var8);
         } catch (Throwable var26) {
            field_6038.warn("Could not spawn particle effect {}", var1.method_3025());
         }
      } else {
         for (int var11 = 0; var11 < var1.method_3020(); var11++) {
            double var12 = this.field_6033.nextGaussian() * (double)var1.method_3030();
            double var14 = this.field_6033.nextGaussian() * (double)var1.method_3027();
            double var16 = this.field_6033.nextGaussian() * (double)var1.method_3022();
            double var18 = this.field_6033.nextGaussian() * (double)var1.method_3029();
            double var20 = this.field_6033.nextGaussian() * (double)var1.method_3029();
            double var22 = this.field_6033.nextGaussian() * (double)var1.method_3029();

            try {
               this.field_6021
                  .method_29543(
                     var1.method_3025(),
                     var1.method_3021(),
                     var1.method_3026() + var12,
                     var1.method_3024() + var14,
                     var1.method_3028() + var16,
                     var18,
                     var20,
                     var22
                  );
            } catch (Throwable var25) {
               field_6038.warn("Could not spawn particle effect {}", var1.method_3025());
               return;
            }
         }
      }
   }

   @Override
   public void method_1913(class_4039 var1) {
      class_5965.method_27246(var1, this, this.field_6026);
      Entity var4 = this.field_6021.method_29534(var1.method_18581());
      if (var4 != null) {
         if (!(var4 instanceof class_5834)) {
            throw new IllegalStateException("Server tried to update attributes of a non-living entity (actually: " + var4 + ")");
         }

         class_6711 var5 = ((class_5834)var4).method_26590();

         for (class_3032 var7 : var1.method_18582()) {
            class_9747 var8 = var5.method_30808(var7.method_13835());
            if (var8 != null) {
               var8.method_45006(var7.method_13834());
               var8.method_44994();

               for (class_9343 var10 : var7.method_13837()) {
                  var8.method_45011(var10);
               }
            } else {
               field_6038.warn("Entity {} does not have attribute {}", var4, class_8669.field_44403.method_39797(var7.method_13835()));
            }
         }
      }
   }

   @Override
   public void method_1927(class_7799 var1) {
      class_5965.method_27246(var1, this, this.field_6026);
      class_4088 var4 = this.field_6026.thePlayer.field_3874;
      if (var4.field_19925 == var1.method_35375() && var4.method_18879(this.field_6026.thePlayer)) {
         this.field_6024.method_23139(var1.method_35373()).ifPresent(var2 -> {
            if (this.field_6026.field_9623 instanceof class_474) {
               class_8002 var5 = ((class_474)this.field_6026.field_9623).method_2262();
               var5.method_36302((class_8932<?>)var2, var4.field_19926);
            }
         });
      }
   }

   @Override
   public void method_1916(class_4234 var1) {
      class_5965.method_27246(var1, this, this.field_6026);
      int var4 = var1.method_19744();
      int var5 = var1.method_19742();
      class_4663 var6 = this.field_6021.method_745().method_14813();
      int var7 = var1.method_19740();
      int var8 = var1.method_19741();
      Iterator var9 = var1.method_19736().iterator();
      this.method_4807(var4, var5, var6, class_2957.field_14437, var7, var8, var9, var1.method_19738());
      int var10 = var1.method_19739();
      int var11 = var1.method_19735();
      Iterator var12 = var1.method_19734().iterator();
      this.method_4807(var4, var5, var6, class_2957.field_14440, var10, var11, var12, var1.method_19738());
   }

   @Override
   public void method_1975(class_9381 var1) {
      class_5965.method_27246(var1, this, this.field_6026);
      class_4088 var4 = this.field_6026.thePlayer.field_3874;
      if (var1.method_43377() == var4.field_19925 && var4 instanceof class_6415) {
         ((class_6415)var4).method_29316(new class_2795(var1.method_43380().method_12711()));
         ((class_6415)var4).method_29317(var1.method_43376());
         ((class_6415)var4).method_29318(var1.method_43379());
         ((class_6415)var4).method_29309(var1.method_43378());
         ((class_6415)var4).method_29314(var1.method_43381());
      }
   }

   @Override
   public void method_1972(class_3767 var1) {
      class_5965.method_27246(var1, this, this.field_6026);
      this.field_6023 = var1.method_17440();
      this.field_6021.method_745().method_24473(var1.method_17440());
   }

   @Override
   public void method_1948(class_8849 var1) {
      class_5965.method_27246(var1, this, this.field_6026);
      this.field_6021.method_745().method_24464(var1.method_40710(), var1.method_40713());
   }

   @Override
   public void method_1928(class_7881 var1) {
      class_5965.method_27246(var1, this, this.field_6026);
      this.field_6026.playerController.method_42159(this.field_6021, var1.method_35641(), var1.method_35638(), var1.method_35639(), var1.method_35637());
   }

   private void method_4807(int var1, int var2, class_4663 var3, class_2957 var4, int var5, int var6, Iterator<byte[]> var7, boolean var8) {
      for (int var11 = 0; var11 < 18; var11++) {
         int var12 = -1 + var11;
         boolean var13 = (var5 & 1 << var11) != 0;
         boolean var14 = (var6 & 1 << var11) != 0;
         if (var13 || var14) {
            var3.method_21568(
               var4, class_6979.method_31893(var1, var12, var2), !var13 ? new class_1201() : new class_1201((byte[])((byte[])var7.next()).clone()), var8
            );
            this.field_6021.method_720(var1, var12, var2);
         }
      }
   }

   @Override
   public class_5121 method_9091() {
      return this.field_6035;
   }

   public Collection<class_753> method_4798() {
      return this.field_6034.values();
   }

   public Collection<UUID> method_4803() {
      return this.field_6034.keySet();
   }

   @Nullable
   public class_753 method_4800(UUID var1) {
      return this.field_6034.get(var1);
   }

   @Nullable
   public class_753 method_4799(String var1) {
      for (class_753 var5 : this.field_6034.values()) {
         if (var5.method_3392().getName().equals(var1)) {
            return var5;
         }
      }

      return null;
   }

   public GameProfile method_4810() {
      return this.field_6022;
   }

   public class_5692 method_4796() {
      return this.field_6027;
   }

   public CommandDispatcher<class_8773> method_4811() {
      return this.field_6040;
   }

   public ClientWorld method_4805() {
      return this.field_6021;
   }

   public class_6437 method_4804() {
      return this.field_6039;
   }

   public class_147 method_4809() {
      return this.field_6042;
   }

   public UUID method_4815() {
      return this.field_6031;
   }

   public Set<class_5621<World>> method_4817() {
      return this.field_6029;
   }

   public class_6322 method_4806() {
      return this.field_6037;
   }
}
