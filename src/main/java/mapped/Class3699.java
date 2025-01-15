// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.nio.file.Path;
import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.google.gson.JsonElement;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.CommandDispatcher;
import java.nio.file.Paths;
import java.io.File;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import java.util.UUID;
import java.net.Proxy;
import com.google.gson.Gson;

public class Class3699 implements Class3689
{
    private static final Gson field17016;
    private final Class7203 field17017;
    
    public Class3699(final Class7203 field17017) {
        this.field17017 = field17017;
    }
    
    @Override
    public void method11337(final Class8842 class8842) throws IOException {
        final YggdrasilAuthenticationService yggdrasilAuthenticationService = new YggdrasilAuthenticationService(Proxy.NO_PROXY, UUID.randomUUID().toString());
        final MinecraftSessionService minecraftSessionService = yggdrasilAuthenticationService.createMinecraftSessionService();
        final GameProfileRepository profileRepository = yggdrasilAuthenticationService.createProfileRepository();
        final File parent = new File(this.field17017.method22099().toFile(), "tmp");
        final Class8608 class8843 = new Class8608(profileRepository, new File(parent, Class394.field2293.getName()));
        final Class7794 class8844 = new Class7794(Paths.get("server.properties", new String[0]));
        final Class395 class8845 = new Class395(parent, class8844, Class5494.method16768(), yggdrasilAuthenticationService, minecraftSessionService, profileRepository, class8843, Class6460::new, class8844.method25121().field39779);
        final Path resolve = this.field17017.method22099().resolve("reports/commands.json");
        final CommandDispatcher<Class7492> method25004 = class8845.method1573().method25004();
        Class3689.method11346(Class3699.field17016, class8842, (JsonElement)Class8381.method27937((com.mojang.brigadier.CommandDispatcher<Object>)method25004, (com.mojang.brigadier.tree.CommandNode<Object>)method25004.getRoot()), resolve);
    }
    
    @Override
    public String method11338() {
        return "Command Syntax";
    }
    
    static {
        field17016 = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
    }
}
