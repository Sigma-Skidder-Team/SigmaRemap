package mapped;

import com.google.common.collect.Sets;
import com.mentalfrostbyte.jello.Client;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

public class Class8066 {
   public final AtomicReference<Class7457> field34609;
   private Class2011 field34610;
   private Class2010 field34611;
   private final Set<Class944> field34612;
   private final Map<Class4520, Class1698> field34613;
   public Class6488 field34614;
   private int field34615;
   private boolean field34616;
   private final Mutable field34617;
   private final Mutable[] field34618;
   private boolean field34619;
   private final boolean field34620;
   private final boolean field34621;
   private boolean field34622;
   private boolean field34623;
   public int field34624;
   public int field34625;
   private int field34626;
   private int field34627;
   private int field34628;
   private final Class8066[] field34629;
   private boolean field34630;
   private Class1674 field34631;
   private Class8066[] field34632;
   private Class8066[] field34633;
   private boolean field34634;
   private Class7002 field34635;
   public Class6487 field34636;
   public final Class9016 field34637;

   public Class8066(Class9016 var1) {
      this.field34637 = var1;
      this.field34609 = new AtomicReference<Class7457>(Class7457.field32071);
      this.field34612 = Sets.newHashSet();
      this.field34613 = Class4520.method14349().stream().collect(Collectors.toMap(var0 -> (Class4520)var0, var0 -> new Class1698(Class9337.field43334)));
      this.field34615 = -1;
      this.field34616 = true;
      this.field34617 = new Mutable(-1, -1, -1);
      this.field34618 = Util.<Mutable[]>method38508(new Mutable[6], var0 -> {
         for (int var3 = 0; var3 < var0.length; var3++) {
            var0[var3] = new Mutable();
         }
      });
      this.field34620 = Class7944.method26799();
      this.field34621 = !Class9299.field42761.method20245();
      this.field34622 = false;
      this.field34623 = Class7944.method26977();
      this.field34629 = new Class8066[6];
      this.field34630 = false;
      this.field34632 = new Class8066[Direction.field685.length];
      this.field34633 = new Class8066[Direction.field685.length];
      this.field34634 = false;
      this.field34635 = new Class7002(this, (Direction)null, 0);
   }

   private boolean method27708(BlockPos var1) {
      return Class9016.method33344(this.field34637).method6724(var1.method8304() >> 4, var1.method8306() >> 4, Class9176.field42145, false) != null;
   }

   public boolean method27709() {
      byte var3 = 24;
      if (Math.sqrt(this.method27713()) <= (double)(Minecraft.getInstance().gameSettings.field44574 * 16) && Client.getInstance().method19937().method23351()) {
         return true;
      } else {
         return !(this.method27713() > 576.0)
            ? true
            : this.method27708(this.field34618[Direction.WEST.ordinal()])
               && this.method27708(this.field34618[Direction.NORTH.ordinal()])
               && this.method27708(this.field34618[Direction.EAST.ordinal()])
               && this.method27708(this.field34618[Direction.SOUTH.ordinal()]);
      }
   }

   public boolean method27710(int var1) {
      if (this.field34615 != var1) {
         this.field34615 = var1;
         return true;
      } else {
         return false;
      }
   }

   public Class1698 method27711(Class4520 var1) {
      return this.field34613.get(var1);
   }

   public void method27712(int var1, int var2, int var3) {
      if (var1 != this.field34617.method8304() || var2 != this.field34617.getY() || var3 != this.field34617.method8306()) {
         this.method27716();
         this.field34617.method8372(var1, var2, var3);
         if (this.field34623) {
            byte var6 = 8;
            this.field34624 = var1 >> var6 << var6;
            this.field34625 = var3 >> var6 << var6;
            this.field34626 = var1 - this.field34624;
            this.field34627 = var2;
            this.field34628 = var3 - this.field34625;
         }

         this.field34614 = new Class6488((double)var1, (double)var2, (double)var3, (double)(var1 + 16), (double)(var2 + 16), (double)(var3 + 16));

         for (Direction var9 : Direction.field685) {
            this.field34618[var9.ordinal()].method8374(this.field34617).method8380(var9, 16);
         }

         this.field34630 = false;
         this.field34634 = false;

         for (int var11 = 0; var11 < this.field34632.length; var11++) {
            Class8066 var12 = this.field34632[var11];
            if (var12 != null) {
               var12.field34634 = false;
            }
         }

         this.field34631 = null;
         this.field34636 = null;
      }
   }

