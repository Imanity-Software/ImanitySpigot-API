package spg.lgdev.knockback.impl;

import net.minecraft.server.v1_8_R3.Entity;
import net.minecraft.server.v1_8_R3.EntityArrow;
import net.minecraft.server.v1_8_R3.EntityFishingHook;
import net.minecraft.server.v1_8_R3.EntityPlayer;
import spg.lgdev.knockback.Knockback;

public abstract class AbstractKnockback implements Knockback<EntityPlayer, Entity, EntityFishingHook, EntityArrow> {

    public static double invSqrt(double x) {
        double xhalf = 0.5D * x;
        long i = Double.doubleToLongBits(x);
        i = 6910470738111508698L - (i >> 1);
        x = Double.longBitsToDouble(i);
        x *= (1.5D - xhalf * x * x);
        x *= (1.5D - xhalf * x * x);
        return x;
    }
}
