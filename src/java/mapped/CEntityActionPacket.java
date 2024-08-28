package mapped;

import java.io.IOException;

public class CEntityActionPacket implements Packet<Class5110> {
   private static String[] field24772;
   private int field24773;
   private Class1865 field24774;
   private int field24775;

   public CEntityActionPacket() {
   }

   public CEntityActionPacket(Entity var1, Class1865 var2) {
      this(var1, var2, 0);
   }

   public CEntityActionPacket(Entity var1, Class1865 var2, int var3) {
      this.field24773 = var1.method3205();
      this.field24774 = var2;
      this.field24775 = var3;
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24773 = var1.method35714();
      this.field24774 = var1.<Class1865>method35712(Class1865.class);
      this.field24775 = var1.method35714();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeVarInt(this.field24773);
      var1.method35713(this.field24774);
      var1.writeVarInt(this.field24775);
   }

   public void method17180(Class5110 var1) {
      var1.processEntityAction(this);
   }

   public Class1865 getAction() {
      return this.field24774;
   }

   public int getAuxData() {
      return this.field24775;
   }
}
