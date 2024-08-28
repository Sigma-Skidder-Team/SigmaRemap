package mapped;

import java.io.IOException;
import javax.annotation.Nullable;

public class Class5488 implements Packet<Class5116> {
   private static String[] field24372;
   private ResourceLocation field24373;
   private Class2266 field24374;

   public Class5488() {
   }

   public Class5488(ResourceLocation var1, Class2266 var2) {
      this.field24373 = var1;
      this.field24374 = var2;
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      byte var4 = var1.readByte();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      if (this.field24374 == null) {
         if (this.field24373 == null) {
            var1.writeByte(0);
         } else {
            var1.writeByte(2);
            var1.method35732(this.field24373);
         }
      } else if (this.field24373 == null) {
         var1.writeByte(1);
         var1.method35713(this.field24374);
      } else {
         var1.writeByte(3);
         var1.method35713(this.field24374);
         var1.method35732(this.field24373);
      }
   }

   @Nullable
   public ResourceLocation method17268() {
      return this.field24373;
   }

   @Nullable
   public Class2266 method17269() {
      return this.field24374;
   }

   public void method17180(Class5116 var1) {
      var1.method15769(this);
   }
}
