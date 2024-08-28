package mapped;

import com.google.common.collect.Lists;

import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Class2610 extends Class2595 {
   private static String[] field16864;
   private final Class1026 field16865;
   private final double field16866;
   private BlockPos field16867;
   private final List<BlockPos> field16868 = Lists.newArrayList();
   private final int field16869;
   private boolean field16870;

   public Class2610(Class1026 var1, double var2, int var4) {
      this.field16865 = var1;
      this.field16866 = var2;
      this.field16869 = var4;
      this.method10809(EnumSet.<Class2240>of(Class2240.field14657));
   }

   @Override
   public boolean method10803() {
      this.method10820();
      return this.method10817() && this.method10818() && this.field16865.method4232() == null;
   }

   private boolean method10817() {
      return this.field16865.method4552() && !this.field16865.method4551().method25388();
   }

   private boolean method10818() {
      Class1657 var3 = (Class1657)this.field16865.field5024;
      BlockPos var4 = this.field16865.method3432();
      Optional var5 = var3.method6951()
         .method6673(var0 -> var0 == Class4913.field22766, this::method10819, Class2093.field13637, var4, 48, Class1026.method4565(this.field16865));
      if (var5.isPresent()) {
         this.field16867 = ((BlockPos)var5.get()).method8353();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean method10806() {
      return this.field16865.method4230().method21664()
         ? false
         : this.field16865.method4232() == null
            && !this.field16867.method8317(this.field16865.method3431(), (double)(this.field16865.method3429() + (float)this.field16869))
            && !this.field16870;
   }

   @Override
   public void method10807() {
      if (this.field16867.method8317(this.field16865.method3431(), (double)this.field16869)) {
         this.field16868.add(this.field16867);
      }
   }

   @Override
   public void method10804() {
      super.method10804();
      this.field16865.method3022(0);
      this.field16865
         .method4230()
         .method21654((double)this.field16867.method8304(), (double)this.field16867.getY(), (double)this.field16867.method8306(), this.field16866);
      this.field16870 = false;
   }

   @Override
   public void method10805() {
      if (this.field16865.method4230().method21664()) {
         Vector3d var3 = Vector3d.method11330(this.field16867);
         Vector3d var4 = Class8037.method27588(this.field16865, 16, 7, var3, (float) (Math.PI / 10));
         if (var4 == null) {
            var4 = Class8037.method27587(this.field16865, 8, 7, var3);
         }

         if (var4 == null) {
            this.field16870 = true;
            return;
         }

         this.field16865.method4230().method21654(var4.field18048, var4.field18049, var4.field18050, this.field16866);
      }
   }

   private boolean method10819(BlockPos var1) {
      for (BlockPos var5 : this.field16868) {
         if (Objects.equals(var1, var5)) {
            return false;
         }
      }

      return true;
   }

   private void method10820() {
      if (this.field16868.size() > 2) {
         this.field16868.remove(0);
      }
   }
}
