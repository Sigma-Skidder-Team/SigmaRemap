package mapped;

import com.google.common.collect.Lists;
import net.minecraft.state.Property;
import net.minecraft.util.IStringSerializable;

import java.util.List;

public class Class9178 {
   private static String[] field42156;
   private final List<Class8646> field42157 = Lists.newArrayList();

   private Class9178() {
   }

   public static Class9178 method34325() {
      return new Class9178();
   }

   public Class9178 method34326(Property<?> var1, String var2) {
      this.field42157.add(new Class8647(var1.method30472(), var2));
      return this;
   }

   public Class9178 method34327(Property<Integer> var1, int var2) {
      return this.method34326(var1, Integer.toString(var2));
   }

   public Class9178 method34328(Property<Boolean> var1, boolean var2) {
      return this.method34326(var1, Boolean.toString(var2));
   }

   public <T extends Comparable<T> & IStringSerializable> Class9178 method34329(Property<T> var1, T var2) {
      return this.method34326(var1, ((IStringSerializable)var2).getString());
   }

   public Class7340 method34330() {
      return new Class7340(this.field42157);
   }
}
