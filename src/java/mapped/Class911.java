package mapped;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.ITextComponent$Serializer;
import net.minecraft.util.text.StringTextComponent;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public abstract class Class911 implements ICommandSource {
   private static final SimpleDateFormat field5191 = new SimpleDateFormat("HH:mm:ss");
   private static final ITextComponent field5192 = new StringTextComponent("@");
   private long field5193 = -1L;
   private boolean field5194 = true;
   private int field5195;
   private boolean field5196 = true;
   private ITextComponent field5197;
   private String field5198 = "";
   private ITextComponent field5199 = field5192;

   public int method3557() {
      return this.field5195;
   }

   public void method3558(int var1) {
      this.field5195 = var1;
   }

   public ITextComponent method3559() {
      return this.field5197 != null ? this.field5197 : StringTextComponent.EMPTY;
   }

   public CompoundNBT method3560(CompoundNBT var1) {
      var1.method109("Command", this.field5198);
      var1.method102("SuccessCount", this.field5195);
      var1.method109("CustomName", ITextComponent$Serializer.toJson(this.field5199));
      var1.method115("TrackOutput", this.field5196);
      if (this.field5197 != null && this.field5196) {
         var1.method109("LastOutput", ITextComponent$Serializer.toJson(this.field5197));
      }

      var1.method115("UpdateLastExecution", this.field5194);
      if (this.field5194 && this.field5193 > 0L) {
         var1.method103("LastExecution", this.field5193);
      }

      return var1;
   }

   public void method3561(CompoundNBT var1) {
      this.field5198 = var1.method126("Command");
      this.field5195 = var1.method122("SuccessCount");
      if (var1.method119("CustomName", 8)) {
         this.method3566(ITextComponent$Serializer.func_240643_a_(var1.method126("CustomName")));
      }

      if (var1.method119("TrackOutput", 1)) {
         this.field5196 = var1.method132("TrackOutput");
      }

      if (var1.method119("LastOutput", 8) && this.field5196) {
         try {
            this.field5197 = ITextComponent$Serializer.func_240643_a_(var1.method126("LastOutput"));
         } catch (Throwable var5) {
            this.field5197 = new StringTextComponent(var5.getMessage());
         }
      } else {
         this.field5197 = null;
      }

      if (var1.contains("UpdateLastExecution")) {
         this.field5194 = var1.method132("UpdateLastExecution");
      }

      if (this.field5194 && var1.contains("LastExecution")) {
         this.field5193 = var1.method123("LastExecution");
      } else {
         this.field5193 = -1L;
      }
   }

   public void method3562(String var1) {
      this.field5198 = var1;
      this.field5195 = 0;
   }

   public String method3563() {
      return this.field5198;
   }

   public boolean method3564(World var1) {
      if (var1.isRemote || var1.method6783() == this.field5193) {
         return false;
      } else if ("Searge".equalsIgnoreCase(this.field5198)) {
         this.field5197 = new StringTextComponent("#itzlipofutzli");
         this.field5195 = 1;
         return true;
      } else {
         this.field5195 = 0;
         MinecraftServer var4 = this.method3567().getServer();
         if (var4.method1361() && !Class9001.method33256(this.field5198)) {
            try {
               this.field5197 = null;
               Class6619 var5 = this.method3574().method20160((var1x, var2, var3) -> {
                  if (var2) {
                     this.field5195++;
                  }
               });
               var4.getCommandManager().handleCommand(var5, this.field5198);
            } catch (Throwable var8) {
               CrashReport var6 = CrashReport.makeCrashReport(var8, "Executing command block");
               CrashReportCategory var7 = var6.makeCategory("Command to be executed");
               var7.addDetail("Command", this::method3563);
               var7.addDetail("Name", () -> this.method3565().getString());
               throw new ReportedException(var6);
            }
         }

         if (this.field5194) {
            this.field5193 = var1.method6783();
         } else {
            this.field5193 = -1L;
         }

         return true;
      }
   }

   public ITextComponent method3565() {
      return this.field5199;
   }

   public void method3566(ITextComponent var1) {
      if (var1 == null) {
         this.field5199 = field5192;
      } else {
         this.field5199 = var1;
      }
   }

   @Override
   public void sendMessage(ITextComponent var1, UUID var2) {
      if (this.field5196) {
         this.field5197 = new StringTextComponent("[" + field5191.format(new Date()) + "] ").append(var1);
         this.method3568();
      }
   }

   public abstract ServerWorld method3567();

   public abstract void method3568();

   public void method3569(ITextComponent var1) {
      this.field5197 = var1;
   }

   public void method3570(boolean var1) {
      this.field5196 = var1;
   }

   public boolean method3571() {
      return this.field5196;
   }

   public ActionResultType method3572(PlayerEntity var1) {
      if (var1.method2979()) {
         if (var1.method3395().isRemote) {
            var1.method2890(this);
         }

         return ActionResultType.method9002(var1.world.isRemote);
      } else {
         return ActionResultType.field14820;
      }
   }

   public abstract Vector3d method3573();

   public abstract Class6619 method3574();

   @Override
   public boolean method1405() {
      return this.method3567().method6789().method17135(Class5462.field24236) && this.field5196;
   }

   @Override
   public boolean method1406() {
      return this.field5196;
   }

   @Override
   public boolean method3425() {
      return this.method3567().method6789().method17135(Class5462.field24230);
   }
}
