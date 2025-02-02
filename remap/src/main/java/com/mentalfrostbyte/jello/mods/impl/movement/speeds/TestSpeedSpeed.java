// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.movement.speeds;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.mods.impl.movement.BlockFly;
import com.mentalfrostbyte.jello.mods.impl.movement.Fly;
import com.mentalfrostbyte.jello.mods.impl.movement.Jesus;
import com.mentalfrostbyte.jello.settings.impl.BooleanSetting;
import mapped.*;

public class TestSpeedSpeed extends Module
{
    private double field15667;
    private float field15668;
    private float field15669;
    private boolean field15670;
    private float field15671;
    private float field15672;
    public int field15673;
    
    public TestSpeedSpeed() {
        super(Category.MOVEMENT, "TestSpeed", "Legit Sprint jumping.");
        this.field15672 = 1.0f;
        this.field15673 = 0;
        this.addSetting(new BooleanSetting("Sprint", "Sprints when walking", true));
        this.addSetting(new BooleanSetting("AutoJump", "Automatically jumps for you.", true));
    }
    
    @EventListener
    public void method10141(final UpdateWalkingEvent updateWalkingEvent) {
        if (this.isEnabled()) {
            if (TestSpeedSpeed.mc.player != null) {
                if (!Client.getInstance().method35189().method21551(Fly.class).isEnabled()) {
                    if (TestSpeedSpeed.mc.player.onGround) {
                        if (updateWalkingEvent.method17046()) {
                            updateWalkingEvent.method17037(updateWalkingEvent.method17036() + 1.0E-14);
                        }
                    }
                }
            }
        }
    }
    
    @EventListener
    public void method10142(final Class5717 class5717) {
        if (this.isEnabled()) {
            if (TestSpeedSpeed.mc.player.onGround) {
                if (TestSpeedSpeed.mc.player.collidedVertically) {
                    if (TestSpeedSpeed.mc.player.field2970 != 0.0f || TestSpeedSpeed.mc.player.field2968 != 0.0f) {
                        if (this.method9883("AutoJump")) {
                            TestSpeedSpeed.mc.player.method2725();
                            class5717.method16973(TestSpeedSpeed.mc.player.getMotion().x);
                            class5717.method16975(TestSpeedSpeed.mc.player.getMotion().y);
                            class5717.method16977(TestSpeedSpeed.mc.player.getMotion().z);
                        }
                    }
                }
            }
            final double field22771 = class5717.method16978().y;
            class5717.method16978().y = 0.0;
            final double method16752 = class5717.method16978().length();
            class5717.method16978().y = field22771;
            this.field15671 = Class7482.method23153(class5717, method16752, Class7482.method23144()[0], this.field15671, 45.0f);
            if (this.field15668 != 0.0f || this.field15669 != 0.0f) {
                this.field15668 *= (float)0.85;
                this.field15669 *= (float)0.85;
                this.field15672 = Math.min(1.0f, this.field15672 + 0.1f);
            }
            if (TestSpeedSpeed.mc.player.onGround) {
                if (!this.field15670) {
                    this.field15668 = 0.0f;
                    this.field15669 = 0.0f;
                    this.field15672 = Math.min(1.0f, this.field15672 + 0.33f);
                }
            }
            this.field15670 = false;
            ++this.field15673;
        }
    }
    
    @EventListener
    @Class6759
    public void method10143(final Class5722 class5722) {
        if (this.isEnabled()) {
            if (!Jesus.method10433()) {
                if (!Client.getInstance().method35189().method21551(Fly.class).isEnabled()) {
                    if (TestSpeedSpeed.mc.gameSettings.field23439.method1056() && Client.getInstance().method35189().method21551(BlockFly.class).isEnabled()) {
                        return;
                    }
                    this.field15671 = Class7482.method23144()[0];
                    this.field15673 = 0;
                    class5722.method16996(class5722.method16994().length() * 1.0499999523162842);
                }
            }
        }
    }
    
    @EventListener
    private void method10144(final Class5723 class5723) {
        if (this.isEnabled()) {
            if (TestSpeedSpeed.mc.player != null) {
                if (class5723.method16998() instanceof Class4273) {
                    if (((Class4273)class5723.method16998()).method12822() != TestSpeedSpeed.mc.player.getEntityId()) {}
                }
            }
        }
    }
}
