package remapped;

import java.io.Closeable;
import java.io.IOException;
import javax.annotation.Nullable;

public class class_4150 implements Closeable {
   private final class_9051 field_20192;
   private final class_5797 field_20190;
   private final IOException field_20189;

   public class_4150(IOException var1) {
      this.field_20189 = var1;
      this.field_20192 = null;
      this.field_20190 = null;
   }

   public class_4150(class_9051 var1, class_5797 var2) {
      this.field_20189 = null;
      this.field_20192 = var1;
      this.field_20190 = var2;
   }

   public static class_4150 method_19265(class_7832 var0, Identifier var1) {
      try (class_4038 var4 = var0.method_35458(var1)) {
         class_5797 var6 = class_5797.method_26230(var4.method_18576());
         class_9051 var7 = null;

         try {
            var7 = var4.<class_9051>method_18577(class_9051.field_46357);
         } catch (RuntimeException var19) {
            class_1809.method_8033().warn("Failed reading metadata of: {}", var1, var19);
         }

         return new class_4150(var7, var6);
      } catch (IOException var22) {
         return new class_4150(var22);
      }
   }

   @Nullable
   public class_9051 method_19267() {
      return this.field_20192;
   }

   public class_5797 method_19269() throws IOException {
      if (this.field_20189 == null) {
         return this.field_20190;
      } else {
         throw this.field_20189;
      }
   }

   @Override
   public void close() {
      if (this.field_20190 != null) {
         this.field_20190.close();
      }
   }

   public void method_19266() throws IOException {
      if (this.field_20189 != null) {
         throw this.field_20189;
      }
   }
}
