package mapped;

import com.google.common.base.Preconditions;

import javax.annotation.Nullable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;

public abstract class ViaVersion7<C1 extends Class1913, C2 extends Class1913, S1 extends Class1919, S2 extends Class1919> {
   private final Map<Class8545, Class6876> field27910 = new HashMap<Class8545, Class6876>();
   private final Map<Class8545, Class6876> field27911 = new HashMap<Class8545, Class6876>();
   private final Map<Class, Object> field27912 = new HashMap<Class, Object>();
   public final Class<C1> field27913;
   public final Class<C2> field27914;
   public final Class<S1> field27915;
   public final Class<S2> field27916;

   public ViaVersion7() {
      this(null, null, null, null);
   }

   public ViaVersion7(Class<C1> var1, Class<C2> var2, Class<S1> var3, Class<S2> var4) {
      this.field27913 = var1;
      this.field27914 = var2;
      this.field27915 = var3;
      this.field27916 = var4;
      this.method19341();
      if (var1 != null && var2 != null && var1 != var2) {
         this.method19343();
      }

      if (var3 != null && var4 != null && var3 != var4) {
         this.method19344();
      }
   }

   public void method19343() {
      Class1913[] var3 = this.field27914.getEnumConstants();
      HashMap var4 = new HashMap(var3.length);

      for (Class1913 var8 : var3) {
         var4.put(var8.method8193(), var8);
      }

      for (Class1913 var15 : (Class1913[])this.field27913.getEnumConstants()) {
         Class1913 var9 = (Class1913)var4.get(var15.method8193());
         int var10 = var15.method8194();
         if (var9 != null) {
            int var11 = var9.method8194();
            if (!this.method19367(Class187.field702, var10)) {
               this.method19355(Class187.field702, var10, var11);
            }
         } else {
            Preconditions.checkArgument(
               this.method19367(Class187.field702, var10),
               "Packet " + var15 + " in " + this.getClass().getSimpleName() + " has no mapping - it needs to be manually cancelled or remapped!"
            );
         }
      }
   }

   public void method19344() {
      Class1919[] var3 = this.field27915.getEnumConstants();
      HashMap var4 = new HashMap(var3.length);

      for (Class1919 var8 : var3) {
         var4.put(var8.method8193(), var8);
      }

      for (Class1919 var15 : (Class1919[])this.field27916.getEnumConstants()) {
         Class1919 var9 = (Class1919)var4.get(var15.method8193());
         int var10 = var15.method8194();
         if (var9 != null) {
            int var11 = var9.method8194();
            if (!this.method19368(Class187.field702, var10)) {
               this.method19350(Class187.field702, var11, var10);
            }
         } else {
            Preconditions.checkArgument(
               this.method19368(Class187.field702, var10),
               "Packet " + var15 + " in " + this.getClass().getSimpleName() + " has no mapping - it needs to be manually cancelled or remapped!"
            );
         }
      }
   }

   public boolean method19345(Class var1) {
      return false;
   }

   public void method19346(Class7161 var1, Object var2, List var3) throws Exception {
      var3.add(var2);
   }

   public void method19341() {
   }

   public final void method19347() {
      this.method19376().method18527();
      this.method19348();
   }

   public void method19348() {
   }

   public void method19349(ViaVersion6 var1) {
   }

   public void method19342(Class7161 var1) {
   }

   public void method19350(Class187 var1, int var2, int var3) {
      this.method19351(var1, var2, var3, null);
   }

   public void method19351(Class187 var1, int var2, int var3, Class3758 var4) {
      this.method19352(var1, var2, var3, var4, false);
   }

   public void method19352(Class187 var1, int var2, int var3, Class3758 var4, boolean var5) {
      Class6876 var8 = new Class6876(var1, var2, var3, var4);
      Class8545 var9 = new Class8545(var1, var3);
      if (!var5 && this.field27910.containsKey(var9)) {
         ViaVersion3.method27613()
            .getLogger()
            .log(Level.WARNING, var9 + " already registered! If this override is intentional, set override to true. Stacktrace: ", (Throwable)(new Exception()));
      }

      this.field27910.put(var9, var8);
   }

   public void method19353(Class187 var1, int var2, int var3) {
      this.method19351(var1, var2, var3, new Class3787(this));
   }

   public void method19354(Class187 var1, int var2) {
      this.method19353(var1, -1, var2);
   }

   public void method19355(Class187 var1, int var2, int var3) {
      this.method19356(var1, var2, var3, null);
   }

   public void method19356(Class187 var1, int var2, int var3, Class3758 var4) {
      this.method19359(var1, var2, var3, var4, false);
   }

   public void method19357(Class187 var1, int var2, int var3) {
      this.method19356(var1, var2, var3, new Class4043(this));
   }

   public void method19358(Class187 var1, int var2) {
      this.method19357(var1, var2, -1);
   }

   public void method19359(Class187 var1, int var2, int var3, Class3758 var4, boolean var5) {
      Class6876 var8 = new Class6876(var1, var2, var3, var4);
      Class8545 var9 = new Class8545(var1, var2);
      if (!var5 && this.field27911.containsKey(var9)) {
         ViaVersion3.method27613()
            .getLogger()
            .log(Level.WARNING, var9 + " already registered! If override is intentional, set override to true. Stacktrace: ", (Throwable)(new Exception()));
      }

      this.field27911.put(var9, var8);
   }

