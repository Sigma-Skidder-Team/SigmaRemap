package remapped;

import com.mentalfrostbyte.jello.commands.CommandException;

public class class_4738 extends class_3720 {
   public class_4738() {
      super("toggle", "Toggle a module", "t");
      this.method_17259(new String[]{"module"});
   }

   @Override
   public void run(String var1, class_5273[] var2, class_860 var3) throws CommandException {
      if (var2.length != 1) {
         throw new class_2900();
      } else {
         class_9128 var6 = this.method_21895(var2[0].method_24060());
         if (var6 != null) {
            var6.method_41991(!var6.method_42015());
            var3.method_3731(var6.method_41992() + " was " + (!var6.method_42015() ? "disabled" : "enabled"));
         } else {
            throw new class_2900("Module \"" + var2[0].method_24060() + "\" not found");
         }
      }
   }

   public class_9128 method_21895(String var1) {
      for (class_9128 var5 : class_727.method_3328().method_3298().method_843().values()) {
         if (var5.method_41992().replace(" ", "").equalsIgnoreCase(var1)) {
            return var5;
         }
      }

      return null;
   }
}
