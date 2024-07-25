package remapped;

import java.io.Closeable;
import java.io.IOException;
import javax.annotation.Nullable;

public final class class_8748 implements Closeable {
   private static String[] field_44780;
   private final String field_44776;
   private final long field_44781;
   private final class_5322[] field_44777;
   private final long[] field_44778;

   public class_8748(class_3034 var1, String var2, long var3, class_5322[] var5, long[] var6) {
      this.field_44779 = var1;
      this.field_44776 = var2;
      this.field_44781 = var3;
      this.field_44777 = var5;
      this.field_44778 = var6;
   }

   public String method_40155() {
      return this.field_44776;
   }

   @Nullable
   public class_1469 method_40152() throws IOException {
      return this.field_44779.method_13845(this.field_44776, this.field_44781);
   }

   public class_5322 method_40153(int var1) {
      return this.field_44777[var1];
   }

   public long method_40157(int var1) {
      return this.field_44778[var1];
   }

   @Override
   public void close() {
      for (class_5322 var6 : this.field_44777) {
         class_8515.method_39200(var6);
      }
   }
}
