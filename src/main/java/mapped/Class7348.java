package mapped;

public final class Class7348 {
   public String field31458;
   public String field31459;
   public long field31460 = 253402300799999L;
   public String field31461;
   public String field31462 = "/";
   public boolean field31463;
   public boolean field31464;
   public boolean field31465;
   public boolean field31466;

   public Class7348 method23294(String var1) {
      if (var1 != null) {
         if (var1.trim().equals(var1)) {
            this.field31458 = var1;
            return this;
         } else {
            throw new IllegalArgumentException("name is not trimmed");
         }
      } else {
         throw new NullPointerException("name == null");
      }
   }

   public Class7348 method23295(String var1) {
      if (var1 != null) {
         if (var1.trim().equals(var1)) {
            this.field31459 = var1;
            return this;
         } else {
            throw new IllegalArgumentException("value is not trimmed");
         }
      } else {
         throw new NullPointerException("value == null");
      }
   }

   public Class7348 method23296(long var1) {
      if (var1 <= 0L) {
         var1 = Long.MIN_VALUE;
      }

      if (var1 > 253402300799999L) {
         var1 = 253402300799999L;
      }

      this.field31460 = var1;
      this.field31465 = true;
      return this;
   }

   public Class7348 method23297(String var1) {
      return this.method23299(var1, false);
   }

   public Class7348 method23298(String var1) {
      return this.method23299(var1, true);
   }

   private Class7348 method23299(String var1, boolean var2) {
      if (var1 != null) {
         String var5 = Class9474.method36555(var1);
         if (var5 != null) {
            this.field31461 = var5;
            this.field31466 = var2;
            return this;
         } else {
            throw new IllegalArgumentException("unexpected domain: " + var1);
         }
      } else {
         throw new NullPointerException("domain == null");
      }
   }

   public Class7348 method23300(String var1) {
      if (var1.startsWith("/")) {
         this.field31462 = var1;
         return this;
      } else {
         throw new IllegalArgumentException("path must start with '/'");
      }
   }

   public Class7348 method23301() {
      this.field31463 = true;
      return this;
   }

   public Class7348 method23302() {
      this.field31464 = true;
      return this;
   }

   public Class9454 method23303() {
      return new Class9454(this);
   }
}
