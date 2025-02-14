package mapped;

import java.io.RandomAccessFile;
import java.util.List;
import java.util.Map;

public class Class4534 {
   private static final String field21849 = "usage:\nnet.sourceforge.jaad.MP4Info [options] <infile>\n\n\t-b\talso print all boxes";

   public static void main(String[] var0) {
      try {
         if (var0.length < 1) {
            method14460();
         } else {
            boolean var3 = false;
            String var4;
            if (var0.length > 1) {
               if (var0[0].equals("-b")) {
                  var3 = true;
               } else {
                  method14460();
               }

               var4 = var0[1];
            } else {
               var4 = var0[0];
            }

            MP4Container var5 = new MP4Container(new RandomAccessFile(var4, "r"));
            Movie var6 = var5.getMovie();
            System.out.println("Movie:");
            List var7 = var6.getTracks();

            for (int var8 = 0; var8 < var7.size(); var8++) {
               Track var9 = (Track)var7.get(var8);
               System.out
                  .println("\tTrack " + var8 + ": " + var9.getCodec() + " (language: " + var9.method23317() + ", created: " + var9.method23315() + ")");
               Protection var10 = var9.method23322();
               if (var10 != null) {
                  System.out.println("\t\tprotection: " + var10.method19500());
               }
            }

            if (var6.method30675()) {
               System.out.println("\tMetadata:");
               Map<Class8076<?>, Object> var14 = var6.method30676().method33309();

               for (Class8076 var11 : var14.keySet()) {
                  if (var11.equals(Class8076.field34690)) {
                     List var12 = (List)var14.get(Class8076.field34690);
                     System.out.println("\t\t" + var12.size() + " Cover Artworks present");
                  } else {
                     System.out.println("\t\t" + var11.method27947() + " = " + var14.get(var11));
                  }
               }
            }

            List<Protection> var15 = var6.method30677();
            if (var15.size() > 0) {
               System.out.println("\tprotections:");

               for (Protection var19 : var15) {
                  System.out.println("\t\t" + var19.method19500());
               }
            }

            if (var3) {
               System.out.println("================================");

               for (Box var20 : var5.method30074()) {
                  method14461(var20, 0);
               }
            }
         }
      } catch (Exception var13) {
         var13.printStackTrace();
         System.err.println("error while reading file: " + var13.toString());
      }
   }

   private static void method14460() {
      System.out.println("usage:\nnet.sourceforge.jaad.MP4Info [options] <infile>\n\n\t-b\talso print all boxes");
      System.exit(1);
   }

   private static void method14461(Box var0, int var1) {
      StringBuilder var4 = new StringBuilder();

      for (int var5 = 0; var5 < var1; var5++) {
         var4.append("  ");
      }

      var4.append(var0.toString());
      System.out.println(var4.toString());

      for (Box var6 : var0.method15439()) {
         method14461(var6, var1 + 1);
      }
   }
}
