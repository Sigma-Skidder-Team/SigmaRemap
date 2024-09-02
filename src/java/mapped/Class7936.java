package mapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import net.minecraft.world.server.ServerWorld;

import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class Class7936 {
   private static final Collection<Class4871> field34024 = Lists.newArrayList();
   private static final Set<String> field34025 = Sets.newHashSet();
   private static final Map<String, Consumer<ServerWorld>> field34026 = Maps.newHashMap();
   private static final Collection<Class4871> field34027 = Sets.newHashSet();

   public static Collection<Class4871> method26703(String var0) {
      return field34024.stream().filter(var1 -> method26710(var1, var0)).collect(Collectors.<Class4871>toList());
   }

   public static Collection<Class4871> method26704() {
      return field34024;
   }

   public static Collection<String> method26705() {
      return field34025;
   }

   public static boolean method26706(String var0) {
      return field34025.contains(var0);
   }

   @Nullable
   public static Consumer<ServerWorld> method26707(String var0) {
      return field34026.get(var0);
   }

   public static Optional<Class4871> method26708(String var0) {
      return method26704().stream().filter(var1 -> var1.method15034().equalsIgnoreCase(var0)).findFirst();
   }

   public static Class4871 method26709(String var0) {
      Optional var3 = method26708(var0);
      if (var3.isPresent()) {
         return (Class4871)var3.get();
      } else {
         throw new IllegalArgumentException("Can't find the test function for " + var0);
      }
   }

   private static boolean method26710(Class4871 var0, String var1) {
      return var0.method15034().toLowerCase().startsWith(var1.toLowerCase() + ".");
   }

   public static Collection<Class4871> method26711() {
      return field34027;
   }

   public static void method26712(Class4871 var0) {
      field34027.add(var0);
   }

   public static void method26713() {
      field34027.clear();
   }
}
