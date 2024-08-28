package mapped;

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

public class Class4913 {
   private static final Supplier<Set<Class4913>> field22746 = Suppliers.memoize(
      () -> Registry.field16090.method9192().<Class4913>map(Class8395::method29457).collect(Collectors.toSet())
   );
   public static final Predicate<Class4913> field22747 = var0 -> field22746.get().contains(var0);
   public static final Predicate<Class4913> field22748 = var0 -> true;
   private static final Set<Class7380> field22749 = ImmutableList.of(
         Blocks.RED_BED,
         Blocks.BLACK_BED,
         Blocks.BLUE_BED,
         Blocks.BROWN_RED,
         Blocks.CYAN_BED,
         Blocks.GRAY_BED,
         Blocks.GREEN_BED,
         Blocks.LIGHT_BLUE_BED,
         Blocks.LIGHT_GRAY_BED,
         Blocks.LIME_BED,
         Blocks.MAGENTA_BED,
         Blocks.ORANGE_BED,
         new Block[]{Blocks.PINK_BED, Blocks.PURPLE_BED, Blocks.WHITE_BED, Blocks.YELLOW_BED}
      )
      .stream()
      .<Class7380>flatMap(var0 -> var0.method11577().method35392().stream())
      .filter(var0 -> var0.<Class82>method23463(Class3250.field18713) == Class82.field205)
      .collect(ImmutableSet.toImmutableSet());
   private static final Map<Class7380, Class4913> field22750 = Maps.newHashMap();
   public static final Class4913 field22751 = method15185("unemployed", ImmutableSet.of(), 1, field22747, 1);
   public static final Class4913 field22752 = method15184("armorer", method15180(Blocks.field37057), 1, 1);
   public static final Class4913 field22753 = method15184("butcher", method15180(Blocks.field37056), 1, 1);
   public static final Class4913 field22754 = method15184("cartographer", method15180(Blocks.field37058), 1, 1);
   public static final Class4913 field22755 = method15184("cleric", method15180(Blocks.field36647), 1, 1);
   public static final Class4913 field22756 = method15184("farmer", method15180(Blocks.field37115), 1, 1);
   public static final Class4913 field22757 = method15184("fisherman", method15180(Blocks.field37055), 1, 1);
   public static final Class4913 field22758 = method15184("fletcher", method15180(Blocks.field37059), 1, 1);
   public static final Class4913 field22759 = method15184("leatherworker", method15180(Blocks.field36648), 1, 1);
   public static final Class4913 field22760 = method15184("librarian", method15180(Blocks.field37061), 1, 1);
   public static final Class4913 field22761 = method15184("mason", method15180(Blocks.field37063), 1, 1);
   public static final Class4913 field22762 = method15184("nitwit", ImmutableSet.of(), 1, 1);
   public static final Class4913 field22763 = method15184("shepherd", method15180(Blocks.field37054), 1, 1);
   public static final Class4913 field22764 = method15184("toolsmith", method15180(Blocks.field37062), 1, 1);
   public static final Class4913 field22765 = method15184("weaponsmith", method15180(Blocks.field37060), 1, 1);
   public static final Class4913 field22766 = method15184("home", field22749, 1, 1);
   public static final Class4913 field22767 = method15184("meeting", method15180(Blocks.field37064), 32, 6);
   public static final Class4913 field22768 = method15184("beehive", method15180(Blocks.field37118), 0, 1);
   public static final Class4913 field22769 = method15184("bee_nest", method15180(Blocks.field37117), 0, 1);
   public static final Class4913 field22770 = method15184("nether_portal", method15180(Blocks.field36588), 0, 1);
   public static final Class4913 field22771 = method15184("lodestone", method15180(Blocks.field37129), 0, 1);
   public static final Set<Class7380> field22772 = new ObjectOpenHashSet(field22750.keySet());
   private final String field22773;
   private final Set<Class7380> field22774;
   private final int field22775;
   private final Predicate<Class4913> field22776;
   private final int field22777;

   private static Set<Class7380> method15180(Block var0) {
      return ImmutableSet.copyOf(var0.method11577().method35392());
   }

   private Class4913(String var1, Set<Class7380> var2, int var3, Predicate<Class4913> var4, int var5) {
      this.field22773 = var1;
      this.field22774 = ImmutableSet.copyOf(var2);
      this.field22775 = var3;
      this.field22776 = var4;
      this.field22777 = var5;
   }

   private Class4913(String var1, Set<Class7380> var2, int var3, int var4) {
      this.field22773 = var1;
      this.field22774 = ImmutableSet.copyOf(var2);
      this.field22775 = var3;
      this.field22776 = var1x -> var1x == this;
      this.field22777 = var4;
   }

   public int method15181() {
      return this.field22775;
   }

   public Predicate<Class4913> method15182() {
      return this.field22776;
   }

   public int method15183() {
      return this.field22777;
   }

   @Override
   public String toString() {
      return this.field22773;
   }

   private static Class4913 method15184(String var0, Set<Class7380> var1, int var2, int var3) {
      return method15186(Registry.<Class4913, Class4913>register(Registry.field16091, new ResourceLocation(var0), new Class4913(var0, var1, var2, var3)));
   }

   private static Class4913 method15185(String var0, Set<Class7380> var1, int var2, Predicate<Class4913> var3, int var4) {
      return method15186(Registry.<Class4913, Class4913>register(Registry.field16091, new ResourceLocation(var0), new Class4913(var0, var1, var2, var3, var4)));
   }

   private static Class4913 method15186(Class4913 var0) {
      var0.field22774.forEach(var1 -> {
         Class4913 var4 = field22750.put(var1, var0);
         if (var4 != null) {
            throw (IllegalStateException) Util.method38516(new IllegalStateException(String.format("%s is defined in too many tags", var1)));
         }
      });
      return var0;
   }

   public static Optional<Class4913> method15187(Class7380 var0) {
      return Optional.<Class4913>ofNullable(field22750.get(var0));
   }
}
