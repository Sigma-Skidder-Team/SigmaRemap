package mapped;

import com.google.common.collect.Lists;
import net.minecraft.block.BlockState;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.play.server.SUpdateTileEntityPacket;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;

public class Class965 extends TileEntity {
   private ResourceLocation field5409 = new ResourceLocation("empty");
   private ResourceLocation field5410 = new ResourceLocation("empty");
   private ResourceLocation field5411 = new ResourceLocation("empty");
   private Class92 field5412 = Class92.field237;
   private String field5413 = "minecraft:air";

   public Class965(Class4387<?> var1) {
      super(var1);
   }

   public Class965() {
      this(Class4387.field21451);
   }

   public ResourceLocation method3978() {
      return this.field5409;
   }

   public ResourceLocation method3979() {
      return this.field5410;
   }

   public ResourceLocation method3980() {
      return this.field5411;
   }

   public String method3981() {
      return this.field5413;
   }

   public Class92 method3982() {
      return this.field5412;
   }

   public void method3983(ResourceLocation var1) {
      this.field5409 = var1;
   }

   public void method3984(ResourceLocation var1) {
      this.field5410 = var1;
   }

   public void method3985(ResourceLocation var1) {
      this.field5411 = var1;
   }

   public void method3986(String var1) {
      this.field5413 = var1;
   }

   public void method3987(Class92 var1) {
      this.field5412 = var1;
   }

   @Override
   public CompoundNBT write(CompoundNBT var1) {
      super.write(var1);
      var1.method109("name", this.field5409.toString());
      var1.method109("target", this.field5410.toString());
      var1.method109("pool", this.field5411.toString());
      var1.method109("final_state", this.field5413);
      var1.method109("joint", this.field5412.method257());
      return var1;
   }

   @Override
   public void method3645(BlockState var1, CompoundNBT var2) {
      super.method3645(var1, var2);
      this.field5409 = new ResourceLocation(var2.method126("name"));
      this.field5410 = new ResourceLocation(var2.method126("target"));
      this.field5411 = new ResourceLocation(var2.method126("pool"));
      this.field5413 = var2.method126("final_state");
      this.field5412 = Class92.method269(var2.method126("joint"))
         .orElseGet(() -> !Class3249.method11675(var1).method544().method324() ? Class92.field237 : Class92.field238);
   }

   @Nullable
   @Override
   public SUpdateTileEntityPacket method3776() {
      return new SUpdateTileEntityPacket(this.field5325, 12, this.method3777());
   }

   @Override
   public CompoundNBT method3777() {
      return this.write(new CompoundNBT());
   }

   public void method3988(ServerWorld var1, int var2, boolean var3) {
      ChunkGenerator var6 = var1.getChunkProvider().method7370();
      Class8761 var7 = var1.method6938();
      Class7480 var8 = var1.method6893();
      Random var9 = var1.method6814();
      BlockPos var10 = this.getPos();
      List<Class4193> var11 = Lists.newArrayList();
      Class8969 var12 = new Class8969();
      var12.method32889(var1, var10, new BlockPos(1, 1, 1), false, (Block)null);
      Class7488 var13 = new Class7488(var12);
      Class4193 var14 = new Class4193(var7, var13, var10, 1, Class80.field185, new Class9764(var10, var10));
      Class8814.method31821(var1.method6867(), var14, var2, Class4193::new, var6, var7, var11, var9);

      for (Class4193 var16 : var11) {
         var16.method12976(var1, var8, var6, var9, Class9764.method38387(), var10, var3);
      }
   }
}
