package mapped;

import com.google.common.collect.Lists;
import java.util.List;

public abstract class Class5872<T extends Class5872<T>> extends Class5873<T> implements Class5871<T> {
   public int field25659 = 1;
   public int field25660 = 0;
   private final List<Class127> field25661 = Lists.newArrayList();

   public T method18296(Class5885 var1) {
      this.field25661.add(var1.method18309());
      return this.method18301();
   }

   public Class127[] method18298() {
      return this.field25661.<Class127>toArray(new Class127[0]);
   }

   public T method18299(int var1) {
      this.field25659 = var1;
      return this.method18301();
   }

   public T method18300(int var1) {
      this.field25660 = var1;
      return this.method18301();
   }
}
