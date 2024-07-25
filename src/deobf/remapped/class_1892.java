package remapped;

import io.netty.buffer.Unpooled;
import java.util.Collection;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_1892 {
   private static String[] field_9567;
   private static final Logger field_9566 = LogManager.getLogger();

   public static void method_8436(class_6331 var0, BlockPos var1, String var2, int var3, int var4) {
      class_8248 var7 = new class_8248(Unpooled.buffer());
      var7.method_37770(var1);
      var7.writeInt(var3);
      var7.method_37760(var2);
      var7.writeInt(var4);
      method_8442(var0, var7, class_6197.field_31648);
   }

   public static void method_8438(class_6331 var0) {
      class_8248 var3 = new class_8248(Unpooled.buffer());
      method_8442(var0, var3, class_6197.field_31640);
   }

   public static void method_8446(class_6331 var0, class_2034 var1) {
   }

   public static void method_8434(class_6331 var0, BlockPos var1) {
      method_8437(var0, var1);
   }

   public static void method_8432(class_6331 var0, BlockPos var1) {
      method_8437(var0, var1);
   }

   public static void method_8433(class_6331 var0, BlockPos var1) {
      method_8437(var0, var1);
   }

   private static void method_8437(class_6331 var0, BlockPos var1) {
   }

   public static void method_8443(World var0, class_5886 var1, class_3998 var2, float var3) {
   }

   public static void method_8430(World var0, BlockPos var1) {
   }

   public static void method_8444(class_700 var0, class_3200<?> var1) {
   }

   public static void method_8439(World var0, class_5886 var1, class_782 var2) {
      if (!(var0 instanceof class_6331)) {
      }
   }

   public static void method_8431(class_6331 var0, Collection<class_2452> var1) {
   }

   public static void method_8440(class_5834 var0) {
   }

   public static void method_8435(class_8829 var0) {
   }

   public static void method_8441(class_5354 var0) {
   }

   private static void method_8442(class_6331 var0, class_8248 var1, Identifier var2) {
      class_6197 var5 = new class_6197(var2, var1);

      for (PlayerEntity var7 : var0.method_7066().method_25873()) {
         ((class_9359)var7).field_47794.method_4156(var5);
      }
   }
}
