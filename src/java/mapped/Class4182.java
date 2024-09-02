package mapped;

import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;

import java.util.Random;

public class Class4182 extends Class4180 {
   private final ResourceLocation field20458;
   private final Class80 field20459;

   public Class4182(Class8761 var1, ResourceLocation var2, BlockPos var3, Class80 var4) {
      super(Class7792.field33479, 0);
      this.field20458 = var2;
      this.field20455 = var3;
      this.field20459 = var4;
      this.method12946(var1);
   }

   public Class4182(Class8761 var1, CompoundNBT var2) {
      super(Class7792.field33479, var2);
      this.field20458 = new ResourceLocation(var2.getString("Template"));
      this.field20459 = Class80.valueOf(var2.getString("Rot"));
      this.method12946(var1);
   }

   private void method12946(Class8761 var1) {
      Class8969 var4 = var1.method31603(this.field20458);
      Class9463 var5 = new Class9463().method36426(this.field20459).method36425(Class2089.field13614).method36434(Class7095.field30528);
      this.method12943(var4, this.field20455, var5);
   }

   @Override
   public void method12897(CompoundNBT var1) {
      super.method12897(var1);
      var1.method109("Template", this.field20458.toString());
      var1.method109("Rot", this.field20459.name());
   }

   @Override
   public void method12944(String var1, BlockPos var2, Class1659 var3, Random var4, Class9764 var5) {
   }

   @Override
   public boolean method12896(ISeedReader var1, Class7480 var2, ChunkGenerator var3, Random var4, Class9764 var5, Class7481 var6, BlockPos var7) {
      var5.method38392(this.field20453.method32909(this.field20454, this.field20455));
      return super.method12896(var1, var2, var3, var4, var5, var6, var7);
   }
}
