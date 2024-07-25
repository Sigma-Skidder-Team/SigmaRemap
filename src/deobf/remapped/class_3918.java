package remapped;

import java.util.List;
import javax.annotation.Nullable;

public final class class_3918 {
   public final class_1672 field_19037;
   public final String field_19036;
   public final class_8121 field_19035;
   public final class_9001 field_19039;
   public final Object field_19034;
   private volatile class_1766 field_19038;

   public class_3918(class_2415 var1) {
      this.field_19037 = var1.field_12017;
      this.field_19036 = var1.field_12020;
      this.field_19035 = var1.field_12018.method_33781();
      this.field_19039 = var1.field_12016;
      this.field_19034 = var1.field_12015 == null ? this : var1.field_12015;
   }

   public class_1672 method_18136() {
      return this.field_19037;
   }

   public String method_18137() {
      return this.field_19036;
   }

   public class_8121 method_18138() {
      return this.field_19035;
   }

   public String method_18135(String var1) {
      return this.field_19035.method_36955(var1);
   }

   public List<String> method_18139(String var1) {
      return this.field_19035.values(var1);
   }

   @Nullable
   public class_9001 method_18133() {
      return this.field_19039;
   }

   public Object method_18134() {
      return this.field_19034;
   }

   public class_2415 method_18140() {
      return new class_2415(this);
   }

   public class_1766 method_18143() {
      class_1766 var3 = this.field_19038;
      return var3 == null ? (this.field_19038 = class_1766.method_7888(this.field_19035)) : var3;
   }

   public boolean method_18142() {
      return this.field_19037.method_7485();
   }

   @Override
   public String toString() {
      return "Request{method=" + this.field_19036 + ", url=" + this.field_19037 + ", tag=" + (this.field_19034 == this ? null : this.field_19034) + '}';
   }
}
