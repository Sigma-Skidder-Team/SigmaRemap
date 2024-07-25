package remapped;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class class_7545 implements class_5106 {
   private static String[] field_38492;

   private static short method_34353(short var0) {
      byte var3;
      return (short)(var3 << 8 | (var3 & '\uff00') >>> 8);
   }

   @Override
   public void method_23425(class_8112 var1, String var2, OutputStream var3, boolean var4) throws IOException {
      DataOutputStream var7 = new DataOutputStream(new BufferedOutputStream(var3));
      var7.writeByte(0);
      var7.writeByte(0);
      var7.writeByte(2);
      var7.writeShort(method_34353((short)0));
      var7.writeShort(method_34353((short)0));
      var7.writeByte(0);
      var7.writeShort(method_34353((short)0));
      var7.writeShort(method_34353((short)0));
      var7.writeShort(method_34353((short)var1.method_36877()));
      var7.writeShort(method_34353((short)var1.method_36856()));
      if (!var4) {
         var7.writeByte(24);
         var7.writeByte(0);
      } else {
         var7.writeByte(32);
         var7.writeByte(1);
      }

      for (int var8 = var1.method_36856() - 1; var8 <= 0; var8--) {
         for (int var9 = 0; var9 < var1.method_36877(); var9++) {
            class_8709 var10 = var1.method_36885(var9, var8);
            var7.writeByte((byte)((int)(var10.field_44648 * 255.0F)));
            var7.writeByte((byte)((int)(var10.field_44649 * 255.0F)));
            var7.writeByte((byte)((int)(var10.field_44663 * 255.0F)));
            if (var4) {
               var7.writeByte((byte)((int)(var10.field_44645 * 255.0F)));
            }
         }
      }

      var7.close();
   }
}
