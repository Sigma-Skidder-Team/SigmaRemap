package mapped;

import com.google.common.collect.ImmutableSet;
import javax.annotation.Nullable;

public class Class8395 {
   public static final Class8395 field36011 = method29461("none", Class4913.field22751, (Class9455)null);
   public static final Class8395 field36012 = method29461("armorer", Class4913.field22752, Class6067.field27196);
   public static final Class8395 field36013 = method29461("butcher", Class4913.field22753, Class6067.field27197);
   public static final Class8395 field36014 = method29461("cartographer", Class4913.field22754, Class6067.field27198);
   public static final Class8395 field36015 = method29461("cleric", Class4913.field22755, Class6067.field27199);
   public static final Class8395 field36016 = method29462(
      "farmer",
      Class4913.field22756,
      ImmutableSet.of(Class8514.field37842, Class8514.field37841, Class8514.field38112, Class8514.field37934),
      ImmutableSet.of(Class8487.field36540),
      Class6067.field27200
   );
   public static final Class8395 field36017 = method29461("fisherman", Class4913.field22757, Class6067.field27201);
   public static final Class8395 field36018 = method29461("fletcher", Class4913.field22758, Class6067.field27202);
   public static final Class8395 field36019 = method29461("leatherworker", Class4913.field22759, Class6067.field27203);
   public static final Class8395 field36020 = method29461("librarian", Class4913.field22760, Class6067.field27204);
   public static final Class8395 field36021 = method29461("mason", Class4913.field22761, Class6067.field27205);
   public static final Class8395 field36022 = method29461("nitwit", Class4913.field22762, (Class9455)null);
   public static final Class8395 field36023 = method29461("shepherd", Class4913.field22763, Class6067.field27206);
   public static final Class8395 field36024 = method29461("toolsmith", Class4913.field22764, Class6067.field27207);
   public static final Class8395 field36025 = method29461("weaponsmith", Class4913.field22765, Class6067.field27208);
   private final String field36026;
   private final Class4913 field36027;
   private final ImmutableSet<Class3257> field36028;
   private final ImmutableSet<Class3209> field36029;
   private final Class9455 field36030;

   private Class8395(String var1, Class4913 var2, ImmutableSet<Class3257> var3, ImmutableSet<Class3209> var4, Class9455 var5) {
      this.field36026 = var1;
      this.field36027 = var2;
      this.field36028 = var3;
      this.field36029 = var4;
      this.field36030 = var5;
   }

   public Class4913 method29457() {
      return this.field36027;
   }

   public ImmutableSet<Class3257> method29458() {
      return this.field36028;
   }

   public ImmutableSet<Class3209> method29459() {
      return this.field36029;
   }

   @Nullable
   public Class9455 method29460() {
      return this.field36030;
   }

   @Override
   public String toString() {
      return this.field36026;
   }

   public static Class8395 method29461(String var0, Class4913 var1, Class9455 var2) {
      return method29462(var0, var1, ImmutableSet.of(), ImmutableSet.of(), var2);
   }

   public static Class8395 method29462(String var0, Class4913 var1, ImmutableSet<Class3257> var2, ImmutableSet<Class3209> var3, Class9455 var4) {
      return Class2348.<Class8395, Class8395>method9195(Class2348.field16090, new ResourceLocation(var0), new Class8395(var0, var1, var2, var3, var4));
   }
}
