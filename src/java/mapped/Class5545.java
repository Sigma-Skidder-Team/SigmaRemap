package mapped;

import java.io.IOException;
import java.util.function.Supplier;

public class Class5545 implements Packet<Class5116> {
   private static String[] field24614;
   private Class9535 field24615;
   private Class8705<World> field24616;
   private long field24617;
   private Class1894 field24618;
   private Class1894 field24619;
   private boolean field24620;
   private boolean field24621;
   private boolean field24622;

   public Class5545() {
   }

   public Class5545(Class9535 var1, Class8705<World> var2, long var3, Class1894 var5, Class1894 var6, boolean var7, boolean var8, boolean var9) {
      this.field24615 = var1;
      this.field24616 = var2;
      this.field24617 = var3;
      this.field24618 = var5;
      this.field24619 = var6;
      this.field24620 = var7;
      this.field24621 = var8;
      this.field24622 = var9;
   }

   public void method17180(Class5116 var1) {
      var1.method15734(this);
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24615 = var1.<Supplier<Class9535>>method35696(Class9535.field44379).get();
      this.field24616 = Class8705.<World>method31395(Class2348.field16067, var1.method35731());
      this.field24617 = var1.readLong();
      this.field24618 = Class1894.method8159(var1.readUnsignedByte());
      this.field24619 = Class1894.method8159(var1.readUnsignedByte());
      this.field24620 = var1.readBoolean();
      this.field24621 = var1.readBoolean();
      this.field24622 = var1.readBoolean();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.method35697(Class9535.field44379, () -> this.field24615);
      var1.method35732(this.field24616.method31399());
      var1.writeLong(this.field24617);
      var1.writeByte(this.field24618.method8152());
      var1.writeByte(this.field24619.method8152());
      var1.writeBoolean(this.field24620);
      var1.writeBoolean(this.field24621);
      var1.writeBoolean(this.field24622);
   }

   public Class9535 method17432() {
      return this.field24615;
   }

   public Class8705<World> method17433() {
      return this.field24616;
   }

   public long method17434() {
      return this.field24617;
   }

   public Class1894 method17435() {
      return this.field24618;
   }

   public Class1894 method17436() {
      return this.field24619;
   }

   public boolean method17437() {
      return this.field24620;
   }

   public boolean method17438() {
      return this.field24621;
   }

   public boolean method17439() {
      return this.field24622;
   }
}