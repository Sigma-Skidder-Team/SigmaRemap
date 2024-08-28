package mapped;

import com.google.common.collect.ImmutableMap;

import java.util.Optional;

public class Class3730 extends Class3676<Class1006> {
   private static String[] field19833;
   private final float field19834;
   private BlockPos field19835;
   private int field19836;
   private int field19837;
   private int field19838;

   public Class3730(float var1) {
      super(ImmutableMap.of(Class8830.field39834, Class2217.field14484, Class8830.field39824, Class2217.field14485));
      this.field19834 = var1;
   }

   public boolean method12508(Class1657 var1, Class1006 var2) {
      return var2.method3005() && this.method12648(var1, var2);
   }

   public void method12502(Class1657 var1, Class1006 var2, long var3) {
      super.method12502(var1, var2, var3);
      this.method12652(var2).ifPresent(var3x -> {
         this.field19835 = var3x;
         this.field19836 = 100;
         this.field19837 = 3 + var1.field9016.nextInt(4);
         this.field19838 = 0;
         this.method12647(var2, var3x);
      });
   }

   public void method12506(Class1657 var1, Class1006 var2, long var3) {
      super.method12506(var1, var2, var3);
      this.field19835 = null;
      this.field19836 = 0;
      this.field19837 = 0;
      this.field19838 = 0;
   }

   public boolean method12499(Class1657 var1, Class1006 var2, long var3) {
      return var2.method3005()
         && this.field19835 != null
         && this.method12651(var1, this.field19835)
         && !this.method12653(var1, var2)
         && !this.method12654(var1, var2);
   }

   @Override
   public boolean method12507(long var1) {
      return false;
   }

   public void method12504(Class1657 var1, Class1006 var2, long var3) {
      if (this.method12649(var1, var2)) {
         if (this.field19838 <= 0) {
            if (this.method12650(var1, var2)) {
               var2.method4229().method27049();
               this.field19837--;
               this.field19838 = 5;
            }
         } else {
            this.field19838--;
         }
      } else {
         this.field19836--;
      }
   }

   private void method12647(Class1006 var1, BlockPos var2) {
      var1.method2992().method21406(Class8830.field39824, new Class8999(var2, this.field19834, 0));
   }

   private boolean method12648(Class1657 var1, Class1006 var2) {
      return this.method12649(var1, var2) || this.method12652(var2).isPresent();
   }

   private boolean method12649(Class1657 var1, Class1006 var2) {
      BlockPos var5 = var2.method3432();
      BlockPos var6 = var5.method8313();
      return this.method12651(var1, var5) || this.method12651(var1, var6);
   }

   private boolean method12650(Class1657 var1, Class1006 var2) {
      return this.method12651(var1, var2.method3432());
   }

   private boolean method12651(Class1657 var1, BlockPos var2) {
      return var1.method6738(var2).method23446(Class7645.field32770);
   }

   private Optional<BlockPos> method12652(Class1006 var1) {
      return var1.method2992().<BlockPos>method21410(Class8830.field39834);
   }

   private boolean method12653(Class1657 var1, Class1006 var2) {
      return !this.method12649(var1, var2) && this.field19836 <= 0;
   }

   private boolean method12654(Class1657 var1, Class1006 var2) {
      return this.method12649(var1, var2) && this.field19837 <= 0;
   }
}
