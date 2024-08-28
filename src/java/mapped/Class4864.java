package mapped;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import javax.annotation.Nullable;

public abstract class Class4864 {
   @Nullable
   public abstract Class7450 method15007();

   public long method15008() throws IOException {
      return -1L;
   }

   public abstract void method15009(Class1733 var1) throws IOException;

   public static Class4864 method15010(Class7450 var0, String var1) {
      Charset var4 = Class9474.field44024;
      if (var0 != null) {
         var4 = var0.method24085();
         if (var4 == null) {
            var4 = Class9474.field44024;
            var0 = Class7450.method24082(var0 + "; charset=utf-8");
         }
      }

      byte[] var5 = var1.getBytes(var4);
      return method15012(var0, var5);
   }

   public static Class4864 method15011(Class7450 var0, Class2003 var1) {
      return new Class4863(var0, var1);
   }

   public static Class4864 method15012(Class7450 var0, byte[] var1) {
      return method15013(var0, var1, 0, var1.length);
   }

   public static Class4864 method15013(Class7450 var0, byte[] var1, int var2, int var3) {
      if (var1 != null) {
         Class9474.method36533((long)var1.length, (long)var2, (long)var3);
         return new Class4868(var0, var3, var1, var2);
      } else {
         throw new NullPointerException("content == null");
      }
   }

   public static Class4864 method15014(Class7450 var0, File var1) {
      if (var1 != null) {
         return new Class4866(var0, var1);
      } else {
         throw new NullPointerException("content == null");
      }
   }
}
