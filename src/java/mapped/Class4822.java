package mapped;

import io.netty.buffer.ByteBuf;

public class Class4822 extends Class4819 {
   public Class4822() {
      super("FlatVarIntItem");
   }

   public Class9738 method14894(ByteBuf var1) throws Exception {
      boolean var4 = var1.readBoolean();
      if (var4) {
         Class9738 var5 = new Class9738();
         var5.method38162(BruhMotha.field22544.method14907(var1));
         var5.method38164(var1.readByte());
         var5.method38168(BruhMotha.field22555.method14894(var1));
         return var5;
      } else {
         return null;
      }
   }

   public void method14895(ByteBuf var1, Class9738 var2) throws Exception {
      if (var2 != null) {
         var1.writeBoolean(true);
         BruhMotha.field22544.method14908(var1, var2.method38161());
         var1.writeByte(var2.method38163());
         BruhMotha.field22555.method14895(var1, var2.method38167());
      } else {
         var1.writeBoolean(false);
      }
   }
}
