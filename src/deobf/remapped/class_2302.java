package remapped;

import io.netty.buffer.ByteBuf;

public class class_2302 extends class_8039<Long> implements class_7305<Long> {
   public class_2302() {
      super("VarLong", Long.class);
   }

   public long method_10582(ByteBuf var1) {
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

   public void method_10583(ByteBuf var1, long var2) {
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
   public Long method_10586(ByteBuf var1) {
      return this.method_10582(var1);
   }

   @Deprecated
   public void method_10584(ByteBuf var1, Long var2) {
      this.method_10583(var1, var2);
   }

   public Long method_10585(Object var1) {
      if (!(var1 instanceof Number)) {
         return !(var1 instanceof Boolean) ? (Long)var1 : !(Boolean)var1 ? 0L : 1L;
      } else {
         return ((Number)var1).longValue();
      }
   }
}