   public double method27713() {
      Class9624 var3 = Minecraft.getInstance().gameRenderer.getActiveRenderInfo();
      double var4 = this.field34614.field28449 + 8.0 - var3.method37504().field18048;
      double var6 = this.field34614.field28450 + 8.0 - var3.method37504().field18049;
      double var8 = this.field34614.field28451 + 8.0 - var3.method37504().field18050;
      return var4 * var4 + var6 * var6 + var8 * var8;
   }

   private void method27714(Class5425 var1) {
      var1.method17063(7, Class9337.field43334);
   }

   public Class7457 method27715() {
      return this.field34609.get();
   }

   private void method27716() {
      this.method27725();
      this.field34609.set(Class7457.field32071);
      this.field34616 = true;
   }

   public void method27717() {
      this.method27716();
      this.field34613.values().forEach(Class1698::close);
   }

   public BlockPos method27718() {
      return this.field34617;
   }

   public void method27719(boolean var1) {
      boolean var4 = this.field34616;
      this.field34616 = true;
      this.field34619 = var1 | (var4 && this.field34619);
      if (this.method27730()) {
         this.field34622 = true;
      }
   }

   public void method27720() {
      this.field34616 = false;
      this.field34619 = false;
      this.field34622 = false;
   }

   public boolean method27721() {
      return this.field34616;
   }

   public boolean method27722() {
      return this.field34616 && this.field34619;
   }

   public BlockPos method27723(Direction var1) {
      return this.field34618[var1.ordinal()];
   }

   public boolean method27724(Class4520 var1, Class9016 var2) {
      Class7457 var5 = this.method27715();
      if (this.field34611 != null) {
         this.field34611.method8528();
      }

      if (Class7457.method24116(var5).contains(var1)) {
         if (!Class9016.method33345()) {
            this.field34611 = new Class2010(this, this.method27713(), var5);
         } else {
            this.field34611 = new Class2010(this, new Class7481(this.method27718()), this.method27713(), var5);
         }

         var2.method33326(this.field34611);
         return true;
      } else {
         return false;
      }
   }

   public void method27725() {
      if (this.field34610 != null) {
         this.field34610.method8528();
         this.field34610 = null;
      }

      if (this.field34611 != null) {
         this.field34611.method8528();
         this.field34611 = null;
      }
   }

   public Class2009 method27726() {
      this.method27725();
      BlockPos var3 = this.field34617.method8353();
      boolean var4 = true;
      Object var5 = null;
      if (!Class9016.method33345()) {
         this.field34610 = new Class2011(this, this.method27713(), (Class1677)var5);
      } else {
         this.field34610 = new Class2011(this, new Class7481(this.method27718()), this.method27713(), (Class1677)var5);
      }

      return this.field34610;
   }

   public void method27727(Class9016 var1) {
      Class2009 var4 = this.method27726();
      var1.method33326(var4);
   }

   private void method27728(Set<Class944> var1) {
      HashSet var4 = Sets.newHashSet(var1);
      HashSet var5 = Sets.newHashSet(this.field34612);
      var4.removeAll(this.field34612);
      var5.removeAll(var1);
      this.field34612.clear();
      this.field34612.addAll(var1);
      Class9016.method33346(this.field34637).method943(var5, var4);
   }

   public void method27729() {
      Class2009 var3 = this.method27726();
      var3.method8527(Class9016.method33347(this.field34637));
   }

