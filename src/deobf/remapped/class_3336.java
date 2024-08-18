package remapped;

import java.util.ArrayList;
import java.util.List;

public enum class_3336 {
   field_16458(class_4897.field_25206, 0.0F, 3.0F, 0.0F),
   field_16447(class_4897.field_24601, 0.0F, 1.875F, 0.0F),
   field_16453(class_4897.field_24664, 0.0F, 1.875F, 0.0F),
   field_16446(class_4897.field_24962, 0.0F, 1.875F, 0.0F),
   field_16444(class_4897.field_25226, 0.0F, 0.5F, 0.0F),
   field_16452(class_4897.field_24623, 0.0F, 0.6F, 0.0F),
   field_16462(class_4897.field_25086, 0.0F, 2.5F, 0.0F);

   private class_2451 field_16454;
   private float field_16450;
   private float field_16448;
   private float field_16459;
   public double field_16461;
   public double field_16457;
   public double field_16443;
   public float field_16451;
   public float field_16445;
   public float field_16456;
   public class_7474 field_16463;
   public Entity field_16449;

   private class_3336(class_2451 var3, float var4, float var5, float var6) {
      this.field_16454 = var3;
      this.field_16450 = var4;
      this.field_16448 = var5;
      this.field_16459 = var6;
   }

   public float method_15303() {
      if (!this.field_16454.equals(class_4897.field_25206)) {
         return this.field_16448;
      } else {
         return !(this.field_16448 * class_2100.method_9852(ProjectilesModule.method_18288().field_9632.method_26466()) > 0.0F)
            ? class_2100.method_9852(20)
            : class_2100.method_9852(ProjectilesModule.method_18287().field_9632.method_26466());
      }
   }

   public float method_15302() {
      return this.field_16450;
   }

   public float method_15300() {
      return this.field_16459;
   }

   public class_2451 method_15301() {
      return this.field_16454;
   }

   public static class_3336 method_15299(class_2451 var0) {
      for (class_3336 var6 : values()) {
         if (var6.method_15301().equals(var0)) {
            return var6;
         }
      }

      return null;
   }

   public List<class_7047> method_15304() {
      ArrayList var3 = new ArrayList();
      float var4 = (float)Math.toRadians((double) ProjectilesModule.method_18292().field_9632.field_41701);
      float var5 = (float)Math.toRadians((double) ProjectilesModule.method_18299().field_9632.field_41755);
      double var6 = ProjectilesModule.method_18293().field_9632.field_41754
         + (ProjectilesModule.method_18295().field_9632.method_37302() - ProjectilesModule.method_18301().field_9632.field_41754)
            * (double) ProjectilesModule.method_18284().field_9616.field_32600;
      double var8 = ProjectilesModule.method_18283().field_9632.field_41713
         + (ProjectilesModule.method_18305().field_9632.method_37309() - ProjectilesModule.method_18282().field_9632.field_41713)
            * (double) ProjectilesModule.method_18298().field_9616.field_32600;
      double var10 = ProjectilesModule.method_18296().field_9632.field_41724
         + (ProjectilesModule.method_18291().field_9632.method_37156() - ProjectilesModule.method_18302().field_9632.field_41724)
            * (double) ProjectilesModule.method_18286().field_9616.field_32600;
      this.field_16461 = var6;
      this.field_16457 = var8 + (double) ProjectilesModule.method_18300().field_9632.method_37277() - 0.1F;
      this.field_16443 = var10;
      float var12 = Math.min(20.0F, (float)(72000 - ProjectilesModule.method_18290().field_9632.method_26466()) + ProjectilesModule.method_18304().method_8554()) / 20.0F;
      this.field_16451 = -MathHelper.sin(var4) * MathHelper.cos(var5) * this.field_16448 * var12;
      this.field_16445 = -MathHelper.sin(var5) * this.field_16448 * var12;
      this.field_16456 = MathHelper.cos(var4) * MathHelper.cos(var5) * this.field_16448 * var12;
      this.field_16463 = null;
      this.field_16449 = null;
      var3.add(new class_7047(this.field_16461, this.field_16457, this.field_16443));

      while (this.field_16463 == null && this.field_16449 == null && this.field_16457 > 0.0) {
         Vector3d var13 = new Vector3d(this.field_16461, this.field_16457, this.field_16443);
         Vector3d var14 = new Vector3d(
            this.field_16461 + (double)this.field_16451, this.field_16457 + (double)this.field_16445, this.field_16443 + (double)this.field_16456
         );
         float var15 = (float)(!(this.field_16454 instanceof class_2100) ? 0.25 : 0.3);
         Box var16 = new Box(
            this.field_16461 - (double)var15,
            this.field_16457 - (double)var15,
            this.field_16443 - (double)var15,
            this.field_16461 + (double)var15,
            this.field_16457 + (double)var15,
            this.field_16443 + (double)var15
         );
         List var17 = ProjectilesModule.method_18303()
            .field_9601
            .method_25867(
               ProjectilesModule.method_18297().field_9632,
               var16.method_18918((double)this.field_16451, (double)this.field_16445, (double)this.field_16456).method_18899(1.0, 1.0, 1.0),
               class_3572.field_17483.and(new class_8528(this, var15, var13, var14))
            );
         if (var17.size() > 0) {
            for (Entity var22 : var17) {
               this.field_16449 = var22;
            }
            break;
         }

         class_9529 var18 = ProjectilesModule.method_18285()
            .field_9601
            .method_28265(new class_972(var13, var14, class_3132.field_15553, class_9583.field_48747, ProjectilesModule.method_18294().field_9632));
         if (var18 != null && var18.method_33990() != class_1430.field_7721) {
            this.field_16463 = var18;
            this.field_16461 = this.field_16463.method_33993().field_7336;
            this.field_16457 = this.field_16463.method_33993().field_7333;
            this.field_16443 = this.field_16463.method_33993().field_7334;
            var3.add(new class_7047(this.field_16461, this.field_16457, this.field_16443));
            break;
         }

         float var19 = 0.99F;
         float var20 = 0.05F;
         this.field_16461 = this.field_16461 + (double)this.field_16451;
         this.field_16457 = this.field_16457 + (double)this.field_16445;
         this.field_16443 = this.field_16443 + (double)this.field_16456;
         var3.add(new class_7047(this.field_16461, this.field_16457, this.field_16443));
         this.field_16451 *= var19;
         this.field_16445 *= var19;
         this.field_16456 *= var19;
         this.field_16445 -= var20;
      }

      return var3;
   }
}
