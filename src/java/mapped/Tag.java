package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;

public class Tag<T> implements ITag<T> {
   private static String[] field32652;
   private final ImmutableList<T> field32653;
   private final Set<T> field32654;
   public final Class<?> field32655;

   public Tag(Set<T> var1, Class<?> var2) {
      this.field32655 = var2;
      this.field32654 = var1;
      this.field32653 = ImmutableList.copyOf(var1);
   }

   public static <T> Tag<T> getEmptyTag() {
      return new Tag<T>(ImmutableSet.of(), Void.class);
   }

   public static <T> Tag<T> getTagFromContents(Set<T> var0) {
      return new Tag<T>(var0, method24927(var0));
   }

   @Override
   public boolean contains(T var1) {
      return this.field32655.isInstance(var1) && this.field32654.contains(var1);
   }

   @Override
   public List<T> getAllElements() {
      return this.field32653;
   }

   private static <T> Class<?> method24927(Set<T> var0) {
      if (!var0.isEmpty()) {
         Class var3 = null;

         for (Object var5 : var0) {
            if (var3 != null) {
               var3 = method24928(var3, var5.getClass());
            } else {
               var3 = var5.getClass();
            }
         }

         return var3;
      } else {
         return Void.class;
      }
   }

   private static Class<?> method24928(Class<?> var0, Class<?> var1) {
      while (!var0.isAssignableFrom(var1)) {
         var0 = var0.getSuperclass();
      }

      return var0;
   }
}
