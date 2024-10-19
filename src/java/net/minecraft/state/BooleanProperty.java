package net.minecraft.state;

import com.google.common.collect.ImmutableSet;

import java.util.Collection;
import java.util.Optional;

public class BooleanProperty extends Property<Boolean> {
   private final ImmutableSet<Boolean> field38441 = ImmutableSet.of(true, false);

   public BooleanProperty(String var1) {
      super(var1, Boolean.class);
   }

   @Override
   public Collection<Boolean> method30474() {
      return this.field38441;
   }

   public static BooleanProperty create(String var0) {
      return new BooleanProperty(var0);
   }

   @Override
   public Optional<Boolean> method30476(String var1) {
      return !"true".equals(var1) && !"false".equals(var1) ? Optional.<Boolean>empty() : Optional.<Boolean>of(Boolean.valueOf(var1));
   }

   public String getName(Boolean var1) {
      return var1.toString();
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 instanceof BooleanProperty && super.equals(var1)) {
            BooleanProperty var4 = (BooleanProperty)var1;
            return this.field38441.equals(var4.field38441);
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public int method30477() {
      return 31 * super.method30477() + this.field38441.hashCode();
   }
}
