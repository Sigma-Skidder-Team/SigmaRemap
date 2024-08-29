package mapped;

import com.mojang.authlib.GameProfile;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class6394 extends Class6395 {
   private static final Logger field27983 = LogManager.getLogger();

   public Class6394(DedicatedServer var1, DynamicRegistriesImpl var2, Class8716 var3) {
      super(var1, var2, var3, var1.method6498().field43821);
      Class9437 var6 = var1.method6498();
      this.method19487(var6.field43820);
      super.method19429((Boolean)var6.field43832.get());
      this.method19436();
      this.method19434();
      this.method19435();
      this.method19433();
      this.method19437();
      this.method19439();
      this.method19438();
      if (!this.method19468().method14435().exists()) {
         this.method19440();
      }
   }

   @Override
   public void method19429(boolean var1) {
      super.method19429(var1);
      this.method19444().method6510(var1);
   }

   @Override
   public void method19430(GameProfile var1) {
      super.method19430(var1);
      this.method19438();
   }

   @Override
   public void method19431(GameProfile var1) {
      super.method19431(var1);
      this.method19438();
   }

   @Override
   public void method19432() {
      this.method19439();
   }

   private void method19433() {
      try {
         this.method19462().method14444();
      } catch (IOException var4) {
         field27983.warn("Failed to save ip banlist: ", var4);
      }
   }

   private void method19434() {
      try {
         this.method19461().method14444();
      } catch (IOException var4) {
         field27983.warn("Failed to save user banlist: ", var4);
      }
   }

   private void method19435() {
      try {
         this.method19462().method14445();
      } catch (IOException var4) {
         field27983.warn("Failed to load ip banlist: ", var4);
      }
   }

   private void method19436() {
      try {
         this.method19461().method14445();
      } catch (IOException var4) {
         field27983.warn("Failed to load user banlist: ", var4);
      }
   }

   private void method19437() {
      try {
         this.method19470().method14445();
      } catch (Exception var4) {
         field27983.warn("Failed to load operators list: ", var4);
      }
   }

   private void method19438() {
      try {
         this.method19470().method14444();
      } catch (Exception var4) {
         field27983.warn("Failed to save operators list: ", var4);
      }
   }

   private void method19439() {
      try {
         this.method19468().method14445();
      } catch (Exception var4) {
         field27983.warn("Failed to load white-list: ", var4);
      }
   }

   private void method19440() {
      try {
         this.method19468().method14444();
      } catch (Exception var4) {
         field27983.warn("Failed to save white-list: ", var4);
      }
   }

   @Override
   public boolean method19441(GameProfile var1) {
      return !this.method19476() || this.canSendCommands(var1) || this.method19468().method14448(var1);
   }

   public DedicatedServer method19444() {
      return (DedicatedServer)super.method19444();
   }

   @Override
   public boolean method19443(GameProfile var1) {
      return this.method19470().method14447(var1);
   }
}
