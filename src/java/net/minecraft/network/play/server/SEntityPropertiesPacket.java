package net.minecraft.network.play.server;

import com.google.common.collect.Lists;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.entity.ai.attributes.Attribute;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.ModifiableAttributeInstance;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;

import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

public class SEntityPropertiesPacket implements Packet<IClientPlayNetHandler> {
   private int entityId;
   private final List<Snapshot> snapshots = Lists.newArrayList();

   public SEntityPropertiesPacket() {
   }

   public SEntityPropertiesPacket(int var1, Collection<ModifiableAttributeInstance> var2) {
      this.entityId = var1;

      for (ModifiableAttributeInstance modifiableattributeinstance : var2) {
         this.snapshots.add(new Snapshot(modifiableattributeinstance.getAttribute(), modifiableattributeinstance.getBaseValue(), modifiableattributeinstance.getModifierListCopy()));
      }
   }

   @Override
   public void readPacketData(PacketBuffer buf) throws IOException {
      this.entityId = buf.readVarInt();
      int i = buf.readInt();

      for (int j = 0; j < i; ++j)
      {
         ResourceLocation resourcelocation = buf.readResourceLocation();
         Attribute attribute = Registry.ATTRIBUTE.getOrDefault(resourcelocation);
         double d0 = buf.readDouble();
         List<AttributeModifier> list = Lists.newArrayList();
         int k = buf.readVarInt();

         for (int l = 0; l < k; ++l)
         {
            UUID uuid = buf.readUniqueId();
            list.add(new AttributeModifier(uuid, "Unknown synced attribute modifier", buf.readDouble(), AttributeModifier.Operation.byId(buf.readByte())));
         }

         this.snapshots.add(new Snapshot(attribute, d0, list));
      }
   }

   @Override
   public void writePacketData(PacketBuffer buf) throws IOException {
      buf.writeVarInt(this.entityId);
      buf.writeInt(this.snapshots.size());

      for (SEntityPropertiesPacket.Snapshot sentitypropertiespacket$snapshot : this.snapshots)
      {
         buf.writeResourceLocation(Registry.ATTRIBUTE.getKey(sentitypropertiespacket$snapshot.func_240834_a_()));
         buf.writeDouble(sentitypropertiespacket$snapshot.getBaseValue());
         buf.writeVarInt(sentitypropertiespacket$snapshot.getModifiers().size());

         for (AttributeModifier attributemodifier : sentitypropertiespacket$snapshot.getModifiers())
         {
            buf.writeUniqueId(attributemodifier.getID());
            buf.writeDouble(attributemodifier.getAmount());
            buf.writeByte(attributemodifier.getOperation().getId());
         }
      }
   }

   public void processPacket(IClientPlayNetHandler var1) {
      var1.handleEntityProperties(this);
   }

   public int method17463() {
      return this.entityId;
   }

   public List<Snapshot> method17464() {
      return this.snapshots;
   }

   public static class Snapshot {
      private final Attribute field_240833_b_;
      private final double baseValue;
      private final Collection<AttributeModifier> modifiers;

      public Snapshot(Attribute var1, double var2, Collection<AttributeModifier> param4) {
           this.field_240833_b_ = var1;
           this.baseValue = var2;
           this.modifiers = param4;
      }

      public Attribute func_240834_a_() {
         return this.field_240833_b_;
      }

      public double getBaseValue() {
         return this.baseValue;
      }

      public Collection<AttributeModifier> getModifiers() {
         return this.modifiers;
      }
   }
}
