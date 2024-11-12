package mapped;

import com.google.common.collect.UnmodifiableIterator;
import java.nio.ByteBuffer;

public class Class8154 {
   public static String method28289(BufferBuilder var0) {
      int var3 = var0.method17080();
      String var4 = "";
      byte var5 = -1;
      if (var3 != 7) {
         if (var3 != 4) {
            return "Invalid draw mode: " + var3;
         }

         var4 = "triangle";
         var5 = 3;
      } else {
         var4 = "quad";
         var5 = 4;
      }

      StringBuffer var6 = new StringBuffer();
      int var7 = var0.method17081();

      for (int var8 = 0; var8 < var7; var8++) {
         if (var8 % var5 == 0) {
            var6.append(var4 + " " + var8 / var5 + "\n");
         }

         String var9 = method28290(var8, var0);
         var6.append(var9);
         var6.append("\n");
      }

      return var6.toString();
   }

   private static String method28290(int var0, BufferBuilder var1) {
      StringBuffer var4 = new StringBuffer();
      ByteBuffer var5 = var1.method17082();
      VertexFormat var6 = var1.method17089();
      int var7 = var1.method17090() + var0 * var6.getSize();
      UnmodifiableIterator var8 = var6.method26217().iterator();

      while (var8.hasNext()) {
         VertexFormatElement var9 = (VertexFormatElement)var8.next();
         if (var9.method28522() > 0) {
            var4.append("(");
         }

         for (int var10 = 0; var10 < var9.method28522(); var10++) {
            if (var10 > 0) {
               var4.append(" ");
            }

            switch (Class9604.field44924[var9.method28516().ordinal()]) {
               case 1:
                  var4.append(var5.getFloat(var7));
                  break;
               case 2:
               case 3:
                  var4.append(var5.get(var7));
                  break;
               case 4:
               case 5:
                  var4.append(var5.getShort(var7));
                  break;
               case 6:
               case 7:
                  var4.append(var5.getShort(var7));
                  break;
               default:
                  var4.append("??");
            }

            var7 += var9.method28516().method8707();
         }

         if (var9.method28522() > 0) {
            var4.append(")");
         }
      }

      return var4.toString();
   }
}
