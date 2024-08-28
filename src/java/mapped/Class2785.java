package mapped;

import javax.annotation.Nullable;
import java.util.EnumSet;
import java.util.List;

public class Class2785 extends Class2595 {
   private static String[] field17405;
   private static final Class8522 field17406 = new Class8522().method30203(8.0).method30204().method30205().method30206();
   public final Class1018 field17407;
   private final Class<? extends Class1018> field17408;
   public final Class1655 field17409;
   public Class1018 field17410;
   private int field17411;
   private final double field17412;

   public Class2785(Class1018 var1, double var2) {
      this(var1, var2, (Class<? extends Class1018>)var1.getClass());
   }

   public Class2785(Class1018 var1, double var2, Class<? extends Class1018> var4) {
      this.field17407 = var1;
      this.field17409 = var1.field5024;
      this.field17408 = var4;
      this.field17412 = var2;
      this.method10809(EnumSet.<Class2240>of(Class2240.field14657, Class2240.field14658));
   }

   @Override
   public boolean method10803() {
      if (this.field17407.method4507()) {
         this.field17410 = this.method10978();
         return this.field17410 != null;
      } else {
         return false;
      }
   }

   @Override
   public boolean method10806() {
      return this.field17410.method3066() && this.field17410.method4507() && this.field17411 < 60;
   }

   @Override
   public void method10807() {
      this.field17410 = null;
      this.field17411 = 0;
   }

   @Override
   public void method10805() {
      this.field17407.method4227().method28040(this.field17410, 10.0F, (float)this.field17407.method4259());
      this.field17407.method4230().method21655(this.field17410, this.field17412);
      this.field17411++;
      if (this.field17411 >= 60 && this.field17407.getDistanceSq(this.field17410) < 9.0) {
         this.method10979();
      }
   }

   @Nullable
   private Class1018 method10978() {
      List<Class1018> var3 = this.field17409.method7195(this.field17408, field17406, this.field17407, this.field17407.method3389().method19664(8.0));
      double var4 = Double.MAX_VALUE;
      Class1018 var6 = null;

      for (Class1018 var8 : var3) {
         if (this.field17407.method4386(var8) && this.field17407.getDistanceSq(var8) < var4) {
            var6 = var8;
            var4 = this.field17407.getDistanceSq(var8);
         }
      }

      return var6;
   }

   public void method10979() {
      this.field17407.method4509((ServerWorld)this.field17409, this.field17410);
   }
}
