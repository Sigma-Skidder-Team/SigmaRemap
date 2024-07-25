package remapped;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public final class class_8871 {
   private final class_9091 field_45351;
   private class_1972 field_45353 = class_5942.field_30316;
   private final List<class_3677> field_45354 = new ArrayList<class_3677>();

   public class_8871() {
      this(UUID.randomUUID().toString());
   }

   public class_8871(String var1) {
      this.field_45351 = class_9091.method_41889(var1);
   }

   public class_8871 method_40809(class_1972 var1) {
      if (var1 != null) {
         if (var1.method_9068().equals("multipart")) {
            this.field_45353 = var1;
            return this;
         } else {
            throw new IllegalArgumentException("multipart != " + var1);
         }
      } else {
         throw new NullPointerException("type == null");
      }
   }

   public class_8871 method_40812(class_9001 var1) {
      return this.method_40810(class_3677.method_17081(var1));
   }

   public class_8871 method_40811(class_8121 var1, class_9001 var2) {
      return this.method_40810(class_3677.method_17080(var1, var2));
   }

   public class_8871 method_40807(String var1, String var2) {
      return this.method_40810(class_3677.method_17078(var1, var2));
   }

   public class_8871 method_40808(String var1, String var2, class_9001 var3) {
      return this.method_40810(class_3677.method_17079(var1, var2, var3));
   }

   public class_8871 method_40810(class_3677 var1) {
      if (var1 != null) {
         this.field_45354.add(var1);
         return this;
      } else {
         throw new NullPointerException("part == null");
      }
   }

   public class_5942 method_40813() {
      if (!this.field_45354.isEmpty()) {
         return new class_5942(this.field_45351, this.field_45353, this.field_45354);
      } else {
         throw new IllegalStateException("Multipart body must have at least one part.");
      }
   }
}
