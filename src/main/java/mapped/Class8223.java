package mapped;

import java.util.List;
import javax.annotation.Nullable;

public final class Class8223 {
   public final Class7284 field35315;
   public final String field35316;
   public final Class9371 field35317;
   public final Class4864 field35318;
   public final Object field35319;
   private volatile Class7319 field35320;

   public Class8223(Class7677 var1) {
      this.field35315 = var1.field32888;
      this.field35316 = var1.field32889;
      this.field35317 = var1.field32890.method34442();
      this.field35318 = var1.field32891;
      this.field35319 = var1.field32892 == null ? this : var1.field32892;
   }

   public Class7284 method28612() {
      return this.field35315;
   }

   public String method28613() {
      return this.field35316;
   }

   public Class9371 method28614() {
      return this.field35317;
   }

   public String method28615(String var1) {
      return this.field35317.method35544(var1);
   }

   public List<String> method28616(String var1) {
      return this.field35317.values(var1);
   }

   @Nullable
   public Class4864 method28617() {
      return this.field35318;
   }

   public Object method28618() {
      return this.field35319;
   }

   public Class7677 method28619() {
      return new Class7677(this);
   }

   public Class7319 method28620() {
      Class7319 var3 = this.field35320;
      return var3 == null ? (this.field35320 = Class7319.method23206(this.field35317)) : var3;
   }

   public boolean method28621() {
      return this.field35315.method22937();
   }

   @Override
   public String toString() {
      return "Request{method=" + this.field35316 + ", url=" + this.field35315 + ", tag=" + (this.field35319 == this ? null : this.field35319) + '}';
   }
}
