package com.mentalfrostbyte.jello.notification;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4415;
import com.mentalfrostbyte.jello.event.impl.Class4420;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.resource.ClientResource;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import mapped.Class3192;
import mapped.Class9782;
import mapped.Minecraft;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NotificationManager {
    private static String[] field39917;
    public Minecraft field39918 = Minecraft.getInstance();
    private List<Notification> field39919 = new ArrayList<Notification>();
    private int field39920 = 20;
    private int field39921 = 1;
    private int field39922 = 200;
    private int field39923 = 340;
    private int field39924 = 64;
    private int field39925 = 10;
    private int field39926 = 10;
    private int field39927 = 10;
    private ClientResource field39928 = ResourceRegistry.JelloLightFont14;
    private ClientResource field39929 = ResourceRegistry.JelloLightFont20;

    public void post(Notification var1) {
        for (Notification var5 : this.field39919) {
            if (var5.equals(var1)) {
                var5.field43607.method27122(Math.min(var5.field43607.method27121(), (long) (this.field39922 + 1)));
                var5.field43604 = var1.field43604;
                var5.field43610++;
                var5.field43605 = var1.field43605;
                return;
            }
        }

        this.field39919.add(var1);
    }

    public float method31993(Notification var1) {
        float var4 = (float) Math.min(var1.field43607.method27121(), (long) var1.field43606);
        if (!(var4 < (float) this.field39922 * 1.4F)) {
            return !(var4 > (float) var1.field43606 - (float) this.field39922)
                    ? 1.0F
                    : Class9782.method38556(((float) var1.field43606 - var4) / (float) this.field39922, 0.0F, 1.0F, 1.0F);
        } else {
            return Class9782.method38557(var4 / ((float) this.field39922 * 1.4F), 0.0F, 1.0F, 1.0F);
        }
    }

    public float method31994(int var1) {
        float var4 = 0.0F;

        for (int var5 = 0; var5 < var1; var5++) {
            var4 += this.method31993(this.field39919.get(var5));
        }

        return var4 / (float) var1;
    }

    @EventTarget
    private void method31995(Class4415 var1) {
        if (!Minecraft.getInstance().gameSettings.field44662) {
            this.field39921 = Math.max(Math.round((float) (6 - Minecraft.method1586() / 10)), 1);

            for (int var4 = 0; var4 < this.field39919.size(); var4++) {
                Notification var5 = this.field39919.get(var4);
                float var6 = this.method31993(var5);
                int var7 = Minecraft.getInstance().mainWindow.method8043() - this.field39926 - (int) ((float) this.field39923 * var6 * var6);
                int var8 = this.field39918.mainWindow.method8044()
                        - this.field39924
                        - this.field39925
                        - var4 * (int) ((float) this.field39924 * this.method31994(var4) + (float) this.field39927 * this.method31994(var4));
                float var9 = Math.min(1.0F, var6);
                int var10 = new Color(0.14F, 0.14F, 0.14F, var9 * 0.93F).getRGB();
                int var11 = new Color(0.0F, 0.0F, 0.0F, Math.min(var6 * 0.075F, 1.0F)).getRGB();
                int var12 = new Color(1.0F, 1.0F, 1.0F, var9).getRGB();
                Class3192.method11463((float) var7, (float) var8, (float) this.field39923, (float) this.field39924, 10.0F, var9);
                Class3192.method11426((float) var7, (float) var8, (float) (var7 + this.field39923), (float) (var8 + this.field39924), var10);
                Class3192.method11426((float) var7, (float) var8, (float) (var7 + this.field39923), (float) (var8 + 1), var11);
                Class3192.method11426((float) var7, (float) (var8 + this.field39924 - 1), (float) (var7 + this.field39923), (float) (var8 + this.field39924), var11);
                Class3192.method11426((float) var7, (float) (var8 + 1), (float) (var7 + 1), (float) (var8 + this.field39924 - 1), var11);
                Class3192.method11426(
                        (float) (var7 + this.field39923 - 1), (float) (var8 + 1), (float) (var7 + this.field39923), (float) (var8 + this.field39924 - 1), var11
                );
                Class3192.method11420(var7, var8, var7 + this.field39923 - this.field39927, var8 + this.field39924);
                Class3192.method11439(
                        this.field39929, (float) (var7 + this.field39924 + this.field39927 - 2), (float) (var8 + this.field39927), var5.field43603, var12
                );
                Class3192.method11439(
                        this.field39928,
                        (float) (var7 + this.field39924 + this.field39927 - 2),
                        (float) (var8 + this.field39927 + this.field39929.method23941(var5.field43603)),
                        var5.field43604,
                        var12
                );
                Class3192.method11422();
                Class3192.method11455(
                        (float) (var7 + this.field39927 / 2),
                        (float) (var8 + this.field39927 / 2),
                        (float) (this.field39924 - this.field39927),
                        (float) (this.field39924 - this.field39927),
                        var5.field43605
                );
            }
        }
    }

    @EventTarget
    private void method31996(TickEvent var1) {
        Iterator var4 = this.field39919.iterator();

        while (var4.hasNext()) {
            Notification var5 = (Notification) var4.next();
            if (var5.field43607.method27121() > (long) var5.field43606) {
                var4.remove();
            }
        }
    }

    @EventTarget
    private void method31997(Class4420 var1) {
        if (this.field39918.player == null) {
            ;
        }
    }

    private void method31998() {
        for (int var3 = 0; var3 < this.field39919.size(); var3++) {
            Notification var4 = this.field39919.get(var3);
            float var5 = this.method31993(var4);
            int var6 = Minecraft.getInstance().mainWindow.method8043() - this.field39926 - (int) ((float) this.field39923 * var5 * var5);
            int var7 = this.field39918.mainWindow.method8044()
                    - this.field39924
                    - this.field39925
                    - var3 * (int) ((float) this.field39924 * this.method31994(var3) + (float) this.field39927 * this.method31994(var3));

            for (int var8 = 0; var8 < 3; var8++) {
                var4.field43608[var8] = Class3192.method11481(var6 + this.field39923 / 3 * var8, var7, var4.field43608[var8]);
                var4.field43609[var8] = Class3192.method11481(var6 + this.field39923 / 3 * var8, var7 + this.field39924, var4.field43609[var8]);
            }
        }
    }

    public void method31999() {
        Client.getInstance().getEventManager().register(this);
    }
}