package net.minecraft.network.play.server;

import mapped.Class9385;
import net.minecraft.network.PacketBuffer;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.Packet;

import java.io.IOException;

public class SChangeGameStatePacket implements Packet<IClientPlayNetHandler> {
   private static String[] field24559;
   public static final Class9385 field24560 = new Class9385(0);
   public static final Class9385 field24561 = new Class9385(1);
   public static final Class9385 field24562 = new Class9385(2);
   public static final Class9385 field24563 = new Class9385(3);
   public static final Class9385 field24564 = new Class9385(4);
   public static final Class9385 field24565 = new Class9385(5);
   public static final Class9385 field24566 = new Class9385(6);
   public static final Class9385 field24567 = new Class9385(7);
   public static final Class9385 field24568 = new Class9385(8);
   public static final Class9385 field24569 = new Class9385(9);
   public static final Class9385 field24570 = new Class9385(10);
   public static final Class9385 field24571 = new Class9385(11);
   private Class9385 field24572;
   private float field24573;

   public SChangeGameStatePacket() {
   }

   public SChangeGameStatePacket(Class9385 var1, float var2) {
      this.field24572 = var1;
      this.field24573 = var2;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24572 = (Class9385)Class9385.method35621().get(var1.readUnsignedByte());
      this.field24573 = var1.readFloat();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeByte(this.field24572.field43543);
      var1.writeFloat(this.field24573);
   }

   public void method17180(IClientPlayNetHandler var1) {
      var1.handleChangeGameState(this);
   }

   public Class9385 method17397() {
      return this.field24572;
   }

   public float method17398() {
      return this.field24573;
   }
}
