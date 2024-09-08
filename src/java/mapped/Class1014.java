package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.world.World;

public abstract class Class1014 extends TameableEntity {
   private int field5671;

   public Class1014(EntityType<? extends Class1014> var1, World var2) {
      super(var1, var2);
   }

   public boolean method4404(ServerPlayerEntity var1) {
      CompoundNBT var4 = new CompoundNBT();
      var4.method109("id", this.method3297());
      this.method3294(var4);
      if (!var1.method2948(var4)) {
         return false;
      } else {
         this.method2904();
         return true;
      }
   }

   @Override
   public void tick() {
      this.field5671++;
      super.tick();
   }

   public boolean method4405() {
      return this.field5671 > 100;
   }
}
