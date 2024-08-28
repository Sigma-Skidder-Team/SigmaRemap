package mapped;

import java.io.IOException;
import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;

public class Class5498 implements Packet<Class5116> {
   private static String[] field24401;
   private int field24402;
   private int field24403;
   private ITextComponent field24404;

   public Class5498() {
   }

   public Class5498(int var1, Class8298<?> var2, ITextComponent var3) {
      this.field24402 = var1;
      this.field24403 = Class2348.field16084.method9171(var2);
      this.field24404 = var3;
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24402 = var1.method35714();
      this.field24403 = var1.method35714();
      this.field24404 = var1.method35710();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeVarInt(this.field24402);
      var1.writeVarInt(this.field24403);
      var1.method35711(this.field24404);
   }

   public void method17180(Class5116 var1) {
      var1.method15776(this);
   }

   public int method17284() {
      return this.field24402;
   }

   @Nullable
   public Class8298<?> method17285() {
      return Class2348.field16084.method9172(this.field24403);
   }

   public ITextComponent method17286() {
      return this.field24404;
   }
}
