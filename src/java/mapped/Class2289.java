package mapped;

import net.minecraft.advancements.Advancement;

import java.util.Iterator;

public enum Class2289 {
   field15224("grant") {
      @Override
      public boolean method9038(ServerPlayerEntity class878, Advancement class7952) {
         Class2006 class2006 = class878.method2823().method27416(class7952);
         if (class2006.method8489()) {
            return false;
         }
          for (String string : class2006.method8499()) {
              class878.method2823().method27410(class7952, string);
          }
         return true;
      }

      @Override
      public boolean method9039(ServerPlayerEntity class878, Advancement class7952, String string) {
         return class878.method2823().method27410(class7952, string);
      }
   },
   field15225("revoke") {
      @Override
      public boolean method9038(ServerPlayerEntity class878, Advancement class7952) {
         Class2006 class2006 = class878.method2823().method27416(class7952);
         if (!class2006.method8490()) {
            return false;
         }
         Iterator<String> iterator = class2006.method8500().iterator();
         while (iterator.hasNext()) {
            String string = iterator.next();
            class878.method2823().method27411(class7952, string);
         }
         return true;
      }

      @Override
      public boolean method9039(ServerPlayerEntity class878, Advancement class7952, String string) {
         return class878.method2823().method27411(class7952, string);
      }
   };

   private final String field15226;
   private static final Class2289[] field15227 = new Class2289[]{field15224, field15225};

   private Class2289(String var3) {
      this.field15226 = "commands.advancement." + var3;
   }

   public int method9037(ServerPlayerEntity var1, Iterable<Advancement> var2) {
      int var5 = 0;

      for (Advancement var7 : var2) {
         if (this.method9038(var1, var7)) {
            var5++;
         }
      }

      return var5;
   }

   public abstract boolean method9038(ServerPlayerEntity var1, Advancement var2);

   public abstract boolean method9039(ServerPlayerEntity var1, Advancement var2, String var3);

   public String method9040() {
      return this.field15226;
   }
}
