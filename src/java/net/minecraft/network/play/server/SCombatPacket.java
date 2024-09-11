package net.minecraft.network.play.server;

import java.io.IOException;

import mapped.Class1900;
import mapped.Class6746;
import mapped.CombatTracker;
import net.minecraft.network.PacketBuffer;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.entity.LivingEntity;
import net.minecraft.network.Packet;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;

public class SCombatPacket implements Packet<IClientPlayNetHandler> {
   private static String[] field24692;
   public Class1900 field24693;
   public int field24694;
   public int field24695;
   public int field24696;
   public ITextComponent field24697;

   public SCombatPacket() {
   }

   public SCombatPacket(CombatTracker var1, Class1900 var2) {
      this(var1, var2, StringTextComponent.EMPTY);
   }

   public SCombatPacket(CombatTracker var1, Class1900 var2, ITextComponent var3) {
      this.field24693 = var2;
      LivingEntity var6 = var1.getBestAttacker();
      switch (Class6746.field29450[var2.ordinal()]) {
         case 1:
            this.field24696 = var1.method27604();
            this.field24695 = var6 == null ? -1 : var6.getEntityId();
            break;
         case 2:
            this.field24694 = var1.method27607().getEntityId();
            this.field24695 = var6 == null ? -1 : var6.getEntityId();
            this.field24697 = var3;
      }
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24693 = var1.<Class1900>readEnumValue(Class1900.class);
      if (this.field24693 != Class1900.field11156) {
         if (this.field24693 == Class1900.field11157) {
            this.field24694 = var1.readVarInt();
            this.field24695 = var1.readInt();
            this.field24697 = var1.readTextComponent();
         }
      } else {
         this.field24696 = var1.readVarInt();
         this.field24695 = var1.readInt();
      }
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeEnumValue(this.field24693);
      if (this.field24693 != Class1900.field11156) {
         if (this.field24693 == Class1900.field11157) {
            var1.writeVarInt(this.field24694);
            var1.writeInt(this.field24695);
            var1.writeTextComponent(this.field24697);
         }
      } else {
         var1.writeVarInt(this.field24696);
         var1.writeInt(this.field24695);
      }
   }

   public void processPacket(IClientPlayNetHandler var1) {
      var1.handleCombatEvent(this);
   }

   @Override
   public boolean method17181() {
      return this.field24693 == Class1900.field11157;
   }
}
