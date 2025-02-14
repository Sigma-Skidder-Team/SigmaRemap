package mapped;

import com.google.common.collect.Lists;
import java.util.List;

public class Class5874 extends Class5873<Class5874> {
   private static String[] field25663;
   private final List<Class4688> field25664 = Lists.newArrayList();

   public Class5874(Class5873<?>... var1) {
      for (Class5873 var7 : var1) {
         this.field25664.add(var7.method18304());
      }
   }

   public Class5874 method18301() {
      return this;
   }

   @Override
   public Class5874 method18303(Class5873<?> var1) {
      this.field25664.add(var1.method18304());
      return this;
   }

   @Override
   public Class4688 method18304() {
      return new Class4690(this.field25664.<Class4688>toArray(new Class4688[0]), this.method18302());
   }
}
