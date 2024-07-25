package remapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import it.unimi.dsi.fastutil.ints.Int2IntArrayMap;
import it.unimi.dsi.fastutil.ints.Int2IntMap;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.stream.Collectors;

public class class_2868 {
   private final ImmutableList<class_3884> field_14050;
   private final IntList field_14052 = new IntArrayList();
   private final int field_14051;
   private int field_14053 = -1;
   private int field_14055 = -1;
   private int field_14054 = -1;
   private final Int2IntMap field_14056 = new Int2IntArrayMap();

   public class_2868(ImmutableList<class_3884> var1) {
      this.field_14050 = var1;
      int var4 = 0;
      UnmodifiableIterator var5 = var1.iterator();

      while (var5.hasNext()) {
         class_3884 var6 = (class_3884)var5.next();
         this.field_14052.add(var4);
         class_9783 var7 = var6.method_17959();
         if (var7 != class_9783.field_49656) {
            if (var7 != class_9783.field_49650) {
               if (var7 != class_9783.field_49652) {
                  if (var7 == class_9783.field_49659) {
                     this.field_14056.put(var6.method_17960(), var4);
                  }
               } else {
                  this.field_14054 = var4;
               }
            } else {
               this.field_14055 = var4;
            }
         } else {
            this.field_14053 = var4;
         }

         var4 += var6.method_17961();
      }

      this.field_14051 = var4;
   }

   @Override
   public String toString() {
      return "format: "
         + this.field_14050.size()
         + " elements: "
         + this.field_14050.stream().<CharSequence>map(Object::toString).collect(Collectors.joining(" "));
   }

   public int method_13180() {
      return this.method_13168() / 4;
   }

   public int method_13168() {
      return this.field_14051;
   }

   public ImmutableList<class_3884> method_13174() {
      return this.field_14050;
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            class_2868 var4 = (class_2868)var1;
            return this.field_14051 == var4.field_14051 ? this.field_14050.equals(var4.field_14050) : false;
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      return this.field_14050.hashCode();
   }

   public void method_13179(long var1) {
      if (RenderSystem.method_16366()) {
         int var5 = this.method_13168();
         ImmutableList var6 = this.method_13174();

         for (int var7 = 0; var7 < var6.size(); var7++) {
            ((class_3884)var6.get(var7)).method_17956(var1 + (long)this.field_14052.getInt(var7), var5);
         }
      } else {
         RenderSystem.method_16474(() -> this.method_13179(var1));
      }
   }

   public void method_13173() {
      if (RenderSystem.method_16366()) {
         UnmodifiableIterator var3 = this.method_13174().iterator();

         while (var3.hasNext()) {
            class_3884 var4 = (class_3884)var3.next();
            var4.method_17957();
         }
      } else {
         RenderSystem.method_16474(this::method_13173);
      }
   }

   public int method_13176(int var1) {
      return this.field_14052.getInt(var1);
   }

   public boolean method_13171() {
      return this.field_14053 >= 0;
   }

   public int method_13170() {
      return this.field_14053;
   }

   public boolean method_13169() {
      return this.field_14055 >= 0;
   }

   public int method_13175() {
      return this.field_14055;
   }

   public boolean method_13172() {
      return this.field_14054 >= 0;
   }

   public int method_13167() {
      return this.field_14054;
   }

   public boolean method_13178(int var1) {
      return this.field_14056.containsKey(var1);
   }

   public int method_13177(int var1) {
      return this.field_14056.get(var1);
   }
}