   private boolean method27730() {
      if (!(Class9016.method33344(this.field34637) instanceof Class1656)) {
         return false;
      } else {
         Class1656 var3 = (Class1656)Class9016.method33344(this.field34637);
         return var3.method6864();
      }
   }

   public boolean method27731() {
      return this.field34622;
   }

   private Class4520[] method27732(Class7379 var1, Class4520[] var2) {
      if (!Class9016.method33348()) {
         var2[0] = Class8928.method32634(var1);
         return var2;
      } else {
         return Class9016.field41242;
      }
   }

   private Class4520[] method27733(Class7380 var1, Class4520[] var2) {
      if (!Class9016.method33349()) {
         var2[0] = Class8928.method32630(var1);
         return var2;
      } else {
         return Class9016.field41242;
      }
   }

   private Class4520 method27734(Class1665 var1, Class7380 var2, BlockPos var3, Class4520 var4) {
      if (Class7031.method21828()) {
         Class4520 var7 = Class7031.method21824(var1, var2, var3);
         if (var7 != null) {
            return var7;
         }
      }

      if (this.field34621) {
         if (!this.field34620) {
            if (var4 == Class9025.field41289) {
               return Class9025.field41290;
            }
         } else if (var4 == Class9025.field41290) {
            Block var8 = var2.method23383();
            if (!(var8 instanceof Class3222)) {
               if (!(var8 instanceof Class3220)) {
                  return Class9025.field41289;
               }

               return var4;
            }

            return var4;
         }

         return var4;
      } else {
         return var4;
      }
   }

   private void method27735(Class7828 var1, Class7457 var2) {
      this.method27736(Class9025.field41290, var1, var2);
      this.method27736(Class9025.field41289, var1, var2);
      this.method27736(Class9025.field41291, var1, var2);
   }

   private void method27736(Class4520 var1, Class7828 var2, Class7457 var3) {
      Class5425 var6 = var2.method26203(var1);
      if (var6.method17074()) {
         var3.method24114(var1);
         if (var6.method17081() > 0) {
            var3.method24115(var1);
         }
      }
   }

   private Class1664 method27737(BlockPos var1) {
      BlockPos var4 = var1.method8336(-1, -1, -1);
      BlockPos var5 = var1.method8336(16, 16, 16);
      Class1677 var6 = this.method27738(Class9016.method33344(this.field34637), var4, var5, 1);
      return new Class1664(var6, var4, var5, 1);
   }

   public Class1677 method27738(World var1, BlockPos var2, BlockPos var3, int var4) {
      return Class1677.method7172(var1, var2, var3, var4, false);
   }

   public Class8066 method27739(Class9242 var1, Direction var2) {
      if (!this.field34630) {
         for (int var5 = 0; var5 < Direction.field685.length; var5++) {
            Direction var6 = Direction.field685[var5];
            BlockPos var7 = this.method27723(var6);
            this.field34629[var5] = var1.method34761(var7);
         }

         this.field34630 = true;
      }

      return this.field34629[var2.ordinal()];
   }

   public Class1674 method27740() {
      return this.method27741(this.field34617);
   }

   private Class1674 method27741(BlockPos var1) {
      Class1674 var4 = this.field34631;
      if (var4 != null && Class8674.method31217(var4)) {
         return var4;
      } else {
         var4 = Class9016.method33344(this.field34637).method6722(var1);
         this.field34631 = var4;
         return var4;
      }
   }

   public boolean method27742() {
      return this.method27743(this.field34617);
   }

   private boolean method27743(BlockPos var1) {
      int var4 = var1.getY();
      int var5 = var4 + 15;
      return this.method27741(var1).method7076(var4, var5);
   }

   public void method27744(Direction var1, Class8066 var2) {
      this.field34632[var1.ordinal()] = var2;
      this.field34633[var1.ordinal()] = var2;
   }

   public Class8066 method27745(Direction var1) {
      if (!this.field34634) {
         this.method27747();
      }

      return this.field34633[var1.ordinal()];
   }

