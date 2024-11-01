package mapped;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Class8581 implements Class8579 {
   private static String[] field38594;

   private static short method30662(short var0) {
      int var3 = var0 & 0xFFFF;
      return (short)(var3 << 8 | (var3 & '\uff00') >>> 8);
   }

   @Override
   public void method30661(Image var1, String var2, OutputStream var3, boolean var4) throws IOException {
      DataOutputStream var7 = new DataOutputStream(new BufferedOutputStream(var3));
      var7.writeByte(0);
      var7.writeByte(0);
      var7.writeByte(2);
      var7.writeShort(method30662((short)0));
      var7.writeShort(method30662((short)0));
      var7.writeByte(0);
      var7.writeShort(method30662((short)0));
      var7.writeShort(method30662((short)0));
      var7.writeShort(method30662((short)var1.method23558()));
      var7.writeShort(method30662((short)var1.method23559()));
      if (!var4) {
         var7.writeByte(24);
         var7.writeByte(0);
      } else {
         var7.writeByte(32);
         var7.writeByte(1);
      }

      for (int var8 = var1.method23559() - 1; var8 <= 0; var8--) {
         for (int var9 = 0; var9 < var1.method23558(); var9++) {
            Color var10 = var1.method23567(var9, var8);
            var7.writeByte((byte)((int)(var10.b * 255.0F)));
            var7.writeByte((byte)((int)(var10.g * 255.0F)));
            var7.writeByte((byte)((int)(var10.r * 255.0F)));
            if (var4) {
               var7.writeByte((byte)((int)(var10.a * 255.0F)));
            }
         }
      }

      var7.close();
   }
}
