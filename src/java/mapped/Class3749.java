package mapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.GameRules;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;
import java.util.List;

public class Class3749 extends Class3676<Class1042> {
   private static String[] field19896;
   private BlockPos field19897;
   private long field19898;
   private int field19899;
   private final List<BlockPos> field19900 = Lists.newArrayList();

   public Class3749() {
      super(ImmutableMap.of(Class8830.field39825, Class2217.field14485, Class8830.field39824, Class2217.field14485, Class8830.field39817, Class2217.field14484));
   }

   public boolean method12508(ServerWorld var1, Class1042 var2) {
      if (!var1.getGameRules().getBoolean(GameRules.field24224)) {
         return false;
      } else if (var2.method4674().method26571() != Class8395.field36016) {
         return false;
      } else {
         BlockPos.Mutable var5 = var2.getPosition().method8354();
         this.field19900.clear();

         for (int var6 = -1; var6 <= 1; var6++) {
            for (int var7 = -1; var7 <= 1; var7++) {
               for (int var8 = -1; var8 <= 1; var8++) {
                  var5.method8373(var2.getPosX() + (double)var6, var2.getPosY() + (double)var7, var2.getPosZ() + (double)var8);
                  if (this.method12711(var5, var1)) {
                     this.field19900.add(new BlockPos(var5));
                  }
               }
            }
         }

         this.field19897 = this.method12710(var1);
         return this.field19897 != null;
      }
   }

   @Nullable
   private BlockPos method12710(ServerWorld var1) {
      return !this.field19900.isEmpty() ? this.field19900.get(var1.method6814().nextInt(this.field19900.size())) : null;
   }

   private boolean method12711(BlockPos var1, ServerWorld var2) {
      BlockState var5 = var2.getBlockState(var1);
      Block var6 = var5.getBlock();
      Block var7 = var2.getBlockState(var1.down()).getBlock();
      return var6 instanceof Class3480 && ((Class3480)var6).method12179(var5) || var5.isAir() && var7 instanceof Class3221;
   }

   public void method12502(ServerWorld var1, Class1042 var2, long var3) {
      if (var3 > this.field19898 && this.field19897 != null) {
         var2.getBrain().method21406(Class8830.field39825, new Class7863(this.field19897));
         var2.getBrain().method21406(Class8830.field39824, new Class8999(new Class7863(this.field19897), 0.5F, 1));
      }
   }

   public void method12506(ServerWorld var1, Class1042 var2, long var3) {
      var2.getBrain().method21405(Class8830.field39825);
      var2.getBrain().method21405(Class8830.field39824);
      this.field19899 = 0;
      this.field19898 = var3 + 40L;
   }

   public void method12504(ServerWorld var1, Class1042 var2, long var3) {
      if (this.field19897 == null || this.field19897.method8317(var2.getPositionVec(), 1.0)) {
         if (this.field19897 != null && var3 > this.field19898) {
            BlockState var7 = var1.getBlockState(this.field19897);
            Block var8 = var7.getBlock();
            Block var9 = var1.getBlockState(this.field19897.down()).getBlock();
            if (var8 instanceof Class3480 && ((Class3480)var8).method12179(var7)) {
               var1.destroyBlock(this.field19897, true, var2);
            }

            if (var7.isAir() && var9 instanceof Class3221 && var2.method4712()) {
               Class927 var10 = var2.method4752();

               for (int var11 = 0; var11 < var10.getSizeInventory(); var11++) {
                  ItemStack var12 = var10.getStackInSlot(var11);
                  boolean var13 = false;
                  if (!var12.isEmpty()) {
                     if (var12.getItem() != Items.field37841) {
                        if (var12.getItem() != Items.field38053) {
                           if (var12.getItem() != Items.field38052) {
                              if (var12.getItem() == Items.field38112) {
                                 var1.setBlockState(this.field19897, Blocks.field36884.getDefaultState(), 3);
                                 var13 = true;
                              }
                           } else {
                              var1.setBlockState(this.field19897, Blocks.field36693.getDefaultState(), 3);
                              var13 = true;
                           }
                        } else {
                           var1.setBlockState(this.field19897, Blocks.field36694.getDefaultState(), 3);
                           var13 = true;
                        }
                     } else {
                        var1.setBlockState(this.field19897, Blocks.field36539.getDefaultState(), 3);
                        var13 = true;
                     }
                  }

                  if (var13) {
                     var1.playSound(
                        (PlayerEntity)null,
                        (double)this.field19897.getX(),
                        (double)this.field19897.getY(),
                        (double)this.field19897.getZ(),
                        SoundEvents.field26486,
                        SoundCategory.field14732,
                        1.0F,
                        1.0F
                     );
                     var12.shrink(1);
                     if (var12.isEmpty()) {
                        var10.setInventorySlotContents(var11, ItemStack.EMPTY);
                     }
                     break;
                  }
               }
            }

            if (var8 instanceof Class3480 && !((Class3480)var8).method12179(var7)) {
               this.field19900.remove(this.field19897);
               this.field19897 = this.method12710(var1);
               if (this.field19897 != null) {
                  this.field19898 = var3 + 20L;
                  var2.getBrain().method21406(Class8830.field39824, new Class8999(new Class7863(this.field19897), 0.5F, 1));
                  var2.getBrain().method21406(Class8830.field39825, new Class7863(this.field19897));
               }
            }
         }

         this.field19899++;
      }
   }

   public boolean method12499(ServerWorld var1, Class1042 var2, long var3) {
      return this.field19899 < 200;
   }
}
