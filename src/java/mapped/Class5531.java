package mapped;

import java.io.IOException;
import net.minecraft.util.text.ITextComponent;

public class Class5531 implements Packet<Class5116> {
   private static String[] field24534;
   private ITextComponent field24535;
   private ITextComponent field24536;

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24535 = var1.method35710();
      this.field24536 = var1.method35710();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.method35711(this.field24535);
      var1.method35711(this.field24536);
   }

   public void method17180(Class5116 var1) {
      var1.method15760(this);
   }

   public ITextComponent method17391() {
      return this.field24535;
   }

   public ITextComponent method17392() {
      return this.field24536;
   }
}
