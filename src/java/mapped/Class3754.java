package mapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;

import java.util.Set;
import java.util.stream.Collectors;

public class Class3754 extends Class3676<Class1042> {
   private static String[] field19909;
   private Set<Class3257> field19910 = ImmutableSet.of();

   public Class3754() {
      super(ImmutableMap.of(Class8830.field39828, Class2217.field14484, Class8830.field39819, Class2217.field14484));
   }

   public boolean method12508(ServerWorld var1, Class1042 var2) {
      return Class6983.method21571(var2.method2992(), Class8830.field39828, Class8992.field41098);
   }

   public boolean method12499(ServerWorld var1, Class1042 var2, long var3) {
      return this.method12508(var1, var2);
   }

   public void method12502(ServerWorld var1, Class1042 var2, long var3) {
      Class1042 var7 = (Class1042)var2.method2992().<Class880>method21410(Class8830.field39828).get();
      Class6983.method21569(var2, var7, 0.5F);
      this.field19910 = method12721(var2, var7);
   }

   public void method12504(ServerWorld var1, Class1042 var2, long var3) {
      Class1042 var7 = (Class1042)var2.method2992().<Class880>method21410(Class8830.field39828).get();
      if (!(var2.getDistanceSq(var7) > 5.0)) {
         Class6983.method21569(var2, var7, 0.5F);
         var2.method4714(var1, var7, var3);
         if (var2.method4709() && (var2.method4674().method26571() == Class8395.field36016 || var7.method4710())) {
            method12722(var2, Class1042.field5777.keySet(), var7);
         }

         if (var7.method4674().method26571() == Class8395.field36016
            && var2.method4752().method3634(Class8514.field37842) > Class8514.field37842.method11710() / 2) {
            method12722(var2, ImmutableSet.of(Class8514.field37842), var7);
         }

         if (!this.field19910.isEmpty() && var2.method4752().method3635(this.field19910)) {
            method12722(var2, this.field19910, var7);
         }
      }
   }

   public void method12506(ServerWorld var1, Class1042 var2, long var3) {
      var2.method2992().method21405(Class8830.field39828);
   }

   private static Set<Class3257> method12721(Class1042 var0, Class1042 var1) {
      ImmutableSet<Class3257> var4 = var1.method4674().method26571().method29458();
      ImmutableSet<Class3257> var5 = var0.method4674().method26571().method29458();
      return var4.stream().filter(var1x -> !var5.contains(var1x)).collect(Collectors.toSet());
   }

   private static void method12722(Class1042 var0, Set<Class3257> var1, Class880 var2) {
      Class927 var5 = var0.method4752();
      ItemStack var6 = ItemStack.field39973;

      for (int var7 = 0; var7 < var5.method3629(); var7++) {
         ItemStack var8 = var5.method3618(var7);
         if (!var8.method32105()) {
            Class3257 var9 = var8.method32107();
            if (var1.contains(var9)) {
               int var10;
               if (var8.method32179() <= var8.method32113() / 2) {
                  if (var8.method32179() <= 24) {
                     continue;
                  }

                  var10 = var8.method32179() - 24;
               } else {
                  var10 = var8.method32179() / 2;
               }

               var8.method32182(var10);
               var6 = new ItemStack(var9, var10);
               break;
            }
         }
      }

      if (!var6.method32105()) {
         Class6983.method21578(var0, var6, var2.getPositionVec());
      }
   }
}
