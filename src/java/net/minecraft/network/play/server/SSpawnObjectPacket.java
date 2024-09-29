package net.minecraft.network.play.server;

import net.minecraft.util.math.MathHelper;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.network.IPacket;
import net.minecraft.util.math.BlockPos;

import java.io.IOException;
import java.util.UUID;

public class SSpawnObjectPacket implements IPacket<IClientPlayNetHandler> {
   private static String[] field24359;
   private int field24360;
   private UUID field24361;
   private double field24362;
   private double field24363;
   private double field24364;
   private int field24365;
   private int field24366;
   private int field24367;
   private int field24368;
   private int field24369;
   private EntityType<?> field24370;
   private int field24371;

   public SSpawnObjectPacket() {
   }

   public SSpawnObjectPacket(int var1, UUID var2, double var3, double var5, double var7, float var9, float var10, EntityType<?> var11, int var12, Vector3d var13) {
      this.field24360 = var1;
      this.field24361 = var2;
      this.field24362 = var3;
      this.field24363 = var5;
      this.field24364 = var7;
      this.field24368 = MathHelper.floor(var9 * 256.0F / 360.0F);
      this.field24369 = MathHelper.floor(var10 * 256.0F / 360.0F);
      this.field24370 = var11;
      this.field24371 = var12;
      this.field24365 = (int)(MathHelper.clamp(var13.x, -3.9, 3.9) * 8000.0);
      this.field24366 = (int)(MathHelper.clamp(var13.y, -3.9, 3.9) * 8000.0);
      this.field24367 = (int)(MathHelper.clamp(var13.z, -3.9, 3.9) * 8000.0);
   }

   public SSpawnObjectPacket(Entity var1) {
      this(var1, 0);
   }

   public SSpawnObjectPacket(Entity var1, int var2) {
      this(
         var1.getEntityId(),
         var1.getUniqueID(),
         var1.getPosX(),
         var1.getPosY(),
         var1.getPosZ(),
         var1.rotationPitch,
         var1.rotationYaw,
         var1.getType(),
         var2,
         var1.getMotion()
      );
   }

   public SSpawnObjectPacket(Entity var1, EntityType<?> var2, int var3, BlockPos var4) {
      this(
         var1.getEntityId(),
         var1.getUniqueID(),
         (double)var4.getX(),
         (double)var4.getY(),
         (double)var4.getZ(),
         var1.rotationPitch,
         var1.rotationYaw,
         var2,
         var3,
         var1.getMotion()
      );
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24360 = var1.readVarInt();
      this.field24361 = var1.readUniqueId();
      this.field24370 = Registry.ENTITY_TYPE.getByValue(var1.readVarInt());
      this.field24362 = var1.readDouble();
      this.field24363 = var1.readDouble();
      this.field24364 = var1.readDouble();
      this.field24368 = var1.readByte();
      this.field24369 = var1.readByte();
      this.field24371 = var1.readInt();
      this.field24365 = var1.readShort();
      this.field24366 = var1.readShort();
      this.field24367 = var1.readShort();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeVarInt(this.field24360);
      var1.writeUniqueId(this.field24361);
      var1.writeVarInt(Registry.ENTITY_TYPE.getId(this.field24370));
      var1.writeDouble(this.field24362);
      var1.writeDouble(this.field24363);
      var1.writeDouble(this.field24364);
      var1.writeByte(this.field24368);
      var1.writeByte(this.field24369);
      var1.writeInt(this.field24371);
      var1.writeShort(this.field24365);
      var1.writeShort(this.field24366);
      var1.writeShort(this.field24367);
   }

   public void processPacket(IClientPlayNetHandler var1) {
      var1.handleSpawnObject(this);
   }

   public int method17256() {
      return this.field24360;
   }

   public UUID method17257() {
      return this.field24361;
   }

   public double method17258() {
      return this.field24362;
   }

   public double method17259() {
      return this.field24363;
   }

   public double method17260() {
      return this.field24364;
   }

   public double method17261() {
      return (double)this.field24365 / 8000.0;
   }

   public double method17262() {
      return (double)this.field24366 / 8000.0;
   }

   public double method17263() {
      return (double)this.field24367 / 8000.0;
   }

   public int method17264() {
      return this.field24368;
   }

   public int method17265() {
      return this.field24369;
   }

   public EntityType<?> method17266() {
      return this.field24370;
   }

   public int method17267() {
      return this.field24371;
   }
}
