package mapped;

import java.util.EnumSet;

public class Class2694 extends Class2692 {
   private static String[] field17136;
   private double field17137;
   private double field17138;
   private int field17139;
   private int field17140;
   public final Class1095 field17133;

   public Class2694(Class1095 var1) {
      super(var1);
      this.field17133 = var1;
      this.method10809(EnumSet.<Class2240>of(Class2240.field14657, Class2240.field14658));
   }

   @Override
   public boolean method10803() {
      return this.field17133.method3014() == null
         && this.field17133.method3013().nextFloat() < 0.02F
         && !this.field17133.isSleeping()
         && this.field17133.method4232() == null
         && this.field17133.method4230().method21664()
         && !this.method10911()
         && !this.field17133.method5140()
         && !this.field17133.method3336();
   }

   @Override
   public boolean method10806() {
      return this.field17140 > 0;
   }

   @Override
   public void method10804() {
      this.method10913();
      this.field17140 = 2 + this.field17133.method3013().nextInt(3);
      this.field17133.method5130(true);
      this.field17133.method4230().method21666();
   }

   @Override
   public void method10807() {
      this.field17133.method5130(false);
   }

   @Override
   public void method10805() {
      this.field17139--;
      if (this.field17139 <= 0) {
         this.field17140--;
         this.method10913();
      }

      this.field17133
         .method4227()
         .method28042(
            this.field17133.getPosX() + this.field17137,
            this.field17133.method3442(),
            this.field17133.getPosZ() + this.field17138,
            (float)this.field17133.method4260(),
            (float)this.field17133.method4259()
         );
   }

   private void method10913() {
      double var3 = (Math.PI * 2) * this.field17133.method3013().nextDouble();
      this.field17137 = Math.cos(var3);
      this.field17138 = Math.sin(var3);
      this.field17139 = 80 + this.field17133.method3013().nextInt(20);
   }
}
