package mapped;

public class Class3807 extends Class3758 {
   private static String[] field20002;
   public final Class5150 field20003;

   public Class3807(Class5150 var1) {
      this.field20003 = var1;
   }

   @Override
   public void method12725() {
      this.map(BruhMotha.field22544);
      this.method12733(var1 -> {
         int var4 = var1.<Integer>method30555(BruhMotha.field22544, 0);
         int var5 = this.field20003.field23379.method27124(var4);
         if (var5 != -1) {
            if (var4 != var5) {
               var1.method30558(BruhMotha.field22544, 0, var5);
            }
         } else {
            var1.method30578();
         }
      });
   }
}
