package net.minecraft.network.play.server;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import mapped.*;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;

import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class SAdvancementInfoPacket implements Packet<IClientPlayNetHandler> {
   private static String[] field24685;
   private boolean field24686;
   private Map<ResourceLocation, Class7999> field24687;
   private Set<ResourceLocation> field24688;
   private Map<ResourceLocation, Class2006> field24689;

   public SAdvancementInfoPacket() {
   }

   public SAdvancementInfoPacket(boolean var1, Collection<Class7952> var2, Set<ResourceLocation> var3, Map<ResourceLocation, Class2006> var4) {
      this.field24686 = var1;
      this.field24687 = Maps.newHashMap();

      for (Class7952 var8 : var2) {
         this.field24687.put(var8.method27033(), var8.method27025());
      }

      this.field24688 = var3;
      this.field24689 = Maps.newHashMap(var4);
   }

   public void method17180(IClientPlayNetHandler var1) {
      var1.handleAdvancementInfo(this);
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24686 = var1.readBoolean();
      this.field24687 = Maps.newHashMap();
      this.field24688 = Sets.newLinkedHashSet();
      this.field24689 = Maps.newHashMap();
      int var4 = var1.method35714();

      for (int var5 = 0; var5 < var4; var5++) {
         ResourceLocation var6 = var1.method35731();
         Class7999 var7 = Class7999.method27321(var1);
         this.field24687.put(var6, var7);
      }

      var4 = var1.method35714();

      for (int var10 = 0; var10 < var4; var10++) {
         ResourceLocation var12 = var1.method35731();
         this.field24688.add(var12);
      }

      var4 = var1.method35714();

      for (int var11 = 0; var11 < var4; var11++) {
         ResourceLocation var13 = var1.method35731();
         this.field24689.put(var13, Class2006.method8494(var1));
      }
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeBoolean(this.field24686);
      var1.writeVarInt(this.field24687.size());

      for (Entry var5 : this.field24687.entrySet()) {
         ResourceLocation var6 = (ResourceLocation)var5.getKey();
         Class7999 var7 = (Class7999)var5.getValue();
         var1.method35732(var6);
         var7.method27319(var1);
      }

      var1.writeVarInt(this.field24688.size());

      for (ResourceLocation var10 : this.field24688) {
         var1.method35732(var10);
      }

      var1.writeVarInt(this.field24689.size());

      for (Entry var11 : this.field24689.entrySet()) {
         var1.method35732((ResourceLocation)var11.getKey());
         ((Class2006)var11.getValue()).method8493(var1);
      }
   }

   public Map<ResourceLocation, Class7999> method17487() {
      return this.field24687;
   }

   public Set<ResourceLocation> method17488() {
      return this.field24688;
   }

   public Map<ResourceLocation, Class2006> method17489() {
      return this.field24689;
   }

   public boolean method17490() {
      return this.field24686;
   }
}
