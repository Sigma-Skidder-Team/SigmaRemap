package mapped;

import java.io.IOException;

public class Class5547 implements Packet<Class5116> {
   private static String[] field24628;
   private double field24629;
   private double field24630;
   private double field24631;
   private float field24632;
   private float field24633;
   private float field24634;
   private float field24635;
   private int field24636;
   private boolean field24637;
   private Class7436 field24638;

   public Class5547() {
   }

   public <T extends Class7436> Class5547(
      T var1, boolean var2, double var3, double var5, double var7, float var9, float var10, float var11, float var12, int var13
   ) {
      this.field24638 = var1;
      this.field24637 = var2;
      this.field24629 = var3;
      this.field24630 = var5;
      this.field24631 = var7;
      this.field24632 = var9;
      this.field24633 = var10;
      this.field24634 = var11;
      this.field24635 = var12;
      this.field24636 = var13;
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      Object var4 = Registry.field16077.method9172(var1.readInt());
      if (var4 == null) {
         var4 = Class7940.field34050;
      }

      this.field24637 = var1.readBoolean();
      this.field24629 = var1.readDouble();
      this.field24630 = var1.readDouble();
      this.field24631 = var1.readDouble();
      this.field24632 = var1.readFloat();
      this.field24633 = var1.readFloat();
      this.field24634 = var1.readFloat();
      this.field24635 = var1.readFloat();
      this.field24636 = var1.readInt();
      this.field24638 = this.<Class7436>method17446(var1, (Class7434<Class7436>)var4);
   }

   private <T extends Class7436> T method17446(PacketBuffer var1, Class7434<T> var2) {
      return (T)var2.method24007().method20912(var2, var1);
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeInt(Registry.field16077.method9171(this.field24638.method24011()));
      var1.writeBoolean(this.field24637);
      var1.writeDouble(this.field24629);
      var1.writeDouble(this.field24630);
      var1.writeDouble(this.field24631);
      var1.writeFloat(this.field24632);
      var1.writeFloat(this.field24633);
      var1.writeFloat(this.field24634);
      var1.writeFloat(this.field24635);
      var1.writeInt(this.field24636);
      this.field24638.method24009(var1);
   }

   public boolean method17447() {
      return this.field24637;
   }

   public double method17448() {
      return this.field24629;
   }

   public double method17449() {
      return this.field24630;
   }

   public double method17450() {
      return this.field24631;
   }

   public float method17451() {
      return this.field24632;
   }

   public float method17452() {
      return this.field24633;
   }

   public float method17453() {
      return this.field24634;
   }

   public float method17454() {
      return this.field24635;
   }

   public int method17455() {
      return this.field24636;
   }

   public Class7436 method17456() {
      return this.field24638;
   }

   public void method17180(Class5116 var1) {
      var1.method15729(this);
   }
}
