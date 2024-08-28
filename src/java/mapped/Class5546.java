package mapped;

import java.io.IOException;
import org.apache.commons.lang3.Validate;

public class Class5546 implements Packet<Class5116> {
   private Class9455 field24623;
   private Class2266 field24624;
   private int field24625;
   private float field24626;
   private float field24627;

   public Class5546() {
   }

   public Class5546(Class9455 var1, Class2266 var2, Entity var3, float var4, float var5) {
      Validate.notNull(var1, "sound", new Object[0]);
      this.field24623 = var1;
      this.field24624 = var2;
      this.field24625 = var3.method3205();
      this.field24626 = var4;
      this.field24627 = var5;
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24623 = Class2348.field16069.method9172(var1.method35714());
      this.field24624 = var1.<Class2266>method35712(Class2266.class);
      this.field24625 = var1.method35714();
      this.field24626 = var1.readFloat();
      this.field24627 = var1.readFloat();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeVarInt(Class2348.field16069.method9171(this.field24623));
      var1.method35713(this.field24624);
      var1.writeVarInt(this.field24625);
      var1.writeFloat(this.field24626);
      var1.writeFloat(this.field24627);
   }

   public Class9455 method17441() {
      return this.field24623;
   }

   public Class2266 method17442() {
      return this.field24624;
   }

   public int method17443() {
      return this.field24625;
   }

   public float method17444() {
      return this.field24626;
   }

   public float method17445() {
      return this.field24627;
   }

   public void method17180(Class5116 var1) {
      var1.method15748(this);
   }
}
