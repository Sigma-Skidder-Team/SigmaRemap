package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import it.unimi.dsi.fastutil.ints.Int2IntArrayMap;
import it.unimi.dsi.fastutil.ints.Int2IntMap;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.stream.Collectors;

public class Class7831 {
   private final ImmutableList<Class8209> field33616;
   private final IntList field33617 = new IntArrayList();
   private final int field33618;
   private int field33619 = -1;
   private int field33620 = -1;
   private int field33621 = -1;
   private final Int2IntMap field33622 = new Int2IntArrayMap();

   public Class7831(ImmutableList<Class8209> var1) {
      this.field33616 = var1;
      int var4 = 0;
      UnmodifiableIterator var5 = var1.iterator();

      while (var5.hasNext()) {
         Class8209 var6 = (Class8209)var5.next();
         this.field33617.add(var4);
         Class2142 var7 = var6.method28517();
         if (var7 != Class2142.field14018) {
            if (var7 != Class2142.field14019) {
               if (var7 != Class2142.field14020) {
                  if (var7 == Class2142.field14021) {
                     this.field33622.put(var6.method28518(), var4);
                  }
               } else {
                  this.field33621 = var4;
               }
            } else {
               this.field33620 = var4;
            }
         } else {
            this.field33619 = var4;
         }

         var4 += var6.method28519();
      }

      this.field33618 = var4;
   }

   @Override
   public String toString() {
      return "format: "
         + this.field33616.size()
         + " elements: "
         + this.field33616.stream().<CharSequence>map(Object::toString).collect(Collectors.joining(" "));
   }

   public int method26215() {
      return this.method26216() / 4;
   }

   public int method26216() {
      return this.field33618;
   }

   public ImmutableList<Class8209> method26217() {
      return this.field33616;
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            Class7831 var4 = (Class7831)var1;
            return this.field33618 == var4.field33618 ? this.field33616.equals(var4.field33616) : false;
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      return this.field33616.hashCode();
   }

   public void method26218(long var1) {
      if (RenderSystem.method27803()) {
         int var5 = this.method26216();
         ImmutableList var6 = this.method26217();

         for (int var7 = 0; var7 < var6.size(); var7++) {
            ((Class8209)var6.get(var7)).method28520(var1 + (long)this.field33617.getInt(var7), var5);
         }
      } else {
         RenderSystem.method27810(() -> this.method26218(var1));
      }
   }

   public void method26219() {
      if (RenderSystem.method27803()) {
         UnmodifiableIterator var3 = this.method26217().iterator();

         while (var3.hasNext()) {
            Class8209 var4 = (Class8209)var3.next();
            var4.method28521();
         }
      } else {
         RenderSystem.method27810(this::method26219);
      }
   }

   public int method26220(int var1) {
      return this.field33617.getInt(var1);
   }

   public boolean method26221() {
      return this.field33619 >= 0;
   }

   public int method26222() {
      return this.field33619;
   }

   public boolean method26223() {
      return this.field33620 >= 0;
   }

   public int method26224() {
      return this.field33620;
   }

   public boolean method26225() {
      return this.field33621 >= 0;
   }

   public int method26226() {
      return this.field33621;
   }

   public boolean method26227(int var1) {
      return this.field33622.containsKey(var1);
   }

   public int method26228(int var1) {
      return this.field33622.get(var1);
   }
}
