// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.base.MoreObjects;
import java.io.IOException;
import com.mojang.authlib.properties.Property;
import com.mojang.authlib.GameProfile;
import com.google.common.collect.Lists;
import net.minecraft.util.text.ITextComponent;

import java.util.List;

public class Class4330 implements IPacket<IClientPlayNetHandler>
{
    private Class2156 field19387;
    public List<Class4646> field19388;
    
    public Class4330() {
        this.field19388 = Lists.newArrayList();
    }
    
    public Class4330(final Class2156 field19387, final Class513... array) {
        this.field19388 = Lists.newArrayList();
        this.field19387 = field19387;
        for (final Class513 class513 : array) {
            this.field19388.add(new Class4646(this, class513.method2844(), class513.field3070, class513.field3041.method26482(), class513.method2954()));
        }
    }
    
    public Class4330(final Class2156 field19387, final Iterable<Class513> iterable) {
        this.field19388 = Lists.newArrayList();
        this.field19387 = field19387;
        for (final Class513 class513 : iterable) {
            this.field19388.add(new Class4646(this, class513.method2844(), class513.field3070, class513.field3041.method26482(), class513.method2954()));
        }
    }
    
    @Override
    public void readPacketData(final PacketBuffer class8654) throws IOException {
        this.field19387 = class8654.method29499(Class2156.class);
        for (int method29501 = class8654.readVarInt(), i = 0; i < method29501; ++i) {
            GameProfile gameProfile = null;
            int n = 0;
            Class101 class8655 = null;
            ITextComponent class8656 = null;
            switch (Class6018.field24495[this.field19387.ordinal()]) {
                case 1: {
                    gameProfile = new GameProfile(class8654.method29504(), class8654.readString(16));
                    for (int method29502 = class8654.readVarInt(), j = 0; j < method29502; ++j) {
                        final String method29503 = class8654.readString(32767);
                        final String method29504 = class8654.readString(32767);
                        if (class8654.readBoolean()) {
                            gameProfile.getProperties().put((Object)method29503, (Object)new Property(method29503, method29504, class8654.readString(32767)));
                        }
                        else {
                            gameProfile.getProperties().put((Object)method29503, (Object)new Property(method29503, method29504));
                        }
                    }
                    class8655 = Class101.method592(class8654.readVarInt());
                    n = class8654.readVarInt();
                    if (class8654.readBoolean()) {
                        class8656 = class8654.readTextComponent();
                        break;
                    }
                    break;
                }
                case 2: {
                    gameProfile = new GameProfile(class8654.method29504(), null);
                    class8655 = Class101.method592(class8654.readVarInt());
                    break;
                }
                case 3: {
                    gameProfile = new GameProfile(class8654.method29504(), null);
                    n = class8654.readVarInt();
                    break;
                }
                case 4: {
                    gameProfile = new GameProfile(class8654.method29504(), null);
                    if (class8654.readBoolean()) {
                        class8656 = class8654.readTextComponent();
                        break;
                    }
                    break;
                }
                case 5: {
                    gameProfile = new GameProfile(class8654.method29504(), null);
                    break;
                }
            }
            this.field19388.add(new Class4646(this, gameProfile, n, class8655, class8656));
        }
    }
    
    @Override
    public void writePacketData(final PacketBuffer class8654) throws IOException {
        class8654.method29500(this.field19387);
        class8654.writeVarInt(this.field19388.size());
        for (final Class4646 class8655 : this.field19388) {
            switch (Class6018.field24495[this.field19387.ordinal()]) {
                case 1: {
                    class8654.method29503(class8655.method13869().getId());
                    class8654.writeString(class8655.method13869().getName());
                    class8654.writeVarInt(class8655.method13869().getProperties().size());
                    for (final Property property : class8655.method13869().getProperties().values()) {
                        class8654.writeString(property.getName());
                        class8654.writeString(property.getValue());
                        if (property.hasSignature()) {
                            class8654.writeBoolean(true);
                            class8654.writeString(property.getSignature());
                        }
                        else {
                            class8654.writeBoolean(false);
                        }
                    }
                    class8654.writeVarInt(class8655.method13871().method585());
                    class8654.writeVarInt(class8655.method13870());
                    if (class8655.method13872() == null) {
                        class8654.writeBoolean(false);
                        continue;
                    }
                    class8654.writeBoolean(true);
                    class8654.writeTextComponent(class8655.method13872());
                    continue;
                }
                case 2: {
                    class8654.method29503(class8655.method13869().getId());
                    class8654.writeVarInt(class8655.method13871().method585());
                    continue;
                }
                case 3: {
                    class8654.method29503(class8655.method13869().getId());
                    class8654.writeVarInt(class8655.method13870());
                    continue;
                }
                case 4: {
                    class8654.method29503(class8655.method13869().getId());
                    if (class8655.method13872() == null) {
                        class8654.writeBoolean(false);
                        continue;
                    }
                    class8654.writeBoolean(true);
                    class8654.writeTextComponent(class8655.method13872());
                    continue;
                }
                case 5: {
                    class8654.method29503(class8655.method13869().getId());
                    continue;
                }
            }
        }
    }
    
    public void method12764(final IClientPlayNetHandler class5800) {
        class5800.method17341(this);
    }
    
    public List<Class4646> method13001() {
        return this.field19388;
    }
    
    public Class2156 method13002() {
        return this.field19387;
    }
    
    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this).add("action", this.field19387).add("entries", this.field19388).toString();
    }
}
