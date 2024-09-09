package mapped;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.UUID;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class Class9767 {
   private final Map<Attribute, ModifiableAttributeInstance> field45701;

   public Class9767(Map<Attribute, ModifiableAttributeInstance> var1) {
      this.field45701 = ImmutableMap.copyOf(var1);
   }

   private ModifiableAttributeInstance method38411(Attribute var1) {
      ModifiableAttributeInstance var4 = this.field45701.get(var1);
      if (var4 != null) {
         return var4;
      } else {
         throw new IllegalArgumentException("Can't find attribute " + Registry.field16087.getKey(var1));
      }
   }

   public double method38412(Attribute var1) {
      return this.method38411(var1).method38674();
   }

   public double method38413(Attribute var1) {
      return this.method38411(var1).method38660();
   }

   public double method38414(Attribute var1, UUID var2) {
      AttributeModifier var5 = this.method38411(var1).method38664(var2);
      if (var5 != null) {
         return var5.method37933();
      } else {
         throw new IllegalArgumentException("Can't find modifier " + var2 + " on attribute " + Registry.field16087.getKey(var1));
      }
   }

   @Nullable
   public ModifiableAttributeInstance method38415(Consumer<ModifiableAttributeInstance> var1, Attribute var2) {
      ModifiableAttributeInstance var5 = this.field45701.get(var2);
      if (var5 != null) {
         ModifiableAttributeInstance var6 = new ModifiableAttributeInstance(var2, var1);
         var6.method38677(var5);
         return var6;
      } else {
         return null;
      }
   }

   public static Class7037 method38416() {
      return new Class7037();
   }

   public boolean method38417(Attribute var1) {
      return this.field45701.containsKey(var1);
   }

   public boolean method38418(Attribute var1, UUID var2) {
      ModifiableAttributeInstance var5 = this.field45701.get(var1);
      return var5 != null && var5.method38664(var2) != null;
   }
}
