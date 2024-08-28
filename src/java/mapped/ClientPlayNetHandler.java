package mapped;

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

public class ClientPlayNetHandler implements Class5116 {
   private static final Logger field23267 = LogManager.getLogger();
   private static final ITextComponent field23268 = new TranslationTextComponent("disconnect.lost");
   private final NetworkManager field23269;
   private final GameProfile field23270;
   private final Screen field23271;
   private Minecraft field23272;
   private Class1656 field23273;
   private Class6606 field23274;
   private boolean field23275;
   private final Map<UUID, Class6589> field23276 = Maps.newHashMap();
   private final Class8730 field23277;
   private final Class6617 field23278;
   private Class8933 field23279 = Class8933.field40418;
   private final Class4496 field23280 = new Class4496(this);
   private int field23281 = 3;
   private final Random field23282 = new Random();
   private CommandDispatcher<Class6618> field23283 = new CommandDispatcher();
   private final Class282 field23284 = new Class282();
   private final UUID field23285 = UUID.randomUUID();
   private Set<Class8705<World>> field23286;
   public Class8904 field23287 = Class8904.method32457();

   public ClientPlayNetHandler(Minecraft var1, Screen var2, NetworkManager var3, GameProfile var4) {
      this.field23272 = var1;
      this.field23271 = var2;
      this.field23269 = var3;
      this.field23270 = var4;
      this.field23277 = new Class8730(var1);
      this.field23278 = new Class6617(this, var1);
   }

   public Class6617 method15781() {
      return this.field23278;
   }

   public void method15782() {
      this.field23273 = null;
   }

   public Class282 method15783() {
      return this.field23284;
   }

   @Override
   public void method15726(Class5499 var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);
      this.field23272.field1337 = new Class7314(this.field23272, this);
      if (!this.field23269.method30702()) {
         Class8384.method29379();
      }

      ArrayList var4 = Lists.newArrayList(var1.method17292());
      Collections.shuffle(var4);
      this.field23286 = Sets.newLinkedHashSet(var4);
      this.field23287 = var1.method17293();
      Class8705 var5 = var1.method17295();
      Class9535 var6 = var1.method17294();
      this.field23281 = var1.method17296();
      boolean var7 = var1.method17299();
      boolean var8 = var1.method17300();
      Class6606 var9 = new Class6606(Class2197.field14353, var1.method17289(), var8);
      this.field23274 = var9;
      this.field23273 = new Class1656(this, var9, var5, var6, this.field23281, this.field23272::method1574, this.field23272.worldRenderer, var7, var1.method17288());
      this.field23272.method1504(this.field23273);
      if (this.field23272.player == null) {
         this.field23272.player = this.field23272.field1337.createPlayer(this.field23273, new Class8286(), new Class6943());
         this.field23272.player.field5031 = -180.0F;
         if (this.field23272.method1531() != null) {
            this.field23272.method1531().method6489(this.field23272.player.getUniqueID());
         }
      }

