package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.Direction;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

import javax.annotation.Nullable;
import java.util.List;
import java.util.stream.IntStream;

public class Class940 extends Class939 implements Class930, Class935 {
   private static final int[] field5304 = IntStream.range(0, 27).toArray();
   private NonNullList<ItemStack> field5305 = NonNullList.<ItemStack>method68(27, ItemStack.EMPTY);
   private int field5306;
   private Class2126 field5307 = Class2126.field13872;
   private float field5308;
   private float field5309;
   private Class112 field5310;
   private boolean field5311;

   public Class940(Class112 var1) {
      super(TileEntityType.field21443);
      this.field5310 = var1;
   }

   public Class940() {
      this((Class112)null);
      this.field5311 = true;
   }

   @Override
   public void method3647() {
      this.method3745();
      if (this.field5307 == Class2126.field13873 || this.field5307 == Class2126.field13875) {
         this.method3750();
      }
   }

   public void method3745() {
      this.field5309 = this.field5308;
      switch (Class9671.field45162[this.field5307.ordinal()]) {
         case 1:
            this.field5308 = 0.0F;
            break;
         case 2:
            this.field5308 += 0.1F;
            if (this.field5308 >= 1.0F) {
               this.method3750();
               this.field5307 = Class2126.field13874;
               this.field5308 = 1.0F;
               this.method3752();
            }
            break;
         case 3:
            this.field5308 -= 0.1F;
            if (this.field5308 <= 0.0F) {
               this.field5307 = Class2126.field13872;
               this.field5308 = 0.0F;
               this.method3752();
            }
            break;
         case 4:
            this.field5308 = 1.0F;
      }
   }

   public Class2126 method3746() {
      return this.field5307;
   }

   public AxisAlignedBB method3747(BlockState var1) {
      return this.method3748(var1.<Direction>method23463(Class3368.field18939));
   }

   public AxisAlignedBB method3748(Direction var1) {
      float var4 = this.method3755(1.0F);
      return VoxelShapes.method27426()
         .method19514()
         .method19662(
            (double)(0.5F * var4 * (float)var1.method539()), (double)(0.5F * var4 * (float)var1.method540()), (double)(0.5F * var4 * (float)var1.method541())
         );
   }

   private AxisAlignedBB method3749(Direction var1) {
      Direction var4 = var1.method536();
      return this.method3748(var1).method19660((double)var4.method539(), (double)var4.method540(), (double)var4.method541());
   }

   private void method3750() {
      BlockState var3 = this.field5324.getBlockState(this.getPos());
      if (var3.getBlock() instanceof Class3368) {
         Direction var4 = var3.<Direction>method23463(Class3368.field18939);
         AxisAlignedBB var5 = this.method3749(var4).method19668(this.field5325);
         List var6 = this.field5324.method7181((Entity)null, var5);
         if (!var6.isEmpty()) {
            for (int var7 = 0; var7 < var6.size(); var7++) {
               Entity var8 = (Entity)var6.get(var7);
               if (var8.method3422() != Class2315.field15865) {
                  double var9 = 0.0;
                  double var11 = 0.0;
                  double var13 = 0.0;
                  AxisAlignedBB var15 = var8.getBoundingBox();
                  switch (Class9671.field45163[var4.getAxis().ordinal()]) {
                     case 1:
                        if (var4.getAxisDirection() == Class1892.field11092) {
                           var9 = var5.maxX - var15.minX;
                        } else {
                           var9 = var15.maxX - var5.minX;
                        }

                        var9 += 0.01;
                        break;
                     case 2:
                        if (var4.getAxisDirection() == Class1892.field11092) {
                           var11 = var5.maxY - var15.minY;
                        } else {
                           var11 = var15.maxY - var5.minY;
                        }

                        var11 += 0.01;
                        break;
                     case 3:
                        if (var4.getAxisDirection() == Class1892.field11092) {
                           var13 = var5.maxZ - var15.minZ;
                        } else {
                           var13 = var15.maxZ - var5.minZ;
                        }

                        var13 += 0.01;
                  }

                  var8.move(
                     MoverType.field13745, new Vector3d(var9 * (double)var4.method539(), var11 * (double)var4.method540(), var13 * (double)var4.method541())
                  );
               }
            }
         }
      }
   }

