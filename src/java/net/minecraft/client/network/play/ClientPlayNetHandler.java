package net.minecraft.client.network.play;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;
import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import de.florianmichael.vialoadingbase.ViaLoadingBase;
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

import mapped.*;
import net.minecraft.advancements.Advancement;
import net.minecraft.block.Block;
import net.minecraft.client.GameSettings;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.player.RemoteClientPlayerEntity;
import net.minecraft.client.gui.ScreenManager;
import net.minecraft.client.gui.recipebook.RecipeList;
import net.minecraft.client.gui.screen.ConfirmScreen;
import net.minecraft.client.gui.screen.MultiplayerScreen;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.multiplayer.ClientChunkProvider;
import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.client.multiplayer.ServerList;
import net.minecraft.client.util.ClientRecipeBook;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.command.ISuggestionProvider;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.AttributeModifierManager;
import net.minecraft.entity.ai.attributes.ModifiableAttributeInstance;
import net.minecraft.entity.boss.dragon.EnderDragonPartEntity;
import net.minecraft.entity.item.BoatEntity;
import net.minecraft.entity.item.ItemFrameEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.inventory.container.Container;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.RecipeManager;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.client.*;
import net.minecraft.network.play.server.*;
import net.minecraft.potion.EffectInstance;
import net.minecraft.realms.RealmsScreen;
import net.minecraft.scoreboard.ScorePlayerTeam;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.scoreboard.Team;
import net.minecraft.tileentity.*;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.*;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.Difficulty;
import net.minecraft.world.GameType;
import net.minecraft.world.LightType;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeContainer;
import net.minecraft.world.chunk.NibbleArray;
import net.minecraft.world.lighting.WorldLightManager;
import net.minecraft.world.storage.MapData;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ClientPlayNetHandler implements IClientPlayNetHandler {
   private static final Logger field23267 = LogManager.getLogger();
   private static final ITextComponent field23268 = new TranslationTextComponent("disconnect.lost");
   private final NetworkManager field23269;
   private final GameProfile field23270;
   private final Screen field23271;
   private Minecraft mc;
   private ClientWorld field23273;
   private ClientWorld.ClientWorldInfo field23274;
   private boolean field23275;
   private final Map<UUID, NetworkPlayerInfo> field23276 = Maps.newHashMap();
   private final Class8730 field23277;
   private final Class6617 field23278;
   private Class8933 field23279 = Class8933.field40418;
   private final Class4496 field23280 = new Class4496(this);
   private int field23281 = 3;
   private final Random field23282 = new Random();
   private CommandDispatcher<ISuggestionProvider> field23283 = new CommandDispatcher();
   private final RecipeManager field23284 = new RecipeManager();
   private final UUID field23285 = UUID.randomUUID();
   private Set<RegistryKey<World>> field23286;
   public DynamicRegistries field23287 = DynamicRegistries.func_239770_b_();

   public ClientPlayNetHandler(Minecraft var1, Screen var2, NetworkManager var3, GameProfile var4) {
      this.mc = var1;
      this.field23271 = var2;
      this.field23269 = var3;
      this.field23270 = var4;
      this.field23277 = new Class8730(var1);
      this.field23278 = new Class6617(this, var1);
   }

   public Class6617 method15781() {
      return this.field23278;
   }

   public void cleanup() {
      this.field23273 = null;
   }

   public RecipeManager getRecipeManager() {
      return this.field23284;
   }

   @Override
   public void handleJoinGame(SJoinGamePacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);
      this.mc.playerController = new Class7314(this.mc, this);
      if (!this.field23269.isLocalChannel()) {
         TagRegistryManager.method29379();
      }

      ArrayList var4 = Lists.newArrayList(var1.method17292());
      Collections.shuffle(var4);
      this.field23286 = Sets.newLinkedHashSet(var4);
      this.field23287 = var1.method17293();
      RegistryKey var5 = var1.method17295();
      DimensionType var6 = var1.method17294();
      this.field23281 = var1.method17296();
      boolean var7 = var1.method17299();
      boolean var8 = var1.method17300();
      ClientWorld.ClientWorldInfo var9 = new ClientWorld.ClientWorldInfo(Difficulty.NORMAL, var1.method17289(), var8);
      this.field23274 = var9;
      this.field23273 = new ClientWorld(this, var9, var5, var6, this.field23281, this.mc::getProfiler, this.mc.worldRenderer, var7, var1.method17288());
      this.mc.loadWorld(this.field23273);
      if (this.mc.player == null) {
         this.mc.player = this.mc.playerController.createPlayer(this.field23273, new Class8286(), new ClientRecipeBook());
         this.mc.player.rotationYaw = -180.0F;
         if (this.mc.getIntegratedServer() != null) {
            this.mc.getIntegratedServer().method6489(this.mc.player.getUniqueID());
         }
      }

      this.mc.debugRenderer.method27451();
      this.mc.player.preparePlayerToSpawn();
      int var10 = var1.method17287();
      this.field23273.addPlayer(var10, this.mc.player);
      this.mc.player.movementInput = new Class9451(this.mc.gameSettings);
      this.mc.playerController.setPlayerCapabilities(this.mc.player);
      this.mc.renderViewEntity = this.mc.player;
      this.mc.displayGuiScreen(new Class1312());
      this.mc.player.setEntityId(var10);
      this.mc.player.method2965(var1.method17297());
      this.mc.player.method5403(var1.method17298());
      this.mc.playerController.setGameType(var1.method17290());
      this.mc.playerController.method23128(var1.method17291());
      this.mc.gameSettings.method37149();
      this.field23269.sendPacket(new CCustomPayloadPacket(CCustomPayloadPacket.BRAND, new PacketBuffer(Unpooled.buffer()).writeString(ClientBrandRetriever.getClientModName())));
      this.mc.getMinecraftGame().method28908();
   }

   @Override
   public void handleSpawnObject(SSpawnObjectPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);
      double var4 = var1.method17258();
      double var6 = var1.method17259();
      double var8 = var1.method17260();
      EntityType var10 = var1.method17266();
      Object var11;
      if (var10 != EntityType.CHEST_MINECART) {
         if (var10 != EntityType.FURNACE_MINECART) {
            if (var10 != EntityType.TNT_MINECART) {
               if (var10 != EntityType.SPAWNER_MINECART) {
                  if (var10 != EntityType.HOPPER_MINECART) {
                     if (var10 != EntityType.COMMAND_BLOCK_MINECART) {
                        if (var10 != EntityType.MINECART) {
                           if (var10 != EntityType.FISHING_BOBBER) {
                              if (var10 != EntityType.ARROW) {
                                 if (var10 != EntityType.SPECTRAL_ARROW) {
                                    if (var10 != EntityType.TRIDENT) {
                                       if (var10 != EntityType.SNOWBALL) {
                                          if (var10 != EntityType.LLAMA_SPIT) {
                                             if (var10 != EntityType.ITEM_FRAME) {
                                                if (var10 != EntityType.LEASH_KNOT) {
                                                   if (var10 != EntityType.ENDER_PEARL) {
                                                      if (var10 != EntityType.field41030) {
                                                         if (var10 != EntityType.field41032) {
                                                            if (var10 != EntityType.FIREBALL) {
                                                               if (var10 != EntityType.DRAGON_FIREBALL) {
                                                                  if (var10 != EntityType.SMALL_FIREBALL) {
                                                                     if (var10 != EntityType.WITHER_SKULL) {
                                                                        if (var10 != EntityType.SHULKER_BULLET) {
                                                                           if (var10 != EntityType.EGG) {
                                                                              if (var10 != EntityType.field41028) {
                                                                                 if (var10 != EntityType.POTION) {
                                                                                    if (var10 != EntityType.EXPERIENCE_BOTTLE) {
                                                                                       if (var10 != EntityType.BOAT) {
                                                                                          if (var10 != EntityType.TNT) {
                                                                                             if (var10 != EntityType.ARMOR_STAND) {
                                                                                                if (var10 != EntityType.field41023) {
                                                                                                   if (var10 != EntityType.ITEM) {
                                                                                                      if (var10 != EntityType.field41031) {
                                                                                                         if (var10 != EntityType.AREA_EFFECT_CLOUD) {
                                                                                                            if (var10 != EntityType.LIGHTNING_BOLT) {
                                                                                                               var11 = null;
                                                                                                            } else {
                                                                                                               var11 = new Class906(
                                                                                                                  EntityType.LIGHTNING_BOLT, this.field23273
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
                                                                                                   var11 = new EnderCrystalEntity(this.field23273, var4, var6, var8);
                                                                                                }
                                                                                             } else {
                                                                                                var11 = new ArmorStandEntity(this.field23273, var4, var6, var8);
                                                                                             }
                                                                                          } else {
                                                                                             var11 = new Class1004(
                                                                                                this.field23273, var4, var6, var8, (LivingEntity)null
                                                                                             );
                                                                                          }
                                                                                       } else {
                                                                                          var11 = new BoatEntity(this.field23273, var4, var6, var8);
                                                                                       }
                                                                                    } else {
                                                                                       var11 = new Class891(this.field23273, var4, var6, var8);
                                                                                    }
                                                                                 } else {
                                                                                    var11 = new Class896(this.field23273, var4, var6, var8);
                                                                                 }
                                                                              } else {
                                                                                 var11 = new Class915(
                                                                                    this.field23273, var4, var6, var8, 0.0F, 0, (LivingEntity)null
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
                                                   var11 = new LeashKnotEntity(this.field23273, new BlockPos(var4, var6, var8));
                                                }
                                             } else {
                                                var11 = new ItemFrameEntity(this.field23273, new BlockPos(var4, var6, var8), Direction.byIndex(var1.method17267()));
                                             }
                                          } else {
                                             var11 = new Class883(this.field23273, var4, var6, var8, var1.method17261(), var1.method17262(), var1.method17263());
                                          }
                                       } else {
                                          var11 = new Class894(this.field23273, var4, var6, var8);
                                       }
                                    } else {
                                       var11 = new Class886(this.field23273, var4, var6, var8);
                                       Entity var12 = this.field23273.getEntityByID(var1.method17267());
                                       if (var12 != null) {
                                          ((AbstractArrowEntity)var11).setShooter(var12);
                                       }
                                    }
                                 } else {
                                    var11 = new Class885(this.field23273, var4, var6, var8);
                                    Entity var13 = this.field23273.getEntityByID(var1.method17267());
                                    if (var13 != null) {
                                       ((AbstractArrowEntity)var11).setShooter(var13);
                                    }
                                 }
                              } else {
                                 var11 = new Class887(this.field23273, var4, var6, var8);
                                 Entity var14 = this.field23273.getEntityByID(var1.method17267());
                                 if (var14 != null) {
                                    ((AbstractArrowEntity)var11).setShooter(var14);
                                 }
                              }
                           } else {
                              Entity var15 = this.field23273.getEntityByID(var1.method17267());
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
         ((Entity)var11).setPacketCoordinates(var4, var6, var8);
         ((Entity)var11).moveForced(var4, var6, var8);
         ((Entity)var11).rotationPitch = (float)(var1.method17264() * 360) / 256.0F;
         ((Entity)var11).rotationYaw = (float)(var1.method17265() * 360) / 256.0F;
         ((Entity)var11).setEntityId(var16);
         ((Entity)var11).setUniqueId(var1.method17257());
         this.field23273.addEntity(var16, (Entity)var11);
         if (var11 instanceof AbstractMinecartEntity) {
            this.mc.getSoundHandler().method1000(new Class6345((AbstractMinecartEntity)var11));
         }
      }
   }

   @Override
   public void handleSpawnExperienceOrb(SSpawnExperienceOrbPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);
      double var4 = var1.method17354();
      double var6 = var1.method17355();
      double var8 = var1.method17356();
      ExperienceOrbEntity var10 = new ExperienceOrbEntity(this.field23273, var4, var6, var8, var1.method17357());
      var10.setPacketCoordinates(var4, var6, var8);
      var10.rotationYaw = 0.0F;
      var10.rotationPitch = 0.0F;
      var10.setEntityId(var1.method17353());
      this.field23273.addEntity(var1.method17353(), var10);
   }

   @Override
   public void handleSpawnPainting(SSpawnPaintingPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);
      PaintingEntity var4 = new PaintingEntity(this.field23273, var1.method17196(), var1.method17197(), var1.method17198());
      var4.setEntityId(var1.method17194());
      var4.setUniqueId(var1.method17195());
      this.field23273.addEntity(var1.method17194(), var4);
   }

   @Override
   public void handleEntityVelocity(SEntityVelocityPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);
      Entity var4 = this.field23273.getEntityByID(var1.getEntityID());
      if (var4 != null) {
         var4.method3325((double)var1.getMotionX() / 8000.0, (double)var1.getMotionY() / 8000.0, (double)var1.getMotionZ() / 8000.0);
      }
   }

   @Override
   public void handleEntityMetadata(SEntityMetadataPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);
      Entity var4 = this.field23273.getEntityByID(var1.getEntityId());
      if (var4 != null && var1.getDataManagerEntries() != null) {
         var4.getDataManager().method35454(var1.getDataManagerEntries());
      }
   }

   @Override
   public void handleSpawnPlayer(SSpawnPlayerPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);
      double var4 = var1.method17594();
      double var6 = var1.method17595();
      double var8 = var1.method17596();
      float var10 = (float)(var1.method17597() * 360) / 256.0F;
      float var11 = (float)(var1.method17598() * 360) / 256.0F;
      if (this.method15792(var1.method17593()) != null) {
         int var12 = var1.method17592();
         RemoteClientPlayerEntity var13 = new RemoteClientPlayerEntity(this.mc.world, this.method15792(var1.method17593()).method19966());
         var13.setEntityId(var12);
         var13.setLocationAndAngles(var4, var6, var8);
         var13.setPacketCoordinates(var4, var6, var8);
         var13.setPositionAndRotation(var4, var6, var8, var10, var11);
         this.field23273.addPlayer(var12, var13);
      }
   }

   @Override
   public void handleEntityTeleport(SEntityTeleportPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);
      Entity var4 = this.field23273.getEntityByID(var1.getEntityId());
      if (var4 != null) {
         double var5 = var1.getX();
         double var7 = var1.getY();
         double var9 = var1.getZ();
         var4.setPacketCoordinates(var5, var7, var9);
         if (!var4.canPassengerSteer()) {
            float var11 = (float)(var1.getYaw() * 360) / 256.0F;
            float var12 = (float)(var1.getPitch() * 360) / 256.0F;
            var4.setPositionAndRotationDirect(var5, var7, var9, var11, var12, 3, true);
            var4.setOnGround(var1.isOnGround());
         }
      }
   }

   @Override
   public void handleHeldItemChange(SHeldItemChangePacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);
      if (PlayerInventory.isHotbar(var1.method17633())) {
         this.mc.player.inventory.currentItem = var1.method17633();
      }
   }

   @Override
   public void handleEntityMovement(SEntityPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);
      Entity var4 = var1.getEntity(this.field23273);
      if (var4 != null && !var4.canPassengerSteer()) {
         if (!var1.func_229745_h_()) {
            if (var1.isRotating()) {
               float var5 = (float)(var1.getYaw() * 360) / 256.0F;
               float var6 = (float)(var1.getPitch() * 360) / 256.0F;
               var4.setPositionAndRotationDirect(var4.getPosX(), var4.getPosY(), var4.getPosZ(), var5, var6, 3, false);
            }
         } else {
            Vector3d var8 = var1.method17231(var4.getServerPos());
            var4.func_242277_a(var8);
            float var9 = !var1.isRotating() ? var4.rotationYaw : (float)(var1.getYaw() * 360) / 256.0F;
            float var7 = !var1.isRotating() ? var4.rotationPitch : (float)(var1.getPitch() * 360) / 256.0F;
            var4.setPositionAndRotationDirect(var8.getX(), var8.getY(), var8.getZ(), var9, var7, 3, false);
         }

         var4.setOnGround(var1.getOnGround());
      }
   }

   @Override
   public void handleEntityHeadLook(SEntityHeadLookPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);
      Entity var4 = var1.getEntity(this.field23273);
      if (var4 != null) {
         float var5 = (float)(var1.getYaw() * 360) / 256.0F;
         var4.setHeadRotation(var5, 3);
      }
   }

   @Override
   public void handleDestroyEntities(SDestroyEntitiesPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);

      for (int var4 = 0; var4 < var1.getEntityIDs().length; var4++) {
         int var5 = var1.getEntityIDs()[var4];
         this.field23273.removeEntityFromWorld(var5);
      }
   }

   @Override
   public void handlePlayerPosLook(SPlayerPositionLookPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);
      ClientPlayerEntity var4 = this.mc.player;
      Vector3d var5 = var4.getMotion();
      boolean var6 = var1.getFlags().contains(Flags.field13198);
      boolean var7 = var1.getFlags().contains(Flags.field13199);
      boolean var8 = var1.getFlags().contains(Flags.field13200);
      double var9;
      double var11;
      if (!var6) {
         var9 = 0.0;
         var11 = var1.getX();
         var4.lastTickPosX = var11;
      } else {
         var9 = var5.getX();
         var11 = var4.getPosX() + var1.getX();
         var4.lastTickPosX = var4.lastTickPosX + var1.getX();
      }

      double var13;
      double var15;
      if (!var7) {
         var13 = 0.0;
         var15 = var1.getY();
         var4.lastTickPosY = var15;
      } else {
         var13 = var5.getY();
         var15 = var4.getPosY() + var1.getY();
         var4.lastTickPosY = var4.lastTickPosY + var1.getY();
      }

      double var17;
      double var19;
      if (!var8) {
         var17 = 0.0;
         var19 = var1.getZ();
         var4.lastTickPosZ = var19;
      } else {
         var17 = var5.getZ();
         var19 = var4.getPosZ() + var1.getZ();
         var4.lastTickPosZ = var4.lastTickPosZ + var1.getZ();
      }

      if (var4.ticksExisted > 0 && var4.getRidingEntity() != null) {
         var4.dismount();
      }

      var4.setRawPosition(var11, var15, var19);
      var4.prevPosX = var11;
      var4.prevPosY = var15;
      var4.prevPosZ = var19;
      var4.setMotion(var9, var13, var17);
      float var21 = var1.getYaw();
      float var22 = var1.getPitch();
      if (var1.getFlags().contains(Flags.field13202)) {
         var22 += var4.rotationPitch;
      }

      if (var1.getFlags().contains(Flags.field13201)) {
         var21 += var4.rotationYaw;
      }

      var4.setPositionAndRotation(var11, var15, var19, var21, var22);
      this.field23269.sendPacket(new CConfirmTeleportPacket(var1.getTeleportI()));
      this.field23269.sendPacket(new CPlayerPacket.PositionRotationPacket(var4.getPosX(), var4.getPosY(), var4.getPosZ(), var4.rotationYaw, var4.rotationPitch, false));
      if (!this.field23275) {
         this.field23275 = true;
         this.mc.displayGuiScreen((Screen)null);
      }
   }

   @Override
   public void handleMultiBlockChange(SMultiBlockChangePacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);
      int var4 = 19 | (!var1.method17462() ? 0 : 128);
      var1.method17461((var2, var3) -> this.field23273.setBlockState(var2, var3, var4));
   }

   @Override
   public void handleChunkData(SChunkDataPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);
      int var4 = var1.getChunkX();
      int var5 = var1.getChunkZ();
      BiomeContainer var6 = var1.method17384() != null ? new BiomeContainer(this.field23287.<Biome>getRegistry(Registry.BIOME_KEY), var1.method17384()) : null;
      Chunk var7 = this.field23273
         .getChunkProvider()
         .loadChunk(var4, var5, var6, var1.method17374(), var1.method17382(), var1.method17380(), var1.isFullChunk());
      if (var7 != null && var1.isFullChunk()) {
         this.field23273.addEntitiesToChunk(var7);
      }

      for (int var8 = 0; var8 < 16; var8++) {
         this.field23273.method6868(var4, var8, var5);
      }

      for (CompoundNBT var9 : var1.method17383()) {
         BlockPos var10 = new BlockPos(var9.getInt("x"), var9.getInt("y"), var9.getInt("z"));
         TileEntity var11 = this.field23273.getTileEntity(var10);
         if (var11 != null) {
            var11.read(this.field23273.getBlockState(var10), var9);
         }
      }
   }

   @Override
   public void processChunkUnload(SUnloadChunkPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);
      int var4 = var1.method17492();
      int var5 = var1.method17493();
      ClientChunkProvider var6 = this.field23273.getChunkProvider();
      var6.unloadChunk(var4, var5);
      WorldLightManager var7 = var6.getLightManager();

      for (int var8 = 0; var8 < 16; var8++) {
         this.field23273.method6868(var4, var8, var5);
         var7.updateSectionStatus(SectionPos.of(var4, var8, var5), true);
      }

      var7.enableLightSources(new ChunkPos(var4, var5), false);
   }

   @Override
   public void handleBlockChange(SChangeBlockPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);
      this.field23273.method6851(var1.method17632(), var1.method17631());
   }

   @Override
   public void handleDisconnect(SDisconnectPacket var1) {
      this.field23269.closeChannel(var1.method17390());
   }

   @Override
   public void onDisconnect(ITextComponent var1) {
      this.mc.unloadWorld();
      if (this.field23271 == null) {
         this.mc.displayGuiScreen(new Class832(new MultiplayerScreen(new VanillaMainMenuScreen()), field23268, var1));
      } else if (!(this.field23271 instanceof RealmsScreen)) {
         this.mc.displayGuiScreen(new Class832(this.field23271, field23268, var1));
      } else {
         this.mc.displayGuiScreen(new Class801(this.field23271, field23268, var1));
      }
   }

   public void sendPacket(IPacket<?> var1) {
      this.field23269.sendPacket(var1);
   }

   @Override
   public void handleCollectItem(SCollectItemPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);
      Entity var4 = this.field23273.getEntityByID(var1.method17186());
      Object var5 = (LivingEntity)this.field23273.getEntityByID(var1.method17187());
      if (var5 == null) {
         var5 = this.mc.player;
      }

      if (var4 != null) {
         if (!(var4 instanceof ExperienceOrbEntity)) {
            this.field23273
               .method6745(
                  var4.getPosX(),
                  var4.getPosY(),
                  var4.getPosZ(),
                  SoundEvents.field26714,
                  SoundCategory.field14735,
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
                  SoundEvents.field26569,
                  SoundCategory.field14735,
                  0.1F,
                  (this.field23282.nextFloat() - this.field23282.nextFloat()) * 0.35F + 0.9F,
                  false
               );
         }

         this.mc.particles.method1199(new Class4593(this.mc.getRenderManager(), this.mc.getRenderTypeBuffers(), this.field23273, var4, (Entity)var5));
         if (!(var4 instanceof ItemEntity)) {
            this.field23273.removeEntityFromWorld(var1.method17186());
         } else {
            ItemEntity var6 = (ItemEntity)var4;
            ItemStack var7 = var6.method4124();
            var7.shrink(var1.method17188());
            if (var7.isEmpty()) {
               this.field23273.removeEntityFromWorld(var1.method17186());
            }
         }
      }
   }

   @Override
   public void handleChat(SChatPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);
      this.mc.ingameGUI.method5988(var1.getType(), var1.getChatComponent(), var1.func_240810_e_());
   }

   @Override
   public void handleAnimation(SAnimateHandPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);
      Entity var4 = this.field23273.getEntityByID(var1.method17192());
      if (var4 != null) {
         if (var1.method17193() != 0) {
            if (var1.method17193() != 3) {
               if (var1.method17193() != 1) {
                  if (var1.method17193() != 2) {
                     if (var1.method17193() != 4) {
                        if (var1.method17193() == 5) {
                           this.mc.particles.addParticleEmitter(var4, ParticleTypes.ENCHANTED_HIT);
                        }
                     } else {
                        this.mc.particles.addParticleEmitter(var4, ParticleTypes.CRIT);
                     }
                  } else {
                     PlayerEntity var5 = (PlayerEntity)var4;
                     var5.stopSleepInBed(false, false);
                  }
               } else {
                  var4.performHurtAnimation();
               }
            } else {
               LivingEntity var6 = (LivingEntity)var4;
               var6.swingArm(Hand.OFF_HAND);
            }
         } else {
            LivingEntity var7 = (LivingEntity)var4;
            var7.swingArm(Hand.MAIN_HAND);
         }
      }
   }

   @Override
   public void handleSpawnMob(SSpawnMobPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);
      double var4 = var1.method17538();
      double var6 = var1.method17539();
      double var8 = var1.method17540();
      float var10 = (float)(var1.method17544() * 360) / 256.0F;
      float var11 = (float)(var1.method17545() * 360) / 256.0F;
      LivingEntity var12 = (LivingEntity) EntityType.method33216(var1.method17537(), this.mc.world);
      if (var12 == null) {
         field23267.warn("Skipping Entity with id {}", var1.method17537());
      } else {
         var12.setPacketCoordinates(var4, var6, var8);
         var12.renderYawOffset = (float)(var1.method17546() * 360) / 256.0F;
         var12.rotationYawHead = (float)(var1.method17546() * 360) / 256.0F;
         if (var12 instanceof Class1007) {
            EnderDragonPartEntity[] var13 = ((Class1007)var12).method4332();

            for (int var14 = 0; var14 < var13.length; var14++) {
               var13[var14].setEntityId(var14 + var1.method17535());
            }
         }

         var12.setEntityId(var1.method17535());
         var12.setUniqueId(var1.method17536());
         var12.setPositionAndRotation(var4, var6, var8, var10, var11);
         var12.setMotion(
            (double)((float)var1.method17541() / 8000.0F), (double)((float)var1.method17542() / 8000.0F), (double)((float)var1.method17543() / 8000.0F)
         );
         this.field23273.addEntity(var1.method17535(), var12);
         if (var12 instanceof Class1017) {
            boolean var15 = ((Class1017)var12).method4369();
            Object var16;
            if (!var15) {
               var16 = new Class6336((Class1017)var12);
            } else {
               var16 = new Class6335((Class1017)var12);
            }

            this.mc.getSoundHandler().method999((Class6341)var16);
         }
      }
   }

   @Override
   public void handleTimeUpdate(SUpdateTimePacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);
      this.mc.world.func_239134_a_(var1.getTotalWorldTime());
      this.mc.world.setDayTime(var1.getWorldTime());
   }

   @Override
   public void func_230488_a_(SWorldSpawnChangedPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);
      this.mc.world.func_239136_a_(var1.method17372(), var1.method17373());
   }

   @Override
   public void handleSetPassengers(SSetPassengersPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);
      Entity var4 = this.field23273.getEntityByID(var1.method17253());
      if (var4 != null) {
         boolean var5 = var4.method3417(this.mc.player);
         var4.removePassengers();

         for (int var9 : var1.method17252()) {
            Entity var10 = this.field23273.getEntityByID(var9);
            if (var10 != null) {
               var10.startRiding(var4, true);
               if (var10 == this.mc.player && !var5) {
                  this.mc.ingameGUI.method5985(new TranslationTextComponent("mount.onboard", this.mc.gameSettings.keyBindSneak.func_238171_j_()), false);
               }
            }
         }
      } else {
         field23267.warn("Received passengers for unknown entity");
      }
   }

   @Override
   public void handleEntityAttach(SMountEntityPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);
      Entity var4 = this.field23273.getEntityByID(var1.method17577());
      if (var4 instanceof MobEntity) {
         ((MobEntity)var4).method4299(var1.method17578());
      }
   }

   private static ItemStack method15785(PlayerEntity var0) {
      for (Hand var6 : Hand.values()) {
         ItemStack var7 = var0.getHeldItem(var6);
         if (var7.getItem() == Items.TOTEM_OF_UNDYING) {
            return var7;
         }
      }

      return new ItemStack(Items.TOTEM_OF_UNDYING);
   }

   @Override
   public void handleEntityStatus(SEntityStatusPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);
      Entity var4 = var1.getEntity(this.field23273);
      if (var4 != null) {
         if (var1.getOpCode() != 21) {
            if (var1.getOpCode() != 35) {
               var4.handleStatusUpdate(var1.getOpCode());
            } else {
               byte var5 = 40;
               this.mc.particles.method1196(var4, ParticleTypes.field34097, 30);
               this.field23273.method6745(var4.getPosX(), var4.getPosY(), var4.getPosZ(), SoundEvents.field27147, var4.getSoundCategory(), 1.0F, 1.0F, false);
               if (var4 == this.mc.player) {
                  this.mc.gameRenderer.displayItemActivation(method15785(this.mc.player));
               }
            }
         } else {
            this.mc.getSoundHandler().method1000(new Class6347((Class1105)var4));
         }
      }
   }

   @Override
   public void handleUpdateHealth(SUpdateHealthPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);
      this.mc.player.method5391(var1.method17574());
      this.mc.player.getFoodStats().method37578(var1.method17575());
      this.mc.player.getFoodStats().method37579(var1.method17576());
   }

   @Override
   public void handleSetExperience(SSetExperiencePacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);
      this.mc.player.method5402(var1.method17321(), var1.method17322(), var1.method17323());
   }

   @Override
   public void handleRespawn(SRespawnPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);
      RegistryKey var4 = var1.method17433();
      DimensionType var5 = var1.method17432();
      ClientPlayerEntity var6 = this.mc.player;
      int var7 = var6.getEntityId();
      this.field23275 = false;
      if (var4 != var6.world.getDimensionKey()) {
         Scoreboard var8 = this.field23273.method6805();
         boolean var9 = var1.method17437();
         boolean var10 = var1.method17438();
         ClientWorld.ClientWorldInfo var11 = new ClientWorld.ClientWorldInfo(this.field23274.method20047(), this.field23274.isHardcore(), var10);
         this.field23274 = var11;
         this.field23273 = new ClientWorld(
            this, var11, var4, var5, this.field23281, this.mc::getProfiler, this.mc.worldRenderer, var9, var1.method17434()
         );
         this.field23273.method6859(var8);
         this.mc.loadWorld(this.field23273);
         this.mc.displayGuiScreen(new Class1312());
      }

      this.field23273.method6857();
      String var12 = var6.method5395();
      this.mc.renderViewEntity = null;
      ClientPlayerEntity var13 = this.mc.playerController.func_239167_a_(this.field23273, var6.method5396(), var6.getRecipeBook(), var6.isSneaking(), var6.isSprinting());
      var13.setEntityId(var7);
      this.mc.player = var13;
      if (var4 != var6.world.getDimensionKey()) {
         this.mc.getMusicTicker().method33668();
      }

      this.mc.renderViewEntity = var13;
      var13.getDataManager().method35454(var6.getDataManager().getAll());
      if (var1.method17439()) {
         var13.getAttributeManager().refreshOnRespawn(var6.getAttributeManager());
      }

      var13.preparePlayerToSpawn();
      var13.method5394(var12);
      this.field23273.addPlayer(var7, var13);
      var13.rotationYaw = -180.0F;
      var13.movementInput = new Class9451(this.mc.gameSettings);
      this.mc.playerController.setPlayerCapabilities(var13);
      var13.method2965(var6.hasReducedDebug());
      var13.method5403(var6.isShowDeathScreen());
      if (this.mc.currentScreen instanceof DeathScreen) {
         this.mc.displayGuiScreen((Screen)null);
      }

      this.mc.playerController.setGameType(var1.method17435());
      this.mc.playerController.method23128(var1.method17436());
   }

   @Override
   public void handleExplosion(SExplosionPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);
      Explosion var4 = new Explosion(
         this.mc.world, (Entity)null, var1.getX(), var1.getY(), var1.getZ(), var1.getStrength(), var1.getAffectedBlockPositions()
      );
      var4.method25785(true);
      this.mc
         .player
         .setMotion(this.mc.player.getMotion().add((double)var1.getMotionX(), (double)var1.getMotionY(), (double)var1.getMotionZ()));
   }

   @Override
   public void handleOpenHorseWindow(SOpenHorseWindowPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);
      Entity var4 = this.field23273.getEntityByID(var1.method17326());
      if (var4 instanceof AbstractHorseEntity) {
         ClientPlayerEntity var5 = this.mc.player;
         AbstractHorseEntity var6 = (AbstractHorseEntity)var4;
         Class927 var7 = new Class927(var1.method17325());
         Class5827 var8 = new Class5827(var1.method17324(), var5.inventory, var7, var6);
         var5.openContainer = var8;
         this.mc.displayGuiScreen(new Class1125(var8, var5.inventory, var6));
      }
   }

   @Override
   public void handleOpenWindowPacket(SOpenWindowPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);
      ScreenManager.openScreen(var1.method17285(), this.mc, var1.method17284(), var1.method17286());
   }

   @Override
   public void handleSetSlot(SSetSlotPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);
      ClientPlayerEntity var4 = this.mc.player;
      ItemStack var5 = var1.method17305();
      int var6 = var1.method17304();
      this.mc.getTutorial().method37028(var5);
      if (var1.method17303() != -1) {
         if (var1.method17303() != -2) {
            boolean var7 = false;
            if (this.mc.currentScreen instanceof CreativeScreen) {
               CreativeScreen var8 = (CreativeScreen)this.mc.currentScreen;
               var7 = var8.method2654() != ItemGroup.field31677.method23641();
            }

            if (var1.method17303() == 0 && var1.method17304() >= 36 && var6 < 45) {
               if (!var5.isEmpty()) {
                  ItemStack var9 = var4.container.getSlot(var6).getStack();
                  if (var9.isEmpty() || var9.getCount() < var5.getCount()) {
                     var5.method32178(5);
                  }
               }

               var4.container.putStackInSlot(var6, var5);
            } else if (var1.method17303() == var4.openContainer.windowId && (var1.method17303() != 0 || !var7)) {
               var4.openContainer.putStackInSlot(var6, var5);
            }
         } else {
            var4.inventory.setInventorySlotContents(var6, var5);
         }
      } else if (!(this.mc.currentScreen instanceof CreativeScreen)) {
         var4.inventory.setItemStack(var5);
      }
   }

   @Override
   public void handleConfirmTransaction(SConfirmTransactionPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);
      if (ViaLoadingBase.getInstance().getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_17)) {
         this.sendPacket(new CConfirmTransactionPacket(var1.getWindowId(), (short) 0, false));
         return;
      }
      Object var4 = null;
      ClientPlayerEntity var5 = this.mc.player;
      if (var1.getWindowId() != 0) {
         if (var1.getWindowId() == var5.openContainer.windowId) {
            var4 = var5.openContainer;
         }
      } else {
         var4 = var5.container;
      }

      if (var4 != null && !var1.getAccepted()) {
         this.sendPacket(new CConfirmTransactionPacket(var1.getWindowId(), var1.getActionNumber(), true));
      }
   }

   @Override
   public void handleWindowItems(SWindowItemsPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);
      ClientPlayerEntity var4 = this.mc.player;
      if (var1.method17644() != 0) {
         if (var1.method17644() == var4.openContainer.windowId) {
            var4.openContainer.setAll(var1.method17645());
         }
      } else {
         var4.container.setAll(var1.method17645());
      }
   }

   @Override
   public void handleSignEditorOpen(SOpenSignMenuPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);
      Object var4 = this.field23273.getTileEntity(var1.method17271());
      if (!(var4 instanceof Class954)) {
         var4 = new Class954();
         ((TileEntity)var4).method3769(this.field23273, var1.method17271());
      }

      this.mc.player.method2764((Class954)var4);
   }

   @Override
   public void handleUpdateTileEntity(SUpdateTileEntityPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);
      BlockPos var4 = var1.method17636();
      TileEntity var5 = this.mc.world.getTileEntity(var4);
      int var6 = var1.method17637();
      boolean var7 = var6 == 2 && var5 instanceof CommandBlockTileEntity;
      if (var6 == 1 && var5 instanceof Class960
         || var7
         || var6 == 3 && var5 instanceof Class950
         || var6 == 4 && var5 instanceof SkullTileEntity
         || var6 == 6 && var5 instanceof BannerTileEntity
         || var6 == 7 && var5 instanceof Class964
         || var6 == 8 && var5 instanceof Class957
         || var6 == 9 && var5 instanceof Class954
         || var6 == 11 && var5 instanceof Class967
         || var6 == 5 && var5 instanceof Class959
         || var6 == 12 && var5 instanceof JigsawTileEntity
         || var6 == 13 && var5 instanceof Class945
         || var6 == 14 && var5 instanceof BeehiveTileEntity) {
         var5.read(this.mc.world.getBlockState(var4), var1.method17638());
      }

      if (var7 && this.mc.currentScreen instanceof Class1326) {
         ((Class1326)this.mc.currentScreen).method6314();
      }
   }

   @Override
   public void handleWindowProperty(SWindowPropertyPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);
      ClientPlayerEntity var4 = this.mc.player;
      if (var4.openContainer != null && var4.openContainer.windowId == var1.method17239()) {
         var4.openContainer.updateProgressBar(var1.method17240(), var1.method17241());
      }
   }

   @Override
   public void handleEntityEquipment(SEntityEquipmentPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);
      Entity var4 = this.field23273.getEntityByID(var1.getEntityID());
      if (var4 != null) {
         var1.func_241790_c_().forEach(var1x -> var4.setItemStackToSlot((EquipmentSlotType)var1x.getFirst(), (ItemStack)var1x.getSecond()));
      }
   }

   @Override
   public void handleCloseWindow(SCloseWindowPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);
      this.mc.player.method5390();
   }

   @Override
   public void handleBlockAction(SBlockActionPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);
      this.mc.world.addBlockEvent(var1.method17278(), var1.method17281(), var1.method17279(), var1.method17280());
   }

   @Override
   public void handleBlockBreakAnim(SAnimateBlockBreakPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);
      this.mc.world.sendBlockBreakProgress(var1.method17369(), var1.method17370(), var1.method17371());
   }

   @Override
   public void handleChangeGameState(SChangeGameStatePacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);
      ClientPlayerEntity var4 = this.mc.player;
      Class9385 var5 = var1.method17397();
      float var6 = var1.method17398();
      int var7 = MathHelper.floor(var6 + 0.5F);
      if (var5 != SChangeGameStatePacket.field24560) {
         if (var5 != SChangeGameStatePacket.field24561) {
            if (var5 != SChangeGameStatePacket.field24562) {
               if (var5 != SChangeGameStatePacket.field24563) {
                  if (var5 != SChangeGameStatePacket.field24564) {
                     if (var5 != SChangeGameStatePacket.field24565) {
                        if (var5 != SChangeGameStatePacket.field24566) {
                           if (var5 != SChangeGameStatePacket.field24567) {
                              if (var5 != SChangeGameStatePacket.field24568) {
                                 if (var5 != SChangeGameStatePacket.field24569) {
                                    if (var5 != SChangeGameStatePacket.field24570) {
                                       if (var5 == SChangeGameStatePacket.field24571) {
                                          this.mc.player.method5403(var6 == 0.0F);
                                       }
                                    } else {
                                       this.field23273.addParticle(ParticleTypes.field34064, var4.getPosX(), var4.getPosY(), var4.getPosZ(), 0.0, 0.0, 0.0);
                                       if (var7 == 1) {
                                          this.field23273
                                             .playSound(
                                                var4,
                                                var4.getPosX(),
                                                var4.getPosY(),
                                                var4.getPosZ(),
                                                SoundEvents.field26526,
                                                SoundCategory.field14733,
                                                1.0F,
                                                1.0F
                                             );
                                       }
                                    }
                                 } else {
                                    this.field23273
                                       .playSound(
                                          var4, var4.getPosX(), var4.getPosY(), var4.getPosZ(), SoundEvents.field26985, SoundCategory.field14734, 1.0F, 1.0F
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
                              .playSound(
                                 var4, var4.getPosX(), var4.getPosYEye(), var4.getPosZ(), SoundEvents.field26362, SoundCategory.field14735, 0.18F, 0.45F
                              );
                        }
                     } else {
                        GameSettings var8 = this.mc.gameSettings;
                        if (var6 != 0.0F) {
                           if (var6 != 101.0F) {
                              if (var6 != 102.0F) {
                                 if (var6 != 103.0F) {
                                    if (var6 == 104.0F) {
                                       this.mc
                                          .ingameGUI
                                          .getChatGUI()
                                          .sendChatMessage(new TranslationTextComponent("demo.day.6", var8.keyBindScreenshot.func_238171_j_()));
                                    }
                                 } else {
                                    this.mc
                                       .ingameGUI
                                       .getChatGUI()
                                       .sendChatMessage(new TranslationTextComponent("demo.help.inventory", var8.keyBindInventory.func_238171_j_()));
                                 }
                              } else {
                                 this.mc
                                    .ingameGUI
                                    .getChatGUI()
                                    .sendChatMessage(new TranslationTextComponent("demo.help.jump", var8.keyBindJump.func_238171_j_()));
                              }
                           } else {
                              this.mc
                                 .ingameGUI
                                 .getChatGUI()
                                 .sendChatMessage(
                                    new TranslationTextComponent(
                                       "demo.help.movement",
                                       var8.keyBindForward.func_238171_j_(),
                                       var8.keyBindLeft.func_238171_j_(),
                                       var8.keyBindBack.func_238171_j_(),
                                       var8.keyBindRight.func_238171_j_()
                                    )
                                 );
                           }
                        } else {
                           this.mc.displayGuiScreen(new Class1308());
                        }
                     }
                  } else if (var7 != 0) {
                     if (var7 == 1) {
                        this.mc
                           .displayGuiScreen(new WinGameScreen(true, () -> this.mc.player.connection.sendPacket(new CClientStatusPacket(CClientStatusPacket.State.field14277))));
                     }
                  } else {
                     this.mc.player.connection.sendPacket(new CClientStatusPacket(CClientStatusPacket.State.field14277));
                     this.mc.displayGuiScreen(new Class1312());
                  }
               } else {
                  this.mc.playerController.setGameType(GameType.getByID(var7));
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
         var4.sendStatusMessage(new TranslationTextComponent("block.minecraft.spawn.not_valid"), false);
      }
   }

   @Override
   public void handleMaps(SMapDataPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);
      Class194 var4 = this.mc.gameRenderer.method756();
      String var5 = Class3316.method11864(var1.method17634());
      MapData var6 = this.mc.world.method6798(var5);
      if (var6 == null) {
         var6 = new MapData(var5);
         if (var4.method595(var5) != null) {
            MapData var7 = var4.method597(var4.method595(var5));
            if (var7 != null) {
               var6 = var7;
            }
         }

         this.mc.world.method6799(var6);
      }

      var1.method17635(var6);
      var4.method592(var6);
   }

   @Override
   public void handleEffect(SPlaySoundEventPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);
      if (!var1.method17242()) {
         this.mc.world.playEvent(var1.method17243(), var1.method17245(), var1.method17244());
      } else {
         this.mc.world.method6801(var1.method17243(), var1.method17245(), var1.method17244());
      }
   }

   @Override
   public void handleAdvancementInfo(SAdvancementInfoPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);
      this.field23277.method31508(var1);
   }

   @Override
   public void handleSelectAdvancementsTab(SSelectAdvancementsTabPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);
      ResourceLocation var4 = var1.method17335();
      if (var4 != null) {
         Advancement var5 = this.field23277.method31509().method28599(var4);
         this.field23277.method31510(var5, false);
      } else {
         this.field23277.method31510((Advancement)null, false);
      }
   }

   @Override
   public void handleCommandList(SCommandListPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);
      this.field23283 = new CommandDispatcher(var1.method17658());
   }

   @Override
   public void handleStopSound(SStopSoundPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);
      this.mc.getSoundHandler().method1013(var1.method17268(), var1.method17269());
   }

   @Override
   public void handleTabComplete(STabCompletePacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);
      this.field23278.method20137(var1.getTransactionId(), var1.getSugestions());
   }

   @Override
   public void handleUpdateRecipes(SUpdateRecipesPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);
      this.field23284.method1039(var1.method17331());
      IMutableSearchTree var4 = this.mc.<RecipeList>getSearchTree(SearchTreeManager.RECIPES);
      var4.method21735();
      ClientRecipeBook clientrecipebook = this.mc.player.getRecipeBook();
      clientrecipebook.method21383(this.field23284.method1036());
      clientrecipebook.getRecipes().forEach(var4::func_217872_a);
      var4.method21736();
   }

   @Override
   public void handlePlayerLook(SPlayerLookPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);
      Vector3d var4 = var1.method17624(this.field23273);
      if (var4 != null) {
         this.mc.player.lookAt(var1.method17623(), var4);
      }
   }

   @Override
   public void handleNBTQueryResponse(SQueryNBTResponsePacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);
      if (!this.field23280.method14176(var1.method17328(), var1.method17329())) {
         field23267.debug("Got unhandled response to tag query {}", var1.method17328());
      }
   }

   @Override
   public void handleStatistics(SStatisticsPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);

      for (Entry var5 : var1.method17459().entrySet()) {
         Class9007 var6 = (Class9007)var5.getKey();
         int var7 = (Integer)var5.getValue();
         this.mc.player.method5396().method28959(this.mc.player, var6, var7);
      }

      if (this.mc.currentScreen instanceof Class1306) {
         ((Class1306)this.mc.currentScreen).method6181();
      }
   }

   @Override
   public void handleRecipeBook(SRecipeBookPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);
      ClientRecipeBook var4 = this.mc.player.getRecipeBook();
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
                  var4.method21358((IRecipe<?>)var2);
                  var4.method21366((IRecipe<?>)var2);
                  Class7602.method24901(this.mc.getToastGui(), (IRecipe<?>)var2);
               });
            }
      }

      var4.getRecipes().forEach(var1x -> var1x.method34887(var4));
      if (this.mc.currentScreen instanceof Class854) {
         ((Class854)this.mc.currentScreen).method2631();
      }
   }

   @Override
   public void handleEntityEffect(SPlayEntityEffectPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);
      Entity var4 = this.field23273.getEntityByID(var1.method17407());
      if (var4 instanceof LivingEntity) {
         Effect var5 = Effect.get(var1.method17408());
         if (var5 != null) {
            EffectInstance var6 = new EffectInstance(var5, var1.method17410(), var1.method17409(), var1.method17412(), var1.method17411(), var1.method17413());
            var6.setIsPotionDurationMax(var1.method17406());
            ((LivingEntity)var4).method3037(var6);
         }
      }
   }

   @Override
   public void handleTags(STagsListPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);
      Class8933 var4 = var1.method17639();
      Multimap var5 = TagRegistryManager.method29380(var4);
      if (var5.isEmpty()) {
         this.field23279 = var4;
         if (!this.field23269.isLocalChannel()) {
            var4.method32661();
         }

         this.mc.<ItemStack>getSearchTree(SearchTreeManager.TAGS).method21736();
      } else {
         field23267.warn("Incomplete server tags, disconnecting. Missing: {}", var5);
         this.field23269.closeChannel(new TranslationTextComponent("multiplayer.disconnect.missing_tags"));
      }
   }

   @Override
   public void handleCombatEvent(SCombatPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);
      if (var1.field24693 == Class1900.field11157) {
         Entity var4 = this.field23273.getEntityByID(var1.field24694);
         if (var4 == this.mc.player) {
            if (!this.mc.player.isShowDeathScreen()) {
               this.mc.player.respawnPlayer();
            } else {
               this.mc.displayGuiScreen(new DeathScreen(var1.field24697, this.field23273.getWorldInfo().isHardcore()));
            }
         }
      }
   }

   @Override
   public void handleServerDifficulty(SServerDifficultyPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);
      this.field23274.method20050(var1.method17400());
      this.field23274.method20051(var1.method17399());
   }

   @Override
   public void handleCamera(SCameraPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);
      Entity var4 = var1.method17480(this.field23273);
      if (var4 != null) {
         this.mc.setRenderViewEntity(var4);
      }
   }

   @Override
   public void handleWorldBorder(SWorldBorderPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);
      var1.method17221(this.field23273.getWorldBorder());
   }

   @Override
   public void handleTitle(STitlePacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);
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
            this.mc.ingameGUI.method5985(var7, false);
            return;
         case 4:
            this.mc.ingameGUI.method5986((ITextComponent)null, (ITextComponent)null, -1, -1, -1);
            this.mc.ingameGUI.method5960();
            return;
      }

      this.mc.ingameGUI.method5986(var5, var6, var1.method17571(), var1.method17572(), var1.method17573());
   }

   @Override
   public void handlePlayerListHeaderFooter(SPlayerListHeaderFooterPacket var1) {
      this.mc.ingameGUI.method5993().method5924(!var1.getHeader().getString().isEmpty() ? var1.getHeader() : null);
      this.mc.ingameGUI.method5993().method5923(!var1.getFooter().getString().isEmpty() ? var1.getFooter() : null);
   }

   @Override
   public void handleRemoveEntityEffect(SRemoveEntityEffectPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);
      Entity var4 = var1.method17349(this.field23273);
      if (var4 instanceof LivingEntity) {
         ((LivingEntity)var4).removeActivePotionEffect(var1.method17350());
      }
   }

   @Override
   public void handlePlayerListItem(SPlayerListItemPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);

      for (SPlayerListItemPacket.AddPlayerData var5 : var1.getEntries()) {
         if (var1.getAction() == SPlayerListItemPacket.Action.REMOVE_PLAYER) {
            this.mc.func_244599_aA().method37612(var5.getProfile().getId());
            this.field23276.remove(var5.getProfile().getId());
         } else {
            NetworkPlayerInfo var6 = this.field23276.get(var5.getProfile().getId());
            if (var1.getAction() == SPlayerListItemPacket.Action.ADD_PLAYER) {
               var6 = new NetworkPlayerInfo(var5);
               this.field23276.put(var6.method19966().getId(), var6);
               this.mc.func_244599_aA().method37611(var6);
            }

            if (var6 != null) {
               switch (Class8047.field34566[var1.getAction().ordinal()]) {
                  case 1:
                     var6.method19968(var5.getGameMode());
                     var6.method19970(var5.getPing());
                     var6.method19978(var5.getDisplayName());
                     break;
                  case 2:
                     var6.method19968(var5.getGameMode());
                     break;
                  case 3:
                     var6.method19970(var5.getPing());
                     break;
                  case 4:
                     var6.method19978(var5.getDisplayName());
               }
            }
         }
      }
   }

   @Override
   public void handleKeepAlive(SKeepAlivePacket var1) {
      this.sendPacket(new CKeepAlivePacket(var1.method17471()));
   }

   @Override
   public void handlePlayerAbilities(SPlayerAbilitiesPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);
      ClientPlayerEntity var4 = this.mc.player;
      var4.abilities.isFlying = var1.isFlying();
      var4.abilities.isCreativeMode = var1.isCreativeMode();
      var4.abilities.disableDamage = var1.isInvulnerable();
      var4.abilities.allowFlying = var1.isAllowFlying();
      var4.abilities.setFlySpeed(var1.getFlySpeed());
      var4.abilities.setWalkSpeed(var1.getWalkSpeed());
   }

   @Override
   public void handleSoundEffect(SPlaySoundEffectPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);
      this.mc
         .world
         .playSound(
            this.mc.player,
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
   public void handleSpawnMovingSoundEffect(SSpawnMovingSoundEffectPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);
      Entity var4 = this.field23273.getEntityByID(var1.method17443());
      if (var4 != null) {
         this.mc.world.playSoundFromEntity(this.mc.player, var4, var1.method17441(), var1.method17442(), var1.method17444(), var1.method17445());
      }
   }

   @Override
   public void handleCustomSound(SPlaySoundPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);
      this.mc
         .getSoundHandler()
         .method1000(
            new MinecraftSoundManager(
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
   public void handleResourcePack(SSendResourcePackPacket var1) {
      String var4 = var1.method17385();
      String var5 = var1.method17386();
      if (this.method15786(var4)) {
         if (var4.startsWith("level://")) {
            try {
               String var6 = URLDecoder.decode(var4.substring("level://".length()), StandardCharsets.UTF_8.toString());
               File var7 = new File(this.mc.gameDir, "saves");
               File var8 = new File(var7, var6);
               if (var8.isFile()) {
                  this.method15788(CResourcePackStatusPacket.Action.ACCEPTED);
                  CompletableFuture var9 = this.mc.getPackFinder().method25153(var8, IPackNameDecorator.WORLD);
                  this.method15787(var9);
                  return;
               }
            } catch (UnsupportedEncodingException var10) {
            }

            this.method15788(CResourcePackStatusPacket.Action.FAILED_DOWNLOAD);
         } else {
            ServerData var11 = this.mc.getCurrentServerData();
            if (var11 != null && var11.method25577() == Class2168.field14234) {
               this.method15788(CResourcePackStatusPacket.Action.ACCEPTED);
               this.method15787(this.mc.getPackFinder().downloadResourcePack(var4, var5));
            } else if (var11 != null && var11.method25577() != Class2168.field14236) {
               this.method15788(CResourcePackStatusPacket.Action.DECLINED);
            } else {
               this.mc.execute(() -> this.mc.displayGuiScreen(new ConfirmScreen(var3 -> {
                     this.mc = Minecraft.getInstance();
                     ServerData var6x = this.mc.getCurrentServerData();
                     if (!var3) {
                        if (var6x != null) {
                           var6x.method25578(Class2168.field14235);
                        }

                        this.method15788(CResourcePackStatusPacket.Action.DECLINED);
                     } else {
                        if (var6x != null) {
                           var6x.method25578(Class2168.field14234);
                        }

                        this.method15788(CResourcePackStatusPacket.Action.ACCEPTED);
                        this.method15787(this.mc.getPackFinder().downloadResourcePack(var4, var5));
                     }

                     ServerList.method27102(var6x);
                     this.mc.displayGuiScreen((Screen)null);
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
         this.method15788(CResourcePackStatusPacket.Action.FAILED_DOWNLOAD);
         return false;
      }
   }

   private void method15787(CompletableFuture<?> var1) {
      var1.thenRun(() -> this.method15788(CResourcePackStatusPacket.Action.SUCCESSFULLY_LOADED)).exceptionally(var1x -> {
         this.method15788(CResourcePackStatusPacket.Action.FAILED_DOWNLOAD);
         return null;
      });
   }

   private void method15788(CResourcePackStatusPacket.Action var1) {
      this.field23269.sendPacket(new CResourcePackStatusPacket(var1));
   }

   @Override
   public void handleUpdateBossInfo(SUpdateBossInfoPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);
      this.mc.ingameGUI.getBossOverlay().method5955(var1);
   }

   @Override
   public void handleCooldown(SCooldownPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);
      if (var1.method17507() != 0) {
         this.mc.player.method2976().method19638(var1.method17506(), var1.method17507());
      } else {
         this.mc.player.method2976().method19639(var1.method17506());
      }
   }

   @Override
   public void handleMoveVehicle(SMoveVehiclePacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);
      Entity var4 = this.mc.player.method3415();
      if (var4 != this.mc.player && var4.canPassengerSteer()) {
         var4.setPositionAndRotation(var1.method17401(), var1.method17402(), var1.method17403(), var1.method17404(), var1.method17405());
         this.field23269.sendPacket(new CMoveVehiclePacket(var4));
      }
   }

   @Override
   public void handleOpenBookPacket(SOpenBookWindowPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);
      ItemStack var4 = this.mc.player.getHeldItem(var1.method17327());
      if (var4.getItem() == Items.field38048) {
         this.mc.displayGuiScreen(new Class870(new Class7501(var4)));
      }
   }

   @Override
   public void handleCustomPayload(SCustomPayloadPlayPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);
      ResourceLocation var4 = var1.method17393();
      PacketBuffer var5 = null;

      try {
         var5 = var1.method17394();
         if (SCustomPayloadPlayPacket.field24537.equals(var4)) {
            this.mc.player.method5394(var5.readString(32767));
         } else if (SCustomPayloadPlayPacket.field24538.equals(var4)) {
            int var6 = var5.readInt();
            float var7 = var5.readFloat();
            Class8238 var8 = Class8238.method28711(var5);
            this.mc.debugRenderer.field34466.method15902(var6, var8, var7);
         } else if (SCustomPayloadPlayPacket.field24539.equals(var4)) {
            long var9 = var5.readVarLong();
            BlockPos var62 = var5.readBlockPos();
            ((Class5132)this.mc.debugRenderer.field34471).method15869(var9, var62);
         } else if (SCustomPayloadPlayPacket.field24540.equals(var4)) {
            BlockPos var42 = var5.readBlockPos();
            int var52 = var5.readInt();
            ArrayList var63 = Lists.newArrayList();
            ArrayList var11 = Lists.newArrayList();

            for (int var12 = 0; var12 < var52; var12++) {
               var63.add(var5.readBlockPos());
               var11.add(var5.readFloat());
            }

            this.mc.debugRenderer.field34472.method15868(var42, var63, var11);
         } else if (SCustomPayloadPlayPacket.field24541.equals(var4)) {
            DimensionType var43 = this.field23287.method32454().getOrDefault(var5.readResourceLocation());
            MutableBoundingBox var53 = new MutableBoundingBox(var5.readInt(), var5.readInt(), var5.readInt(), var5.readInt(), var5.readInt(), var5.readInt());
            int var64 = var5.readInt();
            ArrayList var73 = Lists.newArrayList();
            ArrayList var78 = Lists.newArrayList();

            for (int var13 = 0; var13 < var64; var13++) {
               var73.add(new MutableBoundingBox(var5.readInt(), var5.readInt(), var5.readInt(), var5.readInt(), var5.readInt(), var5.readInt()));
               var78.add(var5.readBoolean());
            }

            this.mc.debugRenderer.field34473.method15815(var53, var73, var78, var43);
         } else if (SCustomPayloadPlayPacket.field24542.equals(var4)) {
            ((Class5134)this.mc.debugRenderer.field34475)
               .method15901(var5.readBlockPos(), var5.readFloat(), var5.readFloat(), var5.readFloat(), var5.readFloat(), var5.readFloat());
         } else if (SCustomPayloadPlayPacket.field24546.equals(var4)) {
            int var44 = var5.readInt();

            for (int var54 = 0; var54 < var44; var54++) {
               this.mc.debugRenderer.field34479.method15817(var5.readSectionPos());
            }

            int var55 = var5.readInt();

            for (int var65 = 0; var65 < var55; var65++) {
               this.mc.debugRenderer.field34479.method15818(var5.readSectionPos());
            }
         } else if (SCustomPayloadPlayPacket.field24544.equals(var4)) {
            BlockPos var45 = var5.readBlockPos();
            String var56 = var5.readString();
            int var66 = var5.readInt();
            Class9321 var74 = new Class9321(var45, var56, var66);
            this.mc.debugRenderer.field34478.method15871(var74);
         } else if (SCustomPayloadPlayPacket.field24545.equals(var4)) {
            BlockPos var46 = var5.readBlockPos();
            this.mc.debugRenderer.field34478.method15872(var46);
         } else if (SCustomPayloadPlayPacket.field24543.equals(var4)) {
            BlockPos var47 = var5.readBlockPos();
            int var57 = var5.readInt();
            this.mc.debugRenderer.field34478.method15873(var47, var57);
         } else if (SCustomPayloadPlayPacket.field24547.equals(var4)) {
            BlockPos var48 = var5.readBlockPos();
            int var58 = var5.readInt();
            int var67 = var5.readInt();
            ArrayList var75 = Lists.newArrayList();

            for (int var79 = 0; var79 < var67; var79++) {
               int var81 = var5.readInt();
               boolean var14 = var5.readBoolean();
               String var15 = var5.readString(255);
               var75.add(new Class4231(var48, var81, var15, var14));
            }

            this.mc.debugRenderer.field34482.method15822(var58, var75);
         } else if (SCustomPayloadPlayPacket.field24553.equals(var4)) {
            int var49 = var5.readInt();
            ArrayList var59 = Lists.newArrayList();

            for (int var68 = 0; var68 < var49; var68++) {
               var59.add(var5.readBlockPos());
            }

            this.mc.debugRenderer.field34481.method15863(var59);
         } else if (SCustomPayloadPlayPacket.field24548.equals(var4)) {
            double var71 = var5.readDouble();
            double var16 = var5.readDouble();
            double var18 = var5.readDouble();
            Class2959 var83 = new Class2959(var71, var16, var18);
            UUID var85 = var5.readUniqueId();
            int var20 = var5.readInt();
            String var21 = var5.readString();
            String var22 = var5.readString();
            int var23 = var5.readInt();
            float var24 = var5.readFloat();
            float var25 = var5.readFloat();
            String var26 = var5.readString();
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
               String var33 = var5.readString();
               var30.field40373.add(var33);
            }

            int var103 = var5.readInt();

            for (int var105 = 0; var105 < var103; var105++) {
               String var34 = var5.readString();
               var30.field40374.add(var34);
            }

            int var106 = var5.readInt();

            for (int var107 = 0; var107 < var106; var107++) {
               String var35 = var5.readString();
               var30.field40375.add(var35);
            }

            int var108 = var5.readInt();

            for (int var109 = 0; var109 < var108; var109++) {
               BlockPos var36 = var5.readBlockPos();
               var30.field40377.add(var36);
            }

            int var110 = var5.readInt();

            for (int var111 = 0; var111 < var110; var111++) {
               BlockPos var37 = var5.readBlockPos();
               var30.field40378.add(var37);
            }

            int var112 = var5.readInt();

            for (int var113 = 0; var113 < var112; var113++) {
               String var38 = var5.readString();
               var30.field40376.add(var38);
            }

            this.mc.debugRenderer.field34478.method15874(var30);
         } else if (SCustomPayloadPlayPacket.field24549.equals(var4)) {
            double var72 = var5.readDouble();
            double var87 = var5.readDouble();
            double var88 = var5.readDouble();
            Class2959 var84 = new Class2959(var72, var87, var88);
            UUID var86 = var5.readUniqueId();
            int var89 = var5.readInt();
            boolean var90 = var5.readBoolean();
            BlockPos var91 = null;
            if (var90) {
               var91 = var5.readBlockPos();
            }

            boolean var92 = var5.readBoolean();
            BlockPos var93 = null;
            if (var92) {
               var93 = var5.readBlockPos();
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
               String var101 = var5.readString();
               var97.field30226.add(var101);
            }

            int var100 = var5.readInt();

            for (int var102 = 0; var102 < var100; var102++) {
               BlockPos var104 = var5.readBlockPos();
               var97.field30227.add(var104);
            }

            this.mc.debugRenderer.field34480.method15825(var97);
         } else if (SCustomPayloadPlayPacket.field24550.equals(var4)) {
            BlockPos var50 = var5.readBlockPos();
            String var60 = var5.readString();
            int var69 = var5.readInt();
            int var76 = var5.readInt();
            boolean var80 = var5.readBoolean();
            Class8974 var82 = new Class8974(var50, var60, var69, var76, var80, this.field23273.getGameTime());
            this.mc.debugRenderer.field34480.method15824(var82);
         } else if (SCustomPayloadPlayPacket.field24552.equals(var4)) {
            this.mc.debugRenderer.field34483.method15814();
         } else if (SCustomPayloadPlayPacket.field24551.equals(var4)) {
            BlockPos var51 = var5.readBlockPos();
            int var61 = var5.readInt();
            String var70 = var5.readString();
            int var77 = var5.readInt();
            this.mc.debugRenderer.field34483.method15907(var51, var61, var70, var77);
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
   public void handleScoreboardObjective(SScoreboardObjectivePacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);
      Scoreboard var4 = this.field23273.method6805();
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
   public void handleUpdateScore(SUpdateScorePacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);
      Scoreboard var4 = this.field23273.method6805();
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
   public void handleDisplayObjective(SDisplayObjectivePacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);
      Scoreboard var4 = this.field23273.method6805();
      String var5 = var1.method17647();
      Class8375 var6 = var5 != null ? var4.method20975(var5) : null;
      var4.method20988(var1.method17646(), var6);
   }

   @Override
   public void handleTeams(STeamsPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);
      Scoreboard var4 = this.field23273.method6805();
      ScorePlayerTeam var5;
      if (var1.getAction() != 0) {
         var5 = var4.method20990(var1.getName());
      } else {
         var5 = var4.method20991(var1.getName());
      }

      if (var1.getAction() == 0 || var1.getAction() == 2) {
         var5.method28570(var1.getDisplayName());
         var5.method28590(var1.getColor());
         var5.method28589(var1.getFriendlyFlags());
         Team.Visible var6 = Team.Visible.getByName(var1.getNameTagVisibility());
         if (var6 != null) {
            var5.method28584(var6);
         }

         Team.CollisionRule var7 = Team.CollisionRule.getByName(var1.getCollisionRule());
         if (var7 != null) {
            var5.method28587(var7);
         }

         var5.method28571(var1.getPrefix());
         var5.method28573(var1.getSuffix());
      }

      if (var1.getAction() == 0 || var1.getAction() == 3) {
         for (String var10 : var1.getPlayers()) {
            var4.method20993(var10, var5);
         }
      }

      if (var1.getAction() == 4) {
         for (String var11 : var1.getPlayers()) {
            var4.method20995(var11, var5);
         }
      }

      if (var1.getAction() == 1) {
         var4.method20992(var5);
      }
   }

   @Override
   public void handleParticles(SSpawnParticlePacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);
      if (var1.getParticleCount() == 0) {
         double var4 = (double)(var1.getParticleSpeed() * var1.getXOffset());
         double var6 = (double)(var1.getParticleSpeed() * var1.getYOffset());
         double var8 = (double)(var1.getParticleSpeed() * var1.getZOffset());

         try {
            this.field23273.method6747(var1.getParticle(), var1.getLongDistanceGirlfriend(), var1.getX(), var1.getY(), var1.getZ(), var4, var6, var8);
         } catch (Throwable var26) {
            field23267.warn("Could not spawn particle effect {}", var1.getParticle());
         }
      } else {
         for (int var11 = 0; var11 < var1.getParticleCount(); var11++) {
            double var12 = this.field23282.nextGaussian() * (double)var1.getXOffset();
            double var14 = this.field23282.nextGaussian() * (double)var1.getYOffset();
            double var16 = this.field23282.nextGaussian() * (double)var1.getZOffset();
            double var18 = this.field23282.nextGaussian() * (double)var1.getParticleSpeed();
            double var20 = this.field23282.nextGaussian() * (double)var1.getParticleSpeed();
            double var22 = this.field23282.nextGaussian() * (double)var1.getParticleSpeed();

            try {
               this.field23273
                  .method6747(
                     var1.getParticle(),
                     var1.getLongDistanceGirlfriend(),
                     var1.getX() + var12,
                     var1.getY() + var14,
                     var1.getZ() + var16,
                     var18,
                     var20,
                     var22
                  );
            } catch (Throwable var25) {
               field23267.warn("Could not spawn particle effect {}", var1.getParticle());
               return;
            }
         }
      }
   }

   @Override
   public void handleEntityProperties(SEntityPropertiesPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);
      Entity var4 = this.field23273.getEntityByID(var1.method17463());
      if (var4 != null) {
         if (!(var4 instanceof LivingEntity)) {
            throw new IllegalStateException("Server tried to update attributes of a non-living entity (actually: " + var4 + ")");
         }

         AttributeModifierManager var5 = ((LivingEntity)var4).getAttributeManager();

         for (SEntityPropertiesPacket.Snapshot var7 : var1.method17464()) {
            ModifiableAttributeInstance var8 = var5.createInstanceIfAbsent(var7.func_240834_a_());
            if (var8 != null) {
               var8.method38661(var7.getBaseValue());
               var8.method38673();

               for (AttributeModifier var10 : var7.getModifiers()) {
                  var8.applyNonPersistentModifier(var10);
               }
            } else {
               field23267.warn("Entity {} does not have attribute {}", var4, Registry.ATTRIBUTE.getKey(var7.func_240834_a_()));
            }
         }
      }
   }

   @Override
   public void handlePlaceGhostRecipe(SPlaceGhostRecipePacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);
      Container var4 = this.mc.player.openContainer;
      if (var4.windowId == var1.method17564() && var4.getCanCraft(this.mc.player)) {
         this.field23284.method1035(var1.method17563()).ifPresent(var2 -> {
            if (this.mc.currentScreen instanceof Class854) {
               Class1254 var5 = ((Class854)this.mc.currentScreen).method2632();
               var5.method5858((IRecipe<?>)var2, var4.inventorySlots);
            }
         });
      }
   }

   @Override
   public void handleUpdateLight(SUpdateLightPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);
      int var4 = var1.method17360();
      int var5 = var1.method17361();
      WorldLightManager var6 = this.field23273.getChunkProvider().getLightManager();
      int var7 = var1.method17362();
      int var8 = var1.method17363();
      Iterator var9 = var1.method17364().iterator();
      this.method15789(var4, var5, var6, LightType.SKY, var7, var8, var9, var1.method17368());
      int var10 = var1.method17365();
      int var11 = var1.method17366();
      Iterator var12 = var1.method17367().iterator();
      this.method15789(var4, var5, var6, LightType.BLOCK, var10, var11, var12, var1.method17368());
   }

   @Override
   public void handleMerchantOffers(SMerchantOffersPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);
      Container var4 = this.mc.player.openContainer;
      if (var1.method17309() == var4.windowId && var4 instanceof Class5826) {
         ((Class5826)var4).method18216(new Class46(var1.method17310().method166()));
         ((Class5826)var4).method18207(var1.method17312());
         ((Class5826)var4).method18209(var1.method17311());
         ((Class5826)var4).method18203(var1.method17313());
         ((Class5826)var4).method18210(var1.method17314());
      }
   }

   @Override
   public void handleUpdateViewDistancePacket(SUpdateViewDistancePacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);
      this.field23281 = var1.method17306();
      this.field23273.getChunkProvider().method7403(var1.method17306());
   }

   @Override
   public void handleChunkPositionPacket(SUpdateChunkPositionPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);
      this.field23273.getChunkProvider().setCenter(var1.method17522(), var1.method17523());
   }

   @Override
   public void handleAcknowledgePlayerDigging(SPlayerDiggingPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.mc);
      this.mc.playerController.acknowledgePlayerDiggingReceived(this.field23273, var1.method17557(), var1.method17556(), var1.method17559(), var1.method17558());
   }

   private void method15789(int var1, int var2, WorldLightManager var3, LightType var4, int var5, int var6, Iterator<byte[]> var7, boolean var8) {
      for (int var11 = 0; var11 < 18; var11++) {
         int var12 = -1 + var11;
         boolean var13 = (var5 & 1 << var11) != 0;
         boolean var14 = (var6 & 1 << var11) != 0;
         if (var13 || var14) {
            var3.method606(var4, SectionPos.of(var1, var12, var2), !var13 ? new NibbleArray() : new NibbleArray((byte[])((byte[])var7.next()).clone()), var8);
            this.field23273.method6868(var1, var12, var2);
         }
      }
   }

   @Override
   public NetworkManager getNetworkManager() {
      return this.field23269;
   }

   public Collection<NetworkPlayerInfo> method15790() {
      return this.field23276.values();
   }

   public Collection<UUID> method15791() {
      return this.field23276.keySet();
   }

   @Nullable
   public NetworkPlayerInfo method15792(UUID var1) {
      return this.field23276.get(var1);
   }

   @Nullable
   public NetworkPlayerInfo method15793(String var1) {
      for (NetworkPlayerInfo var5 : this.field23276.values()) {
         if (var5.method19966().getName().equals(var1)) {
            return var5;
         }
      }

      return null;
   }

   public GameProfile method15794() {
      return this.field23270;
   }

   public Class8730 getAdvancementManager() {
      return this.field23277;
   }

   public CommandDispatcher<ISuggestionProvider> method15796() {
      return this.field23283;
   }

   public ClientWorld method15797() {
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

   public Set<RegistryKey<World>> method15801() {
      return this.field23286;
   }

   public DynamicRegistries method15802() {
      return this.field23287;
   }
}
