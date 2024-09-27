package mapped;

public class Class3900 extends Class3758 {
   private static String[] field20149;
   public final Class9524 field20150;

   public Class3900(Class9524 var1) {
      this.field20150 = var1;
   }

   @Override
   public void method12725() {
      if (this.field20150 == null) {
         return;
      }
      this.map(Class9524.method36805(this.field20150));
      this.map(BruhMotha.field22544);
      this.method12733(
         var1 -> var1.method30558(
               BruhMotha.field22544, 0, Class9524.method36806(this.field20150).method19376().method18528(var1.<Integer>method30555(BruhMotha.field22544, 0))
            )
      );
   }
}
