package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

import javax.annotation.Nullable;
import java.util.Random;

public class Class934 extends TileEntity implements INameable, ITickableTileEntity {
   public int field5281;
   public float field5282;
   public float field5283;
   public float field5284;
   public float field5285;
   public float field5286;
   public float field5287;
   public float field5288;
   public float field5289;
   public float field5290;
   private static final Random field5291 = new Random();
   private ITextComponent field5292;

   public Class934() {
      super(TileEntityType.field21432);
   }

   @Override
   public CompoundNBT write(CompoundNBT var1) {
      super.write(var1);
      if (this.method3381()) {
         var1.putString("CustomName", ITextComponent.Serializer.toJson(this.field5292));
      }

      return var1;
   }

   @Override
   public void read(BlockState var1, CompoundNBT var2) {
      super.read(var1, var2);
      if (var2.contains("CustomName", 8)) {
         this.field5292 = ITextComponent.Serializer.getComponentFromJson(var2.getString("CustomName"));
      }
   }

   @Override
   public void tick() {
      this.field5287 = this.field5286;
      this.field5289 = this.field5288;
      PlayerEntity var3 = this.world
         .method7186(
            (double)this.pos.getX() + 0.5, (double)this.pos.getY() + 0.5, (double)this.pos.getZ() + 0.5, 3.0, false
         );
      if (var3 == null) {
         this.field5290 += 0.02F;
         this.field5286 -= 0.1F;
      } else {
         double var4 = var3.getPosX() - ((double)this.pos.getX() + 0.5);
         double var6 = var3.getPosZ() - ((double)this.pos.getZ() + 0.5);
         this.field5290 = (float) MathHelper.method37814(var6, var4);
         this.field5286 += 0.1F;
         if (this.field5286 < 0.5F || field5291.nextInt(40) == 0) {
            float var8 = this.field5284;

          /*  while (true) {
               this.field5284 = this.field5284 + (float)(field5291.nextInt(4) - field5291.nextInt(4));
               if (var8 == this.field5284) {
                  continue;
               }
            }*/
         }
      }

      while (this.field5288 >= (float) Math.PI) {
         this.field5288 -= (float) (Math.PI * 2);
      }

      while (this.field5288 < (float) -Math.PI) {
         this.field5288 += (float) (Math.PI * 2);
      }

      while (this.field5290 >= (float) Math.PI) {
         this.field5290 -= (float) (Math.PI * 2);
      }

      while (this.field5290 < (float) -Math.PI) {
         this.field5290 += (float) (Math.PI * 2);
      }

      float var9 = this.field5290 - this.field5288;

      while (var9 >= (float) Math.PI) {
         var9 -= (float) (Math.PI * 2);
      }

      while (var9 < (float) -Math.PI) {
         var9 += (float) (Math.PI * 2);
      }

      this.field5288 += var9 * 0.4F;
      this.field5286 = MathHelper.clamp(this.field5286, 0.0F, 1.0F);
      this.field5281++;
      this.field5283 = this.field5282;
      float var10 = (this.field5284 - this.field5282) * 0.4F;
      float var11 = 0.2F;
      var10 = MathHelper.clamp(var10, -0.2F, 0.2F);
      this.field5285 = this.field5285 + (var10 - this.field5285) * 0.9F;
      this.field5282 = this.field5282 + this.field5285;
   }

   @Override
   public ITextComponent getName() {
      return (ITextComponent)(this.field5292 == null ? new TranslationTextComponent("container.enchant") : this.field5292);
   }

   public void method3698(ITextComponent var1) {
      this.field5292 = var1;
   }

   @Nullable
   @Override
   public ITextComponent method3380() {
      return this.field5292;
   }
}
