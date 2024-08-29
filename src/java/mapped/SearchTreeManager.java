package mapped;

import com.google.common.collect.Maps;

import java.util.Map;

public class SearchTreeManager implements Class215 {
   private static String[] field1029;
   public static final Key<ItemStack> ITEMS = new Key<ItemStack>();
   public static final Key<ItemStack> TAGS = new Key<ItemStack>();
   public static final Key<RecipeList> RECIPES = new Key<RecipeList>();
   private final Map<Key<?>, IMutableSearchTree<?>> field1033 = Maps.newHashMap();

   @Override
   public void method737(IResourceManager var1) {
      for (IMutableSearchTree var5 : this.field1033.values()) {
         var5.method21736();
      }
   }

   public <T> void add(Key<T> var1, IMutableSearchTree<T> var2) {
      this.field1033.put(var1, var2);
   }

   public <T> IMutableSearchTree<T> get(Key<T> var1) {
      return (IMutableSearchTree<T>)this.field1033.get(var1);
   }

   public static class Key<T> {
      private static String[] field43775;
   }
}
