package mapped;

import com.google.common.collect.Sets;

import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class Class2730<T extends Class1026> extends Class2595 {
   private static String[] field17240;
   private final T field17241;

   public Class2730(T var1) {
      this.field17241 = (T)var1;
      this.method10809(EnumSet.<Class2240>of(Class2240.field14657));
   }

   @Override
   public boolean method10803() {
      return this.field17241.method4232() == null
         && !this.field17241.method3329()
         && this.field17241.method4552()
         && !this.field17241.method4551().method25388()
         && !((ServerWorld)this.field17241.field5024).method6952(this.field17241.method3432());
   }

   @Override
   public boolean method10806() {
      return this.field17241.method4552()
         && !this.field17241.method4551().method25388()
         && this.field17241.field5024 instanceof ServerWorld
         && !((ServerWorld)this.field17241.field5024).method6952(this.field17241.method3432());
   }

   @Override
   public void method10805() {
      if (this.field17241.method4552()) {
         Class7699 var3 = this.field17241.method4551();
         if (this.field17241.field5055 % 20 == 0) {
            this.method10940(var3);
         }

         if (!this.field17241.method4772()) {
            Vector3d var4 = Class8037.method27587(this.field17241, 15, 4, Vector3d.method11330(var3.method25428()));
            if (var4 != null) {
               this.field17241.method4230().method21654(var4.field18048, var4.field18049, var4.field18050, 1.0);
            }
         }
      }
   }

   private void method10940(Class7699 var1) {
      if (var1.method25433()) {
         Set<Class1026> var4 = Sets.newHashSet();
         List<Class1026> var5 = this.field17241
            .field5024
            .method6772(
               Class1026.class, this.field17241.method3389().method19664(16.0), var1x -> !var1x.method4552() && Class7531.method24612(var1x, var1)
            );
         var4.addAll(var5);

         for (Class1026 var7 : var4) {
            var1.method25414(var1.method25396(), var7, (BlockPos)null, true);
         }
      }
   }
}
