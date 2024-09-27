package mapped;

import io.netty.buffer.ByteBuf;

public class Class4778 extends BruhMotha<Class9695> {
   public Class4778() {
      super(Class9695.class);
   }

   public Class9695 method14894(ByteBuf var1) throws Exception {
      boolean var4 = var1.readBoolean();
      return var4 ? BruhMotha.field22551.method14894(var1) : null;
   }

   public void method14895(ByteBuf var1, Class9695 var2) throws Exception {
      var1.writeBoolean(var2 != null);
      if (var2 != null) {
         BruhMotha.field22551.method14895(var1, var2);
      }
   }
}
