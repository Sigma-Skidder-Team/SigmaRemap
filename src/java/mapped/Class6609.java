package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Difficulty;

import java.util.UUID;

public class Class6609 implements Class6608 {
   private final IServerConfiguration field29061;
   private final Class6608 field29062;

   public Class6609(IServerConfiguration var1, Class6608 var2) {
      this.field29061 = var1;
      this.field29062 = var2;
   }

   @Override
   public int method20029() {
      return this.field29062.method20029();
   }

   @Override
   public int method20030() {
      return this.field29062.method20030();
   }

   @Override
   public int method20031() {
      return this.field29062.method20031();
   }

   @Override
   public float method20032() {
      return this.field29062.method20032();
   }

   @Override
   public long method20033() {
      return this.field29062.method20033();
   }

   @Override
   public long method20034() {
      return this.field29062.method20034();
   }

   @Override
   public String method20054() {
      return this.field29061.method20054();
   }

   @Override
   public int method20060() {
      return this.field29062.method20060();
   }

   @Override
   public void method20061(int var1) {
   }

   @Override
   public boolean method20042() {
      return this.field29062.method20042();
   }

   @Override
   public int method20059() {
      return this.field29062.method20059();
   }

   @Override
   public boolean method20043() {
      return this.field29062.method20043();
   }

   @Override
   public int method20056() {
      return this.field29062.method20056();
   }

   @Override
   public GameType method20067() {
      return this.field29061.method20067();
   }

   @Override
   public void method20035(int var1) {
   }

   @Override
   public void method20036(int var1) {
   }

   @Override
   public void method20037(int var1) {
   }

   @Override
   public void method20038(float var1) {
   }

   @Override
   public void method20075(long var1) {
   }

   @Override
   public void method20076(long var1) {
   }

   @Override
   public void method20041(BlockPos var1, float var2) {
   }

   @Override
   public void method20055(boolean var1) {
   }

   @Override
   public void method20058(int var1) {
   }

   @Override
   public void method20044(boolean var1) {
   }

   @Override
   public void method20057(int var1) {
   }

   @Override
   public void method20073(GameType var1) {
   }

   @Override
   public boolean isHardcore() {
      return this.field29061.method20045();
   }

   @Override
   public boolean method20072() {
      return this.field29061.method20072();
   }

   @Override
   public boolean method20070() {
      return this.field29062.method20070();
   }

   @Override
   public void method20071(boolean var1) {
   }

   @Override
   public Class5462 method20046() {
      return this.field29061.method20046();
   }

   @Override
   public Class7235 method20069() {
      return this.field29062.method20069();
   }

   @Override
   public void method20068(Class7235 var1) {
   }

   @Override
   public Difficulty method20047() {
      return this.field29061.method20047();
   }

   @Override
   public boolean method20048() {
      return this.field29061.method20048();
   }

   @Override
   public Class8559<MinecraftServer> method20074() {
      return this.field29062.method20074();
   }

   @Override
   public int method20062() {
      return 0;
   }

   @Override
   public void method20063(int var1) {
   }

   @Override
   public int method20064() {
      return 0;
   }

   @Override
   public void method20065(int var1) {
   }

   @Override
   public void method20066(UUID var1) {
   }

   @Override
   public void method20049(CrashReportCategory var1) {
      var1.addDetail("Derived", true);
      this.field29062.method20049(var1);
   }
}
