package mapped;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.Iterator;

public class Class998 extends Class995 {
   public Class9078 field5496;

   public Class998(Class8992<? extends Class998> var1, World var2) {
      super(var1, var2);
   }

   public Class998(World var1, BlockPos var2, Direction var3) {
      super(Class8992.field41060, var1, var2);
      ArrayList var6 = Lists.newArrayList();
      int var7 = 0;

      for (Class9078 var9 : Class2348.field16079) {
         this.field5496 = var9;
         this.method4077(var3);
         if (this.method4080()) {
            var6.add(var9);
            int var10 = var9.method33825() * var9.method33826();
            if (var10 > var7) {
               var7 = var10;
            }
         }
      }

      if (!var6.isEmpty()) {
         Iterator var11 = var6.iterator();

         while (var11.hasNext()) {
            Class9078 var12 = (Class9078)var11.next();
            if (var12.method33825() * var12.method33826() < var7) {
               var11.remove();
            }
         }

         this.field5496 = (Class9078)var6.get(this.field5054.nextInt(var6.size()));
      }

      this.method4077(var3);
   }

   public Class998(World var1, BlockPos var2, Direction var3, Class9078 var4) {
      this(var1, var2, var3);
      this.field5496 = var4;
      this.method4077(var3);
   }

   @Override
   public void method2724(Class39 var1) {
      var1.method109("Motive", Class2348.field16079.method9181(this.field5496).toString());
      var1.method100("Facing", (byte)this.field5489.method534());
      super.method2724(var1);
   }

   @Override
   public void method2723(Class39 var1) {
      this.field5496 = Class2348.field16079.method9184(ResourceLocation.method8289(var1.method126("Motive")));
      this.field5489 = Direction.method547(var1.method120("Facing"));
      super.method2723(var1);
      this.method4077(this.field5489);
   }

   @Override
   public int method4081() {
      return this.field5496 != null ? this.field5496.method33825() : 1;
   }

   @Override
   public int method4082() {
      return this.field5496 != null ? this.field5496.method33826() : 1;
   }

   @Override
   public void method4083(Entity var1) {
      if (this.field5024.method6789().method17135(Class5462.field24229)) {
         this.method2863(Class6067.field26867, 1.0F, 1.0F);
         if (var1 instanceof PlayerEntity) {
            PlayerEntity var4 = (PlayerEntity)var1;
            if (var4.field4919.field29609) {
               return;
            }
         }

         this.method3300(Class8514.field37871);
      }
   }

   @Override
   public void method4084() {
      this.method2863(Class6067.field26868, 1.0F, 1.0F);
   }

   @Override
   public void method3273(double var1, double var3, double var5, float var7, float var8) {
      this.method3215(var1, var3, var5);
   }

   @Override
   public void method3131(double var1, double var3, double var5, float var7, float var8, int var9, boolean var10) {
      BlockPos var13 = this.field5488.method8335(var1 - this.getPosX(), var3 - this.getPosY(), var5 - this.getPosZ());
      this.method3215((double)var13.method8304(), (double)var13.getY(), (double)var13.method8306());
   }

   @Override
   public Packet<?> method2835() {
      return new Class5470(this);
   }
}
