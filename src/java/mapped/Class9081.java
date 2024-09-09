package mapped;

import java.util.Objects;

import net.minecraft.block.BlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.network.play.client.CPlayerDiggingPacket;
import net.minecraft.network.play.server.SPlayerListItemPacket;
import net.minecraft.network.play.server.SPlayerDiggingPacket;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class9081 {
   private static final Logger field41569 = LogManager.getLogger();
   public ServerWorld field41570;
   public ServerPlayerEntity field41571;
   private GameType field41572 = GameType.field11101;
   private GameType field41573 = GameType.field11101;
   private boolean field41574;
   private int field41575;
   private BlockPos field41576 = BlockPos.ZERO;
   private int field41577;
   private boolean field41578;
   private BlockPos field41579 = BlockPos.ZERO;
   private int field41580;
   private int field41581 = -1;

   public Class9081(ServerWorld var1) {
      this.field41570 = var1;
   }

   public void method33861(GameType var1) {
      this.method33862(var1, var1 == this.field41572 ? this.field41573 : this.field41572);
   }

   public void method33862(GameType var1, GameType var2) {
      this.field41573 = var2;
      this.field41572 = var1;
      var1.method8155(this.field41571.abilities);
      this.field41571.method2797();
      this.field41571.field4856.getPlayerList().method19456(new SPlayerListItemPacket(Class2176.field14282, this.field41571));
      this.field41570.method6902();
   }

   public GameType method33863() {
      return this.field41572;
   }

   public GameType method33864() {
      return this.field41573;
   }

   public boolean method33865() {
      return this.field41572.method8158();
   }

   public boolean method33866() {
      return this.field41572.isCreative();
   }

   public void method33867(GameType var1) {
      if (this.field41572 == GameType.field11101) {
         this.field41572 = var1;
      }

      this.method33861(this.field41572);
   }

   public void method33856() {
      this.field41577++;
      if (!this.field41578) {
         if (this.field41574) {
            BlockState var3 = this.field41570.getBlockState(this.field41576);
            if (!var3.isAir()) {
               this.method33868(var3, this.field41576, this.field41575);
            } else {
               this.field41570.sendBlockBreakProgress(this.field41571.getEntityId(), this.field41576, -1);
               this.field41581 = -1;
               this.field41574 = false;
            }
         }
      } else {
         BlockState var5 = this.field41570.getBlockState(this.field41579);
         if (!var5.isAir()) {
            float var4 = this.method33868(var5, this.field41579, this.field41580);
            if (var4 >= 1.0F) {
               this.field41578 = false;
               this.method33870(this.field41579);
            }
         } else {
            this.field41578 = false;
         }
      }
   }

   private float method33868(BlockState var1, BlockPos var2, int var3) {
      int var6 = this.field41577 - var3;
      float var7 = var1.method23406(this.field41571, this.field41571.world, var2) * (float)(var6 + 1);
      int var8 = (int)(var7 * 10.0F);
      if (var8 != this.field41581) {
         this.field41570.sendBlockBreakProgress(this.field41571.getEntityId(), var2, var8);
         this.field41581 = var8;
      }

      return var7;
   }

   public void method33858(BlockPos var1, CPlayerDiggingPacket.Action var2, Direction var3, int var4) {
      double var7 = this.field41571.getPosX() - ((double)var1.getX() + 0.5);
      double var9 = this.field41571.getPosY() - ((double)var1.getY() + 0.5) + 1.5;
      double var11 = this.field41571.getPosZ() - ((double)var1.getZ() + 0.5);
      double var13 = var7 * var7 + var9 * var9 + var11 * var11;
      if (!(var13 > 36.0)) {
         if (var1.getY() < var4) {
            if (var2 != CPlayerDiggingPacket.Action.START_DESTROY_BLOCK) {
               if (var2 != CPlayerDiggingPacket.Action.STOP_DESTROY_BLOCK) {
                  if (var2 == CPlayerDiggingPacket.Action.ABORT_DESTROY_BLOCK) {
                     this.field41574 = false;
                     if (!Objects.equals(this.field41576, var1)) {
                        field41569.warn("Mismatch in destroy block pos: " + this.field41576 + " " + var1);
                        this.field41570.sendBlockBreakProgress(this.field41571.getEntityId(), this.field41576, -1);
                        this.field41571
                           .field4855
                           .sendPacket(
                              new SPlayerDiggingPacket(this.field41576, this.field41570.getBlockState(this.field41576), var2, true, "aborted mismatched destroying")
                           );
                     }

                     this.field41570.sendBlockBreakProgress(this.field41571.getEntityId(), var1, -1);
                     this.field41571.field4855.sendPacket(new SPlayerDiggingPacket(var1, this.field41570.getBlockState(var1), var2, true, "aborted destroying"));
                  }
               } else {
                  if (var1.equals(this.field41576)) {
                     int var15 = this.field41577 - this.field41575;
                     BlockState var16 = this.field41570.getBlockState(var1);
                     if (!var16.isAir()) {
                        float var17 = var16.method23406(this.field41571, this.field41571.world, var1) * (float)(var15 + 1);
                        if (var17 >= 0.7F) {
                           this.field41574 = false;
                           this.field41570.sendBlockBreakProgress(this.field41571.getEntityId(), var1, -1);
                           this.method33869(var1, var2, "destroyed");
                           return;
                        }

                        if (!this.field41578) {
                           this.field41574 = false;
                           this.field41578 = true;
                           this.field41579 = var1;
                           this.field41580 = this.field41575;
                        }
                     }
                  }

                  this.field41571.field4855.sendPacket(new SPlayerDiggingPacket(var1, this.field41570.getBlockState(var1), var2, true, "stopped destroying"));
               }
            } else {
               if (!this.field41570.method6785(this.field41571, var1)) {
                  this.field41571.field4855.sendPacket(new SPlayerDiggingPacket(var1, this.field41570.getBlockState(var1), var2, false, "may not interact"));
                  return;
               }

               if (this.method33866()) {
                  this.method33869(var1, var2, "creative destroy");
                  return;
               }

               if (this.field41571.blockActionRestricted(this.field41570, var1, this.field41572)) {
                  this.field41571.field4855.sendPacket(new SPlayerDiggingPacket(var1, this.field41570.getBlockState(var1), var2, false, "block action restricted"));
                  return;
               }

               this.field41575 = this.field41577;
               float var18 = 1.0F;
               BlockState var19 = this.field41570.getBlockState(var1);
               if (!var19.isAir()) {
                  var19.method23436(this.field41570, var1, this.field41571);
                  var18 = var19.method23406(this.field41571, this.field41571.world, var1);
               }

               if (!var19.isAir() && var18 >= 1.0F) {
                  this.method33869(var1, var2, "insta mine");
               } else {
                  if (this.field41574) {
                     this.field41571
                        .field4855
                        .sendPacket(
                           new SPlayerDiggingPacket(
                              this.field41576,
                              this.field41570.getBlockState(this.field41576),
                              CPlayerDiggingPacket.Action.START_DESTROY_BLOCK,
                              false,
                              "abort destroying since another started (client insta mine, server disagreed)"
                           )
                        );
                  }

                  this.field41574 = true;
                  this.field41576 = var1.toImmutable();
                  int var20 = (int)(var18 * 10.0F);
                  this.field41570.sendBlockBreakProgress(this.field41571.getEntityId(), var1, var20);
                  this.field41571.field4855.sendPacket(new SPlayerDiggingPacket(var1, this.field41570.getBlockState(var1), var2, true, "actual start of destroying"));
                  this.field41581 = var20;
               }
            }
         } else {
            this.field41571.field4855.sendPacket(new SPlayerDiggingPacket(var1, this.field41570.getBlockState(var1), var2, false, "too high"));
         }
      } else {
         this.field41571.field4855.sendPacket(new SPlayerDiggingPacket(var1, this.field41570.getBlockState(var1), var2, false, "too far"));
      }
   }

   public void method33869(BlockPos var1, CPlayerDiggingPacket.Action var2, String var3) {
      if (!this.method33870(var1)) {
         this.field41571.field4855.sendPacket(new SPlayerDiggingPacket(var1, this.field41570.getBlockState(var1), var2, false, var3));
      } else {
         this.field41571.field4855.sendPacket(new SPlayerDiggingPacket(var1, this.field41570.getBlockState(var1), var2, true, var3));
      }
   }

   public boolean method33870(BlockPos var1) {
      BlockState var4 = this.field41570.getBlockState(var1);
      if (!this.field41571.getHeldItemMainhand().getItem().canPlayerBreakBlockWhileHolding(var4, this.field41570, var1, this.field41571)) {
         return false;
      } else {
         TileEntity var5 = this.field41570.getTileEntity(var1);
         Block var6 = var4.getBlock();
         if ((var6 instanceof CommandBlockBlock || var6 instanceof StructureBlock || var6 instanceof JigsawBlock) && !this.field41571.canUseCommandBlock()) {
            this.field41570.notifyBlockUpdate(var1, var4, var4, 3);
            return false;
         } else if (!this.field41571.blockActionRestricted(this.field41570, var1, this.field41572)) {
            var6.onBlockHarvested(this.field41570, var1, var4, this.field41571);
            boolean var7 = this.field41570.removeBlock(var1, false);
            if (var7) {
               var6.onPlayerDestroy(this.field41570, var1, var4);
            }

            if (!this.method33866()) {
               ItemStack var8 = this.field41571.getHeldItemMainhand();
               ItemStack var9 = var8.copy();
               boolean var10 = this.field41571.method2884(var4);
               var8.method32123(this.field41570, var4, var1, this.field41571);
               if (var7 && var10) {
                  var6.method11562(this.field41570, this.field41571, var1, var4, var5, var9);
               }

               return true;
            } else {
               return true;
            }
         } else {
            return false;
         }
      }
   }

   public ActionResultType method33859(ServerPlayerEntity var1, World var2, ItemStack var3, Hand var4) {
      if (this.field41572 != GameType.SPECTATOR) {
         if (!var1.method2976().method19635(var3.getItem())) {
            int var7 = var3.getCount();
            int var8 = var3.method32117();
            Class6794 var9 = var3.method32110(var2, var1, var4);
            ItemStack var10 = (ItemStack)var9.method20695();
            if (var10 == var3 && var10.getCount() == var7 && var10.method32137() <= 0 && var10.method32117() == var8) {
               return var9.method20694();
            } else if (var9.method20694() == ActionResultType.FAIL && var10.method32137() > 0 && !var1.isHandActive()) {
               return var9.method20694();
            } else {
               var1.setHeldItem(var4, var10);
               if (this.method33866()) {
                  var10.method32180(var7);
                  if (var10.method32115() && var10.method32117() != var8) {
                     var10.method32118(var8);
                  }
               }

               if (var10.isEmpty()) {
                  var1.setHeldItem(var4, ItemStack.EMPTY);
               }

               if (!var1.isHandActive()) {
                  var1.method2771(var1.container);
               }

               return var9.method20694();
            }
         } else {
            return ActionResultType.field14820;
         }
      } else {
         return ActionResultType.field14820;
      }
   }

   public ActionResultType method33860(ServerPlayerEntity var1, World var2, ItemStack var3, Hand var4, BlockRayTraceResult var5) {
      BlockPos var8 = var5.getPos();
      BlockState var9 = var2.getBlockState(var8);
      if (this.field41572 == GameType.SPECTATOR) {
         Class949 var16 = var9.method23445(var2, var8);
         if (var16 == null) {
            return ActionResultType.field14820;
         } else {
            var1.method2766(var16);
            return ActionResultType.SUCCESS;
         }
      } else {
         boolean var10 = !var1.getHeldItemMainhand().isEmpty() || !var1.method3091().isEmpty();
         boolean var11 = var1.method2851() && var10;
         ItemStack var12 = var3.copy();
         if (!var11) {
            ActionResultType var13 = var9.method23435(var2, var1, var4, var5);
            if (var13.isSuccessOrConsume()) {
               CriteriaTriggers.field44503.method15155(var1, var8, var12);
               return var13;
            }
         }

         if (!var3.isEmpty() && !var1.method2976().method19635(var3.getItem())) {
            ItemUseContext var17 = new ItemUseContext(var1, var4, var5);
            ActionResultType var14;
            if (!this.method33866()) {
               var14 = var3.onItemUse(var17);
            } else {
               int var15 = var3.getCount();
               var14 = var3.onItemUse(var17);
               var3.method32180(var15);
            }

            if (var14.isSuccessOrConsume()) {
               CriteriaTriggers.field44503.method15155(var1, var8, var12);
            }

            return var14;
         } else {
            return ActionResultType.field14820;
         }
      }
   }

   public void method33871(ServerWorld var1) {
      this.field41570 = var1;
   }
}
