package mapped;

import java.io.IOException;

public class Class5573 implements Packet<Class5110> {
   private static String[] field24717;
   private Class1939 field24718;
   private boolean field24719;
   private boolean field24720;

   public Class5573() {
   }

   public Class5573(Class1939 var1, boolean var2, boolean var3) {
      this.field24718 = var1;
      this.field24719 = var2;
      this.field24720 = var3;
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24718 = var1.<Class1939>method35712(Class1939.class);
      this.field24719 = var1.readBoolean();
      this.field24720 = var1.readBoolean();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.method35713(this.field24718);
      var1.writeBoolean(this.field24719);
      var1.writeBoolean(this.field24720);
   }

   public void method17180(Class5110 var1) {
      var1.method15638(this);
   }

   public Class1939 method17503() {
      return this.field24718;
   }

   public boolean method17504() {
      return this.field24719;
   }

   public boolean method17505() {
      return this.field24720;
   }
}
