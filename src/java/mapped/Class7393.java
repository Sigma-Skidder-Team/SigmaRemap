package mapped;

import io.netty.buffer.Unpooled;
import java.util.Collection;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class7393 {
   private static String[] field31651;
   private static final Logger field31652 = LogManager.getLogger();

   public static void method23610(Class1657 var0, BlockPos var1, String var2, int var3, int var4) {
      PacketBuffer var7 = new PacketBuffer(Unpooled.buffer());
      var7.method35708(var1);
      var7.writeInt(var3);
      var7.method35729(var2);
      var7.writeInt(var4);
      method23625(var0, var7, Class5532.field24551);
   }

   public static void method23611(Class1657 var0) {
      PacketBuffer var3 = new PacketBuffer(Unpooled.buffer());
      method23625(var0, var3, Class5532.field24552);
   }

   public static void method23612(Class1657 var0, Class7481 var1) {
   }

   public static void method23613(Class1657 var0, BlockPos var1) {
      method23616(var0, var1);
   }

   public static void method23614(Class1657 var0, BlockPos var1) {
      method23616(var0, var1);
   }

   public static void method23615(Class1657 var0, BlockPos var1) {
      method23616(var0, var1);
   }

   private static void method23616(Class1657 var0, BlockPos var1) {
   }

   public static void method23617(Class1655 var0, Class1006 var1, Class8238 var2, float var3) {
   }

   public static void method23618(Class1655 var0, BlockPos var1) {
   }

   public static void method23619(Class1658 var0, Class5444<?> var1) {
   }

   public static void method23620(Class1655 var0, Class1006 var1, Class6603 var2) {
      if (!(var0 instanceof Class1657)) {
      }
   }

   public static void method23621(Class1657 var0, Collection<Class7699> var1) {
   }

   public static void method23622(Class880 var0) {
   }

   public static void method23623(Class1017 var0) {
   }

   public static void method23624(Class962 var0) {
   }

   private static void method23625(Class1657 var0, PacketBuffer var1, ResourceLocation var2) {
      Class5532 var5 = new Class5532(var2, var1);

      for (PlayerEntity var7 : var0.method6970().method6870()) {
         ((Class878)var7).field4855.method15671(var5);
      }
   }
}
