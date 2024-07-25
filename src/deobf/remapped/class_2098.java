package remapped;

import com.google.common.collect.Lists;
import java.util.List;

public class class_2098 {
   private static String[] field_10530;
   private final List<class_2241> field_10522 = Lists.newArrayList();
   private double field_10523 = 0.2;
   private double field_10528 = 5.0;
   private int field_10524 = 15;
   private int field_10525 = 5;
   private double field_10532;
   private double field_10529;
   private int field_10527 = 29999984;
   private class_7462 field_10531 = new class_3655(this, 6.0E7);
   public static final class_1572 field_10526 = new class_1572(0.0, 0.0, 0.2, 5.0, 5, 15, 6.0E7, 0L, 0.0, null);

   public boolean method_9813(BlockPos var1) {
      return (double)(var1.method_12173() + 1) > this.method_9821()
         && (double)var1.method_12173() < this.method_9828()
         && (double)(var1.method_12185() + 1) > this.method_9825()
         && (double)var1.method_12185() < this.method_9816();
   }

   public boolean method_9814(class_2034 var1) {
      return (double)var1.method_9536() > this.method_9821()
         && (double)var1.method_9535() < this.method_9828()
         && (double)var1.method_9538() > this.method_9825()
         && (double)var1.method_9545() < this.method_9816();
   }

   public boolean method_9815(Box var1) {
      return var1.field_19940 > this.method_9821()
         && var1.field_19941 < this.method_9828()
         && var1.field_19942 > this.method_9825()
         && var1.field_19938 < this.method_9816();
   }

   public double method_9809(Entity var1) {
      return this.method_9808(var1.getPosX(), var1.getPosZ());
   }

   public class_4190 method_9820() {
      return this.field_10531.method_33962();
   }

   public double method_9808(double var1, double var3) {
      double var7 = var3 - this.method_9825();
      double var9 = this.method_9816() - var3;
      double var11 = var1 - this.method_9821();
      double var13 = this.method_9828() - var1;
      double var15 = Math.min(var11, var13);
      var15 = Math.min(var15, var7);
      return Math.min(var15, var9);
   }

   public class_4044 method_9839() {
      return this.field_10531.method_33956();
   }

   public double method_9821() {
      return this.field_10531.method_33955();
   }

   public double method_9825() {
      return this.field_10531.method_33961();
   }

   public double method_9828() {
      return this.field_10531.method_33953();
   }

   public double method_9816() {
      return this.field_10531.method_33958();
   }

   public double method_9807() {
      return this.field_10532;
   }

   public double method_9835() {
      return this.field_10529;
   }

   public void method_9836(double var1, double var3) {
      this.field_10532 = var1;
      this.field_10529 = var3;
      this.field_10531.method_33957();

      for (class_2241 var8 : this.method_9818()) {
         var8.method_10300(this, var1, var3);
      }
   }

   public double method_9824() {
      return this.field_10531.method_33959();
   }

   public long method_9804() {
      return this.field_10531.method_33960();
   }

   public double method_9817() {
      return this.field_10531.method_33964();
   }

   public void method_9822(double var1) {
      this.field_10531 = new class_3655(this, var1);

      for (class_2241 var6 : this.method_9818()) {
         var6.method_10297(this, var1);
      }
   }

   public void method_9823(double var1, double var3, long var5) {
      this.field_10531 = (class_7462)(var1 != var3 ? new class_5270(this, var1, var3, var5, null) : new class_3655(this, var3));

      for (class_2241 var10 : this.method_9818()) {
         var10.method_10302(this, var1, var3, var5);
      }
   }

   public List<class_2241> method_9818() {
      return Lists.newArrayList(this.field_10522);
   }

   public void method_9833(class_2241 var1) {
      this.field_10522.add(var1);
   }

   public void method_9810(int var1) {
      this.field_10527 = var1;
      this.field_10531.method_33952();
   }

   public int method_9811() {
      return this.field_10527;
   }

   public double method_9830() {
      return this.field_10528;
   }

   public void method_9827(double var1) {
      this.field_10528 = var1;

      for (class_2241 var6 : this.method_9818()) {
         var6.method_10299(this, var1);
      }
   }

   public double method_9826() {
      return this.field_10523;
   }

   public void method_9829(double var1) {
      this.field_10523 = var1;

      for (class_2241 var6 : this.method_9818()) {
         var6.method_10301(this, var1);
      }
   }

   public double method_9806() {
      return this.field_10531.method_33954();
   }

   public int method_9812() {
      return this.field_10524;
   }

   public void method_9803(int var1) {
      this.field_10524 = var1;

      for (class_2241 var5 : this.method_9818()) {
         var5.method_10298(this, var1);
      }
   }

   public int method_9819() {
      return this.field_10525;
   }

   public void method_9832(int var1) {
      this.field_10525 = var1;

      for (class_2241 var5 : this.method_9818()) {
         var5.method_10296(this, var1);
      }
   }

   public void method_9805() {
      this.field_10531 = this.field_10531.method_33963();
   }

   public class_1572 method_9831() {
      return new class_1572(this, null);
   }

   public void method_9834(class_1572 var1) {
      this.method_9836(var1.method_7089(), var1.method_7096());
      this.method_9829(var1.method_7088());
      this.method_9827(var1.method_7092());
      this.method_9832(var1.method_7087());
      this.method_9803(var1.method_7090());
      if (var1.method_7094() <= 0L) {
         this.method_9822(var1.method_7098());
      } else {
         this.method_9823(var1.method_7098(), var1.method_7095(), var1.method_7094());
      }
   }
}
