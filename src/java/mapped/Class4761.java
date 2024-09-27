package mapped;

import io.netty.buffer.ByteBuf;

public class Class4761 extends BruhMotha<Integer> implements Class4755<Integer> {
   public Class4761() {
      super("VarInt", Integer.class);
   }

   public int method14907(ByteBuf var1) {
      int var4 = 0;
      int var5 = 0;

      byte var6;
      do {
         var6 = var1.readByte();
         var4 |= (var6 & 127) << var5++ * 7;
         if (var5 > 5) {
            throw new RuntimeException("VarInt too big");
         }
      } while ((var6 & 128) == 128);

      return var4;
   }

   public void method14908(ByteBuf var1, int var2) {
      do {
         int var5 = var2 & 127;
         var2 >>>= 7;
         if (var2 != 0) {
            var5 |= 128;
         }

         var1.writeByte(var5);
      } while (var2 != 0);
   }

   @Deprecated
   public Integer method14894(ByteBuf var1) {
      return this.method14907(var1);
   }

   @Deprecated
   public void method14895(ByteBuf var1, Integer var2) {
      this.method14908(var1, var2);
   }

   public Integer method14904(Object var1) {
      if (!(var1 instanceof Number)) {
         return !(var1 instanceof Boolean) ? (Integer)var1 : !(Boolean)var1 ? 0 : 1;
      } else {
         return ((Number)var1).intValue();
      }
   }
}