   @Override
   public int getSizeInventory() {
      return this.field5305.size();
   }

   @Override
   public boolean method3751(int var1, int var2) {
      if (var1 != 1) {
         return super.method3751(var1, var2);
      } else {
         this.field5306 = var2;
         if (var2 == 0) {
            this.field5307 = Class2126.field13875;
            this.method3752();
         }

         if (var2 == 1) {
            this.field5307 = Class2126.field13873;
            this.method3752();
         }

         return true;
      }
   }

   private void method3752() {
      this.method3775().method23424(this.method3734(), this.getPos(), 3);
   }

   @Override
   public void openInventory(PlayerEntity var1) {
      if (!var1.isSpectator()) {
         if (this.field5306 < 0) {
            this.field5306 = 0;
         }

         this.field5306++;
         this.field5324.method6787(this.field5325, this.method3775().getBlock(), 1, this.field5306);
         if (this.field5306 == 1) {
            this.field5324
               .method6742((PlayerEntity)null, this.field5325, SoundEvents.field27045, Class2266.field14732, 0.5F, this.field5324.rand.nextFloat() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   public void closeInventory(PlayerEntity var1) {
      if (!var1.isSpectator()) {
         this.field5306--;
         this.field5324.method6787(this.field5325, this.method3775().getBlock(), 1, this.field5306);
         if (this.field5306 <= 0) {
            this.field5324
               .method6742((PlayerEntity)null, this.field5325, SoundEvents.field27044, Class2266.field14732, 0.5F, this.field5324.rand.nextFloat() * 0.1F + 0.9F);
         }
      }
   }

   @Override
   public ITextComponent method3686() {
      return new TranslationTextComponent("container.shulkerBox");
   }

   @Override
   public void method3645(BlockState var1, CompoundNBT var2) {
      super.method3645(var1, var2);
      this.method3753(var2);
   }

   @Override
   public CompoundNBT write(CompoundNBT var1) {
      super.write(var1);
      return this.method3754(var1);
   }

   public void method3753(CompoundNBT var1) {
      this.field5305 = NonNullList.<ItemStack>method68(this.getSizeInventory(), ItemStack.EMPTY);
      if (!this.method3741(var1) && var1.contains("Items", 9)) {
         Class7920.method26567(var1, this.field5305);
      }
   }

   public CompoundNBT method3754(CompoundNBT var1) {
      if (!this.method3742(var1)) {
         Class7920.method26566(var1, this.field5305, false);
      }

      return var1;
   }

   @Override
   public NonNullList<ItemStack> method3724() {
      return this.field5305;
   }

   @Override
   public void method3725(NonNullList<ItemStack> var1) {
      this.field5305 = var1;
   }

   @Override
   public int[] method3653(Direction var1) {
      return field5304;
   }

   @Override
   public boolean method3654(int var1, ItemStack var2, Direction var3) {
      return !(Block.method11537(var2.getItem()) instanceof Class3368);
   }

   @Override
   public boolean method3655(int var1, ItemStack var2, Direction var3) {
      return true;
   }

   public float method3755(float var1) {
      return MathHelper.lerp(var1, this.field5309, this.field5308);
   }

   @Nullable
   public Class112 method3756() {
      if (this.field5311) {
         this.field5310 = Class3368.method11955(this.method3775().getBlock());
         this.field5311 = false;
      }

      return this.field5310;
   }

   @Override
   public Container method3690(int var1, PlayerInventory var2) {
      return new Class5814(var1, var2, this);
   }

   public boolean method3757() {
      return this.field5307 == Class2126.field13872;
   }

   @Override
   public ITextComponent method2954() {
      return new TranslationTextComponent("container.shulkerBox");
   }
}
