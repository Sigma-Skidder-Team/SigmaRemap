// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.impl.combat.KillAura;
import net.minecraft.entity.Entity;

import java.util.Iterator;

public class Class1590 implements Runnable
{
    public final /* synthetic */ float field8872;
    public final /* synthetic */ KillAura field8873;
    
    public Class1590(final KillAura field8873, final float field8874) {
        this.field8873 = field8873;
        this.field8872 = field8874;
    }
    
    @Override
    public void run() {
        final boolean b = Math.round((float)Math.random() * 100.0f) < this.field8873.getNumberSettingValueByName("Hit Chance");
        Class7007 class7007;
        if (!this.field8873.method9887("Attack Mode").equals("Pre")) {
            class7007 = Class6430.method19142(KillAura.method10765(this.field8873).field32884, KillAura.method10765(this.field8873).field32885, this.field8873.getNumberSettingValueByName("Range"), this.field8872);
        }
        else {
            class7007 = Class6430.method19142(KillAura.method10764(this.field8873).field32884, KillAura.method10764(this.field8873).field32885, this.field8873.getNumberSettingValueByName("Range"), this.field8872 + Math.sqrt(KillAura.method10760().field4684.method1935().field22770 * KillAura.method10761().field4684.method1935().field22770 + KillAura.method10762().field4684.method1935().field22772 * KillAura.method10763().field4684.method1935().field22772));
        }
        if (KillAura.field16060 != null) {
            if (KillAura.method10766(this.field8873).method31128()) {
                if (!this.field8873.method9887("Autoblock Mode").equals("Vanilla")) {
                    KillAura.method10766(this.field8873).method31131();
                }
            }
        }
        if (b && (class7007 != null || !this.field8873.method9883("Raytrace"))) {
            final Iterator iterator = KillAura.method10767(this.field8873).iterator();
            while (iterator.hasNext()) {
                Entity class7008 = ((Class8131)iterator.next()).method26798();
                if (class7007 != null) {
                    if (this.field8873.method9883("Raytrace")) {
                        class7008 = class7007.method21452();
                    }
                }
                final Class5750 class7009 = new Class5750(class7008, true);
                Client.method35173().method35188().method21097(class7009);
                if (!class7009.method16962()) {
                    Class6430.method19165(class7008, !this.field8873.method9883("No swing"));
                }
                class7009.method17060();
            }
        }
        else if (!this.field8873.method9883("No swing")) {
            KillAura.method10768().field4684.method2707(Class316.field1877);
        }
        if (KillAura.field16060 != null) {
            if (KillAura.method10766(this.field8873).method31132()) {
                if (this.field8873.method9887("Autoblock Mode").equals("Basic1")) {
                    KillAura.method10766(this.field8873).method31130(KillAura.field16060, KillAura.method10765(this.field8873).field32884, KillAura.method10765(this.field8873).field32885);
                }
            }
        }
    }
}
