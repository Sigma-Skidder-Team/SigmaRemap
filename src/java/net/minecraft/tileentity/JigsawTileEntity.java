package net.minecraft.tileentity;

import com.google.common.collect.Lists;
import mapped.*;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.play.server.SUpdateTileEntityPacket;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.structure.StructureManager;
import net.minecraft.world.gen.feature.template.TemplateManager;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;

public class JigsawTileEntity extends TileEntity {
   private ResourceLocation field5409 = new ResourceLocation("empty");
   private ResourceLocation field5410 = new ResourceLocation("empty");
   private ResourceLocation field5411 = new ResourceLocation("empty");
   private OrientationType field5412 = OrientationType.ROLLABLE;
   private String field5413 = "minecraft:air";

   public JigsawTileEntity(TileEntityType<?> var1) {
      super(var1);
   }

   public JigsawTileEntity() {
      this(TileEntityType.field21451);
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

   public OrientationType method3982() {
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

   public void method3987(OrientationType var1) {
      this.field5412 = var1;
   }

   @Override
   public CompoundNBT write(CompoundNBT var1) {
      super.write(var1);
      var1.putString("name", this.field5409.toString());
      var1.putString("target", this.field5410.toString());
      var1.putString("pool", this.field5411.toString());
      var1.putString("final_state", this.field5413);
      var1.putString("joint", this.field5412.getString());
      return var1;
   }

   @Override
   public void read(BlockState var1, CompoundNBT var2) {
      super.read(var1, var2);
      this.field5409 = new ResourceLocation(var2.getString("name"));
      this.field5410 = new ResourceLocation(var2.getString("target"));
      this.field5411 = new ResourceLocation(var2.getString("pool"));
      this.field5413 = var2.getString("final_state");
      this.field5412 = OrientationType.method269(var2.getString("joint"))
         .orElseGet(() -> !JigsawBlock.method11675(var1).getAxis().isHorizontal() ? OrientationType.ROLLABLE : OrientationType.ALIGNED);
   }

   @Nullable
   @Override
   public SUpdateTileEntityPacket method3776() {
      return new SUpdateTileEntityPacket(this.pos, 12, this.method3777());
   }

   @Override
   public CompoundNBT method3777() {
      return this.write(new CompoundNBT());
   }

   public void method3988(ServerWorld var1, int var2, boolean var3) {
      ChunkGenerator var6 = var1.getChunkProvider().getChunkGenerator();
      TemplateManager var7 = var1.method6938();
      StructureManager var8 = var1.func_241112_a_();
      Random var9 = var1.method6814();
      BlockPos var10 = this.getPos();
      List<Class4193> var11 = Lists.newArrayList();
      Class8969 var12 = new Class8969();
      var12.method32889(var1, var10, new BlockPos(1, 1, 1), false, (Block)null);
      Class7488 var13 = new Class7488(var12);
      Class4193 var14 = new Class4193(var7, var13, var10, 1, Rotation.NONE, new MutableBoundingBox(var10, var10));
      Class8814.method31821(var1.func_241828_r(), var14, var2, Class4193::new, var6, var7, var11, var9);

      for (Class4193 var16 : var11) {
         var16.method12976(var1, var8, var6, var9, MutableBoundingBox.method38387(), var10, var3);
      }
   }

   public enum OrientationType implements IStringSerializable {
      ROLLABLE("rollable"),
      ALIGNED("aligned");

      private final String field239;
      private static final OrientationType[] field240 = new OrientationType[]{ROLLABLE, ALIGNED};

      private OrientationType(String var3) {
         this.field239 = var3;
      }

      @Override
      public String getString() {
         return this.field239;
      }

      public static Optional<OrientationType> method269(String var0) {
         return Arrays.<OrientationType>stream(values()).filter(var1 -> var1.getString().equals(var0)).findFirst();
      }
   }
}
