package mapped;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;

import java.util.Map;
import java.util.Set;

public class Class138 extends Class128 {
   private static String[] field463;
   private static final Map<ResourceLocation, Class8409> field464 = Maps.newHashMap();
   private final Class6069 field465;
   private final Class2582 field466;

   public Class138(ILootCondition[] var1, Class6069 var2, Class2582 var3) {
      super(var1);
      this.field465 = var2;
      this.field466 = var3;
   }

   @Override
   public LootFunctionType getFunctionType() {
      return LootFunctionManager.APPLY_BONUS;
   }

   @Override
   public Set<Class9821<?>> method355() {
      return ImmutableSet.of(Class9525.field44338);
   }

   @Override
   public ItemStack method371(ItemStack var1, LootContext var2) {
      ItemStack var5 = var2.<ItemStack>method26081(Class9525.field44338);
      if (var5 != null) {
         int var6 = Class7858.method26311(this.field465, var5);
         int var7 = this.field466.method10785(var2.method26088(), var1.getCount(), var6);
         var1.method32180(var7);
      }

      return var1;
   }

   public static Class5876<?> method406(Class6069 var0, float var1, int var2) {
      return method372(var3 -> new Class138(var3, var0, new Class2583(var2, var1)));
   }

   public static Class5876<?> method407(Class6069 var0) {
      return method372(var1 -> new Class138(var1, var0, new Class2584()));
   }

   public static Class5876<?> method408(Class6069 var0) {
      return method372(var1 -> new Class138(var1, var0, new Class2581(1)));
   }

   public static Class5876<?> method409(Class6069 var0, int var1) {
      return method372(var2 -> new Class138(var2, var0, new Class2581(var1)));
   }

   // $VF: synthetic method
   public static Class6069 method414(Class138 var0) {
      return var0.field465;
   }

   // $VF: synthetic method
   public static Class2582 method415(Class138 var0) {
      return var0.field466;
   }

   // $VF: synthetic method
   public static Map method416() {
      return field464;
   }

   static {
      field464.put(Class2583.field16805, Class2583::method10789);
      field464.put(Class2584.field16808, Class2584::method10790);
      field464.put(Class2581.field16803, Class2581::method10787);
   }
}
