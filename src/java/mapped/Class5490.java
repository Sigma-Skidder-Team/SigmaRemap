package mapped;

import java.io.IOException;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.ITextComponent$Serializer;

public class Class5490 implements Packet<Class5103> {
   private static String[] field24377;
   private ITextComponent field24378;

   public Class5490() {
   }

   public Class5490(ITextComponent var1) {
      this.field24378 = var1;
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24378 = ITextComponent$Serializer.func_240644_b_(var1.method35728(262144));
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.method35711(this.field24378);
   }

   public void method17180(Class5103 var1) {
      var1.method15590(this);
   }

   public ITextComponent method17270() {
      return this.field24378;
   }
}
