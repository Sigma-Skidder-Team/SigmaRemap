package remapped;

import com.google.common.collect.UnmodifiableIterator;
import java.nio.ByteBuffer;

public class class_3768 {
   public static String method_17443(class_9633 var0) {
      int var3 = var0.method_44472();
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
      int var7 = var0.method_44478();

      for (int var8 = 0; var8 < var7; var8++) {
         if (var8 % var5 == 0) {
            var6.append(var4 + " " + var8 / var5 + "\n");
         }

         String var9 = method_17444(var8, var0);
         var6.append(var9);
         var6.append("\n");
      }

      return var6.toString();
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private static String method_17444(int var0, class_9633 var1) {
      StringBuffer var4 = new StringBuffer();
      ByteBuffer var5 = var1.method_44465();
      class_2868 var6 = var1.method_44458();
      int var7 = var1.method_44459() + var0 * var6.method_13168();
      UnmodifiableIterator var8 = var6.method_13174().iterator();

      while (var8.hasNext()) {
         class_3884 var9 = (class_3884)var8.next();
         if (var9.method_17958() > 0) {
            var4.append("(");
         }

         for (int var10 = 0; var10 < var9.method_17958(); var10++) {
            if (var10 > 0) {
               var4.append(" ");
            }

            switch (var9.method_17954()) {
               case field_11661:
                  var4.append(var5.getFloat(var7));
                  break;
               case field_11663:
               case field_11660:
                  var4.append(var5.get(var7));
                  break;
               case field_11657:
               case field_11655:
                  var4.append(var5.getShort(var7));
                  break;
               case field_11656:
               case field_11654:
                  var4.append(var5.getShort(var7));
                  break;
               default:
                  var4.append("??");
            }

            var7 += var9.method_17954().method_10685();
         }

         if (var9.method_17958() > 0) {
            var4.append(")");
         }
      }

      return var4.toString();
   }
}
