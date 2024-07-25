package remapped;

import com.google.common.base.Stopwatch;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2LongMap;
import it.unimi.dsi.fastutil.objects.Object2LongOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2LongMap.Entry;
import java.util.Collection;
import javax.annotation.Nullable;

public class class_4085 {
   private final class_226 field_19882;
   private BlockPos field_19876;
   private final class_6331 field_19879;
   private final Collection<class_6685> field_19870 = Lists.newArrayList();
   private final int field_19883;
   private final Collection<class_5966> field_19874 = Lists.newCopyOnWriteArrayList();
   private Object2LongMap<Runnable> field_19878 = new Object2LongOpenHashMap();
   private long field_19872;
   private long field_19873;
   private boolean field_19881 = false;
   private final Stopwatch field_19871 = Stopwatch.createUnstarted();
   private boolean field_19877 = false;
   private final class_6631 field_19880;
   private Throwable field_19884;

   public class_4085(class_226 var1, class_6631 var2, class_6331 var3) {
      this.field_19882 = var1;
      this.field_19879 = var3;
      this.field_19883 = var1.method_956();
      this.field_19880 = var1.method_961().method_30486(var2);
   }

   public void method_18846(BlockPos var1) {
      this.field_19876 = var1;
   }

   public void method_18841() {
      this.field_19872 = this.field_19879.method_29546() + 1L + this.field_19882.method_955();
      this.field_19871.start();
   }

   public void method_18836() {
      if (!this.method_18828()) {
         this.field_19873 = this.field_19879.method_29546() - this.field_19872;
         if (this.field_19873 >= 0L) {
            if (this.field_19873 == 0L) {
               this.method_18847();
            }

            ObjectIterator var3 = this.field_19878.object2LongEntrySet().iterator();

            while (var3.hasNext()) {
               Entry var4 = (Entry)var3.next();
               if (var4.getLongValue() <= this.field_19873) {
                  try {
                     ((Runnable)var4.getKey()).run();
                  } catch (Exception var6) {
                     this.method_18833(var6);
                  }

                  var3.remove();
               }
            }

            if (this.field_19873 > (long)this.field_19883) {
               if (this.field_19874.isEmpty()) {
                  this.method_18833(new class_2771("Didn't succeed or fail within " + this.field_19882.method_956() + " ticks"));
               } else {
                  this.field_19874.forEach(var1 -> var1.method_27249(this.field_19873));
                  if (this.field_19884 == null) {
                     this.method_18833(new class_2771("No sequences finished"));
                  }
               }
            } else {
               this.field_19874.forEach(var1 -> var1.method_27247(this.field_19873));
            }
         }
      }
   }

   private void method_18847() {
      if (this.field_19881) {
         throw new IllegalStateException("Test already started");
      } else {
         this.field_19881 = true;

         try {
            this.field_19882.method_958(new class_4007(this));
         } catch (Exception var4) {
            this.method_18833(var4);
         }
      }
   }

   public String method_18835() {
      return this.field_19882.method_962();
   }

   public BlockPos method_18843() {
      return this.field_19876;
   }

   public class_6331 method_18832() {
      return this.field_19879;
   }

   public boolean method_18829() {
      return this.field_19877 && this.field_19884 == null;
   }

   public boolean method_18844() {
      return this.field_19884 != null;
   }

   public boolean method_18827() {
      return this.field_19881;
   }

   public boolean method_18828() {
      return this.field_19877;
   }

   private void method_18837() {
      if (!this.field_19877) {
         this.field_19877 = true;
         this.field_19871.stop();
      }
   }

   public void method_18833(Throwable var1) {
      this.method_18837();
      this.field_19884 = var1;
      this.field_19870.forEach(var1x -> var1x.method_30657(this));
   }

   @Nullable
   public Throwable method_18830() {
      return this.field_19884;
   }

   @Override
   public String toString() {
      return this.method_18835();
   }

   public void method_18848(class_6685 var1) {
      this.field_19870.add(var1);
   }

   public void method_18834(BlockPos var1, int var2) {
      class_945 var5 = class_2765.method_12584(this.method_18839(), var1, this.method_18840(), var2, this.field_19879, false);
      this.method_18846(var5.method_17399());
      var5.method_4098(this.method_18835());
      class_2765.method_12587(this.field_19876, new BlockPos(1, 0, -1), this.method_18840(), this.field_19879);
      this.field_19870.forEach(var1x -> var1x.method_30658(this));
   }

   public boolean method_18838() {
      return this.field_19882.method_960();
   }

   public boolean method_18842() {
      return !this.field_19882.method_960();
   }

   public String method_18839() {
      return this.field_19882.method_957();
   }

   public class_6631 method_18840() {
      return this.field_19880;
   }

   public class_226 method_18845() {
      return this.field_19882;
   }
}
