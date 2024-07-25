package net.minecraft.util.text.event;

public class ClickEvent {
   private final ClickEvent$class_47 action;
   private final String value;

   public ClickEvent(ClickEvent$class_47 theAction, String theValue) {
      this.action = theAction;
      this.value = theValue;
   }

   public ClickEvent$class_47 getAction() {
      return this.action;
   }

   public String getValue() {
      return this.value;
   }

   @Override
   public boolean equals(Object p_equals_1_) {
      if (this == p_equals_1_) {
         return true;
      } else if (p_equals_1_ != null && this.getClass() == p_equals_1_.getClass()) {
         ClickEvent var4 = (ClickEvent)p_equals_1_;
         if (this.action != var4.action) {
            return false;
         } else {
            if (this.value != null) {
               if (!this.value.equals(var4.value)) {
                  return false;
               }
            } else if (var4.value != null) {
               return false;
            }

            return true;
         }
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return "ClickEvent{action=" + this.action + ", value='" + this.value + '\'' + '}';
   }

   @Override
   public int hashCode() {
      int var3 = this.action.hashCode();
      return 31 * var3 + (this.value != null ? this.value.hashCode() : 0);
   }
}