   public void method19360(C1 var1, Class3758 var2) {
      this.method19372(var1, var1.getClass() == this.field27913);
      Class1913 var5 = this.field27913 != this.field27914
         ? Arrays.<C2>stream(this.field27914.getEnumConstants()).filter(var1x -> var1x.method8193().equals(var1.method8193())).findAny().orElse(null)
         : var1;
      Preconditions.checkNotNull(var5, "Packet type " + var1 + " in " + var1.getClass().getSimpleName() + " could not be automatically mapped!");
      int var6 = var1.method8194();
      int var7 = var5.method8194();
      this.method19356(Class187.field702, var6, var7, var2);
   }

   public void method19361(C1 var1, C2 var2, Class3758 var3) {
      this.method19372(var1, var1.getClass() == this.field27913);
      this.method19372(var2, var2 == null || var2.getClass() == this.field27914);
      this.method19356(Class187.field702, var1.method8194(), var2 == null ? -1 : var2.method8194(), var3);
   }

   public void method19362(C1 var1, C2 var2) {
      this.method19361((C1)var1, (C2)var2, null);
   }

   public void method19363(C1 var1) {
      this.method19357(Class187.field702, var1.method8194(), var1.method8194());
   }

   public void method19364(S2 var1, Class3758 var2) {
      this.method19372(var1, var1.getClass() == this.field27916);
      Class1919 var5 = this.field27915 != this.field27916
         ? Arrays.<S1>stream(this.field27915.getEnumConstants()).filter(var1x -> var1x.method8193().equals(var1.method8193())).findAny().orElse(null)
         : var1;
      Preconditions.checkNotNull(var5, "Packet type " + var1 + " in " + var1.getClass().getSimpleName() + " could not be automatically mapped!");
      int var6 = var5.method8194();
      int var7 = var1.method8194();
      this.method19351(Class187.field702, var6, var7, var2);
   }

   public void method19365(S2 var1, S1 var2, Class3758 var3) {
      this.method19372(var1, var1.getClass() == this.field27916);
      this.method19372(var2, var2 == null || var2.getClass() == this.field27915);
      this.method19351(Class187.field702, var2 == null ? -1 : var2.method8194(), var1.method8194(), var3);
   }

   public void method19366(S2 var1) {
      Preconditions.checkArgument(var1.getClass() == this.field27916);
      this.method19353(Class187.field702, -1, var1.method8194());
   }

   public boolean method19367(Class187 var1, int var2) {
      Class8545 var5 = new Class8545(var1, var2);
      return this.field27911.containsKey(var5);
   }

   public boolean method19368(Class187 var1, int var2) {
      Class8545 var5 = new Class8545(var1, var2);
      return this.field27910.containsKey(var5);
   }

   public void method19369(Class2302 var1, Class187 var2, Class8563 var3) throws Exception {
      Class8545 var6 = new Class8545(var2, var3.method30586());
      Map var7 = var1 == Class2302.field15717 ? this.field27911 : this.field27910;
      Class6876 var8 = (Class6876)var7.get(var6);
      if (var8 != null) {
         int var9 = var3.method30586();
         int var10 = var1 == Class2302.field15717 ? var8.method20938() : var8.method20937();
         var3.method30587(var10);
         Class3758 var11 = var8.method20939();
         if (var11 != null) {
            try {
               var11.method12734(var3);
            } catch (Class2447 var13) {
               this.method19370(var1, var2, var9, var10, var13);
               return;
            }

            if (var3.method30579()) {
               throw ViaVersion4.method10461();
            }
         }
      }
   }

   private void method19370(Class2302 var1, Class187 var2, int var3, int var4, Class2447 var5) throws Class2447 {
      if (var2 != Class187.field699) {
         Class var8 = var2 != Class187.field702 ? null : (var1 != Class2302.field15717 ? this.field27916 : this.field27913);
         if (var8 == null) {
            ViaVersion3.method27613()
               .getLogger()
               .warning("ERROR IN " + this.getClass().getSimpleName() + " IN REMAP OF " + this.method19371(var3) + "->" + this.method19371(var4));
         } else {
            Class1918[] var9 = (Class1918[])var8.getEnumConstants();
            Class1918 var10 = var3 < var9.length && var3 >= 0 ? var9[var3] : null;
            ViaVersion3.method27613()
               .getLogger()
               .warning("ERROR IN " + this.getClass().getSimpleName() + " IN REMAP OF " + var10 + " (" + this.method19371(var3) + ")");
         }

         throw var5;
      } else {
         throw var5;
      }
   }

   private String method19371(int var1) {
      String var4 = Integer.toHexString(var1).toUpperCase();
      return (var4.length() != 1 ? "0x" : "0x0") + var4;
   }

   private void method19372(Class1918 var1, boolean var2) {
      if (!var2) {
         throw new IllegalArgumentException("Packet type " + var1 + " in " + var1.getClass().getSimpleName() + " is taken from the wrong enum");
      }
   }

   @Nullable
   public <T> T method19373(Class<T> var1) {
      return (T)this.field27912.get(var1);
   }

   public void method19374(Object var1) {
      this.field27912.put(var1.getClass(), var1);
   }

   public boolean method19375() {
      return this.method19376() != null;
   }

   @Nullable
   public Class5979 method19376() {
      return null;
   }

   @Override
   public String toString() {
      return "Protocol:" + this.getClass().getSimpleName();
   }
}
