package remapped;

public final class class_6747 {
   public boolean field_34825;
   public String[] field_34829;
   public String[] field_34828;
   public boolean field_34826;

   public class_6747(boolean var1) {
      this.field_34825 = var1;
   }

   public class_6747(class_5083 var1) {
      this.field_34825 = var1.field_26240;
      this.field_34829 = var1.field_26243;
      this.field_34828 = var1.field_26241;
      this.field_34826 = var1.field_26239;
   }

   public class_6747 method_30909() {
      if (this.field_34825) {
         this.field_34829 = null;
         return this;
      } else {
         throw new IllegalStateException("no cipher suites for cleartext connections");
      }
   }

   public class_6747 method_30914(class_7463... var1) {
      if (!this.field_34825) {
         throw new IllegalStateException("no cipher suites for cleartext connections");
      } else {
         String[] var4 = new String[var1.length];

         for (int var5 = 0; var5 < var1.length; var5++) {
            var4[var5] = var1[var5].field_38029;
         }

         return this.method_30913(var4);
      }
   }

   public class_6747 method_30913(String... var1) {
      if (this.field_34825) {
         if (var1.length != 0) {
            this.field_34829 = (String[])var1.clone();
            return this;
         } else {
            throw new IllegalArgumentException("At least one cipher suite is required");
         }
      } else {
         throw new IllegalStateException("no cipher suites for cleartext connections");
      }
   }

   public class_6747 method_30910() {
      if (this.field_34825) {
         this.field_34828 = null;
         return this;
      } else {
         throw new IllegalStateException("no TLS versions for cleartext connections");
      }
   }

   public class_6747 method_30908(class_5010... var1) {
      if (!this.field_34825) {
         throw new IllegalStateException("no TLS versions for cleartext connections");
      } else {
         String[] var4 = new String[var1.length];

         for (int var5 = 0; var5 < var1.length; var5++) {
            var4[var5] = var1[var5].field_25911;
         }

         return this.method_30907(var4);
      }
   }

   public class_6747 method_30907(String... var1) {
      if (this.field_34825) {
         if (var1.length != 0) {
            this.field_34828 = (String[])var1.clone();
            return this;
         } else {
            throw new IllegalArgumentException("At least one TLS version is required");
         }
      } else {
         throw new IllegalStateException("no TLS versions for cleartext connections");
      }
   }

   public class_6747 method_30912(boolean var1) {
      if (this.field_34825) {
         this.field_34826 = var1;
         return this;
      } else {
         throw new IllegalStateException("no TLS extensions for cleartext connections");
      }
   }

   public class_5083 method_30906() {
      return new class_5083(this);
   }
}
