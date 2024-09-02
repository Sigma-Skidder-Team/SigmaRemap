package mapped;

import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.ResourceLocation;

public class Class6946 extends Class6945<MinecraftServer, Class6862> {
   public Class6946() {
      super(new ResourceLocation("function_tag"), Class6862.class);
   }

   public void method21397(CompoundNBT var1, Class6862 var2) {
      var1.method109("Name", Class6862.method20909(var2).toString());
   }

   public Class6862 method21396(CompoundNBT var1) {
      ResourceLocation var4 = new ResourceLocation(var1.getString("Name"));
      return new Class6862(var4);
   }
}
