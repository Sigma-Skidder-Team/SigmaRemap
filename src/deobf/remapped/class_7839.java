package remapped;

import java.io.Closeable;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public final class class_7839 implements Closeable {
   public final class_3918 field_39741;
   public final class_7976 field_39750;
   public final int field_39749;
   public final String field_39748;
   public final class_442 field_39737;
   public final class_8121 field_39739;
   public final class_8856 field_39747;
   public final class_7839 field_39744;
   public final class_7839 field_39738;
   public final class_7839 field_39742;
   public final long field_39740;
   public final long field_39746;
   private volatile class_1766 field_39745;

   public class_7839(class_7775 var1) {
      this.field_39741 = var1.field_39412;
      this.field_39750 = var1.field_39411;
      this.field_39749 = var1.field_39414;
      this.field_39748 = var1.field_39408;
      this.field_39737 = var1.field_39410;
      this.field_39739 = var1.field_39409.method_33781();
      this.field_39747 = var1.field_39417;
      this.field_39744 = var1.field_39407;
      this.field_39738 = var1.field_39415;
      this.field_39742 = var1.field_39416;
      this.field_39740 = var1.field_39418;
      this.field_39746 = var1.field_39419;
   }

   public class_3918 method_35474() {
      return this.field_39741;
   }

   public class_7976 method_35483() {
      return this.field_39750;
   }

   public int method_35490() {
      return this.field_39749;
   }

   public boolean method_35491() {
      return this.field_39749 >= 200 && this.field_39749 < 300;
   }

   public String method_35476() {
      return this.field_39748;
   }

   public class_442 method_35489() {
      return this.field_39737;
   }

   public List<String> method_35480(String var1) {
      return this.field_39739.values(var1);
   }

   @Nullable
   public String method_35472(String var1) {
      return this.method_35473(var1, null);
   }

   @Nullable
   public String method_35473(String var1, String var2) {
      String var5 = this.field_39739.method_36955(var1);
      return var5 == null ? var2 : var5;
   }

   public class_8121 method_35479() {
      return this.field_39739;
   }

   public class_8856 method_35477(long var1) throws IOException {
      class_8067 var5 = this.field_39747.method_40735();
      var5.method_36591(var1);
      class_7059 var6 = var5.method_18234().clone();
      class_7059 var7;
      if (var6.method_32468() <= var1) {
         var7 = var6;
      } else {
         var7 = new class_7059();
         var7.method_19191(var6, var1);
         var6.method_32455();
      }

      return class_8856.method_40731(this.field_39747.method_40738(), var7.method_32468(), var7);
   }

   @Nullable
   public class_8856 method_35481() {
      return this.field_39747;
   }

   public class_7775 method_35485() {
      return new class_7775(this);
   }

   public boolean method_35475() {
      switch (this.field_39749) {
         case 300:
         case 301:
         case 302:
         case 303:
         case 307:
         case 308:
            return true;
         case 304:
         case 305:
         case 306:
         default:
            return false;
      }
   }

   @Nullable
   public class_7839 method_35484() {
      return this.field_39744;
   }

   @Nullable
   public class_7839 method_35487() {
      return this.field_39738;
   }

   @Nullable
   public class_7839 method_35482() {
      return this.field_39742;
   }

   public List<class_9814> method_35486() {
      String var3;
      if (this.field_39749 != 401) {
         if (this.field_39749 != 407) {
            return Collections.<class_9814>emptyList();
         }

         var3 = "Proxy-Authenticate";
      } else {
         var3 = "WWW-Authenticate";
      }

      return class_4464.method_20713(this.method_35479(), var3);
   }

   public class_1766 method_35470() {
      class_1766 var3 = this.field_39745;
      return var3 == null ? (this.field_39745 = class_1766.method_7888(this.field_39739)) : var3;
   }

   public long method_35478() {
      return this.field_39740;
   }

   public long method_35471() {
      return this.field_39746;
   }

   @Override
   public void close() {
      this.field_39747.close();
   }

   @Override
   public String toString() {
      return "Response{protocol="
         + this.field_39750
         + ", code="
         + this.field_39749
         + ", message="
         + this.field_39748
         + ", url="
         + this.field_39741.method_18136()
         + '}';
   }
}
