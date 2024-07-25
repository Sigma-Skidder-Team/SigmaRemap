package remapped;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class class_1235 implements Runnable {
   private static String[] field_6810;
   public static Thread field_6812 = new Thread(new class_1235());
   public static boolean field_6811 = false;
   public static HashMap<Object, Integer> field_6813;

   @Override
   public void run() {
      field_6813 = new HashMap<Object, Integer>();

      while (!Thread.currentThread().isInterrupted()) {
         try {
            Thread.sleep(150000L);
            if (Thread.currentThread().isInterrupted()) {
               break;
            }

            if (class_1893.method_8510().field_9601 != null) {
               boolean var3 = false;
               boolean var4 = false;
               if (SigmaMainClass.method_3328().method_3298() != null) {
                  ArrayList var5 = new ArrayList<class_9128>(SigmaMainClass.method_3328().method_3298().method_843().values());

                  for (class_9128 var7 : SigmaMainClass.method_3328().method_3298().method_843().values()) {
                     if (var7 instanceof class_3620) {
                        var5.addAll(Arrays.asList(((class_3620)var7).field_17661));
                     }
                  }

                  for (class_9128 var10 : var5) {
                     if (var10.getClass().getSuperclass() != class_9128.class && var10.getClass().getSuperclass() != class_3620.class) {
                        var3 = true;
                        if (field_6813.containsKey(var10) && field_6813.get(var10) != var10.method_41990()) {
                           var4 = true;
                        }

                        field_6813.put(var10, var10.method_41990());
                     }
                  }

                  if (var4 || !var3) {
                     field_6811 = true;
                  }
               }
            }
         } catch (InterruptedException var8) {
            Thread.currentThread().interrupt();
            break;
         }
      }
   }

   static {
      field_6812.start();
   }
}
