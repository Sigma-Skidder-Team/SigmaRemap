package remapped;

import com.google.common.collect.ImmutableSet;
import com.mojang.authlib.GameProfile;
import java.util.Set;

public class class_8456 extends class_5837 {
   private final class_5848 field_43232;

   public class_8456(class_7279[] var1, class_5848 var2) {
      super(var1);
      this.field_43232 = var2;
   }

   @Override
   public class_1404 method_13321() {
      return class_5116.field_26395;
   }

   @Override
   public Set<class_9791<?>> method_12681() {
      return ImmutableSet.of(this.field_43232.method_26666());
   }

   @Override
   public ItemStack method_26627(ItemStack var1, class_2792 var2) {
      if (var1.method_27960() == class_4897.field_24749) {
         Entity var5 = var2.<Entity>method_12698(this.field_43232.method_26666());
         if (var5 instanceof class_704) {
            GameProfile var6 = ((class_704)var5).method_3247();
            var1.method_27994().method_25946("SkullOwner", class_4338.method_20177(new class_5734(), var6));
         }
      }

      return var1;
   }
}
