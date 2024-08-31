package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;

import javax.annotation.Nullable;

public class Class969 extends TileEntity {
   private boolean field5429;
   private boolean field5430;
   private boolean field5431;
   private boolean field5432;
   private final Class911 field5433 = new Class913(this);

   public Class969() {
      super(Class4387.field21442);
   }

   @Override
   public CompoundNBT write(CompoundNBT var1) {
      super.write(var1);
      this.field5433.method3560(var1);
      var1.method115("powered", this.method4011());
      var1.method115("conditionMet", this.method4016());
      var1.method115("auto", this.method4012());
      return var1;
   }

   @Override
   public void method3645(BlockState var1, CompoundNBT var2) {
      super.method3645(var1, var2);
      this.field5433.method3561(var2);
      this.field5429 = var2.method132("powered");
      this.field5431 = var2.method132("conditionMet");
      this.method4013(var2.method132("auto"));
   }

   @Nullable
   @Override
   public Class5610 method3776() {
      if (!this.method4018()) {
         return null;
      } else {
         this.method4019(false);
         CompoundNBT var3 = this.write(new CompoundNBT());
         return new Class5610(this.field5325, 2, var3);
      }
   }

   @Override
   public boolean method3783() {
      return true;
   }

   public Class911 method4009() {
      return this.field5433;
   }

   public void method4010(boolean var1) {
      this.field5429 = var1;
   }

   public boolean method4011() {
      return this.field5429;
   }

   public boolean method4012() {
      return this.field5430;
   }

   public void method4013(boolean var1) {
      boolean var4 = this.field5430;
      this.field5430 = var1;
      if (!var4 && var1 && !this.field5429 && this.field5324 != null && this.method4020() != Class2037.field13323) {
         this.method4015();
      }
   }

   public void method4014() {
      Class2037 var3 = this.method4020();
      if (var3 == Class2037.field13324 && (this.field5429 || this.field5430) && this.field5324 != null) {
         this.method4015();
      }
   }

   private void method4015() {
      Block var3 = this.method3775().getBlock();
      if (var3 instanceof Class3355) {
         this.method4017();
         this.field5324.method6860().method20726(this.field5325, var3, 1);
      }
   }

   public boolean method4016() {
      return this.field5431;
   }

   public boolean method4017() {
      this.field5431 = true;
      if (this.method4021()) {
         BlockPos var3 = this.field5325.method8349(this.field5324.getBlockState(this.field5325).<Direction>method23463(Class3355.field18893).method536());
         if (!(this.field5324.getBlockState(var3).getBlock() instanceof Class3355)) {
            this.field5431 = false;
         } else {
            TileEntity var4 = this.field5324.getTileEntity(var3);
            this.field5431 = var4 instanceof Class969 && ((Class969)var4).method4009().method3557() > 0;
         }
      }

      return this.field5431;
   }

   public boolean method4018() {
      return this.field5432;
   }

   public void method4019(boolean var1) {
      this.field5432 = var1;
   }

   public Class2037 method4020() {
      BlockState var3 = this.method3775();
      if (!var3.method23448(Blocks.COMMAND_BLOCK)) {
         if (!var3.method23448(Blocks.field36887)) {
            return !var3.method23448(Blocks.field36888) ? Class2037.field13325 : Class2037.field13323;
         } else {
            return Class2037.field13324;
         }
      } else {
         return Class2037.field13325;
      }
   }

   public boolean method4021() {
      BlockState var3 = this.field5324.getBlockState(this.getPos());
      return !(var3.getBlock() instanceof Class3355) ? false : var3.<Boolean>method23463(Class3355.field18894);
   }

   @Override
   public void method3779() {
      this.method3780();
      super.method3779();
   }
}
