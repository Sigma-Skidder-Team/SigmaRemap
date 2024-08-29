package mapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Class1807 implements AutoCloseable {
   private static final Class8977 field9730 = new Class8977();
   private static final Class2052 field9731 = () -> 4.0F;
   private static final Random field9732 = new Random();
   private final TextureManager field9733;
   private final ResourceLocation field9734;
   private Class8978 field9735;
   private Class8978 field9736;
   private final List<Class1768> field9737 = Lists.newArrayList();
   private final Int2ObjectMap<Class8978> field9738 = new Int2ObjectOpenHashMap();
   private final Int2ObjectMap<Class2052> field9739 = new Int2ObjectOpenHashMap();
   private final Int2ObjectMap<IntList> field9740 = new Int2ObjectOpenHashMap();
   private final List<Class298> field9741 = Lists.newArrayList();

   public Class1807(TextureManager var1, ResourceLocation var2) {
      this.field9733 = var1;
      this.field9734 = var2;
   }

   public void method7919(List<Class1768> var1) {
      this.method7920();
      this.method7921();
      this.field9738.clear();
      this.field9739.clear();
      this.field9740.clear();
      this.field9735 = this.method7925(Class2054.field13380);
      this.field9736 = this.method7925(Class2050.field13375);
      Set<Integer> var4 = new IntOpenHashSet();

      for (Class1768 var6 : var1) {
         var4.addAll(var6.method7735());
      }

      HashSet var7 = Sets.newHashSet();
      var4.forEach(var3 -> {
         for (Class1768 var7x : var1) {
            Object var8 = var3 != 32 ? var7x.method7734(var3) : field9731;
            if (var8 != null) {
               var7.add(var7x);
               if (var8 != Class2054.field13380) {
                  this.field9740.computeIfAbsent(MathHelper.method37773(((Class2052)var8).method8699(false)), var0 -> new IntArrayList()).add(var3);
               }
               break;
            }
         }
      });
      var1.stream().filter(var7::contains).forEach(this.field9737::add);
   }

   @Override
   public void close() {
      this.method7920();
      this.method7921();
   }

   private void method7920() {
      for (Class1768 var4 : this.field9737) {
         var4.close();
      }

      this.field9737.clear();
   }

   private void method7921() {
      for (Class298 var4 : this.field9741) {
         var4.close();
      }

      this.field9741.clear();
   }

   public Class2052 method7922(int var1) {
      Class2052 var4 = this.field9739.get(var1);
      if (var4 == null) {
         if (var1 != 32) {
            var4 = this.method7923(var1);
         } else {
            var4 = field9731;
         }

         this.field9739.put(var1, var4);
      }

      return var4;
   }

   private Class2051 method7923(int var1) {
      for (Class1768 var5 : this.field9737) {
         Class2051 var6 = var5.method7734(var1);
         if (var6 != null) {
            return var6;
         }
      }

      return Class2054.field13380;
   }

   public Class8978 method7924(int var1) {
      Class8978 var4 = this.field9738.get(var1);
      if (var4 == null) {
         if (var1 != 32) {
            var4 = this.method7925(this.method7923(var1));
         } else {
            var4 = field9730;
         }

         this.field9738.put(var1, var4);
      }

      return var4;
   }

   private Class8978 method7925(Class2051 var1) {
      for (Class298 var5 : this.field9741) {
         Class8978 var6 = var5.method1175(var1);
         if (var6 != null) {
            return var6;
         }
      }

      Class298 var7 = new Class298(new ResourceLocation(this.field9734.getNamespace(), this.field9734.getPath() + "/" + this.field9741.size()), var1.method8692());
      this.field9741.add(var7);
      this.field9733.method1073(var7.method1176(), var7);
      Class8978 var8 = var7.method1175(var1);
      return var8 != null ? var8 : this.field9735;
   }

   public Class8978 method7926(Class2052 var1) {
      IntList var4 = (IntList)this.field9740.get(MathHelper.method37773(var1.method8699(false)));
      return var4 != null && !var4.isEmpty() ? this.method7924(var4.getInt(field9732.nextInt(var4.size()))) : this.field9735;
   }

   public Class8978 method7927() {
      return this.field9736;
   }
}
