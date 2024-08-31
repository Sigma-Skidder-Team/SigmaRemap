package mapped;

import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.EntityDataManager;

import java.util.Random;

public class Class6500 {
   private final EntityDataManager field28460;
   private final DataParameter<Integer> field28461;
   private final DataParameter<Boolean> field28462;
   public boolean field28463;
   public int field28464;
   public int field28465;

   public Class6500(EntityDataManager var1, DataParameter<Integer> var2, DataParameter<Boolean> var3) {
      this.field28460 = var1;
      this.field28461 = var2;
      this.field28462 = var3;
   }

   public void method19689() {
      this.field28463 = true;
      this.field28464 = 0;
      this.field28465 = this.field28460.<Integer>method35445(this.field28461);
   }

   public boolean method19690(Random var1) {
      if (!this.field28463) {
         this.field28463 = true;
         this.field28464 = 0;
         this.field28465 = var1.nextInt(841) + 140;
         this.field28460.method35446(this.field28461, this.field28465);
         return true;
      } else {
         return false;
      }
   }

   public void method19691(CompoundNBT var1) {
      var1.method115("Saddle", this.method19694());
   }

   public void method19692(CompoundNBT var1) {
      this.method19693(var1.method132("Saddle"));
   }

   public void method19693(boolean var1) {
      this.field28460.method35446(this.field28462, var1);
   }

   public boolean method19694() {
      return this.field28460.<Boolean>method35445(this.field28462);
   }
}
