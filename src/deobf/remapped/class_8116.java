package remapped;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.ITextComponent$class_40;
import net.minecraft.util.text.StringTextComponent;

public abstract class class_8116 implements class_5801 {
   private static final SimpleDateFormat field_41604 = new SimpleDateFormat("HH:mm:ss");
   private static final ITextComponent field_41596 = new StringTextComponent("@");
   private long field_41600 = -1L;
   private boolean field_41598 = true;
   private int field_41602;
   private boolean field_41601 = true;
   private ITextComponent field_41597;
   private String field_41599 = "";
   private ITextComponent field_41603 = field_41596;

   public int method_36926() {
      return this.field_41602;
   }

   public void method_36925(int var1) {
      this.field_41602 = var1;
   }

   public ITextComponent method_36928() {
      return this.field_41597 != null ? this.field_41597 : StringTextComponent.EMPTY;
   }

   public CompoundNBT method_36938(CompoundNBT var1) {
      var1.method_25941("Command", this.field_41599);
      var1.putInt("SuccessCount", this.field_41602);
      var1.method_25941("CustomName", ITextComponent$class_40.toJson(this.field_41603));
      var1.putBoolean("TrackOutput", this.field_41601);
      if (this.field_41597 != null && this.field_41601) {
         var1.method_25941("LastOutput", ITextComponent$class_40.toJson(this.field_41597));
      }

      var1.putBoolean("UpdateLastExecution", this.field_41598);
      if (this.field_41598 && this.field_41600 > 0L) {
         var1.method_25949("LastExecution", this.field_41600);
      }

      return var1;
   }

   public void method_36924(CompoundNBT var1) {
      this.field_41599 = var1.method_25965("Command");
      this.field_41602 = var1.method_25947("SuccessCount");
      if (var1.contains("CustomName", 8)) {
         this.method_36921(ITextComponent$class_40.func_240643_a_(var1.method_25965("CustomName")));
      }

      if (var1.contains("TrackOutput", 1)) {
         this.field_41601 = var1.getBoolean("TrackOutput");
      }

      if (var1.contains("LastOutput", 8) && this.field_41601) {
         try {
            this.field_41597 = ITextComponent$class_40.func_240643_a_(var1.method_25965("LastOutput"));
         } catch (Throwable var5) {
            this.field_41597 = new StringTextComponent(var5.getMessage());
         }
      } else {
         this.field_41597 = null;
      }

      if (var1.method_25938("UpdateLastExecution")) {
         this.field_41598 = var1.getBoolean("UpdateLastExecution");
      }

      if (this.field_41598 && var1.method_25938("LastExecution")) {
         this.field_41600 = var1.method_25948("LastExecution");
      } else {
         this.field_41600 = -1L;
      }
   }

   public void method_36930(String var1) {
      this.field_41599 = var1;
      this.field_41602 = 0;
   }

   public String method_36920() {
      return this.field_41599;
   }

   public boolean method_36922(World var1) {
      if (var1.field_33055 || var1.method_29546() == this.field_41600) {
         return false;
      } else if ("Searge".equalsIgnoreCase(this.field_41599)) {
         this.field_41597 = new StringTextComponent("#itzlipofutzli");
         this.field_41602 = 1;
         return true;
      } else {
         this.field_41602 = 0;
         class_341 var4 = this.method_36934().method_29522();
         if (var4.method_1726() && !class_6660.method_30576(this.field_41599)) {
            try {
               this.field_41597 = null;
               class_9155 var5 = this.method_36929().method_42186((var1x, var2, var3) -> {
                  if (var2) {
                     this.field_41602++;
                  }
               });
               var4.method_1631().method_2232(var5, this.field_41599);
            } catch (Throwable var8) {
               class_159 var6 = class_159.method_643(var8, "Executing command block");
               class_6544 var7 = var6.method_639("Command to be executed");
               var7.method_29851("Command", this::method_36920);
               var7.method_29851("Name", () -> this.method_36931().getString());
               throw new class_3297(var6);
            }
         }

         if (this.field_41598) {
            this.field_41600 = var1.method_29546();
         } else {
            this.field_41600 = -1L;
         }

         return true;
      }
   }

   public ITextComponent method_36931() {
      return this.field_41603;
   }

   public void method_36921(ITextComponent var1) {
      if (var1 == null) {
         this.field_41603 = field_41596;
      } else {
         this.field_41603 = var1;
      }
   }

   @Override
   public void method_26286(ITextComponent var1, UUID var2) {
      if (this.field_41601) {
         this.field_41597 = new StringTextComponent("[" + field_41604.format(new Date()) + "] ").append(var1);
         this.method_36932();
      }
   }

   public abstract class_6331 method_36934();

   public abstract void method_36932();

   public void method_36937(ITextComponent var1) {
      this.field_41597 = var1;
   }

   public void method_36935(boolean var1) {
      this.field_41601 = var1;
   }

   public boolean method_36927() {
      return this.field_41601;
   }

   public class_6910 method_36933(PlayerEntity var1) {
      if (var1.method_3184()) {
         if (var1.method_37084().field_33055) {
            var1.method_3243(this);
         }

         return class_6910.method_31659(var1.world.field_33055);
      } else {
         return class_6910.field_35521;
      }
   }

   public abstract class_1343 method_36923();

   public abstract class_9155 method_36929();

   @Override
   public boolean method_26287() {
      return this.method_36934().method_29537().method_1285(class_291.field_1057) && this.field_41601;
   }

   @Override
   public boolean method_26285() {
      return this.field_41601;
   }

   @Override
   public boolean method_26284() {
      return this.method_36934().method_29537().method_1285(class_291.field_1038);
   }
}
