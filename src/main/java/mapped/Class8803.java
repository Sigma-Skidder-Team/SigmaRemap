package mapped;

import java.util.Iterator;
import java.util.List;

public class Class8803 {
   private final Class8262 field39631 = null;
   private final List<Class8150> field39632 = null;
   private long field39633;

   public void method31783(long var1) {
      try {
         this.method31785(var1);
      } catch (Exception var6) {
      }
   }

   public void method31784(long var1) {
      try {
         this.method31785(var1);
      } catch (Exception var6) {
         this.field39631.method28814(var6);
      }
   }

   private void method31785(long var1) {
      Iterator var5 = this.field39632.iterator();

      while (var5.hasNext()) {
         Class8150 var6 = (Class8150)var5.next();
         var6.field35079.run();
         var5.remove();
         long var7 = var1 - this.field39633;
         long var9 = this.field39633;
         this.field39633 = var1;
         if (var6.field35078 != null && var6.field35078 != var7) {
            this.field39631.method28814(new Class2475("Succeeded in invalid tick: expected " + (var9 + var6.field35078) + ", but current tick is " + var1));
            break;
         }
      }
   }

   private Class8803() {
      throw new RuntimeException("Synthetic constructor added by MCP, do not call");
   }
}
