package net.minecraft.network.play.client;

import net.minecraft.network.play.IServerPlayNetHandler;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.tileentity.JigsawTileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;

import java.io.IOException;

public class CUpdateJigsawBlockPacket implements IPacket<IServerPlayNetHandler> {
   private BlockPos field_218790_a;
   private ResourceLocation field_240847_b_;
   private ResourceLocation field_240848_c_;
   private ResourceLocation field_240849_d_;
   private String field_218793_d;
   private JigsawTileEntity.OrientationType field_240850_f_;

   public CUpdateJigsawBlockPacket() {
   }

   public CUpdateJigsawBlockPacket(BlockPos var1, ResourceLocation var2, ResourceLocation var3, ResourceLocation var4, String var5, JigsawTileEntity.OrientationType var6) {
      this.field_218790_a = var1;
      this.field_240847_b_ = var2;
      this.field_240848_c_ = var3;
      this.field_240849_d_ = var4;
      this.field_218793_d = var5;
      this.field_240850_f_ = var6;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field_218790_a = var1.readBlockPos();
      this.field_240847_b_ = var1.readResourceLocation();
      this.field_240848_c_ = var1.readResourceLocation();
      this.field_240849_d_ = var1.readResourceLocation();
      this.field_218793_d = var1.readString(32767);
      this.field_240850_f_ = JigsawTileEntity.OrientationType.method269(var1.readString(32767)).orElse(JigsawTileEntity.OrientationType.ALIGNED);
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeBlockPos(this.field_218790_a);
      var1.writeResourceLocation(this.field_240847_b_);
      var1.writeResourceLocation(this.field_240848_c_);
      var1.writeResourceLocation(this.field_240849_d_);
      var1.writeString(this.field_218793_d);
      var1.writeString(this.field_240850_f_.getString());
   }

   public void processPacket(IServerPlayNetHandler var1) {
      var1.func_217262_a(this);
   }

   public BlockPos func_218789_b() {
      return this.field_218790_a;
   }

   public ResourceLocation func_240851_c_() {
      return this.field_240847_b_;
   }

   public ResourceLocation func_240852_d_() {
      return this.field_240848_c_;
   }

   public ResourceLocation func_240853_e_() {
      return this.field_240849_d_;
   }

   public String func_218788_e() {
      return this.field_218793_d;
   }

   public JigsawTileEntity.OrientationType func_240854_g_() {
      return this.field_240850_f_;
   }
}
