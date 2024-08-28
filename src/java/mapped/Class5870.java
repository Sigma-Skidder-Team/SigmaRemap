package mapped;

import com.google.common.collect.Lists;
import java.util.List;

public class Class5870 implements Class5871<Class5870>, Class5875<Class5870> {
   private final List<Class4688> field25654 = Lists.newArrayList();
   private final List<Class122> field25655 = Lists.newArrayList();
   private final List<Class127> field25656 = Lists.newArrayList();
   private Class6870 field25657 = new Class6872(1.0F);
   private Class6872 field25658 = new Class6872(0.0F, 0.0F);

   public Class5870 method18289(Class6870 var1) {
      this.field25657 = var1;
      return this;
   }

   public Class5870 method18295() {
      return this;
   }

   public Class5870 method18291(Class5873<?> var1) {
      this.field25654.add(var1.method18304());
      return this;
   }

   public Class5870 method18297(Class7519 var1) {
      this.field25655.add(var1.method24517());
      return this;
   }

   public Class5870 method18296(Class5885 var1) {
      this.field25656.add(var1.method18309());
      return this;
   }

   public Class8894 method18294() {
      if (this.field25657 != null) {
         return new Class8894(
            this.field25654.<Class4688>toArray(new Class4688[0]),
            this.field25655.<Class122>toArray(new Class122[0]),
            this.field25656.<Class127>toArray(new Class127[0]),
            this.field25657,
            this.field25658
         );
      } else {
         throw new IllegalArgumentException("Rolls not set");
      }
   }
}
