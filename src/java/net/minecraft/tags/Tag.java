package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;

public class Tag<T> implements ITag<T> {
   private final ImmutableList<T> immutableContents;
   private final Set<T> contents;
   public final Class<?> contentsClassType;

   public Tag(Set<T> contents, Class<?> contentsClassType) {
      this.contentsClassType = contentsClassType;
      this.contents = contents;
      this.immutableContents = ImmutableList.copyOf(contents);
   }

   public static <T> Tag<T> getEmptyTag() {
      return new Tag<T>(ImmutableSet.of(), Void.class);
   }

   public static <T> Tag<T> getTagFromContents(Set<T> var0) {
      return new Tag<T>(var0, getContentsClass(var0));
   }

   @Override
   public boolean contains(T var1) {
      return this.contentsClassType.isInstance(var1) && this.contents.contains(var1);
   }

   @Override
   public List<T> getAllElements() {
      return this.immutableContents;
   }

   private static <T> Class<?> getContentsClass(Set<T> contents) {
      if (!contents.isEmpty()) {
         Class oclass = null;

         for (T t : contents) {
            if (oclass != null) {
               oclass = findCommonParentClass(oclass, t.getClass());
            } else {
               oclass = t.getClass();
            }
         }

         return oclass;
      } else {
         return Void.class;
      }
   }

   private static Class<?> findCommonParentClass(Class<?> input, Class<?> comparison) {
      while (!input.isAssignableFrom(comparison)) {
         input = input.getSuperclass();
      }

      return input;
   }
}
