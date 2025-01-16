// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Date;
import com.mojang.brigadier.ResultConsumer;
import net.minecraft.command.ICommandSource;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

import java.text.SimpleDateFormat;

public abstract class Class865 implements ICommandSource
{
    private static final SimpleDateFormat field4608;
    private static final ITextComponent field4609;
    private long field4610;
    private boolean field4611;
    private int field4612;
    private boolean field4613;
    private ITextComponent field4614;
    private String field4615;
    private ITextComponent field4616;
    
    public Class865() {
        this.field4610 = -1L;
        this.field4611 = true;
        this.field4613 = true;
        this.field4615 = "";
        this.field4616 = Class865.field4609;
    }
    
    public int method5206() {
        return this.field4612;
    }
    
    public void method5207(final int field4612) {
        this.field4612 = field4612;
    }
    
    public ITextComponent method5208() {
        return (this.field4614 != null) ? this.field4614 : new StringTextComponent("");
    }
    
    public CompoundNBT method5209(final CompoundNBT class51) {
        class51.putString("Command", this.field4615);
        class51.putInt("SuccessCount", this.field4612);
        class51.putString("CustomName", Class5953.method17869(this.field4616));
        class51.putBoolean("TrackOutput", this.field4613);
        if (this.field4614 != null) {
            if (this.field4613) {
                class51.putString("LastOutput", Class5953.method17869(this.field4614));
            }
        }
        class51.putBoolean("UpdateLastExecution", this.field4611);
        if (this.field4611) {
            if (this.field4610 > 0L) {
                class51.putLong("LastExecution", this.field4610);
            }
        }
        return class51;
    }
    
    public void method5210(final CompoundNBT class51) {
        this.field4615 = class51.getString("Command");
        this.field4612 = class51.getInt("SuccessCount");
        if (class51.contains("CustomName", 8)) {
            this.method5215(Class5953.method17871(class51.getString("CustomName")));
        }
        if (class51.contains("TrackOutput", 1)) {
            this.field4613 = class51.getBoolean("TrackOutput");
        }
        if (class51.contains("LastOutput", 8) && this.field4613) {
            try {
                this.field4614 = Class5953.method17871(class51.getString("LastOutput"));
            }
            catch (final Throwable t) {
                this.field4614 = new StringTextComponent(t.getMessage());
            }
        }
        else {
            this.field4614 = null;
        }
        if (class51.contains("UpdateLastExecution")) {
            this.field4611 = class51.getBoolean("UpdateLastExecution");
        }
        if (this.field4611 && class51.contains("LastExecution")) {
            this.field4610 = class51.getLong("LastExecution");
        }
        else {
            this.field4610 = -1L;
        }
    }
    
    public void method5211(final String field4615) {
        this.field4615 = field4615;
        this.field4612 = 0;
    }
    
    public String method5212() {
        return this.field4615;
    }
    
    public boolean method5213(final World class1847) {
        if (class1847.isRemote || class1847.method6754() == this.field4610) {
            return false;
        }
        if ("Searge".equalsIgnoreCase(this.field4615)) {
            this.field4614 = new StringTextComponent("#itzlipofutzli");
            this.field4612 = 1;
            return true;
        }
        this.field4612 = 0;
        final MinecraftServer method6679 = this.method5216().getServer();
        if (method6679 != null && method6679.method1493() && method6679.method1531() && !Class8272.method27500(this.field4615)) {
            try {
                this.field4614 = null;
                method6679.method1573().method24998(this.method5223().method23238((ResultConsumer<Class7492>)((commandContext, b, n) -> {
                    if (b) {
                        ++this.field4612;
                    }
                })), this.field4615);
            }
            catch (final Throwable t) {
                final CrashReport method6680 = CrashReport.makeCrashReport(t, "Executing command block");
                final CrashReportCategory method6681 = method6680.makeCategory("Command to be executed");
                method6681.addDetail("Command", this::method5212);
                method6681.addDetail("Name", () -> this.method5214().getString());
                throw new ReportedException(method6680);
            }
        }
        if (this.field4611) {
            this.field4610 = class1847.method6754();
        }
        else {
            this.field4610 = -1L;
        }
        return true;
    }
    
    public ITextComponent method5214() {
        return this.field4616;
    }
    
    public void method5215(final ITextComponent field4616) {
        if (field4616 == null) {
            this.field4616 = Class865.field4609;
        }
        else {
            this.field4616 = field4616;
        }
    }
    
    @Override
    public void sendMessage(final ITextComponent class2250) {
        if (this.field4613) {
            this.field4614 = new StringTextComponent("[" + Class865.field4608.format(new Date()) + "] ").appendSibling(class2250);
            this.method5217();
        }
    }
    
    public abstract Class1849 method5216();
    
    public abstract void method5217();
    
    public void method5218(final ITextComponent field4614) {
        this.field4614 = field4614;
    }
    
    public void method5219(final boolean field4613) {
        this.field4613 = field4613;
    }
    
    public boolean method5220() {
        return this.field4613;
    }
    
    public boolean method5221(final PlayerEntity playerEntity) {
        if (playerEntity.method2908()) {
            if (playerEntity.method1896().isRemote) {
                playerEntity.method2828(this);
            }
            return true;
        }
        return false;
    }
    
    public abstract Vec3d method5222();
    
    public abstract Class7492 method5223();
    
    @Override
    public boolean shouldReceiveFeedback() {
        return this.method5216().method6765().method31216(Class8878.field37328) && this.field4613;
    }
    
    @Override
    public boolean shouldReceiveErrors() {
        return this.field4613;
    }
    
    @Override
    public boolean allowLogging() {
        return this.method5216().method6765().method31216(Class8878.field37322);
    }
    
    static {
        field4608 = new SimpleDateFormat("HH:mm:ss");
        field4609 = new StringTextComponent("@");
    }
}
