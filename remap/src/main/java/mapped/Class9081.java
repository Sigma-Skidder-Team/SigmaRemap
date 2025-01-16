// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.base.MoreObjects;
import javax.annotation.Nullable;
import com.google.common.collect.Maps;
import com.mojang.authlib.minecraft.MinecraftProfileTexture$Type;
import java.util.Map;
import com.mojang.authlib.GameProfile;
import net.minecraft.util.text.ITextComponent;

public class Class9081
{
    private final GameProfile field38437;
    private final Map<MinecraftProfileTexture$Type, ResourceLocation> field38438;
    private Class101 field38439;
    private int field38440;
    private boolean field38441;
    private String field38442;
    private ITextComponent field38443;
    private int field38444;
    private int field38445;
    private long field38446;
    private long field38447;
    private long field38448;
    
    public Class9081(final Class4646 class4646) {
        this.field38438 = Maps.newEnumMap((Class)MinecraftProfileTexture$Type.class);
        this.field38437 = class4646.method13869();
        this.field38439 = class4646.method13871();
        this.field38440 = class4646.method13870();
        this.field38443 = class4646.method13872();
    }
    
    public GameProfile method32719() {
        return this.field38437;
    }
    
    @Nullable
    public Class101 method32720() {
        return this.field38439;
    }
    
    public void method32721(final Class101 field38439) {
        this.field38439 = field38439;
    }
    
    public int method32722() {
        return this.field38440;
    }
    
    public void method32723(final int field38440) {
        this.field38440 = field38440;
    }
    
    public boolean method32724() {
        return this.method32726() != null;
    }
    
    public String method32725() {
        return (this.field38442 != null) ? this.field38442 : Class7634.method24005(this.field38437.getId());
    }
    
    public ResourceLocation method32726() {
        this.method32730();
        return (ResourceLocation)MoreObjects.firstNonNull((Object)this.field38438.get(MinecraftProfileTexture$Type.SKIN), (Object)Class7634.method24004(this.field38437.getId()));
    }
    
    @Nullable
    public ResourceLocation method32727() {
        this.method32730();
        return this.field38438.get(MinecraftProfileTexture$Type.CAPE);
    }
    
    @Nullable
    public ResourceLocation method32728() {
        this.method32730();
        return this.field38438.get(MinecraftProfileTexture$Type.ELYTRA);
    }
    
    @Nullable
    public Class6749 method32729() {
        return Minecraft.method5277().world.method6782().method19651(this.method32719().getName());
    }
    
    public void method32730() {
        synchronized (this) {
            if (!this.field38441) {
                this.field38441 = true;
                Minecraft.method5277().method5302().method24294(this.field38437, (minecraftProfileTexture$Type, class1932, minecraftProfileTexture) -> {
                    this.field38438.put(minecraftProfileTexture$Type, class1932);
                    if (minecraftProfileTexture$Type == MinecraftProfileTexture$Type.SKIN) {
                        this.field38442 = minecraftProfileTexture.getMetadata("model");
                        if (this.field38442 == null) {
                            this.field38442 = "default";
                        }
                    }
                }, true);
            }
        }
    }
    
    public void method32731(final ITextComponent field38443) {
        this.field38443 = field38443;
    }
    
    @Nullable
    public ITextComponent method32732() {
        return this.field38443;
    }
    
    public int method32733() {
        return this.field38444;
    }
    
    public void method32734(final int field38444) {
        this.field38444 = field38444;
    }
    
    public int method32735() {
        return this.field38445;
    }
    
    public void method32736(final int field38445) {
        this.field38445 = field38445;
    }
    
    public long method32737() {
        return this.field38446;
    }
    
    public void method32738(final long field38446) {
        this.field38446 = field38446;
    }
    
    public long method32739() {
        return this.field38447;
    }
    
    public void method32740(final long field38447) {
        this.field38447 = field38447;
    }
    
    public long method32741() {
        return this.field38448;
    }
    
    public void method32742(final long field38448) {
        this.field38448 = field38448;
    }
}
