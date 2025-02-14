package net.minecraft.network.play.server;

import mapped.*;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.GameType;
import net.minecraft.world.World;

import java.io.IOException;
import java.util.function.Supplier;

public class SRespawnPacket implements IPacket<IClientPlayNetHandler> {
   private static String[] field24614;
   private DimensionType field24615;
   private RegistryKey<World> field24616;
   private long field24617;
   private GameType field24618;
   private GameType field24619;
   private boolean field24620;
   private boolean field24621;
   private boolean field24622;

   public SRespawnPacket() {
   }

   public SRespawnPacket(DimensionType var1, RegistryKey<World> var2, long var3, GameType var5, GameType var6, boolean var7, boolean var8, boolean var9) {
      this.field24615 = var1;
      this.field24616 = var2;
      this.field24617 = var3;
      this.field24618 = var5;
      this.field24619 = var6;
      this.field24620 = var7;
      this.field24621 = var8;
      this.field24622 = var9;
   }

   public void processPacket(IClientPlayNetHandler var1) {
      var1.handleRespawn(this);
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24615 = var1.<Supplier<DimensionType>>func_240628_a_(DimensionType.DIMENSION_TYPE_CODEC).get();
      this.field24616 = RegistryKey.<World>getOrCreateKey(Registry.WORLD_KEY, var1.readResourceLocation());
      this.field24617 = var1.readLong();
      this.field24618 = GameType.getByID(var1.readUnsignedByte());
      this.field24619 = GameType.getByID(var1.readUnsignedByte());
      this.field24620 = var1.readBoolean();
      this.field24621 = var1.readBoolean();
      this.field24622 = var1.readBoolean();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.func_240629_a_(DimensionType.DIMENSION_TYPE_CODEC, () -> this.field24615);
      var1.writeResourceLocation(this.field24616.getLocation());
      var1.writeLong(this.field24617);
      var1.writeByte(this.field24618.getID());
      var1.writeByte(this.field24619.getID());
      var1.writeBoolean(this.field24620);
      var1.writeBoolean(this.field24621);
      var1.writeBoolean(this.field24622);
   }

   public DimensionType method17432() {
      return this.field24615;
   }

   public RegistryKey<World> method17433() {
      return this.field24616;
   }

   public long method17434() {
      return this.field24617;
   }

   public GameType method17435() {
      return this.field24618;
   }

   public GameType method17436() {
      return this.field24619;
   }

   public boolean method17437() {
      return this.field24620;
   }

   public boolean method17438() {
      return this.field24621;
   }

   public boolean method17439() {
      return this.field24622;
   }
}
