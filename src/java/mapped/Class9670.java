package mapped;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import net.minecraft.nbt.INBT;

import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class Class9670 {
   private static String[] field45157;
   private final String field45158;
   private final Object2IntMap<Class8356> field45159;
   private final Class8356[] field45160;

   public Class9670(String var1, Class8356[] var2, Object2IntMap<Class8356> var3) {
      this.field45158 = var1;
      this.field45160 = var2;
      this.field45159 = var3;
   }

   public List<INBT> method37725(INBT var1) throws CommandSyntaxException {
      List var4 = Collections.<INBT>singletonList(var1);

      for (Class8356 var8 : this.field45160) {
         var4 = var8.method29296(var4);
         if (var4.isEmpty()) {
            throw this.method37732(var8);
         }
      }

      return var4;
   }

   public int method37726(INBT var1) {
      List var4 = Collections.<INBT>singletonList(var1);

      for (Class8356 var8 : this.field45160) {
         var4 = var8.method29296(var4);
         if (var4.isEmpty()) {
            return 0;
         }
      }

      return var4.size();
   }

   private List<INBT> method37727(INBT var1) throws CommandSyntaxException {
      List var4 = Collections.<INBT>singletonList(var1);

      for (int var5 = 0; var5 < this.field45160.length - 1; var5++) {
         Class8356 var6 = this.field45160[var5];
         int var7 = var5 + 1;
         var4 = var6.method29297(var4, this.field45160[var7]::method29293);
         if (var4.isEmpty()) {
            throw this.method37732(var6);
         }
      }

      return var4;
   }

   public List<INBT> method37728(INBT var1, Supplier<INBT> var2) throws CommandSyntaxException {
      List var5 = this.method37727(var1);
      Class8356 var6 = this.field45160[this.field45160.length - 1];
      return var6.method29297(var5, var2);
   }

   private static int method37729(List<INBT> var0, Function<INBT, Integer> var1) {
      return var0.stream().<Integer>map(var1).reduce(0, (var0x, var1x) -> var0x + var1x);
   }

   public int method37730(INBT var1, Supplier<INBT> var2) throws CommandSyntaxException {
      List var5 = this.method37727(var1);
      Class8356 var6 = this.field45160[this.field45160.length - 1];
      return method37729(var5, var2x -> var6.method29294(var2x, var2));
   }

   public int method37731(INBT var1) {
      List var4 = Collections.<INBT>singletonList(var1);

      for (int var5 = 0; var5 < this.field45160.length - 1; var5++) {
         var4 = this.field45160[var5].method29296(var4);
      }

      Class8356 var6 = this.field45160[this.field45160.length - 1];
      return method37729(var4, var6::method29295);
   }

   private CommandSyntaxException method37732(Class8356 var1) {
      int var4 = this.field45159.getInt(var1);
      return Class8320.field35744.create(this.field45158.substring(0, var4));
   }

   @Override
   public String toString() {
      return this.field45158;
   }
}
