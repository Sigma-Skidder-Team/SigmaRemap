package remapped;

import java.io.IOException;
import java.util.List;

public final class class_3805 implements class_8047 {
   private final List<class_9833> field_18627;
   private final class_327 field_18626;
   private final class_9328 field_18630;
   private final class_1617 field_18632;
   private final int field_18629;
   private final class_3918 field_18631;
   private int field_18628;

   public class_3805(List<class_9833> var1, class_327 var2, class_9328 var3, class_1617 var4, int var5, class_3918 var6) {
      this.field_18627 = var1;
      this.field_18632 = var4;
      this.field_18626 = var2;
      this.field_18630 = var3;
      this.field_18629 = var5;
      this.field_18631 = var6;
   }

   @Override
   public class_4667 method_36515() {
      return this.field_18632;
   }

   public class_327 method_17718() {
      return this.field_18626;
   }

   public class_9328 method_17720() {
      return this.field_18630;
   }

   @Override
   public class_3918 method_36516() {
      return this.field_18631;
   }

   @Override
   public class_7839 method_36514(class_3918 var1) throws IOException {
      return this.method_17719(var1, this.field_18626, this.field_18630, this.field_18632);
   }

   public class_7839 method_17719(class_3918 var1, class_327 var2, class_9328 var3, class_1617 var4) throws IOException {
      if (this.field_18629 < this.field_18627.size()) {
         this.field_18628++;
         if (this.field_18630 != null && !this.field_18632.method_7212(var1.method_18136())) {
            throw new IllegalStateException("network interceptor " + this.field_18627.get(this.field_18629 - 1) + " must retain the same host and port");
         } else if (this.field_18630 != null && this.field_18628 > 1) {
            throw new IllegalStateException("network interceptor " + this.field_18627.get(this.field_18629 - 1) + " must call proceed() exactly once");
         } else {
            class_3805 var7 = new class_3805(this.field_18627, var2, var3, var4, this.field_18629 + 1, var1);
            class_9833 var8 = this.field_18627.get(this.field_18629);
            class_7839 var9 = var8.method_45321(var7);
            if (var3 != null && this.field_18629 + 1 < this.field_18627.size() && var7.field_18628 != 1) {
               throw new IllegalStateException("network interceptor " + var8 + " must call proceed() exactly once");
            } else if (var9 != null) {
               return var9;
            } else {
               throw new NullPointerException("interceptor " + var8 + " returned null");
            }
         }
      } else {
         throw new AssertionError();
      }
   }
}
