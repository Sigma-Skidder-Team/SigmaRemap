package mapped;

import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.ResourceLocation;

public class Class6944 extends Class6945<MinecraftServer, Class6860> {
   public Class6944() {
      super(new ResourceLocation("function"), Class6860.class);
   }

   public void method21397(CompoundNBT var1, Class6860 var2) {
      var1.putString("Name", Class6860.method20908(var2).toString());
   }

   public Class6860 method21396(CompoundNBT var1) {
      ResourceLocation var4 = new ResourceLocation(var1.getString("Name"));
      return new Class6860(var4);
   }
}
