package mapped;

public final class Class9031 {
   public boolean field41324;
   public String[] field41325;
   public String[] field41326;
   public boolean field41327;

   public Class9031(boolean var1) {
      this.field41324 = var1;
   }

   public Class9031(Class8574 var1) {
      this.field41324 = var1.field38549;
      this.field41325 = var1.field38551;
      this.field41326 = var1.field38552;
      this.field41327 = var1.field38550;
   }

   public Class9031 method33440() {
      if (this.field41324) {
         this.field41325 = null;
         return this;
      } else {
         throw new IllegalStateException("no cipher suites for cleartext connections");
      }
   }

   public Class9031 method33441(Class9204... var1) {
      if (!this.field41324) {
         throw new IllegalStateException("no cipher suites for cleartext connections");
      } else {
         String[] var4 = new String[var1.length];

         for (int var5 = 0; var5 < var1.length; var5++) {
            var4[var5] = var1[var5].field42384;
         }

         return this.method33442(var4);
      }
   }

   public Class9031 method33442(String... var1) {
      if (this.field41324) {
         if (var1.length != 0) {
            this.field41325 = (String[])var1.clone();
            return this;
         } else {
            throw new IllegalArgumentException("At least one cipher suite is required");
         }
      } else {
         throw new IllegalStateException("no cipher suites for cleartext connections");
      }
   }

   public Class9031 method33443() {
      if (this.field41324) {
         this.field41326 = null;
         return this;
      } else {
         throw new IllegalStateException("no TLS versions for cleartext connections");
      }
   }

   public Class9031 method33444(Class2034... var1) {
      if (!this.field41324) {
         throw new IllegalStateException("no TLS versions for cleartext connections");
      } else {
         String[] var4 = new String[var1.length];

         for (int var5 = 0; var5 < var1.length; var5++) {
            var4[var5] = var1[var5].field13210;
         }

         return this.method33445(var4);
      }
   }

   public Class9031 method33445(String... var1) {
      if (this.field41324) {
         if (var1.length != 0) {
            this.field41326 = (String[])var1.clone();
            return this;
         } else {
            throw new IllegalArgumentException("At least one TLS version is required");
         }
      } else {
         throw new IllegalStateException("no TLS versions for cleartext connections");
      }
   }

   public Class9031 method33446(boolean var1) {
      if (this.field41324) {
         this.field41327 = var1;
         return this;
      } else {
         throw new IllegalStateException("no TLS extensions for cleartext connections");
      }
   }

   public Class8574 method33447() {
      return new Class8574(this);
   }
}