   public Class7002 method27746() {
      return this.field34635;
   }

   private void method27747() {
      int var3 = this.method27718().method8304();
      int var4 = this.method27718().method8306();
      int var5 = Direction.NORTH.ordinal();
      int var6 = Direction.SOUTH.ordinal();
      int var7 = Direction.WEST.ordinal();
      int var8 = Direction.EAST.ordinal();
      this.field34633[var5] = this.field34632[var5].method27718().method8306() != var4 - 16 ? null : this.field34632[var5];
      this.field34633[var6] = this.field34632[var6].method27718().method8306() != var4 + 16 ? null : this.field34632[var6];
      this.field34633[var7] = this.field34632[var7].method27718().method8304() != var3 - 16 ? null : this.field34632[var7];
      this.field34633[var8] = this.field34632[var8].method27718().method8304() != var3 + 16 ? null : this.field34632[var8];
      this.field34634 = true;
   }

   public boolean method27748(Class7624 var1, int var2) {
      return !this.method27749().method19655(var1, var2) ? var1.method24980(this.field34614) : true;
   }

   public Class6487 method27749() {
      if (this.field34636 == null) {
         BlockPos var3 = this.method27718();
         int var4 = var3.method8304();
         int var5 = var3.getY();
         int var6 = var3.method8306();
         byte var7 = 5;
         int var8 = var4 >> var7 << var7;
         int var9 = var5 >> var7 << var7;
         int var10 = var6 >> var7 << var7;
         if (var8 != var4 || var9 != var5 || var10 != var6) {
            Class6487 var11 = Class9016.method33346(this.field34637).method929(new BlockPos(var8, var9, var10)).method27749();
            if (var11 != null && var11.field28449 == (double)var8 && var11.field28450 == (double)var9 && var11.field28451 == (double)var10) {
               this.field34636 = var11;
            }
         }

         if (this.field34636 == null) {
            int var12 = 1 << var7;
            this.field34636 = new Class6487((double)var8, (double)var9, (double)var10, (double)(var8 + var12), (double)(var9 + var12), (double)(var10 + var12));
         }
      }

      return this.field34636;
   }

   @Override
   public String toString() {
      return "pos: " + this.method27718() + ", frameIndex: " + this.field34615;
   }

   // $VF: synthetic method
   public static void method27753(Class8066 var0, Set var1) {
      var0.method27728(var1);
   }

   // $VF: synthetic method
   public static Mutable method27754(Class8066 var0) {
      return var0.field34617;
   }

   // $VF: synthetic method
   public static boolean method27755(Class8066 var0, BlockPos var1) {
      return var0.method27743(var1);
   }

   // $VF: synthetic method
   public static Class1664 method27756(Class8066 var0, BlockPos var1) {
      return var0.method27737(var1);
   }

   // $VF: synthetic method
   public static Class4520[] method27757(Class8066 var0, Class7379 var1, Class4520[] var2) {
      return var0.method27732(var1, var2);
   }

   // $VF: synthetic method
   public static void method27758(Class8066 var0, Class5425 var1) {
      var0.method27714(var1);
   }

   // $VF: synthetic method
   public static Class4520[] method27759(Class8066 var0, Class7380 var1, Class4520[] var2) {
      return var0.method27733(var1, var2);
   }

   // $VF: synthetic method
   public static Class4520 method27760(Class8066 var0, Class1665 var1, Class7380 var2, BlockPos var3, Class4520 var4) {
      return var0.method27734(var1, var2, var3, var4);
   }

   // $VF: synthetic method
   public static int method27761(Class8066 var0) {
      return var0.field34626;
   }

   // $VF: synthetic method
   public static int method27762(Class8066 var0) {
      return var0.field34627;
   }

   // $VF: synthetic method
   public static int method27763(Class8066 var0) {
      return var0.field34628;
   }

   // $VF: synthetic method
   public static void method27764(Class8066 var0, Class7828 var1, Class7457 var2) {
      var0.method27735(var1, var2);
   }
}
