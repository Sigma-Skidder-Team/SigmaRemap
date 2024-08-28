package mapped;

import java.io.IOException;
import java.util.UUID;
import net.minecraft.util.text.ChatType;
import net.minecraft.util.text.ITextComponent;

public class SChatPacket implements Packet<Class5116> {
   private static String[] field24918;
   private ITextComponent field24919;
   private ChatType field24920;
   private UUID field24921;

   public SChatPacket() {
   }

   public SChatPacket(ITextComponent var1, ChatType var2, UUID var3) {
      this.field24919 = var1;
      this.field24920 = var2;
      this.field24921 = var3;
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24919 = var1.method35710();
      this.field24920 = ChatType.byId(var1.readByte());
      this.field24921 = var1.method35717();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.method35711(this.field24919);
      var1.writeByte(this.field24920.getId());
      var1.method35716(this.field24921);
   }

   public void method17180(Class5116 var1) {
      var1.method15706(this);
   }

   public ITextComponent method17648() {
      return this.field24919;
   }

   public boolean method17649() {
      return this.field24920 == ChatType.SYSTEM || this.field24920 == ChatType.GAME_INFO;
   }

   public ChatType method17650() {
      return this.field24920;
   }

   public UUID method17651() {
      return this.field24921;
   }

   @Override
   public boolean method17181() {
      return true;
   }
}
