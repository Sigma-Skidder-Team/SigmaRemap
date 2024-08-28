package mapped;

import com.google.common.collect.ImmutableList;

import java.util.List;

public class Class146 extends Class128 {
   private final List<Class4688> field489;

   public Class146(Class122[] var1, List<Class4688> var2) {
      super(var1);
      this.field489 = ImmutableList.copyOf(var2);
   }

   @Override
   public Class7128 method368() {
      return Class8585.field38630;
   }

   @Override
   public ItemStack method371(ItemStack var1, Class7812 var2) {
      if (!var1.method32105()) {
         Class25 var5 = Class25.method67();
         this.field489.forEach(var2x -> var2x.method14697(var2, var2xx -> var2xx.method19893(Class7318.method23179(var5::add), var2)));
         Class39 var6 = new Class39();
         Class7920.method26565(var6, var5);
         Class39 var7 = var1.method32143();
         var7.method99("BlockEntityTag", var6.method140(var7.method130("BlockEntityTag")));
         return var1;
      } else {
         return var1;
      }
   }

   @Override
   public void method367(Class8478 var1) {
      super.method367(var1);

      for (int var4 = 0; var4 < this.field489.size(); var4++) {
         this.field489.get(var4).method14703(var1.method29956(".entry[" + var4 + "]"));
      }
   }

   public static Class5886 method446() {
      return new Class5886();
   }

   // $VF: synthetic method
   public static List method449(Class146 var0) {
      return var0.field489;
   }
}
