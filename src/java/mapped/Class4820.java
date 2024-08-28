package mapped;

import io.netty.buffer.ByteBuf;

public class Class4820 extends Class4819 {
   public Class4820() {
      super("Item");
   }

   public Class9738 method14894(ByteBuf var1) throws Exception {
      short var4 = var1.readShort();
      if (var4 >= 0) {
         Class9738 var5 = new Class9738();
         var5.method38162(var4);
         var5.method38164(var1.readByte());
         var5.method38166(var1.readShort());
         var5.method38168(Class4750.field22555.method14894(var1));
         return var5;
      } else {
         return null;
      }
   }

   public void method14895(ByteBuf var1, Class9738 var2) throws Exception {
      if (var2 != null) {
         var1.writeShort(var2.method38161());
         var1.writeByte(var2.method38163());
         var1.writeShort(var2.method38165());
         Class4750.field22555.method14895(var1, var2.method38167());
      } else {
         var1.writeShort(-1);
      }
   }
}
