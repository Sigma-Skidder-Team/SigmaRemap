package mapped;

public class Class1033 extends Class1031 implements Class1022 {
   private static String[] field5738;
   private int field5739;
   private final Vector3d[][] field5740;

   public Class1033(Class8992<? extends Class1033> var1, Class1655 var2) {
      super(var1, var2);
      this.field5594 = 5;
      this.field5740 = new Vector3d[2][4];

      for (int var5 = 0; var5 < 4; var5++) {
         this.field5740[0][var5] = Vector3d.field18047;
         this.field5740[1][var5] = Vector3d.field18047;
      }
   }

   @Override
   public void method4219() {
      super.method4219();
      this.field5600.method20002(0, new Class2603(this));
      this.field5600.method20002(1, new Class2696(this));
      this.field5600.method20002(4, new Class2677(this));
      this.field5600.method20002(5, new Class2673(this));
      this.field5600.method20002(6, new Class2758<Class1033>(this, 0.5, 20, 15.0F));
      this.field5600.method20002(8, new Class2736(this, 0.6));
      this.field5600.method20002(9, new Class2612(this, PlayerEntity.class, 3.0F, 1.0F));
      this.field5600.method20002(10, new Class2612(this, Class1006.class, 8.0F));
      this.field5601.method20002(1, new Class2704(this, Class1026.class).method10918());
      this.field5601.method20002(2, new Class2709<PlayerEntity>(this, PlayerEntity.class, true).method10917(300));
      this.field5601.method20002(3, new Class2709<Class1043>(this, Class1043.class, false).method10917(300));
      this.field5601.method20002(3, new Class2709<Class1058>(this, Class1058.class, false).method10917(300));
   }

   public static Class7037 method4610() {
      return Class1009.method4343().method21849(Class9173.field42108, 0.5).method21849(Class9173.field42106, 18.0).method21849(Class9173.field42105, 32.0);
   }

   @Override
   public Class5093 method4276(Class1659 var1, Class9755 var2, Class2202 var3, Class5093 var4, Class39 var5) {
      this.method2944(Class2106.field13731, new Class8848(Class8514.field37796));
      return super.method4276(var1, var2, var3, var4, var5);
   }

   @Override
   public void method2850() {
      super.method2850();
   }

   @Override
   public Class6488 method3186() {
      return this.method3389().method19663(3.0, 0.0, 3.0);
   }

   @Override
   public void method2871() {
      super.method2871();
      if (this.field5024.field9020 && this.method3342()) {
         this.field5739--;
         if (this.field5739 < 0) {
            this.field5739 = 0;
         }

         if (this.field4952 == 1 || this.field5055 % 1200 == 0) {
            this.field5739 = 3;
            float var6 = -6.0F;
            byte var4 = 13;

            for (int var5 = 0; var5 < 4; var5++) {
               this.field5740[0][var5] = this.field5740[1][var5];
               this.field5740[1][var5] = new Vector3d(
                  (double)(-6.0F + (float)this.field5054.nextInt(13)) * 0.5,
                  (double)Math.max(0, this.field5054.nextInt(6) - 4),
                  (double)(-6.0F + (float)this.field5054.nextInt(13)) * 0.5
               );
            }

            for (int var7 = 0; var7 < 16; var7++) {
               this.field5024.method6746(Class7940.field34053, this.method3438(0.5), this.method3441(), this.method3444(0.5), 0.0, 0.0, 0.0);
            }

            this.field5024.method6745(this.getPosX(), this.getPosY(), this.getPosZ(), Class6067.field26695, this.method2864(), 1.0F, 1.0F, false);
         } else if (this.field4952 == this.field4953 - 1) {
            this.field5739 = 3;

            for (int var3 = 0; var3 < 4; var3++) {
               this.field5740[0][var3] = this.field5740[1][var3];
               this.field5740[1][var3] = new Vector3d(0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public Class9455 method4546() {
      return Class6067.field26691;
   }

   public Vector3d[] method4611(float var1) {
      if (this.field5739 <= 0) {
         return this.field5740[1];
      } else {
         double var4 = (double)(((float)this.field5739 - var1) / 3.0F);
         var4 = Math.pow(var4, 0.25);
         Vector3d[] var6 = new Vector3d[4];

         for (int var7 = 0; var7 < 4; var7++) {
            var6[var7] = this.field5740[1][var7].method11344(1.0 - var4).method11338(this.field5740[0][var7].method11344(var4));
         }

         return var6;
      }
   }

   @Override
   public boolean method3345(Entity var1) {
      if (super.method3345(var1)) {
         return true;
      } else {
         return var1 instanceof Class880 && ((Class880)var1).method3089() == Class7809.field33508
            ? this.method3344() == null && var1.method3344() == null
            : false;
      }
   }

   @Override
   public Class9455 method4241() {
      return Class6067.field26691;
   }

   @Override
   public Class9455 method2880() {
      return Class6067.field26693;
   }

   @Override
   public Class9455 method2879(Class8654 var1) {
      return Class6067.field26694;
   }

   @Override
   public Class9455 method4598() {
      return Class6067.field26692;
   }

   @Override
   public void method4545(int var1, boolean var2) {
   }

   @Override
   public void method4530(Class880 var1, float var2) {
      Class8848 var5 = this.method2983(this.method3094(Class9456.method36389(this, Class8514.field37796)));
      Class884 var6 = Class9456.method36390(this, var5, var2);
      double var7 = var1.getPosX() - this.getPosX();
      double var9 = var1.method3440(0.3333333333333333) - var6.getPosY();
      double var11 = var1.getPosZ() - this.getPosZ();
      double var13 = (double)Class9679.method37766(var7 * var7 + var11 * var11);
      var6.method3462(var7, var9 + var13 * 0.2F, var11, 1.6F, (float)(14 - this.field5024.method6997().method8905() * 4));
      this.method2863(Class6067.field27070, 1.0F, 1.0F / (this.method3013().nextFloat() * 0.4F + 0.8F));
      this.field5024.method6916(var6);
   }

   @Override
   public Class2117 method4543() {
      if (!this.method4594()) {
         return !this.method4307() ? Class2117.field13794 : Class2117.field13797;
      } else {
         return Class2117.field13796;
      }
   }
}
