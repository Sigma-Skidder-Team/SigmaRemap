package remapped;

import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class class_236 {
   private static final Supplier<Set<class_236>> field_776 = Suppliers.memoize(
      () -> class_8669.field_44425.method_39801().<class_236>map(class_4466::method_20723).collect(Collectors.toSet())
   );
   public static final Predicate<class_236> field_772 = var0 -> field_776.get().contains(var0);
   public static final Predicate<class_236> field_768 = var0 -> true;
   private static final Set<class_2522> field_766 = ImmutableList.of(
         class_4783.field_23526,
         class_4783.field_23518,
         class_4783.field_23723,
         class_4783.field_23342,
         class_4783.field_23789,
         class_4783.field_23369,
         class_4783.field_23303,
         class_4783.field_23246,
         class_4783.field_23677,
         class_4783.field_23226,
         class_4783.field_23377,
         class_4783.field_23158,
         new class_6414[]{class_4783.field_23489, class_4783.field_23332, class_4783.field_23346, class_4783.field_23758}
      )
      .stream()
      .<class_2522>flatMap(var0 -> var0.method_29306().method_36441().stream())
      .filter(var0 -> var0.<class_7095>method_10313(class_3633.field_17729) == class_7095.field_36603)
      .collect(ImmutableSet.toImmutableSet());
   private static final Map<class_2522, class_236> field_774 = Maps.newHashMap();
   public static final class_236 field_763 = method_1002("unemployed", ImmutableSet.of(), 1, field_772, 1);
   public static final class_236 field_764 = method_1001("armorer", method_1005(class_4783.field_23557), 1, 1);
   public static final class_236 field_765 = method_1001("butcher", method_1005(class_4783.field_23203), 1, 1);
   public static final class_236 field_759 = method_1001("cartographer", method_1005(class_4783.field_23431), 1, 1);
   public static final class_236 field_791 = method_1001("cleric", method_1005(class_4783.field_23504), 1, 1);
   public static final class_236 field_789 = method_1001("farmer", method_1005(class_4783.field_23274), 1, 1);
   public static final class_236 field_773 = method_1001("fisherman", method_1005(class_4783.field_23641), 1, 1);
   public static final class_236 field_786 = method_1001("fletcher", method_1005(class_4783.field_23280), 1, 1);
   public static final class_236 field_779 = method_1001("leatherworker", method_1005(class_4783.field_23673), 1, 1);
   public static final class_236 field_790 = method_1001("librarian", method_1005(class_4783.field_23566), 1, 1);
   public static final class_236 field_761 = method_1001("mason", method_1005(class_4783.field_23478), 1, 1);
   public static final class_236 field_781 = method_1001("nitwit", ImmutableSet.of(), 1, 1);
   public static final class_236 field_787 = method_1001("shepherd", method_1005(class_4783.field_23853), 1, 1);
   public static final class_236 field_785 = method_1001("toolsmith", method_1005(class_4783.field_23646), 1, 1);
   public static final class_236 field_780 = method_1001("weaponsmith", method_1005(class_4783.field_23461), 1, 1);
   public static final class_236 field_778 = method_1001("home", field_766, 1, 1);
   public static final class_236 field_783 = method_1001("meeting", method_1005(class_4783.field_23870), 32, 6);
   public static final class_236 field_769 = method_1001("beehive", method_1005(class_4783.field_23338), 0, 1);
   public static final class_236 field_784 = method_1001("bee_nest", method_1005(class_4783.field_23611), 0, 1);
   public static final class_236 field_782 = method_1001("nether_portal", method_1005(class_4783.field_23588), 0, 1);
   public static final class_236 field_775 = method_1001("lodestone", method_1005(class_4783.field_23852), 0, 1);
   public static final Set<class_2522> field_762 = new ObjectOpenHashSet(field_774.keySet());
   private final String field_788;
   private final Set<class_2522> field_760;
   private final int field_767;
   private final Predicate<class_236> field_771;
   private final int field_770;

   private static Set<class_2522> method_1005(class_6414 var0) {
      return ImmutableSet.copyOf(var0.method_29306().method_36441());
   }

   private class_236(String var1, Set<class_2522> var2, int var3, Predicate<class_236> var4, int var5) {
      this.field_788 = var1;
      this.field_760 = ImmutableSet.copyOf(var2);
      this.field_767 = var3;
      this.field_771 = var4;
      this.field_770 = var5;
   }

   private class_236(String var1, Set<class_2522> var2, int var3, int var4) {
      this.field_788 = var1;
      this.field_760 = ImmutableSet.copyOf(var2);
      this.field_767 = var3;
      this.field_771 = var1x -> var1x == this;
      this.field_770 = var4;
   }

   public int method_1000() {
      return this.field_767;
   }

   public Predicate<class_236> method_1007() {
      return this.field_771;
   }

   public int method_1006() {
      return this.field_770;
   }

   @Override
   public String toString() {
      return this.field_788;
   }

   private static class_236 method_1001(String var0, Set<class_2522> var1, int var2, int var3) {
      return method_1008(class_8669.<class_236, class_236>method_39792(class_8669.field_44430, new class_4639(var0), new class_236(var0, var1, var2, var3)));
   }

   private static class_236 method_1002(String var0, Set<class_2522> var1, int var2, Predicate<class_236> var3, int var4) {
      return method_1008(
         class_8669.<class_236, class_236>method_39792(class_8669.field_44430, new class_4639(var0), new class_236(var0, var1, var2, var3, var4))
      );
   }

   private static class_236 method_1008(class_236 var0) {
      var0.field_760.forEach(var1 -> {
         class_236 var4 = field_774.put(var1, var0);
         if (var4 != null) {
            throw (IllegalStateException)class_9665.method_44658(new IllegalStateException(String.format("%s is defined in too many tags", var1)));
         }
      });
      return var0;
   }

   public static Optional<class_236> method_1004(class_2522 var0) {
      return Optional.<class_236>ofNullable(field_774.get(var0));
   }
}
