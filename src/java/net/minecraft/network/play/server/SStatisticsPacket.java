package net.minecraft.network.play.server;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import mapped.Class49;
import mapped.Class9007;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.registry.Registry;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.Packet;

import java.io.IOException;
import java.util.Map;

public class SStatisticsPacket implements Packet<IClientPlayNetHandler> {
   private static String[] field24639;
   private Object2IntMap<Class9007<?>> field24640;

   public SStatisticsPacket() {
   }

   public SStatisticsPacket(Object2IntMap<Class9007<?>> var1) {
      this.field24640 = var1;
   }

   public void processPacket(IClientPlayNetHandler var1) {
      var1.handleStatistics(this);
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      int var4 = var1.readVarInt();
      this.field24640 = new Object2IntOpenHashMap(var4);

      for (int var5 = 0; var5 < var4; var5++) {
         this.method17457(Registry.field16088.method9172(var1.readVarInt()), var1);
      }
   }

   private <T> void method17457(Class49<T> var1, PacketBuffer var2) {
      int var5 = var2.readVarInt();
      int var6 = var2.readVarInt();
      this.field24640.put(var1.method172(var1.method171().method9172(var5)), var6);
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeVarInt(this.field24640.size());
      ObjectIterator var4 = this.field24640.object2IntEntrySet().iterator();

      while (var4.hasNext()) {
         Entry var5 = (Entry)var4.next();
         Class9007 var6 = (Class9007)var5.getKey();
         var1.writeVarInt(Registry.field16088.getId(var6.method33275()));
         var1.writeVarInt(this.method17458(var6));
         var1.writeVarInt(var5.getIntValue());
      }
   }

   private <T> int method17458(Class9007<T> var1) {
      return var1.method33275().method171().getId(var1.method33276());
   }

   public Map<Class9007<?>, Integer> method17459() {
      return this.field24640;
   }
}
