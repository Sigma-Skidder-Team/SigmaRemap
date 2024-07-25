package remapped;

import com.google.common.collect.ImmutableSet;
import javax.annotation.Nullable;

public class class_4466 {
   public static final class_4466 field_21775 = method_20722("none", class_236.field_763, (class_8461)null);
   public static final class_4466 field_21780 = method_20722("armorer", class_236.field_764, class_463.field_2261);
   public static final class_4466 field_21779 = method_20722("butcher", class_236.field_765, class_463.field_1964);
   public static final class_4466 field_21765 = method_20722("cartographer", class_236.field_759, class_463.field_2212);
   public static final class_4466 field_21773 = method_20722("cleric", class_236.field_791, class_463.field_2782);
   public static final class_4466 field_21783 = method_20721(
      "farmer",
      class_236.field_789,
      ImmutableSet.of(class_4897.field_24813, class_4897.field_24621, class_4897.field_24883, class_4897.field_24640),
      ImmutableSet.of(class_4783.field_23421),
      class_463.field_1921
   );
   public static final class_4466 field_21776 = method_20722("fisherman", class_236.field_773, class_463.field_2456);
   public static final class_4466 field_21764 = method_20722("fletcher", class_236.field_786, class_463.field_2419);
   public static final class_4466 field_21774 = method_20722("leatherworker", class_236.field_779, class_463.field_2034);
   public static final class_4466 field_21778 = method_20722("librarian", class_236.field_790, class_463.field_2484);
   public static final class_4466 field_21768 = method_20722("mason", class_236.field_761, class_463.field_2264);
   public static final class_4466 field_21771 = method_20722("nitwit", class_236.field_781, (class_8461)null);
   public static final class_4466 field_21782 = method_20722("shepherd", class_236.field_787, class_463.field_2060);
   public static final class_4466 field_21777 = method_20722("toolsmith", class_236.field_785, class_463.field_2530);
   public static final class_4466 field_21767 = method_20722("weaponsmith", class_236.field_780, class_463.field_2622);
   private final String field_21763;
   private final class_236 field_21769;
   private final ImmutableSet<class_2451> field_21772;
   private final ImmutableSet<class_6414> field_21781;
   private final class_8461 field_21770;

   private class_4466(String var1, class_236 var2, ImmutableSet<class_2451> var3, ImmutableSet<class_6414> var4, class_8461 var5) {
      this.field_21763 = var1;
      this.field_21769 = var2;
      this.field_21772 = var3;
      this.field_21781 = var4;
      this.field_21770 = var5;
   }

   public class_236 method_20723() {
      return this.field_21769;
   }

   public ImmutableSet<class_2451> method_20726() {
      return this.field_21772;
   }

   public ImmutableSet<class_6414> method_20724() {
      return this.field_21781;
   }

   @Nullable
   public class_8461 method_20727() {
      return this.field_21770;
   }

   @Override
   public String toString() {
      return this.field_21763;
   }

   public static class_4466 method_20722(String var0, class_236 var1, class_8461 var2) {
      return method_20721(var0, var1, ImmutableSet.of(), ImmutableSet.of(), var2);
   }

   public static class_4466 method_20721(String var0, class_236 var1, ImmutableSet<class_2451> var2, ImmutableSet<class_6414> var3, class_8461 var4) {
      return class_8669.<class_4466, class_4466>method_39792(class_8669.field_44425, new Identifier(var0), new class_4466(var0, var1, var2, var3, var4));
   }
}
