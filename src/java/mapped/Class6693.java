package mapped;

import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.ResourceLocation;

public class Class6693 extends Class6691 {
   private final CompoundNBT field29314;

   public Class6693() {
      super(1);
      this.field29314 = new CompoundNBT();
      this.field29314.method109("id", "minecraft:pig");
   }

   public Class6693(CompoundNBT var1) {
      this(!var1.contains("Weight", 99) ? 1 : var1.getInt("Weight"), var1.getCompound("Entity"));
   }

   public Class6693(int var1, CompoundNBT var2) {
      super(var1);
      this.field29314 = var2;
      ResourceLocation var5 = ResourceLocation.method8289(var2.getString("id"));
      if (var5 == null) {
         var2.method109("id", "minecraft:pig");
      } else {
         var2.method109("id", var5.toString());
      }
   }

   public CompoundNBT method20413() {
      CompoundNBT var3 = new CompoundNBT();
      var3.put("Entity", this.field29314);
      var3.putInt("Weight", this.field29309);
      return var3;
   }

   public CompoundNBT method20414() {
      return this.field29314;
   }
}
