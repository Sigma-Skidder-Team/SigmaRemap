package remapped;

import java.io.RandomAccessFile;
import java.util.List;
import java.util.Map;

public class class_166 {
   private static final String field_500 = "usage:\nnet.sourceforge.jaad.MP4Info [options] <infile>\n\n\t-b\talso print all boxes";

   public static void main(String[] var0) {
      try {
         if (var0.length < 1) {
            method_666();
         } else {
            boolean var3 = false;
            String var4;
            if (var0.length > 1) {
               if (var0[0].equals("-b")) {
                  var3 = true;
               } else {
                  method_666();
               }

               var4 = var0[1];
            } else {
               var4 = var0[0];
            }

            class_4791 var5 = new class_4791(new RandomAccessFile(var4, "r"));
            class_5111 var6 = var5.method_22093();
            System.out.println("Movie:");
            List var7 = var6.method_23445();

            for (int var8 = 0; var8 < var7.size(); var8++) {
               class_1856 var9 = (class_1856)var7.get(var8);
               System.out
                  .println("\tTrack " + var8 + ": " + var9.method_8217() + " (language: " + var9.method_8215() + ", created: " + var9.method_8207() + ")");
               class_623 var10 = var9.method_8203();
               if (var10 != null) {
                  System.out.println("\t\tprotection: " + var10.method_2905());
               }
            }

            if (var6.method_23443()) {
               System.out.println("\tMetadata:");
               Map var14 = var6.method_23438().method_30666();

               for (class_3553 var11 : var14.keySet()) {
                  if (var11.equals(class_3553.field_17415)) {
                     List var12 = (List)var14.get(class_3553.field_17415);
                     System.out.println("\t\t" + var12.size() + " Cover Artworks present");
                  } else {
                     System.out.println("\t\t" + var11.method_16531() + " = " + var14.get(var11));
                  }
               }
            }

            List var15 = var6.method_23437();
            if (var15.size() > 0) {
               System.out.println("\tprotections:");

               for (class_623 var19 : var15) {
                  System.out.println("\t\t" + var19.method_2905());
               }
            }

            if (var3) {
               System.out.println("================================");

               for (class_7641 var20 : var5.method_22094()) {
                  method_665(var20, 0);
               }
            }
         }
      } catch (Exception var13) {
         var13.printStackTrace();
         System.err.println("error while reading file: " + var13.toString());
      }
   }

   private static void method_666() {
      System.out.println("usage:\nnet.sourceforge.jaad.MP4Info [options] <infile>\n\n\t-b\talso print all boxes");
      System.exit(1);
   }

   private static void method_665(class_7641 var0, int var1) {
      StringBuilder var4 = new StringBuilder();

      for (int var5 = 0; var5 < var1; var5++) {
         var4.append("  ");
      }

      var4.append(var0.toString());
      System.out.println(var4.toString());

      for (class_7641 var6 : var0.method_34611()) {
         method_665(var6, var1 + 1);
      }
   }
}