      this.field23272.field1296.method27451();
      this.field23272.player.method2869();
      int var10 = var1.method17287();
      this.field23273.method6845(var10, this.field23272.player);
      this.field23272.player.field6131 = new Class9451(this.field23272.gameSettings);
      this.field23272.field1337.method23127(this.field23272.player);
      this.field23272.field1344 = this.field23272.player;
      this.field23272.displayGuiScreen(new Class1312());
      this.field23272.player.method3206(var10);
      this.field23272.player.method2965(var1.method17297());
      this.field23272.player.method5403(var1.method17298());
      this.field23272.field1337.method23129(var1.method17290());
      this.field23272.field1337.method23128(var1.method17291());
      this.field23272.gameSettings.method37149();
      this.field23269.method30693(new Class5527(Class5527.field24523, new PacketBuffer(Unpooled.buffer()).method35729(Class8948.method32694())));
      this.field23272.method1575().method28908();
   }

   @Override
   public void method15692(Class5487 var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);
      double var4 = var1.method17258();
      double var6 = var1.method17259();
      double var8 = var1.method17260();
      Class8992 var10 = var1.method17266();
      Object var11;
      if (var10 != Class8992.field41051) {
         if (var10 != Class8992.field41053) {
            if (var10 != Class8992.field41056) {
               if (var10 != Class8992.field41055) {
                  if (var10 != Class8992.field41054) {
                     if (var10 != Class8992.field41052) {
                        if (var10 != Class8992.field41050) {
                           if (var10 != Class8992.field41112) {
                              if (var10 != Class8992.field41007) {
                                 if (var10 != Class8992.field41084) {
                                    if (var10 != Class8992.field41093) {
                                       if (var10 != Class8992.field41083) {
                                          if (var10 != Class8992.field41048) {
                                             if (var10 != Class8992.field41043) {
                                                if (var10 != Class8992.field41045) {
                                                   if (var10 != Class8992.field41090) {
                                                      if (var10 != Class8992.field41030) {
                                                         if (var10 != Class8992.field41032) {
                                                            if (var10 != Class8992.field41044) {
                                                               if (var10 != Class8992.field41020) {
                                                                  if (var10 != Class8992.field41081) {
                                                                     if (var10 != Class8992.field41104) {
                                                                        if (var10 != Class8992.field41076) {
                                                                           if (var10 != Class8992.field41089) {
                                                                              if (var10 != Class8992.field41028) {
                                                                                 if (var10 != Class8992.field41092) {
                                                                                    if (var10 != Class8992.field41091) {
                                                                                       if (var10 != Class8992.field41011) {
                                                                                          if (var10 != Class8992.field41069) {
                                                                                             if (var10 != Class8992.field41006) {
                                                                                                if (var10 != Class8992.field41023) {
                                                                                                   if (var10 != Class8992.field41042) {
                                                                                                      if (var10 != Class8992.field41031) {
                                                                                                         if (var10 != Class8992.field41005) {
                                                                                                            if (var10 != Class8992.field41046) {
                                                                                                               var11 = null;
                                                                                                            } else {
                                                                                                               var11 = new Class906(
                                                                                                                  Class8992.field41046, this.field23273
                                                                                                               );
                                                                                                            }
                                                                                                         } else {
                                                                                                            var11 = new Class999(
                                                                                                               this.field23273, var4, var6, var8
                                                                                                            );
                                                                                                         }
                                                                                                      } else {
                                                                                                         var11 = new Class907(
                                                                                                            this.field23273,
                                                                                                            var4,
                                                                                                            var6,
                                                                                                            var8,
                                                                                                            Block.method11536(var1.method17267())
                                                                                                         );
                                                                                                      }
                                                                                                   } else {
                                                                                                      var11 = new ItemEntity(this.field23273, var4, var6, var8);
                                                                                                   }
                                                                                                } else {
                                                                                                   var11 = new Class1001(this.field23273, var4, var6, var8);
                                                                                                }
                                                                                             } else {
                                                                                                var11 = new Class1005(this.field23273, var4, var6, var8);
                                                                                             }
                                                                                          } else {
                                                                                             var11 = new Class1004(
                                                                                                this.field23273, var4, var6, var8, (Class880)null
                                                                                             );
                                                                                          }
                                                                                       } else {
                                                                                          var11 = new Class1002(this.field23273, var4, var6, var8);
                                                                                       }
                                                                                    } else {
                                                                                       var11 = new Class891(this.field23273, var4, var6, var8);
                                                                                    }
                                                                                 } else {
                                                                                    var11 = new Class896(this.field23273, var4, var6, var8);
                                                                                 }
                                                                              } else {
                                                                                 var11 = new Class915(
                                                                                    this.field23273, var4, var6, var8, 0.0F, 0, (Class880)null
                                                                                 );
                                                                              }
                                                                           } else {
                                                                              var11 = new Class892(this.field23273, var4, var6, var8);
                                                                           }
                                                                        } else {
                                                                           var11 = new Class905(
                                                                              this.field23273,
                                                                              var4,
                                                                              var6,
                                                                              var8,
                                                                              var1.method17261(),
                                                                              var1.method17262(),
                                                                              var1.method17263()
                                                                           );
                                                                        }
                                                                     } else {
                                                                        var11 = new Class902(
                                                                           this.field23273,
                                                                           var4,
                                                                           var6,
                                                                           var8,
                                                                           var1.method17261(),
                                                                           var1.method17262(),
                                                                           var1.method17263()
                                                                        );
                                                                     }
                                                                  } else {
                                                                     var11 = new Class900(
                                                                        this.field23273,
                                                                        var4,
                                                                        var6,
                                                                        var8,
                                                                        var1.method17261(),
                                                                        var1.method17262(),
                                                                        var1.method17263()
                                                                     );
                                                                  }
                                                               } else {
                                                                  var11 = new Class903(
                                                                     this.field23273,
                                                                     var4,
                                                                     var6,
                                                                     var8,
                                                                     var1.method17261(),
                                                                     var1.method17262(),
                                                                     var1.method17263()
                                                                  );
                                                               }
                                                            } else {
                                                               var11 = new Class899(
                                                                  this.field23273, var4, var6, var8, var1.method17261(), var1.method17262(), var1.method17263()
                                                               );
                                                            }
                                                         } else {
                                                            var11 = new Class888(this.field23273, var4, var6, var8, ItemStack.EMPTY);
                                                         }
                                                      } else {
                                                         var11 = new Class897(this.field23273, var4, var6, var8);
                                                      }
                                                   } else {
                                                      var11 = new Class895(this.field23273, var4, var6, var8);
                                                   }
                                                } else {
                                                   var11 = new Class996(this.field23273, new BlockPos(var4, var6, var8));
                                                }
                                             } else {
                                                var11 = new Class997(this.field23273, new BlockPos(var4, var6, var8), Direction.method546(var1.method17267()));
                                             }
                                          } else {
                                             var11 = new Class883(this.field23273, var4, var6, var8, var1.method17261(), var1.method17262(), var1.method17263());
                                          }
                                       } else {
                                          var11 = new Class894(this.field23273, var4, var6, var8);
                                       }
                                    } else {
                                       var11 = new Class886(this.field23273, var4, var6, var8);
                                       Entity var12 = this.field23273.method6774(var1.method17267());
                                       if (var12 != null) {
                                          ((AbstractArrowEntity)var11).method3459(var12);
                                       }
                                    }
                                 } else {
                                    var11 = new Class885(this.field23273, var4, var6, var8);
                                    Entity var13 = this.field23273.method6774(var1.method17267());
                                    if (var13 != null) {
                                       ((AbstractArrowEntity)var11).method3459(var13);
                                    }
                                 }
                              } else {
                                 var11 = new Class887(this.field23273, var4, var6, var8);
                                 Entity var14 = this.field23273.method6774(var1.method17267());
                                 if (var14 != null) {
                                    ((AbstractArrowEntity)var11).method3459(var14);
                                 }
                              }
                           } else {
                              Entity var15 = this.field23273.method6774(var1.method17267());
                              if (!(var15 instanceof PlayerEntity)) {
                                 var11 = null;
                              } else {
                                 var11 = new Class904(this.field23273, (PlayerEntity)var15, var4, var6, var8);
                              }
                           }
                        } else {
                           var11 = new Class917(this.field23273, var4, var6, var8);
                        }
                     } else {
                        var11 = new Class918(this.field23273, var4, var6, var8);
                     }
                  } else {
                     var11 = new Class938(this.field23273, var4, var6, var8);
                  }
               } else {
                  var11 = new Class992(this.field23273, var4, var6, var8);
               }
            } else {
               var11 = new Class993(this.field23273, var4, var6, var8);
            }
         } else {
            var11 = new Class994(this.field23273, var4, var6, var8);
         }
      } else {
         var11 = new Class991(this.field23273, var4, var6, var8);
      }

      if (var11 != null) {
         int var16 = var1.method17256();
         ((Entity)var11).method3201(var4, var6, var8);
         ((Entity)var11).method2794(var4, var6, var8);
         ((Entity)var11).field5032 = (float)(var1.method17264() * 360) / 256.0F;
         ((Entity)var11).field5031 = (float)(var1.method17265() * 360) / 256.0F;
         ((Entity)var11).method3206(var16);
         ((Entity)var11).method3374(var1.method17257());
         this.field23273.method6846(var16, (Entity)var11);
         if (var11 instanceof Class916) {
            this.field23272.method1546().method1000(new Class6345((Class916)var11));
         }
      }
   }

   @Override
   public void method15693(Class5520 var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);
      double var4 = var1.method17354();
      double var6 = var1.method17355();
      double var8 = var1.method17356();
      ExperienceOrbEntity var10 = new ExperienceOrbEntity(this.field23273, var4, var6, var8, var1.method17357());
      var10.method3201(var4, var6, var8);
      var10.field5031 = 0.0F;
      var10.field5032 = 0.0F;
      var10.method3206(var1.method17353());
      this.field23273.method6846(var1.method17353(), var10);
   }

   @Override
   public void method15696(Class5470 var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);
      Class998 var4 = new Class998(this.field23273, var1.method17196(), var1.method17197(), var1.method17198());
      var4.method3206(var1.method17194());
      var4.method3374(var1.method17195());
      this.field23273.method6846(var1.method17194(), var4);
   }

   @Override
   public void method15739(Class5590 var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);
      Entity var4 = this.field23273.method6774(var1.method17565());
      if (var4 != null) {
         var4.method3325((double)var1.method17566() / 8000.0, (double)var1.method17567() / 8000.0, (double)var1.method17568() / 8000.0);
      }
   }

   @Override
   public void method15738(Class5553 var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);
      Entity var4 = this.field23273.method6774(var1.method17470());
      if (var4 != null && var1.method17469() != null) {
         var4.method3210().method35454(var1.method17469());
      }
   }

   @Override
   public void method15697(Class5596 var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);
      double var4 = var1.method17594();
      double var6 = var1.method17595();
      double var8 = var1.method17596();
      float var10 = (float)(var1.method17597() * 360) / 256.0F;
      float var11 = (float)(var1.method17598() * 360) / 256.0F;
      if (this.method15792(var1.method17593()) != null) {
         int var12 = var1.method17592();
         Class1116 var13 = new Class1116(this.field23272.world, this.method15792(var1.method17593()).method19966());
         var13.method3206(var12);
         var13.method3274(var4, var6, var8);
         var13.method3201(var4, var6, var8);
         var13.method3269(var4, var6, var8, var10, var11);
         this.field23273.method6845(var12, var13);
      }
   }

   @Override
   public void method15751(Class5595 var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);
      Entity var4 = this.field23273.method6774(var1.method17585());
      if (var4 != null) {
         double var5 = var1.method17586();
         double var7 = var1.method17587();
         double var9 = var1.method17588();
         var4.method3201(var5, var7, var9);
         if (!var4.method3418()) {
            float var11 = (float)(var1.method17589() * 360) / 256.0F;
            float var12 = (float)(var1.method17590() * 360) / 256.0F;
            var4.method3131(var5, var7, var9, var11, var12, 3, true);
            var4.method3061(var1.method17591());
         }
      }
   }

   @Override
   public void method15736(Class5608 var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);
      if (Class974.method4035(var1.method17633())) {
         this.field23272.player.field4902.field5443 = var1.method17633();
      }
   }

   @Override
   public void method15727(Class5476 var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);
      Entity var4 = var1.method17233(this.field23273);
      if (var4 != null && !var4.method3418()) {
         if (!var1.method17237()) {
            if (var1.method17236()) {
               float var5 = (float)(var1.method17234() * 360) / 256.0F;
               float var6 = (float)(var1.method17235() * 360) / 256.0F;
               var4.method3131(var4.getPosX(), var4.getPosY(), var4.getPosZ(), var5, var6, 3, false);
            }
         } else {
            Vector3d var8 = var1.method17231(var4.method3203());
            var4.method3202(var8);
            float var9 = !var1.method17236() ? var4.field5031 : (float)(var1.method17234() * 360) / 256.0F;
            float var7 = !var1.method17236() ? var4.field5032 : (float)(var1.method17235() * 360) / 256.0F;
            var4.method3131(var8.method11320(), var8.method11321(), var8.method11322(), var9, var7, 3, false);
         }

         var4.method3061(var1.method17238());
      }
   }

   @Override
   public void method15735(Class5516 var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);
      Entity var4 = var1.method17346(this.field23273);
      if (var4 != null) {
         float var5 = (float)(var1.method17347() * 360) / 256.0F;
         var4.method3132(var5, 3);
      }
   }

   @Override
   public void method15732(Class5484 var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);

      for (int var4 = 0; var4 < var1.method17251().length; var4++) {
         int var5 = var1.method17251()[var4];
         this.field23273.method6848(var5);
      }
   }

   @Override
   public void method15728(Class5473 var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);
      ClientPlayerEntity var4 = this.field23272.player;
      Vector3d var5 = var4.method3433();
      boolean var6 = var1.method17220().contains(Class2033.field13198);
      boolean var7 = var1.method17220().contains(Class2033.field13199);
      boolean var8 = var1.method17220().contains(Class2033.field13200);
      double var9;
      double var11;
      if (!var6) {
         var9 = 0.0;
         var11 = var1.method17214();
         var4.field5048 = var11;
      } else {
         var9 = var5.method11320();
         var11 = var4.getPosX() + var1.method17214();
         var4.field5048 = var4.field5048 + var1.method17214();
      }

      double var13;
      double var15;
      if (!var7) {
         var13 = 0.0;
         var15 = var1.method17215();
         var4.field5049 = var15;
      } else {
         var13 = var5.method11321();
         var15 = var4.getPosY() + var1.method17215();
         var4.field5049 = var4.field5049 + var1.method17215();
      }

      double var17;
      double var19;
      if (!var8) {
         var17 = 0.0;
         var19 = var1.method17216();
         var4.field5050 = var19;
      } else {
         var17 = var5.method11322();
         var19 = var4.getPosZ() + var1.method17216();
         var4.field5050 = var4.field5050 + var1.method17216();
      }

      if (var4.field5055 > 0 && var4.getRidingEntity() != null) {
         var4.method2895();
      }

      var4.method3446(var11, var15, var19);
      var4.field5025 = var11;
      var4.field5026 = var15;
      var4.field5027 = var19;
      var4.method3435(var9, var13, var17);
      float var21 = var1.method17217();
      float var22 = var1.method17218();
      if (var1.method17220().contains(Class2033.field13202)) {
         var22 += var4.field5032;
      }

      if (var1.method17220().contains(Class2033.field13201)) {
         var21 += var4.field5031;
      }

      var4.method3269(var11, var15, var19, var21, var22);
      this.field23269.method30693(new Class5580(var1.method17219()));
      this.field23269.method30693(new Class5604(var4.getPosX(), var4.getPosY(), var4.getPosZ(), var4.field5031, var4.field5032, false));
      if (!this.field23275) {
         this.field23275 = true;
         this.field23272.displayGuiScreen((Screen)null);
      }
   }

   @Override
   public void method15707(Class5549 var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);
      int var4 = 19 | (!var1.method17462() ? 0 : 128);
      var1.method17461((var2, var3) -> this.field23273.method6725(var2, var3, var4));
   }

   @Override
   public void method15723(Class5526 var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);
      int var4 = var1.method17378();
      int var5 = var1.method17379();
      Class1684 var6 = var1.method17384() != null ? new Class1684(this.field23287.<Class8907>method32453(Class2348.field16106), var1.method17384()) : null;
      Class1674 var7 = this.field23273
         .method6883()
         .method7400(var4, var5, var6, var1.method17374(), var1.method17382(), var1.method17380(), var1.method17381());
      if (var7 != null && var1.method17381()) {
         this.field23273.method6850(var7);
      }

      for (int var8 = 0; var8 < 16; var8++) {
         this.field23273.method6868(var4, var8, var5);
      }

      for (Class39 var9 : var1.method17383()) {
         BlockPos var10 = new BlockPos(var9.method122("x"), var9.method122("y"), var9.method122("z"));
         Class944 var11 = this.field23273.method6759(var10);
         if (var11 != null) {
            var11.method3645(this.field23273.method6738(var10), var9);
         }
      }
   }

   @Override
   public void method15724(Class5567 var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);
      int var4 = var1.method17492();
      int var5 = var1.method17493();
      Class1705 var6 = this.field23273.method6883();
      var6.method7399(var4, var5);
      Class196 var7 = var6.method7348();

      for (int var8 = 0; var8 < 16; var8++) {
         this.field23273.method6868(var4, var8, var5);
         var7.method604(Class2002.method8389(var4, var8, var5), true);
      }

      var7.method605(new Class7481(var4, var5), false);
   }

   @Override
   public void method15705(Class5607 var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);
      this.field23273.method6851(var1.method17632(), var1.method17631());
   }

   @Override
   public void method15716(Class5530 var1) {
      this.field23269.method30701(var1.method17390());
   }

   @Override
   public void method15588(ITextComponent var1) {
      this.field23272.unloadWorld();
      if (this.field23271 == null) {
         this.field23272.displayGuiScreen(new Class832(new MultiplayerScreen(new MainMenuScreen()), field23268, var1));
      } else if (!(this.field23271 instanceof Class798)) {
         this.field23272.displayGuiScreen(new Class832(this.field23271, field23268, var1));
      } else {
         this.field23272.displayGuiScreen(new Class801(this.field23271, field23268, var1));
      }
   }

   public void sendPacket(Packet<?> var1) {
      this.field23269.method30693(var1);
   }

   @Override
   public void method15750(Class5467 var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);
      Entity var4 = this.field23273.method6774(var1.method17186());
      Object var5 = (Class880)this.field23273.method6774(var1.method17187());
      if (var5 == null) {
         var5 = this.field23272.player;
      }

      if (var4 != null) {
         if (!(var4 instanceof ExperienceOrbEntity)) {
            this.field23273
               .method6745(
                  var4.getPosX(),
                  var4.getPosY(),
                  var4.getPosZ(),
                  Class6067.field26714,
                  Class2266.field14735,
                  0.2F,
                  (this.field23282.nextFloat() - this.field23282.nextFloat()) * 1.4F + 2.0F,
                  false
               );
         } else {
            this.field23273
               .method6745(
                  var4.getPosX(),
                  var4.getPosY(),
                  var4.getPosZ(),
                  Class6067.field26569,
                  Class2266.field14735,
                  0.1F,
                  (this.field23282.nextFloat() - this.field23282.nextFloat()) * 0.35F + 0.9F,
                  false
               );
         }

         this.field23272.particles.method1199(new Class4593(this.field23272.method1554(), this.field23272.method1581(), this.field23273, var4, (Entity)var5));
         if (!(var4 instanceof ItemEntity)) {
            this.field23273.method6848(var1.method17186());
         } else {
            ItemEntity var6 = (ItemEntity)var4;
            ItemStack var7 = var6.method4124();
            var7.method32182(var1.method17188());
            if (var7.method32105()) {
               this.field23273.method6848(var1.method17186());
            }
         }
      }
   }

   @Override
   public void method15706(SChatPacket var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);
      this.field23272.ingameGUI.method5988(var1.method17650(), var1.method17648(), var1.method17651());
   }

   @Override
   public void method15698(Class5469 var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);
      Entity var4 = this.field23273.method6774(var1.method17192());
      if (var4 != null) {
         if (var1.method17193() != 0) {
            if (var1.method17193() != 3) {
               if (var1.method17193() != 1) {
                  if (var1.method17193() != 2) {
                     if (var1.method17193() != 4) {
                        if (var1.method17193() == 5) {
                           this.field23272.particles.method1195(var4, Class7940.field34065);
                        }
                     } else {
                        this.field23272.particles.method1195(var4, Class7940.field34054);
                     }
                  } else {
                     PlayerEntity var5 = (PlayerEntity)var4;
                     var5.stopSleepInBed(false, false);
                  }
               } else {
                  var4.method3069();
               }
            } else {
               Class880 var6 = (Class880)var4;
               var6.swingArm(Hand.field183);
            }
         } else {
            Class880 var7 = (Class880)var4;
            var7.swingArm(Hand.field182);
         }
      }
   }

   @Override
   public void method15694(Class5582 var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);
      double var4 = var1.method17538();
      double var6 = var1.method17539();
      double var8 = var1.method17540();
      float var10 = (float)(var1.method17544() * 360) / 256.0F;
      float var11 = (float)(var1.method17545() * 360) / 256.0F;
      Class880 var12 = (Class880)Class8992.method33216(var1.method17537(), this.field23272.world);
      if (var12 == null) {
         field23267.warn("Skipping Entity with id {}", var1.method17537());
      } else {
         var12.method3201(var4, var6, var8);
         var12.field4965 = (float)(var1.method17546() * 360) / 256.0F;
         var12.field4967 = (float)(var1.method17546() * 360) / 256.0F;
         if (var12 instanceof Class1007) {
            Class908[] var13 = ((Class1007)var12).method4332();

            for (int var14 = 0; var14 < var13.length; var14++) {
               var13[var14].method3206(var14 + var1.method17535());
            }
         }

         var12.method3206(var1.method17535());
         var12.method3374(var1.method17536());
         var12.method3269(var4, var6, var8, var10, var11);
         var12.method3435(
            (double)((float)var1.method17541() / 8000.0F), (double)((float)var1.method17542() / 8000.0F), (double)((float)var1.method17543() / 8000.0F)
         );
         this.field23273.method6846(var1.method17535(), var12);
         if (var12 instanceof Class1017) {
            boolean var15 = ((Class1017)var12).method4369();
            Object var16;
            if (!var15) {
               var16 = new Class6336((Class1017)var12);
            } else {
               var16 = new Class6335((Class1017)var12);
            }

            this.field23272.method1546().method999((Class6341)var16);
         }
      }
   }

   @Override
   public void method15746(Class5577 var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);
      this.field23272.world.method6833(var1.method17514());
      this.field23272.world.method6834(var1.method17515());
   }

   @Override
   public void method15745(Class5525 var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);
      this.field23272.world.method6882(var1.method17372(), var1.method17373());
   }

   @Override
   public void method15719(Class5485 var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);
      Entity var4 = this.field23273.method6774(var1.method17253());
      if (var4 != null) {
         boolean var5 = var4.method3417(this.field23272.player);
         var4.method3315();

         for (int var9 : var1.method17252()) {
            Entity var10 = this.field23273.method6774(var9);
            if (var10 != null) {
               var10.method2758(var4, true);
               if (var10 == this.field23272.player && !var5) {
                  this.field23272.ingameGUI.method5985(new TranslationTextComponent("mount.onboard", this.field23272.gameSettings.field44637.method8521()), false);
               }
            }
         }
      } else {
         field23267.warn("Received passengers for unknown entity");
      }
   }

   @Override
   public void method15718(Class5593 var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);
      Entity var4 = this.field23273.method6774(var1.method17577());
      if (var4 instanceof Class1006) {
         ((Class1006)var4).method4299(var1.method17578());
      }
   }

   private static ItemStack method15785(PlayerEntity var0) {
      for (Hand var6 : Hand.values()) {
         ItemStack var7 = var0.getHeldItem(var6);
         if (var7.method32107() == Class8514.field38126) {
            return var7;
         }
      }

      return new ItemStack(Class8514.field38126);
   }

   @Override
   public void method15717(Class5464 var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);
      Entity var4 = var1.method17178(this.field23273);
      if (var4 != null) {
         if (var1.method17179() != 21) {
            if (var1.method17179() != 35) {
               var4.method2866(var1.method17179());
            } else {
               byte var5 = 40;
               this.field23272.particles.method1196(var4, Class7940.field34097, 30);
               this.field23273.method6745(var4.getPosX(), var4.getPosY(), var4.getPosZ(), Class6067.field27147, var4.method2864(), 1.0F, 1.0F, false);
               if (var4 == this.field23272.player) {
                  this.field23272.gameRenderer.method763(method15785(this.field23272.player));
               }
            }
         } else {
            this.field23272.method1546().method1000(new Class6347((Class1105)var4));
         }
      }
   }

   @Override
   public void method15742(Class5592 var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);
      this.field23272.player.method5391(var1.method17574());
      this.field23272.player.method2932().method37578(var1.method17575());
      this.field23272.player.method2932().method37579(var1.method17576());
   }

   @Override
   public void method15741(Class5507 var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);
      this.field23272.player.method5402(var1.method17321(), var1.method17322(), var1.method17323());
   }

   @Override
   public void method15734(Class5545 var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);
      Class8705 var4 = var1.method17433();
      Class9535 var5 = var1.method17432();
      ClientPlayerEntity var6 = this.field23272.player;
      int var7 = var6.method3205();
      this.field23275 = false;
      if (var4 != var6.field5024.method6813()) {
         Class6886 var8 = this.field23273.method6805();
         boolean var9 = var1.method17437();
         boolean var10 = var1.method17438();
         Class6606 var11 = new Class6606(this.field23274.method20047(), this.field23274.isHardcore(), var10);
         this.field23274 = var11;
         this.field23273 = new Class1656(
            this, var11, var4, var5, this.field23281, this.field23272::method1574, this.field23272.worldRenderer, var9, var1.method17434()
         );
         this.field23273.method6859(var8);
         this.field23272.method1504(this.field23273);
         this.field23272.displayGuiScreen(new Class1312());
      }

      this.field23273.method6857();
      String var12 = var6.method5395();
      this.field23272.field1344 = null;
      ClientPlayerEntity var13 = this.field23272.field1337.func_239167_a_(this.field23273, var6.method5396(), var6.method5397(), var6.method3331(), var6.method3337());
      var13.method3206(var7);
      this.field23272.player = var13;
      if (var4 != var6.field5024.method6813()) {
         this.field23272.method1493().method33668();
      }

      this.field23272.field1344 = var13;
      var13.method3210().method35454(var6.method3210().method35450());
      if (var1.method17439()) {
         var13.method3088().method33388(var6.method3088());
      }

      var13.method2869();
      var13.method5394(var12);
      this.field23273.method6845(var7, var13);
      var13.field5031 = -180.0F;
      var13.field6131 = new Class9451(this.field23272.gameSettings);
      this.field23272.field1337.method23127(var13);
      var13.method2965(var6.method2964());
      var13.method5403(var6.isShowDeathScreen());
      if (this.field23272.currentScreen instanceof DeathScreen) {
         this.field23272.displayGuiScreen((Screen)null);
      }

      this.field23272.field1337.method23129(var1.method17435());
      this.field23272.field1337.method23128(var1.method17436());
   }

   @Override
   public void method15720(Class5515 var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);
      Class7782 var4 = new Class7782(
         this.field23272.world, (Entity)null, var1.method17341(), var1.method17342(), var1.method17343(), var1.method17344(), var1.method17345()
      );
      var4.method25785(true);
      this.field23272
         .player
         .method3434(this.field23272.player.method3433().method11339((double)var1.method17338(), (double)var1.method17339(), (double)var1.method17340()));
   }

   @Override
   public void method15712(Class5508 var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);
      Entity var4 = this.field23273.method6774(var1.method17326());
      if (var4 instanceof AbstractHorseEntity) {
         ClientPlayerEntity var5 = this.field23272.player;
         AbstractHorseEntity var6 = (AbstractHorseEntity)var4;
         Class927 var7 = new Class927(var1.method17325());
         Class5827 var8 = new Class5827(var1.method17324(), var5.field4902, var7, var6);
         var5.field4905 = var8;
         this.field23272.displayGuiScreen(new Class1125(var8, var5.field4902, var6));
      }
   }

   @Override
   public void method15776(Class5498 var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);
      Class7541.method24653(var1.method17285(), this.field23272, var1.method17284(), var1.method17286());
   }

   @Override
   public void method15714(Class5501 var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);
      ClientPlayerEntity var4 = this.field23272.player;
      ItemStack var5 = var1.method17305();
      int var6 = var1.method17304();
      this.field23272.method1567().method37028(var5);
      if (var1.method17303() != -1) {
         if (var1.method17303() != -2) {
            boolean var7 = false;
            if (this.field23272.currentScreen instanceof Class861) {
               Class861 var8 = (Class861)this.field23272.currentScreen;
               var7 = var8.method2654() != Class7401.field31677.method23641();
            }

            if (var1.method17303() == 0 && var1.method17304() >= 36 && var6 < 45) {
               if (!var5.method32105()) {
                  ItemStack var9 = var4.field4904.method18131(var6).method18265();
                  if (var9.method32105() || var9.method32179() < var5.method32179()) {
                     var5.method32178(5);
                  }
               }

               var4.field4904.method18136(var6, var5);
            } else if (var1.method17303() == var4.field4905.field25471 && (var1.method17303() != 0 || !var7)) {
               var4.field4905.method18136(var6, var5);
            }
         } else {
            var4.field4902.method3621(var6, var5);
         }
      } else if (!(this.field23272.currentScreen instanceof Class861)) {
         var4.field4902.method4056(var5);
      }
   }

   @Override
   public void method15709(Class5542 var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);
      Object var4 = null;
      ClientPlayerEntity var5 = this.field23272.player;
      if (var1.method17421() != 0) {
         if (var1.method17421() == var5.field4905.field25471) {
            var4 = var5.field4905;
         }
      } else {
         var4 = var5.field4904;
      }

      if (var4 != null && !var1.method17423()) {
         this.sendPacket(new Class5493(var1.method17421(), var1.method17422(), true));
      }
   }

   @Override
   public void method15711(Class5614 var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);
      ClientPlayerEntity var4 = this.field23272.player;
      if (var1.method17644() != 0) {
         if (var1.method17644() == var4.field4905.field25471) {
            var4.field4905.method18137(var1.method17645());
         }
      } else {
         var4.field4904.method18137(var1.method17645());
      }
   }

   @Override
   public void method15702(Class5491 var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);
      Object var4 = this.field23273.method6759(var1.method17271());
      if (!(var4 instanceof Class954)) {
         var4 = new Class954();
         ((Class944)var4).method3769(this.field23273, var1.method17271());
      }

      this.field23272.player.method2764((Class954)var4);
   }

   @Override
   public void method15703(Class5610 var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);
      BlockPos var4 = var1.method17636();
      Class944 var5 = this.field23272.world.method6759(var4);
      int var6 = var1.method17637();
      boolean var7 = var6 == 2 && var5 instanceof Class969;
      if (var6 == 1 && var5 instanceof Class960
         || var7
         || var6 == 3 && var5 instanceof Class950
         || var6 == 4 && var5 instanceof Class968
         || var6 == 6 && var5 instanceof Class958
         || var6 == 7 && var5 instanceof Class964
         || var6 == 8 && var5 instanceof Class957
         || var6 == 9 && var5 instanceof Class954
         || var6 == 11 && var5 instanceof Class967
         || var6 == 5 && var5 instanceof Class959
         || var6 == 12 && var5 instanceof Class965
         || var6 == 13 && var5 instanceof Class945
         || var6 == 14 && var5 instanceof Class962) {
         var5.method3645(this.field23272.world.method6738(var4), var1.method17638());
      }

      if (var7 && this.field23272.currentScreen instanceof Class1326) {
         ((Class1326)this.field23272.currentScreen).method6314();
      }
   }

   @Override
   public void method15713(Class5480 var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);
      ClientPlayerEntity var4 = this.field23272.player;
      if (var4.field4905 != null && var4.field4905.field25471 == var1.method17239()) {
         var4.field4905.method18138(var1.method17240(), var1.method17241());
      }
   }

   @Override
   public void method15740(Class5588 var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);
      Entity var4 = this.field23273.method6774(var1.method17561());
      if (var4 != null) {
         var1.method17562().forEach(var1x -> var4.method2944((Class2106)var1x.getFirst(), (ItemStack)var1x.getSecond()));
      }
   }

   @Override
   public void method15710(Class5586 var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);
      this.field23272.player.method5390();
   }

   @Override
   public void method15704(Class5495 var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);
      this.field23272.world.method6787(var1.method17278(), var1.method17281(), var1.method17279(), var1.method17280());
   }

   @Override
   public void method15701(Class5524 var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);
      this.field23272.world.method6803(var1.method17369(), var1.method17370(), var1.method17371());
   }

   @Override
   public void method15721(Class5534 var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);
      ClientPlayerEntity var4 = this.field23272.player;
      Class9385 var5 = var1.method17397();
      float var6 = var1.method17398();
      int var7 = MathHelper.method37767(var6 + 0.5F);
      if (var5 != Class5534.field24560) {
         if (var5 != Class5534.field24561) {
            if (var5 != Class5534.field24562) {
               if (var5 != Class5534.field24563) {
                  if (var5 != Class5534.field24564) {
                     if (var5 != Class5534.field24565) {
                        if (var5 != Class5534.field24566) {
                           if (var5 != Class5534.field24567) {
                              if (var5 != Class5534.field24568) {
                                 if (var5 != Class5534.field24569) {
                                    if (var5 != Class5534.field24570) {
                                       if (var5 == Class5534.field24571) {
                                          this.field23272.player.method5403(var6 == 0.0F);
                                       }
                                    } else {
                                       this.field23273.method6746(Class7940.field34064, var4.getPosX(), var4.getPosY(), var4.getPosZ(), 0.0, 0.0, 0.0);
                                       if (var7 == 1) {
                                          this.field23273
                                             .method6743(
                                                var4,
                                                var4.getPosX(),
                                                var4.getPosY(),
                                                var4.getPosZ(),
                                                Class6067.field26526,
                                                Class2266.field14733,
                                                1.0F,
                                                1.0F
                                             );
                                       }
                                    }
                                 } else {
                                    this.field23273
                                       .method6743(
                                          var4, var4.getPosX(), var4.getPosY(), var4.getPosZ(), Class6067.field26985, Class2266.field14734, 1.0F, 1.0F
                                       );
                                 }
                              } else {
                                 this.field23273.method6791(var6);
                              }
                           } else {
                              this.field23273.method6793(var6);
                           }
                        } else {
                           this.field23273
                              .method6743(
                                 var4, var4.getPosX(), var4.method3442(), var4.getPosZ(), Class6067.field26362, Class2266.field14735, 0.18F, 0.45F
                              );
                        }
                     } else {
                        Class9574 var8 = this.field23272.gameSettings;
                        if (var6 != 0.0F) {
                           if (var6 != 101.0F) {
                              if (var6 != 102.0F) {
                                 if (var6 != 103.0F) {
                                    if (var6 == 104.0F) {
                                       this.field23272
                                          .ingameGUI
                                          .getChatGUI()
                                          .method5930(new TranslationTextComponent("demo.day.6", var8.field44649.method8521()));
                                    }
                                 } else {
                                    this.field23272
                                       .ingameGUI
                                       .getChatGUI()
                                       .method5930(new TranslationTextComponent("demo.help.inventory", var8.field44639.method8521()));
                                 }
                              } else {
                                 this.field23272
                                    .ingameGUI
                                    .getChatGUI()
                                    .method5930(new TranslationTextComponent("demo.help.jump", var8.field44636.method8521()));
                              }
                           } else {
                              this.field23272
                                 .ingameGUI
                                 .getChatGUI()
                                 .method5930(
                                    new TranslationTextComponent(
                                       "demo.help.movement",
                                       var8.field44632.method8521(),
                                       var8.field44633.method8521(),
                                       var8.field44634.method8521(),
                                       var8.field44635.method8521()
                                    )
                                 );
                           }
                        } else {
                           this.field23272.displayGuiScreen(new Class1308());
                        }
                     }
                  } else if (var7 != 0) {
                     if (var7 == 1) {
                        this.field23272
                           .displayGuiScreen(new Class1342(true, () -> this.field23272.player.connection.sendPacket(new CClientStatusPacket(CClientStatusPacketState.field14277))));
                     }
                  } else {
                     this.field23272.player.connection.sendPacket(new CClientStatusPacket(CClientStatusPacketState.field14277));
                     this.field23272.displayGuiScreen(new Class1312());
                  }
               } else {
                  this.field23272.field1337.method23129(Class1894.method8159(var7));
               }
            } else {
               this.field23273.getWorldInfo().method20044(false);
               this.field23273.method6793(1.0F);
            }
         } else {
            this.field23273.getWorldInfo().method20044(true);
            this.field23273.method6793(0.0F);
         }
      } else {
         var4.method2785(new TranslationTextComponent("block.minecraft.spawn.not_valid"), false);
      }
   }

   @Override
   public void method15708(Class5609 var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);
      Class194 var4 = this.field23272.gameRenderer.method756();
      String var5 = Class3316.method11864(var1.method17634());
      Class7529 var6 = this.field23272.world.method6798(var5);
      if (var6 == null) {
         var6 = new Class7529(var5);
         if (var4.method595(var5) != null) {
            Class7529 var7 = var4.method597(var4.method595(var5));
            if (var7 != null) {
               var6 = var7;
            }
         }

         this.field23272.world.method6799(var6);
      }

      var1.method17635(var6);
      var4.method592(var6);
   }

   @Override
   public void method15725(Class5481 var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);
      if (!var1.method17242()) {
         this.field23272.world.method6999(var1.method17243(), var1.method17245(), var1.method17244());
      } else {
         this.field23272.world.method6801(var1.method17243(), var1.method17245(), var1.method17244());
      }
   }

   @Override
   public void method15765(Class5563 var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);
      this.field23277.method31508(var1);
   }

   @Override
   public void method15766(Class5513 var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);
      ResourceLocation var4 = var1.method17335();
      if (var4 != null) {
         Class7952 var5 = this.field23277.method31509().method28599(var4);
         this.field23277.method31510(var5, false);
      } else {
         this.field23277.method31510((Class7952)null, false);
      }
   }

   @Override
   public void method15768(Class5617 var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);
      this.field23283 = new CommandDispatcher(var1.method17658());
   }

   @Override
   public void method15769(Class5488 var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);
      this.field23272.method1546().method1013(var1.method17268(), var1.method17269());
   }

   @Override
   public void method15770(Class5543 var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);
      this.field23278.method20137(var1.method17424(), var1.method17425());
   }

   @Override
   public void method15771(Class5512 var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);
      this.field23284.method1039(var1.method17331());
      Class7010 var4 = this.field23272.<Class9266>method1557(Class266.field1032);
      var4.method21735();
      Class6943 var5 = this.field23272.player.method5397();
      var5.method21383(this.field23284.method1036());
      var5.method21386().forEach(var4::method21734);
      var4.method21736();
   }

   @Override
   public void method15772(Class5602 var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);
      Vector3d var4 = var1.method17624(this.field23273);
      if (var4 != null) {
         this.field23272.player.method2787(var1.method17623(), var4);
      }
   }

   @Override
   public void method15773(Class5510 var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);
      if (!this.field23280.method14176(var1.method17328(), var1.method17329())) {
         field23267.debug("Got unhandled response to tag query {}", var1.method17328());
      }
   }

   @Override
   public void method15699(Class5548 var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);

      for (Entry var5 : var1.method17459().entrySet()) {
         Class9007 var6 = (Class9007)var5.getKey();
         int var7 = (Integer)var5.getValue();
         this.field23272.player.method5396().method28959(this.field23272.player, var6, var7);
      }

      if (this.field23272.currentScreen instanceof Class1306) {
         ((Class1306)this.field23272.currentScreen).method6181();
      }
   }

   @Override
   public void method15700(Class5572 var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);
      Class6943 var4 = this.field23272.player.method5397();
      var4.method21373(var1.method17501());
      Class2338 var5 = var1.method17502();
      switch (Class8047.field34564[var5.ordinal()]) {
         case 1:
            for (ResourceLocation var13 : var1.method17499()) {
               this.field23284.method1035(var13).ifPresent(var4::method21362);
            }
            break;
         case 2:
            for (ResourceLocation var11 : var1.method17499()) {
               this.field23284.method1035(var11).ifPresent(var4::method21358);
            }

            for (ResourceLocation var12 : var1.method17500()) {
               this.field23284.method1035(var12).ifPresent(var4::method21366);
            }
            break;
         case 3:
            for (ResourceLocation var7 : var1.method17499()) {
               this.field23284.method1035(var7).ifPresent(var2 -> {
                  var4.method21358((Class4843<?>)var2);
                  var4.method21366((Class4843<?>)var2);
                  Class7602.method24901(this.field23272.method1566(), (Class4843<?>)var2);
               });
            }
      }

      var4.method21386().forEach(var1x -> var1x.method34887(var4));
      if (this.field23272.currentScreen instanceof Class854) {
         ((Class854)this.field23272.currentScreen).method2631();
      }
   }

   @Override
   public void method15753(Class5537 var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);
      Entity var4 = this.field23273.method6774(var1.method17407());
      if (var4 instanceof Class880) {
         Class7144 var5 = Class7144.method22287(var1.method17408());
         if (var5 != null) {
            Class2023 var6 = new Class2023(var5, var1.method17410(), var1.method17409(), var1.method17412(), var1.method17411(), var1.method17413());
            var6.method8641(var1.method17406());
            ((Class880)var4).method3037(var6);
         }
      }
   }

   @Override
   public void method15754(Class5611 var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);
      Class8933 var4 = var1.method17639();
      Multimap var5 = Class8384.method29380(var4);
      if (var5.isEmpty()) {
         this.field23279 = var4;
         if (!this.field23269.method30702()) {
            var4.method32661();
         }

         this.field23272.<ItemStack>method1557(Class266.field1031).method21736();
      } else {
         field23267.warn("Incomplete server tags, disconnecting. Missing: {}", var5);
         this.field23269.method30701(new TranslationTextComponent("multiplayer.disconnect.missing_tags"));
      }
   }

   @Override
   public void method15755(Class5565 var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);
      if (var1.field24693 == Class1900.field11157) {
         Entity var4 = this.field23273.method6774(var1.field24694);
         if (var4 == this.field23272.player) {
            if (!this.field23272.player.isShowDeathScreen()) {
               this.field23272.player.respawnPlayer();
            } else {
               this.field23272.displayGuiScreen(new DeathScreen(var1.field24697, this.field23273.getWorldInfo().isHardcore()));
            }
         }
      }
   }

   @Override
   public void method15756(Class5535 var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);
      this.field23274.method20050(var1.method17400());
      this.field23274.method20051(var1.method17399());
   }

   @Override
   public void method15757(Class5560 var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);
      Entity var4 = var1.method17480(this.field23273);
      if (var4 != null) {
         this.field23272.method1551(var4);
      }
   }

   @Override
   public void method15758(Class5474 var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);
      var1.method17221(this.field23273.method6810());
   }

   @Override
   public void method15759(Class5591 var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);
      Class2301 var4 = var1.method17569();
      ITextComponent var5 = null;
      ITextComponent var6 = null;
      ITextComponent var7 = var1.method17570() != null ? var1.method17570() : StringTextComponent.EMPTY;
      switch (Class8047.field34565[var4.ordinal()]) {
         case 1:
            var5 = var7;
            break;
         case 2:
            var6 = var7;
            break;
         case 3:
            this.field23272.ingameGUI.method5985(var7, false);
            return;
         case 4:
            this.field23272.ingameGUI.method5986((ITextComponent)null, (ITextComponent)null, -1, -1, -1);
            this.field23272.ingameGUI.method5960();
            return;
      }

      this.field23272.ingameGUI.method5986(var5, var6, var1.method17571(), var1.method17572(), var1.method17573());
   }

   @Override
   public void method15760(Class5531 var1) {
      this.field23272.ingameGUI.method5993().method5924(!var1.method17391().getString().isEmpty() ? var1.method17391() : null);
      this.field23272.ingameGUI.method5993().method5923(!var1.method17392().getString().isEmpty() ? var1.method17392() : null);
   }

   @Override
   public void method15733(Class5518 var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);
      Entity var4 = var1.method17349(this.field23273);
      if (var4 instanceof Class880) {
         ((Class880)var4).method3039(var1.method17350());
      }
   }

   @Override
   public void method15731(Class5503 var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);

      for (Class8790 var5 : var1.method17307()) {
         if (var1.method17308() == Class2176.field14285) {
            this.field23272.method1578().method37612(var5.method31726().getId());
            this.field23276.remove(var5.method31726().getId());
         } else {
            Class6589 var6 = this.field23276.get(var5.method31726().getId());
            if (var1.method17308() == Class2176.field14281) {
               var6 = new Class6589(var5);
               this.field23276.put(var6.method19966().getId(), var6);
               this.field23272.method1578().method37611(var6);
            }

            if (var6 != null) {
               switch (Class8047.field34566[var1.method17308().ordinal()]) {
                  case 1:
                     var6.method19968(var5.method31728());
                     var6.method19970(var5.method31727());
                     var6.method19978(var5.method31729());
                     break;
                  case 2:
                     var6.method19968(var5.method31728());
                     break;
                  case 3:
                     var6.method19970(var5.method31727());
                     break;
                  case 4:
                     var6.method19978(var5.method31729());
               }
            }
         }
      }
   }

   @Override
   public void method15722(Class5554 var1) {
      this.sendPacket(new Class5600(var1.method17471()));
   }

   @Override
   public void method15730(Class5599 var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);
      ClientPlayerEntity var4 = this.field23272.player;
      var4.field4919.field29607 = var1.method17603();
      var4.field4919.field29609 = var1.method17605();
      var4.field4919.field29606 = var1.method17602();
      var4.field4919.field29608 = var1.method17604();
      var4.field4919.method20715(var1.method17606());
      var4.field4919.method20717(var1.method17607());
   }

   @Override
   public void method15747(Class5584 var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);
      this.field23272
         .world
         .method6743(
            this.field23272.player,
            var1.method17551(),
            var1.method17552(),
            var1.method17553(),
            var1.method17549(),
            var1.method17550(),
            var1.method17554(),
            var1.method17555()
         );
   }

   @Override
   public void method15748(Class5546 var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);
      Entity var4 = this.field23273.method6774(var1.method17443());
      if (var4 != null) {
         this.field23272.world.method6744(this.field23272.player, var4, var1.method17441(), var1.method17442(), var1.method17444(), var1.method17445());
      }
   }

   @Override
   public void method15749(Class5475 var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);
      this.field23272
         .method1546()
         .method1000(
            new Class6339(
               var1.method17222(),
               var1.method17223(),
               var1.method17227(),
               var1.method17228(),
               false,
               0,
               Class2279.field14846,
               var1.method17224(),
               var1.method17225(),
               var1.method17226(),
               false
            )
         );
   }

   @Override
   public void method15761(Class5528 var1) {
      String var4 = var1.method17385();
      String var5 = var1.method17386();
      if (this.method15786(var4)) {
         if (var4.startsWith("level://")) {
            try {
               String var6 = URLDecoder.decode(var4.substring("level://".length()), StandardCharsets.UTF_8.toString());
               File var7 = new File(this.field23272.field1303, "saves");
               File var8 = new File(var7, var6);
               if (var8.isFile()) {
                  this.method15788(Class2066.field13467);
                  CompletableFuture var9 = this.field23272.method1539().method25153(var8, Class7725.field33172);
                  this.method15787(var9);
                  return;
               }
            } catch (UnsupportedEncodingException var10) {
            }

            this.method15788(Class2066.field13466);
         } else {
            Class7730 var11 = this.field23272.method1528();
            if (var11 != null && var11.method25577() == Class2168.field14234) {
               this.method15788(Class2066.field13467);
               this.method15787(this.field23272.method1539().method25148(var4, var5));
            } else if (var11 != null && var11.method25577() != Class2168.field14236) {
               this.method15788(Class2066.field13465);
            } else {
               this.field23272.execute(() -> this.field23272.displayGuiScreen(new Class829(var3 -> {
                     this.field23272 = Minecraft.getInstance();
                     Class7730 var6x = this.field23272.method1528();
                     if (!var3) {
                        if (var6x != null) {
                           var6x.method25578(Class2168.field14235);
                        }

                        this.method15788(Class2066.field13465);
                     } else {
                        if (var6x != null) {
                           var6x.method25578(Class2168.field14234);
                        }

                        this.method15788(Class2066.field13467);
                        this.method15787(this.field23272.method1539().method25148(var4, var5));
                     }

                     Class7970.method27102(var6x);
                     this.field23272.displayGuiScreen((Screen)null);
                  }, new TranslationTextComponent("multiplayer.texturePrompt.line1"), new TranslationTextComponent("multiplayer.texturePrompt.line2"))));
            }
         }
      }
   }

   private boolean method15786(String var1) {
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
         this.method15788(Class2066.field13466);
         return false;
      }
   }

   private void method15787(CompletableFuture<?> var1) {
      var1.thenRun(() -> this.method15788(Class2066.field13464)).exceptionally(var1x -> {
         this.method15788(Class2066.field13466);
         return null;
      });
   }

   private void method15788(Class2066 var1) {
      this.field23269.method30693(new Class5557(var1));
   }

   @Override
   public void method15762(Class5472 var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);
      this.field23272.ingameGUI.method5995().method5955(var1);
   }

   @Override
   public void method15763(Class5574 var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);
      if (var1.method17507() != 0) {
         this.field23272.player.method2976().method19638(var1.method17506(), var1.method17507());
      } else {
         this.field23272.player.method2976().method19639(var1.method17506());
      }
   }

   @Override
   public void method15764(Class5536 var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);
      Entity var4 = this.field23272.player.method3415();
      if (var4 != this.field23272.player && var4.method3418()) {
         var4.method3269(var1.method17401(), var1.method17402(), var1.method17403(), var1.method17404(), var1.method17405());
         this.field23269.method30693(new Class5483(var4));
      }
   }

   @Override
   public void method15775(Class5509 var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);
      ItemStack var4 = this.field23272.player.getHeldItem(var1.method17327());
      if (var4.method32107() == Class8514.field38048) {
         this.field23272.displayGuiScreen(new Class870(new Class7501(var4)));
      }
   }

   @Override
   public void method15715(Class5532 var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);
      ResourceLocation var4 = var1.method17393();
      PacketBuffer var5 = null;

      try {
         var5 = var1.method17394();
         if (Class5532.field24537.equals(var4)) {
            this.field23272.player.method5394(var5.method35728(32767));
         } else if (Class5532.field24538.equals(var4)) {
            int var6 = var5.readInt();
            float var7 = var5.readFloat();
            Class8238 var8 = Class8238.method28711(var5);
            this.field23272.field1296.field34466.method15902(var6, var8, var7);
         } else if (Class5532.field24539.equals(var4)) {
            long var9 = var5.method35715();
            BlockPos var62 = var5.method35707();
            ((Class5132)this.field23272.field1296.field34471).method15869(var9, var62);
         } else if (Class5532.field24540.equals(var4)) {
            BlockPos var42 = var5.method35707();
            int var52 = var5.readInt();
            ArrayList var63 = Lists.newArrayList();
            ArrayList var11 = Lists.newArrayList();

            for (int var12 = 0; var12 < var52; var12++) {
               var63.add(var5.method35707());
               var11.add(var5.readFloat());
            }

            this.field23272.field1296.field34472.method15868(var42, var63, var11);
         } else if (Class5532.field24541.equals(var4)) {
            Class9535 var43 = this.field23287.method32454().method9184(var5.method35731());
            Class9764 var53 = new Class9764(var5.readInt(), var5.readInt(), var5.readInt(), var5.readInt(), var5.readInt(), var5.readInt());
            int var64 = var5.readInt();
            ArrayList var73 = Lists.newArrayList();
            ArrayList var78 = Lists.newArrayList();

            for (int var13 = 0; var13 < var64; var13++) {
               var73.add(new Class9764(var5.readInt(), var5.readInt(), var5.readInt(), var5.readInt(), var5.readInt(), var5.readInt()));
               var78.add(var5.readBoolean());
            }

            this.field23272.field1296.field34473.method15815(var53, var73, var78, var43);
         } else if (Class5532.field24542.equals(var4)) {
            ((Class5134)this.field23272.field1296.field34475)
               .method15901(var5.method35707(), var5.readFloat(), var5.readFloat(), var5.readFloat(), var5.readFloat(), var5.readFloat());
         } else if (Class5532.field24546.equals(var4)) {
            int var44 = var5.readInt();

            for (int var54 = 0; var54 < var44; var54++) {
               this.field23272.field1296.field34479.method15817(var5.method35709());
            }

            int var55 = var5.readInt();

            for (int var65 = 0; var65 < var55; var65++) {
               this.field23272.field1296.field34479.method15818(var5.method35709());
            }
         } else if (Class5532.field24544.equals(var4)) {
            BlockPos var45 = var5.method35707();
            String var56 = var5.method35727();
            int var66 = var5.readInt();
            Class9321 var74 = new Class9321(var45, var56, var66);
            this.field23272.field1296.field34478.method15871(var74);
         } else if (Class5532.field24545.equals(var4)) {
            BlockPos var46 = var5.method35707();
            this.field23272.field1296.field34478.method15872(var46);
         } else if (Class5532.field24543.equals(var4)) {
            BlockPos var47 = var5.method35707();
            int var57 = var5.readInt();
            this.field23272.field1296.field34478.method15873(var47, var57);
         } else if (Class5532.field24547.equals(var4)) {
            BlockPos var48 = var5.method35707();
            int var58 = var5.readInt();
            int var67 = var5.readInt();
            ArrayList var75 = Lists.newArrayList();

            for (int var79 = 0; var79 < var67; var79++) {
               int var81 = var5.readInt();
               boolean var14 = var5.readBoolean();
               String var15 = var5.method35728(255);
               var75.add(new Class4231(var48, var81, var15, var14));
            }

            this.field23272.field1296.field34482.method15822(var58, var75);
         } else if (Class5532.field24553.equals(var4)) {
            int var49 = var5.readInt();
            ArrayList var59 = Lists.newArrayList();

            for (int var68 = 0; var68 < var49; var68++) {
               var59.add(var5.method35707());
            }

            this.field23272.field1296.field34481.method15863(var59);
         } else if (Class5532.field24548.equals(var4)) {
            double var71 = var5.readDouble();
            double var16 = var5.readDouble();
            double var18 = var5.readDouble();
            Class2959 var83 = new Class2959(var71, var16, var18);
            UUID var85 = var5.method35717();
            int var20 = var5.readInt();
            String var21 = var5.method35727();
            String var22 = var5.method35727();
            int var23 = var5.readInt();
            float var24 = var5.readFloat();
            float var25 = var5.readFloat();
            String var26 = var5.method35727();
            boolean var27 = var5.readBoolean();
            Class8238 var28;
            if (var27) {
               var28 = Class8238.method28711(var5);
            } else {
               var28 = null;
            }

            boolean var29 = var5.readBoolean();
            Class8918 var30 = new Class8918(var85, var20, var21, var22, var23, var24, var25, var83, var26, var28, var29);
            int var31 = var5.readInt();

            for (int var32 = 0; var32 < var31; var32++) {
               String var33 = var5.method35727();
               var30.field40373.add(var33);
            }

            int var103 = var5.readInt();

            for (int var105 = 0; var105 < var103; var105++) {
               String var34 = var5.method35727();
               var30.field40374.add(var34);
            }

            int var106 = var5.readInt();

            for (int var107 = 0; var107 < var106; var107++) {
               String var35 = var5.method35727();
               var30.field40375.add(var35);
            }

            int var108 = var5.readInt();

            for (int var109 = 0; var109 < var108; var109++) {
               BlockPos var36 = var5.method35707();
               var30.field40377.add(var36);
            }

            int var110 = var5.readInt();

            for (int var111 = 0; var111 < var110; var111++) {
               BlockPos var37 = var5.method35707();
               var30.field40378.add(var37);
            }

            int var112 = var5.readInt();

            for (int var113 = 0; var113 < var112; var113++) {
               String var38 = var5.method35727();
               var30.field40376.add(var38);
            }

            this.field23272.field1296.field34478.method15874(var30);
         } else if (Class5532.field24549.equals(var4)) {
            double var72 = var5.readDouble();
            double var87 = var5.readDouble();
            double var88 = var5.readDouble();
            Class2959 var84 = new Class2959(var72, var87, var88);
            UUID var86 = var5.method35717();
            int var89 = var5.readInt();
            boolean var90 = var5.readBoolean();
            BlockPos var91 = null;
            if (var90) {
               var91 = var5.method35707();
            }

            boolean var92 = var5.readBoolean();
            BlockPos var93 = null;
            if (var92) {
               var93 = var5.method35707();
            }

            int var94 = var5.readInt();
            boolean var95 = var5.readBoolean();
            Class8238 var96 = null;
            if (var95) {
               var96 = Class8238.method28711(var5);
            }

            Class6986 var97 = new Class6986(var86, var89, var84, var96, var91, var93, var94);
            int var98 = var5.readInt();

            for (int var99 = 0; var99 < var98; var99++) {
               String var101 = var5.method35727();
               var97.field30226.add(var101);
            }

            int var100 = var5.readInt();

            for (int var102 = 0; var102 < var100; var102++) {
               BlockPos var104 = var5.method35707();
               var97.field30227.add(var104);
            }

            this.field23272.field1296.field34480.method15825(var97);
         } else if (Class5532.field24550.equals(var4)) {
            BlockPos var50 = var5.method35707();
            String var60 = var5.method35727();
            int var69 = var5.readInt();
            int var76 = var5.readInt();
            boolean var80 = var5.readBoolean();
            Class8974 var82 = new Class8974(var50, var60, var69, var76, var80, this.field23273.method6783());
            this.field23272.field1296.field34480.method15824(var82);
         } else if (Class5532.field24552.equals(var4)) {
            this.field23272.field1296.field34483.method15814();
         } else if (Class5532.field24551.equals(var4)) {
            BlockPos var51 = var5.method35707();
            int var61 = var5.readInt();
            String var70 = var5.method35727();
            int var77 = var5.readInt();
            this.field23272.field1296.field34483.method15907(var51, var61, var70, var77);
         } else {
            field23267.warn("Unknown custom packed identifier: {}", var4);
         }
      } finally {
         if (var5 != null) {
            var5.release();
         }
      }
   }

   @Override
   public void method15695(Class5576 var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);
      Class6886 var4 = this.field23273.method6805();
      String var5 = var1.method17510();
      if (var1.method17512() != 0) {
         if (var4.method20974(var5)) {
            Class8375 var6 = var4.method20976(var5);
            if (var1.method17512() != 1) {
               if (var1.method17512() == 2) {
                  var6.method29343(var1.method17513());
                  var6.method29341(var1.method17511());
               }
            } else {
               var4.method20987(var6);
            }
         }
      } else {
         var4.method20977(var5, Class9008.field41189, var1.method17511(), var1.method17513());
      }
   }

   @Override
   public void method15744(Class5556 var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);
      Class6886 var4 = this.field23273.method6805();
      String var5 = var1.method17474();
      switch (Class8047.field34567[var1.method17476().ordinal()]) {
         case 1:
            Class8375 var6 = var4.method20975(var5);
            Class9411 var7 = var4.method20980(var1.method17473(), var6);
            var7.method36052(var1.method17475());
            break;
         case 2:
            var4.method20985(var1.method17473(), var4.method20976(var5));
      }
   }

   @Override
   public void method15737(Class5615 var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);
      Class6886 var4 = this.field23273.method6805();
      String var5 = var1.method17647();
      Class8375 var6 = var5 != null ? var4.method20975(var5) : null;
      var4.method20988(var1.method17646(), var6);
   }

   @Override
   public void method15743(Class5581 var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);
      Class6886 var4 = this.field23273.method6805();
      Class8218 var5;
      if (var1.method17528() != 0) {
         var5 = var4.method20990(var1.method17525());
      } else {
         var5 = var4.method20991(var1.method17525());
      }

      if (var1.method17528() == 0 || var1.method17528() == 2) {
         var5.method28570(var1.method17526());
         var5.method28590(var1.method17530());
         var5.method28589(var1.method17529());
         Class2225 var6 = Class2225.method8958(var1.method17531());
         if (var6 != null) {
            var5.method28584(var6);
         }

         Class2212 var7 = Class2212.method8939(var1.method17532());
         if (var7 != null) {
            var5.method28587(var7);
         }

         var5.method28571(var1.method17533());
         var5.method28573(var1.method17534());
      }

      if (var1.method17528() == 0 || var1.method17528() == 3) {
         for (String var10 : var1.method17527()) {
            var4.method20993(var10, var5);
         }
      }

      if (var1.method17528() == 4) {
         for (String var11 : var1.method17527()) {
            var4.method20995(var11, var5);
         }
      }

      if (var1.method17528() == 1) {
         var4.method20992(var5);
      }
   }

   @Override
   public void method15729(Class5547 var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);
      if (var1.method17455() == 0) {
         double var4 = (double)(var1.method17454() * var1.method17451());
         double var6 = (double)(var1.method17454() * var1.method17452());
         double var8 = (double)(var1.method17454() * var1.method17453());

         try {
            this.field23273.method6747(var1.method17456(), var1.method17447(), var1.method17448(), var1.method17449(), var1.method17450(), var4, var6, var8);
         } catch (Throwable var26) {
            field23267.warn("Could not spawn particle effect {}", var1.method17456());
         }
      } else {
         for (int var11 = 0; var11 < var1.method17455(); var11++) {
            double var12 = this.field23282.nextGaussian() * (double)var1.method17451();
            double var14 = this.field23282.nextGaussian() * (double)var1.method17452();
            double var16 = this.field23282.nextGaussian() * (double)var1.method17453();
            double var18 = this.field23282.nextGaussian() * (double)var1.method17454();
            double var20 = this.field23282.nextGaussian() * (double)var1.method17454();
            double var22 = this.field23282.nextGaussian() * (double)var1.method17454();

            try {
               this.field23273
                  .method6747(
                     var1.method17456(),
                     var1.method17447(),
                     var1.method17448() + var12,
                     var1.method17449() + var14,
                     var1.method17450() + var16,
                     var18,
                     var20,
                     var22
                  );
            } catch (Throwable var25) {
               field23267.warn("Could not spawn particle effect {}", var1.method17456());
               return;
            }
         }
      }
   }

   @Override
   public void method15752(Class5550 var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);
      Entity var4 = this.field23273.method6774(var1.method17463());
      if (var4 != null) {
         if (!(var4 instanceof Class880)) {
            throw new IllegalStateException("Server tried to update attributes of a non-living entity (actually: " + var4 + ")");
         }

         Class9020 var5 = ((Class880)var4).method3088();

         for (Class7919 var7 : var1.method17464()) {
            Class9805 var8 = var5.method33380(var7.method26560());
            if (var8 != null) {
               var8.method38661(var7.method26561());
               var8.method38673();

               for (Class9689 var10 : var7.method26562()) {
                  var8.method38667(var10);
               }
            } else {
               field23267.warn("Entity {} does not have attribute {}", var4, Class2348.field16087.method9181(var7.method26560()));
            }
         }
      }
   }

   @Override
   public void method15767(Class5589 var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);
      Class5812 var4 = this.field23272.player.field4905;
      if (var4.field25471 == var1.method17564() && var4.method18140(this.field23272.player)) {
         this.field23284.method1035(var1.method17563()).ifPresent(var2 -> {
            if (this.field23272.currentScreen instanceof Class854) {
               Class1254 var5 = ((Class854)this.field23272.currentScreen).method2632();
               var5.method5858((Class4843<?>)var2, var4.field25468);
            }
         });
      }
   }

   @Override
   public void method15774(Class5523 var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);
      int var4 = var1.method17360();
      int var5 = var1.method17361();
      Class196 var6 = this.field23273.method6883().method7348();
      int var7 = var1.method17362();
      int var8 = var1.method17363();
      Iterator var9 = var1.method17364().iterator();
      this.method15789(var4, var5, var6, Class1977.field12881, var7, var8, var9, var1.method17368());
      int var10 = var1.method17365();
      int var11 = var1.method17366();
      Iterator var12 = var1.method17367().iterator();
      this.method15789(var4, var5, var6, Class1977.field12882, var10, var11, var12, var1.method17368());
   }

   @Override
   public void method15777(Class5504 var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);
      Class5812 var4 = this.field23272.player.field4905;
      if (var1.method17309() == var4.field25471 && var4 instanceof Class5826) {
         ((Class5826)var4).method18216(new Class46(var1.method17310().method166()));
         ((Class5826)var4).method18207(var1.method17312());
         ((Class5826)var4).method18209(var1.method17311());
         ((Class5826)var4).method18203(var1.method17313());
         ((Class5826)var4).method18210(var1.method17314());
      }
   }

   @Override
   public void method15778(Class5502 var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);
      this.field23281 = var1.method17306();
      this.field23273.method6883().method7403(var1.method17306());
   }

   @Override
   public void method15779(Class5579 var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);
      this.field23273.method6883().method7402(var1.method17522(), var1.method17523());
   }

   @Override
   public void method15780(Class5585 var1) {
      PacketThreadUtil.method31780(var1, this, this.field23272);
      this.field23272.field1337.method23161(this.field23273, var1.method17557(), var1.method17556(), var1.method17559(), var1.method17558());
   }

   private void method15789(int var1, int var2, Class196 var3, Class1977 var4, int var5, int var6, Iterator<byte[]> var7, boolean var8) {
      for (int var11 = 0; var11 < 18; var11++) {
         int var12 = -1 + var11;
         boolean var13 = (var5 & 1 << var11) != 0;
         boolean var14 = (var6 & 1 << var11) != 0;
         if (var13 || var14) {
            var3.method606(var4, Class2002.method8389(var1, var12, var2), !var13 ? new Class6785() : new Class6785((byte[])((byte[])var7.next()).clone()), var8);
            this.field23273.method6868(var1, var12, var2);
         }
      }
   }

   @Override
   public NetworkManager method15589() {
      return this.field23269;
   }

   public Collection<Class6589> method15790() {
      return this.field23276.values();
   }

   public Collection<UUID> method15791() {
      return this.field23276.keySet();
   }

   @Nullable
   public Class6589 method15792(UUID var1) {
      return this.field23276.get(var1);
   }

   @Nullable
   public Class6589 method15793(String var1) {
      for (Class6589 var5 : this.field23276.values()) {
         if (var5.method19966().getName().equals(var1)) {
            return var5;
         }
      }

      return null;
   }

   public GameProfile method15794() {
      return this.field23270;
   }

   public Class8730 method15795() {
      return this.field23277;
   }

   public CommandDispatcher<Class6618> method15796() {
      return this.field23283;
   }

   public Class1656 method15797() {
      return this.field23273;
   }

   public Class8933 method15798() {
      return this.field23279;
   }

   public Class4496 method15799() {
      return this.field23280;
   }

   public UUID method15800() {
      return this.field23285;
   }

   public Set<Class8705<World>> method15801() {
      return this.field23286;
   }

   public Class8904 method15802() {
      return this.field23287;
   }
}