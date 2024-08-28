package mapped;

import com.google.common.collect.Lists;

import java.util.EnumSet;
import java.util.List;

public class Class2664 extends Class2661 {
   private static String[] field17032;
   private int field17033;
   private List<BlockPos> field17034;
   private Class8238 field17035;
   private int field17036;
   public final Class1017 field17022;

   public Class2664(Class1017 var1) {
      super(var1, null);
      this.field17022 = var1;
      this.field17033 = this.field17022.field5024.field9016.nextInt(10);
      this.field17034 = Lists.newArrayList();
      this.field17035 = null;
      this.method10809(EnumSet.<Class2240>of(Class2240.field14657));
   }

   @Override
   public boolean method10860() {
      return Class1017.method4453(this.field17022) != null
         && !this.field17022.method4291()
         && Class1017.method4452(this.field17022)
         && !this.method10878(Class1017.method4453(this.field17022))
         && this.field17022.field5024.method6738(Class1017.method4453(this.field17022)).method23446(Class7645.field32794);
   }

   @Override
   public boolean method10861() {
      return this.method10860();
   }

   @Override
   public void method10804() {
      this.field17033 = 0;
      this.field17036 = 0;
      super.method10804();
   }

   @Override
   public void method10807() {
      this.field17033 = 0;
      this.field17036 = 0;
      Class1017.method4455(this.field17022).method21666();
      Class1017.method4456(this.field17022).method21641();
   }

   @Override
   public void method10805() {
      if (Class1017.method4453(this.field17022) != null) {
         this.field17033++;
         if (this.field17033 <= 600) {
            if (!Class1017.method4457(this.field17022).method21665()) {
               if (Class1017.method4458(this.field17022, Class1017.method4453(this.field17022), 16)) {
                  boolean var3 = this.method10872(Class1017.method4453(this.field17022));
                  if (var3) {
                     if (this.field17035 != null && Class1017.method4461(this.field17022).method21657().method28707(this.field17035)) {
                        this.field17036++;
                        if (this.field17036 > 60) {
                           this.method10877();
                           this.field17036 = 0;
                        }
                     } else {
                        this.field17035 = Class1017.method4462(this.field17022).method21657();
                     }
                  } else {
                     this.method10876();
                  }
               } else if (!Class1017.method4459(this.field17022, Class1017.method4453(this.field17022))) {
                  Class1017.method4460(this.field17022, Class1017.method4453(this.field17022));
               } else {
                  this.method10877();
               }
            }
         } else {
            this.method10876();
         }
      }
   }

   private boolean method10872(BlockPos var1) {
      Class1017.method4463(this.field17022).method21642(10.0F);
      Class1017.method4464(this.field17022).method21654((double)var1.method8304(), (double)var1.getY(), (double)var1.method8306(), 1.0);
      return Class1017.method4465(this.field17022).method21657() != null && Class1017.method4466(this.field17022).method21657().method28708();
   }

   private boolean method10873(BlockPos var1) {
      return this.field17034.contains(var1);
   }

   private void method10874(BlockPos var1) {
      this.field17034.add(var1);

      while (this.field17034.size() > 3) {
         this.field17034.remove(0);
      }
   }

   private void method10875() {
      this.field17034.clear();
   }

   private void method10876() {
      if (Class1017.method4453(this.field17022) != null) {
         this.method10874(Class1017.method4453(this.field17022));
      }

      this.method10877();
   }

   private void method10877() {
      Class1017.method4454(this.field17022, null);
      Class1017.method4467(this.field17022, 200);
   }

   private boolean method10878(BlockPos var1) {
      if (Class1017.method4458(this.field17022, var1, 2)) {
         return true;
      } else {
         Class8238 var4 = Class1017.method4468(this.field17022).method21657();
         return var4 != null && var4.method28712().equals(var1) && var4.method28708() && var4.method28693();
      }
   }

   // $VF: synthetic method
   public static boolean method10879(Class2664 var0, BlockPos var1) {
      return var0.method10873(var1);
   }

   // $VF: synthetic method
   public static void method10880(Class2664 var0) {
      var0.method10875();
   }
}
