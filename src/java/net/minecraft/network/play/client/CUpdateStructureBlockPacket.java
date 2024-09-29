package net.minecraft.network.play.client;

import mapped.*;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.IServerPlayNetHandler;
import net.minecraft.state.properties.StructureMode;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;

import java.io.IOException;

public class CUpdateStructureBlockPacket implements IPacket<IServerPlayNetHandler> {
   private BlockPos pos;
   private Class1897 field_210392_b;
   private StructureMode mode;
   private String name;
   private BlockPos field_210395_e;
   private BlockPos size;
   private Mirror mirror;
   private Rotation rotation;
   private String field_210399_i;
   private boolean field_210400_j;
   private boolean field_210401_k;
   private boolean field_210402_l;
   private float integrity;
   private long seed;

   public CUpdateStructureBlockPacket() {
   }

   public CUpdateStructureBlockPacket(
      BlockPos var1,
      Class1897 var2,
      StructureMode var3,
      String var4,
      BlockPos var5,
      BlockPos var6,
      Mirror var7,
      Rotation var8,
      String var9,
      boolean var10,
      boolean var11,
      boolean var12,
      float var13,
      long var14
   ) {
      this.pos = var1;
      this.field_210392_b = var2;
      this.mode = var3;
      this.name = var4;
      this.field_210395_e = var5;
      this.size = var6;
      this.mirror = var7;
      this.rotation = var8;
      this.field_210399_i = var9;
      this.field_210400_j = var10;
      this.field_210401_k = var11;
      this.field_210402_l = var12;
      this.integrity = var13;
      this.seed = var14;
   }

   @Override
   public void readPacketData(PacketBuffer buf) throws IOException {
      this.pos = buf.readBlockPos();
      this.field_210392_b = buf.readEnumValue(Class1897.class);
      this.mode = buf.readEnumValue(StructureMode.class);
      this.name = buf.readString(32767);
      int i = 48;
      this.field_210395_e = new BlockPos(MathHelper.clamp(buf.readByte(), -48, 48), MathHelper.clamp(buf.readByte(), -48, 48), MathHelper.clamp(buf.readByte(), -48, 48));
      int j = 48;
      this.size = new BlockPos(MathHelper.clamp(buf.readByte(), 0, 48), MathHelper.clamp(buf.readByte(), 0, 48), MathHelper.clamp(buf.readByte(), 0, 48));
      this.mirror = buf.readEnumValue(Mirror.class);
      this.rotation = buf.readEnumValue(Rotation.class);
      this.field_210399_i = buf.readString(12);
      this.integrity = MathHelper.clamp(buf.readFloat(), 0.0F, 1.0F);
      this.seed = buf.method35715();
      int k = buf.readByte();
      this.field_210400_j = (k & 1) != 0;
      this.field_210401_k = (k & 2) != 0;
      this.field_210402_l = (k & 4) != 0;
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeBlockPos(this.pos);
      var1.writeEnumValue(this.field_210392_b);
      var1.writeEnumValue(this.mode);
      var1.writeString(this.name);
      var1.writeByte(this.field_210395_e.getX());
      var1.writeByte(this.field_210395_e.getY());
      var1.writeByte(this.field_210395_e.getZ());
      var1.writeByte(this.size.getX());
      var1.writeByte(this.size.getY());
      var1.writeByte(this.size.getZ());
      var1.writeEnumValue(this.mirror);
      var1.writeEnumValue(this.rotation);
      var1.writeString(this.field_210399_i);
      var1.writeFloat(this.integrity);
      var1.method35719(this.seed);
      byte var4 = 0;
      if (this.field_210400_j) {
         var4 |= 1;
      }

      if (this.field_210401_k) {
         var4 |= 2;
      }

      if (this.field_210402_l) {
         var4 |= 4;
      }

      var1.writeByte(var4);
   }

   public void processPacket(IServerPlayNetHandler var1) {
      var1.processUpdateStructureBlock(this);
   }

   public BlockPos method17609() {
      return this.pos;
   }

   public Class1897 method17610() {
      return this.field_210392_b;
   }

   public StructureMode method17611() {
      return this.mode;
   }

   public String method17612() {
      return this.name;
   }

   public BlockPos method17613() {
      return this.field_210395_e;
   }

   public BlockPos method17614() {
      return this.size;
   }

   public Mirror method17615() {
      return this.mirror;
   }

   public Rotation method17616() {
      return this.rotation;
   }

   public String method17617() {
      return this.field_210399_i;
   }

   public boolean method17618() {
      return this.field_210400_j;
   }

   public boolean method17619() {
      return this.field_210401_k;
   }

   public boolean method17620() {
      return this.field_210402_l;
   }

   public float method17621() {
      return this.integrity;
   }

   public long method17622() {
      return this.seed;
   }
}
