// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonObject;

import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.nio.file.Path;
import java.util.logging.Logger;

import io.netty.channel.Channel;

public class ViaManager implements Class9366<ClientPlayerEntity> {
    public static Channel field40166;
    public static Class7906 field40167;
    public static final Class7906 field40168;
    private Logger field40169;
    private Logger field40170;
    private Path field40171;
    private Class8947 field40172;
    private Class7494 field40173;
    private Class6542 field40174;
    private Class6558 field40175;
    private List<Class5993> field40176;

    public ViaManager(final Channel field40166) {
        this.field40176 = new ArrayList<Class5993>();
        if (field40166 != null) {
            ViaManager.field40166 = field40166;
        }
        if (Class8563.method28794() != null) {
            Class8563.method28794().method33552();
        }
        this.field40175 = new Class6558();
        final Class6790 class6790 = new Class6790();
        this.field40172 = new Class8947();
        this.field40173 = new Class7494(new File("assets/viaversion/"));
        this.field40170 = new Class8143(this.field40169);
        Class8563.method28790(Class9183.method33556().method34267(this).method34269(class6790).method34270(new Class7092()).method34268(new Class8751()).method34271());
        Class8563.method28794().method33550();
        if (field40166 != null) {
            this.field40174 = new Class6542(field40166);
        }
    }

    public static int method34761() {
        return ViaManager.field40168.method25613();
    }

    public static int method34762() {
        if (ViaManager.field40167 == null) {
            return Class7906.field32452.method25613();
        }
        return ViaManager.field40167.method25613();
    }

    @Override
    public String method34743() {
        return "Jello";
    }

    @Override
    public String method34744() {
        return "Unknown";
    }

    @Override
    public String method34745() {
        return "1.0";
    }

    @Override
    public Class5994 method34746(final Runnable runnable) {
        return this.method34747(runnable);
    }

    @Override
    public Class5994 method34747(final Runnable runnable) {
        return this.method34748(runnable, 0L);
    }

    @Override
    public Class5994 method34748(final Runnable runnable, final Long n) {
        if (Minecraft.getInstance().world != null) {
            final Class5993 class5993 = new Class5993(this.field40175.method19877(this, runnable).method21851(n * 50L, TimeUnit.MILLISECONDS).method21855());
            this.field40176.add(class5993);
            return class5993;
        }
        runnable.run();
        return null;
    }

    @Override
    public Class5994 method34749(final Runnable runnable, final Long n) {
        final Class5993 class5993 = new Class5993(this.field40175.method19877(this, runnable).method21851(n * 50L, TimeUnit.MILLISECONDS).method21855());
        this.field40176.add(class5993);
        return class5993;
    }

    @Override
    public void method34750(final Class5994 class5994) {
        if (class5994 instanceof Class5993) {
            ((Class5993) class5994).method17919().method5602();
        }
    }

    @Override
    public Class7671[] method34751() {
        return null;
    }

    @Override
    public void method34752(final UUID uuid, final String s) {
    }

    @Override
    public boolean method34753(final UUID uuid, final String s) {
        return false;
    }

    @Override
    public boolean method34754() {
        return false;
    }

    @Override
    public Class7496 method34757() {
        return this.field40173;
    }

    @Override
    public void method34758() {
        final Iterator<Class5993> iterator = this.field40176.iterator();
        while (iterator.hasNext()) {
            iterator.next().method17919().method5602();
        }
    }

    @Override
    public JsonObject method34759() {
        return new JsonObject();
    }

    @Override
    public boolean method34760() {
        return true;
    }

    @Override
    public Logger method34742() {
        return this.field40170;
    }

    @Override
    public Class8948<ClientPlayerEntity> method34755() {
        return this.field40172;
    }

    @Override
    public Class7493 method34756() {
        return this.field40173;
    }

    public void method34763() {
        try {
            this.field40175.method19878();
            ViaManager.field40166.close();
        } catch (final InterruptedException ex) {
        }
    }

    public Class6542 method34764() {
        return this.field40174;
    }

    static {
        field40168 = Class7906.field32473;
        ViaManager.field40167 = ViaManager.field40168;
    }
}
