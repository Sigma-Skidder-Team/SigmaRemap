package mapped;

import java.io.IOException;
import org.apache.commons.lang3.Validate;

public class Class5584 implements Packet<Class5116> {
   private Class9455 field24776;
   private Class2266 field24777;
   private int field24778;
   private int field24779;
   private int field24780;
   private float field24781;
   private float field24782;

   public Class5584() {
   }

   public Class5584(Class9455 var1, Class2266 var2, double var3, double var5, double var7, float var9, float var10) {
      Validate.notNull(var1, "sound", new Object[0]);
      this.field24776 = var1;
      this.field24777 = var2;
      this.field24778 = (int)(var3 * 8.0);
      this.field24779 = (int)(var5 * 8.0);
      this.field24780 = (int)(var7 * 8.0);
      this.field24781 = var9;
      this.field24782 = var10;
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24776 = Class2348.field16069.method9172(var1.method35714());
      this.field24777 = var1.<Class2266>method35712(Class2266.class);
      this.field24778 = var1.readInt();
      this.field24779 = var1.readInt();
      this.field24780 = var1.readInt();
      this.field24781 = var1.readFloat();
      this.field24782 = var1.readFloat();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeVarInt(Class2348.field16069.method9171(this.field24776));
      var1.method35713(this.field24777);
      var1.writeInt(this.field24778);
      var1.writeInt(this.field24779);
      var1.writeInt(this.field24780);
      var1.writeFloat(this.field24781);
      var1.writeFloat(this.field24782);
   }

   public Class9455 method17549() {
      return this.field24776;
   }

   public Class2266 method17550() {
      return this.field24777;
   }

   public double method17551() {
      return (double)((float)this.field24778 / 8.0F);
   }

   public double method17552() {
      return (double)((float)this.field24779 / 8.0F);
   }

   public double method17553() {
      return (double)((float)this.field24780 / 8.0F);
   }

   public float method17554() {
      return this.field24781;
   }

   public float method17555() {
      return this.field24782;
   }

   public void method17180(Class5116 var1) {
      var1.method15747(this);
   }
}
