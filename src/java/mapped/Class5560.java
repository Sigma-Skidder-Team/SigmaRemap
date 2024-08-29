package mapped;

import net.minecraft.entity.Entity;

import java.io.IOException;
import javax.annotation.Nullable;

public class Class5560 implements Packet<Class5116> {
   private static String[] field24673;
   public int field24674;

   public Class5560() {
   }

   public Class5560(Entity var1) {
      this.field24674 = var1.method3205();
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24674 = var1.method35714();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeVarInt(this.field24674);
   }

   public void method17180(Class5116 var1) {
      var1.method15757(this);
   }

   @Nullable
   public Entity method17480(World var1) {
      return var1.method6774(this.field24674);
   }
}
