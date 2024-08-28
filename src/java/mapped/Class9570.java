package mapped;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public final class Class9570 {
   private final Class2003 field44563;
   private Class7450 field44564 = Class4865.field22669;
   private final List<Class8126> field44565 = new ArrayList<Class8126>();

   public Class9570() {
      this(UUID.randomUUID().toString());
   }

   public Class9570(String var1) {
      this.field44563 = Class2003.method8433(var1);
   }

   public Class9570 method37107(Class7450 var1) {
      if (var1 != null) {
         if (var1.method24083().equals("multipart")) {
            this.field44564 = var1;
            return this;
         } else {
            throw new IllegalArgumentException("multipart != " + var1);
         }
      } else {
         throw new NullPointerException("type == null");
      }
   }

   public Class9570 method37108(Class4864 var1) {
      return this.method37112(Class8126.method28148(var1));
   }

   public Class9570 method37109(Class9371 var1, Class4864 var2) {
      return this.method37112(Class8126.method28149(var1, var2));
   }

   public Class9570 method37110(String var1, String var2) {
      return this.method37112(Class8126.method28150(var1, var2));
   }

   public Class9570 method37111(String var1, String var2, Class4864 var3) {
      return this.method37112(Class8126.method28151(var1, var2, var3));
   }

   public Class9570 method37112(Class8126 var1) {
      if (var1 != null) {
         this.field44565.add(var1);
         return this;
      } else {
         throw new NullPointerException("part == null");
      }
   }

   public Class4865 method37113() {
      if (!this.field44565.isEmpty()) {
         return new Class4865(this.field44563, this.field44564, this.field44565);
      } else {
         throw new IllegalStateException("Multipart body must have at least one part.");
      }
   }
}
