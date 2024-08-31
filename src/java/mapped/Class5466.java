package mapped;

import net.minecraft.network.Packet;

import java.io.IOException;

public class Class5466 implements Packet<IServerPlayNetHandler> {
   private static String[] field24261;
   private Class2238 field24262;
   private ResourceLocation field24263;

   public Class5466() {
   }

   public Class5466(Class2238 var1, ResourceLocation var2) {
      this.field24262 = var1;
      this.field24263 = var2;
   }

   public static Class5466 method17182(Class7952 var0) {
      return new Class5466(Class2238.field14644, var0.method27033());
   }

   public static Class5466 method17183() {
      return new Class5466(Class2238.field14645, (ResourceLocation)null);
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24262 = var1.<Class2238>method35712(Class2238.class);
      if (this.field24262 == Class2238.field14644) {
         this.field24263 = var1.method35731();
      }
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.method35713(this.field24262);
      if (this.field24262 == Class2238.field14644) {
         var1.method35732(this.field24263);
      }
   }

   public void method17180(IServerPlayNetHandler var1) {
      var1.method15639(this);
   }

   public Class2238 method17184() {
      return this.field24262;
   }

   public ResourceLocation method17185() {
      return this.field24263;
   }
}
