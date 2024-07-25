package remapped;

import com.google.common.base.Preconditions;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class class_412 {
   private static final Int2ObjectMap<class_412> field_1746 = new Int2ObjectOpenHashMap();
   public static final List<class_412> field_1753 = new ArrayList<class_412>();
   public static final class_412 field_1747 = method_2043(47, "1.8.x");
   public static final class_412 field_1724 = method_2043(107, "1.9");
   public static final class_412 field_1756 = method_2043(108, "1.9.1");
   public static final class_412 field_1757 = method_2043(109, "1.9.2");
   public static final class_412 field_1738 = method_2044(110, "1.9.3/4", new class_5433("1.9", 3, 4));
   public static final class_412 field_1729 = method_2043(210, "1.10.x");
   public static final class_412 field_1727 = method_2043(315, "1.11");
   public static final class_412 field_1752 = method_2044(316, "1.11.1/2", new class_5433("1.11", 1, 2));
   public static final class_412 field_1740 = method_2043(335, "1.12");
   public static final class_412 field_1739 = method_2043(338, "1.12.1");
   public static final class_412 field_1728 = method_2043(340, "1.12.2");
   public static final class_412 field_1751 = method_2043(393, "1.13");
   public static final class_412 field_1743 = method_2043(401, "1.13.1");
   public static final class_412 field_1737 = method_2043(404, "1.13.2");
   public static final class_412 field_1741 = method_2043(477, "1.14");
   public static final class_412 field_1725 = method_2043(480, "1.14.1");
   public static final class_412 field_1735 = method_2043(485, "1.14.2");
   public static final class_412 field_1734 = method_2043(490, "1.14.3");
   public static final class_412 field_1750 = method_2043(498, "1.14.4");
   public static final class_412 field_1759 = method_2043(573, "1.15");
   public static final class_412 field_1754 = method_2043(575, "1.15.1");
   public static final class_412 field_1726 = method_2043(578, "1.15.2");
   public static final class_412 field_1742 = method_2043(735, "1.16");
   public static final class_412 field_1749 = method_2043(736, "1.16.1");
   public static final class_412 field_1733 = method_2043(751, "1.16.2");
   public static final class_412 field_1730 = method_2043(753, "1.16.3");
   public static final class_412 field_1732 = method_2043(754, "1.16.4");
   public static final class_412 field_1748 = method_2043(-1, "UNKNOWN");
   private final int field_1744;
   private final int field_1755;
   private final String field_1736;
   private final boolean field_1758;
   private final Set<String> field_1745;

   public static class_412 method_2043(int var0, String var1) {
      return method_2041(var0, -1, var1);
   }

   public static class_412 method_2041(int var0, int var1, String var2) {
      return method_2042(var0, var1, var2, null);
   }

   public static class_412 method_2044(int var0, String var1, class_5433 var2) {
      return method_2042(var0, -1, var1, var2);
   }

   public static class_412 method_2042(int var0, int var1, String var2, class_5433 var3) {
      class_412 var6 = new class_412(var0, var1, var2, var3);
      field_1753.add(var6);
      field_1746.put(var6.method_2056(), var6);
      if (var6.method_2050()) {
         field_1746.put(var6.method_2039(), var6);
      }

      return var6;
   }

   public static boolean method_2054(int var0) {
      return field_1746.containsKey(var0);
   }

   @NotNull
   public static class_412 method_2051(int var0) {
      class_412 var3 = (class_412)field_1746.get(var0);
      return var3 == null ? new class_412(var0, "Unknown (" + var0 + ")") : var3;
   }

   public static int method_2037(class_412 var0) {
      return field_1753.indexOf(var0);
   }

   public static List<class_412> method_2040() {
      return Collections.<class_412>unmodifiableList(new ArrayList(field_1746.values()));
   }

   @Nullable
   public static class_412 method_2048(String var0) {
      ObjectIterator var3 = field_1746.values().iterator();

      while (var3.hasNext()) {
         class_412 var4 = (class_412)var3.next();
         String var5 = var4.method_2045();
         if (var5.equals(var0)) {
            return var4;
         }

         if (!var4.method_2049()) {
            if (var4.method_2038() && var4.method_2046().contains(var0)) {
               return var4;
            }
         } else {
            String var6 = var5.substring(0, var5.length() - 2);
            if (var6.equals(var0) || var0.startsWith(var5.substring(0, var5.length() - 1))) {
               return var4;
            }
         }
      }

      return null;
   }

   public class_412(int var1, String var2) {
      this(var1, -1, var2, null);
   }

   public class_412(int var1, int var2, String var3, class_5433 var4) {
      this.field_1744 = var1;
      this.field_1755 = var2;
      this.field_1736 = var3;
      this.field_1758 = var3.endsWith(".x");
      Preconditions.checkArgument(!this.field_1758 || var4 == null, "A version cannot be a wildcard and a range at the same time!");
      if (var4 == null) {
         this.field_1745 = Collections.<String>singleton(var3);
      } else {
         this.field_1745 = new HashSet<String>();

         for (int var7 = var4.method_24768(); var7 <= var4.method_24765(); var7++) {
            if (var7 == 0) {
               this.field_1745.add(var4.method_24767());
            }

            this.field_1745.add(var4.method_24767() + "." + var7);
         }
      }
   }

   public int method_2056() {
      return this.field_1744;
   }

   public int method_2052() {
      Preconditions.checkArgument(this.method_2050());
      return this.field_1755;
   }

   public int method_2039() {
      Preconditions.checkArgument(this.method_2050());
      return 1073741824 | this.field_1755;
   }

   public int method_2047() {
      return this.field_1755 != -1 ? 1073741824 | this.field_1755 : this.field_1744;
   }

   public boolean method_2038() {
      return this.field_1745.size() != 1;
   }

   public Set<String> method_2046() {
      return Collections.<String>unmodifiableSet(this.field_1745);
   }

   public boolean method_2049() {
      return this.field_1758;
   }

   public String method_2045() {
      return this.field_1736;
   }

   public boolean method_2050() {
      return this.field_1755 != -1;
   }

   @Deprecated
   public int method_2055() {
      return this.field_1744;
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            class_412 var4 = (class_412)var1;
            return this.field_1744 == var4.field_1744;
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      return this.field_1744;
   }

   @Override
   public String toString() {
      return String.format("%s(%d)", this.field_1736, this.field_1744);
   }
}
