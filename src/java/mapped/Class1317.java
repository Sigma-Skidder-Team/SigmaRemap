package mapped;

public class Class1317 extends MultiplayerScreen {
   private Class1206 field6959;
   public static int field6960 = 0;
   private Class1197 field6961;

   public Class1317() {
      super(new MainMenuScreen());
   }

   public Class1317(Screen var1) {
      super(var1);
   }

  /* @Override
   public void method1921() {
      super.method1921();
      Class5807 var3 = new Class5807(
         "jello.portaloption",
         0.0,
         (double)(this.method6251().size() - 1),
         1.0F,
         var1 -> (double)this.method6250(),
         (var1, var2) -> Class8005.field34417 = this.method6252(var2.intValue()),
         (var1, var2) -> {
            int var5 = (int)var2.method18090(var1);
            return new StringTextComponent(this.method6252(var5).method18580());
         }
      );
      this.field6961 = this.<Class1197>method2455(var3.method17946(this.field4562.field1299, this.field4564 / 2 + 40, 7, 114));
   }

   @Override
   public void method1923(Class9332 var1, int var2, int var3, float var4) {
      super.method1923(var1, var2, var3, var4);
      Class3192.method11420(
         0, 0, Minecraft.getInstance().field1283.method8043(), (int)(30.0 * Minecraft.getInstance().field1283.method8049() / (double) GuiManager.field41348)
      );
      this.method2469(var1);
      Class3192.method11422();
      this.field6961.method1923(var1, var2, var3, var4);
      method5692(var1, this.field4568, this.method2453().getString(), this.field4564 / 2 - 146, 13, 16777215);
      method5692(var1, this.field4568, "Jello Portal:", this.field4564 / 2 - 30, 13, Class5628.method17688(Class1979.field12896.field12910, 0.5F));
   }

   private int method6250() {
      field6960 = 0;

      for (Class5989 var4 : this.method6251()) {
         if (this.method6252(field6960).equals(Class8005.method27372())) {
            break;
         }

         field6960++;
      }

      return field6960;
   }

   private List<Class5989> method6251() {
      ArrayList var3 = new ArrayList();

      for (Class5989 var5 : Class5989.field26128) {
         if (var5.method18582() >= Class5989.field26129.method18582()) {
            var3.add(var5);
         }
      }

      return var3;
   }

   private Class5989 method6252(int var1) {
      return this.method6251().get(var1);
   }*/

   @Override
   public boolean isPauseScreen() {
      return false;
   }
}
