package mapped;

import java.io.IOException;
import java.util.List;

public class Class5553 implements Packet<Class5116> {
   private static String[] field24655;
   private int field24656;
   private List<Class9773<?>> field24657;

   public Class5553() {
   }

   public Class5553(int var1, Class9361 var2, boolean var3) {
      this.field24656 = var1;
      if (!var3) {
         this.field24657 = var2.method35449();
      } else {
         this.field24657 = var2.method35450();
         var2.method35457();
      }
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24656 = var1.method35714();
      this.field24657 = Class9361.method35452(var1);
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeVarInt(this.field24656);
      Class9361.method35448(this.field24657, var1);
   }

   public void method17180(Class5116 var1) {
      var1.method15738(this);
   }

   public List<Class9773<?>> method17469() {
      return this.field24657;
   }

   public int method17470() {
      return this.field24656;
   }
}
