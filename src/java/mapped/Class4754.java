package mapped;

import io.netty.buffer.ByteBuf;

public class Class4754 extends BruhMotha<Long> implements Class4755<Long> {
   public Class4754() {
      super("VarLong", Long.class);
   }

   public long method14901(ByteBuf var1) {
      long var4 = 0L;
      int var6 = 0;

      byte var7;
      do {
         var7 = var1.readByte();
         var4 |= (long)(var7 & 127) << var6++ * 7;
         if (var6 > 10) {
            throw new RuntimeException("VarLong too big");
         }
      } while ((var7 & 128) == 128);

      return var4;
   }

   public void method14902(ByteBuf var1, long var2) {
      do {
         int var6 = (int)(var2 & 127L);
         var2 >>>= 7;
         if (var2 != 0L) {
            var6 |= 128;
         }

         var1.writeByte(var6);
      } while (var2 != 0L);
   }

   @Deprecated
   public Long method14894(ByteBuf var1) {
      return this.method14901(var1);
   }

   @Deprecated
   public void method14895(ByteBuf var1, Long var2) {
      this.method14902(var1, var2);
   }

   public Long method14904(Object var1) {
      if (!(var1 instanceof Number)) {
         return !(var1 instanceof Boolean) ? (Long)var1 : !(Boolean)var1 ? 0L : 1L;
      } else {
         return ((Number)var1).longValue();
      }
   }
}
