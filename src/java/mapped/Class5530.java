package mapped;

import java.io.IOException;
import net.minecraft.util.text.ITextComponent;

public class Class5530 implements Packet<Class5116> {
   private static String[] field24532;
   private ITextComponent field24533;

   public Class5530() {
   }

   public Class5530(ITextComponent var1) {
      this.field24533 = var1;
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24533 = var1.method35710();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.method35711(this.field24533);
   }

   public void method17180(Class5116 var1) {
      var1.method15716(this);
   }

   public ITextComponent method17390() {
      return this.field24533;
   }
}
